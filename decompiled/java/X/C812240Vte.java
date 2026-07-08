package X;

import com.bytedance.mt.protector.impl.PatternProtector;

/* JADX INFO: renamed from: X.0Vte, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C812240Vte {
    static {
        PatternProtector.compile("\\$\\{(.*?)\\}");
    }

    public static boolean LIZ(String str) {
        if (str != null && !str.trim().isEmpty()) {
            return false;
        }
        return true;
    }
}
