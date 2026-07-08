package X;

import com.bytedance.ies.abmock.SettingsManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.09sC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C2507809sC extends C09AY implements Function0<String> {
    public C2507809sC() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.lang.String] */
    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        ?? LJIIIIZZ = SettingsManager.LIZLLL().LJIIIIZZ("dm_tcm_brand_url", String.class, "https://www.tiktok.com/falcon/tcm/h5/brand_profile?type=2&hide_nav_bar=1&should_full_screen=1&__status_bar=true&use_spark=1&container_color_auto_dark=1");
        return LJIIIIZZ != 0 ? LJIIIIZZ : "https://www.tiktok.com/falcon/tcm/h5/brand_profile?type=2&hide_nav_bar=1&should_full_screen=1&__status_bar=true&use_spark=1&container_color_auto_dark=1";
    }
}
