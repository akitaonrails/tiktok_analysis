package X;

import Y.ACListenerS154S0100000_19;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: renamed from: X.0ijc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1253900ijc extends LinearLayout {
    public final int LL;
    public final TuxTextView LLILLJJLI;
    public final TuxIconView LLILLL;
    public final View LLILZ;
    public final boolean LLILZIL;
    public final Function0<Unit> LLILZLL;
    public final int LLIZ;
    public final int LLIZLLLIL;
    public final List<C1253910ijd> LLJ;
    public int LLJI;
    public C0P0T LLJIJIL;

    public C1253900ijc() {
        throw null;
    }

    public final void LIZ() {
        View view;
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        if (c19252910Tv.LIZLLL().LJI().LLD()) {
            Object parent = getParent();
            if (!(parent instanceof View) || (view = (View) parent) == null || view.getHeight() <= this.LLILZ.getHeight()) {
                return;
            }
            C450720Hlu c450720Hlu = new C450720Hlu(getContext());
            c450720Hlu.LJIIJ(this.LL);
            c450720Hlu.LIZ(C426750GoL.LIZLLL(getContext()) ? this.LLILZ.getWidth() - (getWidth() / 2) : getWidth() / 2, c19252910Tv.LIZLLL().LJI().LJLJI(this.LLILZIL) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
            EnumC1235690iGF enumC1235690iGF = EnumC1235690iGF.TOP;
            C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
            c1391600mJi.LIZLLL = enumC1235690iGF;
            c1391600mJi.LJIJJ = true;
            c1391600mJi.LJII = Mp4ScreenVideoLoadTimeout.CONTROL;
            C0P0T c0p0tLIZIZ = c450720Hlu.LIZIZ();
            this.LLJIJIL = c0p0tLIZIZ;
            c0p0tLIZIZ.show();
            this.LLILZLL.invoke();
        }
    }

    public final void setCurrentTab(int i) {
        try {
            LinearLayout linearLayout = ((C1253910ijd) ((ArrayList) this.LLJ).get(this.LLJI)).LJ;
            int i2 = 0;
            if (linearLayout != null) {
                linearLayout.setSelected(false);
            }
            this.LLJI = i;
            LinearLayout linearLayout2 = ((C1253910ijd) ((ArrayList) this.LLJ).get(i)).LJ;
            if (linearLayout2 != null) {
                linearLayout2.setSelected(true);
            }
            this.LLILLJJLI.setText(((C1253910ijd) ((ArrayList) this.LLJ).get(this.LLJI)).LIZ);
            TuxIconView tuxIconView = this.LLILLL;
            if (((C1253910ijd) ((ArrayList) this.LLJ).get(this.LLJI)).LIZLLL == null) {
                i2 = 8;
            }
            C786410Ut5.LJLLLLLL(i2, tuxIconView);
        } catch (IndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLJI = i;
        }
    }

    public final void setMenuActions(List<C1253910ijd> list) {
        int iLIZIZ;
        ((ArrayList) this.LLJ).clear();
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeAllViews();
        for (C1253910ijd c1253910ijd : list) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(0);
            linearLayout.setGravity(16);
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
            linearLayout.setPadding(iLIZIZ2, iLIZIZ2, iLIZIZ2, iLIZIZ2);
            int i = c1253910ijd.LIZJ;
            if (i != 0) {
                TuxIconView tuxIconView = new TuxIconView(getContext(), null, 0, 6, null);
                int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                C786410Ut5.M6(tuxIconView, new LinearLayout.LayoutParams(iLIZIZ3, iLIZIZ3));
                tuxIconView.setIconRes(i);
                tuxIconView.setTintColor(this.LLIZ);
                linearLayout.addView(tuxIconView);
            }
            TuxTextView tuxTextView = new TuxTextView(getContext(), null, 6, 0);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.weight = 1.0f;
            if (c1253910ijd.LIZJ != 0) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            } else {
                iLIZIZ = 0;
            }
            layoutParams.setMarginStart(iLIZIZ);
            C786410Ut5.R6(tuxTextView, layoutParams);
            tuxTextView.setMaxLines(1);
            tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
            tuxTextView.setTuxFont(this.LLIZLLLIL);
            CharSequence charSequenceLJJLJLI = C19252910Tv.LIZIZ.LIZLLL().LJI().LJJLJLI(getContext(), c1253910ijd.LIZ);
            c1253910ijd.LIZ = charSequenceLJJLJLI;
            tuxTextView.setText(charSequenceLJJLJLI);
            tuxTextView.setTextColor(this.LLIZ);
            tuxTextView.setTextDirection(5);
            linearLayout.addView(tuxTextView);
            C786410Ut5.W4(linearLayout, 1.0f);
            StateListDrawable stateListDrawable = new StateListDrawable();
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.o_, getContext());
            if (numLIZJ != null) {
                int iIntValue = numLIZJ.intValue();
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZ = Integer.valueOf(iIntValue);
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
                Drawable drawableLIZ = c384050F3z.LIZ(getContext());
                stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, drawableLIZ);
                stateListDrawable.addState(new int[]{android.R.attr.state_selected}, drawableLIZ);
                stateListDrawable.addState(new int[0], new ColorDrawable(0));
                linearLayout.setForeground(stateListDrawable);
                if (c1253910ijd.LIZIZ != null) {
                    C786410Ut5.R7(linearLayout, new ACListenerS154S0100000_19(c1253910ijd, 275));
                }
                c1253910ijd.LJ = linearLayout;
                ((ArrayList) this.LLJ).add(c1253910ijd);
                addView(linearLayout, new LinearLayout.LayoutParams(-1, -2));
            } else {
                return;
            }
        }
        C786410Ut5.x3(getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC1265990j37(this, 8));
        this.LLILLL.setTintColor(this.LLIZ);
        setCurrentTab(this.LLJI);
    }

    public C1253900ijc(Context context, TuxTextView tuxTextView, TuxIconView tuxIconView, View view, boolean z, AFwS213S0000000_24 aFwS213S0000000_24) {
        super(context, null, R.attr.y_);
        this.LL = 2131849543;
        this.LLILLJJLI = tuxTextView;
        this.LLILLL = tuxIconView;
        this.LLILZ = view;
        this.LLILZIL = z;
        this.LLILZLL = aFwS213S0000000_24;
        this.LLJ = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, R$styleable.TuxMenuCell, R.attr.y_, 0);
        this.LLIZ = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxMenuCell_tux_menuCellPrimaryColor, 0);
        this.LLIZLLLIL = typedArrayObtainStyledAttributes.getInteger(R$styleable.TuxMenuCell_tux_menuCellMessageFont, 0);
        typedArrayObtainStyledAttributes.recycle();
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        setPadding(iLIZIZ, iLIZIZ, iLIZIZ, iLIZIZ);
        setOrientation(1);
        C786410Ut5.h9(tuxTextView, new ACListenerS154S0100000_19(this, 273));
        C786410Ut5.a9(tuxIconView, new ACListenerS154S0100000_19(this, 274));
    }
}
