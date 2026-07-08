package androidx.work.impl.background.systemjob;

import X.C0VHE;
import X.C0VI1;
import X.C0VI8;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C2409809cO;
import X.C786410Ut5;
import X.C788530UwV;
import X.C817700W5w;
import X.InterfaceC795090VGx;
import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public class SystemJobService extends JobService implements InterfaceC795090VGx {
    public C0VI1 LL;
    public final Map<String, JobParameters> LLILLJJLI = new HashMap();

    static {
        C0VI8.LIZIZ("SystemJobService");
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            Context applicationContext = getApplicationContext();
            if (C2409809cO.LIZIZ && applicationContext == null) {
                applicationContext = C2409809cO.LIZ;
            }
            C0VI1 c0vi1LJII = C0VI1.LJII(applicationContext);
            this.LL = c0vi1LJII;
            c0vi1LJII.LJFF.LIZ(this);
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            C0VI8.LIZ().getClass();
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        C0VI1 c0vi1 = this.LL;
        if (c0vi1 != null) {
            c0vi1.LJFF.LJFF(this);
        }
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (NxRewordManager.LJIILIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("attachBaseContextWrapper: ");
            sbLIZ.append(Log.getStackTraceString(new Throwable(context.toString())));
            C2188811AlT.LIZIZ(sbLIZ);
            context = new C817700W5w(context, false);
        }
        if (!C2214201BlK.LJIIJJI && C788530UwV.LIZ("serviceAttachBaseContext")) {
            C2188191AkT.LIZJ();
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string;
        PersistableBundle extras;
        if (this.LL == null) {
            C0VI8.LIZ().getClass();
            jobFinished(jobParameters, true);
            return false;
        }
        C0VHE c0vhe = null;
        try {
            extras = jobParameters.getExtras();
        } catch (NullPointerException th) {
        }
        if (extras != null && extras.containsKey("EXTRA_WORK_SPEC_ID")) {
            string = extras.getString("EXTRA_WORK_SPEC_ID");
        } else {
            string = null;
        }
        if (TextUtils.isEmpty(string)) {
            C0VI8.LIZ().getClass();
            return false;
        }
        synchronized (this.LLILLJJLI) {
            try {
                if (((HashMap) this.LLILLJJLI).containsKey(string)) {
                    C0VI8 c0vi8LIZ = C0VI8.LIZ();
                    C786410Ut5.j4("Job is already being executed by SystemJobService: %s", new Object[]{string});
                    c0vi8LIZ.getClass();
                    return false;
                }
                C0VI8 c0vi8LIZ2 = C0VI8.LIZ();
                C786410Ut5.j4("onStartJob for %s", new Object[]{string});
                c0vi8LIZ2.getClass();
                ((HashMap) this.LLILLJJLI).put(string, jobParameters);
                int i = Build.VERSION.SDK_INT;
                if (i >= 24) {
                    c0vhe = new C0VHE();
                    if (jobParameters.getTriggeredContentUris() != null) {
                        c0vhe.LIZIZ = Arrays.asList(jobParameters.getTriggeredContentUris());
                    }
                    if (jobParameters.getTriggeredContentAuthorities() != null) {
                        c0vhe.LIZ = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
                    }
                    if (i >= 28) {
                        jobParameters.getNetwork();
                    }
                }
                this.LL.LJIIJJI(string, c0vhe);
                return true;
            } finally {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        String string;
        PersistableBundle extras;
        if (this.LL == null) {
            C0VI8.LIZ().getClass();
            return true;
        }
        try {
            extras = jobParameters.getExtras();
        } catch (NullPointerException th) {
        }
        if (extras != null && extras.containsKey("EXTRA_WORK_SPEC_ID")) {
            string = extras.getString("EXTRA_WORK_SPEC_ID");
        } else {
            string = null;
        }
        if (TextUtils.isEmpty(string)) {
            C0VI8.LIZ().getClass();
            return false;
        }
        C0VI8 c0vi8LIZ = C0VI8.LIZ();
        C786410Ut5.j4("onStopJob for %s", new Object[]{string});
        c0vi8LIZ.getClass();
        synchronized (this.LLILLJJLI) {
            try {
                ((HashMap) this.LLILLJJLI).remove(string);
            } finally {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        this.LL.LJIIL(string);
        return !this.LL.LJFF.LIZJ(string);
    }

    @Override // X.InterfaceC795090VGx
    public final void LIZLLL(String str, boolean z) {
        JobParameters jobParameters;
        C0VI8 c0vi8LIZ = C0VI8.LIZ();
        C786410Ut5.j4("%s executed on JobScheduler", new Object[]{str});
        c0vi8LIZ.getClass();
        synchronized (this.LLILLJJLI) {
            try {
                jobParameters = (JobParameters) ((HashMap) this.LLILLJJLI).remove(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }
}
