package com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute;

import X.C01GW;
import X.C1816040xMI;
import X.C1819560xRy;
import X.C1864490ycR;
import X.C19EH;
import X.C20441214yg;
import X.C500980Jkm;
import X.C786410Ut5;
import X.C922410a6x;
import X.C929860aIy;
import X.C930540aK4;
import Y.ACListenerS129S0200000_27;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.livesetting.MultiGuestLiveSettingFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.util.MultiGuestDialogManager;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestEarFeedbackSetting;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class MultiGuestLiveSettingDialog extends LiveDialogFragment implements Parcelable {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6HELIOSemE+KSwiZygmLTY4Zys6OzE+IC0mPCBiBDo/PCwLPCogPAklPyoALTE4ICE0DCwtJSA0";
    public LiveBaseFragment contentFragment;
    public static final C1819560xRy Companion = new C1819560xRy();
    public static final int $stable = 8;
    public final C01GW useNewStyleDialogWithEarFeedback$delegate = C930540aK4.LJJIJIL(new AwS571S0100000_27(this, 68));
    public final C01GW requestPage$delegate = C930540aK4.LJJIJIL(new AwS571S0100000_27(this, 65));
    public final C01GW isShowBackIcon$delegate = C930540aK4.LJJIJIL(new AwS571S0100000_27(this, 62));
    public final C01GW isAllowCancelable$delegate = C930540aK4.LJJIJIL(new AwS571S0100000_27(this, 61));
    public final C01GW useSheet$delegate = C930540aK4.LJJIJIL(new AwS571S0100000_27(this, 69));
    public final C01GW guestSettingFragment$delegate = C930540aK4.LJJIJIL(new AwS571S0100000_27(this, 60));

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
    }

    public final String MR() {
        return (String) this.requestPage$delegate.getValue();
    }

    public final boolean NR() {
        return ((Boolean) this.useSheet$delegate.getValue()).booleanValue();
    }

    public final boolean OR() {
        return ((Boolean) this.isAllowCancelable$delegate.getValue()).booleanValue();
    }

    public final boolean PR() {
        return ((Boolean) this.isShowBackIcon$delegate.getValue()).booleanValue();
    }

    public final void RR() {
        C1816040xMI c1816040xMI = MultiGuestConnectDistributeParentFragment.Companion;
        AwS571S0100000_27 awS571S0100000_27 = new AwS571S0100000_27(this, 67);
        String strMR = MR();
        boolean z = ((Boolean) this.useNewStyleDialogWithEarFeedback$delegate.getValue()).booleanValue() && LiveSdkMultiGuestEarFeedbackSetting.isEnable();
        boolean zNR = NR();
        boolean z2 = ((Boolean) this.useNewStyleDialogWithEarFeedback$delegate.getValue()).booleanValue() && LiveSdkMultiGuestEarFeedbackSetting.isEnable();
        c1816040xMI.getClass();
        MultiGuestConnectDistributeParentFragment multiGuestConnectDistributeParentFragmentLIZ = C1816040xMI.LIZ(strMR, awS571S0100000_27, z, zNR, z2);
        multiGuestConnectDistributeParentFragmentLIZ.U7(new AwS571S0100000_27(this, 66));
        this.contentFragment = multiGuestConnectDistributeParentFragmentLIZ;
        C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
        c19ehLJIIJ.LJIJ(R.id.iiv, multiGuestConnectDistributeParentFragmentLIZ, null);
        c19ehLJIIJ.LJII(null);
        c19ehLJIIJ.LJIIJ();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g8y);
        c500980Jkm.LIZJ = R.style.ahk;
        c500980Jkm.LJIIL = new ColorDrawable(0);
        c500980Jkm.LJII = 80;
        c500980Jkm.LJFF = false;
        c500980Jkm.LJIIJ = -1;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final boolean onBackPressed() {
        C20441214yg.LIZIZ("ConnectStatusDistribute_MultiGuestConnectDistributeDialog", "onBackPressed");
        if (getChildFragmentManager().LJJLIIIIJ() > 1) {
            getChildFragmentManager().LJLLILLLL();
        } else {
            if (getChildFragmentManager().LJJLIIIIJ() == 1) {
                MultiGuestDialogManager multiGuestDialogManagerLIZ = C922410a6x.LIZ();
                if (multiGuestDialogManagerLIZ != null) {
                    multiGuestDialogManagerLIZ.Ll1(this);
                }
                C929860aIy.LIZ.LIZLLL(this);
                return true;
            }
            if (getChildFragmentManager().LJJLIIIIJ() == 0) {
                requireActivity().onBackPressed();
                return true;
            }
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        requireActivity().getOnBackPressedDispatcher().LIZ(this, new C1864490ycR(this, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.19EH] */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.0aXO, androidx.fragment.app.Fragment, com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.LiveBaseFragment] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ?? LIZ;
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.pw6);
        C786410Ut5.I7(new ACListenerS129S0200000_27(viewFindViewById, this, 7), viewFindViewById);
        if (((Boolean) this.useNewStyleDialogWithEarFeedback$delegate.getValue()).booleanValue() && LiveSdkMultiGuestEarFeedbackSetting.isEnable()) {
            LIZ = (MultiGuestLiveSettingFragment) this.guestSettingFragment$delegate.getValue();
        } else {
            C1816040xMI c1816040xMI = MultiGuestConnectDistributeParentFragment.Companion;
            AwS571S0100000_27 awS571S0100000_27 = new AwS571S0100000_27(this, 64);
            String strMR = MR();
            boolean zPR = PR();
            boolean zNR = NR();
            c1816040xMI.getClass();
            LIZ = C1816040xMI.LIZ(strMR, awS571S0100000_27, zPR, zNR, false);
        }
        LIZ.U7(new AwS571S0100000_27(this, 63));
        this.contentFragment = LIZ;
        ?? LJIIJ = getChildFragmentManager().LJIIJ();
        LJIIJ.LJIJ(R.id.iiv, LIZ, null);
        LJIIJ.LJII(null);
        LJIIJ.LJIIJ();
    }
}
