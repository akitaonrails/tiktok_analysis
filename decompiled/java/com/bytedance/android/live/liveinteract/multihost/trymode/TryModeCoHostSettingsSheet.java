package com.bytedance.android.live.liveinteract.multihost.trymode;

import X.C1119170fEJ;
import X.C21411718qp;
import X.C497740JfY;
import X.C500260Jjc;
import X.C758170Tod;
import X.C786410Ut5;
import X.C955400ayA;
import Y.ACListenerS165S0100000_31;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.TryModeSheetBaseFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes32.dex */
public final class TryModeCoHostSettingsSheet extends TryModeSheetBaseFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImHELIOSJDElISAgPGs4OzY+JyEpZxshMQgjLSoQJw0jOjsALTE4ICE0OxYkLCon";
    public C21411718qp LLJZIJLIL;
    public C21411718qp LLL;
    public C21411718qp LLLF;
    public C21411718qp LLLFF;
    public C21411718qp LLLFFI;

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LIZ(C497740JfY.LJIJI(2131844061));
        ArrayList arrayList = new ArrayList();
        C758170Tod c758170TodVR = VR();
        if (c758170TodVR != null) {
            arrayList.add(c758170TodVR);
        }
        c1119170fEJ.LJ = arrayList;
        return c1119170fEJ;
    }

    @Override // com.bytedance.android.livesdk.TryModeSheetBaseFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C500260Jjc.LJJZ((int) C497740JfY.LIZIZ(541.0f), view.findViewById(R.id.e30));
        this.LLJZIJLIL = (C21411718qp) view.findViewById(R.id.wt7);
        this.LLLF = (C21411718qp) view.findViewById(R.id.wt9);
        this.LLL = (C21411718qp) view.findViewById(R.id.wta);
        this.LLLFF = (C21411718qp) view.findViewById(R.id.wtc);
        this.LLLFFI = (C21411718qp) view.findViewById(R.id.wtm);
        C21411718qp c21411718qp = this.LLJZIJLIL;
        C21411718qp c21411718qp2 = null;
        if (c21411718qp == null) {
            c21411718qp = null;
        }
        c21411718qp.setChecked(true);
        C21411718qp c21411718qp3 = this.LLLF;
        if (c21411718qp3 == null) {
            c21411718qp3 = null;
        }
        c21411718qp3.setChecked(true);
        C21411718qp c21411718qp4 = this.LLL;
        if (c21411718qp4 == null) {
            c21411718qp4 = null;
        }
        c21411718qp4.setChecked(true);
        C21411718qp c21411718qp5 = this.LLLFF;
        if (c21411718qp5 == null) {
            c21411718qp5 = null;
        }
        c21411718qp5.setChecked(true);
        C21411718qp c21411718qp6 = this.LLLFFI;
        if (c21411718qp6 != null) {
            c21411718qp2 = c21411718qp6;
        }
        c21411718qp2.setChecked(true);
        C955400ayA c955400ayA = C955400ayA.LIZ;
        C955400ayA.LJLLILLLL(true, true, true, true, true, true, true, true);
        View viewFindViewById = view.findViewById(R.id.wt8);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS165S0100000_31(this, 36), viewFindViewById);
        }
        View viewFindViewById2 = view.findViewById(R.id.wt_);
        if (viewFindViewById2 != null) {
            C786410Ut5.I7(new ACListenerS165S0100000_31(this, 37), viewFindViewById2);
        }
        View viewFindViewById3 = view.findViewById(R.id.wtb);
        if (viewFindViewById3 != null) {
            C786410Ut5.I7(new ACListenerS165S0100000_31(this, 38), viewFindViewById3);
        }
        View viewFindViewById4 = view.findViewById(R.id.wtd);
        if (viewFindViewById4 != null) {
            C786410Ut5.I7(new ACListenerS165S0100000_31(this, 39), viewFindViewById4);
        }
        View viewFindViewById5 = view.findViewById(R.id.wtn);
        if (viewFindViewById5 != null) {
            C786410Ut5.I7(new ACListenerS165S0100000_31(this, 40), viewFindViewById5);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        uS(viewGroup);
        return C786410Ut5.Td(layoutInflater, R.layout.gjy, viewGroup, false);
    }
}
