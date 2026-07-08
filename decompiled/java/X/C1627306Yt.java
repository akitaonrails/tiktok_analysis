package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.06Yt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1627306Yt extends LinearLayout {
    public final C197039127h LL;
    public final C197039127h LLILLJJLI;
    public final TuxTextView LLILLL;

    public final C197039127h getButton1() {
        return this.LL;
    }

    public final C197039127h getButton2() {
        return this.LLILLJJLI;
    }

    public final TuxTextView getButton3() {
        return this.LLILLL;
    }

    public C1627306Yt(Context context) {
        super(context);
        C197039127h c197039127h = new C197039127h(context, null, 6, 0);
        this.LL = c197039127h;
        C197039127h c197039127h2 = new C197039127h(context, null, 6, 0);
        this.LLILLJJLI = c197039127h2;
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        this.LLILLL = tuxTextView;
        setOrientation(1);
        LIZ(this.LL, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        LIZ(this.LLILLJJLI, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        TuxTextView tuxTextView2 = this.LLILLL;
        tuxTextView2.setMinWidth(0);
        tuxTextView2.setMaxWidth(Integer.MAX_VALUE);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)));
        layoutParams.setMargins(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), 0);
        C786410Ut5.R6(tuxTextView2, layoutParams);
        tuxTextView2.setTuxFont(41);
        tuxTextView2.setTextColorRes(R.attr.a1j);
        tuxTextView2.setGravity(17);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.c5, tuxTextView2.getContext());
        tuxTextView2.setBackgroundColor(numLIZJ != null ? numLIZJ.intValue() : 0);
        C427690Gpr.LJI(tuxTextView2, null);
        addView(c197039127h);
        addView(c197039127h2);
        addView(tuxTextView);
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public static void LIZ(C197039127h c197039127h, int i) {
        c197039127h.setButtonVariant(1);
        c197039127h.setButtonSize(3);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), i, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), 0);
        C786410Ut5.J6(c197039127h, layoutParams);
    }
}
