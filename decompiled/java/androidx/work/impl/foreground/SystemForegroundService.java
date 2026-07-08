package androidx.work.impl.foreground;

import X.C0VG9;
import X.C0VHQ;
import X.C0VI1;
import X.C0VI8;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C2409809cO;
import X.C786410Ut5;
import X.C788530UwV;
import X.C794950VGj;
import X.C817700W5w;
import X.InterfaceC794960VGk;
import Y.ARunnableS18S1200000_13;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.LifecycleService;
import androidx.work.impl.WorkDatabase;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import java.util.UUID;

/* JADX INFO: loaded from: classes14.dex */
public class SystemForegroundService extends LifecycleService implements InterfaceC794960VGk {
    public Handler LL;
    public boolean LLILLJJLI;
    public C794950VGj LLILLL;
    public NotificationManager LLILZ;

    static {
        C0VI8.LIZIZ("SystemFgService");
    }

    public final void LIZ() {
        this.LL = new Handler(Looper.getMainLooper());
        Context applicationContext = getApplicationContext();
        if (C2409809cO.LIZIZ && applicationContext == null) {
            applicationContext = C2409809cO.LIZ;
        }
        this.LLILZ = (NotificationManager) C786410Ut5.H2(applicationContext, "notification");
        Context applicationContext2 = getApplicationContext();
        if (C2409809cO.LIZIZ && applicationContext2 == null) {
            applicationContext2 = C2409809cO.LIZ;
        }
        C794950VGj c794950VGj = new C794950VGj(applicationContext2);
        this.LLILLL = c794950VGj;
        if (c794950VGj.LLJ != null) {
            C0VI8.LIZ().getClass();
        } else {
            c794950VGj.LLJ = this;
        }
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        LIZ();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        C794950VGj c794950VGj = this.LLILLL;
        c794950VGj.LLJ = null;
        synchronized (c794950VGj.LLILLL) {
            try {
                c794950VGj.LLIZLLLIL.LIZLLL();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        c794950VGj.LL.LJFF.LJFF(c794950VGj);
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service, android.content.ContextWrapper
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

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        String stringExtra = null;
        if (this.LLILLJJLI) {
            C0VI8.LIZ().getClass();
            C794950VGj c794950VGj = this.LLILLL;
            c794950VGj.LLJ = null;
            synchronized (c794950VGj.LLILLL) {
                try {
                    c794950VGj.LLIZLLLIL.LIZLLL();
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            c794950VGj.LL.LJFF.LJFF(c794950VGj);
            LIZ();
            this.LLILLJJLI = false;
        }
        if (intent != null) {
            C794950VGj c794950VGj2 = this.LLILLL;
            c794950VGj2.getClass();
            String action = intent.getAction();
            if ("ACTION_START_FOREGROUND".equals(action)) {
                C0VI8 c0vi8LIZ = C0VI8.LIZ();
                C786410Ut5.j4("Started foreground service %s", new Object[]{intent});
                c0vi8LIZ.getClass();
                try {
                    stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
                } catch (Exception th) {
                }
                ((C0VG9) c794950VGj2.LLILLJJLI).LIZ(new ARunnableS18S1200000_13(c794950VGj2.LL.LIZJ, c794950VGj2, stringExtra, 10));
                c794950VGj2.LJFF(intent);
                return 3;
            }
            if ("ACTION_NOTIFY".equals(action)) {
                c794950VGj2.LJFF(intent);
                return 3;
            }
            if ("ACTION_CANCEL_WORK".equals(action)) {
                C0VI8 c0vi8LIZ2 = C0VI8.LIZ();
                C786410Ut5.j4("Stopping foreground work for %s", new Object[]{intent});
                c0vi8LIZ2.getClass();
                try {
                    String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
                    if (stringExtra2 != null && !TextUtils.isEmpty(stringExtra2)) {
                        final C0VI1 c0vi1 = c794950VGj2.LL;
                        final UUID uuidFromString = UUID.fromString(stringExtra2);
                        c0vi1.getClass();
                        ((C0VG9) c0vi1.LIZLLL).LIZ(new C0VHQ() { // from class: X.0VHS
                            @Override // X.C0VHQ
                            public final void LIZIZ() {
                                WorkDatabase workDatabase = c0vi1.LIZJ;
                                workDatabase.beginTransaction();
                                try {
                                    C0VHQ.LIZ(c0vi1, uuidFromString.toString());
                                    workDatabase.setTransactionSuccessful();
                                    workDatabase.endTransaction();
                                    C0VI1 c0vi12 = c0vi1;
                                    C0VHR.LIZ(c0vi12.LIZIZ, c0vi12.LIZJ, c0vi12.LJ);
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                    workDatabase.endTransaction();
                                    throw th2;
                                }
                            }
                        });
                        return 3;
                    }
                    return 3;
                } catch (Exception th2) {
                    return 3;
                }
            }
            if ("ACTION_STOP_FOREGROUND".equals(action)) {
                C0VI8.LIZ().getClass();
                InterfaceC794960VGk interfaceC794960VGk = c794950VGj2.LLJ;
                if (interfaceC794960VGk != null) {
                    SystemForegroundService systemForegroundService = (SystemForegroundService) interfaceC794960VGk;
                    systemForegroundService.LLILLJJLI = true;
                    C0VI8.LIZ().getClass();
                    if (Build.VERSION.SDK_INT >= 26) {
                        systemForegroundService.stopForeground(true);
                    }
                    systemForegroundService.stopSelf();
                    return 3;
                }
                return 3;
            }
            return 3;
        }
        return 3;
    }
}
