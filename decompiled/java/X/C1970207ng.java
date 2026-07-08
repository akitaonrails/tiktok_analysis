package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.android.widget.Widget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: renamed from: X.07ng, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1970207ng {
    public static void LIZ(Object obj) {
        if (!(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Double) && !(obj instanceof Boolean) && !(obj instanceof Character) && !(obj instanceof CharSequence) && !(obj instanceof String) && !(obj instanceof C474500IjA)) {
            if (!(obj instanceof Widget) && !(obj instanceof Fragment) && !(obj instanceof Context) && !(obj instanceof DataChannel) && !(obj instanceof Activity)) {
                if (obj instanceof List) {
                    for (Object obj2 : (Iterable) obj) {
                        if (obj2 != null) {
                            boolean z = C08SQ.LIZ;
                            LIZ(obj2);
                        }
                    }
                    return;
                }
                if (obj instanceof Map) {
                    Map map = (Map) obj;
                    for (Object obj3 : map.values()) {
                        if (obj3 != null) {
                            boolean z2 = C08SQ.LIZ;
                            LIZ(obj3);
                        }
                    }
                    for (Object obj4 : map.keySet()) {
                        if (obj4 != null) {
                            boolean z3 = C08SQ.LIZ;
                            LIZ(obj4);
                        }
                    }
                    return;
                }
                int i = 0;
                if (obj instanceof Object[]) {
                    Object[] objArr = (Object[]) obj;
                    int length = objArr.length;
                    while (i < length) {
                        Object obj5 = objArr[i];
                        if (obj5 != null) {
                            boolean z4 = C08SQ.LIZ;
                            LIZ(obj5);
                        }
                        i++;
                    }
                    return;
                }
                if (obj instanceof Set) {
                    for (Object obj6 : (Iterable) obj) {
                        if (obj6 != null) {
                            boolean z5 = C08SQ.LIZ;
                            LIZ(obj6);
                        }
                    }
                    return;
                }
                if (obj != null) {
                    Field[] declaredFields = obj.getClass().getDeclaredFields();
                    int iLIZIZ = C2097908Jt.LIZIZ(declaredFields.length);
                    if (iLIZIZ < 16) {
                        iLIZIZ = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
                    int length2 = declaredFields.length;
                    while (i < length2) {
                        Field field = declaredFields[i];
                        field.setAccessible(true);
                        boolean z6 = C08SQ.LIZ;
                        LIZ(field.get(obj));
                        Pair pair = new Pair(field.getName(), field.get(obj));
                        linkedHashMap.put(pair.getFirst(), pair.getSecond());
                        i++;
                    }
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("params can not contain widget or fragment");
        }
    }
}
