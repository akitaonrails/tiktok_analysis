package com.bytedance.android.live.rank.impl.list.view;

import X.C0IJT;
import X.C0TZM;
import X.C1143680frq;
import X.C1324720kZq;
import X.C16F5;
import X.C16FS;
import X.C1810210xCt;
import X.C1810690xDf;
import X.C465640INu;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C500980Jkm;
import X.C786410Ut5;
import Y.ACListenerS152S0100000_17;
import Y.ARunnableS106S0100000_6;
import android.os.Bundle;
import android.view.View;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes18.dex */
public final class PopularityRankingEducationDialog extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiOy49I2slJD8/ZiklOjHELIOSt9PiwpPmEDJzU5JS4hITE1Gy49IywiLgo3PSYtPSY8JgElKCM8Lw==";
    public LiveIconView LL;
    public C1324720kZq LLILLJJLI;
    public C16FS LLILLL;
    public C16F5 LLILZ;
    public View LLILZIL;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        DataChannel dataChannel = this.dataChannel;
        boolean zLJJIJIL = C500260Jjc.LJJIJIL(dataChannel != null ? (Boolean) dataChannel.gg0(C0TZM.class) : null);
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g_e);
        c500980Jkm.LIZJ = zLJJIJIL ? R.style.ahb : C497740JfY.LJJ() ? R.style.ahf : R.style.ahg;
        c500980Jkm.LJII = zLJJIJIL ? 80 : C497740JfY.LJJ() ? 3 : 5;
        c500980Jkm.LJI = 0.0f;
        int iLIZIZ = C465640INu.LIZIZ(getContext());
        if (zLJJIJIL) {
            iLIZIZ = -1;
        }
        c500980Jkm.LJIIIZ = iLIZIZ;
        c500980Jkm.LJIIJ = -1;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        view.setFitsSystemWindows(true);
        this.LL = (LiveIconView) view.findViewById(R.id.k2w);
        this.LLILLJJLI = (C1324720kZq) view.findViewById(R.id.lrj);
        this.LLILLL = (C16FS) view.findViewById(R.id.cte);
        this.LLILZ = (C16F5) view.findViewById(R.id.tv_popularity_ranking_education_tab_second);
        this.LLILZIL = view.findViewById(R.id.wyu);
        LiveIconView liveIconView = this.LL;
        if (liveIconView != null) {
            C786410Ut5.g8(liveIconView, new ACListenerS152S0100000_17(this, 96));
        }
        C16FS c16fs = this.LLILLL;
        if (c16fs != null) {
            C786410Ut5.h8(c16fs, new ACListenerS152S0100000_17(this, 97));
        }
        C1143680frq.LIZLLL(this.LLILLJJLI, "tiktok_live_revenue_demand_1", "ttlive_popularity_ranking_education_dialog_bg.png");
        C16F5 c16f5 = this.LLILZ;
        if (c16f5 != null) {
            HandlerHook.viewPost(c16f5, new ARunnableS106S0100000_6(this, 158));
        }
        C1810690xDf c1810690xDf = C1810690xDf.LIZ;
        DataChannel dataChannel = this.dataChannel;
        c1810690xDf.getClass();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_team_rank_first_guide_show");
        C1810690xDf.LIZ(c474500IjALIZ, dataChannel);
        c474500IjALIZ.LJJII(C1810210xCt.LJIIIZ, "enter_from");
        c474500IjALIZ.LIZ();
    }
}
