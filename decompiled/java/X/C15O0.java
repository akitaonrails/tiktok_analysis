package X;

import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15O0, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15O0 {
    public static void LIZ(Class cls, LinkedHashSet linkedHashSet) {
        for (Class<?> cls2 : cls.getInterfaces()) {
            if (!Intrinsics.LJFF(cls2, C05YF.class) && !Intrinsics.LJFF(cls2, C0F1T.class) && !C15O1.class.isAssignableFrom(cls2) && C05YF.class.isAssignableFrom(cls2)) {
                linkedHashSet.add(cls2);
                LIZ(cls2, linkedHashSet);
            }
        }
    }
}
