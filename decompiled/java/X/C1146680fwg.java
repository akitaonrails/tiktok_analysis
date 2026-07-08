package X;

import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center.GiftAnchorPanelGiftPageCenterAssemCompose;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fwg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center.GiftAnchorPanelGiftPageCenterAssemCompose$RenderUi$1$1", f = "GiftAnchorPanelGiftPageCenterAssemCompose.kt", l = {}, m = "invokeSuspend")
public final class C1146680fwg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1146530fwR LL;
    public final /* synthetic */ C05P1<C1146210fvv> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1146680fwg(C1146530fwR c1146530fwR, C05P1<C1146210fvv> c05p1, InterfaceC1364105Vn<? super C1146680fwg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1146530fwR;
        this.LLILLJJLI = c05p1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1146680fwg(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("GiftAnchorPanelGiftPageCenterAssemCompose@ad39.RenderUi$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C05P1<C1146210fvv> c05p1 = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = GiftAnchorPanelGiftPageCenterAssemCompose.LLJILJILJ;
        if (c05p1.getValue().LLILLJJLI.getFirst() == EnumC1146170fvr.GIFT) {
            if (this.LLILLJJLI.getValue().LL.getSecond().intValue() == 0) {
                z = true;
            } else {
                z = false;
            }
            this.LL.LLILLL.invoke(new C1146630fwb(z));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GiftAnchorPanelGiftPageCenterAssemCompose@ad39.RenderUi$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
