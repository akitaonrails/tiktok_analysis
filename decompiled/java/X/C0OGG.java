package X;

import android.content.Context;

/* JADX INFO: renamed from: X.0OGG, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OGG {
    public static <T extends AbstractC796540VMm> C796500VMi<T> LIZ(Context context, Class<T> cls, String str) {
        if (str != null && str.trim().length() != 0) {
            return new C796500VMi<>(context, cls, str);
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
    }
}
