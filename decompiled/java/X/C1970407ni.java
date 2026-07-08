package X;

import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07ni, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1970407ni {
    public static final /* synthetic */ int LIZ = 0;

    public static Field LIZ(Object obj, String str) {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            for (Field field : superclass.getDeclaredFields()) {
                if (Intrinsics.LJFF(field.getName(), str)) {
                    field.setAccessible(true);
                    return field;
                }
            }
        }
        return null;
    }
}
