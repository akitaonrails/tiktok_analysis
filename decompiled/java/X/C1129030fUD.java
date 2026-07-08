package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fUD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafV2$requestGiftListAndGiftGallery$1", f = "GiftPanelLeafV2.kt", l = {1729, 1731}, m = "invokeSuspend")
public final class C1129030fUD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1128710fTh LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1129030fUD(C1128710fTh c1128710fTh, InterfaceC1364105Vn<? super C1129030fUD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1128710fTh;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1129030fUD c1129030fUD = new C1129030fUD(this.LLILLL, interfaceC1364105Vn);
        c1129030fUD.LLILLJJLI = obj;
        return c1129030fUD;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GiftPanelLeafV2@f893.requestGiftListAndGiftGallery$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("GiftPanelLeafV2@f893.requestGiftListAndGiftGallery$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C099G c099gLIZIZ = C23250099c.LIZIZ((InterfaceC497601wk) this.LLILLJJLI, null, null, new C1129020fUC(this.LLILLL, null), 3);
            C20441214yg.LJIIIZ("TagGiftGallery", "giftList & giftGallery started");
            this.LL = 1;
            obj = c099gLIZIZ.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("GiftPanelLeafV2@f893.requestGiftListAndGiftGallery$1");
                return objLJFF;
            }
        }
        C20441214yg.LJIIIZ("TagGiftGallery", "giftList & giftGallery completed");
        C1128710fTh c1128710fTh = this.LLILLL;
        AbstractC2252651DEx abstractC2252651DEx = c1128710fTh.LLJILJILJ;
        C1129010fUB c1129010fUB = new C1129010fUB((List) obj, c1128710fTh, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2252651DEx, c1129010fUB) == objLJFF) {
            C1C7U.LIZIZ("GiftPanelLeafV2@f893.requestGiftListAndGiftGallery$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("GiftPanelLeafV2@f893.requestGiftListAndGiftGallery$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
