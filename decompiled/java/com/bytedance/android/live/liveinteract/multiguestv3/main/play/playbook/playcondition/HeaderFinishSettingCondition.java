package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playcondition;

import X.AbstractC20358214lI;
import X.C20355114kn;
import X.C20361214lm;
import X.C937280aUw;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.TextHeaderConfig;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.ApplyingTextHeaderFromServerSideChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AwS397S0200000_31;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class HeaderFinishSettingCondition extends AbstractC20358214lI {
    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final String LIZJ() {
        return "header_finish_setting";
    }

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final void LIZLLL() {
        String str;
        C20361214lm c20361214lm = this.LIZJ;
        TextHeaderConfig textHeaderConfig = (c20361214lm == null || (str = c20361214lm.LJI) == null) ? null : (TextHeaderConfig) C937280aUw.LIZJ(TextHeaderConfig.class, str, new TextHeaderConfig());
        if (C20355114kn.LIZ(textHeaderConfig, this.LIZIZ, false, new AwS610S0100000_31(this, 53))) {
            return;
        }
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel != null) {
            dataChannel.BQ2(this.LIZLLL, ApplyingTextHeaderFromServerSideChannel.class, new AwS397S0200000_31(textHeaderConfig, this, 16));
        }
        LIZ();
    }

    @Override // X.AbstractC20358214lI
    public final void LJIIJ(C20361214lm c20361214lm) {
        TextHeaderConfig textHeaderConfig;
        String str = c20361214lm.LJI;
        if (str != null) {
            textHeaderConfig = (TextHeaderConfig) C937280aUw.LIZJ(TextHeaderConfig.class, str, new TextHeaderConfig());
        } else {
            textHeaderConfig = null;
        }
        C20355114kn.LIZ(textHeaderConfig, this.LIZIZ, false, new AwS610S0100000_31(this, 52));
    }
}
