package com.bytedance.android.live.effect.karaoke.fragments;

import X.C0IJT;
import X.C0U17;
import X.C1119170fEJ;
import X.C16FS;
import X.C474500IjA;
import X.C475510Ikn;
import X.C758170Tod;
import X.C786410Ut5;
import Y.ACListenerS116S0200000_12;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public final class KaraokeEducationSheet extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiLCk1LSY4ZyQyOiHELIOSQjIip9LjctLiI2JjE/ZwQyOiQjIioWLDAvKDs6JysfISo2PA==";

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        ArrayList arrayList = new ArrayList();
        C758170Tod c758170TodUR = UR();
        if (c758170TodUR != null) {
            arrayList.add(c758170TodUR);
        }
        c1119170fEJ.LJFF = arrayList;
        c1119170fEJ.LJI = false;
        return c1119170fEJ;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Integer numValueOf;
        Bundle arguments = getArguments();
        if (arguments != null) {
            numValueOf = Integer.valueOf(arguments.getInt("karaoke_action_type", -1));
        } else {
            numValueOf = null;
        }
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.hm1, viewGroup, false);
        C16FS c16fs = (C16FS) viewTd.findViewById(R.id.m1v);
        if (c16fs != null) {
            C786410Ut5.h8(c16fs, new ACListenerS116S0200000_12(this, numValueOf, 10));
        }
        C0U17 c0u17 = C0U17.LIZ;
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_karaoke_education_panel_show");
        c474500IjALIZ.LJIJJLI(dataChannelLJ);
        c474500IjALIZ.LIZ();
        return viewTd;
    }
}
