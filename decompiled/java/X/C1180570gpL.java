package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.ContextThemeWrapper;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0gpL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1180570gpL {
    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03d9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.drawable.Drawable LIZ(X.C1180560gpK r12, X.EnumC1177510gkP r13) {
        /*
            Method dump skipped, instruction units count: 1004
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1180570gpL.LIZ(X.0gpK, X.0gkP):android.graphics.drawable.Drawable");
    }

    public static Drawable LIZIZ(C1180560gpK c1180560gpK, EnumC1177510gkP enumC1177510gkP) {
        Integer first;
        Integer first2;
        Integer second;
        Integer first3;
        Context contextLIZJ = LIZJ(c1180560gpK.LIZ, enumC1177510gkP);
        Integer second2 = null;
        if (contextLIZJ == null) {
            return null;
        }
        if (C1177500gkO.LIZ[c1180560gpK.LIZIZ.ordinal()] == 1) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.zq);
            Pair<Integer, Integer> pair = c1180560gpK.LIZLLL;
            if (pair != null) {
                first2 = pair.getFirst();
            } else {
                first2 = null;
            }
            Pair<Integer, Integer> pair2 = c1180560gpK.LIZLLL;
            if (pair2 != null) {
                second = pair2.getSecond();
            } else {
                second = null;
            }
            LIZLLL(c384050F3z, first2, second);
            LJ(c384050F3z, c1180560gpK.LIZJ);
            Drawable drawableLIZ = c384050F3z.LIZ(contextLIZJ);
            C384050F3z c384050F3z2 = new C384050F3z();
            c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a03);
            Pair<Integer, Integer> pair3 = c1180560gpK.LIZLLL;
            if (pair3 != null) {
                first3 = pair3.getFirst();
            } else {
                first3 = null;
            }
            Pair<Integer, Integer> pair4 = c1180560gpK.LIZLLL;
            if (pair4 != null) {
                second2 = pair4.getSecond();
            }
            LIZLLL(c384050F3z2, first3, second2);
            c384050F3z2.LJFF = Integer.valueOf(R.attr.a03);
            c384050F3z2.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))));
            LJ(c384050F3z2, c1180560gpK.LIZJ);
            return new LayerDrawable(new Drawable[]{drawableLIZ, c384050F3z2.LIZ(contextLIZJ)});
        }
        C384050F3z c384050F3z3 = new C384050F3z();
        c384050F3z3.LIZIZ = Integer.valueOf(R.attr.a03);
        c384050F3z3.LJFF = Integer.valueOf(R.attr.a03);
        c384050F3z3.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))));
        Pair<Integer, Integer> pair5 = c1180560gpK.LIZLLL;
        if (pair5 != null) {
            first = pair5.getFirst();
        } else {
            first = null;
        }
        Pair<Integer, Integer> pair6 = c1180560gpK.LIZLLL;
        if (pair6 != null) {
            second2 = pair6.getSecond();
        }
        LIZLLL(c384050F3z3, first, second2);
        LJ(c384050F3z3, c1180560gpK.LIZJ);
        return c384050F3z3.LIZ(contextLIZJ);
    }

    public static Context LIZJ(Context context, EnumC1177510gkP enumC1177510gkP) {
        if (enumC1177510gkP == null) {
            return context;
        }
        int i = C1177500gkO.LIZIZ[enumC1177510gkP.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return new ContextThemeWrapper(context, R.style.y0);
            }
            throw new C1954807lC();
        }
        return new ContextThemeWrapper(context, R.style.y3);
    }

    public static void LJ(C384050F3z c384050F3z, C1180580gpM c1180580gpM) {
        if (c1180580gpM == null) {
            return;
        }
        Float f = c1180580gpM.LJ;
        if (f != null) {
            c384050F3z.LIZJ = f;
            return;
        }
        c384050F3z.LJIIIIZZ = c1180580gpM.LIZIZ;
        c384050F3z.LJIIIZ = c1180580gpM.LIZLLL;
        c384050F3z.LJIIJ = c1180580gpM.LIZ;
        c384050F3z.LJIIJJI = c1180580gpM.LIZJ;
    }

    public static void LIZLLL(C384050F3z c384050F3z, Integer num, Integer num2) {
        if (num != null && C08A4.LIZ(Integer.valueOf(num.intValue()))) {
            c384050F3z.LJII = num.intValue();
        }
        if (num2 != null && C08A4.LIZ(Integer.valueOf(num2.intValue()))) {
            c384050F3z.LJI = num2.intValue();
        }
    }
}
