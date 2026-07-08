package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchLoadingTextLayout$3;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.zhiliaoapp.musically.R;
import java.text.NumberFormat;

/* JADX INFO: renamed from: X.15nR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20626315nR extends LinearLayout {
    public final TuxTextView LL;
    public final C20626615nU LLILLJJLI;
    public boolean LLILLL;
    public CharSequence LLILZ;
    public final C1295950jpR LLILZIL;
    public C20626415nS LLILZLL;

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        C20626615nU c20626615nU;
        super.onAttachedToWindow();
        C20626615nU c20626615nU2 = this.LLILLJJLI;
        if ((c20626615nU2 == null || this.LLILLL != c20626615nU2.LIZJ()) && (c20626615nU = this.LLILLJJLI) != null) {
            c20626615nU.setLoading(this.LLILLL);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20626615nU c20626615nU = this.LLILLJJLI;
        this.LLILLL = c20626615nU != null ? c20626615nU.LIZJ() : false;
        if (this.LLILZIL.LJIIIZ()) {
            this.LLILZIL.LJIIJJI();
        }
    }

    public void setText(CharSequence charSequence) {
        this.LLILZ = charSequence;
        SpannableString spannableString = new SpannableString(this.LLILZ + "\u200b");
        C419890GdH c419890GdH = new C419890GdH(this.LLILZIL, 2);
        c419890GdH.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C444960Hcc.LIZJ(getContext()));
        C786410Ut5.p2(spannableString, c419890GdH, this.LLILZ.length(), this.LLILZ.length() + 1, 18);
        TuxTextView tuxTextView = this.LL;
        if (tuxTextView != null) {
            tuxTextView.setText(spannableString);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if ((i != 4 && i != 8) || !this.LLILZIL.LJIIIZ()) {
            return;
        }
        this.LLILZIL.stop();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.15nS] */
    public C20626315nR(Context context, AttributeSet attributeSet) {
        C1294720jnS c1294720jnS;
        int iIntValue;
        super(context, attributeSet, 0);
        this.LLILLL = true;
        this.LLILZ = "";
        C1295950jpR c1295950jpR = new C1295950jpR();
        this.LLILZLL = new Drawable.Callback() { // from class: X.15nS
            @Override // android.graphics.drawable.Drawable.Callback
            public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public final void invalidateDrawable(Drawable drawable) {
                AbstractC19994813Le.Default.nextInt(0, LSPassThroughRecordSizeConfig.DEFAULT);
                TuxTextView tuxTextView = this.LL.LL;
                if (tuxTextView != null) {
                    tuxTextView.invalidate();
                }
            }
        };
        c1295950jpR.setCallback(this.LLILZLL);
        if (C467860IWi.LIZ(getContext())) {
            c1294720jnS = C1294250jmh.LIZJ(getContext(), "search_tako_dots_loading_darkmode_tux_lottie.json").LIZ;
        } else {
            c1294720jnS = C1294250jmh.LIZJ(getContext(), "search_tako_dots_loading_lightmode_tux_lottie.json").LIZ;
        }
        c1295950jpR.LJIILL(c1294720jnS);
        c1295950jpR.LJJIIJ(-1);
        c1295950jpR.setBounds(new Rect(0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))));
        this.LLILZIL = c1295950jpR;
        NumberFormat.getPercentInstance();
        setOrientation(1);
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setMaxLines(2);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        tuxTextView.setTextColor(iIntValue);
        tuxTextView.setTuxFont(41);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.leftMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        marginLayoutParams.rightMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        C786410Ut5.R6(tuxTextView, marginLayoutParams);
        tuxTextView.setGravity(8388611);
        this.LL = tuxTextView;
        C20626615nU c20626615nU = new C20626615nU(context, null, 6);
        c20626615nU.setRadius(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        C426750GoL.LJIIL(c20626615nU, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), 0, 16);
        c20626615nU.setPlaceholderConfig(new C20626915nX("100%,100%").LIZIZ());
        Paint paint = new Paint();
        paint.setTextSize(C418440Gaw.LIZIZ(14));
        c20626615nU.setFontConfig(new C1428010nGR(C418440Gaw.LIZIZ(26), paint));
        this.LLILLJJLI = c20626615nU;
        addView(tuxTextView);
        addView(c20626615nU);
        SAFHelper sAFHelper = SAFHelper.LIZ;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        sAFHelper.getClass();
        C325901Of.LIZIZ(SAFHelper.LJIJI(this, c19egLIZIZ), new SearchLoadingTextLayout$3(this));
    }
}
