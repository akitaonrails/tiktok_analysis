package X;

import Y.AgS172S0300000_25;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS569S0100000_25;
import njp.a;

/* JADX INFO: renamed from: X.0twv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center.GiftAnchorPanelGiftPageCenterAssemComposeKt$ScrollEventTracking$1$1$1", f = "GiftAnchorPanelGiftPageCenterAssemCompose.kt", l = {716}, m = "invokeSuspend")
public final class C1684990twv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1690050u55 LLILLJJLI;
    public final /* synthetic */ C1684970twt LLILLL;
    public final /* synthetic */ C05P1<InterfaceC1665500tRU<InterfaceC1146480fwM>> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1684990twv(C1690050u55 c1690050u55, C1684970twt c1684970twt, C05P1<? extends InterfaceC1665500tRU<? extends InterfaceC1146480fwM>> c05p1, InterfaceC1364105Vn<? super C1684990twv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1690050u55;
        this.LLILLL = c1684970twt;
        this.LLILZ = c05p1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1684990twv(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GiftAnchorPanelGiftPageCenterAssemComposeKt@c5e0.ScrollEventTracking$1$1$1");
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
            C23123094f c23123094fLJJIZ = C09IC.LJJIZ(C09IC.LJIILL(new C1698260uIK(new C1629806Zs(C20028913Yh.LJIIIZ(new AwS569S0100000_25(this.LLILLJJLI, 72))), this.LLILLL, 3)), new C478801ti(null));
            AgS172S0300000_25 agS172S0300000_25 = new AgS172S0300000_25(this.LLILLL, this.LLILLJJLI, this.LLILZ, 0);
            this.LL = 1;
            if (c23123094fLJJIZ.collect(agS172S0300000_25, this) == objLJFF) {
                C1C7U.LIZIZ("GiftAnchorPanelGiftPageCenterAssemComposeKt@c5e0.ScrollEventTracking$1$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GiftAnchorPanelGiftPageCenterAssemComposeKt@c5e0.ScrollEventTracking$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
