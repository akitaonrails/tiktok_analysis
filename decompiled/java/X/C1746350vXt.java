package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.ab.AddressEditConfig;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS632S0100000_18;

/* JADX INFO: renamed from: X.0vXt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1746350vXt extends C1746340vXs {
    public C1746350vXt(LifecycleOwner lifecycleOwner) {
        super(lifecycleOwner);
    }

    @Override // X.C1746340vXs
    public final void LJI(Fragment fragment) {
        View viewFindViewById;
        View view = fragment.getView();
        if (view != null) {
            viewFindViewById = view.findViewById(R.id.eqx);
        } else {
            viewFindViewById = null;
        }
        View viewFindViewById2 = viewFindViewById.findViewById(R.id.tz6);
        View viewFindViewById3 = viewFindViewById.findViewById(R.id.rez);
        if (viewFindViewById2 != null && viewFindViewById3 != null) {
            int iIndexOfChild = ((ViewGroup) viewFindViewById.findViewById(R.id.cam)).indexOfChild(viewFindViewById.findViewById(R.id.cam).findViewById(R.id.tz6));
            int iIndexOfChild2 = ((ViewGroup) viewFindViewById.findViewById(R.id.cam)).indexOfChild(viewFindViewById.findViewById(R.id.cam).findViewById(R.id.rez));
            if (iIndexOfChild >= 0 && iIndexOfChild2 >= 0) {
                C786410Ut5.LJJLIIIJILLIZJL((LinearLayoutCompat) viewFindViewById.findViewById(R.id.cam), viewFindViewById.findViewById(R.id.cam).findViewById(R.id.tz6));
                C786410Ut5.LJJLIIIJILLIZJL((LinearLayoutCompat) viewFindViewById.findViewById(R.id.cam), viewFindViewById.findViewById(R.id.cam).findViewById(R.id.rez));
                ((ViewGroup) viewFindViewById.findViewById(R.id.cam)).addView(viewFindViewById2, iIndexOfChild2);
                ((ViewGroup) viewFindViewById.findViewById(R.id.cam)).addView(viewFindViewById3, iIndexOfChild);
                C426750GoL.LJIIIZ(viewFindViewById3, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), false, 16);
            }
        }
    }

    @Override // X.C1746340vXs, X.AbstractC1002403vy
    public final /* bridge */ /* synthetic */ void LIZJ(Fragment fragment, C19EG c19eg, ViewModel viewModel, List list) {
        LIZJ(fragment, c19eg, (AddressEditViewModel) viewModel, list);
    }

    @Override // X.C1746340vXs
    /* JADX INFO: renamed from: LJ */
    public final void LIZJ(Fragment fragment, C19EG c19eg, AddressEditViewModel addressEditViewModel, List<C1746370vXv> list) {
        View viewFindViewById;
        TuxNavBar tuxNavBar;
        String strLJI;
        CharSequence charSequenceLIZIZ;
        Integer numLIZJ;
        if (fragment == null || c19eg == null) {
            return;
        }
        View view = fragment.getView();
        if (view != null) {
            viewFindViewById = view.findViewById(R.id.eqx);
        } else {
            viewFindViewById = null;
        }
        View viewFindViewById2 = viewFindViewById.findViewById(R.id.xzl);
        if (viewFindViewById2 instanceof TuxNavBar) {
            tuxNavBar = (TuxNavBar) viewFindViewById2;
        } else {
            tuxNavBar = null;
        }
        C1250250idj c1250250idj = new C1250250idj();
        if (addressEditViewModel.LLLLIILL) {
            strLJI = C20642515q3.LJI(2131832695);
        } else if (addressEditViewModel.LLJ != null) {
            if (addressEditViewModel.LLLIIIIL == null) {
                strLJI = C20642515q3.LJI(2131832684);
            } else {
                strLJI = C20642515q3.LJI(2131832681);
            }
        } else {
            strLJI = C20642515q3.LJI(2131832665);
        }
        c1250250idj.LIZJ = strLJI;
        if (((AddressEditConfig) C1745750vWv.LIZIZ.getValue()).enableProtectionSubtitle && tuxNavBar != null) {
            charSequenceLIZIZ = C908903gt.LIZIZ(tuxNavBar, C20642515q3.LJI(2131825182), R.attr.a1u, R.raw.icon_shield_tick, null);
        } else {
            charSequenceLIZIZ = "";
        }
        c1250250idj.LIZLLL = charSequenceLIZIZ;
        C0OM1 c0om1 = new C0OM1();
        c0om1.LIZJ = c1250250idj;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LJIIIIZZ = C20642515q3.LJI(2131823173);
        c1251150ifB.LIZJ(new AwS570S0100000_26(list, (List<C1746370vXv>) 1414));
        int iIntValue = 0;
        c0om1.LIZIZ(c1251150ifB);
        Context context = fragment.getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.c3, context)) != null) {
            iIntValue = numLIZJ.intValue();
        }
        c0om1.LIZJ(iIntValue);
        c0om1.LIZLLL = true;
        if (tuxNavBar != null) {
            tuxNavBar.setNavActions(c0om1);
        }
        C11EA.LJII(this, addressEditViewModel, C1746360vXu.LL, new AwS632S0100000_18(fragment, 306));
    }
}
