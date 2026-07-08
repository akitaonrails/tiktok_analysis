package X;

import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.bagicon.BagGuideTooltipController;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.settings.EcShopBagCommonBubbleConfig;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.11Xe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.bagicon.BagGuideTooltipController$showTooltipV3$2$1", f = "BagGuideTooltipController.kt", l = {195}, m = "invokeSuspend")
public final class C19516411Xe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BagGuideTooltipController LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19516411Xe(BagGuideTooltipController bagGuideTooltipController, int i, String str, String str2, InterfaceC1364105Vn<? super C19516411Xe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bagGuideTooltipController;
        this.LLILLL = i;
        this.LLILZ = str;
        this.LLILZIL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C19516411Xe(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<String> listSingletonList;
        C1C7U.LIZ("BagGuideTooltipController@43e3.showTooltipV3$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(1000L, this) == objLJFF) {
                C1C7U.LIZIZ("BagGuideTooltipController@43e3.showTooltipV3$2$1");
                return objLJFF;
            }
        }
        BagGuideTooltipController bagGuideTooltipController = this.LLILLJJLI;
        int i2 = this.LLILLL;
        String str = this.LLILZ;
        String str2 = this.LLILZIL;
        if (str2 != null && str2.length() != 0) {
            z = false;
        }
        String str3 = null;
        if (z) {
            listSingletonList = null;
        } else {
            listSingletonList = Collections.singletonList(this.LLILZIL);
        }
        EcShopBagCommonBubbleConfig ecShopBagCommonBubbleConfigLIZ = C11XZ.LIZ(this.LLILLL);
        if (ecShopBagCommonBubbleConfigLIZ != null) {
            str3 = ecShopBagCommonBubbleConfigLIZ.bubbleKey;
        }
        bagGuideTooltipController.showTooltipV3(i2, str, listSingletonList, str3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BagGuideTooltipController@43e3.showTooltipV3$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
