package X;

import Y.ACListenerS144S0100000_9;
import Y.ARunnableS109S0100000_9;
import Y.ARunnableS20S0101000_9;
import android.os.CountDownTimer;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinPollViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommonAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinInteractionAbility;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0OQz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C619350OQz implements C0OT0 {
    public final boolean LIZ;
    public final BulletinPollViewModel LIZIZ;
    public final View.OnLongClickListener LIZJ;
    public final BulletinListViewModel LIZLLL;
    public final BulletinCommonAbility LJ;
    public final BulletinInteractionAbility LJFF;
    public final C13E8<View> LJI = new C13E8<>();
    public final long LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public C618680OOk LJIIJ;
    public String LJIIJJI;
    public CountDownTimer LJIIL;
    public final ACListenerS144S0100000_9 LJIILIIL;
    public final ACListenerS144S0100000_9 LJIILJJIL;
    public final View LJIILL;

    @Override // X.C0OT0
    public final View LJIJI() {
        throw null;
    }

    public final boolean LJIIJ() {
        BulletinCommonAbility bulletinCommonAbility;
        String string;
        Long l;
        BulletinCommonAbility bulletinCommonAbility2 = this.LJ;
        if ((bulletinCommonAbility2 != null && bulletinCommonAbility2.To()) || (bulletinCommonAbility = this.LJ) == null || !bulletinCommonAbility.Nl()) {
            return false;
        }
        BulletinInteractionAbility bulletinInteractionAbility = this.LJFF;
        if (bulletinInteractionAbility != null) {
            C618680OOk c618680OOk = this.LJIIJ;
            if (c618680OOk == null || (l = c618680OOk.LLIZ) == null || (string = l.toString()) == null) {
                string = "";
            }
            bulletinInteractionAbility.rE1(string, "click_vote", null);
        }
        return true;
    }

    public static void LJIIL(View view) {
        C786410Ut5.T4(view, 1.0f);
        ViewPropertyAnimator viewPropertyAnimatorWithEndAction = view.animate().alpha(0.0f).setInterpolator(C1619980sG4.LIZLLL()).withEndAction(new ARunnableS109S0100000_9(view, 162));
        viewPropertyAnimatorWithEndAction.setDuration(200L);
        viewPropertyAnimatorWithEndAction.start();
    }

    public static void LJIILL(View view) {
        C786410Ut5.T4(view, 0.0f);
        C786410Ut5.Ob(view, 0.6f);
        C786410Ut5.pc(view, 0.6f);
        ViewPropertyAnimator interpolator = view.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setInterpolator(C1619980sG4.LIZLLL());
        interpolator.setDuration(300L);
        interpolator.start();
    }

    public final void LIZLLL(View view) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (C279940Ay8.LIZ() && (layoutParams = view.getLayoutParams()) != null) {
            layoutParams.height = this.LJIIIZ;
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x024d  */
    /* JADX WARN: Type inference failed for: r6v11, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Iterable, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(final X.C618680OOk r21) {
        /*
            Method dump skipped, instruction units count: 1705
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C619350OQz.LJFF(X.0OOk):void");
    }

    public final void LJIILJJIL(String str) {
        String str2 = this.LJIIJJI;
        if (str2 != null) {
            ((TextView) this.LJIILL.findViewById(R.id.d30)).setText(C786410Ut5.j4(str2, Arrays.copyOf(new Object[]{str}, 1)));
        }
    }

    public final void LJI(int i, View view) {
        View view2;
        Object tag;
        boolean zBooleanValue;
        Boolean bool;
        View viewFindViewById = view.findViewById(R.id.d3h);
        C786410Ut5.Ob(viewFindViewById, 0.0f);
        if (C454590Hs9.LIZ(view.getContext())) {
            viewFindViewById.setPivotX(view.getWidth() * 1.0f);
        } else {
            viewFindViewById.setPivotX(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorWithEndAction = viewFindViewById.animate().scaleX(1.0f).setInterpolator(C1619980sG4.LIZLLL()).withStartAction(new RunnableC514801zW(viewFindViewById, 117)).withEndAction(new ARunnableS20S0101000_9(i, this, 6));
        viewPropertyAnimatorWithEndAction.setDuration(500L);
        viewPropertyAnimatorWithEndAction.start();
        if (C279940Ay8.LIZ()) {
            C786410Ut5.LL(8, (ConstraintLayout) view.findViewById(R.id.d2n));
            C427760Gpy c427760Gpy = (C427760Gpy) view.findViewById(R.id.d2m);
            if (c427760Gpy != null) {
                tag = c427760Gpy.getTag(R.id.d2m);
            } else {
                tag = null;
            }
            if ((tag instanceof Boolean) && (bool = (Boolean) tag) != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            if (c427760Gpy != null) {
                if (zBooleanValue) {
                    C786410Ut5.LLLLLL(c427760Gpy, 0);
                    view2 = c427760Gpy;
                } else {
                    C786410Ut5.LLLLLL(c427760Gpy, 8);
                    view2 = null;
                }
            } else {
                view2 = null;
            }
        } else {
            ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.d2n);
            C786410Ut5.LL(0, constraintLayout);
            view2 = constraintLayout;
        }
        C786410Ut5.LLLLZLL((TuxTextView) view.findViewById(R.id.d2r), 0);
        if (view2 != null) {
            LJIILL(view2);
        }
        LJIILL(view.findViewById(R.id.d2r));
    }

    public C619350OQz(ViewStub viewStub, boolean z, BulletinPollViewModel bulletinPollViewModel, C0P4N c0p4n, BulletinListViewModel bulletinListViewModel, BulletinCommonAbility bulletinCommonAbility, BulletinInteractionAbility bulletinInteractionAbility) {
        long jOg2;
        int i;
        double dLIZIZ;
        TextView textView;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        this.LIZ = z;
        this.LIZIZ = bulletinPollViewModel;
        this.LIZJ = c0p4n;
        this.LIZLLL = bulletinListViewModel;
        this.LJ = bulletinCommonAbility;
        this.LJFF = bulletinInteractionAbility;
        if (bulletinCommonAbility != null) {
            jOg2 = bulletinCommonAbility.Og2();
        } else {
            jOg2 = 0;
        }
        this.LJII = jOg2;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(236));
        this.LJIIIIZZ = iLIZIZ;
        if (C279940Ay8.LIZ()) {
            i = 44;
        } else {
            i = 50;
        }
        this.LJIIIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        this.LJIILIIL = new ACListenerS144S0100000_9(this, 110);
        ACListenerS144S0100000_9 aCListenerS144S0100000_9 = new ACListenerS144S0100000_9(this, 109);
        this.LJIILJJIL = aCListenerS144S0100000_9;
        viewStub.setLayoutResource(R.layout.f868a6n);
        View viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
        this.LJIILL = viewLJLLLL;
        C786410Ut5.I7(aCListenerS144S0100000_9, viewLJLLLL);
        viewLJLLLL.setOnLongClickListener(c0p4n);
        double dLIZIZ2 = C1415610mwR.LIZIZ() - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) * 2);
        if (z) {
            dLIZIZ = dLIZIZ2 * 0.75d;
        } else {
            dLIZIZ = (dLIZIZ2 * 0.85d) - ((double) ((C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)) * 2) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28))));
        }
        double dLIZIZ3 = dLIZIZ - ((double) (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)) * 2));
        C0OPX.LJII("BulletinPollContentWidget optionSpace = " + dLIZIZ3 + ", optionMaxWidth = " + iLIZIZ);
        if (iLIZIZ > dLIZIZ3) {
            this.LJIIIIZZ = (int) dLIZIZ3;
        }
        ViewGroup.LayoutParams layoutParams = viewLJLLLL.findViewById(R.id.d2x).getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = this.LJIIIIZZ;
        }
        if (C279940Ay8.LIZ() && (textView = (TextView) viewLJLLLL.findViewById(R.id.d30)) != null) {
            textView.setTextSize(12.0f);
            ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
            }
        }
    }
}
