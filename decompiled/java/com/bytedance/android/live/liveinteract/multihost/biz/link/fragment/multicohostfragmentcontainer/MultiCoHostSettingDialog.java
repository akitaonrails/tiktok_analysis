package com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.multicohostfragmentcontainer;

import X.C01GW;
import X.C1091700eW0;
import X.C1119170fEJ;
import X.C1161920gLG;
import X.C1397760mTe;
import X.C19EH;
import X.C452501pT;
import X.C497740JfY;
import X.C758170Tod;
import X.C786410Ut5;
import X.C961700b8K;
import X.EnumC1397840mTm;
import Y.ACListenerS147S0100000_12;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS416S0200000_15;

/* JADX INFO: loaded from: classes13.dex */
public final class MultiCoHostSettingDialog extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElISAgPGsuIDV9JCwiImE1OiHELIOSQrJCo9PGshPCMnISYjISAgPCM+KCg+LSs4KiA9PCQlJyohZgg5JTs6CyoEJjwnGyA4PSY9LwElKCM8Lw==";
    public Integer LLJLLL;
    public final C01GW LLJZ;

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LIZ(C497740JfY.LJIJI(2131844060));
        c1119170fEJ.LJI = true;
        ArrayList arrayList = new ArrayList();
        C1397760mTe c1397760mTe = new C1397760mTe();
        c1397760mTe.LIZ = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).context().getString(2131841176);
        c1397760mTe.LIZIZ = EnumC1397840mTm.BUTTON;
        c1397760mTe.LIZJ = null;
        arrayList.add(new C758170Tod(R.attr.d33, c1397760mTe.LIZ(), new ACListenerS147S0100000_12(this, 65)));
        c1119170fEJ.LJ = arrayList;
        return c1119170fEJ;
    }

    public MultiCoHostSettingDialog(C961700b8K c961700b8K) {
        this.LLJZ = C452501pT.LIZIZ(new AwS416S0200000_15(this, c961700b8K, 46));
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
