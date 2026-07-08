package X;

import android.content.Context;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.06LR, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06LR {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(View view) {
        int iIntValue;
        Context context;
        Integer numLIZJ;
        if (view != null && (context = view.getContext()) != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a0c, context)) != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
            if (view != null) {
            }
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C06LN(iIntValue, view, null), 3);
        }
        view.setBackgroundColor(iIntValue);
        C1DFH c1dfh2 = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C06LN(iIntValue, view, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(long r4, android.content.Context r6) {
        /*
            float r0 = X.C10FS.LJ(r4)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r5 = 0
            X.0HZe r0 = X.C10FS.LIZ(r5, r0)
            java.lang.Object r4 = r0.getSecond()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r0.getThird()
            boolean r0 = kotlin.text.a0.LJJJIL(r4)
            r2 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L35
            if (r6 == 0) goto L32
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r1[r5] = r4
            r1[r2] = r3
            r0 = 2131830335(0x7f11263f, float:1.9293664E38)
            java.lang.String r0 = r6.getString(r0, r1)
        L30:
            if (r0 != 0) goto L34
        L32:
            java.lang.String r0 = ""
        L34:
            return r0
        L35:
            if (r6 == 0) goto L32
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r5] = r3
            r0 = 2131830336(0x7f112640, float:1.9293666E38)
            java.lang.String r0 = r6.getString(r0, r1)
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06LR.LIZ(long, android.content.Context):java.lang.String");
    }
}
