package X;

import android.text.TextUtils;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.net.URLDecoder;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0E37, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E37 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Map] */
    public static final String LIZ(String str) {
        ?? linkedHashMap;
        if (str != null && str.length() != 0) {
            int iLJJIZ = a0.LJJIZ(str, '?', 0, false, 6);
            if (iLJJIZ == -1) {
                linkedHashMap = C2097608Jq.LJ();
            } else {
                List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str.substring(iLJJIZ + 1), new String[]{"&"}, 0, 6);
                linkedHashMap = new LinkedHashMap();
                Iterator it2 = listLJJLIIIJILLIZJL.iterator();
                while (it2.hasNext()) {
                    List listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL((String) it2.next(), new String[]{"="}, 0, 6);
                    if (listLJJLIIIJILLIZJL2.size() == 2) {
                        linkedHashMap.put(ListProtector.get(listLJJLIIIJILLIZJL2, 0), URLDecoder.decode((String) ListProtector.get(listLJJLIIIJILLIZJL2, 1)));
                    }
                }
            }
            return (String) linkedHashMap.get("resource_id");
        }
        return null;
    }

    public static final String LIZIZ(NLEResourceNode nLEResourceNode) {
        String extra;
        if (nLEResourceNode != null) {
            extra = nLEResourceNode.getExtra("biz_res_id");
        } else {
            extra = null;
        }
        if (TextUtils.isEmpty(extra)) {
            return "";
        }
        return LIZ(extra);
    }
}
