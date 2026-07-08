package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.tako.ITakoService;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0Qzm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C688640Qzm extends TuxTextView {
    public int LLJJJJ;
    public CharSequence LLJJJJJIL;
    public CharSequence LLJJJJLIIL;
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public final C01GW LLJLIL;
    public boolean LLJLILLLLZIIL;
    public boolean LLJLL;

    private final ITakoService getTakoService() {
        return (ITakoService) this.LLJLIL.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence LJJJJLI(boolean r12) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C688640Qzm.LJJJJLI(boolean):java.lang.CharSequence");
    }

    public final void setBingFold(boolean z) {
        this.LLJLL = z;
    }

    public final void setShowMaxLines(int i) {
        this.LLJJJJ = i;
    }

    public C688640Qzm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJL = true;
        this.LLJLIL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(785));
        this.LLJJJJ = 7;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.FoldTextView);
            this.LLJJJJ = typedArrayObtainStyledAttributes.getInt(R$styleable.FoldTextView_showMaxLine, 7);
            typedArrayObtainStyledAttributes.getColor(R$styleable.FoldTextView_tipColor, -1);
            typedArrayObtainStyledAttributes.recycle();
        }
        setMovementMethod(getTakoService().LJJJZ());
        setClickable(false);
        setLongClickable(false);
    }

    public final void LJJJJL(CharSequence charSequence, TextView.BufferType bufferType) {
        this.LLJJJJJIL = charSequence;
        Layout layout = getLayout();
        if (layout == null || !layout.getText().equals(this.LLJJJJJIL)) {
            super.setText(this.LLJJJJJIL, bufferType);
            layout = getLayout();
            if (layout == null) {
                C786410Ut5.x3(getViewTreeObserver(), new C0R4F(this, bufferType, 3));
                return;
            }
        }
        LJJJJLL(layout, bufferType);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJLL(android.text.Layout r12, android.widget.TextView.BufferType r13) {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C688640Qzm.LJJJJLL(android.text.Layout, android.widget.TextView$BufferType):void");
    }

    @Override // com.bytedance.tux.input.TuxTextView, android.widget.TextView
    public final void setText(final CharSequence charSequence, final TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        if (!TextUtils.isEmpty(charSequence) && this.LLJJJJ != 0 && this.LLJL) {
            CharSequence charSequence2 = this.LLJJJJLIIL;
            if (charSequence2 != null) {
                this.LLJJLIIIJLLLLLLLZ = false;
                this.LLJJJJJIL = charSequence;
                super.setText(charSequence2, bufferType);
                return;
            } else if (!this.LLJJL) {
                C786410Ut5.y3(getViewTreeObserver(), new ViewTreeObserver.OnPreDrawListener() { // from class: X.0Qzn
                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                    public final boolean onPreDraw() {
                        C786410Ut5.D3(this.LL.getViewTreeObserver(), this);
                        this.LL.LLJJL = true;
                        this.LL.LJJJJL(charSequence, bufferType);
                        return true;
                    }
                });
                return;
            } else {
                LJJJJL(charSequence, bufferType);
                return;
            }
        }
        this.LLJJLIIIJLLLLLLLZ = true;
        this.LLJJJJJIL = charSequence;
        super.setText(charSequence, bufferType);
    }

    public static void LJJJJJ(SpannableStringBuilder spannableStringBuilder, int i, int i2, Integer num) {
        C786410Ut5.q2(spannableStringBuilder, new C444920HcY(42, false), i, i2, 17);
        if (num != null) {
            C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(num.intValue()), i, i2, 17);
        }
    }
}
