package X;

import Y.ARunnableS53S0300000_20;
import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0j4t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1267090j4t {
    public final C1266470j3t LIZ = new C1266470j3t();
    public final C1266550j41 LIZIZ = new C1266550j41();
    public final C1266450j3r LIZJ = new C1266450j3r();
    public final C1267180j52 LIZLLL = new C1267180j52();
    public final C1266380j3k LJ = new C1266380j3k();
    public C1267130j4x LJFF = new C1267130j4x();
    public C1267100j4u LJI = new C1267100j4u();
    public final C1267110j4v LJII = new C1267110j4v();
    public final C1267210j55 LJIIIIZZ = new C1267210j55();
    public final C1266540j40 LJIIIZ = new C1266540j40();
    public final C1267220j56 LJIIJ = new C1267220j56();
    public final C1267160j50 LJIIJJI = new C1267160j50();
    public final C1267230j57 LJIIL = new C1267230j57();
    public final C1267200j54 LJIILIIL = new C1267200j54();
    public final C1267170j51 LJIILJJIL = new C1267170j51();
    public final C1267120j4w LJIILL = new C1267120j4w();
    public final C1267190j53 LJIILLIIL = new C1267190j53();
    public Handler LJIIZILJ;
    public C1267270j5B LJIJ;

    public final void LIZIZ(C1266450j3r c1266450j3r) {
        LIZ(this.LIZJ, c1266450j3r);
    }

    public final void LIZ(InterfaceC1267260j5A interfaceC1267260j5A, InterfaceC1267260j5A interfaceC1267260j5A2) {
        List<String> listLIZ;
        C1267270j5B c1267270j5B;
        Handler handler;
        if (!(interfaceC1267260j5A instanceof C1267190j53) && !(interfaceC1267260j5A instanceof C1267120j4w) && (handler = this.LJIIZILJ) != null && handler.getLooper().getThread() != C786410Ut5.u3()) {
            C786410Ut5.LJJZZIII(this.LJIIZILJ, new ARunnableS53S0300000_20(interfaceC1267260j5A, interfaceC1267260j5A2, this, 38));
            return;
        }
        if (interfaceC1267260j5A != null && interfaceC1267260j5A2 != null) {
            if (interfaceC1267260j5A instanceof InterfaceC1267250j59) {
                listLIZ = ((InterfaceC1267250j59) interfaceC1267260j5A).LIZ(interfaceC1267260j5A2);
            } else {
                listLIZ = null;
            }
            EnumC1268000j6M enumC1268000j6MLIZIZ = interfaceC1267260j5A.LIZIZ(interfaceC1267260j5A2);
            interfaceC1267260j5A.LIZJ(interfaceC1267260j5A2);
            if (enumC1268000j6MLIZIZ != null && (c1267270j5B = this.LJIJ) != null) {
                c1267270j5B.LIZ.LIZIZ("scene_changed");
                C1268090j6V c1268090j6V = c1267270j5B.LIZ.LIZJ;
                ((HashMap) c1268090j6V.LIZIZ).remove("resolution_strategy");
                ((HashMap) c1268090j6V.LIZIZ).remove("subscribeRemoteStream");
            }
            if (this.LJIJ != null && listLIZ != null && listLIZ.size() > 0) {
                Iterator<String> it2 = listLIZ.iterator();
                while (it2.hasNext()) {
                    this.LJIJ.LIZ.LIZIZ(it2.next());
                }
            }
        }
    }
}
