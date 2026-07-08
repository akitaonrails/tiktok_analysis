package com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.multicohostfragmentcontainer;

import X.AbstractC960950b77;
import X.C01GW;
import X.C0JDJ;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1091700eW0;
import X.C1152520g66;
import X.C1911200zpm;
import X.C19EH;
import X.C452501pT;
import X.C465220IMe;
import X.C497740JfY;
import X.C786410Ut5;
import X.C961290b7f;
import X.C961300b7g;
import X.EnumC961320b7i;
import X.InterfaceC934710aQn;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiHostInviteListFragmentV2;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CoHostViewerSuggestionsExperimentSetting;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiHostInviteListDialog extends LiveSheetFragment implements C0JDJ {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElISAgPGsuIDV9JCwiImE1OiHELIOSQrJCo9PGshPCMnISYjISAgPCM+KCg+LSs4KiA9PCQlJyohZgg5JTs6ACo/PQY9Piw4LAM6OzEIIC4/JyI=";
    public final C961290b7f LLJLLL;
    public Integer LLJZ;
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 436));

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return 0;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, X.InterfaceC513210KAt
    public final /* synthetic */ int getThemeOverlay(Context context) {
        return C465220IMe.LIZ();
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment
    public final /* synthetic */ boolean isLight(Context context) {
        return false;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final void nS() {
        super.nS();
        ((MultiHostInviteListFragmentV2) this.LLJZIJLIL.getValue()).LLJZIJLIL = "click";
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void sl() {
        C1911200zpm.LIZIZ(this);
        ((MultiHostInviteListFragmentV2) this.LLJZIJLIL.getValue()).LLJZIJLIL = "click";
    }

    public MultiHostInviteListDialog(C961290b7f c961290b7f) {
        this.LLJLLL = c961290b7f;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        int i;
        Integer numValueOf;
        SheetOptions sheetOptions = new SheetOptions();
        if (this.LLJLLL.LJFF == EnumC961320b7i.QUICK_COHOST_TIMEOUT) {
            i = 2;
        } else {
            i = 1;
        }
        sheetOptions.LIZ(i, null);
        sheetOptions.draggable = false;
        if (C1152520g66.LIZ() && (numValueOf = Integer.valueOf(C497740JfY.LJIIIZ(R.dimen.aln))) != null) {
            sheetOptions.cornerRadius = numValueOf.intValue();
        }
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) throws Throwable {
        AbstractC960950b77 abstractC960950b77;
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10501, "com/bytedance/android/live/liveinteract/multihost/biz/link/fragment/multicohostfragmentcontainer/MultiHostInviteListDialog", "onHiddenChanged", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYEJJ97iNZknTVMu//6lsVPlMF8AJhVgcdTdZDViJS7KxlteluS4UTf+RWn5Kq6xvG1zOAmpBVRaVa1Q5TwAFDO/XPv0xTjCTnA360inN4EhTlEnyrYq88jTlU/9blpsE=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.onHiddenChanged(z);
        InteractDialogFragmentBaseContract$AbsView interactDialogFragmentBaseContract$AbsView = (InteractDialogFragmentBaseContract$AbsView) this.LLJZIJLIL.getValue();
        interactDialogFragmentBaseContract$AbsView.getClass();
        if (!z) {
            if ((!CoHostViewerSuggestionsExperimentSetting.INSTANCE.isEnable() || !InterfaceC934710aQn.ob.LIZIZ().booleanValue()) && (abstractC960950b77 = (AbstractC960950b77) interactDialogFragmentBaseContract$AbsView.LLILLL) != null) {
                abstractC960950b77.LJJIIZI();
            }
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) {
        C961300b7g.LIZ.getClass();
        C961300b7g.LIZIZ.remove("cohost_invite_list");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Integer num = this.LLJZ;
        if (num != null) {
            int iIntValue = num.intValue();
            C19EH c19ehLJIIJ = getParentFragmentManager().LJIIJ();
            c19ehLJIIJ.LIZIZ(iIntValue, (Fragment) this.LLJZIJLIL.getValue());
            c19ehLJIIJ.LJIIJ();
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C1091700eW0 c1091700eW0 = new C1091700eW0(layoutInflater.getContext());
        c1091700eW0.setId(View.generateViewId());
        C786410Ut5.v6(c1091700eW0, new ViewGroup.LayoutParams(-1, -1));
        this.LLJZ = Integer.valueOf(c1091700eW0.getId());
        return c1091700eW0;
    }
}
