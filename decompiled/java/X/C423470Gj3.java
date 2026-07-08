package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Gj3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C423470Gj3 {
    public DataChannel LIZ;
    public View LIZIZ;
    public View LIZJ;
    public C1324720kZq LIZLLL;
    public boolean LJFF;
    public ObjectAnimator LJII;
    public TuxTextView LJIIIIZZ;
    public final C11NJ LJ = new C11NJ();
    public final C01GW LJI = C452501pT.LIZIZ(new AwS559S0100000_15(this, 12));

    public final void LIZ(String str) {
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("resetToNormalIconUIState, source = ");
            sbLIZ.append(str);
            C20441214yg.LIZIZ("MultiGuestIconQuickConnectAnimationHelper", C2188811AlT.LIZIZ(sbLIZ));
            View view = this.LIZJ;
            if (view != null) {
                C12ES.LJIILL(0, view);
            }
            TuxTextView tuxTextView = this.LJIIIIZZ;
            if (tuxTextView != null) {
                C439101nJ.LJI(tuxTextView);
            }
            C1324720kZq c1324720kZq = this.LIZLLL;
            if (c1324720kZq != null) {
                C439101nJ.LJI(c1324720kZq);
            }
            C1324720kZq c1324720kZq2 = this.LIZLLL;
            if (c1324720kZq2 != null) {
                C786410Ut5.h5(c1324720kZq2, 1.0f);
            }
            View view2 = this.LIZJ;
            if (view2 != null) {
                C786410Ut5.T4(view2, 1.0f);
            }
            TuxTextView tuxTextView2 = this.LJIIIIZZ;
            if (tuxTextView2 != null) {
                C786410Ut5.B5(tuxTextView2, 1.0f);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJFF("MultiGuestIconQuickConnectAnimationHelper", "resetToNormalIconUIState", e);
        }
    }

    public final void LIZIZ(long j) {
        ViewGroup viewGroup;
        Context context;
        View view = this.LIZIZ;
        AttributeSet attributeSet = null;
        if ((view instanceof FrameLayout) && (viewGroup = (ViewGroup) view) != null) {
            int i = 0;
            if (this.LJIIIIZZ == null && view != null && (context = view.getContext()) != null) {
                TuxTextView tuxTextView = new TuxTextView(context, attributeSet, 6, i);
                C786410Ut5.R6(tuxTextView, new FrameLayout.LayoutParams(-2, -2, 17));
                tuxTextView.setTextColor(C497740JfY.LIZLLL(R.attr.c9i, tuxTextView.getContext()));
                tuxTextView.setTuxFont(73);
                tuxTextView.setTypeface(C1697580uHE.LIZIZ(0.0f, OppoPermissionPopupMaskDelayExp.DEFAULT, 12.0f, 0.5f, Float.valueOf(12.0f), 0.0f, 0, null, 224));
                this.LJIIIIZZ = tuxTextView;
            }
            TuxTextView tuxTextView2 = this.LJIIIIZZ;
            if (tuxTextView2 != null) {
                C12ES.LJIILL(0, tuxTextView2);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(j);
                sbLIZ.append('s');
                tuxTextView2.setText(C2188811AlT.LIZIZ(sbLIZ));
                try {
                    Iterator<View> it2 = new C09RD(viewGroup).iterator();
                    while (true) {
                        C09RE c09re = (C09RE) it2;
                        if (c09re.hasNext()) {
                            Object next = c09re.next();
                            if (i >= 0) {
                                if (Intrinsics.LJFF((View) next, this.LIZLLL)) {
                                    break;
                                } else {
                                    i++;
                                }
                            } else {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                        } else {
                            i = -1;
                            break;
                        }
                    }
                    if (tuxTextView2.getParent() == null && i >= 0) {
                        viewGroup.addView(tuxTextView2, i + 1);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C20441214yg.LJFF("MultiGuestIconQuickConnectAnimationHelper", "tryToAddViewToParent", e);
                }
            }
        }
    }
}
