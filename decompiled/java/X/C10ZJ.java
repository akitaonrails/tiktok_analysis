package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.10ZJ, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10ZJ {
    public static String LIZ(String str) {
        List<String> listLIZ;
        if (TextUtils.isEmpty(str) || !str.contains("challenge/detail") || (listLIZ = C018G.LIZ(str)) == null || listLIZ.size() <= 0) {
            return null;
        }
        return (String) ListProtector.get(listLIZ, listLIZ.size() - 1);
    }
}
