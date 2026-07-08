package com.bytedance.android.live.liveinteract.matchv2.connection.teampair.view;

import X.C20441214yg;
import X.C20743416Fc;
import X.C2188811AlT;
import X.C475510Ikn;
import X.C786410Ut5;
import X.C973070bQf;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.liveinteract.match.business.event.BattleInvitingTimeLeftChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public abstract class AbsTeamPairFragment<T> extends LiveSheetFragment {
    public C973070bQf LLJLLL;
    public C20743416Fc LLJZ;
    public C20743416Fc LLJZIJLIL;
    public DataChannel LLL = C475510Ikn.LJ(this);

    public void uS() {
        DataChannel dataChannel = this.LLL;
        if (dataChannel != null) {
            dataChannel.BQ2(this, BattleInvitingTimeLeftChannel.class, new AwS594S0100000_15(this, 137));
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public void x1(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sheet close, reason = ");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("AbsTeamPairFragment", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLJLLL = (C973070bQf) view.findViewById(R.id.o29);
        view.findViewById(R.id.mcj);
        this.LLJZ = (C20743416Fc) view.findViewById(R.id.xg2);
        this.LLJZIJLIL = (C20743416Fc) view.findViewById(R.id.xg0);
        uS();
        view.findViewById(R.id.niq).setBackgroundResource(R.drawable.dzf);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.h85, viewGroup, false);
    }
}
