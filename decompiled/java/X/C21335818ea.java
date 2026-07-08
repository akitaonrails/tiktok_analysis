package X;

import android.graphics.Typeface;
import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import kotlin.jvm.internal.AwS159S0400000_32;

/* JADX INFO: renamed from: X.18ea, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21335818ea {
    public static final /* synthetic */ int LJIILLIIL = 0;
    public CharSequence LIZ;
    public int LIZJ;
    public TextUtils.TruncateAt LIZLLL;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public Integer LJIIJJI;
    public Layout LJIIL;
    public Integer LJIILIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public TextPaint LIZIZ = new TextPaint(1);
    public int LJ = 1;
    public Layout.Alignment LJII = Layout.Alignment.ALIGN_NORMAL;

    public final void LIZLLL() {
        this.LJIIL = null;
        this.LJIIJJI = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0096 A[LOOP:0: B:32:0x005b->B:52:0x0096, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ae A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.text.Layout LIZIZ() {
        /*
            r20 = this;
            r2 = r20
            android.text.Layout r0 = r2.LJIIL
            if (r0 == 0) goto L7
            return r0
        L7:
            int r9 = r2.LIZJ
            if (r9 >= 0) goto Lc
            r9 = 0
        Lc:
            java.lang.CharSequence r0 = r2.LIZ
            r1 = 1
            if (r0 == 0) goto L1c
            int r0 = r0.length()
            if (r0 == 0) goto L1c
            r3 = 0
        L18:
            r0 = 0
            if (r3 == 0) goto L1e
            return r0
        L1c:
            r3 = 1
            goto L18
        L1e:
            java.lang.CharSequence r7 = r2.LIZ
            int r6 = r2.LJ
            if (r6 != r1) goto L33
            boolean r3 = r2.LJIIIZ
            if (r3 != 0) goto L3e
            boolean r3 = r2.LJIIJ
            if (r3 != 0) goto L3e
            android.text.TextPaint r3 = r2.LIZIZ     // Catch: java.lang.NullPointerException -> L35
            android.text.BoringLayout$Metrics r13 = android.text.BoringLayout.isBoring(r7, r3)     // Catch: java.lang.NullPointerException -> L35
            goto L3f
        L33:
            r13 = r0
            goto L3f
        L35:
            r4 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r4)
            java.lang.String r3 = "MynaTextLayoutBuilder#isBoringLayout happen an exception"
            X.C1325860kbg.LJFF(r4, r3)
        L3e:
            r13 = r0
        L3f:
            if (r13 == 0) goto L5b
            android.text.TextPaint r8 = r2.LIZIZ     // Catch: java.lang.Throwable -> L53
            android.text.Layout$Alignment r10 = r2.LJII     // Catch: java.lang.Throwable -> L53
            r11 = 1065353216(0x3f800000, float:1.0)
            r12 = 0
            boolean r14 = r2.LJI     // Catch: java.lang.Throwable -> L53
            android.text.TextUtils$TruncateAt r15 = r2.LIZLLL     // Catch: java.lang.Throwable -> L53
            r16 = r9
            android.text.BoringLayout r0 = android.text.BoringLayout.make(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L53
            goto Lb1
        L53:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)
            LIZ(r2, r3)
            goto Lb1
        L5b:
            if (r7 != 0) goto L60
            java.lang.String r10 = ""
            goto L61
        L60:
            r10 = r7
        L61:
            if (r7 == 0) goto L64
            goto L66
        L64:
            r11 = 0
            goto L6a
        L66:
            int r11 = r7.length()     // Catch: java.lang.IndexOutOfBoundsException -> L8d java.lang.Throwable -> La6
        L6a:
            android.text.TextPaint r12 = r2.LIZIZ     // Catch: java.lang.IndexOutOfBoundsException -> L8d java.lang.Throwable -> La6
            android.text.Layout$Alignment r14 = r2.LJII     // Catch: java.lang.IndexOutOfBoundsException -> L8d java.lang.Throwable -> La6
            boolean r5 = r2.LJI     // Catch: java.lang.IndexOutOfBoundsException -> L8d java.lang.Throwable -> La6
            boolean r3 = r2.LJIIJ     // Catch: java.lang.IndexOutOfBoundsException -> L8d java.lang.Throwable -> La6
            if (r3 != 0) goto L79
            android.text.TextUtils$TruncateAt r4 = r2.LIZLLL     // Catch: java.lang.IndexOutOfBoundsException -> L8d java.lang.Throwable -> La6
        L76:
            boolean r3 = r2.LJFF     // Catch: java.lang.IndexOutOfBoundsException -> L8d java.lang.Throwable -> La6
            goto L7b
        L79:
            r4 = r0
            goto L76
        L7b:
            r6 = r6
            r13 = r9
            r15 = r5
            r16 = r4
            r17 = r9
            r18 = r6
            r19 = r3
            android.text.StaticLayout r0 = X.C431580Gw8.LIZ(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)     // Catch: java.lang.IndexOutOfBoundsException -> L8b java.lang.Throwable -> La6
            goto Lb1
        L8b:
            r5 = move-exception
            goto L8f
        L8d:
            r5 = move-exception
            r6 = r6
        L8f:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r5)
            boolean r3 = r7 instanceof java.lang.String
            if (r3 != 0) goto Lae
            kotlin.jvm.internal.AwS611S0100000_32 r4 = new kotlin.jvm.internal.AwS611S0100000_32
            r3 = 315(0x13b, float:4.41E-43)
            r4.<init>(r5, r3)
            X.C1168400gVi.LIZIZ(r4)
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r6 = r6
            goto L5b
        La6:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)
            LIZ(r2, r3)
            goto Lb1
        Lae:
            LIZ(r2, r5)
        Lb1:
            r2.LJIIIIZZ = r1
            r2.LJIIL = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21335818ea.LIZIZ():android.text.Layout");
    }

    public final void LJ() {
        if (this.LJIIIIZZ) {
            TextPaint textPaint = new TextPaint(this.LIZIZ);
            textPaint.set(this.LIZIZ);
            this.LIZIZ = textPaint;
            this.LJIIIIZZ = false;
        }
    }

    public final int LIZJ(int i) {
        Integer num = this.LJIIJJI;
        Integer num2 = this.LJIILIIL;
        if (num2 != null && i == num2.intValue() && num != null) {
            int iIntValue = (num.intValue() - this.LJIILJJIL) - this.LJIILL;
            if (this.LIZJ != iIntValue) {
                this.LIZJ = iIntValue;
                this.LJIIL = null;
            }
            return num.intValue();
        }
        this.LJIILIIL = Integer.valueOf(i);
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int i2 = this.LJIILJJIL;
        int i3 = this.LJIILL;
        CharSequence charSequence = this.LIZ;
        if (mode != 1073741824) {
            int iCeil = 0;
            if (charSequence != null && charSequence.length() != 0) {
                iCeil = (int) Math.ceil(Layout.getDesiredWidth(charSequence, this.LIZIZ));
            }
            int i4 = iCeil + i2 + i3;
            if (mode != Integer.MIN_VALUE || i4 <= size) {
                size = i4;
            }
        }
        int i5 = (size - this.LJIILJJIL) - this.LJIILL;
        if (this.LIZJ != i5) {
            this.LIZJ = i5;
            this.LJIIL = null;
        }
        this.LJIIJJI = Integer.valueOf(size);
        return size;
    }

    public static void LIZ(C21335818ea c21335818ea, Throwable th) {
        Integer numValueOf;
        Typeface typeface = c21335818ea.LIZIZ.getTypeface();
        if (Build.VERSION.SDK_INT >= 28 && typeface != null) {
            numValueOf = Integer.valueOf(typeface.getWeight());
        } else {
            numValueOf = null;
        }
        C1325860kbg.LIZIZ(th, new AwS159S0400000_32(c21335818ea, (BoringLayout.Metrics) null, typeface, numValueOf, 9), C2097608Jq.LJ());
    }
}
