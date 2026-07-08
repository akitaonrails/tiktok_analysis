package X;

import Y.ARunnableS131S0100000_31;
import Y.ARunnableS35S1100000_31;
import Y.ARunnableS42S0101000_31;
import Y.ARunnableS7S1110000_31;
import com.bytedance.keva.Keva;
import java.util.Stack;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14hv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20337314hv implements InterfaceC1439500nYy {
    public final String LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C863380Xtw(this));
    public final String LIZJ;
    public final ExecutorService LIZLLL;
    public final Stack<String> LJ;
    public final AtomicInteger LJFF;

    @Override // X.InterfaceC1439500nYy
    public final void LIZJ() {
        this.LIZLLL.submit(new ARunnableS131S0100000_31(this, 197));
    }

    @Override // X.InterfaceC1439500nYy
    public final void LIZLLL() {
        this.LIZLLL.submit(new Runnable() { // from class: X.14hw
            public final void LIZ() {
                boolean z = this.LL.LJIIIIZZ().getBoolean("exit_monitor_key_in_pipeline", false);
                int i = this.LL.LJIIIIZZ().getInt("exit_monitor_key_publish_task", 0);
                if (z || i > 0) {
                    C0LAB c0lab = new C0LAB();
                    c0lab.LJ("last_status", this.LL.LIZIZ());
                    c0lab.LIZ(i, "pending_task_cnt");
                    c0lab.LJ("shoot_page", this.LL.LIZJ);
                    C20684815ws.LJIILLIIL("app_exit_from_camera", c0lab.LIZ);
                }
                if (Intrinsics.LJFF(this.LL.LIZIZ(), "after_click_publish") || Intrinsics.LJFF(this.LL.LIZ, "story")) {
                    this.LL.LJIIIIZZ().storeBoolean("exit_monitor_key_in_pipeline", false);
                    this.LL.LJIIIIZZ().storeInt("exit_monitor_key_publish_task", 0);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AbnormalExitMonitor@8384.logAndRest$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("AbnormalExitMonitor@8384.logAndRest$1");
            }
        });
    }

    @Override // X.InterfaceC1439500nYy
    public final void LJII() {
        this.LIZLLL.submit(new Runnable() { // from class: X.14gO
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AbnormalExitMonitor@8384.stopPipeline$1");
                try {
                    this.LL.LJIIIIZZ().storeBoolean("exit_monitor_key_in_pipeline", false);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("AbnormalExitMonitor@8384.stopPipeline$1");
            }
        });
    }

    public final Keva LJIIIIZZ() {
        return (Keva) this.LIZIZ.getValue();
    }

    @Override // X.InterfaceC1439500nYy
    public final String LIZIZ() {
        return LJIIIIZZ().getString("exit_monitor_key_last_page", "");
    }

    public C20337314hv(String str) {
        String str2;
        this.LIZ = str;
        if (Intrinsics.LJFF(str, "normal")) {
            str2 = "video_shoot_page";
        } else if (Intrinsics.LJFF(str, "story")) {
            str2 = "story_shoot_page";
        } else {
            str2 = "";
        }
        this.LIZJ = str2;
        this.LIZLLL = C823050WQl.LJFF();
        this.LJ = new Stack<>();
        this.LJFF = new AtomicInteger(0);
    }

    @Override // X.InterfaceC1439500nYy
    public final void LIZ(int i) {
        this.LIZLLL.submit(new ARunnableS42S0101000_31(i, this, 16));
    }

    @Override // X.InterfaceC1439500nYy
    public final void LJ(int i) {
        this.LIZLLL.submit(new ARunnableS42S0101000_31(i, this, 15));
    }

    @Override // X.InterfaceC1439500nYy
    public final void LJFF(String str) {
        this.LIZLLL.submit(new ARunnableS35S1100000_31(this, str, 9));
    }

    @Override // X.InterfaceC1439500nYy
    public final void LJI(String str, boolean z) {
        this.LIZLLL.submit(new ARunnableS7S1110000_31(this, z, str, 1));
    }
}
