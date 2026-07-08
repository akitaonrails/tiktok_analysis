package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.u;

/* JADX INFO: renamed from: X.036I, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C036I {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String[] strArr) {
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(str);
            sb.append("_");
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return u.LJJIFFI(sb.toString(), "__", "_", false);
    }

    public static String LIZIZ(List list) {
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size() - 1;
        for (int i = 0; i < size; i++) {
            sb.append((String) ListProtector.get(list, i));
            sb.append(", ");
        }
        sb.append((String) C13LP.LJJLIIIJJI(list));
        return sb.toString();
    }
}
