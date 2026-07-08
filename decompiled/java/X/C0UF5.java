package X;

import com.bytedance.android.livesdk.model.LiveBroadcastBlackScreenModel;
import webcast.data.AnchorReminderWordStatus;
import webcast.data.AutoShareLiveCardToBulletinBoard;

/* JADX INFO: renamed from: X.0UF5, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UF5 {
    public static C0U8H LIZ;
    public static C0UD5 LIZIZ;
    public static C0UF6 LIZJ;
    public static C772290URf LIZLLL;
    public static AnchorReminderWordStatus LJ;
    public static AutoShareLiveCardToBulletinBoard LJFF;
    public static int LJI;
    public static volatile long LJII;
    public static C758130ToZ LJIIIIZZ;
    public static C0UCT LJIIIZ;
    public static C0U77 LJIIJ;

    public static C0U8H LIZIZ() {
        if (LIZ == null) {
            LIZ = new C0U8H();
        }
        return LIZ;
    }

    public static C0UF6 LIZJ() {
        if (LIZJ == null) {
            LIZJ = new C0UF6();
        }
        return LIZJ;
    }

    public static C0UCT LIZLLL() {
        if (LJIIIZ == null) {
            LJIIIZ = new C0UCT();
        }
        return LJIIIZ;
    }

    public static C758130ToZ LJ() {
        if (LJIIIIZZ == null) {
            LJIIIIZZ = new C758130ToZ();
        }
        return LJIIIIZZ;
    }

    public static C0UD5 LJFF() {
        if (LIZIZ == null) {
            LIZIZ = new C0UD5();
        }
        return LIZIZ;
    }

    public static C772290URf LJI() {
        if (LIZLLL == null) {
            LIZLLL = new C772290URf();
        }
        return LIZLLL;
    }

    public static C0U77 LIZ() {
        return LJIIJ;
    }

    public static void LJIIIIZZ(long j) {
        if (j == 0) {
            LJII = 0L;
            return;
        }
        if (LJII != 0) {
            long j2 = j - LJII;
            C20337914i1<LiveBroadcastBlackScreenModel> c20337914i1 = InterfaceC772190UQv.j3;
            while (c20337914i1.LIZIZ().blackScreenDurations.size() >= 5) {
                c20337914i1.LIZIZ().blackScreenDurations.removeFirst();
            }
            c20337914i1.LIZIZ().blackScreenDurations.addLast(Long.valueOf(j2));
            c20337914i1.LIZJ();
        }
        LJII = j;
    }

    public static void LJII(boolean z, boolean z2) {
        LIZJ = null;
        LJIIIIZZ(0L);
        if (!z2) {
            LJI = 0;
            LJFF = null;
            LIZLLL = null;
        }
        LJI = 0;
        if (!z) {
            LJIIIIZZ = null;
            LIZ = null;
        }
        LIZIZ = null;
    }
}
