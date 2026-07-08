package X;

import com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumEventTrackingConfig;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Kh0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C524120Kh0 {
    public static final C524120Kh0 LIZ = new C524120Kh0();

    public static void LIZ(String str, AlbumEventTrackingConfig albumEventTrackingConfig, Function1 function1) {
        Map<String, String> map;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("shoot_way", albumEventTrackingConfig.shootWay);
        c0lab.LJ("enter_from", albumEventTrackingConfig.enterFrom);
        c0lab.LJ("from_page", albumEventTrackingConfig.fromPage);
        c0lab.LJ("type", "photo");
        function1.invoke(c0lab);
        Map<String, String> map2 = albumEventTrackingConfig.passThroughCommonParams;
        if (map2 != null) {
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                c0lab.LJ(entry.getKey(), entry.getValue());
            }
        }
        Map<String, ? extends Map<String, String>> map3 = albumEventTrackingConfig.passThroughParams;
        if (map3 != null && (map = map3.get(str)) != null) {
            for (Map.Entry<String, String> entry2 : map.entrySet()) {
                c0lab.LJ(entry2.getKey(), entry2.getValue());
            }
        }
        C20684815ws.LJIILLIIL(str, c0lab.LIZ);
    }
}
