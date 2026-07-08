package X;

import Y.AAListenerS323S0100000_12;
import Y.AUListenerS214S0200000_2;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cX9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1015530cX9 extends FrameLayout {
    public TuxIconView LL;
    public TuxTextView LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public Animator LLILZIL;

    public final void LIZIZ() {
        LinearLayout.LayoutParams layoutParams;
        this.LLILZ = true;
        if (this.LLILLL) {
            this.LLILLL = false;
            Animator animator = this.LLILZIL;
            if (animator != null) {
                animator.cancel();
            }
            TuxTextView hintsTvFromXml = getHintsTvFromXml();
            if (hintsTvFromXml != null) {
                ViewGroup.LayoutParams layoutParams2 = hintsTvFromXml.getLayoutParams();
                if (!(layoutParams2 instanceof LinearLayout.LayoutParams) || (layoutParams = (LinearLayout.LayoutParams) layoutParams2) == null) {
                    return;
                }
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, -(layoutParams.getMarginStart() + hintsTvFromXml.getWidth()));
                valueAnimatorOfInt.addUpdateListener(new AUListenerS214S0200000_2(layoutParams, hintsTvFromXml, 3));
                valueAnimatorOfInt.addListener(new AAListenerS323S0100000_12(hintsTvFromXml, 9));
                valueAnimatorOfInt.setStartDelay(2000L);
                valueAnimatorOfInt.setDuration(350L);
                this.LLILZIL = valueAnimatorOfInt;
                valueAnimatorOfInt.start();
            }
        }
    }

    private final TuxTextView getHintsTvFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jp7);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    private final TuxIconView getIconViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.k55);
            this.LL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public C1015530cX9(Context context) {
        super(context, null, 0);
        C786410Ut5.Sd(R.layout.qt, C786410Ut5.ne(context), this);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.im);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(999));
        setBackground(c384050F3z.LIZ(context));
        TuxIconView iconViewFromXml = getIconViewFromXml();
        if (iconViewFromXml != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            c419910GdJ.LIZ = R.raw.icon_link_fill;
            c419910GdJ.LJ = Integer.valueOf(R.attr.zi);
            iconViewFromXml.setTuxIcon(c419910GdJ);
        }
        this.LLILLL = true;
    }

    public final void LIZ(String str) {
        TuxTextView hintsTvFromXml = getHintsTvFromXml();
        if (hintsTvFromXml != null) {
            hintsTvFromXml.setText(str);
        }
    }

    public final void LIZJ(FrameLayout frameLayout, JSONObject jSONObject) {
        boolean z;
        Integer numValueOf;
        TuxTextView hintsTvFromXml;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONObject jSONObjectOptJSONObject3;
        if (frameLayout == null) {
            return;
        }
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("carousel_container_info");
        JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("carousel_extra_data");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        Context context = getContext();
        int i = 0;
        if (context != null && C426750GoL.LIZLLL(context)) {
            z = true;
            layoutParams.leftMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        } else {
            z = false;
            layoutParams.rightMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        }
        if (jSONObjectOptJSONObject4 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject4.optJSONObject("position_list")) != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("top_safe_area_position")) != null && (jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject("carousel_pic_position")) != null) {
            layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(Math.max(jSONObjectOptJSONObject2.optInt("height") + 48, jSONObjectOptJSONObject3.optInt("y") + 16))));
            if (z) {
                layoutParams.leftMargin = jSONObjectOptJSONObject3.optInt("x") + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            } else {
                Context context2 = getContext();
                if (context2 != null) {
                    layoutParams.rightMargin = (C497820Jfg.LIZIZ(context2) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(jSONObjectOptJSONObject3.optInt("x") + jSONObjectOptJSONObject3.optInt("width"))))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                }
            }
        }
        layoutParams.gravity = 8388661;
        Integer numValueOf2 = null;
        if (jSONObjectOptJSONObject4 != null) {
            numValueOf = Integer.valueOf(jSONObjectOptJSONObject4.optInt("current_index", -1));
        } else {
            numValueOf = null;
        }
        if (jSONObjectOptJSONObject5 != null) {
            numValueOf2 = Integer.valueOf(jSONObjectOptJSONObject5.optInt("dynamic_first_index", 0));
        }
        boolean zLJFF = Intrinsics.LJFF(numValueOf, numValueOf2);
        if (!this.LLILZ && (hintsTvFromXml = getHintsTvFromXml()) != null) {
            if (!this.LLILLL || !zLJFF) {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, hintsTvFromXml);
        }
        if (!Intrinsics.LJFF(getParent(), frameLayout)) {
            C1014320cVC.LIZLLL(this);
            frameLayout.addView(this, layoutParams);
        } else {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setLayoutParams(layoutParams);
        }
    }
}
