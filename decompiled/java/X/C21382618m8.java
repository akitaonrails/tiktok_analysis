package X;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: renamed from: X.18m8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21382618m8 extends C19JH<C1337120ktq> {
    public String LLLZI;
    public int LLLZIIL;
    public float LLLZIL;
    public int LLLZL;
    public int LLLZLL;
    public int LLLZLZ;
    public int LLLZZ;
    public int LLLZZIL;
    public TextUtils.TruncateAt LLZ;
    public TextUtils.TruncateAt LLZIL;
    public float LLZILL;
    public float LLZL;
    public int LLZLI;
    public boolean LLZLL;
    public float LLZLLIL;
    public float LLZLLLL;
    public float LLZZ;
    public float LLZZJLIL;
    public float LLZZLLIL;
    public float LLZZZIL;

    @Override // X.C19JH
    public final View LIZ() {
        C1337120ktq c1337120ktq = new C1337120ktq(this.LL);
        c1337120ktq.LL = this;
        return c1337120ktq;
    }

    @Override // X.C19JH
    public void LJIIZILJ() {
        super.LJIIZILJ();
        if (TextUtils.equals("null", this.LLLZI)) {
            this.LLLZI = "";
        }
        String str = this.LLLZI;
        this.LLLZI = str;
        if (!TextUtils.isEmpty(str)) {
            if (TextUtils.equals("null", str)) {
                this.LLLZI = "";
            }
            ((TextView) this.LLILZ).setText(this.LLLZI);
        }
        ((TextView) this.LLILZ).setTextSize(1, this.LLLZIL);
        ((TextView) this.LLILZ).setTextColor(this.LLLZIIL);
        ((TextView) this.LLILZ).setLines(this.LLLZLZ);
        ((TextView) this.LLILZ).setMaxLines(this.LLLZLL);
        ((TextView) this.LLILZ).setGravity(this.LLLZZ);
        ((TextView) this.LLILZ).setIncludeFontPadding(false);
        int i = this.LLLZZIL;
        this.LLLZZIL = i;
        if (i != Integer.MAX_VALUE) {
            ((TextView) this.LLILZ).setPaintFlags(i);
        }
        if (C1015570cXD.LIZ().LJ && C1100060ejU.LIZLLL(this.LL)) {
            this.LLILZ.setTextDirection(4);
        }
        if (this.LLIZLLLIL) {
            TextUtils.TruncateAt truncateAt = this.LLZIL;
            if (truncateAt != null) {
                ((TextView) this.LLILZ).setEllipsize(truncateAt);
            }
        } else {
            TextUtils.TruncateAt truncateAt2 = this.LLZ;
            if (truncateAt2 != null) {
                ((TextView) this.LLILZ).setEllipsize(truncateAt2);
            }
        }
        float f = this.LLZILL;
        if (f > 0.0f) {
            if (!this.LLIZLLLIL || f <= 3.0f) {
                ((TextView) this.LLILZ).setLineSpacing(0.0f, f);
            } else if (Build.VERSION.SDK_INT >= 28) {
                int iRound = Math.round(C1100060ejU.LIZ((f - (this.LLLZIL * 1.2f)) / 2.0f, this.LL));
                int paddingTop = this.LLILZ.getPaddingTop() + iRound;
                int paddingBottom = this.LLILZ.getPaddingBottom() + iRound;
                if (C1015570cXD.LIZ().LJ) {
                    TextView textView = (TextView) this.LLILZ;
                    textView.setPaddingRelative(textView.getPaddingStart(), paddingTop, this.LLILZ.getPaddingEnd(), paddingBottom);
                } else {
                    TextView textView2 = (TextView) this.LLILZ;
                    textView2.setPadding(textView2.getPaddingLeft(), paddingTop, this.LLILZ.getPaddingRight(), paddingBottom);
                }
                ((TextView) this.LLILZ).setLineHeight(Math.round(C1100060ejU.LIZ(this.LLZILL, this.LL)));
            }
        }
        ((TextView) this.LLILZ).setBreakStrategy(0);
        if (!this.LLIZLLLIL) {
            ((TextView) this.LLILZ).setShadowLayer(this.LLZZLLIL, this.LLZLLIL, this.LLZLLLL, this.LLZLI);
        } else if (this.LLZLL) {
            if (this.LLZZLLIL <= 0.0f) {
                this.LLZZLLIL = 1.0E-5f;
            }
            ((TextView) this.LLILZ).setShadowLayer(this.LLZZLLIL, this.LLZZ, this.LLZZJLIL, this.LLZLI);
        }
        int i2 = this.LLLZL;
        if (i2 == 1) {
            ((TextView) this.LLILZ).setTypeface(Typeface.DEFAULT, i2);
        } else if (Build.VERSION.SDK_INT >= 28) {
            ((TextView) this.LLILZ).setTypeface(Typeface.create(Typeface.DEFAULT, (int) this.LLZL, i2 == 2));
        } else if (this.LLZL >= 500.0f) {
            ((TextView) this.LLILZ).setTypeface(Typeface.DEFAULT, 1);
        }
        if (C1100060ejU.LIZ(this.LLLZIL, this.LL) > 0.0f) {
            ((TextView) this.LLILZ).setLetterSpacing(this.LLZZZIL / C1100060ejU.LIZ(this.LLLZIL, this.LL));
        }
    }

    public C21382618m8(Context context) {
        super(context);
        this.LLLZIIL = -16777216;
        this.LLLZIL = 12.0f;
        this.LLLZLL = Integer.MAX_VALUE;
        this.LLLZZ = 8388611;
        this.LLZIL = TextUtils.TruncateAt.END;
        this.LLZILL = -1.0f;
        this.LLZL = 400.0f;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0135  */
    @Override // X.C19JH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJIJ(java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21382618m8.LJIJ(java.lang.String, java.lang.String):void");
    }
}
