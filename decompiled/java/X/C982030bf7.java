package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.CustomLinkMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS164S1100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS629S0100000_15;

/* JADX INFO: renamed from: X.0bf7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C982030bf7 extends AbstractC981980bf2<InterfaceC983470bhR> {
    public final C982460bfo LJIIIIZZ;

    @Override // X.AbstractC981450beB
    public final Set LJJIFFI() {
        return C093Y.LIZJ(EnumC974260bSa.START);
    }

    public final void LJJJLIIL() {
        long j = LJJIII().LJIIIZ;
        InterfaceC983470bhR interfaceC983470bhR = (InterfaceC983470bhR) LJJII();
        if (interfaceC983470bhR != null) {
            interfaceC983470bhR.LJJIIJ(1, j, new AwS594S0100000_15(this, 788), new AwS594S0100000_15(this, 789));
        }
    }

    @Override // X.AbstractC981450beB, X.InterfaceC976690bWV
    public final void LJIJ() {
        LJJJLIIL();
    }

    @Override // X.AbstractC981980bf2, X.AbstractC981450beB, X.InterfaceC976690bWV
    public final void LIZ(AbstractC982800bgM abstractC982800bgM) {
        super.LIZ(abstractC982800bgM);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0bet] */
    @Override // X.AbstractC981980bf2, X.AbstractC981450beB, X.InterfaceC976690bWV
    public final void LIZJ(EnumC975850bV9 enumC975850bV9) {
        super.LIZJ(enumC975850bV9);
        ?? LJJII = LJJII();
        if (LJJII != 0) {
            LJJII.LJFF();
        }
        AbstractC982800bgM abstractC982800bgM = this.LIZJ;
        if (abstractC982800bgM != null) {
            LJJJJIZL(abstractC982800bgM);
            InterfaceC974370bSl interfaceC974370bSlO20 = C915980Zwa.LIZ().o20();
            C962950bAL c962950bAL = EnumC962960bAM.Companion;
            EnumC962960bAM enumC962960bAM = LJJIII().LJIIIIZZ;
            c962950bAL.getClass();
            interfaceC974370bSlO20.LIZ(C962950bAL.LJFF(enumC962960bAM).getType());
            InterfaceC975870bVB interfaceC975870bVBLJFF = C915980Zwa.LJI().LJFF();
            if (interfaceC975870bVBLJFF != null) {
                interfaceC975870bVBLJFF.LJIL(C973690bRf.LJIILL(false));
            }
            InterfaceC983130bgt interfaceC983130bgt = (InterfaceC983130bgt) LJJII();
            if (interfaceC983130bgt != null) {
                interfaceC983130bgt.LJJIJL(this.LJIIIIZZ, abstractC982800bgM, enumC975850bV9);
            }
        }
        AbstractC982800bgM abstractC982800bgM2 = this.LIZJ;
        InterfaceC983130bgt interfaceC983130bgt2 = (InterfaceC983130bgt) LJJII();
        if (interfaceC983130bgt2 != null) {
            interfaceC983130bgt2.LJIJJLI(this.LJIIIIZZ, abstractC982800bgM2, enumC975850bV9);
        }
        AbstractC982800bgM abstractC982800bgM3 = this.LIZJ;
        if (abstractC982800bgM3 != null) {
            boolean z = LJJIII().LJJIJ.LJ;
            if (abstractC982800bgM3 instanceof C982470bfp) {
                C973690bRf c973690bRf = C973690bRf.LIZ;
                c973690bRf.LJJ("livesdk_connection_success", true, z);
                c973690bRf.LJJ("livesdk_connection_success_rec", false, z);
            }
            if (abstractC982800bgM3 instanceof C982450bfn) {
                C973690bRf c973690bRf2 = C973690bRf.LIZ;
                c973690bRf2.LJJ("livesdk_connection_success", true, z);
                c973690bRf2.LJJ("livesdk_connection_success_rec", false, z);
            }
        }
        C978500bZQ.LIZIZ("match_in_progress");
        C974560bT4 c974560bT4 = new C974560bT4();
        boolean z2 = LJJIII().LJJIJ.LIZJ;
        long jLIZ = LJJIII().LJJIJ.LIZ();
        boolean z3 = LJJIII().LJJIJ.LJI;
        if (z2) {
            AbstractC962030b8r.LJIIJ(c974560bT4.LIZJ, "inviter_link_duration", Long.valueOf(jLIZ), true);
        } else {
            AbstractC962030b8r.LJIIJ(c974560bT4.LIZJ, "invitee_link_duration", Long.valueOf(jLIZ), true);
        }
        c974560bT4.LJIIL(Integer.valueOf(z3 ? 1 : 0), "is_last_accept", true);
        int i = C975930bVH.LIZ[enumC975850bV9.ordinal()];
        if (i != 1) {
            if (i == 2) {
                c974560bT4.LJIIL("accept_msg", "message_type", true);
            }
        } else {
            c974560bT4.LJIIL("open_msg", "message_type", true);
        }
        c974560bT4.LJJIII();
        c974560bT4.LJIJJLI("battle_start");
    }

    @Override // X.AbstractC981980bf2, X.AbstractC981450beB, X.InterfaceC976690bWV
    public final void LJI(EnumC975850bV9 enumC975850bV9) {
        super.LJI(enumC975850bV9);
        LJJ("stateWillLeave");
        DataChannel dataChannel = this.LIZ.getDataChannel();
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
    }

    @Override // X.AbstractC981450beB, X.InterfaceC976690bWV
    public final void LJII(long j) {
        super.LJII(j);
        LJJ("onForceTerminated");
    }

    @Override // X.AbstractC981980bf2
    public final void LJJJJZ(C983300bhA c983300bhA) {
        super.LJJJJZ(c983300bhA);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStateTransitCountdownStart");
        sbLIZ.append(", source=");
        sbLIZ.append(c983300bhA.LIZ);
        sbLIZ.append(", countdownSeconds = ");
        sbLIZ.append(c983300bhA.LIZIZ);
        C20441214yg.LJIIIZ("CompetitionStatePlayingAnchor", C2188811AlT.LIZIZ(sbLIZ));
        LJJ("onStateTransitCountdownStart");
        C982320bfa.LIZ(LJJIII().LJIIIIZZ, EnumC982850bgR.PLAYING, C950220apo.LJ(), 0L, c983300bhA.LIZIZ, true, AFwS250S0000000_15.get$arr$(178), new AwS164S1100000_15(this, 8));
    }

    @Override // X.AbstractC981980bf2, X.AbstractC981450beB, X.InterfaceC976690bWV
    public final void LIZIZ(EnumC962960bAM enumC962960bAM, String str) {
        super.LIZIZ(enumC962960bAM, str);
        if (this.LIZ.Y2() != EnumC974260bSa.START) {
            this.LIZ.Y2();
        }
        long j = LJJIII().LJIIIZ;
        InterfaceC983470bhR interfaceC983470bhR = (InterfaceC983470bhR) LJJII();
        if (interfaceC983470bhR != null) {
            interfaceC983470bhR.LJIJI(j, str, new AwS629S0100000_15(this, 76));
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0bet] */
    @Override // X.AbstractC981450beB, X.InterfaceC976690bWV
    public final void LJIJJ(int i, long j) {
        ?? LJJII = LJJII();
        if (LJJII != 0) {
            LJJII.LJJIZ(i, LJJIII().LJIIIZ, j);
        }
    }

    @Override // X.AbstractC981450beB, X.InterfaceC976690bWV
    public final void Z2(List<C954460awe> list, List<C954460awe> list2, CustomLinkMessage customLinkMessage) {
        super.Z2(list, list2, customLinkMessage);
    }

    public C982030bf7(InterfaceC976620bWO interfaceC976620bWO, EnumC974260bSa enumC974260bSa, AbstractC982800bgM abstractC982800bgM, C982460bfo c982460bfo) {
        super(interfaceC976620bWO, enumC974260bSa, abstractC982800bgM);
        this.LJIIIIZZ = c982460bfo;
    }
}
