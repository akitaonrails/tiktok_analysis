package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.04sn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1237504sn {
    public static final String LIZ() {
        Object c098200Yq;
        try {
            SettingsManager.LIZLLL().getClass();
            c098200Yq = SettingsManager.LJI("educate_photo_mode_h5_url", "https://inapp.tiktokv.com/web-inapp/arch/photo-mode-education?use_spark=1&loading_bgcolor=000000&container_bg_color=000000&status_bar_color_=000000&status_font_dark=0&hide_nav_bar=1&disable_bounces=1&disable_swipe=1");
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String str = (String) c098200Yq;
        return !(str == null || str.length() == 0) ? str : "https://inapp.tiktokv.com/web-inapp/arch/photo-mode-education?use_spark=1&loading_bgcolor=000000&container_bg_color=000000&status_bar_color_=000000&status_font_dark=0&hide_nav_bar=1&disable_bounces=1&disable_swipe=1";
    }
}
