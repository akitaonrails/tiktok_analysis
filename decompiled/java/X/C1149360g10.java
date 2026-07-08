package X;

import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center.GiftAnchorPanelGiftPageCenterAssemCompose;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0g10, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center.GiftAnchorPanelGiftPageCenterAssemCompose$onReceiveJsEvent$1", f = "GiftAnchorPanelGiftPageCenterAssemCompose.kt", l = {198}, m = "invokeSuspend")
public final class C1149360g10 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ GiftAnchorPanelGiftPageCenterAssemCompose LLILLJJLI;
    public final /* synthetic */ C262100zr LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1149360g10(GiftAnchorPanelGiftPageCenterAssemCompose giftAnchorPanelGiftPageCenterAssemCompose, C262100zr c262100zr, InterfaceC1364105Vn<? super C1149360g10> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = giftAnchorPanelGiftPageCenterAssemCompose;
        this.LLILLL = c262100zr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1149360g10(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GiftAnchorPanelGiftPageCenterAssemCompose@ad39.onReceiveJsEvent$1");
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
            C2252331DDr c2252331DDr = this.LLILLJJLI.LLJILJIL;
            C262100zr c262100zr = this.LLILLL;
            this.LL = 1;
            if (c2252331DDr.emit(c262100zr, this) == objLJFF) {
                C1C7U.LIZIZ("GiftAnchorPanelGiftPageCenterAssemCompose@ad39.onReceiveJsEvent$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GiftAnchorPanelGiftPageCenterAssemCompose@ad39.onReceiveJsEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
