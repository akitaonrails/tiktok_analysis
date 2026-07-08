package X;

import Y.ARunnableS104S0100000_4;
import Y.ARunnableS7S0301000_10;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.text.BidiFormatter;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.tako.ITakoService;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS51S0010000_6;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0Qzr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C688690Qzr extends C1860130yVP implements InterfaceC431780GwS, InterfaceC685560Quo {
    public static final /* synthetic */ int LLLIL = 0;
    public int LLJJJJLIIL;
    public CharSequence LLJJL;
    public CharSequence LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public final C01GW LLJLIL;
    public boolean LLJLILLLLZIIL;
    public boolean LLJLL;
    public boolean LLJLLIL;
    public boolean LLJLLL;
    public EnumC431710GwL LLJZ;
    public C21419118s1 LLJZIJLIL;
    public String LLL;
    public boolean LLLF;
    public final C1860030yVF<C688690Qzr> LLLFF;
    public C688700Qzs LLLFFI;
    public boolean LLLFZ;
    public List<Integer> LLLI;
    public boolean LLLII;
    public final int LLLIIII;
    public final C339070DQz LLLIIIIL;
    public C0DR1 LLLIIIL;
    public boolean LLLIIL;
    public C435760H6w LLLIILIL;

    public final void LJJJJL() {
        this.LLJJLIIIJLLLLLLLZ = null;
        this.LLLIIIL.reset();
        C339070DQz c339070DQz = this.LLLIIIIL;
        ARunnableS104S0100000_4 aRunnableS104S0100000_4 = c339070DQz.LJI;
        if (aRunnableS104S0100000_4 != null) {
            c339070DQz.LIZ.removeCallbacks(aRunnableS104S0100000_4);
        }
        c339070DQz.LJI = null;
        c339070DQz.LIZIZ = "";
        c339070DQz.LIZJ = "";
        c339070DQz.LIZLLL = 0;
        c339070DQz.LJIIL = 0;
        c339070DQz.LJIIIIZZ = null;
        c339070DQz.LJ = false;
        c339070DQz.LJFF = false;
        c339070DQz.LJII = null;
        c339070DQz.LJIIIZ = null;
        c339070DQz.LJIILIIL = null;
        c339070DQz.LJIILJJIL = 0;
        c339070DQz.LJIILL = null;
        c339070DQz.LJIILLIIL = null;
    }

    public boolean LJJJJLL(boolean z) {
        return false;
    }

    private final ITakoService getTakoService() {
        return (ITakoService) this.LLJLIL.getValue();
    }

    private final String getTruncateText() {
        int i = C431690GwJ.LIZ[this.LLJZ.ordinal()];
        if (i == 1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("... ");
            sbLIZ.append(getContext().getString(2131837627));
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (i == 2) {
            if (C0BQG.LIZ()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("... ");
                sbLIZ2.append(getContext().getString(2131837627));
                return C2188811AlT.LIZIZ(sbLIZ2);
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("... ");
            sbLIZ3.append(getContext().getString(2131830117));
            return C2188811AlT.LIZIZ(sbLIZ3);
        }
        if (i != 3) {
            if (i == 4) {
                return "...";
            }
            throw new C1954807lC();
        }
        String str = this.LLL;
        if (str == null) {
            return "";
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("... ");
        sbLIZ4.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
        return strLIZIZ == null ? "" : strLIZIZ;
    }

    public final void LJJJJLI() {
        C688700Qzs c688700Qzs = this.LLLFFI;
        if (c688700Qzs != null) {
            c688700Qzs.LIZIZ();
        }
        this.LLLFFI = null;
        this.LLLI = null;
        this.LLLII = false;
        this.LLLIILIL = null;
        setMaxWidth(this.LLLIIII);
        requestLayout();
        invalidate();
    }

    private final CharSequence getTruncateSpan() {
        boolean zIsRtl;
        this.LLJJL = getTruncateText();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.LLJJL);
        CharSequence charSequence = this.LLJJL;
        if (charSequence != null) {
            int iLJJJ = a0.LJJJ(charSequence, "...", 0, false, 6);
            int i = iLJJJ + 3;
            if (iLJJJ >= 0 && i < spannableStringBuilder.length()) {
                if ((this.LLJZ == EnumC431710GwL.VIEW_ALL && !C0BQG.LIZ()) || ((this.LLJZ == EnumC431710GwL.CUSTOM && this.LLLF) || this.LLJLLIL)) {
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = this.LLJLLIL ? R.raw.icon_chevron_down_fill : R.raw.icon_chevron_right_fill_ltr;
                    c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
                    c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                    c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                    TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(getContext());
                    tuxIconDrawableLIZ.setBounds(0, 0, tuxIconDrawableLIZ.LIZJ(), tuxIconDrawableLIZ.LIZIZ());
                    boolean zLIZLLL = C426750GoL.LIZLLL(getContext());
                    InterfaceC430910Gv3 interfaceC430910Gv3LJJLIL = null;
                    if (Build.VERSION.SDK_INT >= 26) {
                        BidiFormatter bidiFormatter = BidiFormatter.getInstance();
                        InterfaceC342000Daw markdownContent = getMarkdownContent();
                        zIsRtl = bidiFormatter.isRtl(markdownContent != null ? markdownContent.LIZLLL() : null);
                    } else {
                        zIsRtl = zLIZLLL;
                    }
                    ITakoService takoService = getTakoService();
                    if (takoService != null) {
                        Context context = getContext();
                        interfaceC430910Gv3LJJLIL = takoService.LJJLIL(tuxIconDrawableLIZ, 0, 0, context != null ? C426750GoL.LIZLLL(context) : false, true);
                    }
                    if (zLIZLLL == zIsRtl) {
                        spannableStringBuilder.append((CharSequence) "\u200b");
                        C786410Ut5.q2(spannableStringBuilder, interfaceC430910Gv3LJJLIL, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
                    } else {
                        spannableStringBuilder.insert(i, (CharSequence) "\u200b");
                        C786410Ut5.q2(spannableStringBuilder, interfaceC430910Gv3LJJLIL, i, i + 1, 17);
                    }
                }
                C786410Ut5.q2(spannableStringBuilder, new C444920HcY(52, false), i, spannableStringBuilder.length(), 17);
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, getContext());
                if (numLIZJ != null) {
                    C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(numLIZJ.intValue()), i, spannableStringBuilder.length(), 17);
                }
            }
        }
        return spannableStringBuilder;
    }

    @Override // X.C1860130yVP, X.C1860100yVM, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LLLFF.LIZ();
    }

    public final boolean getCustomDisableClick() {
        return this.LLJLLL;
    }

    public final boolean getEnableDownChevron() {
        return this.LLJLLIL;
    }

    public final boolean getEnableHeightTruncation() {
        return this.LLJLL;
    }

    public final boolean getEnableToggleAction() {
        return this.LLJLILLLLZIIL;
    }

    @Override // X.InterfaceC431780GwS
    public C1860030yVF<C688690Qzr> getMDWithOriginSelectHelper() {
        return this.LLLFF;
    }

    @Override // X.InterfaceC685560Quo
    public C21419118s1 getShortAnswerConfig() {
        return this.LLJZIJLIL;
    }

    public final int getShowMaxLines() {
        return this.LLJJJJLIIL;
    }

    public final C0DR1 getStreamAlphaHandler() {
        return this.LLLIIIL;
    }

    public final boolean getUseSurroundLayout() {
        return this.LLLFZ;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [X.0H6w, android.text.Layout] */
    @Override // X.C1860130yVP
    public final Layout LJJJJIZL(int i) {
        final int size;
        CharSequence text;
        List<Integer> list = this.LLLI;
        if (!this.LLLFZ || list == null || (size = View.MeasureSpec.getSize(i)) <= 0) {
            return null;
        }
        C435760H6w c435760H6w = this.LLLIILIL;
        int i2 = 0;
        if (c435760H6w != null && c435760H6w.getWidth() == size) {
            C435760H6w c435760H6w2 = this.LLLIILIL;
            if (c435760H6w2 != null) {
                text = c435760H6w2.getText();
            } else {
                text = null;
            }
            if (Intrinsics.LJFF(text, getText())) {
                return this.LLLIILIL;
            }
        }
        if (list.size() < 4) {
            return null;
        }
        int iIntValue = ((Number) ListProtector.get(list, 2)).intValue() - ((Number) ListProtector.get(list, 0)).intValue();
        if (iIntValue < 0) {
            iIntValue = 0;
        }
        final int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue)));
        int iIntValue2 = ((Number) ListProtector.get(list, 3)).intValue() - ((Number) ListProtector.get(list, 1)).intValue();
        if (iIntValue2 >= 0) {
            i2 = iIntValue2;
        }
        final int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2)));
        final CharSequence text2 = getText();
        final TextPaint textPaint = new TextPaint(getPaint());
        textPaint.setColor(getCurrentTextColor());
        final boolean z = !this.LLLII;
        final float lineSpacingMultiplier = getLineSpacingMultiplier();
        final float lineSpacingExtra = getLineSpacingExtra();
        final int breakStrategy = getBreakStrategy();
        final int hyphenationFrequency = getHyphenationFrequency();
        ?? r6 = new Layout(text2, textPaint, size, iLIZIZ, iLIZIZ2, z, lineSpacingMultiplier, lineSpacingExtra, breakStrategy, hyphenationFrequency) { // from class: X.0H6w
            public final int LIZ;
            public final int LIZIZ;
            public final float LIZJ;
            public final float LIZLLL;
            public final int LJ;
            public final int LJFF;
            public final StaticLayout LJI;
            public final StaticLayout LJII;
            public final int LJIIIIZZ;
            public final int LJIIIZ;
            public final C01GW LJIIJ;
            public float LJIIJJI;
            public float LJIIL;

            @Override // android.text.Layout
            public final int getEllipsisCount(int i3) {
                return 0;
            }

            @Override // android.text.Layout
            public final int getEllipsisStart(int i3) {
                return 0;
            }

            @Override // android.text.Layout
            public final int getBottomPadding() {
                StaticLayout staticLayout = this.LJII;
                if (staticLayout == null) {
                    staticLayout = this.LJI;
                }
                return staticLayout.getBottomPadding();
            }

            @Override // android.text.Layout
            public final int getHeight() {
                int height = this.LJI.getHeight();
                StaticLayout staticLayout = this.LJII;
                int height2 = height + (staticLayout != null ? staticLayout.getHeight() : 0);
                return this.LJII == null ? Math.max(height2, this.LIZIZ) : height2;
            }

            @Override // android.text.Layout
            public final int getLineCount() {
                int lineCount = this.LJI.getLineCount();
                StaticLayout staticLayout = this.LJII;
                return lineCount + (staticLayout != null ? staticLayout.getLineCount() : 0);
            }

            @Override // android.text.Layout
            public final int getTopPadding() {
                return this.LJI.getTopPadding();
            }

            public final Pair<StaticLayout, Integer> LIZIZ(int i3) {
                StaticLayout staticLayout;
                if (this.LJIIL != 0.0f && (staticLayout = this.LJII) != null) {
                    return new Pair<>(staticLayout, Integer.valueOf(LIZJ(staticLayout, i3)));
                }
                if (i3 < this.LJI.getLineCount()) {
                    StaticLayout staticLayout2 = this.LJI;
                    return new Pair<>(staticLayout2, Integer.valueOf(LIZJ(staticLayout2, i3)));
                }
                StaticLayout staticLayout3 = this.LJII;
                if (staticLayout3 != null) {
                    return new Pair<>(staticLayout3, Integer.valueOf(LIZJ(staticLayout3, i3 - this.LJI.getLineCount())));
                }
                StaticLayout staticLayout4 = this.LJI;
                return new Pair<>(staticLayout4, Integer.valueOf(LIZJ(staticLayout4, i3)));
            }

            public final float LJ(StaticLayout staticLayout) {
                if (staticLayout == this.LJI && ((Boolean) this.LJIIJ.getValue()).booleanValue()) {
                    return this.LIZ;
                }
                return 0.0f;
            }

            @Override // android.text.Layout
            public final boolean getLineContainsTab(int i3) {
                Pair<StaticLayout, Integer> pairLIZIZ = LIZIZ(i3);
                return pairLIZIZ.getFirst().getLineContainsTab(pairLIZIZ.getSecond().intValue());
            }

            @Override // android.text.Layout
            public final int getLineDescent(int i3) {
                Pair<StaticLayout, Integer> pairLIZIZ = LIZIZ(i3);
                return pairLIZIZ.getFirst().getLineDescent(pairLIZIZ.getSecond().intValue());
            }

            @Override // android.text.Layout
            public final Layout.Directions getLineDirections(int i3) {
                Pair<StaticLayout, Integer> pairLIZIZ = LIZIZ(i3);
                return pairLIZIZ.getFirst().getLineDirections(pairLIZIZ.getSecond().intValue());
            }

            @Override // android.text.Layout
            public final int getLineForOffset(int i3) {
                int iLJ = C13LZ.LJ(i3, 0, getText().length());
                int i4 = this.LJIIIIZZ;
                if (iLJ <= i4) {
                    StaticLayout staticLayout = this.LJI;
                    if (iLJ > i4) {
                        iLJ = i4;
                    }
                    return staticLayout.getLineForOffset(iLJ);
                }
                if (this.LJII == null) {
                    int lineCount = this.LJI.getLineCount() - 1;
                    if (lineCount < 0) {
                        return 0;
                    }
                    return lineCount;
                }
                if (iLJ < this.LJIIIZ) {
                    return this.LJI.getLineForOffset(i4);
                }
                return this.LJII.getLineForOffset(iLJ) + this.LJI.getLineCount();
            }

            @Override // android.text.Layout
            public final int getLineForVertical(int i3) {
                int lineForVertical;
                if (i3 < this.LJI.getHeight()) {
                    return this.LJI.getLineForVertical(i3);
                }
                int lineCount = this.LJI.getLineCount();
                StaticLayout staticLayout = this.LJII;
                if (staticLayout != null) {
                    lineForVertical = staticLayout.getLineForVertical(i3 - this.LJI.getHeight());
                } else {
                    lineForVertical = 0;
                }
                return lineForVertical + lineCount;
            }

            @Override // android.text.Layout
            public final float getLineLeft(int i3) {
                Pair<StaticLayout, Integer> pairLIZIZ = LIZIZ(i3);
                StaticLayout first = pairLIZIZ.getFirst();
                return (first.getLineLeft(pairLIZIZ.getSecond().intValue()) + LJ(first)) - this.LJIIJJI;
            }

            @Override // android.text.Layout
            public final float getLineMax(int i3) {
                Pair<StaticLayout, Integer> pairLIZIZ = LIZIZ(i3);
                return pairLIZIZ.getFirst().getLineMax(pairLIZIZ.getSecond().intValue());
            }

            @Override // android.text.Layout
            public final float getLineRight(int i3) {
                Pair<StaticLayout, Integer> pairLIZIZ = LIZIZ(i3);
                StaticLayout first = pairLIZIZ.getFirst();
                return (first.getLineRight(pairLIZIZ.getSecond().intValue()) + LJ(first)) - this.LJIIJJI;
            }

            @Override // android.text.Layout
            public final int getLineStart(int i3) {
                if (i3 >= getLineCount()) {
                    return getText().length();
                }
                Pair<StaticLayout, Integer> pairLIZIZ = LIZIZ(i3);
                return pairLIZIZ.getFirst().getLineStart(pairLIZIZ.getSecond().intValue());
            }

            @Override // android.text.Layout
            public final int getLineTop(int i3) {
                float height;
                if (i3 >= getLineCount()) {
                    return getHeight();
                }
                Pair<StaticLayout, Integer> pairLIZIZ = LIZIZ(i3);
                StaticLayout first = pairLIZIZ.getFirst();
                float lineTop = first.getLineTop(pairLIZIZ.getSecond().intValue());
                if (first == this.LJII) {
                    height = this.LJI.getHeight();
                } else {
                    height = 0.0f;
                }
                return (int) ((lineTop + height) - this.LJIIL);
            }

            @Override // android.text.Layout
            public final int getLineVisibleEnd(int i3) {
                Pair<StaticLayout, Integer> pairLIZIZ = LIZIZ(i3);
                return pairLIZIZ.getFirst().getLineVisibleEnd(pairLIZIZ.getSecond().intValue());
            }

            @Override // android.text.Layout
            public final float getLineWidth(int i3) {
                Pair<StaticLayout, Integer> pairLIZIZ = LIZIZ(i3);
                return pairLIZIZ.getFirst().getLineWidth(pairLIZIZ.getSecond().intValue());
            }

            @Override // android.text.Layout
            public final int getOffsetToLeftOf(int i3) {
                return LIZLLL(i3, C435770H6x.LL, true);
            }

            @Override // android.text.Layout
            public final int getOffsetToRightOf(int i3) {
                return LIZLLL(i3, C435780H6y.LL, false);
            }

            @Override // android.text.Layout
            public final int getParagraphDirection(int i3) {
                Pair<StaticLayout, Integer> pairLIZIZ = LIZIZ(i3);
                return pairLIZIZ.getFirst().getParagraphDirection(pairLIZIZ.getSecond().intValue());
            }

            @Override // android.text.Layout
            public final float getPrimaryHorizontal(int i3) {
                float primaryHorizontal;
                float f;
                int iLJ = C13LZ.LJ(i3, 0, getText().length());
                int i4 = this.LJIIIIZZ;
                if (iLJ <= i4) {
                    StaticLayout staticLayout = this.LJI;
                    if (iLJ > i4) {
                        iLJ = i4;
                    }
                    primaryHorizontal = staticLayout.getPrimaryHorizontal(iLJ) + LJ(this.LJI);
                    f = this.LJIIJJI;
                } else {
                    StaticLayout staticLayout2 = this.LJII;
                    if (staticLayout2 == null) {
                        return 0.0f;
                    }
                    if (iLJ < this.LJIIIZ) {
                        primaryHorizontal = this.LJI.getPrimaryHorizontal(i4) + LJ(this.LJI);
                        f = this.LJIIJJI;
                    } else {
                        primaryHorizontal = staticLayout2.getPrimaryHorizontal(iLJ) + LJ(this.LJII);
                        f = this.LJIIJJI;
                    }
                }
                return primaryHorizontal - f;
            }

            @Override // android.text.Layout
            public final float getSecondaryHorizontal(int i3) {
                float secondaryHorizontal;
                float f;
                int iLJ = C13LZ.LJ(i3, 0, getText().length());
                int i4 = this.LJIIIIZZ;
                if (iLJ <= i4) {
                    StaticLayout staticLayout = this.LJI;
                    if (iLJ > i4) {
                        iLJ = i4;
                    }
                    secondaryHorizontal = staticLayout.getSecondaryHorizontal(iLJ) + LJ(this.LJI);
                    f = this.LJIIJJI;
                } else {
                    StaticLayout staticLayout2 = this.LJII;
                    if (staticLayout2 == null) {
                        return 0.0f;
                    }
                    if (iLJ < this.LJIIIZ) {
                        secondaryHorizontal = this.LJI.getSecondaryHorizontal(i4) + LJ(this.LJI);
                        f = this.LJIIJJI;
                    } else {
                        secondaryHorizontal = staticLayout2.getSecondaryHorizontal(iLJ) + LJ(this.LJII);
                        f = this.LJIIJJI;
                    }
                }
                return secondaryHorizontal - f;
            }

            public static final int LIZJ(StaticLayout staticLayout, int i3) {
                int lineCount = staticLayout.getLineCount() - 1;
                if (lineCount < 0) {
                    lineCount = 0;
                }
                return C13LZ.LJ(i3, 0, lineCount);
            }

            @Override // android.text.Layout
            public final int getOffsetForHorizontal(int i3, float f) {
                Pair<StaticLayout, Integer> pairLIZIZ = LIZIZ(i3);
                StaticLayout first = pairLIZIZ.getFirst();
                return first.getOffsetForHorizontal(pairLIZIZ.getSecond().intValue(), (f + this.LJIIJJI) - LJ(first));
            }

            public final int LIZLLL(int i3, Function2<? super StaticLayout, ? super Integer, Integer> function2, boolean z2) {
                int iLJ = C13LZ.LJ(i3, 0, getText().length());
                int i4 = this.LJIIIIZZ;
                if (iLJ <= i4) {
                    int iIntValue3 = function2.invoke(this.LJI, Integer.valueOf(iLJ)).intValue();
                    if (!z2 && iIntValue3 >= this.LJIIIIZZ && this.LJII != null) {
                        return this.LJIIIZ;
                    }
                    return C13LZ.LJ(iIntValue3, 0, this.LJIIIIZZ);
                }
                StaticLayout staticLayout = this.LJII;
                if (staticLayout == null) {
                    return i4;
                }
                int i5 = this.LJIIIZ;
                if (iLJ < i5) {
                    if (z2) {
                        return i4;
                    }
                    return i5;
                }
                int lineStart = staticLayout.getLineStart(0);
                if (z2) {
                    if (iLJ <= lineStart) {
                        return this.LJIIIIZZ;
                    }
                    int iIntValue4 = function2.invoke(staticLayout, Integer.valueOf(iLJ)).intValue();
                    if (iIntValue4 <= lineStart) {
                        return this.LJIIIIZZ;
                    }
                    return C13LZ.LJ(iIntValue4, this.LJIIIZ, getText().length());
                }
                return C13LZ.LJ(function2.invoke(staticLayout, Integer.valueOf(iLJ)).intValue(), this.LJIIIZ, getText().length());
            }

            @Override // android.text.Layout
            public final void draw(Canvas canvas, Path path, Paint paint, int i3) {
                float f;
                if (path != null && paint != null) {
                    canvas.drawPath(path, paint);
                }
                int iSave = canvas.save();
                try {
                    float f2 = this.LJIIJJI;
                    float f3 = this.LJIIL;
                    if (((Boolean) this.LJIIJ.getValue()).booleanValue()) {
                        f = this.LIZ;
                    } else {
                        f = 0.0f;
                    }
                    this.LJIIJJI = f;
                    this.LJIIL = 0.0f;
                    if (f != 0.0f) {
                        try {
                            canvas.translate(f, 0.0f);
                        } finally {
                        }
                    }
                    this.LJI.draw(canvas);
                    this.LJIIJJI = f2;
                    this.LJIIL = f3;
                    canvas.restoreToCount(iSave);
                    StaticLayout staticLayout = this.LJII;
                    if (staticLayout != null) {
                        iSave = canvas.save();
                        try {
                            f2 = this.LJIIJJI;
                            f3 = this.LJIIL;
                            this.LJIIJJI = 0.0f;
                            float height = this.LJI.getHeight();
                            this.LJIIL = height;
                            try {
                                canvas.translate(0.0f, height);
                                staticLayout.draw(canvas);
                                this.LJIIJJI = f2;
                                this.LJIIL = f3;
                                canvas.restoreToCount(iSave);
                            } finally {
                            }
                        } finally {
                        }
                    }
                } finally {
                }
            }

            public final StaticLayout LIZ(CharSequence charSequence, int i3, int i4, TextPaint textPaint2, int i5) {
                return StaticLayout.Builder.obtain(charSequence, i3, i4, textPaint2, i5).setAlignment(Layout.Alignment.ALIGN_NORMAL).setBreakStrategy(this.LJ).setHyphenationFrequency(this.LJFF).setLineSpacing(this.LIZLLL, this.LIZJ).setIncludePad(true).build();
            }

            {
                int lineEnd;
                boolean z2;
                Pair pair;
                StaticLayout staticLayoutLIZ;
                char cCharAt;
                char cCharAt2;
                char cCharAt3;
                super(text2, textPaint, size, Layout.Alignment.ALIGN_NORMAL, lineSpacingMultiplier, lineSpacingExtra);
                this.LIZ = iLIZIZ;
                this.LIZIZ = iLIZIZ2;
                this.LIZJ = lineSpacingMultiplier;
                this.LIZLLL = lineSpacingExtra;
                this.LJ = breakStrategy;
                this.LJFF = hyphenationFrequency;
                this.LJIIJ = C452501pT.LIZIZ(new AwS51S0010000_6(z, 0));
                int i3 = size - iLIZIZ;
                i3 = i3 < 1 ? 1 : i3;
                StaticLayout staticLayoutLIZ2 = LIZ(text2, 0, text2.length(), textPaint, i3);
                int lineForVertical = staticLayoutLIZ2.getLineForVertical(iLIZIZ2);
                boolean z3 = false;
                if (staticLayoutLIZ2.getLineCount() > 0) {
                    lineEnd = staticLayoutLIZ2.getLineEnd(C13LZ.LJ(lineForVertical, 0, staticLayoutLIZ2.getLineCount() - 1));
                } else {
                    lineEnd = 0;
                }
                int length = text2.length();
                int iLJ = C13LZ.LJ(lineEnd, 0, length);
                int i4 = iLJ - 1;
                while (i4 >= 0 && ((cCharAt3 = text2.charAt(i4)) == ' ' || cCharAt3 == '\t' || cCharAt3 == 12288)) {
                    i4--;
                }
                if (i4 >= 0 && ((cCharAt2 = text2.charAt(i4)) == '\n' || cCharAt2 == '\r')) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int i5 = iLJ;
                while (i5 < length) {
                    char cCharAt4 = text2.charAt(i5);
                    if (cCharAt4 != ' ' && cCharAt4 != '\t' && cCharAt4 != 12288) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (i5 < length && ((cCharAt = text2.charAt(i5)) == '\n' || cCharAt == '\r')) {
                    z3 = true;
                }
                if (z2 && z3) {
                    int length2 = text2.length();
                    if (i5 < length2) {
                        char cCharAt5 = text2.charAt(i5);
                        if (cCharAt5 != '\n') {
                            if (cCharAt5 != '\r') {
                                length2 = i5;
                            } else {
                                int i6 = i5 + 1;
                                if (i6 < length2 && text2.charAt(i6) == '\n') {
                                    length2 = i5 + 2;
                                } else {
                                    length2 = i6;
                                }
                            }
                        } else {
                            length2 = i5 + 1;
                        }
                    }
                    pair = new Pair(Integer.valueOf(i5), Integer.valueOf(length2));
                } else {
                    pair = new Pair(Integer.valueOf(iLJ), Integer.valueOf(iLJ));
                }
                int iIntValue3 = ((Number) pair.getFirst()).intValue();
                int iIntValue4 = ((Number) pair.getSecond()).intValue();
                this.LJIIIIZZ = iIntValue3;
                this.LJIIIZ = iIntValue4;
                this.LJI = LIZ(text2, 0, iIntValue3, textPaint, i3);
                if (iIntValue4 < text2.length()) {
                    staticLayoutLIZ = LIZ(text2, iIntValue4, text2.length(), textPaint, size >= 1 ? size : 1);
                } else {
                    staticLayoutLIZ = null;
                }
                this.LJII = staticLayoutLIZ;
            }
        };
        this.LLLIILIL = r6;
        return r6;
    }

    public final void LJJJZ(boolean z) {
        SpannableStringBuilder spannableStringBuilderLIZLLL;
        if (z) {
            if (this.LLJL) {
                this.LLJL = false;
                setText(this.LLJJLIIIJLLLLLLLZ);
                return;
            }
            return;
        }
        if (this.LLJL) {
            return;
        }
        setMaxLines(Integer.MAX_VALUE);
        this.LLJL = true;
        InterfaceC342000Daw markdownContent = getMarkdownContent();
        if (markdownContent != null) {
            spannableStringBuilderLIZLLL = markdownContent.LIZLLL();
        } else {
            spannableStringBuilderLIZLLL = null;
        }
        setText(spannableStringBuilderLIZLLL);
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence LJJLIIIJJI(android.text.Layout r15) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C688690Qzr.LJJLIIIJJI(android.text.Layout):java.lang.CharSequence");
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C688700Qzs c688700Qzs = this.LLLFFI;
        if (c688700Qzs != null && configuration != null && c688700Qzs.LJI != configuration.orientation) {
            C786410Ut5.C3(c688700Qzs.LIZ.getViewTreeObserver(), c688700Qzs.LJII);
            C786410Ut5.x3(c688700Qzs.LIZ.getViewTreeObserver(), c688700Qzs.LJII);
            c688700Qzs.LJI = configuration.orientation;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0087  */
    @Override // X.C1860130yVP, X.C1857630yRN, android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            boolean r0 = r8.LLJLLL
            if (r0 == 0) goto L8c
            if (r9 == 0) goto L8c
            int r0 = r9.getActionMasked()
            r7 = 1
            r6 = 0
            if (r0 != 0) goto L73
            android.text.Layout r5 = r8.getLayout()
            if (r5 == 0) goto L87
            java.lang.CharSequence r4 = r8.getText()
            boolean r0 = r4 instanceof android.text.Spanned
            if (r0 == 0) goto L87
            android.text.Spanned r4 = (android.text.Spanned) r4
            if (r4 == 0) goto L87
            float r0 = r9.getY()
            int r3 = (int) r0
            int r0 = r8.getTotalPaddingTop()
            int r3 = r3 - r0
            int r0 = r8.getScrollY()
            int r3 = r3 + r0
            if (r3 < 0) goto L87
            int r0 = r5.getHeight()
            if (r3 > r0) goto L87
            int r1 = r4.length()
            java.lang.Class<X.11G2> r0 = X.C11G2.class
            java.lang.Object[] r0 = r4.getSpans(r6, r1, r0)
            X.089E r2 = new X.089E
            r2.<init>(r0)
        L46:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L87
            java.lang.Object r0 = r2.next()
            int r1 = r4.getSpanStart(r0)
            int r0 = r4.getSpanEnd(r0)
            if (r1 < 0) goto L46
            if (r0 < 0) goto L46
            int r1 = r5.getLineForOffset(r1)
            int r0 = r5.getLineForOffset(r0)
            int r1 = r5.getLineTop(r1)
            int r0 = r5.getLineBottom(r0)
            if (r1 > r3) goto L46
            if (r3 > r0) goto L46
            r0 = 1
        L71:
            r8.LLLIIL = r0
        L73:
            boolean r0 = r8.LLLIIL
            if (r0 == 0) goto L85
            boolean r2 = super.onTouchEvent(r9)
        L7b:
            int r1 = r9.getActionMasked()
            if (r1 == r7) goto L89
            r0 = 3
            if (r1 == r0) goto L89
            return r2
        L85:
            r2 = 0
            goto L7b
        L87:
            r0 = 0
            goto L71
        L89:
            r8.LLLIIL = r6
            return r2
        L8c:
            boolean r0 = super.onTouchEvent(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C688690Qzr.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setCustomDisableClick(boolean z) {
        this.LLJLLL = z;
    }

    public final void setCustomShowTruncateIcon(boolean z) {
        this.LLLF = z;
    }

    public final void setCustomTruncateText(String str) {
        this.LLL = str;
    }

    public final void setEnableDownChevron(boolean z) {
        this.LLJLLIL = z;
    }

    public final void setEnableHeightTruncation(boolean z) {
        this.LLJLL = z;
    }

    public final void setEnableToggleAction(boolean z) {
        this.LLJLILLLLZIIL = z;
    }

    public final void setExpand(boolean z) {
        this.LLJL = z;
    }

    public void setOpenOriginSelect(boolean z) {
        C1860030yVF<C688690Qzr> mDWithOriginSelectHelper = getMDWithOriginSelectHelper();
        mDWithOriginSelectHelper.LIZIZ = z;
        mDWithOriginSelectHelper.LIZ();
    }

    @Override // X.InterfaceC685560Quo
    public void setShortAnswerConfig(C21419118s1 c21419118s1) {
        this.LLJZIJLIL = c21419118s1;
    }

    public final void setShowMaxLines(int i) {
        this.LLJJJJLIIL = i;
        setMaxLines(i);
    }

    public final void setStreamAlphaHandler(C0DR1 c0dr1) {
        this.LLLIIIL = c0dr1;
    }

    public final void setTruncateType(EnumC431710GwL enumC431710GwL) {
        this.LLJZ = enumC431710GwL;
    }

    public final void setUseSurroundLayout(boolean z) {
        this.LLLFZ = z;
    }

    public C688690Qzr(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void LJJJLIIL(final int i, final Function1<? super CharSequence, Unit> function1) {
        if (isLaidOut() && !isLayoutRequested()) {
            ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(this, new ARunnableS7S0301000_10(this, this, i, function1, 0));
        } else {
            addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.0Qzt
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    view.removeOnLayoutChangeListener(this);
                    C688690Qzr c688690Qzr = this.LL;
                    ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(c688690Qzr, new ARunnableS7S0301000_10(c688690Qzr, c688690Qzr, i, function1, 0));
                }
            });
        }
    }

    public final boolean LJJJLZIJ(int i, Layout layout) {
        return a0.LJJJIL(layout.getText().subSequence(layout.getLineStart(i), layout.getLineEnd(i)));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    @Override // X.C1860130yVP, android.widget.TextView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setText(java.lang.CharSequence r6, android.widget.TextView.BufferType r7) {
        /*
            r5 = this;
            X.0Qzs r4 = r5.LLLFFI
            if (r4 == 0) goto L48
            X.0DQz r0 = r5.LLLIIIIL
            boolean r3 = r0.LJ
            r2 = 0
            r1 = 1
            if (r6 == 0) goto L4a
            int r0 = r6.length()
            if (r0 == 0) goto L41
            boolean r0 = r4.LIZLLL
            if (r0 != 0) goto L41
            if (r3 == 0) goto L23
            java.lang.CharSequence r0 = r4.LIZ(r6, r1)
        L1c:
            if (r0 == 0) goto L48
            r6 = r0
        L1f:
            super.setText(r6, r7)
            return
        L23:
            android.widget.TextView r0 = r4.LIZ
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            X.0R4E r0 = r4.LJII
            X.C786410Ut5.C3(r1, r0)
            android.widget.TextView r0 = r4.LIZ
            int r0 = r0.getWidth()
            if (r0 > 0) goto L43
            android.widget.TextView r0 = r4.LIZ
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            X.0R4E r0 = r4.LJII
            X.C786410Ut5.x3(r1, r0)
        L41:
            r0 = r6
            goto L1c
        L43:
            java.lang.CharSequence r0 = r4.LIZ(r6, r2)
            goto L1c
        L48:
            if (r6 != 0) goto L1f
        L4a:
            java.lang.String r6 = ""
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C688690Qzr.setText(java.lang.CharSequence, android.widget.TextView$BufferType):void");
    }

    public C688690Qzr(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLJJL = "";
        this.LLJLIL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(152));
        this.LLJZ = EnumC431710GwL.SEE_MORE;
        C418440Gaw.LIZIZ(20);
        C418440Gaw.LIZIZ(4);
        this.LLLFF = new C1860030yVF<>(this);
        this.LLLFZ = true;
        this.LLLIIII = getMaxWidth();
        this.LLLIIIIL = new C339070DQz();
        this.LLLIIIL = new C08ZX();
        this.LLJJJJLIIL = 7;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.FoldTextView);
            this.LLJJJJLIIL = typedArrayObtainStyledAttributes.getInt(R$styleable.FoldTextView_showMaxLine, 7);
            typedArrayObtainStyledAttributes.getColor(R$styleable.FoldTextView_tipColor, -1);
            typedArrayObtainStyledAttributes.recycle();
        }
        C341990Dav.LIZ(this, context, 0, 0, null, 14);
        C2271391DvN.LIZ(this, (C1A5L) C2271381DvM.LJJZ.getValue());
    }

    public final void LJJL(Integer num, List list, boolean z) {
        int iLIZIZ;
        int iLIZIZ2;
        Number number = (Number) C13LP.LJJJLZIJ(2, list);
        if (number != null) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(number));
        } else {
            iLIZIZ = 0;
        }
        Number number2 = (Number) C13LP.LJJJLZIJ(3, list);
        if (number2 != null) {
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(number2));
        } else {
            iLIZIZ2 = 0;
        }
        this.LLLIILIL = null;
        if (C301280BrS.LIZ() && iLIZIZ > 0 && iLIZIZ2 > 0) {
            if (this.LLLFZ) {
                C688700Qzs c688700Qzs = this.LLLFFI;
                if (c688700Qzs != null) {
                    c688700Qzs.LIZIZ();
                }
                this.LLLFFI = null;
                this.LLLI = list;
                this.LLLII = z;
                return;
            }
            this.LLLFFI = new C688700Qzs(this, iLIZIZ, iLIZIZ2);
            if (num != null && num.intValue() > 0) {
                setMaxWidth(num.intValue());
            }
            setText(getText());
            this.LLLI = null;
            this.LLLII = false;
            return;
        }
        LJJJJLI();
    }

    public final void LJJLI(String str, C21419418s4 c21419418s4, InterfaceC328600CuQ interfaceC328600CuQ, C0GV2 c0gv2, C0GV3 c0gv3, C1263404wy c1263404wy) {
        C341990Dav.LIZLLL(this, str, c21419418s4, interfaceC328600CuQ, null, null, null, c0gv2, c0gv3, c1263404wy, false, null, null, 3640);
    }

    public final void LJJLIIIIJ(String str, C21419418s4 c21419418s4, InterfaceC328600CuQ interfaceC328600CuQ, C0GV2 c0gv2, C0GV3 c0gv3, C1263404wy c1263404wy, boolean z, boolean z2, Function0<Unit> function0, boolean z3) {
        boolean z4;
        String strLL;
        String strLJZL;
        C443120HZe c443120HZe;
        C0DIF c0dif;
        String strLL2;
        int iLJ;
        int length = 0;
        if (!TextUtils.isEmpty(str) && this.LLJJJJLIIL != 0 && z2) {
            CharSequence charSequence = this.LLJJLIIIJLLLLLLLZ;
            if (charSequence != null) {
                this.LLJL = false;
                setText(charSequence);
                return;
            } else {
                LJJLI(str, c21419418s4, interfaceC328600CuQ, c0gv2, c0gv3, c1263404wy);
                if (LJJJJLL(true)) {
                    return;
                }
                LJJJLIIL(0, new AwS583S0100000_4(this, 112));
                return;
            }
        }
        this.LLJL = true;
        LJJJJLL(false);
        if (z) {
            C339070DQz c339070DQz = this.LLLIIIIL;
            c339070DQz.LJIIJ = c1263404wy;
            C0DR0 c0dr0 = new C0DR0(interfaceC328600CuQ, null, null, null, c0gv2, c0gv3, null, null, function0);
            if (z3) {
                ARunnableS104S0100000_4 aRunnableS104S0100000_4 = c339070DQz.LJI;
                if (aRunnableS104S0100000_4 != null) {
                    c339070DQz.LIZ.removeCallbacks(aRunnableS104S0100000_4);
                }
                c339070DQz.LJI = null;
                c339070DQz.LJ = false;
                c339070DQz.LIZJ = str;
                c339070DQz.LIZIZ = str;
                c339070DQz.LIZ(this, c21419418s4, str);
                c339070DQz.LJIIIIZZ = c21419418s4;
                LJJLIIIIJ(c339070DQz.LIZJ, c21419418s4, interfaceC328600CuQ, c0gv2, c0gv3, c339070DQz.LJIIJ, false, false, null, false);
                c339070DQz.LJII = null;
                c339070DQz.LJIIIIZZ = null;
                c339070DQz.LJIIIZ = null;
                return;
            }
            String str2 = c339070DQz.LIZIZ;
            if (Intrinsics.LJFF(str2, str)) {
                c0dif = new C0DIF(C0DIE.IDENTICAL, str2.length());
            } else if (str.length() > str2.length() && u.LJJIIJZLJL(str, str2, false)) {
                c0dif = new C0DIF(C0DIE.APPEND, str2.length());
            } else {
                Iterator it2 = C1697810uHb.LJIIJJI("<data-inline\\s+[^>]*>.*?</data-inline>", "<data-block-force-zero-left\\s+[^>]*>.*?</data-block-force-zero-left>", "<data-block\\s+[^>]*>.*?</data-block>").iterator();
                while (it2.hasNext()) {
                    Regex regex = new Regex((String) it2.next(), EnumC688760Qzy.DOT_MATCHES_ALL);
                    if (C09RB.LJFF(Regex.findAll$default(regex, str2, 0, 2, null)) != C09RB.LJFF(Regex.findAll$default(regex, str, 0, 2, null)) || !Intrinsics.LJFF(C09RB.LJJII(new C08LY(Regex.findAll$default(regex, str2, 0, 2, null), AFwS241S0000000_10.get$arr$(588))), C09RB.LJJII(new C08LY(Regex.findAll$default(regex, str, 0, 2, null), AFwS241S0000000_10.get$arr$(587))))) {
                        z4 = true;
                        break;
                    }
                }
                z4 = false;
                if (z4) {
                    String strLIZIZ = C0DIC.LIZIZ(str2);
                    String strLIZIZ2 = C0DIC.LIZIZ(str);
                    if (strLIZIZ.length() > 2000) {
                        strLL2 = C13LN.LL(2000, strLIZIZ);
                    } else {
                        strLL2 = strLIZIZ;
                    }
                    if (strLIZIZ2.length() > 2000) {
                        strLIZIZ2 = C13LN.LJZL(2000, strLIZIZ2);
                    }
                    int iLIZ = C0DIC.LIZ(strLL2, strLIZIZ2);
                    if (iLIZ <= 0) {
                        iLJ = 0;
                    } else if (iLIZ >= strLIZIZ.length()) {
                        iLJ = str2.length();
                    } else {
                        iLJ = C13LZ.LJ((int) (str2.length() * (iLIZ / strLIZIZ.length())), 0, str2.length());
                    }
                    c443120HZe = new C443120HZe(strLL2, strLIZIZ2, Integer.valueOf(iLJ));
                } else {
                    if (str2.length() > 2000) {
                        strLL = C13LN.LL(2000, str2);
                    } else {
                        strLL = str2;
                    }
                    if (str.length() > 2000) {
                        strLJZL = C13LN.LJZL(2000, str);
                    } else {
                        strLJZL = str;
                    }
                    c443120HZe = new C443120HZe(strLL, strLJZL, Integer.valueOf(C0DIC.LIZ(strLL, strLJZL)));
                }
                String str3 = (String) c443120HZe.getFirst();
                String str4 = (String) c443120HZe.getSecond();
                int iIntValue = ((Number) c443120HZe.getThird()).intValue();
                int iMin = Math.min(str3.length(), str4.length());
                if (iMin > 0 && iIntValue / iMin < 0.0f) {
                    c0dif = new C0DIF(C0DIE.COMPLETE_CHANGE, iIntValue);
                } else if (iIntValue == str2.length()) {
                    c0dif = new C0DIF(C0DIE.APPEND, iIntValue);
                } else if (iIntValue == str.length()) {
                    c0dif = new C0DIF(C0DIE.TAIL_REPLACE, iIntValue);
                } else {
                    c0dif = new C0DIF(C0DIE.TAIL_REPLACE, iIntValue);
                }
            }
            int i = C0DJ5.LIZ[c0dif.LIZ.ordinal()];
            if (i == 1) {
                return;
            }
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        ARunnableS104S0100000_4 aRunnableS104S0100000_42 = c339070DQz.LJI;
                        if (aRunnableS104S0100000_42 != null) {
                            c339070DQz.LIZ.removeCallbacks(aRunnableS104S0100000_42);
                        }
                        c339070DQz.LJI = null;
                        c339070DQz.LJ = false;
                        c339070DQz.LIZIZ = "";
                        c339070DQz.LIZLLL = 0;
                        c339070DQz.LJIIL = 0;
                        setText("");
                        c339070DQz.LJII = null;
                        c339070DQz.LJIIIIZZ = null;
                        c339070DQz.LJIIIZ = null;
                        c339070DQz.LJIILIIL = null;
                        c339070DQz.LJIILJJIL = 0;
                        c339070DQz.LJIILL = null;
                        c339070DQz.LJIILLIIL = null;
                        c339070DQz.LIZJ = str;
                        c339070DQz.LIZIZ = str;
                        c339070DQz.LIZLLL(this, c21419418s4, c0dr0);
                        return;
                    }
                    throw new C1954807lC();
                }
                int i2 = c0dif.LIZIZ;
                c339070DQz.LIZJ = str;
                c339070DQz.LIZIZ = str;
                c339070DQz.LJII = this;
                c339070DQz.LJIIIIZZ = c21419418s4;
                c339070DQz.LJIIIZ = c0dr0;
                int i3 = c339070DQz.LIZLLL;
                if (i3 > i2 && i3 - i2 <= 20) {
                    c339070DQz.LIZLLL = i2;
                    InterfaceC342000Daw interfaceC342000DawLIZ = c339070DQz.LIZ(this, c21419418s4, C13LN.LJZL(i2, str));
                    if (interfaceC342000DawLIZ != null) {
                        C339070DQz.LIZJ(this, interfaceC342000DawLIZ, c0dr0.LIZ, c0dr0.LIZIZ, c0dr0.LIZJ, c0dr0.LIZLLL, c0dr0.LJ, c0dr0.LJFF);
                        CharSequence text = getText();
                        if (text != null) {
                            length = text.length();
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("handleTailReplace: reset to position ");
                        sbLIZ.append(i2);
                        sbLIZ.append(", rendered length=");
                        sbLIZ.append(length);
                        C2188811AlT.LIZIZ(sbLIZ);
                    }
                }
                if (c339070DQz.LJ) {
                    return;
                }
                c339070DQz.LIZLLL(this, c21419418s4, c0dr0);
                return;
            }
            c339070DQz.LIZJ = str;
            c339070DQz.LIZIZ = str;
            c339070DQz.LJII = this;
            c339070DQz.LJIIIIZZ = c21419418s4;
            c339070DQz.LJIIIZ = c0dr0;
            if (c339070DQz.LJ) {
                return;
            }
            c339070DQz.LIZLLL(this, c21419418s4, c0dr0);
            return;
        }
        LJJLI(str, c21419418s4, interfaceC328600CuQ, c0gv2, c0gv3, c1263404wy);
    }
}
