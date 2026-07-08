package X;

import java.util.List;

/* JADX INFO: renamed from: X.09R3, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09R3 {
    public static String LIZ(C09B3 c09b3) {
        String string = c09b3.getClass().getGenericInterfaces()[0].toString();
        if (string.startsWith("kotlin.jvm.functions.")) {
            return string.substring(21);
        }
        return string;
    }

    public static C13JW LIZIZ(C19719912Dl c19719912Dl, List list, boolean z) {
        return new C13JW(c19719912Dl, list, null, z ? 1 : 0);
    }
}
