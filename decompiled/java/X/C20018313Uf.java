package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.fyp.affiliate.button.settings.EcProductAddInternal;

/* JADX INFO: renamed from: X.13Uf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20018313Uf {
    public static final EcProductAddInternal LIZ = new EcProductAddInternal(false, -1);

    public static final EcProductAddInternal LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcProductAddInternal ecProductAddInternal = LIZ;
        EcProductAddInternal ecProductAddInternal2 = (EcProductAddInternal) settingsManagerLIZLLL.LJIIIIZZ("ec_anchor_show_add_product_bottom_interval_config", EcProductAddInternal.class, ecProductAddInternal);
        return ecProductAddInternal2 != null ? ecProductAddInternal2 : ecProductAddInternal;
    }
}
