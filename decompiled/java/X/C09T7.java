package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.services.audio.ITTSCallback;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.09T7, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09T7 implements InterfaceC2374509Sd {
    public static final C09T7 LIZ = new C09T7();
    public static final String LIZIZ;
    public static final C09TR LIZJ;
    public static int LIZLLL;
    public static boolean LJ;
    public static boolean LJFF;
    public static C09TF LJI;
    public static final LinkedList<C09TH> LJII;
    public static final C09TI LJIIIIZZ;
    public static ITTSCallback LJIIIZ;
    public static final ExecutorService LJIIJ;
    public static final C01GW LJIIJJI;
    public static final C01GW LJIIL;
    public static boolean LJIILIIL;
    public static final C09TB LJIILJJIL;

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTS_IN_TT_");
        sbLIZ.append("TTSStreamManager ");
        LIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        LIZJ = new C09TR();
        LIZLLL = 5423;
        LJII = new LinkedList<>();
        LJIIIIZZ = new C09TI(0);
        LJIIJ = C04TS.LIZ() ? new ExecutorServiceC822430WOb(C823050WQl.LIZLLL(), 1) : C786410Ut5.h4();
        LJIIJJI = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1364));
        LJIIL = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1365));
        LJIILJJIL = C09TB.LIZ;
    }

    public static final InterfaceC497601wk LIZIZ() {
        return (InterfaceC497601wk) LJIIJJI.getValue();
    }

    public static String LIZJ() {
        C09TI c09ti = LJIIIIZZ;
        return (!(c09ti.LIZ.isEmpty() ^ true) || c09ti.LIZ.size() < 1) ? "empty" : (String) ListProtector.get(c09ti.LIZ, 0);
    }

    public static void LJ() {
        C201955140j.LIZLLL(C11YP.LIZIZ, LIZIZ, "reset");
        LJII.clear();
        LJ = false;
        LIZLLL = 5423;
        LJIIIIZZ.LIZ.clear();
    }

    public final void LIZLLL() {
        C201955140j.LIZLLL(C11YP.LIZIZ, LIZIZ, "next ");
        C23250099c.LIZLLL(LIZIZ(), null, null, new C09T5(null), 3);
    }

    @Override // X.InterfaceC2374509Sd
    public final Object LIZ(String str, String str2, String str3, String str4, boolean z, boolean z2, ITTSCallback iTTSCallback, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        LJ = false;
        C201955140j.LIZLLL(C11YP.LIZIZ, LIZIZ, "startReading called by outside.");
        C23250099c.LIZLLL(LIZIZ(), null, null, new C09T6(str3, str2, 1.0f, 24000, z2, null), 3);
        LJIIIZ = iTTSCallback;
        C23250099c.LIZLLL(LIZIZ(), null, null, new C2376709Sz(300L, str2, str3, str2, null), 3);
        return Unit.LIZ;
    }
}
