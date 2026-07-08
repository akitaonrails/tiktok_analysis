package X;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.12FV, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12FV {
    public static final C12FV LIZ = new C12FV();
    public static final int LIZIZ;
    public static final int LIZJ;
    public static final int LIZLLL;
    public static final float LJ;

    static {
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        LIZIZ = C12ES.LJIIJ(abstractC1387200mCcLJ != null ? abstractC1387200mCcLJ.LIZIZ() : null);
        AbstractC1387200mCc abstractC1387200mCcLJ2 = C1906580ziK.LJ();
        LIZJ = C12ES.LJIIIIZZ(abstractC1387200mCcLJ2 != null ? abstractC1387200mCcLJ2.LIZIZ() : null);
        AbstractC1387200mCc abstractC1387200mCcLJ3 = C1906580ziK.LJ();
        LIZLLL = (int) C12ES.LIZJ(30.0f, abstractC1387200mCcLJ3 != null ? abstractC1387200mCcLJ3.LIZIZ() : null);
        AbstractC1387200mCc abstractC1387200mCcLJ4 = C1906580ziK.LJ();
        LJ = C12ES.LIZJ(16.0f, abstractC1387200mCcLJ4 != null ? abstractC1387200mCcLJ4.LIZIZ() : null);
    }

    public static void LIZIZ(Canvas canvas) {
        Activity activityLIZIZ;
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ != null) {
            activityLIZIZ = abstractC1387200mCcLJ.LIZIZ();
        } else {
            activityLIZIZ = null;
        }
        View viewSd = C786410Ut5.Sd(R.layout.for_res_0x7f0d2162, C786410Ut5.ne(activityLIZIZ), null);
        int i = LIZIZ;
        C786410Ut5.W5(viewSd, new ViewGroup.LayoutParams(i, -2));
        viewSd.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(LIZJ, Integer.MIN_VALUE));
        viewSd.layout(0, 0, viewSd.getMeasuredWidth(), viewSd.getMeasuredHeight());
        canvas.drawBitmap(C19724012Fa.LIZ(viewSd, Bitmap.Config.ARGB_8888), (i - r2.getWidth()) / 2.0f, LJ, (Paint) null);
    }

    public static Bitmap LIZJ(String str) {
        Activity activityLIZIZ;
        int i;
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ != null) {
            activityLIZIZ = abstractC1387200mCcLJ.LIZIZ();
        } else {
            activityLIZIZ = null;
        }
        View viewSd = C786410Ut5.Sd(R.layout.fos, C786410Ut5.ne(activityLIZIZ), null);
        TextView textView = (TextView) viewSd.findViewById(R.id.c_r);
        if (textView != null) {
            textView.setText(str);
        }
        TuxIconView tuxIconView = (TuxIconView) viewSd.findViewById(R.id.bh2);
        if (tuxIconView != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            if (C0QSF.LIZ()) {
                i = C14TF.LIZIZ.LJJLIIIJ().LJIIIIZZ(false).LIZ;
            } else {
                i = R.raw.icon_tako_new;
            }
            c419910GdJ.LIZ = i;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
            tuxIconView.setTuxIcon(c419910GdJ);
        }
        int i2 = LIZIZ;
        C786410Ut5.W5(viewSd, new ViewGroup.LayoutParams(i2, -2));
        viewSd.measure(View.MeasureSpec.makeMeasureSpec(i2, 1073741824), View.MeasureSpec.makeMeasureSpec(LIZJ, Integer.MIN_VALUE));
        viewSd.layout(0, 0, viewSd.getMeasuredWidth(), viewSd.getMeasuredHeight());
        return C19724012Fa.LIZ(viewSd, Bitmap.Config.ARGB_8888);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(com.ss.android.ugc.aweme.tako.model.AIBotInfo r9, X.InterfaceC1364105Vn<? super android.graphics.Bitmap> r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C12FU
            if (r0 == 0) goto L5f
            r7 = r10
            X.12FU r7 = (X.C12FU) r7
            int r2 = r7.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5f
            int r2 = r2 - r1
            r7.LLILZ = r2
        L12:
            java.lang.Object r2 = r7.LLILLJJLI
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILZ
            r5 = 2
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L27
            if (r0 == r3) goto L44
            if (r0 != r5) goto L65
            X.C155000ia.LIZIZ(r2)
        L26:
            return r2
        L27:
            X.C155000ia.LIZIZ(r2)
            if (r9 == 0) goto L6d
            java.lang.String r2 = r9.bgUrl
            if (r2 == 0) goto L6d
            java.lang.String[] r1 = new java.lang.String[r3]
            r0 = 0
            r1[r0] = r2
            java.util.List r0 = X.C1697810uHb.LJIILJJIL(r1)
            r7.LL = r9
            r7.LLILZ = r3
            java.lang.Object r2 = X.C339320DRy.LIZ(r0, r7)
            if (r2 != r6) goto L49
            return r6
        L44:
            com.ss.android.ugc.aweme.tako.model.AIBotInfo r9 = r7.LL
            X.C155000ia.LIZIZ(r2)
        L49:
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            if (r2 == 0) goto L6d
            X.1DFB r1 = X.C0PEM.LIZJ
            X.12FT r0 = new X.12FT
            r0.<init>(r2, r9, r4)
            r7.LL = r4
            r7.LLILZ = r5
            java.lang.Object r2 = X.C23250099c.LJI(r7, r1, r0)
            if (r2 != r6) goto L26
            return r6
        L5f:
            X.12FU r7 = new X.12FU
            r7.<init>(r8, r10)
            goto L12
        L65:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L6d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12FV.LIZ(com.ss.android.ugc.aweme.tako.model.AIBotInfo, X.05Vn):java.lang.Object");
    }
}
