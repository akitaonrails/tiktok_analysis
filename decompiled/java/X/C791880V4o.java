package X;

import Y.ARunnableS113S0100000_13;
import Y.ARunnableS84S0000000_4;
import Y.ARunnableS92S0000000_13;
import android.content.Context;
import com.bytedance.apm.internal.ApmDelegate;

/* JADX INFO: renamed from: X.0V4o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C791880V4o {
    public static void LIZ(Context context) {
        ApmDelegate apmDelegate = C788700Uwm.LIZ;
        apmDelegate.getClass();
        C791980V4y c791980V4y = new C791980V4y();
        C791890V4p c791890V4p = apmDelegate.LLILLJJLI;
        if (c791890V4p != null) {
            c791980V4y.LIZ = c791890V4p.LIZIZ;
            c791980V4y.LIZIZ = c791890V4p.LIZ;
            c791980V4y.LIZJ = c791890V4p.LIZLLL;
            c791980V4y.LIZLLL = c791890V4p.LIZJ;
        }
        apmDelegate.LIZJ(context, new C791950V4v(c791980V4y));
        if (C792400V6o.LIZJ) {
            C0VD9.LIZ().LIZIZ(new ARunnableS84S0000000_4(15));
        }
    }

    public static void LIZIZ(C791930V4t c791930V4t) {
        ApmDelegate apmDelegate = C788700Uwm.LIZ;
        apmDelegate.getClass();
        C792400V6o.LJIIIIZZ();
        if (apmDelegate.LLIZLLLIL) {
            if (!apmDelegate.LLJ) {
                C791820V4i c791820V4i = C787900UvU.LIZ;
                c791820V4i.LIZIZ = true;
                if (!c791820V4i.LJFF.isEmpty()) {
                    c791820V4i.LJFF(c791820V4i.LIZLLL);
                    c791820V4i.LJ(c791820V4i.LIZLLL);
                }
                if (!c791820V4i.LJI.isEmpty()) {
                    c791820V4i.LJFF(c791820V4i.LJ);
                    c791820V4i.LJ(c791820V4i.LJ);
                }
                apmDelegate.LLJ = true;
                apmDelegate.LLILLL = c791930V4t;
                c791820V4i.LIZJ(new ARunnableS113S0100000_13(apmDelegate, 57));
            }
            if (C792400V6o.LIZJ) {
                C0VD9.LIZ().LIZIZ(new ARunnableS92S0000000_13(57));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("You must call Apm.getInstance().init() on Application.onCreate from version 5.x.x, pls call init() before start().");
    }
}
