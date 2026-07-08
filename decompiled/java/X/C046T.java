package X;

import X.C0H9H;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcomSkuImprovementConfig;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcomSkuPromotionAndScreenEfficiencyConfig;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import o5b.a;

/* JADX INFO: renamed from: X.046T, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C046T implements AnonymousClass0446 {
    public final SkuPanelStarter.SkuEnterParams LIZ;

    public static final int LJIIIIZZ() {
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
    }

    @Override // X.AnonymousClass0446
    public final float LJFF() {
        return C0H9H.LIZ(2);
    }

    public static final int LJI() {
        return (int) C0H9H.LIZ(32);
    }

    public static final int LJII() {
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    }

    public static final int LJIIL() {
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    }

    public static final int LJIILIIL() {
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    }

    @Override // X.AnonymousClass0446
    public final int LJ() {
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(150));
    }

    public final int LJIIJ() {
        Integer num;
        SkuPanelStarter.SkuEnterParams skuEnterParams = this.LIZ;
        if (skuEnterParams == null || (num = skuEnterParams.displayMode) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // X.AnonymousClass0446
    public final a LIZ() {
        return EcomSkuImprovementConfig.LIZ() ? new a() { // from class: o5b.b$a
            public final int LJII = (int) C0H9H.LIZ(12);

            @Override // o5b.a, r4b.g
            public final int LJJI() {
                return (int) C0H9H.LIZ(12);
            }

            @Override // o5b.a, r4b.g
            public final int LJJJJIZL() {
                return this.LJII;
            }
        } : new a();
    }

    @Override // X.AnonymousClass0446
    public final int LIZIZ() {
        return (int) (EcomSkuPromotionAndScreenEfficiencyConfig.LIZ() ? C0H9H.LIZ(140) : C0H9H.LIZ(160));
    }

    @Override // X.AnonymousClass0446
    public final int LIZJ() {
        return (int) (EcomSkuPromotionAndScreenEfficiencyConfig.LIZ() ? C0H9H.LIZ(140) : C0H9H.LIZ(160));
    }

    @Override // X.AnonymousClass0446
    public final int LIZLLL() {
        return (int) (EcomSkuPromotionAndScreenEfficiencyConfig.LIZ() ? C0H9H.LIZ(140) : C0H9H.LIZ(160));
    }

    public final boolean LJIIIZ() {
        int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "ecom_sku_show_title", true);
        if (iLJIJ != C046V.SHOW_TITLE_ALWAYS.getType()) {
            if (iLJIJ == C046V.HIDE_TITLE_ALWAYS.getType()) {
                return false;
            }
            if (iLJIJ == C046V.SHOW_TITLE_IF_NOT_PDP_OR_REVIEW.getType()) {
                SkuPanelStarter.SkuEnterParams skuEnterParams = this.LIZ;
                if (Intrinsics.LJFF(skuEnterParams != null ? skuEnterParams.enterFrom : null, "product_detail")) {
                    return false;
                }
                SkuPanelStarter.SkuEnterParams skuEnterParams2 = this.LIZ;
                if (Intrinsics.LJFF(skuEnterParams2 != null ? skuEnterParams2.enterFrom : null, "product_review")) {
                    return false;
                }
            }
        }
        return true;
    }

    public final float LJIIJJI() {
        Float f;
        Double d;
        try {
            SkuPanelStarter.SkuEnterParams skuEnterParams = this.LIZ;
            Map<String, Object> map = skuEnterParams != null ? skuEnterParams.trackParams : null;
            if (map == null || !map.containsKey("page_height")) {
                SkuPanelStarter.SkuEnterParams skuEnterParams2 = this.LIZ;
                return (skuEnterParams2 == null || (f = skuEnterParams2.height) == null) ? !LJIILJJIL() ? 0.73f : 0.9f : f.floatValue();
            }
            Object obj = map.get("page_height");
            if (!(obj instanceof Double) || (d = (Double) obj) == null) {
                return 1.0f;
            }
            return (float) d.doubleValue();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return !LJIILJJIL() ? 0.73f : 0.9f;
        }
    }

    public final boolean LJIILJJIL() {
        if (LJIIJ() == 1) {
            return true;
        }
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LIZ("ecom_sku_enable_enrich_mode_config", false);
    }

    public final boolean LJIILL() {
        return LJIIJ() == EnumC1752350vhZ.EXCHANGE_MODE.getType();
    }

    public C046T(SkuPanelStarter.SkuEnterParams skuEnterParams) {
        this.LIZ = skuEnterParams;
    }
}
