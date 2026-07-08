package com.bytedance.android.live.liveinteract.multiguestv3.main.voiceonly.ui;

import X.C0IJT;
import X.C1119170fEJ;
import X.C16FS;
import X.C474500IjA;
import X.C497740JfY;
import X.C758170Tod;
import X.C786410Ut5;
import X.C923330a8R;
import X.C924620aAW;
import Y.ACListenerS150S0100000_15;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestCameraOffTipPanel extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzHELIOSE6emE+KSwiZzk8ISYpJiE/MWs5IGEePSk4IAgmLTY4Ci4+LTctBik1HCw8GS49LSk=";

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LJI = false;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C758170Tod(R.attr.eo4, new ACListenerS150S0100000_15(this, 151)));
        c1119170fEJ.LJFF = arrayList;
        return c1119170fEJ;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C786410Ut5.h8((C16FS) view.findViewById(R.id.cqt), new ACListenerS150S0100000_15(this, 152));
        TextView textView = (TextView) view.findViewById(R.id.xyn);
        C923330a8R c923330a8R = C923330a8R.LIZ;
        if (C923330a8R.LJI()) {
            textView.setText(C497740JfY.LJIJI(2131851260));
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_anchor_downgrade_apply_panel");
        C924620aAW.LJIILIIL(c474500IjALIZ);
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.hdo, viewGroup, false);
    }
}
