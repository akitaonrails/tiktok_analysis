package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playcondition;

import X.AbstractC20358214lI;
import X.C09JN;
import X.C11IW;
import X.C11NJ;
import X.C20361214lm;
import X.C2188811AlT;
import X.C462701r7;
import X.C916750Zxp;
import X.C953610avH;
import X.C970210bM3;
import X.C979290bah;
import X.InterfaceC781210Ukh;
import X.InterfaceC946300ajU;
import Y.AfS184S0100000_15;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.anchor.NoticeboardCreateAndUpdateChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes16.dex */
public final class NoticeboardStartSettingCondition extends AbstractC20358214lI {
    public C11NJ LJFF = new C11NJ();

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final String LIZJ() {
        return "noticeboard_start_setting";
    }

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final void LIZLLL() {
        this.LJFF = new C11NJ();
        C953610avH.LJJI.getClass();
        if (LJIIJJI("getStatus", C953610avH.LJJII, false)) {
            return;
        }
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel != null) {
            dataChannel.BQ2(this.LIZLLL, NoticeboardCreateAndUpdateChannel.class, new AwS594S0100000_15(this, 393));
        }
        this.LJFF.LIZ(new C11IW(C953610avH.LJJIII.LJJIJIIJIL(new AfS184S0100000_15(this, 59))).LJIJI(new C09JN() { // from class: X.0bak
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("NoticeboardStartSettingCondition@aa61.startConditionObserver$4");
                C1C7U.LIZIZ("NoticeboardStartSettingCondition@aa61.startConditionObserver$4");
            }
        }, new InterfaceC781210Ukh() { // from class: X.0bam
            @Override // X.InterfaceC781210Ukh
            public final void run() {
            }
        }));
        LIZ();
    }

    @Override // X.AbstractC20358214lI, com.bytedance.android.livesdk.condition.PlayCondition
    public final void LJIIIIZZ() {
        super.LJIIIIZZ();
        this.LJFF.dispose();
    }

    @Override // X.AbstractC20358214lI
    public final void LJIIJ(C20361214lm c20361214lm) {
        C953610avH.LJJI.getClass();
        LJIIJJI("onPlaybookTaskUpdate", C953610avH.LJJII, true);
    }

    public final boolean LJIIJJI(String str, String str2, boolean z) {
        String str3;
        String str4;
        C462701r7 c462701r7;
        C20361214lm c20361214lm = this.LIZJ;
        String str5 = null;
        if (c20361214lm != null) {
            str3 = c20361214lm.LJI;
        } else {
            str3 = null;
        }
        if (str3 != null && !a0.LJJJIL(str3)) {
            C916750Zxp c916750ZxpLIZ = C970210bM3.LIZ(C979290bah.LIZ(str3));
            C953610avH.LJJI.getClass();
            String str6 = C953610avH.LJJII;
            DataChannel dataChannel = this.LIZIZ;
            if (dataChannel != null && (c462701r7 = (C462701r7) dataChannel.gg0(NoticeboardCreateAndUpdateChannel.class)) != null) {
                str5 = c462701r7.LIZ;
            }
            if (Intrinsics.LJFF(str6, str5) && (str4 = C953610avH.LJJII) != null && str4.length() != 0) {
                long j = c916750ZxpLIZ.LIZIZ;
                Long lLIZIZ = C970210bM3.LIZIZ();
                if ((lLIZIZ != null && j == lLIZIZ.longValue()) || Intrinsics.LJFF(c916750ZxpLIZ.LIZJ, str2)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("true and parameter isNotNull, mediaNodeId: ");
                    sbLIZ.append(c916750ZxpLIZ.LIZJ);
                    sbLIZ.append(", templateType: ");
                    sbLIZ.append(c916750ZxpLIZ.LIZ);
                    sbLIZ.append(", templateId: ");
                    sbLIZ.append(c916750ZxpLIZ.LIZIZ);
                    sbLIZ.append(", source: ");
                    sbLIZ.append(str);
                    LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
                    InterfaceC946300ajU interfaceC946300ajU = this.LJ;
                    if (interfaceC946300ajU != null) {
                        interfaceC946300ajU.LIZ(true, z);
                    }
                    return true;
                }
            }
        } else if (str2 != null && str2.length() != 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("true and parameter isNullOrBlank source: ");
            sbLIZ2.append(str);
            LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2));
            InterfaceC946300ajU interfaceC946300ajU2 = this.LJ;
            if (interfaceC946300ajU2 != null) {
                interfaceC946300ajU2.LIZ(true, z);
            }
            return true;
        }
        return false;
    }
}
