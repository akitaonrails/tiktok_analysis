package X;

import Y.ACListenerS165S0100000_31;
import Y.ARunnableS115S0100000_15;
import Y.ATListenerS463S0100000_31;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Looper;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostSubtitleConfig;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.15P7, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15P7 extends ConstraintLayout implements View.OnLayoutChangeListener {
    public final C16F5 LL;
    public final C16F5 LLILLJJLI;
    public final C16F5 LLILLL;
    public final C16F5 LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public C15P9 LLIZ;
    public C15P8 LLIZLLLIL;
    public Function0<Unit> LLJ;
    public final BPEAHandler LLJI;
    public final ARunnableS115S0100000_15 LLJIJIL;
    public final long LLJILJIL;
    public float LLJILJILJ;
    public float LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;

    private final int getMaxTextWidthPx() {
        return (int) (240 * getResources().getDisplayMetrics().density);
    }

    private final int getNameContentGapPx() {
        if (C726770Sf5.LIZ(getContext())) {
            return 0;
        }
        return ((int) getResources().getDisplayMetrics().density) * 2;
    }

    private final String getNameSeparator() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C497740JfY.LJIJI(2131851906));
        sbLIZ.append(' ');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void hide() {
        if (getVisibility() == 0) {
            int visibility = getVisibility();
            setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, this);
            this.LLJI.removeCallbacks(this.LLJIJIL);
            C15P9 c15p9 = this.LLIZ;
            if (c15p9 != null) {
                c15p9.LIZLLL.clear();
                c15p9.LIZJ.clear();
            }
            this.LL.setText((CharSequence) null);
            this.LLILLL.setText((CharSequence) null);
            this.LLILLJJLI.setText((CharSequence) null);
            this.LLILZ.setText((CharSequence) null);
        }
    }

    public final void l0() {
        View view;
        View viewFindViewById;
        Object parent = getParent();
        if (!(parent instanceof View) || (view = (View) parent) == null) {
            return;
        }
        boolean z = C915980Zwa.LJII().L6() || C915980Zwa.LIZLLL().dw1();
        float width = view.getWidth() - getWidth();
        if (width < 0.0f) {
            width = 0.0f;
        }
        float height = view.getHeight() - getHeight();
        if (height < 0.0f) {
            height = 0.0f;
        }
        View rootView = getRootView();
        if (rootView == null || (viewFindViewById = rootView.findViewById(R.id.o_c)) == null) {
            if (z) {
                width = 0.0f;
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setX(width);
            float f = z ? height : 0.0f;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setY(f);
            return;
        }
        if (z) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setX(0.0f);
            float fLIZLLL = C13LZ.LIZLLL(view.getHeight() - getHeight(), 0.0f, height);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setY(fLIZLLL);
            return;
        }
        float fLIZLLL2 = C13LZ.LIZLLL(view.getWidth() - getWidth(), 0.0f, width);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setX(fLIZLLL2);
        float fLIZLLL3 = C13LZ.LIZLLL(view.getHeight() - viewFindViewById.getHeight(), 0.0f, height);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setY(fLIZLLL3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hide();
    }

    public final Function0<Unit> getOnCloseClick() {
        return this.LLJ;
    }

    public C15P7(Context context) {
        super(context);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.z4);
        this.LLILZIL = C497740JfY.LIZLLL(R.attr.ezt, contextThemeWrapper);
        this.LLILZLL = C497740JfY.LIZLLL(R.attr.ezq, contextThemeWrapper);
        this.LLJI = new BPEAHandler(Looper.getMainLooper());
        this.LLJIJIL = new ARunnableS115S0100000_15(this, 98);
        this.LLJILJIL = ((long) LiveCoHostSubtitleConfig.INSTANCE.getValue().noSpeakerExitTimeoutSec) * 1000;
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.i2m, this, true);
        setId(R.id.wme);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(C497740JfY.LIZIZ(8));
        gradientDrawable.setColor(C497740JfY.LIZLLL(R.attr.exo, context));
        setBackground(gradientDrawable);
        this.LL = (C16F5) findViewById(R.id.tv_subtitle_top_name);
        this.LLILLJJLI = (C16F5) findViewById(R.id.tv_subtitle_top_content);
        this.LLILLL = (C16F5) findViewById(R.id.tv_subtitle_bottom_name);
        this.LLILZ = (C16F5) findViewById(R.id.tv_subtitle_bottom_content);
        C786410Ut5.I7(new ACListenerS165S0100000_31(this, 129), findViewById(R.id.wm3));
        setOnTouchListener(new ATListenerS463S0100000_31(this, 4));
    }

    private final void setBottomContentFullWidth(boolean z) {
        C19ME c19me;
        ViewGroup.LayoutParams layoutParams = this.LLILZ.getLayoutParams();
        if ((layoutParams instanceof C19ME) && (c19me = (C19ME) layoutParams) != null) {
            int i = (int) (6 * getResources().getDisplayMetrics().density);
            if (z) {
                c19me.startToStart = 0;
                c19me.startToEnd = -1;
                c19me.setMarginStart(i);
            } else {
                c19me.startToEnd = R.id.tv_subtitle_bottom_name;
                c19me.startToStart = -1;
                c19me.setMarginStart(getNameContentGapPx());
            }
            C786410Ut5.y6(this.LLILZ, c19me);
        }
    }

    public final String j0(String str) {
        TextPaint paint = this.LLILLJJLI.getPaint();
        float fMeasureText = (58 * getResources().getDisplayMetrics().density) - paint.measureText(getNameSeparator());
        if (fMeasureText < 0.0f) {
            fMeasureText = 0.0f;
        }
        String string = TextUtils.ellipsize(str, paint, fMeasureText, TextUtils.TruncateAt.END).toString();
        if (C726770Sf5.LIZ(getContext())) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(getNameSeparator());
            sbLIZ.append(string);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(string);
        sbLIZ2.append(getNameSeparator());
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public final boolean n0(C15PC c15pc) {
        if (c15pc.LIZIZ.length() == 0) {
            return false;
        }
        int maxTextWidthPx = (getMaxTextWidthPx() - ((int) this.LLILLJJLI.getPaint().measureText(j0(c15pc.LIZ)))) - getNameContentGapPx();
        if (maxTextWidthPx < 1) {
            maxTextWidthPx = 1;
        }
        String str = c15pc.LIZIZ;
        if (str.length() == 0 || StaticLayout.Builder.obtain(str, 0, str.length(), this.LLILLJJLI.getPaint(), maxTextWidthPx).build().getLineCount() <= 1) {
            return false;
        }
        return true;
    }

    public final void s0(C15PC c15pc) {
        boolean z;
        Pair<String, String> pairU0;
        int maxTextWidthPx = (getMaxTextWidthPx() - ((int) this.LLILLJJLI.getPaint().measureText(j0(c15pc.LIZ)))) - getNameContentGapPx();
        if (maxTextWidthPx < 1) {
            maxTextWidthPx = 1;
        }
        String str = c15pc.LIZIZ;
        int maxTextWidthPx2 = getMaxTextWidthPx();
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            pairU0 = new Pair<>("", "");
        } else {
            TextPaint paint = this.LLILLJJLI.getPaint();
            pairU0 = u0(str, this, maxTextWidthPx, paint, maxTextWidthPx2, 0);
            if (pairU0 == null) {
                int length = str.length() - 1;
                pairU0 = null;
                int i = 1;
                while (i <= length) {
                    int i2 = (i + length) / 2;
                    Pair<String, String> pairU02 = u0(str, this, maxTextWidthPx, paint, maxTextWidthPx2, i2);
                    if (pairU02 != null) {
                        length = i2 - 1;
                        pairU0 = pairU02;
                    } else {
                        i = i2 + 1;
                    }
                }
                if (pairU0 == null) {
                    pairU0 = new Pair<>(h0(maxTextWidthPx, str), "");
                }
            }
        }
        String first = pairU0.getFirst();
        String second = pairU0.getSecond();
        C16F5 c16f5 = this.LL;
        c16f5.setText(j0(c15pc.LIZ));
        c16f5.setTextColor(this.LLILZIL);
        C786410Ut5.LLJJJJ(c16f5, 0);
        e0(this.LLILLJJLI, first);
        e0(this.LLILZ, second);
        C786410Ut5.LLJJJJ(this.LLILLL, 8);
        setBottomContentFullWidth(true);
        C15P8 c15p8 = this.LLIZLLLIL;
        if (c15p8 != null) {
            c15p8.LIZ(c15pc);
        }
    }

    public final void setOnCloseClick(Function0<Unit> function0) {
        this.LLJ = function0;
    }

    public final void e0(C16F5 c16f5, String str) {
        if (str.length() == 0) {
            C786410Ut5.LLJJJJ(c16f5, 8);
            return;
        }
        c16f5.setText(str);
        c16f5.setTextColor(this.LLILZLL);
        C786410Ut5.LLJJJJ(c16f5, 0);
    }

    public final String h0(int i, String str) {
        if (str.length() != 0 && i > 0) {
            return TextUtils.ellipsize(str, this.LLILLJJLI.getPaint(), i, TextUtils.TruncateAt.START).toString();
        }
        return str;
    }

    public final String i0(int i, String str, boolean z) {
        if (!z) {
            return str;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((char) 8230);
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (this.LLILLJJLI.getPaint().measureText(strLIZIZ) > i) {
            return h0(i, strLIZIZ);
        }
        return strLIZIZ;
    }

    public final void p0(C15PC c15pc, C16F5 c16f5, C16F5 c16f52) {
        if (c16f52 == this.LLILZ) {
            setBottomContentFullWidth(false);
        }
        int maxTextWidthPx = (getMaxTextWidthPx() - ((int) this.LLILLJJLI.getPaint().measureText(j0(c15pc.LIZ)))) - getNameContentGapPx();
        if (maxTextWidthPx < 1) {
            maxTextWidthPx = 1;
        }
        c16f5.setText(j0(c15pc.LIZ));
        c16f5.setTextColor(this.LLILZIL);
        C786410Ut5.LLJJJJ(c16f5, 0);
        e0(c16f52, h0(maxTextWidthPx, c15pc.LIZIZ));
        C15P8 c15p8 = this.LLIZLLLIL;
        if (c15p8 != null) {
            c15p8.LIZ(c15pc);
        }
    }

    public static final Pair<String, String> u0(String str, C15P7 c15p7, int i, TextPaint textPaint, int i2, int i3) {
        int i4;
        String strSubstring = str.substring(i3);
        boolean z = true;
        if (i < 1) {
            i4 = 1;
        } else {
            i4 = i;
        }
        c15p7.getClass();
        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(strSubstring, 0, strSubstring.length(), c15p7.LLILLJJLI.getPaint(), i4).build();
        if (staticLayoutBuild.getLineCount() <= 1) {
            if (i3 <= 0) {
                z = false;
            }
            return new Pair<>(c15p7.i0(i, strSubstring, z), "");
        }
        int lineEnd = staticLayoutBuild.getLineEnd(0);
        String string = a0.LJLILLLLZI(strSubstring.substring(0, lineEnd)).toString();
        String string2 = a0.LJLJJL(strSubstring.substring(lineEnd)).toString();
        if (textPaint.measureText(string2) <= i2) {
            if (i3 <= 0) {
                z = false;
            }
            return new Pair<>(c15p7.i0(i, string, z), string2);
        }
        return null;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (!this.LLJJI) {
            l0();
        }
    }
}
