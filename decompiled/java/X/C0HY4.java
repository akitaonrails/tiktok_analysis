package X;

import com.ss.android.ugc.aweme.im.common.model.StickerBase;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.common.model.ThirdpartyStickerItem;
import com.ss.android.ugc.aweme.util.IStickerStoreHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HY4, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sticker.impl.ui.StickerGridPageWithinPowerCell$updateStickerFavV2$2", f = "StickerGridPageWithinPowerCell.kt", l = {170}, m = "invokeSuspend")
public final class C0HY4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C450470HlV LLILLJJLI;
    public final /* synthetic */ StickerItem LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HY4(C450470HlV c450470HlV, StickerItem stickerItem, InterfaceC1364105Vn<? super C0HY4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c450470HlV;
        this.LLILLL = stickerItem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HY4(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerGridPageWithinPowerCell@1408.updateStickerFavV2$2");
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
            IStickerStoreHelper.LIZ.getClass();
            IStickerStoreHelper iStickerStoreHelperLIZ = C0HY9.LIZ();
            if (iStickerStoreHelperLIZ != null) {
                C450550Hld c450550HldLJ = this.LLILLJJLI.LJ();
                StickerBase stickerBase = this.LLILLL.stickerBase;
                Integer num = null;
                if (stickerBase != null) {
                    Long l = stickerBase.id;
                    String str = stickerBase.thirdPartyStickerId;
                    Integer num2 = stickerBase.stickerType;
                    if (num2 != null) {
                        Integer numLJ = C2286608xc.LJ(num2.intValue());
                        StickerItem stickerItem = this.LLILLL;
                        Long l2 = stickerItem.setId;
                        ThirdpartyStickerItem thirdpartyStickerItem = stickerItem.thirdPartyStickerInfo;
                        if (thirdpartyStickerItem != null) {
                            num = thirdpartyStickerItem.source;
                        }
                        this.LL = 1;
                        if (iStickerStoreHelperLIZ.LJFF(c450550HldLJ, l, str, numLJ, "favourite_tab", l2, num, null, null, null, false, this) == objLJFF) {
                            C1C7U.LIZIZ("StickerGridPageWithinPowerCell@1408.updateStickerFavV2$2");
                            return objLJFF;
                        }
                    }
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("StickerGridPageWithinPowerCell@1408.updateStickerFavV2$2");
                return unit;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("StickerGridPageWithinPowerCell@1408.updateStickerFavV2$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
