package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pdE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1519020pdE {
    public static Boolean LIZLLL;
    public static boolean LJ;
    public static final C1519020pdE LIZ = new C1519020pdE();
    public static int LIZIZ = -1;
    public static int LIZJ = -1;
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(152));

    public static void LIZ() {
        if (LIZJ < 0 || LIZLLL == null) {
            C01GW c01gw = LJFF;
            LIZLLL = Boolean.valueOf(((InterfaceC1519050pdH) c01gw.getValue()).getBoolean("is_background"));
            LIZJ = ((InterfaceC1519050pdH) c01gw.getValue()).getInt("node");
            ((InterfaceC1519050pdH) c01gw.getValue()).clear();
        }
    }

    public final void LIZJ() {
        if (LJ) {
            return;
        }
        synchronized (this) {
            try {
                if (!LJ) {
                    LJ = true;
                    LIZ.getClass();
                    LIZ();
                    if (LIZJ > 0) {
                        InterfaceC1519030pdF interfaceC1519030pdFLIZJ = C100C.LIZ.LIZJ();
                        Pair[] pairArr = new Pair[2];
                        pairArr[0] = new Pair("node", String.valueOf(LIZJ));
                        pairArr[1] = new Pair("is_background", Intrinsics.LJFF(LIZLLL, Boolean.TRUE) ? "1" : CardStruct.IStatusCode.DEFAULT);
                        interfaceC1519030pdFLIZJ.LIZ("geoblock_popup_interruption", C2097608Jq.LJIIIIZZ(pairArr));
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZIZ(int i) {
        synchronized (this) {
            try {
                if (LIZIZ < i) {
                    LIZIZ = i;
                    LIZ.getClass();
                    LIZ();
                    ((InterfaceC1519050pdH) LJFF.getValue()).putInt("node", i);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
