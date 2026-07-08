package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.18LA, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18LA {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(int i, String str) {
        return u.LJJIFFI(str, "placeholder", String.valueOf(i), false);
    }

    public static Map LIZJ(View view, String str) {
        String string;
        HashMap map = new HashMap();
        if (view != null) {
            for (Map.Entry entry : BtmSDK.createReportParams$default(BtmSDK.INSTANCE, str, PageFinder.via(view), null, 4, null).entrySet()) {
                Object value = entry.getValue();
                if (value != null && (string = value.toString()) != null) {
                    map.put(entry.getKey(), string);
                }
            }
        }
        return map;
    }

    public static String LIZIZ(int i, int i2, String str) {
        AnchorBizUtils.LIZ.getClass();
        if (AnchorBizUtils.LJJLIIIJJIZ(i, i2)) {
            if (Intrinsics.LJFF(str, "c7828.d9074_iplaceholder")) {
                str = "c0417.d4352_iplaceholder";
            } else if (Intrinsics.LJFF(str, "c7828.d9074_iplaceholder_w6919")) {
                str = "c0417.d4352_iplaceholder_w5781";
            }
        }
        return LIZ(i2, str);
    }

    public static String LIZLLL(Fragment fragment, String str, Map map) {
        BtmSDK btmSDK = BtmSDK.INSTANCE;
        PageFinder pageFinderVia = PageFinder.via(fragment);
        BcmParams bcmParams = new BcmParams();
        bcmParams.merge((Map<String, ? extends Object>) map);
        return btmSDK.createJumpSourceBtmToken(str, pageFinderVia, bcmParams);
    }

    public static String LJ(String str, View view, Map map) {
        BtmSDK btmSDK = BtmSDK.INSTANCE;
        PageFinder pageFinderVia = PageFinder.via(view);
        BcmParams bcmParams = new BcmParams();
        bcmParams.merge((Map<String, ? extends Object>) map);
        return btmSDK.createJumpSourceBtmToken(str, pageFinderVia, bcmParams);
    }

    public static String LJFF(View view, String str, String str2, Map map) {
        String strLJ = LJ(str2, view, map);
        if (C703302op.LIZ(str) && C703302op.LIZ(strLJ)) {
            return UriProtector.parse(str).buildUpon().appendQueryParameter("source_btm_token", strLJ).build().toString();
        }
        return str;
    }

    public static String LJI(Fragment fragment, String str, String str2, Map map) {
        String strLIZLLL = LIZLLL(fragment, str2, map);
        if (C703302op.LIZ(str) && C703302op.LIZ(strLIZLLL)) {
            return UriProtector.parse(str).buildUpon().appendQueryParameter("source_btm_token", strLIZLLL).build().toString();
        }
        return str;
    }
}
