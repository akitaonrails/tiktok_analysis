package X;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import com.bytedance.tux.drawable.TuxIconDrawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0SHm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C718800SHm {
    public final CharSequence LIZ;
    public float LIZIZ;
    public CharSequence LIZLLL;
    public CharSequence LJ;
    public boolean LJI;
    public C0SJA LJII;
    public Integer LJIIIIZZ;
    public Integer LJIIIZ;
    public TuxIconDrawable LJIIJ;
    public boolean LJIIJJI;
    public Integer LJIIL;
    public Function0<? extends Object> LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public boolean LJIJ;
    public boolean LJIJI;
    public int LIZJ = Integer.MAX_VALUE;
    public int LJFF = Integer.MAX_VALUE;
    public final C01GW LJIJJ = C452501pT.LIZIZ(new C719010SIh(this));

    public final C718810SHn LJFF() {
        return (C718810SHn) this.LJIJJ.getValue();
    }

    public C718800SHm(CharSequence charSequence) {
        this.LIZ = charSequence;
    }

    public static int LJ(Layout layout) {
        int lineCount = layout.getLineCount();
        if (lineCount == 0) {
            return 0;
        }
        int i = lineCount - 1;
        return layout.getLineEnd(i) - layout.getLineStart(i);
    }

    public final void LIZLLL(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.LIZIZ = f;
    }

    public final void LJI(int i) {
        if (i < 1) {
            i = 1;
        }
        this.LIZJ = i;
    }

    public final void LJIIIIZZ(int i) {
        this.LJIIIIZZ = Integer.valueOf(i);
    }

    public final void LJIIIZ(int i) {
        this.LJIIIZ = Integer.valueOf(i);
    }

    public static SpannableStringBuilder LJIIJ(Spanned spanned, int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(new SpannableString(spanned.toString()).subSequence(0, i));
        C089E c089e = new C089E(spanned.getSpans(0, spanned.length(), Object.class));
        while (c089e.hasNext()) {
            Object next = c089e.next();
            int spanStart = spanned.getSpanStart(next);
            int i2 = i - 1;
            if (spanStart > i2) {
                spanStart = i2;
            }
            int spanEnd = spanned.getSpanEnd(next);
            if (spanEnd <= i2) {
                i2 = spanEnd;
            }
            int spanFlags = spanned.getSpanFlags(next);
            if (spanStart < i2) {
                C786410Ut5.q2(spannableStringBuilder, next, spanStart, i2, spanFlags);
            }
        }
        return spannableStringBuilder;
    }

    public final void LJII(int i, SpannableStringBuilder spannableStringBuilder) {
        Object objInvoke;
        Function0<? extends Object> function0 = this.LJIILIIL;
        if (function0 != null && (objInvoke = function0.invoke()) != null) {
            C786410Ut5.q2(spannableStringBuilder, objInvoke, i, spannableStringBuilder.length(), 33);
        }
    }

    public final void LIZ(SpannableStringBuilder spannableStringBuilder, int i, Function1<Object, Unit> function1) {
        int iIntValue;
        Object c444920HcY;
        Integer num = this.LJIIIZ;
        if (num != null) {
            int iIntValue2 = num.intValue();
            if (function1 == null) {
                c444920HcY = new C444920HcY(iIntValue2, true);
            } else {
                C0HD1 c0hd1 = new C0HD1(iIntValue2, (Object) null, 6);
                c0hd1.LLILZ = function1;
                c444920HcY = c0hd1;
            }
            C786410Ut5.q2(spannableStringBuilder, c444920HcY, i, spannableStringBuilder.length(), 33);
        }
        Integer num2 = this.LJIIIIZZ;
        if (num2 != null) {
            C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(num2.intValue()), i, spannableStringBuilder.length(), 33);
        }
        TuxIconDrawable tuxIconDrawable = this.LJIIJ;
        if (tuxIconDrawable != null) {
            tuxIconDrawable.setBounds(0, 0, tuxIconDrawable.LIZJ(), tuxIconDrawable.LIZIZ());
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(" ");
            C419890GdH c419890GdH = new C419890GdH(tuxIconDrawable, 2);
            boolean z = this.LJIIJJI;
            Integer num3 = this.LJIIL;
            if (num3 != null) {
                iIntValue = num3.intValue();
            } else {
                iIntValue = 0;
            }
            c419890GdH.LIZIZ(iIntValue, 0, z);
            C786410Ut5.q2(spannableStringBuilder, c419890GdH, length, spannableStringBuilder.length(), 33);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x024a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.text.Layout LJIIJJI(X.C444830HcP r23, android.text.Layout r24, boolean r25) {
        /*
            Method dump skipped, instruction units count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C718800SHm.LJIIJJI(X.0HcP, android.text.Layout, boolean):android.text.Layout");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.text.Layout LIZIZ(X.C444830HcP r12, android.text.Layout r13, float r14, kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> r15) {
        /*
            Method dump skipped, instruction units count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C718800SHm.LIZIZ(X.0HcP, android.text.Layout, float, kotlin.jvm.functions.Function1):android.text.Layout");
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x039a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C719090SIp LIZJ(X.C718800SHm r26, X.C444830HcP r27, android.text.Layout r28, java.util.List r29, int r30) {
        /*
            Method dump skipped, instruction units count: 1173
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C718800SHm.LIZJ(X.0SHm, X.0HcP, android.text.Layout, java.util.List, int):X.0SIp");
    }
}
