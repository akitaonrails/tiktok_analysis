package X;

import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.038c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7936038c {
    public static final /* synthetic */ int LIZ = 0;

    public static Map LIZ(String str, PageFinder pageFinder) {
        String string;
        HashMap map = new HashMap();
        for (Map.Entry entry : BtmSDK.createReportParams$default(BtmSDK.INSTANCE, str, pageFinder, null, 4, null).entrySet()) {
            Object value = entry.getValue();
            if (value != null && (string = value.toString()) != null) {
                map.put(entry.getKey(), string);
            }
        }
        return map;
    }
}
