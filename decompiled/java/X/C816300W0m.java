package X;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.PersistableBundle;
import android.util.Base64;
import com.bytedance.keva.Keva;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.ss.android.ugc.aweme.lancet.jobscheduler.SubJobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.zip.Adler32;

/* JADX INFO: renamed from: X.0W0m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C816300W0m {
    public static final CopyOnWriteArraySet<String> LIZ = new CopyOnWriteArraySet<>();
    public static final Keva LIZIZ = Keva.getRepo("job_info_scheduler_lancet");

    public static final int LIZIZ(Context context, AbstractC818550W9d abstractC818550W9d) {
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(abstractC818550W9d.LIZIZ().getBytes(Charset.forName("UTF-8")));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt(C816330W0p.LIZ(abstractC818550W9d.LIZLLL()));
        adler32.update(byteBufferAllocate.array());
        if (abstractC818550W9d.LIZJ() != null) {
            adler32.update(abstractC818550W9d.LIZJ());
        }
        return (int) adler32.getValue();
    }

    public static final boolean LIZJ(JobScheduler jobScheduler, int i, int i2) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i3 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i) {
                if (i3 < i2) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static final void LIZLLL(Context context, String str, JobInfo jobInfo) throws Throwable {
        if (((Boolean) C818540W9c.LJ.getValue()).booleanValue()) {
            C844470XAv.LIZ.getClass();
            Intent intent = new Intent(C844470XAv.LIZ(), (Class<?>) SubJobInfoSchedulerService.class);
            intent.putExtras(new Bundle(jobInfo.getExtras()));
            C2204961BRm.LJJJJ(context, intent, new ServiceConnection() { // from class: X.09lt
                @Override // android.content.ServiceConnection
                public final void onServiceConnected(ComponentName componentName, IBinder iBinder) throws Throwable {
                    Object[] objArr;
                    C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11064, "com/ss/android/ugc/aweme/lancet/jobscheduler/CustomJobInfoScheduler$startServiceManual$1", "onServiceConnected", this, new Object[]{componentName, iBinder}, "void", new C0WZW(false, "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOapbZzLyHy37MUVFGnSRFUSxIIsNrd9jFXTA2rR5pyNMheRj3p7v4QnTQ==", null)));
                    if (c0wsuLIZIZ.LIZ || (objArr = c0wsuLIZIZ.LIZJ) == null) {
                        return;
                    }
                    Object obj = objArr[0];
                    Object obj2 = objArr[1];
                }

                @Override // android.content.ServiceConnection
                public final void onServiceDisconnected(ComponentName componentName) {
                }
            }, 1, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOapbZzLyHy37MUVFGnSRFUSxIIsNrd9jFXTA2rR5pyNMheRj3p7v4QnTQ==", null));
            return;
        }
        ((JobScheduler) C786410Ut5.H2(context, "jobscheduler")).schedule(jobInfo);
        LIZIZ.erase(str);
        LIZ.remove(str);
    }

    public static final JobInfo LIZ(AbstractC818550W9d abstractC818550W9d, int i, boolean z, Context context, AbstractC819560WDa abstractC819560WDa, int i2) {
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) C786410Ut5.H2(context, "jobscheduler");
        if (!z && LIZJ(jobScheduler, i2, i)) {
            return null;
        }
        JobInfo.Builder builder = new JobInfo.Builder(i2, componentName);
        abstractC819560WDa.LIZ(builder, abstractC818550W9d.LIZLLL(), 1000L, i);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i);
        persistableBundle.putString("backendName", abstractC818550W9d.LIZIZ());
        persistableBundle.putInt("priority", C816330W0p.LIZ(abstractC818550W9d.LIZLLL()));
        if (abstractC818550W9d.LIZJ() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(abstractC818550W9d.LIZJ(), 0));
        }
        builder.setExtras(persistableBundle);
        JobInfo jobInfoBuild = builder.build();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeParcelable(jobInfoBuild, 0);
        LIZ.add(String.valueOf(i2));
        LIZIZ.storeBytes(String.valueOf(i2), parcelObtain.marshall());
        parcelObtain.recycle();
        return jobInfoBuild;
    }
}
