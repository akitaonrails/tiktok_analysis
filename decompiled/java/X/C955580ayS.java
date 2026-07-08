package X;

import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ayS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C955580ayS {
    public static long LIZ;
    public static long LIZIZ;
    public static long LIZJ;
    public static boolean LIZLLL;
    public static long LJ;
    public static String LJFF;
    public static String LJI;
    public static String LJII;
    public static String LJIIIIZZ;
    public static String LJIIIZ;
    public static String LJIIJ;
    public static String LJIIJJI;
    public static String LJIIL;
    public static List<Long> LJIILIIL;
    public static long LJIILJJIL;
    public static boolean LJIILL;
    public static long LJIILLIIL;
    public static long LJIIZILJ;

    static {
        new HashMap();
        LJFF = "";
        LJI = "";
        LJII = "";
        LJIIIIZZ = "";
        LJIIIZ = "";
        LJIIJ = "";
        LJIIJJI = "";
        LJIIL = "";
    }

    public static boolean LIZ(C955590ayT c955590ayT) {
        RivalExtraInfo rivalExtraInfo;
        if (!Intrinsics.LJFF(InterfaceC934710aQn.Zb.LIZIZ(), Boolean.TRUE)) {
            C20337914i1<Integer> c20337914i1 = InterfaceC934710aQn.ac;
            if (c20337914i1.LIZIZ().intValue() <= 3 && (rivalExtraInfo = c955590ayT.LJIIJ) != null && rivalExtraInfo.showPlayType == 2 && !c955590ayT.LIZ()) {
                C931800aM6.LIZ.getClass();
                if (C931800aM6.LIZIZ() && c955590ayT.LJ()) {
                    C20441214yg.LJIIIZ("ReservationDataHolder", "checkReservationEducation, isTargetRoomInvitingByMe=true");
                    return false;
                }
                long j = LJIIZILJ;
                if (j > 0 && j != c955590ayT.LJ.getOwnerUserId()) {
                    return false;
                }
                if (LJIIZILJ == 0) {
                    c20337914i1.LJFF(Integer.valueOf(c20337914i1.LIZIZ().intValue() + 1));
                }
                LJIIZILJ = c955590ayT.LJ.getOwnerUserId();
                c955590ayT.LJIIZILJ = true;
                return true;
            }
        }
        return false;
    }
}
