package com.bytedance.android.live.liveinteract.multimatch.ui;

import X.C1143680frq;
import X.C1154890g9v;
import X.C1155220gAS;
import X.C1559260qg8;
import X.C16F5;
import X.C1819620xS4;
import X.C1954807lC;
import X.C20486515Eh;
import X.C20736316Cj;
import X.C723590SZx;
import X.EnumC1154880g9u;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.match.business.event.BattlePunishTimeLeftChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleShowLeagueScoreChannel;
import com.bytedance.android.live.liveinteract.multihost.event.MultiCoHostStateChannel;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class MatchPunishCountDownAssem extends UIContentAssem {
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723590SZx(this, C1155220gAS.class, null), checkSupervisorPrepared());
    public C16F5 LLJ;
    public C16F5 LLJI;
    public LinearLayout LLJIJIL;
    public ImageView LLJILJIL;
    public LiveIconView LLJILJILJ;
    public DataChannel LLJILLL;

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        DataChannel dataChannel = this.LLJILLL;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        super.onDestroy();
    }

    public final void Go(C20486515Eh c20486515Eh) {
        LiveIconView liveIconView = this.LLJILJILJ;
        if (liveIconView == null) {
            return;
        }
        if (c20486515Eh == null) {
            liveIconView.setIcon(C20736316Cj.LIZLLL(R.attr.d3b, liveIconView.getContext()));
            return;
        }
        EnumC1154880g9u enumC1154880g9u = c20486515Eh.LIZ;
        if (enumC1154880g9u == EnumC1154880g9u.IMAGE_MODEL && c20486515Eh.LJ != null) {
            C1819620xS4.LIZ().LJIIIZ(c20486515Eh.LJ).LJJI(liveIconView);
        } else if (enumC1154880g9u == EnumC1154880g9u.GECKO) {
            C1143680frq.LIZLLL(liveIconView, c20486515Eh.LIZJ, c20486515Eh.LIZLLL);
        } else {
            liveIconView.setIcon(c20486515Eh.LIZIZ);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJILLL = ((C1155220gAS) this.LLIZLLLIL.getValue()).LLILLJJLI;
        this.LLJIJIL = (LinearLayout) view;
        this.LLJ = (C16F5) view.findViewById(R.id.tv_pk_punish_countdown_value);
        this.LLJI = (C16F5) view.findViewById(R.id.tv_pk_punish_title);
        this.LLJILJIL = (ImageView) view.findViewById(R.id.ls8);
        this.LLJILJILJ = (LiveIconView) view.findViewById(R.id.ls7);
        DataChannel dataChannel = this.LLJILLL;
        if (dataChannel != null) {
            dataChannel.CQ2(BattlePunishTimeLeftChannel.class, this, new AwS610S0100000_31(this, 91));
        }
        DataChannel dataChannel2 = this.LLJILLL;
        if (dataChannel2 != null) {
            dataChannel2.CQ2(BattleShowLeagueScoreChannel.class, this, new AwS610S0100000_31(this, 92));
        }
        DataChannel dataChannel3 = this.LLJILLL;
        if (dataChannel3 != null) {
            dataChannel3.CQ2(MultiCoHostStateChannel.class, this, new AwS610S0100000_31(this, 93));
        }
    }

    public final void Ho(ImageView imageView, C20486515Eh c20486515Eh) {
        if (imageView != null && c20486515Eh != null) {
            int i = C1154890g9v.LIZ[c20486515Eh.LIZ.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        imageView.setImageResource(c20486515Eh.LIZIZ);
                        return;
                    }
                    throw new C1954807lC();
                }
                C1819620xS4.LIZ().LJIIIZ(c20486515Eh.LJ).LJJI(imageView);
                return;
            }
            C1143680frq.LIZLLL(imageView, c20486515Eh.LIZJ, c20486515Eh.LIZLLL);
        }
    }
}
