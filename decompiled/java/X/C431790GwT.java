package X;

import android.content.Context;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.style.RelativeSizeSpan;
import android.util.AttributeSet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS133S0201000_6;
import kotlin.jvm.internal.AwS146S0101000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0GwT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C431790GwT extends TuxTextView {
    public final int LLJJJJ;
    public final int LLJJJJJIL;
    public CharSequence LLJJJJLIIL;
    public int LLJJL;

    public final void LJJJLIIL() {
        try {
            int i = this.LLJJL;
            CharSequence charSequenceLJJJJJ = LJJJJJ(this.LLJJJJLIIL);
            if (i > 0) {
                Layout layoutLJJJJL = LJJJJL(i, charSequenceLJJJJJ);
                if (layoutLJJJJL.getLineCount() <= getMaxLines()) {
                    setText(charSequenceLJJJJJ);
                    LJJJJLI(new AwS550S0100000_6(charSequenceLJJJJJ, 500));
                } else {
                    CharSequence charSequenceLJJJJLL = LJJJJLL(layoutLJJJJL);
                    setText(charSequenceLJJJJLL);
                    LJJJJLI(new AwS550S0100000_6(charSequenceLJJJJLL, 501));
                }
                requestLayout();
                invalidate();
            } else {
                setText(charSequenceLJJJJJ);
                LJJJJLI(AFwS192S0000000_6.get$arr$(113));
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final int getChevronIconHeight() {
        return this.LLJJJJJIL;
    }

    public final int getChevronIconWidth() {
        return this.LLJJJJ;
    }

    public final CharSequence LJJJJJ(CharSequence charSequence) {
        Object c098200Yq;
        try {
            C1360520lVa c1360520lVa = new C1360520lVa();
            c1360520lVa.LIZ.append(charSequence);
            c1360520lVa.LIZJ(" ", new RelativeSizeSpan(0.0f), 33);
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_chevron_right_thin_ltr;
            c419910GdJ.LJ = Integer.valueOf(R.attr.zl);
            c419910GdJ.LIZIZ = this.LLJJJJ;
            c419910GdJ.LIZJ = this.LLJJJJJIL;
            c1360520lVa.LIZJ("chevronPlaceHolder", c419910GdJ.LIZIZ(2, getContext()), 33);
            c098200Yq = c1360520lVa.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        C1360500lVY c1360500lVY = (C1360500lVY) c098200Yq;
        if (c1360500lVY != null) {
            return c1360500lVY;
        }
        return charSequence;
    }

    public final void LJJJJLI(Function0<String> function0) {
        Object c098200Yq;
        try {
            String strInvoke = function0.invoke();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('[');
            sbLIZ.append(hashCode());
            sbLIZ.append(']');
            sbLIZ.append(strInvoke);
            c098200Yq = C2188811AlT.LIZIZ(sbLIZ);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m7isFailureimpl(c098200Yq);
    }

    public final CharSequence LJJJJLL(Layout layout) {
        Object c098200Yq;
        try {
            String string = this.LLJJJJLIIL.toString();
            float desiredWidth = Layout.getDesiredWidth("…", getPaint()) + (this.LLJJJJ * 2);
            int maxLines = getMaxLines() - 1;
            int lineStart = layout.getLineStart(maxLines);
            C118300cf c118300cf = new C118300cf();
            c118300cf.element = string.offsetByCodePoints(layout.getLineVisibleEnd(maxLines), -1);
            C431800GwU c431800GwU = new C431800GwU(string, lineStart, c118300cf, this, desiredWidth);
            int i = this.LLJJL;
            C817403Hg c817403Hg = new C817403Hg();
            c817403Hg.element = ((Number) c431800GwU.invoke()).floatValue();
            while (i > 0) {
                int i2 = c118300cf.element;
                if (i2 <= 0 || c817403Hg.element <= i) {
                    break;
                }
                c118300cf.element = string.offsetByCodePoints(i2, -1);
                c817403Hg.element = ((Number) c431800GwU.invoke()).floatValue();
                LJJJJLI(new AwS133S0201000_6(i, c817403Hg, c118300cf, 4));
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(string.substring(0, c118300cf.element));
            sbLIZ.append("…");
            c098200Yq = LJJJJJ(C2188811AlT.LIZIZ(sbLIZ));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        CharSequence charSequence = (CharSequence) c098200Yq;
        if (charSequence == null) {
            return this.LLJJJJLIIL;
        }
        return charSequence;
    }

    public final void setTextWithChevron(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        this.LLJJJJLIIL = charSequence;
        LJJJLIIL();
    }

    public C431790GwT(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJJJJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        this.LLJJJJJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        this.LLJJJJLIIL = "";
        setMaxLines(2);
    }

    public final Layout LJJJJL(int i, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), getPaint(), i);
            builderObtain.setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(getLineSpacingExtra(), getLineSpacingMultiplier()).setIncludePad(getIncludeFontPadding()).setBreakStrategy(getBreakStrategy()).setHyphenationFrequency(getHyphenationFrequency()).setTextDirection(textDirectionHeuristic);
            builderObtain.setUseLineSpacingFromFallbacks(isFallbackLineSpacing());
            return builderObtain.build();
        }
        return new StaticLayout(charSequence, getPaint(), i, Layout.Alignment.ALIGN_NORMAL, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding());
    }

    @Override // com.bytedance.tux.input.TuxTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int measuredWidth = (getMeasuredWidth() - getCompoundPaddingStart()) - getCompoundPaddingEnd();
        LJJJJLI(new AwS146S0101000_6(measuredWidth, this, 1));
        if (this.LLJJL != measuredWidth) {
            this.LLJJL = measuredWidth;
            LJJJLIIL();
        }
    }
}
