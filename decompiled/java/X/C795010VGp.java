package X;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0VGp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C795010VGp implements C0VGX, InterfaceC795090VGx, InterfaceC795070VGv {
    public final Context LL;
    public final int LLILLJJLI;
    public final String LLILLL;
    public final C795000VGo LLILZ;
    public final C0VGY LLILZIL;
    public PowerManager.WakeLock LLIZLLLIL;
    public boolean LLJ = false;
    public int LLIZ = 0;
    public final Object LLILZLL = new Object();

    static {
        C0VI8.LIZIZ("DelayMetCommandHandler");
    }

    public final void LIZIZ() {
        synchronized (this.LLILZLL) {
            try {
                this.LLILZIL.LIZLLL();
                this.LLILZ.LLILLL.LIZIZ(this.LLILLL);
                PowerManager.WakeLock wakeLock = this.LLIZLLLIL;
                if (wakeLock != null && wakeLock.isHeld()) {
                    C0VI8 c0vi8LIZ = C0VI8.LIZ();
                    C786410Ut5.j4("Releasing wakelock %s for WorkSpec %s", new Object[]{this.LLIZLLLIL, this.LLILLL});
                    c0vi8LIZ.getClass();
                    this.LLIZLLLIL.release();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJFF() {
        this.LLIZLLLIL = C789740UyS.LIZ(this.LL, C786410Ut5.j4("%s (%s)", new Object[]{this.LLILLL, Integer.valueOf(this.LLILLJJLI)}));
        C0VI8 c0vi8LIZ = C0VI8.LIZ();
        C786410Ut5.j4("Acquiring wakelock %s for WorkSpec %s", new Object[]{this.LLIZLLLIL, this.LLILLL});
        c0vi8LIZ.getClass();
        this.LLIZLLLIL.acquire();
        C0VIG c0vigLJIIIIZZ = ((C0VIH) this.LLILZ.LLILZIL.LIZJ.LJIIIIZZ()).LJIIIIZZ(this.LLILLL);
        if (c0vigLJIIIIZZ == null) {
            LJI();
            return;
        }
        boolean zLIZIZ = c0vigLJIIIIZZ.LIZIZ();
        this.LLJ = zLIZIZ;
        if (zLIZIZ) {
            this.LLILZIL.LIZJ(Collections.singletonList(c0vigLJIIIIZZ));
            return;
        }
        C0VI8 c0vi8LIZ2 = C0VI8.LIZ();
        C786410Ut5.j4("No constraints for %s", new Object[]{this.LLILLL});
        c0vi8LIZ2.getClass();
        LJ(Collections.singletonList(this.LLILLL));
    }

    public final void LJI() {
        synchronized (this.LLILZLL) {
            try {
                if (this.LLIZ < 2) {
                    this.LLIZ = 2;
                    C0VI8 c0vi8LIZ = C0VI8.LIZ();
                    C786410Ut5.j4("Stopping work for WorkSpec %s", new Object[]{this.LLILLL});
                    c0vi8LIZ.getClass();
                    Context context = this.LL;
                    String str = this.LLILLL;
                    Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
                    intent.setAction("ACTION_STOP_WORK");
                    intent.putExtra("KEY_WORKSPEC_ID", str);
                    C795000VGo c795000VGo = this.LLILZ;
                    c795000VGo.LJFF(new RunnableC794990VGn(this.LLILLJJLI, intent, c795000VGo));
                    if (this.LLILZ.LLILZ.LJ(this.LLILLL)) {
                        C0VI8 c0vi8LIZ2 = C0VI8.LIZ();
                        C786410Ut5.j4("WorkSpec %s needs to be rescheduled", new Object[]{this.LLILLL});
                        c0vi8LIZ2.getClass();
                        Context context2 = this.LL;
                        String str2 = this.LLILLL;
                        Intent intent2 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                        intent2.setAction("ACTION_SCHEDULE_WORK");
                        intent2.putExtra("KEY_WORKSPEC_ID", str2);
                        C795000VGo c795000VGo2 = this.LLILZ;
                        c795000VGo2.LJFF(new RunnableC794990VGn(this.LLILLJJLI, intent2, c795000VGo2));
                    } else {
                        C0VI8 c0vi8LIZ3 = C0VI8.LIZ();
                        C786410Ut5.j4("Processor does not have WorkSpec %s. No need to reschedule ", new Object[]{this.LLILLL});
                        c0vi8LIZ3.getClass();
                    }
                } else {
                    C0VI8 c0vi8LIZ4 = C0VI8.LIZ();
                    C786410Ut5.j4("Already stopped work for %s", new Object[]{this.LLILLL});
                    c0vi8LIZ4.getClass();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC795070VGv
    public final void LIZ(String str) {
        C0VI8 c0vi8LIZ = C0VI8.LIZ();
        C786410Ut5.j4("Exceeded time limits on execution for %s", new Object[]{str});
        c0vi8LIZ.getClass();
        LJI();
    }

    @Override // X.C0VGX
    public final void LIZJ(List<String> list) {
        LJI();
    }

    @Override // X.C0VGX
    public final void LJ(List<String> list) {
        if (!list.contains(this.LLILLL)) {
            return;
        }
        synchronized (this.LLILZLL) {
            try {
                if (this.LLIZ == 0) {
                    this.LLIZ = 1;
                    C0VI8 c0vi8LIZ = C0VI8.LIZ();
                    C786410Ut5.j4("onAllConstraintsMet for %s", new Object[]{this.LLILLL});
                    c0vi8LIZ.getClass();
                    if (this.LLILZ.LLILZ.LJII(this.LLILLL, null)) {
                        this.LLILZ.LLILLL.LIZ(this.LLILLL, this);
                    } else {
                        LIZIZ();
                    }
                } else {
                    C0VI8 c0vi8LIZ2 = C0VI8.LIZ();
                    C786410Ut5.j4("Already started work for %s", new Object[]{this.LLILLL});
                    c0vi8LIZ2.getClass();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC795090VGx
    public final void LIZLLL(String str, boolean z) {
        C0VI8 c0vi8LIZ = C0VI8.LIZ();
        C786410Ut5.j4("onExecuted %s, %s", new Object[]{str, Boolean.valueOf(z)});
        c0vi8LIZ.getClass();
        LIZIZ();
        if (z) {
            Context context = this.LL;
            String str2 = this.LLILLL;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            intent.putExtra("KEY_WORKSPEC_ID", str2);
            C795000VGo c795000VGo = this.LLILZ;
            c795000VGo.LJFF(new RunnableC794990VGn(this.LLILLJJLI, intent, c795000VGo));
        }
        if (this.LLJ) {
            Intent intent2 = new Intent(this.LL, (Class<?>) SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            C795000VGo c795000VGo2 = this.LLILZ;
            c795000VGo2.LJFF(new RunnableC794990VGn(this.LLILLJJLI, intent2, c795000VGo2));
        }
    }

    public C795010VGp(Context context, int i, String str, C795000VGo c795000VGo) {
        this.LL = context;
        this.LLILLJJLI = i;
        this.LLILZ = c795000VGo;
        this.LLILLL = str;
        this.LLILZIL = new C0VGY(context, c795000VGo.LLILLJJLI, this);
    }
}
