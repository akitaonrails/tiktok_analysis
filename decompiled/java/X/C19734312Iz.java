package X;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.12Iz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19734312Iz {
    public static Drawable LIZ(float f, int i, Context context, boolean z) {
        int color = context.getResources().getColor(i);
        if (z) {
            C1643380sro c1643380sro = new C1643380sro();
            c1643380sro.LIZLLL(1);
            c1643380sro.LIZIZ(color);
            c1643380sro.LJ(color, 0);
            return c1643380sro.LIZ();
        }
        C1643380sro c1643380sro2 = new C1643380sro();
        c1643380sro2.LIZLLL(0);
        c1643380sro2.LIZIZ(color);
        c1643380sro2.LIZJ(C11VU.LIZIZ(f, context));
        c1643380sro2.LJ(color, 0);
        return c1643380sro2.LIZ();
    }
}
