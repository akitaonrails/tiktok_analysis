package X;

import com.bytedance.android.livesdk.gift.model.GiftPage;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fUB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafV2$requestGiftListAndGiftGallery$1$1", f = "GiftPanelLeafV2.kt", l = {}, m = "invokeSuspend")
public final class C1129010fUB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<GiftPage> LL;
    public final /* synthetic */ C1128710fTh LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1129010fUB(List<? extends GiftPage> list, C1128710fTh c1128710fTh, InterfaceC1364105Vn<? super C1129010fUB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = c1128710fTh;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1129010fUB(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GiftPanelLeafV2@f893.requestGiftListAndGiftGallery$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!C1130100fVw.LIZ.LJIILIIL) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("GiftPanelLeafV2@f893.requestGiftListAndGiftGallery$1$1");
            return unit;
        }
        C20441214yg.LJIIIZ("TagGiftGallery", "giftList & giftGallery updated UI");
        List<GiftPage> list = this.LL;
        if (list != null) {
            C1128710fTh c1128710fTh = this.LLILLJJLI;
            c1128710fTh.LLLIILIL = 0;
            C1129310fUf.LIZ.getClass();
            C1129310fUf.LIZLLL = 3;
            c1128710fTh.LJLIIL(1, list);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("GiftPanelLeafV2@f893.requestGiftListAndGiftGallery$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
