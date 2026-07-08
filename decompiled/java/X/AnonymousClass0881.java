package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.0881, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class AnonymousClass0881 {
    public static final String LIZ(C0X52<?> c0x52) {
        List<C080U> listLIZIZ;
        String str;
        C2175508fh c2175508fh = c0x52.LIZ;
        if (c2175508fh != null) {
            listLIZIZ = c2175508fh.LIZIZ("X-Tt-Logid");
        } else {
            listLIZIZ = null;
        }
        if (listLIZIZ == null || listLIZIZ.size() <= 0 || (str = ((C080U) ListProtector.get(listLIZIZ, 0)).LIZIZ) == null) {
            return "";
        }
        return str;
    }
}
