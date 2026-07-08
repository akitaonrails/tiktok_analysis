package X;

import com.ss.android.ugc.aweme.im.common.model.StickerBase;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.common.model.StickerUserInfo;
import com.ss.android.ugc.aweme.im.common.model.ThirdpartyStickerItem;
import com.ss.android.ugc.aweme.util.IStickerStoreHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HY5, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sticker.impl.ui.StickerGridPageWithinPowerCell$updateStickerFavV2$1", f = "StickerGridPageWithinPowerCell.kt", l = {154}, m = "invokeSuspend")
public final class C0HY5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C450470HlV LLILLJJLI;
    public final /* synthetic */ StickerItem LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HY5(C450470HlV c450470HlV, StickerItem stickerItem, InterfaceC1364105Vn<? super C0HY5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c450470HlV;
        this.LLILLL = stickerItem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HY5(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jLongValue;
        String string;
        Long l;
        Long l2;
        C1C7U.LIZ("StickerGridPageWithinPowerCell@1408.updateStickerFavV2$1");
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
                if (stickerBase != null && (l2 = stickerBase.id) != null) {
                    jLongValue = l2.longValue();
                } else {
                    jLongValue = 0;
                }
                StickerBase stickerBase2 = this.LLILLL.stickerBase;
                Integer num = null;
                if (stickerBase2 != null) {
                    String str = stickerBase2.thirdPartyStickerId;
                    Integer num2 = stickerBase2.stickerType;
                    if (num2 != null) {
                        int iIntValue = num2.intValue();
                        StickerUserInfo stickerUserInfo = this.LLILLL.userInfo;
                        if (stickerUserInfo == null || (l = stickerUserInfo.creatorUid) == null || (string = l.toString()) == null) {
                            string = "";
                        }
                        StickerItem stickerItem = this.LLILLL;
                        ThirdpartyStickerItem thirdpartyStickerItem = stickerItem.thirdPartyStickerInfo;
                        if (thirdpartyStickerItem != null) {
                            num = thirdpartyStickerItem.source;
                        }
                        Integer num3 = stickerItem.createSource;
                        Integer num4 = stickerItem.stickerVariant;
                        EnumC441530HTb enumC441530HTb = EnumC441530HTb.TOP;
                        this.LL = 1;
                        if (iStickerStoreHelperLIZ.LIZIZ("favourite_tab", "long_press", c450550HldLJ, jLongValue, str, iIntValue, string, num, null, null, false, num3, num4, false, null, enumC441530HTb, null, null, false, this) == objLJFF) {
                            C1C7U.LIZIZ("StickerGridPageWithinPowerCell@1408.updateStickerFavV2$1");
                            return objLJFF;
                        }
                    }
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("StickerGridPageWithinPowerCell@1408.updateStickerFavV2$1");
                return unit;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("StickerGridPageWithinPowerCell@1408.updateStickerFavV2$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
