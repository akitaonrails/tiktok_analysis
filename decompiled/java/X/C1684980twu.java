package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0twu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center.GiftAnchorPanelGiftPageCenterAssemComposeKt$ScrollEventTracking$1$1", f = "GiftAnchorPanelGiftPageCenterAssemCompose.kt", l = {}, m = "invokeSuspend")
public final class C1684980twu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1690050u55 LLILLJJLI;
    public final /* synthetic */ C1684970twt LLILLL;
    public final /* synthetic */ C05P1<InterfaceC1665500tRU<InterfaceC1146480fwM>> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1684980twu(C1690050u55 c1690050u55, C1684970twt c1684970twt, C05P1<? extends InterfaceC1665500tRU<? extends InterfaceC1146480fwM>> c05p1, InterfaceC1364105Vn<? super C1684980twu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1690050u55;
        this.LLILLL = c1684970twt;
        this.LLILZ = c05p1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1684980twu c1684980twu = new C1684980twu(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1684980twu.LL = obj;
        return c1684980twu;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GiftAnchorPanelGiftPageCenterAssemComposeKt@c5e0.ScrollEventTracking$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        C23250099c.LIZLLL(interfaceC497601wk, new C2232408os(C823050WQl.LIZLLL()), null, new C1684990twv(this.LLILLJJLI, this.LLILLL, this.LLILZ, null), 2);
        C23250099c.LIZLLL(interfaceC497601wk, new C2232408os(C823050WQl.LIZLLL()), null, new C1685000tww(this.LLILLJJLI, this.LLILLL, null), 2);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GiftAnchorPanelGiftPageCenterAssemComposeKt@c5e0.ScrollEventTracking$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
