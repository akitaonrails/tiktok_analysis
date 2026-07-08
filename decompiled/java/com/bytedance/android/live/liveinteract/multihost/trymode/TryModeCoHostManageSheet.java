package com.bytedance.android.live.liveinteract.multihost.trymode;

import X.C1119170fEJ;
import X.C497740JfY;
import X.C758170Tod;
import X.C786410Ut5;
import Y.ACListenerS150S0100000_15;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.TryModeSheetBaseFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes16.dex */
public final class TryModeCoHostManageSheet extends TryModeSheetBaseFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImHELIOSJDElISAgPGs4OzY+JyEpZxshMQgjLSoQJw0jOjseKSstLioAICApPQ==";

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LIZ(C497740JfY.LJIJI(2131841172));
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C758170Tod(R.attr.dt3, new ACListenerS150S0100000_15(this, 164)));
        c1119170fEJ.LJFF = arrayList;
        return c1119170fEJ;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        uS(viewGroup);
        return C786410Ut5.Td(layoutInflater, R.layout.hqs, viewGroup, false);
    }
}
