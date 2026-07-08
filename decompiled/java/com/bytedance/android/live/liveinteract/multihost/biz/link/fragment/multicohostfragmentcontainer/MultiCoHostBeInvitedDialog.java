package com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.multicohostfragmentcontainer;

import X.C01GW;
import X.C1091700eW0;
import X.C1119170fEJ;
import X.C19EH;
import X.C452501pT;
import X.C786410Ut5;
import X.C943860afY;
import X.C961300b7g;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCohostInviteePanelHeightFixSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AwS259S0300000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiCoHostBeInvitedDialog extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElISAgPGsuIDV9JCwiImE1OiHELIOSQrJCo9PGshPCMnISYjISAgPCM+KCg+LSs4KiA9PCQlJyohZgg5JTs6CyoEJjwnCiAFJzk6PCAoDSYyJCor";
    public Integer LLJLLL;
    public final C01GW LLJZ;

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final int aS() {
        return 2;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        return null;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        int i;
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.draggable = false;
        sheetOptions.canceledOnTouchOutside = false;
        sheetOptions.cancelable = false;
        if (LiveCohostInviteePanelHeightFixSetting.INSTANCE.isEnable()) {
            i = 5;
        } else {
            i = 3;
        }
        sheetOptions.LIZ(i, null);
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) {
        C961300b7g.LIZ.getClass();
        C961300b7g.LIZIZ.remove("cohost_be_invited_panel");
    }

    public MultiCoHostBeInvitedDialog(DataChannel dataChannel, C943860afY c943860afY) {
        this.LLJZ = C452501pT.LIZIZ(new AwS259S0300000_15(this, c943860afY, dataChannel, 20));
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Integer num = this.LLJLLL;
        if (num != null) {
            int iIntValue = num.intValue();
            C19EH c19ehLJIIJ = getParentFragmentManager().LJIIJ();
            c19ehLJIIJ.LIZIZ(iIntValue, (Fragment) this.LLJZ.getValue());
            c19ehLJIIJ.LJIIJ();
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C1091700eW0 c1091700eW0 = new C1091700eW0(layoutInflater.getContext());
        c1091700eW0.setId(View.generateViewId());
        C786410Ut5.v6(c1091700eW0, new ViewGroup.LayoutParams(-1, -1));
        this.LLJLLL = Integer.valueOf(c1091700eW0.getId());
        return c1091700eW0;
    }
}
