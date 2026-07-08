package X;

import Y.AgS203S0200000_14;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0IC0, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol.PhotoswapAnimAbilityImpl$launchPhotoSwapAnimAndReturnJob$1", f = "PhotoswapCard.kt", l = {59}, m = "invokeSuspend")
public final class C0IC0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C910970ZoV LLILLJJLI;
    public final /* synthetic */ C869590Y9l LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0IC0(C910970ZoV c910970ZoV, C869590Y9l c869590Y9l, InterfaceC1364105Vn<? super C0IC0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c910970ZoV;
        this.LLILLL = c869590Y9l;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0IC0(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PhotoswapAnimAbilityImpl@603.launchPhotoSwapAnimAndReturnJob$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C901890ZZr c901890ZZr = this.LLILLJJLI.LIZ;
            C414301jJ c414301jJ = new C414301jJ(new C463000IDq(c901890ZZr.LLJILJILJ, 39), c901890ZZr.LLJILLL, new C462570IBz(null));
            AgS203S0200000_14 agS203S0200000_14 = new AgS203S0200000_14(this.LLILLJJLI, this.LLILLL, 6);
            this.LL = 1;
            if (c414301jJ.collect(agS203S0200000_14, this) == objLJFF) {
                C1C7U.LIZIZ("PhotoswapAnimAbilityImpl@603.launchPhotoSwapAnimAndReturnJob$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PhotoswapAnimAbilityImpl@603.launchPhotoSwapAnimAndReturnJob$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
