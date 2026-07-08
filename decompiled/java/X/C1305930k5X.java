package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0k5X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1305930k5X {
    public static final Object LIZ(String str, C1BRD<?, ?> c1brd) {
        Type genericSuperclass = c1brd.getClass().getGenericSuperclass();
        if (genericSuperclass != null) {
            Type type = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
            if (Intrinsics.LJFF(type, JSONObject.class) || ((type instanceof Class) && JSONObject.class.isAssignableFrom((Class) type))) {
                return new JSONObject(str);
            }
            return GsonProtectorUtils.fromJson(C19748512Ol.LIZIZ, str, type);
        }
        throw new IllegalStateException("Method is not parameterized?!");
    }
}
