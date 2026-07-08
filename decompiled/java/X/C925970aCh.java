package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.settings.MultiGuestApplyRouteSimplifySetting;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizApplyParams;
import webcast.data.MGEnterActionInfo;

/* JADX INFO: renamed from: X.0aCh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C925970aCh {
    public static InterfaceC925430aBp LIZ() {
        return MultiGuestApplyRouteSimplifySetting.INSTANCE.enable() ? new InterfaceC925430aBp() { // from class: X.0ap3
            @Override // X.InterfaceC925430aBp
            public final void LIZ(AbstractC926260aDA abstractC926260aDA, C925920aCc c925920aCc) {
                boolean z;
                String strLIZIZ;
                int i;
                int i2;
                int i3;
                C949840apC c949840apC;
                String str;
                int i4;
                int i5;
                String str2;
                int iIntValue;
                Long lValueOf;
                int iIntValue2;
                int iIntValue3;
                EnumC949920apK enumC949920apK;
                boolean z2;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("execute start, intent=");
                boolean z3 = abstractC926260aDA instanceof C949760ap4;
                if (z3) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("AgreeLinkMic(linkType=");
                    C949760ap4 c949760ap4 = (C949760ap4) abstractC926260aDA;
                    sbLIZ2.append(c949760ap4.LIZ);
                    sbLIZ2.append(", strategy=");
                    sbLIZ2.append(c949760ap4.LJIIIZ);
                    sbLIZ2.append(", position=");
                    sbLIZ2.append(c949760ap4.LJIIJ);
                    sbLIZ2.append(", inviterRole=");
                    sbLIZ2.append(c949760ap4.LJII);
                    sbLIZ2.append(", inviterUserId=");
                    sbLIZ2.append(c949760ap4.LJIIIIZZ);
                    sbLIZ2.append(", follow=");
                    sbLIZ2.append(c949760ap4.LJI);
                    sbLIZ2.append(", lineupResumeLink=");
                    sbLIZ2.append(c949760ap4.LJIILL);
                    sbLIZ2.append(", joinGameSessionId=");
                    sbLIZ2.append(c949760ap4.LJIILJJIL);
                    sbLIZ2.append(", hasEnterCtx=");
                    if (c949760ap4.LIZJ != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    sbLIZ2.append(z2);
                    sbLIZ2.append(')');
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                } else if (abstractC926260aDA instanceof C949770ap5) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Reject(channelId=");
                    C949770ap5 c949770ap5 = (C949770ap5) abstractC926260aDA;
                    sbLIZ3.append(c949770ap5.LIZ);
                    sbLIZ3.append(", linkType=");
                    sbLIZ3.append(c949770ap5.LIZJ);
                    sbLIZ3.append(", hasEnterCtx=");
                    if (c949770ap5.LIZLLL != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    sbLIZ3.append(z);
                    sbLIZ3.append(')');
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                } else {
                    throw new C1954807lC();
                }
                sbLIZ.append(strLIZIZ);
                sbLIZ.append(", hasCallback=");
                sbLIZ.append(true);
                C20441214yg.LJIIIZ("MultiGuestJoinImplV2", C2188811AlT.LIZIZ(sbLIZ));
                InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
                MGEnterActionInfo mGEnterActionInfo = null;
                if (interfaceC954180awCLLJLL == null) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("execute aborted: session is null, intent=");
                    sbLIZ4.append(abstractC926260aDA.getClass().getSimpleName());
                    C20441214yg.LJ("MultiGuestJoinImplV2", C2188811AlT.LIZIZ(sbLIZ4));
                    c925920aCc.LIZ(-1, "session not ready", null);
                    return;
                }
                long jLongValue = 0;
                String str3 = "";
                if (z3) {
                    C949760ap4 c949760ap42 = (C949760ap4) abstractC926260aDA;
                    EnumC2235671Cer enumC2235671Cer = EnumC2235671Cer.Agree;
                    C926050aCp c926050aCp = c949760ap42.LIZJ;
                    if (c926050aCp != null) {
                        mGEnterActionInfo = c926050aCp.LIZ;
                    }
                    long j = c949760ap42.LIZ;
                    long j2 = c949760ap42.LIZIZ;
                    if (mGEnterActionInfo != null) {
                        i4 = mGEnterActionInfo.enterAction;
                        i5 = mGEnterActionInfo.enterActionReason;
                    } else {
                        i4 = 0;
                        i5 = 0;
                    }
                    if (c926050aCp == null || (str2 = c926050aCp.LIZJ) == null) {
                        str2 = "";
                    }
                    Integer numValueOf = Integer.valueOf(c949760ap42.LJII);
                    if (numValueOf.intValue() != 0 || (c926050aCp != null && (numValueOf = Integer.valueOf(c926050aCp.LJIIIIZZ)) != null)) {
                        iIntValue = numValueOf.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    Long lValueOf2 = Long.valueOf(c949760ap42.LJIIIIZZ);
                    if (lValueOf2.longValue() != 0) {
                        jLongValue = lValueOf2.longValue();
                    } else if (c926050aCp != null && (lValueOf = Long.valueOf(c926050aCp.LJII)) != null) {
                        jLongValue = lValueOf.longValue();
                    }
                    boolean z4 = c949760ap42.LJI;
                    Integer num = c949760ap42.LJ;
                    if (num != null) {
                        iIntValue2 = num.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    Integer num2 = c949760ap42.LJFF;
                    if (num2 != null) {
                        iIntValue3 = num2.intValue();
                    } else {
                        iIntValue3 = 0;
                    }
                    String str4 = c949760ap42.LJIILIIL;
                    if (str4 != null) {
                        str3 = str4;
                    }
                    BizApplyParams bizApplyParams = new BizApplyParams(j, j2, 0, z4, iIntValue2, iIntValue, jLongValue, str3, c949760ap42.LJIILJJIL, iIntValue3, str2, i4, i5, c949760ap42.LJIILL);
                    int i6 = c949760ap42.LJIIIZ;
                    int i7 = c949760ap42.LJIIJ;
                    int i8 = C949810ap9.LIZ[c949760ap42.LJIILLIIL.LIZ.ordinal()];
                    if (i8 != 1) {
                        if (i8 == 2) {
                            enumC949920apK = EnumC949920apK.NormalApply;
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        enumC949920apK = EnumC949920apK.DirectAgree;
                    }
                    c949840apC = new C949840apC(0L, i6, i7, bizApplyParams, enumC2235671Cer, enumC949920apK, c949760ap42.LIZLLL, 531);
                } else if (abstractC926260aDA instanceof C949770ap5) {
                    C949770ap5 c949770ap52 = (C949770ap5) abstractC926260aDA;
                    EnumC2235671Cer enumC2235671Cer2 = EnumC2235671Cer.Reject;
                    C926050aCp c926050aCp2 = c949770ap52.LIZLLL;
                    if (c926050aCp2 != null) {
                        mGEnterActionInfo = c926050aCp2.LIZ;
                    }
                    long j3 = c949770ap52.LIZJ;
                    long j4 = c949770ap52.LIZIZ;
                    if (c926050aCp2 != null) {
                        i = c926050aCp2.LJIIIIZZ;
                        jLongValue = c926050aCp2.LJII;
                    } else {
                        i = 0;
                    }
                    if (mGEnterActionInfo != null) {
                        i2 = mGEnterActionInfo.enterAction;
                        i3 = mGEnterActionInfo.enterActionReason;
                    } else {
                        i2 = 0;
                        i3 = 0;
                    }
                    if (c926050aCp2 != null && (str = c926050aCp2.LIZJ) != null) {
                        str3 = str;
                    }
                    c949840apC = new C949840apC(c949770ap52.LIZ, 0, -1, new BizApplyParams(j3, j4, 0, false, 0, i, jLongValue, "", 0L, 0, str3, i2, i3, false), enumC2235671Cer2, null, c949770ap52.LJ, 658);
                } else {
                    throw new C1954807lC();
                }
                interfaceC954180awCLLJLL.LJJJJLI(c949840apC, new C987180bnQ(c925920aCc, this, 10));
            }
        } : new InterfaceC925430aBp() { // from class: X.0ap2
            /* JADX WARN: Removed duplicated region for block: B:65:0x01f1  */
            /* JADX WARN: Removed duplicated region for block: B:75:0x021d  */
            /* JADX WARN: Removed duplicated region for block: B:77:0x0221  */
            @Override // X.InterfaceC925430aBp
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(X.AbstractC926260aDA r35, X.C925920aCc r36) {
                /*
                    Method dump skipped, instruction units count: 604
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C949740ap2.LIZ(X.0aDA, X.0aCc):void");
            }
        };
    }
}
