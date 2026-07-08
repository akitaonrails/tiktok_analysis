package X;

import Y.ACListenerS150S0100000_15;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bOz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C972030bOz extends LinearLayout {
    public final C16FV LL;
    public final C20743416Fc LLILLJJLI;
    public final View LLILLL;
    public Function0<Unit> LLILZ;

    public final void setCreateAction(Function0<Unit> function0) {
        this.LLILZ = function0;
    }

    public final void setIsHideCoverAndUpdateUi(boolean z) throws Throwable {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (z) {
            C500260Jjc.LJLJLJ(this.LL, false);
            this.LLILLJJLI.setTextColor(C20736316Cj.LIZIZ(R.attr.ezs, getContext()));
            ViewParent parent = getParent();
            if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
                ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
                layoutParams.height = C439101nJ.LIZ(173);
                C786410Ut5.X5(layoutParams, viewGroup2);
                return;
            }
            return;
        }
        C500260Jjc.LJLJLJ(this.LL, true);
        this.LLILLJJLI.setTextColor(C20736316Cj.LIZIZ(R.attr.ezt, getContext()));
        ViewParent parent2 = getParent();
        if (!(parent2 instanceof ViewGroup) || (viewGroup = (ViewGroup) parent2) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
        layoutParams2.height = -1;
        C786410Ut5.X5(layoutParams2, viewGroup);
    }

    public C972030bOz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.Sd(R.layout.hf5, C972080bP4.LIZ(C786410Ut5.ne(context)), this);
        setOrientation(1);
        this.LL = (C16FV) findViewById(R.id.xn5);
        C972080bP4.LIZJ(this.LL, "ttlive_multi_guest_text_header_human_star_light.png");
        this.LLILLJJLI = (C20743416Fc) findViewById(R.id.xn6);
        View viewFindViewById = findViewById(R.id.xn4);
        this.LLILLL = viewFindViewById;
        C786410Ut5.I7(new ACListenerS150S0100000_15(this, 250), viewFindViewById);
    }
}
