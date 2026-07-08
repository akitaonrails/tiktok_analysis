package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS632S0100000_18;

/* JADX INFO: renamed from: X.0vXs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1746340vXs extends AbstractC1002403vy<AddressEditViewModel> {
    public void LJI(Fragment fragment) {
    }

    public C1746340vXs(LifecycleOwner lifecycleOwner) {
        super(lifecycleOwner);
    }

    public static Map LIZLLL(AddressEditViewModel addressEditViewModel) {
        String str;
        Object obj;
        String str2;
        HashMap<String, Object> mapLJIIJ;
        Pair[] pairArr = new Pair[3];
        if (addressEditViewModel.LLLLLIL) {
            str = "full_screen";
        } else {
            str = "seven_screen";
        }
        pairArr[0] = new Pair("page_show_type", str);
        AddressPageStarter.AddressEditEnterParams addressEditEnterParams = addressEditViewModel.LLJJJIL;
        String str3 = null;
        if (addressEditEnterParams != null && (str2 = addressEditEnterParams.trackParams) != null && (mapLJIIJ = C1741890vQh.LJIIJ(str2)) != null) {
            obj = mapLJIIJ.get("previous_page");
        } else {
            obj = null;
        }
        pairArr[1] = new Pair("source_previous_page", String.valueOf(obj));
        AddressPageStarter.AddressEditEnterParams addressEditEnterParams2 = addressEditViewModel.LLJJJIL;
        if (addressEditEnterParams2 != null) {
            str3 = addressEditEnterParams2.triggerEvent;
        }
        pairArr[2] = new Pair("trigger_event", String.valueOf(str3));
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    @Override // X.AbstractC1002403vy
    /* JADX INFO: renamed from: LJ, reason: merged with bridge method [inline-methods] */
    public void LIZJ(Fragment fragment, C19EG c19eg, AddressEditViewModel addressEditViewModel, List<C1746370vXv> list) {
        View viewFindViewById;
        String string;
        TuxNavBar tuxNavBar;
        String string2;
        TuxNavBar tuxNavBar2;
        View viewFindViewById2;
        View viewFindViewById3;
        View viewFindViewById4;
        TuxNavBar tuxNavBar3;
        if (fragment == null || c19eg == null) {
            return;
        }
        TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(fragment);
        tuxImmersionBarLIZLLL.LJIIIIZZ(R.attr.zp);
        tuxImmersionBarLIZLLL.LIZLLL();
        Integer numLIZ = C1308910kAL.LIZ(R.attr.zp, c19eg);
        if (numLIZ != null) {
            int iIntValue = numLIZ.intValue();
            View view = fragment.getView();
            if (view != null) {
                view.setBackgroundColor(iIntValue);
            }
            View view2 = fragment.getView();
            if (view2 != null && (tuxNavBar3 = (TuxNavBar) view2.findViewById(R.id.xzl)) != null) {
                tuxNavBar3.setNavBackground(iIntValue);
            }
        }
        View view3 = fragment.getView();
        if (view3 != null) {
            viewFindViewById = view3.findViewById(R.id.t0h);
        } else {
            viewFindViewById = null;
        }
        if (viewFindViewById != null) {
            C426750GoL.LJIIL(viewFindViewById, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 0, 16);
        }
        Integer numLIZ2 = C1308910kAL.LIZ(R.attr.c3, c19eg);
        if (numLIZ2 != null) {
            int iIntValue2 = numLIZ2.intValue();
            View view4 = fragment.getView();
            if (view4 != null && (viewFindViewById4 = view4.findViewById(R.id.cam)) != null) {
                viewFindViewById4.setBackgroundColor(iIntValue2);
            }
        }
        View view5 = fragment.getView();
        if (view5 != null && (viewFindViewById3 = view5.findViewById(R.id.cam)) != null) {
            C426750GoL.LJIIIZ(viewFindViewById3, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18))), 0, 0, false, 16);
        }
        View view6 = fragment.getView();
        if (view6 != null && (viewFindViewById2 = view6.findViewById(R.id.tz7)) != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById2);
        }
        View view7 = fragment.getView();
        if (view7 != null && (tuxNavBar2 = (TuxNavBar) view7.findViewById(R.id.xzl)) != null) {
            tuxNavBar2.LJIIZILJ(false);
        }
        C0OM1 c0om1 = new C0OM1();
        if (addressEditViewModel.LLLLLIL) {
            AddressPageStarter.AddressEditEnterParams addressEditEnterParams = addressEditViewModel.LLJJJIL;
            if (addressEditEnterParams != null && addressEditEnterParams.address != null) {
                string2 = c19eg.getString(2131832684);
            } else {
                string2 = c19eg.getString(2131832691);
            }
            C1237450iJ5.LIZIZ(c0om1, string2, new AwS270S0300000_26((List) list, (List<C1746370vXv>) addressEditViewModel, (AddressEditViewModel) this, (C1746340vXs) 146));
        } else {
            AddressPageStarter.AddressEditEnterParams addressEditEnterParams2 = addressEditViewModel.LLJJJIL;
            if (addressEditEnterParams2 != null && addressEditEnterParams2.address != null) {
                string = c19eg.getString(2131832684);
            } else {
                string = c19eg.getString(2131832691);
            }
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = string;
            c0om1.LIZJ = c1250250idj;
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
            c1251150ifB.LIZLLL = true;
            c1251150ifB.LJIIIIZZ = C20642515q3.LJI(2131823173);
            c1251150ifB.LIZJ(new AwS570S0100000_26(list, (List<C1746370vXv>) 1567));
            c0om1.LIZIZ(c1251150ifB);
            c0om1.LIZLLL = false;
        }
        C1745480vWU.LJFF(addressEditViewModel.LLJJIJIL, "back", LIZLLL(addressEditViewModel), null, 4);
        if (addressEditViewModel.LLJ != null) {
            C1251150ifB c1251150ifB2 = new C1251150ifB();
            c1251150ifB2.LIZLLL();
            c1251150ifB2.LIZJ = R.raw.icon_trash_bin;
            c1251150ifB2.LJIIIIZZ = C20642515q3.LJI(2131832680);
            c1251150ifB2.LIZJ(new AwS270S0300000_26(c19eg, addressEditViewModel, this, 149));
            c0om1.LIZIZ(c1251150ifB2);
            C1745480vWU.LJFF(addressEditViewModel.LLJJIJIL, "delete", LIZLLL(addressEditViewModel), null, 4);
        }
        View view8 = fragment.getView();
        if (view8 != null && (tuxNavBar = (TuxNavBar) view8.findViewById(R.id.xzl)) != null) {
            tuxNavBar.setNavActions(c0om1);
        }
        LJI(fragment);
        C11EA.LJII(this, addressEditViewModel, C1746360vXu.LL, new AwS632S0100000_18(fragment, 306));
    }
}
