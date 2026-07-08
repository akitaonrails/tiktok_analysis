package X;

import Y.ACListenerS147S0100000_12;
import Y.ARunnableS112S0100000_12;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0T8L, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T8L extends FrameLayout {
    public Function0<Unit> LL;
    public Function0<? extends View> LLILLJJLI;
    public final View LLILLL;
    public boolean LLILZ;

    public final void setFullScreen(boolean z) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        View view;
        super.onAttachedToWindow();
        HandlerHook.viewPost(this, new ARunnableS112S0100000_12(this, 447));
        Object parent = getParent();
        if ((parent instanceof View) && (view = (View) parent) != null) {
            C786410Ut5.I7(null, view);
            view.setClickable(false);
        }
        Function0<? extends View> function0 = this.LLILLJJLI;
        if (function0 != null) {
            LIZ(function0);
            HandlerHook.viewPost(this, new ARunnableS112S0100000_12(function0, (Function0<Unit>) 448));
            HandlerHook.viewPostDelay(this, new ARunnableS112S0100000_12(function0, (Function0<Unit>) 449), 400L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.LLILZ) {
            this.LLILZ = false;
            EventBus.LIZLLL().LJJI(this);
            EventBus.LIZLLL().LJIJJLI(C0T8M.class);
        }
    }

    public final Function0<View> getDefaultCloseIconProvider() {
        return this.LLILLJJLI;
    }

    public final Function0<Unit> getOnCloseClick() {
        return this.LL;
    }

    public C0T8L(Context context) {
        super(context, null, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.fr7, this, true);
        View viewFindViewById = findViewById(R.id.xcg);
        this.LLILLL = viewFindViewById;
        C786410Ut5.I7(new ACListenerS147S0100000_12((Object) this, 437), viewFindViewById);
    }

    public static final void LIZ(Function0<? extends View> function0) {
        View viewInvoke = function0.invoke();
        if (viewInvoke != null && viewInvoke.getVisibility() != 8) {
            C786410Ut5.LJLLLLLL(8, viewInvoke);
        }
    }

    @C14EU(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onCloseButtonPositioned(C0T8M c0t8m) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = this.LLILLL.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            int i = c0t8m.LIZ - iArr[1];
            if (i < 0) {
                i = 0;
            }
            marginLayoutParams.topMargin = i;
            C786410Ut5.W5(this.LLILLL, marginLayoutParams);
        }
    }

    public final void setDefaultCloseIconProvider(Function0<? extends View> function0) {
        this.LLILLJJLI = function0;
    }

    public final void setOnCloseClick(Function0<Unit> function0) {
        this.LL = function0;
    }
}
