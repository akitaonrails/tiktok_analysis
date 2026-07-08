package com.bytedance.android.live.liveinteract.multiguestv3.main.trymodel;

import X.C0KX4;
import X.C1119170fEJ;
import X.C12ES;
import X.C20743716Ff;
import X.C21411718qp;
import X.C439101nJ;
import X.C474710IjV;
import X.C497740JfY;
import X.C758170Tod;
import X.C786410Ut5;
import X.C925150aBN;
import Y.ACListenerS150S0100000_15;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.livesdk.TryModeSheetBaseFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes16.dex */
public final class TryModeMultiGuestAnchorSettingSheet extends TryModeSheetBaseFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6HELIOSemE+KSwiZzshMSgjLSo/ZhE+MAI8LCABPCMnIQI5LDwnCSsvISAhGyA4PSY9LxYkLCon";
    public ViewGroup LLJZIJLIL;
    public View LLL;
    public View LLLF;
    public ViewGroup LLLFF;
    public ViewGroup LLLFFI;
    public View LLLFZ;
    public C21411718qp LLLI;
    public ViewGroup LLLII;
    public View LLLIIII;
    public C21411718qp LLLIIIIL;
    public ViewGroup LLLIIIL;
    public View LLLIIL;
    public C21411718qp LLLIILIL;

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
        View view2 = null;
        C0KX4.LIZ("livesdk_trymode_anchor_guest_setting_page_show", C474710IjV.LIZ(), null, true);
        C20743716Ff c20743716Ff = (C20743716Ff) view.findViewById(R.id.wu6);
        C786410Ut5.k8(c20743716Ff, new ACListenerS150S0100000_15(c20743716Ff, 131));
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0aRD
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                C0KX4.LIZ("livesdk_trymode_permissionsettings_viewer_on_and_off", C474710IjV.LIZ(), null, true);
            }
        }, view.findViewById(R.id.wvf));
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0aRE
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                C0KX4.LIZ("livesdk_trymode_permissionsettiings_followers_only_on_and_off", C474710IjV.LIZ(), null, true);
            }
        }, view.findViewById(R.id.wuj));
        TextView textView = (TextView) view.findViewById(R.id.ztd);
        if (textView != null) {
            if (C925150aBN.LJJIII()) {
                textView.setText(2131854213);
            } else {
                textView.setText(2131843371);
            }
        }
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.ax8);
        if (viewGroup != null) {
            if (C925150aBN.LJJIII()) {
                C439101nJ.LJI(viewGroup);
            } else {
                C12ES.LJIILL(0, viewGroup);
            }
        } else {
            viewGroup = null;
        }
        this.LLJZIJLIL = viewGroup;
        view.findViewById(R.id.wvf);
        this.LLL = view.findViewById(R.id.viewer_permission_switch_layout);
        view.findViewById(R.id.wuj);
        this.LLLF = view.findViewById(R.id.png);
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.pnf);
        if (viewGroup2 != null) {
            if (C925150aBN.LJJIII()) {
                C439101nJ.LJI(viewGroup2);
            } else {
                C12ES.LJIILL(0, viewGroup2);
            }
        } else {
            viewGroup2 = null;
        }
        this.LLLFF = viewGroup2;
        ViewGroup viewGroup3 = (ViewGroup) view.findViewById(R.id.im_);
        if (viewGroup3 != null) {
            if (C925150aBN.LJJIII()) {
                C12ES.LJIILL(0, viewGroup3);
            } else {
                C439101nJ.LJI(viewGroup3);
            }
        } else {
            viewGroup3 = null;
        }
        this.LLLFFI = viewGroup3;
        View viewFindViewById = view.findViewById(R.id.ima);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS150S0100000_15(this, 132), viewFindViewById);
        } else {
            viewFindViewById = null;
        }
        this.LLLFZ = viewFindViewById;
        this.LLLI = (C21411718qp) view.findViewById(R.id.wu8);
        ViewGroup viewGroup4 = (ViewGroup) view.findViewById(R.id.igc);
        if (viewGroup4 != null) {
            if (C925150aBN.LJJIII()) {
                C12ES.LJIILL(0, viewGroup4);
            } else {
                C439101nJ.LJI(viewGroup4);
            }
        } else {
            viewGroup4 = null;
        }
        this.LLLII = viewGroup4;
        View viewFindViewById2 = view.findViewById(R.id.igd);
        if (viewFindViewById2 != null) {
            C786410Ut5.I7(new ACListenerS150S0100000_15(this, 129), viewFindViewById2);
        } else {
            viewFindViewById2 = null;
        }
        this.LLLIIII = viewFindViewById2;
        this.LLLIIIIL = (C21411718qp) view.findViewById(R.id.wu7);
        ViewGroup viewGroup5 = (ViewGroup) view.findViewById(R.id.pvf);
        if (viewGroup5 != null) {
            if (C925150aBN.LJJIII()) {
                C12ES.LJIILL(0, viewGroup5);
            } else {
                C439101nJ.LJI(viewGroup5);
            }
        } else {
            viewGroup5 = null;
        }
        this.LLLIIIL = viewGroup5;
        View viewFindViewById3 = view.findViewById(R.id.pvg);
        if (viewFindViewById3 != null) {
            C786410Ut5.I7(new ACListenerS150S0100000_15(this, 130), viewFindViewById3);
            view2 = viewFindViewById3;
        }
        this.LLLIIL = view2;
        this.LLLIILIL = (C21411718qp) view.findViewById(R.id.wum);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        uS(viewGroup);
        return C786410Ut5.Td(layoutInflater, R.layout.hmd, viewGroup, false);
    }
}
