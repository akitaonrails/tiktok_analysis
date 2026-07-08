package X;

import Y.ACListenerS155S0100000_21;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0lmG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1370860lmG extends FrameLayout {
    public static final /* synthetic */ int LLIZLLLIL = 0;
    public final BaseSharePackage LL;
    public final Function0<Unit> LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public C1295960jpS LLILZIL;
    public TuxIconView LLILZLL;
    public LinearLayout LLIZ;

    private final LinearLayout getContainer() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.nj9);
            this.LLIZ = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    private final TuxTextView getDescView() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.y_c);
            this.LLILLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    private final TuxTextView getDividerView() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.y_e);
            this.LLILZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    private final TuxIconView getIvClose() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.lc0);
            this.LLILZLL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    private final C1295960jpS getLottieAnimationView() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.b46);
            this.LLILZIL = (C1295960jpS) callbackFindViewById;
        }
        return (C1295960jpS) callbackFindViewById;
    }

    public C1370860lmG(Context context, BaseSharePackage baseSharePackage, C1370870lmH c1370870lmH, AwS565S0100000_21 awS565S0100000_21) {
        int i;
        CharSequence charSequence;
        TuxTextView descView;
        String string;
        super(context);
        this.LL = baseSharePackage;
        this.LLILLJJLI = awS565S0100000_21;
        if (baseSharePackage.extras.getBoolean("hit_group_hatching_exp", false)) {
            i = R.layout.cpq;
        } else {
            i = R.layout.cpp;
        }
        FrameLayout.inflate(getContext(), i, this);
        if (!c1370870lmH.LIZ) {
            int visibility = getVisibility();
            setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, this);
            return;
        }
        String str = c1370870lmH.LJ;
        if (str != null && str.length() != 0 && (charSequence = c1370870lmH.LIZIZ) != null && charSequence.length() != 0) {
            int visibility2 = getVisibility();
            setVisibility(0);
            C1602160rnK.LIZIZ(visibility2, 0, this);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(c1370870lmH.LIZIZ);
            String str2 = c1370870lmH.LIZJ;
            if (str2 != null) {
                int iLJJJ = a0.LJJJ(spannableStringBuilder, str2, 0, false, 6);
                if (iLJJJ < 0) {
                    return;
                }
                C786410Ut5.q2(spannableStringBuilder, new C511601z0(this, c1370870lmH.LIZLLL, 1), iLJJJ, str2.length() + iLJJJ, 33);
                TuxTextView descView2 = getDescView();
                if (descView2 != null) {
                    descView2.setText(spannableStringBuilder);
                    descView2.setMovementMethod(LinkMovementMethod.getInstance());
                    descView2.setHighlightColor(0);
                    descView2.getPaint().setTextSkewX(-0.15f);
                }
                TuxTextView dividerView = getDividerView();
                if (dividerView != null) {
                    dividerView.setText(c1370870lmH.LJFF);
                }
            } else if (getDescView() != null && (descView = getDescView()) != null) {
                descView.setText(c1370870lmH.LIZIZ);
            }
            TuxIconView ivClose = getIvClose();
            if (ivClose != null) {
                C786410Ut5.a9(ivClose, new ACListenerS155S0100000_21(this, 139));
            }
            C1295960jpS lottieAnimationView = getLottieAnimationView();
            C786410Ut5.LLD(0, lottieAnimationView);
            try {
                lottieAnimationView.setAnimation(new C0VSP(c1370870lmH.LJ), c1370870lmH.LJ);
                lottieAnimationView.setRepeatCount(-1);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            lottieAnimationView.playAnimation();
            LinearLayout container = getContainer();
            if (container == null || (string = this.LL.extras.getString("share_panel_bg_url", "")) == null) {
                return;
            }
            C1331660kl2.LJIIIZ(string).LJJIIJ(new C517601zy(this, container, 0));
            return;
        }
        int visibility3 = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility3, 8, this);
    }
}
