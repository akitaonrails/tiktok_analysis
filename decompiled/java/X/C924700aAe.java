package X;

import android.os.SystemClock;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.record.PlayRecordManager;

/* JADX INFO: renamed from: X.0aAe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C924700aAe {
    public static long LIZ;
    public static String LIZIZ = "";
    public static String LIZJ = "";
    public static String LIZLLL = "";
    public static volatile long LJ;
    public static volatile long LJFF;
    public static volatile long LJI;
    public static long LJII;
    public static volatile long LJIIIIZZ;
    public static long LJIIIZ;
    public static volatile long LJIIJ;

    public static final void LIZLLL() {
        LIZ = SystemClock.uptimeMillis();
        PlayRecordManager.LIZLLL.getClass();
        InterfaceC924740aAi interfaceC924740aAiLIZ = C920350a3d.LIZ();
        if (interfaceC924740aAiLIZ != null) {
            interfaceC924740aAiLIZ.LIZJ();
        }
        LJI = LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("resetStartTimeWhenPause link start:");
        sbLIZ.append(LIZ);
        C20441214yg.LIZIZ("link_watch_duration", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LIZ(boolean z) {
        if (z) {
            if (LJII > 0) {
                LJIIIIZZ += SystemClock.uptimeMillis() - LJII;
                LJII = 0L;
                return;
            } else {
                C939210aY3.LIZ("[LinkInRoomGuest#170] you are dup mute Audio", "Duration");
                return;
            }
        }
        if (LJII <= 0) {
            LJII = SystemClock.uptimeMillis();
        } else {
            C939210aY3.LIZ("[LinkInRoomGuest#170] you are dup open Audio", "Duration");
        }
    }

    public static void LIZJ(boolean z) {
        if (z) {
            if (LJIIIZ > 0) {
                LJIIJ += SystemClock.uptimeMillis() - LJIIIZ;
                LJIIIZ = 0L;
                return;
            } else {
                C939210aY3.LIZ("[LinkInRoomGuest#170] you are dup mute Video", "Duration");
                return;
            }
        }
        if (LJIIIZ <= 0) {
            LJIIIZ = SystemClock.uptimeMillis();
        } else {
            C939210aY3.LIZ("[LinkInRoomGuest#176] you are dup open Video", "Duration");
        }
    }

    public static final void LIZIZ(long j, String str, String str2) {
        LIZ = SystemClock.uptimeMillis();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStart link start:");
        sbLIZ.append(LIZ);
        sbLIZ.append(", from:");
        sbLIZ.append(str2);
        sbLIZ.append("-onStart");
        C20441214yg.LIZIZ("link_watch_duration", C2188811AlT.LIZIZ(sbLIZ));
        LIZJ = str;
        LIZLLL = String.valueOf(j);
        PlayRecordManager.LIZLLL.getClass();
        InterfaceC924740aAi interfaceC924740aAiLIZ = C920350a3d.LIZ();
        if (interfaceC924740aAiLIZ != null) {
            interfaceC924740aAiLIZ.LIZJ();
        }
        LJI = LIZ;
    }
}
