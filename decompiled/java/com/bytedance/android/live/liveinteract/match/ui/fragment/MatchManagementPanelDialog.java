package com.bytedance.android.live.liveinteract.match.ui.fragment;

import X.C01GW;
import X.C1091700eW0;
import X.C19EH;
import X.C452501pT;
import X.C786410Ut5;
import X.C976780bWe;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class MatchManagementPanelDialog extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyIyHELIOSPCYkZzo6ZiM+KCg+LSs4ZwIyPCYkBC49KSIpJCo9PBUtJyo/DCwtJSA0";
    public final C976780bWe LLJLLL;
    public Integer LLJZ;
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 138));

    public MatchManagementPanelDialog(C976780bWe c976780bWe) {
        this.LLJLLL = c976780bWe;
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
