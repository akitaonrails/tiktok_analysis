package X;

import android.content.Context;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.MatchPlaybookCapabilityShowEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorServiceV2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicNonMGPlaybookFixTechSwitchSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS67S0210000_15;
import kotlin.jvm.internal.AwS97S0210000_15;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play.PlaybookContent;

/* JADX INFO: renamed from: X.0baL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C979070baL {
    public static final void LIZ(DataChannel dataChannel) {
        C0UTJ c0utjPl1 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Pl1(dataChannel);
        if (c0utjPl1 != null) {
            c0utjPl1.LJIL(EnumC20429414wm.DETAIL, "match_playbook_entrance", null);
        }
    }

    public static final void LIZIZ(DataChannel dataChannel, String str) {
        InterfaceC975870bVB interfaceC975870bVBLJFF;
        if (str.length() > 0 && (interfaceC975870bVBLJFF = C915980Zwa.LJI().LJFF()) != null) {
            interfaceC975870bVBLJFF.LJJI();
        }
        if (dataChannel != null) {
            dataChannel.LC0(MatchPlaybookCapabilityShowEvent.class, new C974190bST(str));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(com.bytedance.ies.sdk.datachannel.DataChannel r8, X.EnumC975850bV9 r9, long r10, boolean r12, int r13) {
        /*
            r0 = r13 & 4
            if (r0 == 0) goto L6
            r10 = 0
        L6:
            r0 = r13 & 8
            r5 = 0
            if (r0 == 0) goto Lc
            r12 = 0
        Lc:
            boolean r0 = X.C976600bWM.LIZ(r9)
            r4 = 1
            if (r0 != 0) goto L70
            boolean r0 = X.C975140bU0.LJFF()
            if (r0 != 0) goto L70
            boolean r0 = X.C975140bU0.LJII()
            if (r0 != 0) goto L70
            X.0at4 r0 = X.C915980Zwa.LJI()
            X.0bVB r0 = r0.LJFF()
            r6 = 0
            if (r0 == 0) goto L73
            java.util.List r0 = r0.LJ()
            if (r0 == 0) goto L73
            java.util.Iterator r7 = r0.iterator()
        L34:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L71
            java.lang.Object r3 = r7.next()
            r0 = r3
            webcast.data.multi_guest_play.Playbook r0 = (webcast.data.multi_guest_play.Playbook) r0
            long r1 = r0.playbookId
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 != 0) goto L34
        L47:
            webcast.data.multi_guest_play.Playbook r3 = (webcast.data.multi_guest_play.Playbook) r3
            if (r3 == 0) goto L73
            boolean r0 = com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt.LIZ(r3, r8)
            if (r0 != r4) goto L73
            r3 = 1
        L52:
            X.0Upu r2 = X.C784440Upu.LIZ()
            X.0bSV r1 = new X.0bSV
            java.lang.String r0 = "start_match"
            r1.<init>(r0, r6)
            java.lang.String r0 = "playbook_match"
            r1.LJFF = r0
            r1.LJI = r10
            r1.LJIIJJI = r5
            r1.LJIIZILJ = r3
            r1.LJIIL = r12
            if (r3 == 0) goto L6d
            r1.LJIIJ = r4
        L6d:
            r2.LIZIZ(r1)
        L70:
            return
        L71:
            r3 = r6
            goto L47
        L73:
            r3 = 0
            goto L52
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C979070baL.LIZLLL(com.bytedance.ies.sdk.datachannel.DataChannel, X.0bV9, long, boolean, int):void");
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [X.14rA] */
    public static C20394614rA LIZJ(final DataChannel dataChannel, final C1117360fBO c1117360fBO, final Function0 function0, boolean z, EnumC975850bV9 enumC975850bV9, int i) {
        EnumC975850bV9 enumC975850bV92 = enumC975850bV9;
        final boolean z2 = z;
        if ((i & 8) != 0) {
            z2 = false;
        }
        if ((i & 16) != 0) {
            enumC975850bV92 = null;
        }
        AwS381S0200000_15 awS381S0200000_15 = new AwS381S0200000_15(dataChannel, enumC975850bV92, 6);
        AwS67S0210000_15 awS67S0210000_15 = new AwS67S0210000_15(z2, dataChannel, enumC975850bV92, 0);
        final AwS97S0210000_15 awS97S0210000_15 = new AwS97S0210000_15(z2, dataChannel, enumC975850bV92, 0);
        EnumC979090baN enumC979090baN = EnumC979090baN.START;
        String strLJIJI = C497740JfY.LJIJI(2131853678);
        EnumC202064144o enumC202064144o = EnumC202064144o.APPEND;
        final C979080baM c979080baM = new C979080baM(C1697810uHb.LJIIJJI(new C20386614ps(enumC979090baN, strLJIJI, enumC202064144o, awS67S0210000_15), new C20386614ps(EnumC979090baN.END, C497740JfY.LJIJI(2131853687), enumC202064144o, awS381S0200000_15), new C20386614ps(EnumC979090baN.BACK, C497740JfY.LJIJI(2131853685), EnumC202064144o.REPLACE, awS381S0200000_15)), new AwS594S0100000_15(dataChannel, 55), new AwS381S0200000_15(dataChannel, enumC975850bV92, 7));
        return new C20395414rI(dataChannel, c1117360fBO, function0, c979080baM) { // from class: X.14rA
            @Override // X.InterfaceC20405014sq
            public final void tq(Playbook playbook, C20402114sN c20402114sN) {
                Long lLIZ;
                DataChannel dataChannel2;
                PlaybookAnchorServiceV2 playbookAnchorServiceV2LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Match playbook (id: ");
                sbLIZ.append(playbook.playbookId);
                sbLIZ.append(") use button clicked, setting as reference");
                C20441214yg.LIZIZ("MatchPlaybookEntranceHelper", C2188811AlT.LIZIZ(sbLIZ));
                Function0<Unit> function02 = c20402114sN;
                if (z2) {
                    function02 = awS97S0210000_15;
                }
                DataChannel dataChannel3 = this.LL;
                if (dataChannel3 != null) {
                    lLIZ = C784920Uqg.LIZ(dataChannel3);
                } else {
                    lLIZ = null;
                }
                Context contextInvoke = this.LLILLL.invoke();
                if (contextInvoke != null && (dataChannel2 = this.LL) != null && (playbookAnchorServiceV2LIZIZ = C784920Uqg.LIZIZ(dataChannel2)) != null) {
                    String strLJJJJL = playbookAnchorServiceV2LIZIZ.LJJJJL(playbook);
                    if (strLJJJJL == null) {
                        strLJJJJL = "";
                    }
                    C20395114rF c20395114rF = new C20395114rF(this, function02, lLIZ);
                    C20394714rB c20394714rB = C20394714rB.LIZ;
                    DataChannel dataChannel4 = playbookAnchorServiceV2LIZIZ.LLJI;
                    PlaybookAnchorViewModel playbookAnchorViewModel = (PlaybookAnchorViewModel) playbookAnchorServiceV2LIZIZ.LLILLJJLI;
                    c20394714rB.getClass();
                    C20394714rB.LJ(dataChannel4, contextInvoke, playbook, playbookAnchorViewModel, C20394714rB.LIZJ(playbook, null, playbookAnchorViewModel), null, strLJJJJL, c20395114rF);
                }
            }

            @Override // X.InterfaceC20405014sq
            public final void nn(Playbook playbook, boolean z3, C978410bZH c978410bZH) {
                int i2;
                PlaybookAnchorServiceV2 playbookAnchorServiceV2LIZIZ;
                C20382814pG c20382814pG;
                EnumC20429314wl enumC20429314wl;
                boolean z4;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Match playbook (id: ");
                sbLIZ.append(playbook.playbookId);
                sbLIZ.append(") clicked");
                C20441214yg.LIZIZ("MatchPlaybookEntranceHelper", C2188811AlT.LIZIZ(sbLIZ));
                Iterator<?> it2 = this.LLILLJJLI.LL.iterator();
                int i3 = 0;
                while (true) {
                    i2 = -1;
                    if (it2.hasNext()) {
                        if (it2.next() instanceof C980060bbw) {
                            break;
                        } else {
                            i3++;
                        }
                    } else {
                        i3 = -1;
                        break;
                    }
                }
                Iterator<?> it3 = this.LLILLJJLI.LL.iterator();
                int i4 = 0;
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next = it3.next();
                    if ((next instanceof C980060bbw) && ((C20390914qZ) next).LIZ.playbookId == playbook.playbookId) {
                        i2 = i4;
                        break;
                    }
                    i4++;
                }
                int i5 = i2 - i3;
                if (z3) {
                    C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
                    DataChannel dataChannel2 = this.LL;
                    if (i5 < 0) {
                        i5 = 0;
                    }
                    int i6 = i5 + 1;
                    if (LLJJ() == playbook.playbookId) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    C978360bZC.LJIILL(dataChannel2, "click", playbook, "match_panel", i6, z4, false, null, null, 0, "match_panel", "match_icon", 960);
                }
                DataChannel dataChannel3 = this.LL;
                if (dataChannel3 != null && (playbookAnchorServiceV2LIZIZ = C784920Uqg.LIZIZ(dataChannel3)) != null) {
                    C979080baM c979080baM2 = this.LLILZ;
                    long j = 0;
                    if (c979080baM2 != null) {
                        long j2 = playbook.playbookId;
                        PlaybookContent playbookContent = playbook.content;
                        if (playbookContent != null) {
                            j = playbookContent.playbookContentId;
                        }
                        c20382814pG = new C20382814pG(j2, j, playbook.isUpdatedVersion, false, false, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, c979080baM2.LIZ, c979080baM2.LIZIZ, c979080baM2.LIZJ, c979080baM2.LIZLLL, c979080baM2.LJ, null, null, false, -260048904);
                    } else {
                        long j3 = playbook.playbookId;
                        PlaybookContent playbookContent2 = playbook.content;
                        if (playbookContent2 != null) {
                            j = playbookContent2.playbookContentId;
                        }
                        c20382814pG = new C20382814pG(j3, j, playbook.isUpdatedVersion, false, false, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, -2056);
                    }
                    C915190ZvJ c915190ZvJ2 = C978360bZC.LIZJ;
                    if (LinkMicNonMGPlaybookFixTechSwitchSetting.INSTANCE.isEnable()) {
                        enumC20429314wl = EnumC20429314wl.INTERACT;
                    } else {
                        enumC20429314wl = null;
                    }
                    playbookAnchorServiceV2LIZIZ.LJJIFFI(c20382814pG, "match_panel", c915190ZvJ2, enumC20429314wl, false);
                }
            }
        };
    }
}
