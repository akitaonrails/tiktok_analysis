package X;

import android.content.Context;

/* JADX INFO: renamed from: X.0Vtz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C812450Vtz {
    public static final C812450Vtz LIZIZ = new C812450Vtz();
    public C812460Vu0 LIZ;

    public static C812460Vu0 LIZ(Context context) {
        C812460Vu0 c812460Vu0;
        C812450Vtz c812450Vtz = LIZIZ;
        synchronized (c812450Vtz) {
            if (c812450Vtz.LIZ == null) {
                if (C786410Ut5.N3(context) != null) {
                    context = C786410Ut5.N3(context);
                }
                c812450Vtz.LIZ = new C812460Vu0(context);
            }
            c812460Vu0 = c812450Vtz.LIZ;
        }
        return c812460Vu0;
    }
}
