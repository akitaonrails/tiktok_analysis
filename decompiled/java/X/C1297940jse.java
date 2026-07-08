package X;

import com.bytedance.sdui.render.bridge.ReadableArray;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0jse, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1297940jse {
    public final String LIZ;

    public C1297940jse(String str) {
        this.LIZ = str;
    }

    public static Map<String, C1297940jse> LIZ(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (int i = 0; i < readableArray.size(); i++) {
            String string = readableArray.getString(i);
            C1297940jse c1297940jse = (C1297940jse) map.get(string);
            if (c1297940jse == null) {
                c1297940jse = new C1297940jse(string);
            }
            map.put(c1297940jse.LIZ, c1297940jse);
        }
        return map;
    }
}
