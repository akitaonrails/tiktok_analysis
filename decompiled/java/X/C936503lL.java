package X;

import Y.AAListenerS314S0100000_1;
import Y.AUListenerS252S0100000_1;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS30S2100000_1;

/* JADX INFO: renamed from: X.03lL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C936503lL extends ConstraintLayout {
    public static final /* synthetic */ int LLJILJIL = 0;
    public final RadiusLayout LL;
    public final ConstraintLayout LLILLJJLI;
    public final TuxTextView LLILLL;
    public final TuxIconView LLILZ;
    public ValueAnimator LLILZIL;
    public final long LLILZLL;
    public final int LLIZ;
    public String LLIZLLLIL;
    public String LLJ;
    public boolean LLJI;
    public ValueAnimator LLJIJIL;

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.LLILZIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LLILZIL = null;
    }

    public final void e0(String str) {
        if (this.LL.getVisibility() == 0 && !this.LLJI) {
            this.LLJI = true;
            Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("EVENT_ORIGIN_FEATURE", "TEMAI"), new Pair("disappear_type", str));
            String str2 = this.LLIZLLLIL;
            if (str2 != null) {
                mapLJIIJ.put("page_name", str2);
            }
            HashMap<String, Object> mapLJIIJ2 = C1741890vQh.LJIIJ(this.LLJ);
            if (mapLJIIJ2 != null) {
                mapLJIIJ.putAll(mapLJIIJ2);
            }
            C1018703yb.LIZIZ("tiktokec_bubble_disappear", mapLJIIJ);
        }
        ValueAnimator valueAnimator = this.LLJIJIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(600L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS252S0100000_1(this, 0));
        valueAnimatorOfFloat.addListener(new AAListenerS314S0100000_1(this, 0));
        valueAnimatorOfFloat.start();
        this.LLJIJIL = valueAnimatorOfFloat;
    }

    public C936503lL(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C936503lL(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        RadiusLayout radiusLayout = new RadiusLayout(context, null, 6);
        this.LL = radiusLayout;
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        this.LLILLJJLI = constraintLayout;
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        this.LLILLL = tuxTextView;
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        this.LLILZ = tuxIconView;
        this.LLILZLL = 800L;
        this.LLIZ = C0H9H.LIZIZ(6);
        RadiusLayout radiusLayout2 = this.LL;
        radiusLayout2.setId(View.generateViewId());
        C19ME c19me = new C19ME(-2, C0H9H.LIZIZ(42));
        c19me.matchConstraintMaxWidth = C0H9H.LIZIZ(358);
        C786410Ut5.b7(radiusLayout2, c19me);
        radiusLayout2.setPadding(C0H9H.LIZIZ(16), C0H9H.LIZIZ(12), C0H9H.LIZIZ(16), C0H9H.LIZIZ(12));
        C384050F3z c384050F3z = new C384050F3z();
        C1546210qL5.LIZ.getClass();
        c384050F3z.LIZJ = Float.valueOf(C1546210qL5.LIZ(26));
        c384050F3z.LIZ = C1308910kAL.LIZJ(R.attr.f509o0, context);
        radiusLayout2.setBackground(c384050F3z.LIZ(context));
        C786410Ut5.m6(this.LLILLJJLI, new C19ME(-2, -1));
        TuxIconView tuxIconView2 = this.LLILZ;
        tuxIconView2.setId(View.generateViewId());
        C19ME c19me2 = new C19ME(C0H9H.LIZIZ(18), C0H9H.LIZIZ(18));
        c19me2.endToEnd = 0;
        c19me2.topToTop = 0;
        c19me2.bottomToBottom = 0;
        C786410Ut5.M6(tuxIconView2, c19me2);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
        c419910GdJ.LIZ = R.raw.icon_chevron_down_double;
        c419910GdJ.LJ = Integer.valueOf(R.attr.o1);
        tuxIconView2.setTuxIcon(c419910GdJ);
        tuxIconView2.setPadding(0, 0, 0, C0H9H.LIZIZ(6));
        TuxTextView tuxTextView2 = this.LLILLL;
        tuxTextView2.setId(View.generateViewId());
        C19ME c19me3 = new C19ME(-2, -1);
        c19me3.endToStart = tuxIconView.getId();
        c19me3.topToTop = 0;
        c19me3.startToStart = 0;
        c19me3.bottomToBottom = 0;
        c19me3.setMarginEnd(C0H9H.LIZIZ(4));
        c19me3.constrainedWidth = true;
        C786410Ut5.R6(tuxTextView2, c19me3);
        tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView2.setSingleLine(true);
        constraintLayout.addView(tuxTextView);
        constraintLayout.addView(tuxIconView);
        radiusLayout.addView(constraintLayout);
        addView(radiusLayout);
    }

    public final void h0(C19EG c19eg, ECRichText eCRichText, final String str, final Map map, final Function0 function0) {
        if (eCRichText == null) {
            return;
        }
        C12ES.LJIILL(0, this);
        C786410Ut5.LLZZ(this.LL, 0);
        C786410Ut5.G5(this.LL, 1.0f);
        this.LLJI = false;
        this.LLIZLLLIL = "order_submit";
        this.LLJ = str;
        TuxTextView tuxTextView = this.LLILLL;
        C03B0 c03b0 = new C03B0(this.LLILLL, "order_submit_elevator_bar_text");
        C03B0.LIZ(c03b0, eCRichText, null, null, false, c19eg, null, 94);
        tuxTextView.setText(c03b0.LIZJ);
        ValueAnimator valueAnimator = this.LLILZIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LLILZIL = null;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f, 0.0f);
        this.LLILZIL = valueAnimatorOfFloat;
        if (valueAnimatorOfFloat != null) {
            valueAnimatorOfFloat.setDuration(this.LLILZLL);
        }
        ValueAnimator valueAnimator2 = this.LLILZIL;
        if (valueAnimator2 != null) {
            valueAnimator2.setRepeatCount(-1);
        }
        ValueAnimator valueAnimator3 = this.LLILZIL;
        if (valueAnimator3 != null) {
            valueAnimator3.addUpdateListener(new AUListenerS252S0100000_1(this, 2));
        }
        ValueAnimator valueAnimator4 = this.LLILZIL;
        if (valueAnimator4 != null) {
            valueAnimator4.start();
        }
        C786410Ut5.I7(new AbstractViewOnClickListenerC1173120gdK() { // from class: X.037q
            public final /* synthetic */ String LLILZLL = "order_submit";

            @Override // X.AbstractViewOnClickListenerC1173120gdK
            public final void LIZ(View view) {
                function0.invoke();
                C1748720vbi.LIZLLL(this, new C10485048d(), new AwS30S2100000_1(this.LLILZLL, str, (String) map, (Map<String, ? extends Object>) 7));
                this.e0("click_bubble");
            }
        }, this);
        C1748720vbi.LIZLLL(this, new C10484048c(), new AwS30S2100000_1(str, map, 8));
    }
}
