package com.bytedance.android.live.liveinteract.multiguestv3.main.trymodel;

import X.C0KVU;
import X.C1099610eil;
import X.C1119170fEJ;
import X.C1121670fIL;
import X.C1826660xdQ;
import X.C497740JfY;
import X.C758170Tod;
import X.C786410Ut5;
import X.ViewOnClickListenerC512201z6;
import Y.ACListenerS150S0100000_15;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.TryModeSheetBaseFragment;
import com.bytedance.android.livesdk.userservice.UserService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes16.dex */
public final class TryModeMultiGuestAnchorManageSheet extends TryModeSheetBaseFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6HELIOSemE+KSwiZzshMSgjLSo/ZhE+MAI8LCABPCMnIQI5LDwnCSsvISAhBSQiKCg2Gy0pLDs=";

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LIZ(C497740JfY.LJIJI(2131840619));
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C1826660xdQ(R.drawable.etq, new ACListenerS150S0100000_15(this, 127)));
        arrayList.add(new C758170Tod(R.attr.dt3, new ACListenerS150S0100000_15(this, 128)));
        c1119170fEJ.LJFF = arrayList;
        return c1119170fEJ;
    }

    @Override // com.bytedance.android.livesdk.TryModeSheetBaseFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        User userLJIJJLI = UserService.getInstance().user().LJIJJLI();
        C1099610eil c1099610eil = (C1099610eil) view.findViewById(R.id.lms);
        C1121670fIL.LJIILIIL(c1099610eil, userLJIJJLI.getAvatarThumb(), c1099610eil.getWidth(), c1099610eil.getHeight(), R.drawable.el_);
        C786410Ut5.H8(c1099610eil, new ViewOnClickListenerC512201z6(this, 58));
        ((TextView) view.findViewById(R.id.tv_user_name)).setText(C0KVU.LIZ(userLJIJJLI));
        C786410Ut5.Q7((ImageView) view.findViewById(R.id.lki), new View.OnClickListener() { // from class: X.0aNm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C0KX4.LIZ("livesdk_trymode_anchor_guest_connection_click_flip_cammera", C474710IjV.LIZ(), null, true);
                C20337914i1<Integer> c20337914i1 = InterfaceC772190UQv.c3;
                Integer numLIZ = c20337914i1.LIZ();
                if (numLIZ != null && numLIZ.intValue() == 1) {
                    C766270U4b.LIZLLL(2131841010);
                    c20337914i1.LJ(0);
                } else {
                    C766270U4b.LIZLLL(2131841734);
                    c20337914i1.LJ(1);
                }
                C784440Upu.LIZ().LIZIZ(new C465900IOu(2));
            }
        });
        C786410Ut5.Q7((ImageView) view.findViewById(R.id.cl7), new View.OnClickListener() { // from class: X.0aVH
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C766270U4b.LIZLLL(2131842632);
            }
        });
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        uS(viewGroup);
        return C786410Ut5.Td(layoutInflater, R.layout.hmc, viewGroup, false);
    }
}
