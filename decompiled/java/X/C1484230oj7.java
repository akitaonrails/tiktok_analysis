package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterMockToolSwitch;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0oj7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1484230oj7 {
    public static final List<String> LIZ = C1697810uHb.LJIIJJI("feed", "search", "social", "ads", "pgc", "creation", "profile", "gec", LiveCenterMockToolSwitch.GROWTH, "photo", "music", "vod", "ve", "live");

    public static final String LIZ(Map<String, String> map) {
        if (map != null && !map.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            Iterator<String> it2 = LIZ.iterator();
            while (it2.hasNext()) {
                String str = map.get(it2.next());
                if (!TextUtils.isEmpty(str)) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(str);
                }
            }
            return sb.toString();
        }
        return null;
    }
}
