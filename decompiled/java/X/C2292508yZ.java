package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: X.08yZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2292508yZ {
    public static Gson LIZ;

    public static Gson LIZIZ() {
        if (LIZ == null) {
            LIZ = new Gson();
        }
        return LIZ;
    }

    public static String LIZJ(Object obj) {
        return GsonProtectorUtils.toJson(LIZIZ(), obj);
    }

    public static <T> T LIZ(String str, Class<T> cls) {
        return (T) GsonProtectorUtils.fromJson(LIZIZ(), str, (Class) cls);
    }

    public static List LIZLLL(Class cls, String str) {
        Object[] objArr = (Object[]) GsonProtectorUtils.fromJson(LIZIZ(), str, cls);
        if (objArr == null) {
            return new ArrayList();
        }
        return new ArrayList(Arrays.asList(objArr));
    }
}
