package X;

import com.ss.android.ugc.aweme.model.AnoleProductModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H9U, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.component.adcardcomponent.vsacard.AnoleVSAProductViewHolder$configView$2", f = "AnoleVSAProductViewHolder.kt", l = {}, m = "invokeSuspend")
public final class C0H9U extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AnoleProductModel LL;
    public final /* synthetic */ C0H9X LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H9U(AnoleProductModel anoleProductModel, C0H9X c0h9x, InterfaceC1364105Vn<? super C0H9U> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = anoleProductModel;
        this.LLILLJJLI = c0h9x;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0H9U(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AnoleVSAProductViewHolder@c473.configView$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String imageUrl = this.LL.getImageUrl();
        if (imageUrl == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AnoleVSAProductViewHolder@c473.configView$2");
            return unit;
        }
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(imageUrl);
        c1331670kl3LJIIIZ.LJJ(this.LLILLJJLI.LLILLJJLI);
        c1331670kl3LJIIIZ.LJJIII = EnumC1334360kpO.HIGH;
        c1331670kl3LJIIIZ.LIZLLL("vsa_full_screen_card");
        c1331670kl3LJIIIZ.LJJIJL(this.LLILLJJLI.LLILLJJLI.getContext());
        C786410Ut5.h3(c1331670kl3LJIIIZ);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AnoleVSAProductViewHolder@c473.configView$2");
        return unit2;
    }
}
