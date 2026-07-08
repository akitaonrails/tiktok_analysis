package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.banner.FcpUiTemplate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0Rky, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C704940Rky {
    public static final C704940Rky LIZ = new C704940Rky();

    public static AbstractC704860Rkq LIZ(AbstractC704860Rkq abstractC704860Rkq, List list) {
        Map<String, Object> fieldsMap;
        Map linkedHashMap;
        if (abstractC704860Rkq == null) {
            return null;
        }
        FcpUiTemplate fcpUiTemplate = abstractC704860Rkq.LIZ;
        if (fcpUiTemplate != null) {
            fieldsMap = fcpUiTemplate.getFieldsMap();
        } else {
            fieldsMap = null;
        }
        if (!C19719512Dh.LJII(fieldsMap) || fieldsMap == null) {
            return null;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Pair pair = (Pair) it2.next();
            String str = (String) pair.getFirst();
            Object second = pair.getSecond();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("start updating data with path: ");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            int i = 0;
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{e3.d}, 0, 6);
            int size = listLJJLIIIJILLIZJL.size();
            Map map = fieldsMap;
            while (true) {
                if (i >= size) {
                    break;
                }
                if (i == listLJJLIIIJILLIZJL.size() - 1) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("finish updating data with path: ");
                    sbLIZ2.append(str);
                    sbLIZ2.append(", new value: ");
                    sbLIZ2.append(second);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    map.put(ListProtector.get(listLJJLIIIJILLIZJL, i), second);
                    break;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("current path node: ");
                sbLIZ3.append((String) ListProtector.get(listLJJLIIIJILLIZJL, i));
                sbLIZ3.append(", try to find the property");
                C2188811AlT.LIZIZ(sbLIZ3);
                String str2 = (String) ListProtector.get(listLJJLIIIJILLIZJL, i);
                Object obj = map.get(str2);
                if (!C19719512Dh.LJII(obj) || (linkedHashMap = (Map) obj) == null) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("current path node doesn't exist, start inserting new node, path node: ");
                    sbLIZ4.append(str2);
                    C2188811AlT.LIZIZ(sbLIZ4);
                    linkedHashMap = new LinkedHashMap();
                    map.put(str2, linkedHashMap);
                }
                map = linkedHashMap;
                i++;
            }
        }
        return abstractC704860Rkq;
    }
}
