package X;

import android.content.Context;

/* JADX INFO: renamed from: X.1BZ3, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BZ3 {
    public static C1BLY LIZ(Context context) {
        C1BZ0 c1bz0;
        synchronized (C1BZ9.class) {
            if (C1BZ9.LIZ == null) {
                Context contextN3 = C786410Ut5.N3(context);
                if (contextN3 != null) {
                    context = contextN3;
                }
                C1BZ9.LIZ = new C1BZ0(new C1BZ8(context));
            }
            c1bz0 = C1BZ9.LIZ;
        }
        return (C1BLY) c1bz0.LIZ.zza();
    }
}
