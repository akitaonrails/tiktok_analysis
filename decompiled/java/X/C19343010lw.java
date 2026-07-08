package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.10lw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19343010lw {
    public final Keva LIZ;

    public C19343010lw() {
        this.LIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "ec_shop_bag_animation_frequency_enable_new_key", true, false) ? Keva.getRepo("ecommerce_live_shop_bag_guidance_anim_preference_v1") : Keva.getRepo("ecommerce_live_shop_bag_guidance_anim_preference");
    }

    public final int LIZ(String str) {
        Keva keva = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("click_shop_bag_count_");
        sbLIZ.append(str);
        return keva.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
    }
}
