package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.poi.experiment.PoiBubbleConfig;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0SQ3, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SQ3 {
    public static final C0SQ3 LIZ = new C0SQ3();

    public static Map LIZ() {
        PoiBubbleConfig[] poiBubbleConfigArr = (PoiBubbleConfig[]) SettingsManager.LIZLLL().LJIIIIZZ("poi_social_bubble_anchors", PoiBubbleConfig[].class, null);
        HashMap map = new HashMap();
        if (poiBubbleConfigArr != null) {
            for (PoiBubbleConfig poiBubbleConfig : poiBubbleConfigArr) {
                map.put(Integer.valueOf(poiBubbleConfig.type), poiBubbleConfig.icon);
            }
        }
        return map;
    }
}
