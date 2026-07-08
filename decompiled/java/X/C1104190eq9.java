package X;

import android.view.View;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0eq9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1104190eq9 {
    public static final /* synthetic */ int LIZ = 0;

    public static Map LIZ(View view, String str) {
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

    public static String LIZIZ(View view, String str) {
        return BtmSDK.INSTANCE.createJumpSourceBtmToken(str, PageFinder.via(view), new BcmParams());
    }
}
