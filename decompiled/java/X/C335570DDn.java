package X;

import android.content.Intent;
import android.os.Build;
import java.io.Serializable;

/* JADX INFO: renamed from: X.0DDn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C335570DDn {
    public static final <T extends Serializable> T LIZ(Intent intent, String str, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 33) {
            return (T) intent.getSerializableExtra(str, cls);
        }
        T t = (T) intent.getSerializableExtra(str);
        if (t instanceof Serializable) {
            return t;
        }
        return null;
    }
}
