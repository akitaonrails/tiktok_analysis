package X;

import Y.ACListenerS110S0200000_6;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0HZa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C443080HZa extends LinearLayout {
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public Function0<Unit> LLILZIL;

    public final Function0<Unit> getDismissCallback() {
        return this.LLILZIL;
    }

    public C443080HZa(Context context) {
        super(context, null, R.attr.y_);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, R$styleable.TuxMenuCell, R.attr.y_, 0);
        this.LL = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxMenuCell_tux_menuCellPrimaryColor, 0);
        this.LLILLJJLI = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxMenuCell_tux_menuCellDestructiveColor, 0);
        this.LLILLL = typedArrayObtainStyledAttributes.getInteger(R$styleable.TuxMenuCell_tux_menuCellMessageFont, 0);
        this.LLILZ = typedArrayObtainStyledAttributes.getInteger(R$styleable.TuxMenuCell_tux_menuCellSeparatorColor, 0);
        typedArrayObtainStyledAttributes.recycle();
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        setPadding(iLIZIZ, iLIZIZ, iLIZIZ, iLIZIZ);
        setOrientation(1);
    }

    public final void setDismissCallback(Function0<Unit> function0) {
        this.LLILZIL = function0;
    }

    public final void setMenuActions(List<? extends List<C443090HZb>> list) {
        int i;
        int iLIZIZ;
        int iLIZIZ2;
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeAllViews();
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        for (List<C443090HZb> list2 : list) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                for (C443090HZb c443090HZb : list2) {
                    LinearLayout linearLayout = new LinearLayout(getContext());
                    linearLayout.setOrientation(i2);
                    linearLayout.setGravity(16);
                    int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                    linearLayout.setPadding(iLIZIZ3, iLIZIZ3, iLIZIZ3, iLIZIZ3);
                    if (c443090HZb.LJI == 0) {
                        i = this.LL;
                    } else {
                        i = this.LLILLJJLI;
                    }
                    LIZ(c443090HZb.LIZJ, c443090HZb.LIZLLL, linearLayout, i);
                    TuxTextView tuxTextView = new TuxTextView(getContext(), null, 6, i2);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams.weight = 1.0f;
                    if (c443090HZb.LIZJ == 0 && c443090HZb.LIZLLL == null) {
                        iLIZIZ = 0;
                    } else {
                        iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                    }
                    layoutParams.setMarginStart(iLIZIZ);
                    if (c443090HZb.LJ == 0 && c443090HZb.LJFF == null) {
                        iLIZIZ2 = 0;
                    } else {
                        iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                    }
                    layoutParams.setMarginEnd(iLIZIZ2);
                    C786410Ut5.R6(tuxTextView, layoutParams);
                    if (c443090HZb.LJIIIIZZ) {
                        tuxTextView.setMaxLines(1);
                        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                    }
                    tuxTextView.setTuxFont(this.LLILLL);
                    tuxTextView.setText(c443090HZb.LIZ);
                    tuxTextView.setTextColor(i);
                    tuxTextView.setTextDirection(5);
                    linearLayout.addView(tuxTextView);
                    LIZ(c443090HZb.LJ, c443090HZb.LJFF, linearLayout, i);
                    if (c443090HZb.LJII) {
                        C786410Ut5.W4(linearLayout, 1.0f);
                        C427690Gpr.LJ(linearLayout, C418440Gaw.LIZIZ(10));
                        if (c443090HZb.LIZIZ != null) {
                            C786410Ut5.R7(linearLayout, new ACListenerS110S0200000_6(c443090HZb, this, 62));
                        }
                    } else {
                        C786410Ut5.W4(linearLayout, 0.4f);
                        if (c443090HZb.LJIIIZ != null) {
                            C786410Ut5.R7(linearLayout, new ACListenerS110S0200000_6(c443090HZb, this, 63));
                        }
                    }
                    addView(linearLayout, new LinearLayout.LayoutParams(-1, -2));
                    i2 = 0;
                }
                if (i3 != size - 1) {
                    View frameLayout = new FrameLayout(getContext());
                    frameLayout.setBackgroundColor(this.LLILZ);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))));
                    layoutParams2.leftMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                    layoutParams2.rightMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                    layoutParams2.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                    layoutParams2.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                    addView(frameLayout, layoutParams2);
                }
                i3 = i4;
                i2 = 0;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    public final void LIZ(int i, Function1<? super LinearLayout, ? extends View> function1, LinearLayout linearLayout, int i2) {
        View view;
        if (i != 0) {
            TuxIconView tuxIconView = new TuxIconView(getContext(), null, 0, 6, null);
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            C786410Ut5.M6(tuxIconView, new LinearLayout.LayoutParams(iLIZIZ, iLIZIZ));
            tuxIconView.setIconRes(i);
            tuxIconView.setTintColor(i2);
            view = tuxIconView;
        } else {
            if (function1 == null) {
                return;
            }
            View viewInvoke = function1.invoke(linearLayout);
            view = viewInvoke;
            if (viewInvoke == null) {
                return;
            }
        }
        linearLayout.addView(view);
    }
}
