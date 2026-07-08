package X;

import android.content.Context;

/* JADX INFO: renamed from: X.0WBR, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WBR {
    public static C0WBP<?> LIZ(String str, String str2) {
        C0WBV c0wbv = new C0WBV(str, str2);
        C0WBQ c0wbqLIZ = C0WBP.LIZ(AbstractC819100WBg.class);
        c0wbqLIZ.LIZLLL = 1;
        c0wbqLIZ.LJ = new C819110WBh(c0wbv);
        return c0wbqLIZ.LIZIZ();
    }

    public static C0WBP<?> LIZIZ(final String str, final InterfaceC819050WBb<Context> interfaceC819050WBb) {
        C0WBQ c0wbqLIZ = C0WBP.LIZ(AbstractC819100WBg.class);
        c0wbqLIZ.LIZLLL = 1;
        c0wbqLIZ.LIZ(C0WBG.LIZ(Context.class));
        c0wbqLIZ.LJ = new C0WBM() { // from class: X.0WBY
            @Override // X.C0WBM
            public final Object LIZ(C0WBH c0wbh) {
                return new C0WBV(str, interfaceC819050WBb.LIZ(c0wbh.LIZIZ(Context.class)));
            }
        };
        return c0wbqLIZ.LIZIZ();
    }
}
