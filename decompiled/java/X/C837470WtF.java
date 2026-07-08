package X;

import android.content.Context;

/* JADX INFO: renamed from: X.0WtF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C837470WtF {
    public static InterfaceC812720VuQ LIZ(Context context) {
        C837460WtE c837460WtE;
        synchronized (C837500WtI.class) {
            if (C837500WtI.LIZ == null) {
                Context contextN3 = C786410Ut5.N3(context);
                if (contextN3 != null) {
                    context = contextN3;
                }
                C837500WtI.LIZ = new C837460WtE(context);
            }
            c837460WtE = C837500WtI.LIZ;
        }
        return (InterfaceC812720VuQ) c837460WtE.LIZ.a();
    }
}
