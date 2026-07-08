package X;

import android.os.Build;
import android.os.Bundle;
import java.io.Serializable;

/* JADX INFO: renamed from: X.0DCF, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DCF {
    public static final <T extends Serializable> T LIZ(Bundle bundle, String str, Class<T> cls) {
        if (bundle == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            return (T) bundle.getSerializable(str, cls);
        }
        T t = (T) bundle.getSerializable(str);
        if (!(t instanceof Serializable)) {
            return null;
        }
        return t;
    }
}
