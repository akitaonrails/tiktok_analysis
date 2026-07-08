package com.bytedance.android.live.rank.impl.list.fragment;

import X.C098200Yq;
import X.C1078670eAz;
import X.C1105240erq;
import X.C1105870esr;
import X.C1105900esu;
import X.C1132290fZT;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C475510Ikn;
import X.C786410Ut5;
import X.EnumC1083240eIM;
import X.InterfaceC2262081DgM;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes18.dex */
public final class RankSparkFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiOy49I2slJDHELIOS8/ZiklOjt9LjctLiI2JjFiGy49IxY8KD04DjctLiI2JjE=";
    public C1105870esr LL;
    public RankTypeV2 LLILLJJLI;

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C1105870esr c1105870esr = this.LL;
        if (c1105870esr != null) {
            c1105870esr.LIZIZ();
        }
        super.onDestroyView();
    }

    public RankSparkFragment() {
        RankTypeV2 rankTypeV2 = RankTypeV2.LIZ;
        this.LLILLJJLI = RankTypeV2.LJJIJIIJI;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        long id;
        long ownerUserId;
        InterfaceC2262081DgM interfaceC2262081DgM;
        Room room;
        Room room2;
        super.onViewCreated(view, bundle);
        this.LL = (C1105870esr) view.findViewById(R.id.vsn);
        String strLIZ = C1078670eAz.LIZ(this.LLILLJJLI.type, EnumC1083240eIM.RANK_PAGE.getScene());
        if (strLIZ == null) {
            strLIZ = "";
        }
        if (strLIZ.length() != 0) {
            C1105240erq c1105240erq = new C1105240erq();
            c1105240erq.LJIIIIZZ(strLIZ);
            c1105240erq.LJIIIZ();
            DataChannel dataChannelLJ = C475510Ikn.LJ(this);
            long id2 = 0;
            if (dataChannelLJ != null && (room2 = (Room) dataChannelLJ.gg0(RoomChannel.class)) != null) {
                id = room2.getId();
            } else {
                id = 0;
            }
            c1105240erq.LJIIJJI("room_id", String.valueOf(id));
            DataChannel dataChannelLJ2 = C475510Ikn.LJ(this);
            if (dataChannelLJ2 != null && (room = (Room) dataChannelLJ2.gg0(RoomChannel.class)) != null) {
                ownerUserId = room.getOwnerUserId();
            } else {
                ownerUserId = 0;
            }
            c1105240erq.LJIIJJI("anchor_id", String.valueOf(ownerUserId));
            DataChannel dataChannelLJ3 = C475510Ikn.LJ(this);
            if (dataChannelLJ3 != null && (interfaceC2262081DgM = (InterfaceC2262081DgM) dataChannelLJ3.gg0(C1132290fZT.class)) != null) {
                id2 = interfaceC2262081DgM.getId();
            }
            c1105240erq.LJIIJJI("user_id", String.valueOf(id2));
            String string = c1105240erq.LIZ().toString();
            C1105870esr c1105870esr = this.LL;
            if (c1105870esr != null) {
                boolean z = C1105900esu.LIZIZ;
                c1105870esr.LIZ(-1, C1105900esu.LIZ(C475510Ikn.LJ(this), string), "");
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gld, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
