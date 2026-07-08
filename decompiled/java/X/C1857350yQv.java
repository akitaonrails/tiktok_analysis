package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.search.model.TakoFullScreenDisclaimerTextModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0yQv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1857350yQv {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ(List list) {
        List<Map<String, String>> list2 = ((TakoFullScreenDisclaimerTextModel) C747450TTr.LIZIZ.getValue()).queryList;
        ArrayList arrayList = new ArrayList();
        if (list2 != null && !list2.isEmpty() && list2.size() >= 1) {
            int i = 0;
            while (arrayList.size() < 1) {
                if (i >= list2.size()) {
                    i = 0;
                }
                Object obj = ((Map) ListProtector.get(list2, i)).get("emoji");
                if (!list.contains(obj) && !arrayList.contains(obj)) {
                    arrayList.add(obj);
                }
                i++;
            }
        }
        return arrayList;
    }

    public static String LIZIZ(String str) {
        Matcher matcher = C1905510zgb.LIZ.matcher(str);
        while (matcher.find()) {
            str = u.LJJIFFI(str, matcher.group(), "", false);
        }
        return a0.LJLIIIL(str).toString();
    }
}
