package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import lth.o;

/* JADX INFO: renamed from: X.1186, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class AnonymousClass1186 {
    public static final Map<String, List<String>> LIZ(String str) {
        if (str != null && str.length() != 0) {
            return (Map) GsonProtectorUtils.fromJson(o.LIZIZ, str, new TypeToken<Map<String, ? extends List<? extends String>>>() { // from class: X.1187
            }.getType());
        }
        return C2097608Jq.LJ();
    }

    public static final boolean LIZIZ(C15O7<?> c15o7) {
        if (c15o7 != null && !c15o7.LJIILL() && !c15o7.LJIILIIL() && c15o7.LJIIL() != null) {
            return true;
        }
        return false;
    }
}
