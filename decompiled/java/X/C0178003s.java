package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.003s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0178003s {
    public static final String LIZ(List list) {
        int size = ((ArrayList) list).size();
        if (size == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append((String) ListProtector.get(list, i));
            if (i < size - 1) {
                sb.append(',');
            }
        }
        return sb.toString();
    }
}
