package X;

import Y.AkS486S0100000_25;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X.0scT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1633870scT extends AbstractC1633970scd<EffectCategoryResponse, C1633900scW> implements InterfaceC1633960scc {
    public final InterfaceC1632990sb3 LJFF;
    public final InterfaceC1633000sb4 LJI;

    @Override // X.InterfaceC1634010sch
    public final EffectCategoryResponse LIZLLL(String str) {
        return (EffectCategoryResponse) this.LJ.get(str);
    }

    @Override // X.InterfaceC1634010sch
    public final C19490411Ne LIZJ(final Effect effect, final boolean z) {
        return C11NZ.LJIJJLI(new C1698340uIS(this, effect, 2)).LJL(C11S5.LIZ()).LJLI(C11NZ.LJJ(new Callable() { // from class: X.0sb5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("DefaultInfoStickerRepository@ba59.download$2");
                C11ON c11onLJJJJZI = this.LL.LJFF.LIZIZ(effect, z).LJJJJZI(new AkS486S0100000_25(this.LL, 23));
                C1C7U.LIZIZ("DefaultInfoStickerRepository@ba59.download$2");
                return c11onLJJJJZI;
            }
        }));
    }

    public C1633870scT(InterfaceC1634030scj interfaceC1634030scj, InterfaceC1634030scj interfaceC1634030scj2, C1634020sci c1634020sci, C1633980sce c1633980sce, C1632970sb1 c1632970sb1, C1632960sb0 c1632960sb0, C1632980sb2 c1632980sb2) {
        super(interfaceC1634030scj, interfaceC1634030scj2, c1634020sci, c1633980sce, c1632970sb1);
        this.LJFF = c1632960sb0;
        this.LJI = c1632980sb2;
    }
}
