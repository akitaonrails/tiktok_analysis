package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS371S0200000_5;

/* JADX INFO: renamed from: X.0Ei1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C371870Ei1 extends AbstractC1664490tPr<C371860Ei0, C1165904hF> {
    public final C01GW LLJJJIL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(180));

    @Override // X.AbstractC1664490tPr
    public final void onHide() {
        C1390410mHn c1390410mHn;
        View view = this.mView;
        if (view == null || (c1390410mHn = (C1390410mHn) view.findViewById(R.id.nne)) == null) {
            return;
        }
        c1390410mHn.LIZLLL();
    }

    @Override // X.AbstractC1664490tPr
    public final void onShow() {
        ConstraintLayout constraintLayout;
        TuxTextView tuxTextView;
        TuxTextView tuxTextView2;
        Integer numLIZJ;
        Window window;
        C197039127h c197039127h;
        TuxTextView tuxTextView3;
        TuxTextView tuxTextView4;
        View view;
        View viewFindViewById;
        if (LLLLILI().LIZ.LIZJ && (view = this.mView) != null && (viewFindViewById = view.findViewById(R.id.gow)) != null) {
            C426750GoL.LJIIL(viewFindViewById, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))), null, 26);
        }
        if (LLLLILI().LIZ.LIZ) {
            View view2 = this.mView;
            constraintLayout = view2 != null ? (ConstraintLayout) view2.findViewById(R.id.gow) : null;
            if (constraintLayout != null) {
                C786410Ut5.LL(4, constraintLayout);
            }
            View view3 = this.mView;
            if (view3 != null && (tuxTextView4 = (TuxTextView) view3.findViewById(R.id.nn7)) != null) {
                C786410Ut5.LLLLZLL(tuxTextView4, 4);
            }
            View view4 = this.mView;
            if (view4 != null && (tuxTextView3 = (TuxTextView) view4.findViewById(R.id.nmi)) != null) {
                C786410Ut5.LLLLZLL(tuxTextView3, 4);
            }
            View view5 = this.mView;
            if (view5 != null && (c197039127h = (C197039127h) view5.findViewById(R.id.db0)) != null) {
                C786410Ut5.LLLLLLJ(c197039127h, 4);
            }
        } else {
            View view6 = this.mView;
            constraintLayout = view6 != null ? (ConstraintLayout) view6.findViewById(R.id.gow) : null;
            if (constraintLayout != null) {
                C786410Ut5.LL(0, constraintLayout);
            }
            View view7 = this.mView;
            if (view7 != null && (tuxTextView2 = (TuxTextView) view7.findViewById(R.id.nn7)) != null) {
                C786410Ut5.LLLLZLL(tuxTextView2, 0);
            }
            View view8 = this.mView;
            if (view8 != null && (tuxTextView = (TuxTextView) view8.findViewById(R.id.nmi)) != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 0);
            }
            if (C357780E0y.LIZ()) {
                C786410Ut5.LLLLLLZZ((TuxIconView) this.mView.findViewById(R.id.pp_), 0);
            } else {
                C786410Ut5.LL(0, (ConstraintLayout) this.mView.findViewById(R.id.dd6));
            }
            C786410Ut5.LLLLLLJ((C197039127h) this.mView.findViewById(R.id.db0), 8);
        }
        ((C1390410mHn) this.mView.findViewById(R.id.nne)).LIZJ();
        Context contextLIZIZ = C545820Lau.LIZIZ(this);
        if (contextLIZIZ != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.bn, contextLIZIZ)) != null) {
            int iIntValue = numLIZJ.intValue();
            Activity activity = this.mActivity;
            if (activity != null && (window = activity.getWindow()) != null) {
                window.setNavigationBarColor(iIntValue);
            }
        }
        int iLIZ = C363750ENx.LIZ() - C0ES3.LIZ;
        View view9 = this.mView;
        if (view9 != null) {
            C786410Ut5.ed(view9, iLIZ);
            view9.animate().translationY(0.0f).setDuration(250L).setInterpolator(new C21388418n4()).start();
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        int i2;
        super.onViewCreated(view, bundle);
        view.getLayoutParams().height = C363750ENx.LIZ() - C0ES3.LIZ;
        View viewFindViewById = view.findViewById(R.id.dd3);
        Context contextRequireSceneContext = requireSceneContext();
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.bn);
        if (((Boolean) this.LLJJJIL.getValue()).booleanValue()) {
            i = 20;
        } else {
            i = 12;
        }
        c384050F3z.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(i));
        if (((Boolean) this.LLJJJIL.getValue()).booleanValue()) {
            i2 = 20;
        } else {
            i2 = 12;
        }
        c384050F3z.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(i2));
        viewFindViewById.setBackground(c384050F3z.LIZ(contextRequireSceneContext));
        ((TextView) view.findViewById(R.id.nn7)).setText(C786410Ut5.k4(Locale.ENGLISH, getResources().getString(2131826902), Arrays.copyOf(new Object[]{Integer.valueOf(LLLLILI().LIZ.LIZIZ)}, 1)));
        ((TextView) view.findViewById(R.id.nmi)).setText(getResources().getString(2131826908));
        ((TextView) view.findViewById(R.id.zt5)).setText(LLLLIL().LIZIZ.invoke());
        ((AppCompatTextView) view.findViewById(R.id.db0)).setBackgroundResource(R.drawable.alj);
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Ei2
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C371860Ei0) obj).LIZIZ);
            }
        }, Lifecycle.State.STARTED, new AwS371S0200000_5(view, this, 108));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.c00, viewGroup, false);
    }
}
