package com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.multicohostfragmentcontainer;

import X.C01GW;
import X.C1091700eW0;
import X.C19EH;
import X.C452501pT;
import X.C786410Ut5;
import X.C961980b8m;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import kotlin.jvm.internal.AwS416S0200000_15;

/* JADX INFO: loaded from: classes8.dex */
public final class MultiCoHostSearchDialog extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElISAgPGsuIDV9JCwiImE1HELIOSOiQrJCo9PGshPCMnISYjISAgPCM+KCg+LSs4KiA9PCQlJyohZgg5JTs6CyoEJjwnGyAtOyw7DCwtJSA0";
    public Integer LLJLLL;
    public final C01GW LLJZ;

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final int aS() {
        return 2;
    }

    public MultiCoHostSearchDialog(C961980b8m c961980b8m) {
        this.LLJZ = C452501pT.LIZIZ(new AwS416S0200000_15(this, c961980b8m, 45));
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(1, null);
        return sheetOptions;
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
