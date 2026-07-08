package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playcondition;

import X.AbstractC20358214lI;
import X.C09JN;
import X.C11IW;
import X.C11NJ;
import X.C20361214lm;
import X.C953610avH;
import X.InterfaceC781210Ukh;
import Y.AfS184S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class NoticeboardFinishSettingCondition extends AbstractC20358214lI {
    public C11NJ LJFF = new C11NJ();

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final String LIZJ() {
        return "noticeboard_finish_setting";
    }

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final void LIZLLL() {
        this.LJFF = new C11NJ();
        if (LJIIJJI("getStatus", false)) {
            return;
        }
        C953610avH.LJJI.getClass();
        this.LJFF.LIZ(new C11IW(C953610avH.LJJIII.LJJIJIIJIL(new AfS184S0100000_15(this, 58))).LJIJI(new C09JN() { // from class: X.0baj
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("NoticeboardFinishSettingCondition@6b00.startConditionObserver$3");
                C1C7U.LIZIZ("NoticeboardFinishSettingCondition@6b00.startConditionObserver$3");
            }
        }, new InterfaceC781210Ukh() { // from class: X.0bal
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
        LJIIJJI("onPlaybookTaskUpdate", true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(r1, X.C953610avH.LJJII) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIJJI(java.lang.String r9, boolean r10) {
        /*
            r8 = this;
            X.14lm r0 = r8.LIZJ
            if (r0 == 0) goto L70
            java.lang.String r1 = r0.LJI
        L6:
            r7 = 0
            r5 = 1
            if (r1 == 0) goto L72
            boolean r0 = kotlin.text.a0.LJJJIL(r1)
            if (r0 != 0) goto L72
            com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.NoticeboardParam r0 = X.C979290bah.LIZ(r1)
            X.0Zxp r6 = X.C970210bM3.LIZ(r0)
            long r3 = r6.LIZIZ
            java.lang.Long r0 = X.C970210bM3.LIZIZ()
            if (r0 == 0) goto L28
            long r1 = r0.longValue()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L37
        L28:
            java.lang.String r1 = r6.LIZJ
            X.0avN r0 = X.C953610avH.LJJI
            r0.getClass()
            java.lang.String r0 = X.C953610avH.LJJII
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L9c
        L37:
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "true and parameter isNotNull, mediaNodeId: "
            r2.append(r0)
            java.lang.String r0 = r6.LIZJ
            r2.append(r0)
            java.lang.String r0 = ", templateType: "
            r2.append(r0)
            int r0 = r6.LIZ
            r2.append(r0)
            java.lang.String r0 = ", templateId: "
            r2.append(r0)
            long r0 = r6.LIZIZ
            r2.append(r0)
            java.lang.String r0 = ", source: "
            r2.append(r0)
            r2.append(r9)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r2)
            r8.LJIIIZ(r0)
            X.0ajU r0 = r8.LJ
            if (r0 == 0) goto L6f
            r0.LIZ(r5, r10)
        L6f:
            return r5
        L70:
            r1 = 0
            goto L6
        L72:
            X.0avN r0 = X.C953610avH.LJJI
            r0.getClass()
            java.lang.String r0 = X.C953610avH.LJJII
            if (r0 == 0) goto L9c
            int r0 = r0.length()
            if (r0 == 0) goto L9c
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "true and parameter isNullOrBlank source: "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r8.LJIIIZ(r0)
            X.0ajU r0 = r8.LJ
            if (r0 == 0) goto L9b
            r0.LIZ(r5, r10)
        L9b:
            return r5
        L9c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playcondition.NoticeboardFinishSettingCondition.LJIIJJI(java.lang.String, boolean):boolean");
    }
}
