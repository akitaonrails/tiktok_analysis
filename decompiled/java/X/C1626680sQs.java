package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.AwS147S0201000_25;
import kotlin.jvm.internal.AwS302S0300000_25;
import kotlin.jvm.internal.AwS62S0301000_25;

/* JADX INFO: renamed from: X.0sQs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1626680sQs implements InterfaceC1625550sP3 {
    public final /* synthetic */ C1626480sQY LL;

    public C1626680sQs(C1626480sQY c1626480sQY) {
        this.LL = c1626480sQY;
    }

    @Override // X.InterfaceC1625550sP3
    public final void LJIIIIZZ(Effect effect) {
        String name;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDownloading: ");
        if (effect != null) {
            name = effect.getName();
        } else {
            name = null;
        }
        sbLIZ.append(name);
        C1628270sTR.LIZIZ("EffectSourceComponent", C2188811AlT.LIZIZ(sbLIZ));
        if (effect != null) {
            C1626480sQY c1626480sQY = this.LL;
            c1626480sQY.w2(effect, new AwS62S0301000_25(c1626480sQY, effect, effect, 0, 17));
        }
    }

    @Override // X.InterfaceC1625550sP3
    public final void onSuccess(Effect effect) {
        if (effect != null) {
            C1626480sQY c1626480sQY = this.LL;
            c1626480sQY.w2(effect, new AwS302S0300000_25(c1626480sQY, effect, effect, 3));
        }
    }

    @Override // X.InterfaceC1625550sP3
    public final void LJII(int i, Effect effect) {
        String name;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onProgress: ");
        String effectId = null;
        if (effect != null) {
            name = effect.getName();
        } else {
            name = null;
        }
        sbLIZ.append(name);
        sbLIZ.append(" progress=");
        sbLIZ.append(i);
        sbLIZ.append(", effectId = ");
        if (effect != null) {
            effectId = effect.getEffectId();
        }
        sbLIZ.append(effectId);
        C1628270sTR.LIZIZ("EffectSourceComponent", C2188811AlT.LIZIZ(sbLIZ));
        C421570Gfz.LIZ(new AwS147S0201000_25(this, effect, i, 8));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    @Override // X.InterfaceC1625550sP3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILLIIL(com.ss.android.ugc.effectmanager.effect.model.Effect r5, com.ss.android.ugc.effectmanager.common.task.ExceptionResult r6) {
        /*
            r4 = this;
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "onFailed: "
            r1.append(r0)
            if (r5 == 0) goto Lb1
            java.lang.String r0 = r5.getName()
        Lf:
            r1.append(r0)
            java.lang.String r0 = " exception: "
            r1.append(r0)
            java.lang.String r0 = r6.getMsg()
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "EffectSourceComponent"
            X.C1628270sTR.LIZIZ(r0, r1)
            int r1 = r6.getErrorCode()
            r0 = 10005(0x2715, float:1.402E-41)
            r3 = 1
            if (r1 != r0) goto Laf
            java.lang.String r1 = r6.getMsg()
            java.lang.String r0 = "10001"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto Laf
            r2 = 1
        L3d:
            int r1 = r6.getErrorCode()
            r0 = 10020(0x2724, float:1.4041E-41)
            if (r1 == r0) goto L6f
            if (r2 != 0) goto L6f
            int r0 = r6.getErrorCode()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            if (r2 == 0) goto L90
            int r1 = r2.intValue()
            r0 = 2003(0x7d3, float:2.807E-42)
            if (r1 != r0) goto L70
            r3 = 2131830633(0x7f112769, float:1.9294269E38)
        L5c:
            X.0sQY r0 = r4.LL
            com.bytedance.scene.Scene r0 = r0.LL
            android.app.Activity r2 = r0.mActivity
            com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder r1 = new com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder
            r1.<init>()
            r1.messageRes(r3)
            r0 = 3056(0xbf0, float:4.282E-42)
            X.C1390380mHk.LIZ(r2, r0, r1)
        L6f:
            return
        L70:
            int r1 = r2.intValue()
            r0 = 2006(0x7d6, float:2.811E-42)
            if (r1 != r0) goto L7c
            r3 = 2131857911(0x7f1191f7, float:1.9349595E38)
            goto L5c
        L7c:
            int r1 = r2.intValue()
            r0 = 2004(0x7d4, float:2.808E-42)
            if (r1 == r0) goto L8c
            int r1 = r2.intValue()
            r0 = 2002(0x7d2, float:2.805E-42)
            if (r1 != r0) goto L90
        L8c:
            r3 = 2131833754(0x7f11339a, float:1.93006E38)
            goto L5c
        L90:
            X.15Ni r0 = X.C20510015Ni.LIZ
            X.0som r0 = r0.LJI()
            int[] r1 = X.C1626730sQx.LIZ
            int r0 = r0.ordinal()
            r1 = r1[r0]
            if (r1 == r3) goto Lab
            r0 = 2
            if (r1 == r0) goto La7
            r3 = 2131834347(0x7f1135eb, float:1.9301802E38)
            goto L5c
        La7:
            r3 = 2131829436(0x7f1122bc, float:1.9291841E38)
            goto L5c
        Lab:
            r3 = 2131829438(0x7f1122be, float:1.9291845E38)
            goto L5c
        Laf:
            r2 = 0
            goto L3d
        Lb1:
            r0 = 0
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1626680sQs.LJIILLIIL(com.ss.android.ugc.effectmanager.effect.model.Effect, com.ss.android.ugc.effectmanager.common.task.ExceptionResult):void");
    }
}
