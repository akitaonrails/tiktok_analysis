package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.anchor.showcase.settings.AnchorDynamicAnimationConfig;
import com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.18NY, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.anchor.showcase.view.ECommerceShowcaseCustomSingleAnchorBusiness$photoAnchorShowSecondLineWithDelay$1", f = "ECommerceShowcaseCustomSingleAnchorBusiness.kt", l = {147}, m = "invokeSuspend")
public final class C18NY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C18NV LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18NY(C18NV c18nv, InterfaceC1364105Vn<? super C18NY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c18nv;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C18NY(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("ECommerceShowcaseCustomSingleAnchorBusiness@d761.photoAnchorShowSecondLineWithDelay$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        if (i2 != 0) {
            if (i2 == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            Aweme aweme = this.LLILLJJLI.LLILZLL.LL;
            AnchorBizUtils.LIZ.getClass();
            if (AnchorBizUtils.LJJJLL(aweme)) {
                SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
                AnchorDynamicAnimationConfig anchorDynamicAnimationConfig = C18P0.LIZ;
                AnchorDynamicAnimationConfig anchorDynamicAnimationConfig2 = (AnchorDynamicAnimationConfig) settingsManagerLIZLLL.LJIIIIZZ("ec_shop_anchor_dynamic_view_ads", AnchorDynamicAnimationConfig.class, anchorDynamicAnimationConfig);
                if (anchorDynamicAnimationConfig2 != null) {
                    anchorDynamicAnimationConfig = anchorDynamicAnimationConfig2;
                }
                i = anchorDynamicAnimationConfig.delayShowSubtitle;
            } else {
                SettingsManager settingsManagerLIZLLL2 = SettingsManager.LIZLLL();
                AnchorDynamicAnimationConfig anchorDynamicAnimationConfig3 = C18P2.LIZ;
                AnchorDynamicAnimationConfig anchorDynamicAnimationConfig4 = (AnchorDynamicAnimationConfig) settingsManagerLIZLLL2.LJIIIIZZ("ec_shop_anchor_dynamic_view", AnchorDynamicAnimationConfig.class, anchorDynamicAnimationConfig3);
                if (anchorDynamicAnimationConfig4 != null) {
                    anchorDynamicAnimationConfig3 = anchorDynamicAnimationConfig4;
                }
                i = anchorDynamicAnimationConfig3.delayShowSubtitle;
            }
            long j = ((long) i) * 1000;
            if (j < 0) {
                j = 0;
            }
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("ECommerceShowcaseCustomSingleAnchorBusiness@d761.photoAnchorShowSecondLineWithDelay$1");
                return objLJFF;
            }
        }
        C18NV c18nv = this.LLILLJJLI;
        if (!c18nv.LLILZ) {
            if ((c18nv.LLILLL instanceof C18NN) && c18nv.LLILZLL.LLILZ.getValue() != null) {
                c18nv.LLILZ = true;
                C18NN c18nn = c18nv.LLILLL;
                if (c18nn != null) {
                    c18nn.LIZLLL();
                }
            } else {
                AnonymousClass0956 anonymousClass0956 = c18nv.LLJI;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECommerceShowcaseCustomSingleAnchorBusiness@d761.photoAnchorShowSecondLineWithDelay$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
