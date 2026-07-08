package X;

import android.view.View;
import com.bytedance.android.live.liveinteract.matchv2.connection.combinedmatch.coordinator.CombinedMatchInviterPanelDismissEvent;
import com.bytedance.android.live.liveinteract.matchv2.connection.combinedmatch.coordinator.TriggerCombinedMatchPanelDismissEvent;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AFwS299S0000000_15;
import kotlin.jvm.internal.AwS416S0200000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bVF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C975910bVF implements InterfaceC975900bVE {
    public final MatchBaseWidget LIZ;
    public EnumC919170a1j LIZIZ;
    public final DataChannel LIZJ;
    public final C977630bY1 LIZLLL;
    public Function0<Unit> LJ = AFwS203S0000000_15.get$arr$(316);
    public boolean LJFF = true;
    public String LJI = "";

    @Override // X.InterfaceC975900bVE
    public final void LIZIZ() {
        DataChannel dataChannel = this.LIZJ;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
    }

    @Override // X.InterfaceC975900bVE
    public final void LJIIL() {
        DataChannel dataChannel = this.LIZJ;
        if (dataChannel != null) {
            dataChannel.LC0(TriggerCombinedMatchPanelDismissEvent.class, Boolean.valueOf(this.LJFF));
        }
        this.LJFF = false;
    }

    @Override // X.InterfaceC975900bVE
    public final void LJIIZILJ() {
        View viewFindViewById = this.LIZ.findViewById(R.id.cnn);
        C985030bjx c985030bjx = (C985030bjx) this.LIZ.findViewById(R.id.cnl);
        if (c985030bjx != null) {
            c985030bjx.LIZIZ();
        }
        if (viewFindViewById != null) {
            viewFindViewById.setEnabled(false);
        }
        if (c985030bjx != null) {
            c985030bjx.setEnabled(false);
        }
    }

    public C975910bVF(MatchBaseWidget matchBaseWidget, EnumC919170a1j enumC919170a1j) {
        this.LIZ = matchBaseWidget;
        this.LIZIZ = enumC919170a1j;
        this.LIZJ = matchBaseWidget.provideDataChannel();
        this.LIZLLL = (C977630bY1) matchBaseWidget.y1(C977630bY1.class);
    }

    @Override // X.InterfaceC975900bVE
    public final void LJJIJL(final EnumC974980bTk enumC974980bTk, final EnumC975850bV9 enumC975850bV9, final boolean z, final String str, final GiftMode giftMode, final InterfaceC1631620sYq<? super EnumC919170a1j, ? super List<C954460awe>, ? super List<C954460awe>, Unit> interfaceC1631620sYq, final Function0<Unit> function0, final Function0<Unit> function02, final Function0<Unit> function03, final Function0<Unit> function04) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("presentInvitationPanel, showReason: ");
        sbLIZ.append(enumC974980bTk);
        sbLIZ.append(", isRematch: ");
        sbLIZ.append(z);
        sbLIZ.append(", ruleGuideUrl: ");
        sbLIZ.append(str);
        sbLIZ.append(", giftMode: ");
        sbLIZ.append(giftMode);
        C20441214yg.LIZIZ("CombinedMatchPreparingCoordinator", C2188811AlT.LIZIZ(sbLIZ));
        String strLJJIJIIJI = C915980Zwa.LJI().LJIIJ().LJJIJIIJI();
        if (!Intrinsics.LJFF(strLJJIJIIJI, "playbook_match")) {
            this.LJI = strLJJIJIIJI;
        }
        final MatchBaseWidget matchBaseWidget = this.LIZ;
        C786410Ut5.LJLIIL(20L, C0IK5.LIZ(), new Runnable() { // from class: X.0bVC
            public final void LIZ() {
                Function0<Unit> function0LJIILL;
                C961300b7g.LIZ.getClass();
                C20484615Do c20484615DoLIZ = C464790IKn.LIZ.LIZ();
                if (c20484615DoLIZ != null && c20484615DoLIZ.LJ("match_combined_inviter_dialog")) {
                    InterfaceC975870bVB interfaceC975870bVBLJFF = C915980Zwa.LJI().LJFF();
                    if (interfaceC975870bVBLJFF != null && interfaceC975870bVBLJFF.LIZLLL()) {
                        InterfaceC975870bVB interfaceC975870bVBLJFF2 = C915980Zwa.LJI().LJFF();
                        if (interfaceC975870bVBLJFF2 != null && (function0LJIILL = interfaceC975870bVBLJFF2.LJIILL()) != null) {
                            function0LJIILL.invoke();
                        }
                        InterfaceC975870bVB interfaceC975870bVBLJFF3 = C915980Zwa.LJI().LJFF();
                        if (interfaceC975870bVBLJFF3 != null) {
                            interfaceC975870bVBLJFF3.LJJIFFI(AFwS203S0000000_15.get$arr$(317));
                        }
                        InterfaceC975870bVB interfaceC975870bVBLJFF4 = C915980Zwa.LJI().LJFF();
                        if (interfaceC975870bVBLJFF4 != null) {
                            interfaceC975870bVBLJFF4.LJI(false);
                        }
                    }
                    if (this.LL.LJI.length() > 0) {
                        C915980Zwa.LJI().LJIIJ().LJ(this.LL.LJI);
                        return;
                    }
                    return;
                }
                C975910bVF c975910bVF = this.LL;
                if (c975910bVF.LIZIZ == EnumC919170a1j.MATCH_TYPE_1VN) {
                    c975910bVF.LIZIZ = EnumC919170a1j.MATCH_TYPE_2V2;
                }
                C977630bY1 c977630bY1 = c975910bVF.LIZLLL;
                if (c977630bY1 != null) {
                    c977630bY1.LIZ(c975910bVF.LIZJ);
                }
                C975910bVF c975910bVF2 = this.LL;
                C977630bY1 c977630bY12 = c975910bVF2.LIZLLL;
                if (c977630bY12 != null) {
                    c977630bY12.LJJIIJZLJL(c975910bVF2.LIZIZ);
                }
                C975910bVF c975910bVF3 = this.LL;
                c975910bVF3.LJ = function03;
                DataChannel dataChannel = c975910bVF3.LIZJ;
                C979690bbL c979690bbL = dataChannel != null ? (C979690bbL) dataChannel.gg0(C962520b9e.class) : null;
                AwS416S0200000_15 awS416S0200000_15 = new AwS416S0200000_15(this.LL, (C975910bVF) function04, (Function0<Unit>) 67);
                DataChannel dataChannel2 = this.LL.LIZJ;
                MatchBaseWidget matchBaseWidget2 = matchBaseWidget;
                C978090bYl c978090bYl = new C978090bYl(AFwS299S0000000_15.get$arr$(36));
                C975920bVG c975920bVG = new C975920bVG(this.LL, enumC974980bTk, enumC975850bV9, z, str, giftMode, interfaceC1631620sYq, function0, function02, function03, awS416S0200000_15);
                InterfaceC1631620sYq<EnumC919170a1j, List<C954460awe>, List<C954460awe>, Unit> interfaceC1631620sYq2 = interfaceC1631620sYq;
                Function0<Unit> function05 = function0;
                Function0<Unit> function06 = function02;
                EnumC974980bTk enumC974980bTk2 = enumC974980bTk;
                boolean z2 = enumC974980bTk2 == EnumC974980bTk.REJECT;
                EnumC975850bV9 enumC975850bV92 = enumC975850bV9;
                boolean z3 = z;
                C961300b7g.LJIIIZ(dataChannel2, C978150bYr.LIZ(matchBaseWidget2, c978090bYl, c975920bVG, interfaceC1631620sYq2, function05, function06, awS416S0200000_15, null, z2, c979690bbL, enumC974980bTk2, enumC975850bV92, z3, z3, null, 49280));
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("CombinedMatchPreparingCoordinator@e79b.presentInvitationPanel$1$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("CombinedMatchPreparingCoordinator@e79b.presentInvitationPanel$1$1");
            }
        });
        DataChannel dataChannel = this.LIZJ;
        if (dataChannel != null) {
            dataChannel.CQ2(CombinedMatchInviterPanelDismissEvent.class, this, new AwS594S0100000_15(this, 796));
        }
    }
}
