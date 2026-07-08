package X;

import android.os.Bundle;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0Ikt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C475570Ikt {
    public static <T> T LIZ(Bundle bundle, String str, Class<T> cls) {
        return (T) bundle.getParcelable(str, cls);
    }

    public static <T> T[] LIZIZ(Bundle bundle, String str, Class<T> cls) {
        return (T[]) bundle.getParcelableArray(str, cls);
    }

    public static <T> ArrayList<T> LIZJ(Bundle bundle, String str, Class<? extends T> cls) {
        return bundle.getParcelableArrayList(str, cls);
    }

    public static <T extends Serializable> T LIZLLL(Bundle bundle, String str, Class<T> cls) {
        return (T) bundle.getSerializable(str, cls);
    }

    public static <T> SparseArray<T> LJ(Bundle bundle, String str, Class<? extends T> cls) {
        return bundle.getSparseParcelableArray(str, cls);
    }
}
