package X;

import com.bytedance.android.livesdk.wallet.Diamond;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0yd1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1864850yd1 implements InterfaceC300801Eo {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC300801Eo
    public final void subscribe(InterfaceC2329309At<List<Diamond>> interfaceC2329309At) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, interfaceC2329309At);
                break;
            case 1:
                subscribe$1(this, interfaceC2329309At);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1864850yd1(Object obj, List<String> list) {
        this.$t = list;
        this.l0 = obj;
    }

    public static final void subscribe$0(C1864850yd1 c1864850yd1, InterfaceC2329309At interfaceC2329309At) {
        final C11KT c11kt = (C11KT) interfaceC2329309At;
        C1797100wrk.LIZIZ.LJ((List) c1864850yd1.l0, new InterfaceC1796910wrR() { // from class: X.0wrU
            @Override // X.InterfaceC1796910wrR
            public final InterfaceC1797050wrf LIZ() {
                return null;
            }

            @Override // X.InterfaceC1796910wrR
            public final void LIZIZ(int i, C1797200wru c1797200wru) {
            }

            @Override // X.InterfaceC1796910wrR
            public final void LIZJ(int i, C1797010wrb c1797010wrb) {
            }

            @Override // X.InterfaceC1796910wrR
            public final void LIZLLL(int i, C1797200wru c1797200wru) {
            }

            @Override // X.InterfaceC1796910wrR
            public final void LJ(int i, C1797200wru c1797200wru) {
            }

            @Override // X.InterfaceC1796910wrR
            public final void LJFF(int i, C1797200wru c1797200wru) {
            }

            @Override // X.InterfaceC1796910wrR
            public final void LJI(int i, C1797010wrb c1797010wrb) {
            }

            @Override // X.InterfaceC1796910wrR
            public final void LJIIIIZZ(int i, C1797010wrb c1797010wrb) {
            }

            @Override // X.InterfaceC1796910wrR
            public final void LJIIIZ(int i, C1797200wru c1797200wru) {
            }

            @Override // X.InterfaceC1796910wrR
            public final void LJIIJ(boolean z) {
            }

            @Override // X.InterfaceC1796910wrR
            public final void LJIIJJI(C1777440wM2 c1777440wM2) {
            }

            @Override // X.InterfaceC1796910wrR
            public final void LJIIL(int i, C1797200wru c1797200wru) {
            }

            @Override // X.InterfaceC1796910wrR
            public final void LJIILIIL(C1797010wrb c1797010wrb) {
            }

            @Override // X.InterfaceC1796910wrR
            public final void LJIILJJIL(int i, C1797010wrb c1797010wrb) {
            }

            @Override // X.InterfaceC1796910wrR
            public final void LJIILL(int i, C1797200wru c1797200wru) {
            }

            @Override // X.InterfaceC1796910wrR
            public final String getPayload() {
                return "";
            }

            @Override // X.InterfaceC1796910wrR
            public final void LJII(C1796960wrW c1796960wrW) {
                C1796950wrV.LIZ(this, c1796960wrW);
            }

            @Override // X.InterfaceC1796910wrR
            public final void LJIILLIIL(int i, C1797010wrb c1797010wrb) {
                c11kt.onSuccess((List<Diamond>) c1797010wrb.LIZIZ);
            }

            @Override // X.InterfaceC1796910wrR
            public final void LJIIZILJ(int i, C1797200wru c1797200wru) {
                c11kt.onError(c1797200wru);
            }
        });
    }

    public static final void subscribe$1(C1864850yd1 c1864850yd1, InterfaceC2329309At interfaceC2329309At) {
        String str;
        if (C1792940wl2.LIZIZ.length() > 0) {
            interfaceC2329309At.onSuccess(C1792940wl2.LIZIZ);
            return;
        }
        String str2 = "";
        if (C1792950wl3.LIZ()) {
            interfaceC2329309At.onSuccess("");
            return;
        }
        List<Diamond> listLIZ = new C1792960wl4(Collections.singletonList(((C1792940wl2) c1864850yd1.l0).LIZ.getValue()), false).LIZ();
        C1792940wl2 c1792940wl2 = (C1792940wl2) c1864850yd1.l0;
        Diamond diamond = (Diamond) C13LP.LJJJLL(listLIZ);
        if (diamond != null && (str = diamond.LIZIZ) != null) {
            str2 = str;
        }
        c1792940wl2.getClass();
        C1792940wl2.LIZ(str2);
        interfaceC2329309At.onSuccess(C1792940wl2.LIZIZ);
    }
}
