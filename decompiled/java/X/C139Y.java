package X;

import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.AFwS219S0000000_30;

/* JADX INFO: renamed from: X.139Y, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C139Y implements Serializable {
    public static final C139Z Companion = new Object() { // from class: X.139Z
    };
    public final transient C01GW LL = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(157));

    public final <T> T get(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return null;
        }
        Map map = (Map) this.LL.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("com.ss.android.ugc.aweme.utils.ParamsBundle:");
        sbLIZ.append(canonicalName);
        T t = (T) map.get(C2188811AlT.LIZIZ(sbLIZ));
        if (t == null) {
            return null;
        }
        return t;
    }

    public final <T> T get(String str) {
        T t = (T) ((Map) this.LL.getValue()).get(str);
        if (t == null) {
            return null;
        }
        return t;
    }

    public final <T> T get(Class<T> cls, T t) {
        T t2 = (T) get(cls);
        if (t2 != null) {
            return t2;
        }
        return t;
    }

    public final <T> void put(Class<T> cls, T t) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            Map map = (Map) this.LL.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("com.ss.android.ugc.aweme.utils.ParamsBundle:");
            sbLIZ.append(canonicalName);
            map.put(C2188811AlT.LIZIZ(sbLIZ), t);
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can't be the key of ParamBundle");
    }

    public final <T> T get(String str, T t) {
        T t2 = (T) get(str);
        if (t2 != null) {
            return t2;
        }
        return t;
    }

    public final <T> void put(String str, T t) {
        ((Map) this.LL.getValue()).put(str, t);
    }
}
