package X;

import android.os.Build;
import android.os.Bundle;

/* JADX INFO: renamed from: X.0Ikm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C475500Ikm {
    public static <T> T LIZ(Bundle bundle, String str, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) C475570Ikt.LIZ(bundle, str, cls);
        }
        T t = (T) bundle.getParcelable(str);
        if (!cls.isInstance(t)) {
            return null;
        }
        return t;
    }
}
