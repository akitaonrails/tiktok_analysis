package X;

import android.content.Intent;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0LEJ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LEJ {
    public static <T> T[] LIZ(Intent intent, String str, Class<T> cls) {
        return (T[]) intent.getParcelableArrayExtra(str, cls);
    }

    public static <T> ArrayList<T> LIZIZ(Intent intent, String str, Class<? extends T> cls) {
        return intent.getParcelableArrayListExtra(str, cls);
    }

    public static <T> T LIZJ(Intent intent, String str, Class<T> cls) {
        return (T) intent.getParcelableExtra(str, cls);
    }

    public static <T extends Serializable> T LIZLLL(Intent intent, String str, Class<T> cls) {
        return (T) intent.getSerializableExtra(str, cls);
    }
}
