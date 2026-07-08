package X;

import android.net.Uri;
import android.view.View;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0vNC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1739720vNC {
    public static final void LIZ(Uri.Builder builder, String str) {
        if (C770702zh.LIZIZ(str) && str != null) {
            builder.appendQueryParameter("source_btm_token", str);
        }
    }

    public static final Map<String, String> LIZIZ(C1741510vQ5 c1741510vQ5, PageFinder pageFinder) {
        String string;
        HashMap map = new HashMap();
        for (Map.Entry entry : BtmSDK.createReportParams$default(BtmSDK.INSTANCE, C1741500vQ4.LIZ(c1741510vQ5).toString(), pageFinder, null, 4, null).entrySet()) {
            Object value = entry.getValue();
            if (value != null && (string = value.toString()) != null) {
                map.put(entry.getKey(), string);
            }
        }
        return map;
    }

    public static final String LIZLLL(C1741510vQ5 c1741510vQ5, PageFinder pageFinder) {
        return BtmSDK.INSTANCE.createJumpSourceBtmToken(C1741500vQ4.LIZ(c1741510vQ5).toString(), pageFinder, null);
    }

    public static final String LIZJ(C1741510vQ5 c1741510vQ5, View view, Map<String, String> map) {
        BtmSDK btmSDK = BtmSDK.INSTANCE;
        String string = C1741500vQ4.LIZ(c1741510vQ5).toString();
        PageFinder pageFinderVia = PageFinder.via(view);
        BcmParams.Companion.getClass();
        return btmSDK.createJumpSourceBtmToken(string, pageFinderVia, C212367188v.LIZJ(map));
    }
}
