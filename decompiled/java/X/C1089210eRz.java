package X;

import com.bytedance.android.live.dynamicstrategy.strategy.Strategy;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0eRz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1089210eRz implements InterfaceC1089810eSx, InterfaceC1089760eSs {
    public final InterfaceC1089270eS5 LIZ;
    public final InterfaceC1089220eS0 LIZIZ;

    @Override // X.InterfaceC1089810eSx
    public final C1089610eSd LIZ(String str) {
        return this.LIZ.LIZJ(str);
    }

    public final void LJ(List<String> list) {
        this.LIZIZ.LJFF(list);
    }

    public C1089210eRz(C1089240eS2 c1089240eS2, C1089230eS1 c1089230eS1) {
        this.LIZ = c1089240eS2;
        this.LIZIZ = c1089230eS1;
    }

    @Override // X.InterfaceC1089760eSs
    public final void LIZIZ(C1089610eSd c1089610eSd, String str) {
        InterfaceC1089740eSq second;
        Pair<Strategy, InterfaceC1089740eSq> pairLJ = this.LIZIZ.LJ(str);
        if (pairLJ != null && (second = pairLJ.getSecond()) != null) {
            second.LIZJ(c1089610eSd);
        }
    }

    public final void LIZJ(AbstractC1089300eS8 abstractC1089300eS8, C1089540eSW c1089540eSW) {
        this.LIZIZ.LIZLLL(new C1089700eSm(abstractC1089300eS8.LL.LIZ, abstractC1089300eS8.LIZLLL()), C1697810uHb.LJIIJJI(new InterfaceC1089750eSr<Object>() { // from class: X.0eSk
            @Override // X.InterfaceC1089750eSr
            public final void LIZ(C0J0Q c0j0q, Object obj, String str) {
                this.LIZ.LIZ.LJ(c0j0q, obj, str);
            }
        }, c1089540eSW), abstractC1089300eS8);
    }

    public final void LIZLLL(Strategy strategy, InterfaceC1089740eSq interfaceC1089740eSq) {
        this.LIZIZ.LJII(strategy, interfaceC1089740eSq);
    }
}
