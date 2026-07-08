package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.AbnormalDisconnectReason;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CustomLinkMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS55S0310000_15;

/* JADX INFO: renamed from: X.0bWQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C976640bWQ implements InterfaceC976620bWO {
    public final boolean LIZ;
    public final Room LIZIZ;
    public final DataChannel LIZJ;
    public boolean LIZLLL;
    public final InterfaceC976860bWm LJ;
    public final InterfaceC976810bWh LJFF;
    public final InterfaceC981660beW LJI;
    public final C981480beE LJII;
    public InterfaceC976690bWV<? extends InterfaceC981890bet> LJIIIZ;
    public final String LJIIIIZZ = UUID.randomUUID().toString();
    public List<C981480beE> LJIIJ = new ArrayList();
    public final C976840bWk LJIIJJI = new C976840bWk(this);

    @Override // X.InterfaceC976620bWO
    public final void LJ() {
        InterfaceC976690bWV<? extends InterfaceC981890bet> interfaceC976690bWV = this.LJIIIZ;
        if (interfaceC976690bWV != null) {
            interfaceC976690bWV.LJ();
        }
    }

    @Override // X.InterfaceC976620bWO
    public final EnumC974260bSa Y2() {
        EnumC974260bSa status;
        InterfaceC976690bWV<? extends InterfaceC981890bet> interfaceC976690bWV = this.LJIIIZ;
        return (interfaceC976690bWV == null || (status = interfaceC976690bWV.getStatus()) == null) ? EnumC974260bSa.NONE : status;
    }

    @Override // X.InterfaceC976620bWO
    public final EnumC962960bAM getBizType() {
        return this.LJII.LJIIIIZZ;
    }

    @Override // X.InterfaceC976620bWO
    public final C981480beE LJI() {
        return this.LJII;
    }

    @Override // X.InterfaceC976620bWO
    public final InterfaceC981660beW LJIIIZ() {
        return this.LJI;
    }

    @Override // X.InterfaceC976620bWO
    public final C976840bWk LJIILLIIL() {
        return this.LJIIJJI;
    }

    @Override // X.InterfaceC976620bWO
    public final List<C981480beE> LJIJI() {
        return this.LJIIJ;
    }

    @Override // X.InterfaceC976620bWO
    public final InterfaceC976810bWh a3() {
        return this.LJFF;
    }

    @Override // X.InterfaceC976620bWO
    public final boolean d3() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC976620bWO
    public final DataChannel getDataChannel() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC976620bWO
    public final InterfaceC976860bWm getDelegate() {
        return this.LJ;
    }

    @Override // X.InterfaceC976620bWO
    public final Room getRoomInfo() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC976620bWO
    public final String getUniqueId() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC976620bWO
    public final boolean isAnchor() {
        return this.LIZ;
    }

    @Override // X.InterfaceC976620bWO
    public final void LIZLLL(AwS55S0310000_15 awS55S0310000_15) {
        InterfaceC976690bWV<? extends InterfaceC981890bet> interfaceC976690bWV = this.LJIIIZ;
        if (interfaceC976690bWV != null) {
            interfaceC976690bWV.LIZLLL(awS55S0310000_15);
        }
    }

    @Override // X.InterfaceC976620bWO
    public final void LJII(long j) {
        InterfaceC976690bWV<? extends InterfaceC981890bet> interfaceC976690bWV = this.LJIIIZ;
        if (interfaceC976690bWV != null) {
            interfaceC976690bWV.LJII(j);
        }
    }

    @Override // X.InterfaceC976620bWO
    public final void LJIIJ(C945320ahu c945320ahu) {
        InterfaceC976690bWV<? extends InterfaceC981890bet> interfaceC976690bWV = this.LJIIIZ;
        if (interfaceC976690bWV != null) {
            interfaceC976690bWV.LJIIJ(c945320ahu);
        }
    }

    @Override // X.InterfaceC976620bWO
    public final void LJIIL(long j) {
        InterfaceC976690bWV<? extends InterfaceC981890bet> interfaceC976690bWV = this.LJIIIZ;
        if (interfaceC976690bWV != null) {
            interfaceC976690bWV.LJIIL(j);
        }
    }

    @Override // X.InterfaceC976620bWO
    public final void LJIILJJIL(boolean z) {
        InterfaceC976690bWV<? extends InterfaceC981890bet> interfaceC976690bWV = this.LJIIIZ;
        if (interfaceC976690bWV != null) {
            interfaceC976690bWV.LJIILJJIL(z);
        }
    }

    @Override // X.InterfaceC976620bWO
    public final void LJIIZILJ(AbstractC963500bBE abstractC963500bBE) {
        EnumC974260bSa status;
        EnumC974260bSa status2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onReceiveCompetitionAction, battleType=");
        sbLIZ.append(abstractC963500bBE.LIZ());
        sbLIZ.append(", action=");
        sbLIZ.append(abstractC963500bBE);
        C20441214yg.LIZIZ("CompetitionEngine", C2188811AlT.LIZIZ(sbLIZ));
        if (!(abstractC963500bBE instanceof AbstractC963510bBF)) {
            if (abstractC963500bBE.LIZ() != this.LJII.LJIIIIZZ.getType()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onReceiveCompetitionAction, battleType mismatch, action.battleType=");
                sbLIZ2.append(abstractC963500bBE.LIZ());
                sbLIZ2.append(", currentType=");
                sbLIZ2.append(this.LJII.LJIIIIZZ.getType());
                C20441214yg.LIZIZ("CompetitionEngine", C2188811AlT.LIZIZ(sbLIZ2));
                return;
            }
            if (abstractC963500bBE instanceof C963470bBB) {
                InterfaceC976690bWV<? extends InterfaceC981890bet> interfaceC976690bWV = this.LJIIIZ;
                if (interfaceC976690bWV != null) {
                    interfaceC976690bWV.LJIJI(((C963470bBB) abstractC963500bBE).LIZJ);
                    return;
                }
                return;
            }
            if (abstractC963500bBE instanceof C963480bBC) {
                InterfaceC976690bWV<? extends InterfaceC981890bet> interfaceC976690bWV2 = this.LJIIIZ;
                if (interfaceC976690bWV2 != null) {
                    C963480bBC c963480bBC = (C963480bBC) abstractC963500bBE;
                    interfaceC976690bWV2.LJIJJ(c963480bBC.LIZLLL, c963480bBC.LIZJ);
                    return;
                }
                return;
            }
            if (abstractC963500bBE instanceof C963460bBA) {
                InterfaceC976690bWV<? extends InterfaceC981890bet> interfaceC976690bWV3 = this.LJIIIZ;
                if (interfaceC976690bWV3 != null) {
                    interfaceC976690bWV3.LJIJ();
                    return;
                }
                return;
            }
            if (abstractC963500bBE instanceof C963490bBD) {
                InterfaceC976690bWV<? extends InterfaceC981890bet> interfaceC976690bWV4 = this.LJIIIZ;
                if (interfaceC976690bWV4 != null) {
                    interfaceC976690bWV4.LJIILL();
                    return;
                }
                return;
            }
            throw new C1954807lC();
        }
        InterfaceC976690bWV<? extends InterfaceC981890bet> interfaceC976690bWV5 = this.LJIIIZ;
        EnumC974260bSa status3 = null;
        if (interfaceC976690bWV5 != null) {
            status = interfaceC976690bWV5.getStatus();
        } else {
            status = null;
        }
        if (status != EnumC974260bSa.NONE) {
            InterfaceC976690bWV<? extends InterfaceC981890bet> interfaceC976690bWV6 = this.LJIIIZ;
            if (interfaceC976690bWV6 != null) {
                status2 = interfaceC976690bWV6.getStatus();
            } else {
                status2 = null;
            }
            if (status2 != EnumC974260bSa.PUNISH) {
                InterfaceC976690bWV<? extends InterfaceC981890bet> interfaceC976690bWV7 = this.LJIIIZ;
                if (interfaceC976690bWV7 != null) {
                    status3 = interfaceC976690bWV7.getStatus();
                }
                if (status3 != EnumC974260bSa.DRAW) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("onReceiveCompetitionAction, ");
                    sbLIZ3.append(abstractC963500bBE);
                    sbLIZ3.append(" is not allow in this state ");
                    sbLIZ3.append(this.LJIIIZ);
                    C20441214yg.LIZIZ("CompetitionEngine", C2188811AlT.LIZIZ(sbLIZ3));
                    return;
                }
            }
        }
        InterfaceC976690bWV<? extends InterfaceC981890bet> interfaceC976690bWV8 = this.LJIIIZ;
        if (interfaceC976690bWV8 != null) {
            interfaceC976690bWV8.LJIIIZ((AbstractC963510bBF) abstractC963500bBE);
        }
    }

    @Override // X.InterfaceC976620bWO
    public final void LJIJJ(AbstractC982800bgM abstractC982800bgM) {
        InterfaceC976690bWV<? extends InterfaceC981890bet> interfaceC976690bWV = this.LJIIIZ;
        if (interfaceC976690bWV != null) {
            interfaceC976690bWV.LIZ(abstractC982800bgM);
        }
    }

    @Override // X.InterfaceC976620bWO
    public final void c3(boolean z) {
        this.LIZLLL = z;
    }

    @Override // X.InterfaceC976620bWO
    public final void LIZ(EnumC962960bAM enumC962960bAM, String str) {
        this.LJ.LIZ(enumC962960bAM, str);
    }

    @Override // X.InterfaceC976620bWO
    public final void LIZIZ(EnumC962960bAM enumC962960bAM, String str) {
        InterfaceC976690bWV<? extends InterfaceC981890bet> interfaceC976690bWV = this.LJIIIZ;
        if (interfaceC976690bWV != null) {
            interfaceC976690bWV.LIZIZ(enumC962960bAM, str);
        }
    }

    public final void LIZJ(EnumC962960bAM enumC962960bAM, String str) {
        InterfaceC976690bWV<? extends InterfaceC981890bet> interfaceC976690bWV = this.LJIIIZ;
        if (interfaceC976690bWV != null) {
            interfaceC976690bWV.LJIILLIIL(enumC962960bAM, str);
        }
    }

    @Override // X.InterfaceC976620bWO
    public final void LJFF(long j, String str) {
        InterfaceC976690bWV<? extends InterfaceC981890bet> interfaceC976690bWV = this.LJIIIZ;
        if (interfaceC976690bWV != null) {
            interfaceC976690bWV.LJFF(j, str);
        }
    }

    @Override // X.InterfaceC976620bWO
    public final boolean LJIIJJI(C982460bfo c982460bfo, EnumC970440bMQ enumC970440bMQ) {
        InterfaceC976690bWV<? extends InterfaceC981890bet> interfaceC976690bWV = this.LJIIIZ;
        if (interfaceC976690bWV != null) {
            return interfaceC976690bWV.LJIIJJI(c982460bfo, enumC970440bMQ);
        }
        return true;
    }

    @Override // X.InterfaceC976620bWO
    public final void LJIILIIL(EnumC962960bAM enumC962960bAM, int i) {
        InterfaceC976690bWV<? extends InterfaceC981890bet> interfaceC976690bWV = this.LJIIIZ;
        if (interfaceC976690bWV != null) {
            interfaceC976690bWV.LJIILIIL(enumC962960bAM, i);
        }
    }

    @Override // X.InterfaceC976620bWO
    public final void LJIJ(EnumC962960bAM enumC962960bAM, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateBizType, source = ");
        sbLIZ.append(str);
        sbLIZ.append(", oldBizType = ");
        sbLIZ.append(this.LJII.LJIIIIZZ);
        sbLIZ.append(" , newBizType = ");
        sbLIZ.append(enumC962960bAM);
        C20441214yg.LJIIIZ("CompetitionEngine", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LJII.LJIIIIZZ != enumC962960bAM || this.LJFF.LIZ() != enumC962960bAM) {
            this.LJII.LIZLLL(enumC962960bAM);
            this.LJFF.LIZJ(this.LJII.LJIIIIZZ);
            this.LJ.LJ(this, this.LJII.LJIIIIZZ);
        }
    }

    @Override // X.InterfaceC976620bWO
    public final void LJIIIIZZ(int i, int i2, AbnormalDisconnectReason abnormalDisconnectReason) {
        InterfaceC976690bWV<? extends InterfaceC981890bet> interfaceC976690bWV = this.LJIIIZ;
        if (interfaceC976690bWV != null) {
            interfaceC976690bWV.LJIIIIZZ(i, i2, abnormalDisconnectReason);
        }
    }

    @Override // X.InterfaceC976620bWO
    public final void Z2(List<C954460awe> list, List<C954460awe> list2, CustomLinkMessage customLinkMessage) {
        InterfaceC976690bWV<? extends InterfaceC981890bet> interfaceC976690bWV = this.LJIIIZ;
        if (interfaceC976690bWV != null) {
            interfaceC976690bWV.Z2(list, list2, customLinkMessage);
        }
    }

    @Override // X.InterfaceC976620bWO
    public final boolean LJIILL(EnumC974260bSa enumC974260bSa, EnumC975850bV9 enumC975850bV9, AbstractC982800bgM abstractC982800bgM, C982460bfo c982460bfo) {
        Boolean boolValueOf;
        boolean z;
        EnumC974260bSa status;
        EnumC974260bSa status2;
        EnumC974260bSa status3;
        EnumC974260bSa status4;
        EnumC974260bSa status5;
        InterfaceC976690bWV<? extends InterfaceC981890bet> interfaceC976690bWV = this.LJIIIZ;
        EnumC974260bSa status6 = null;
        if (interfaceC976690bWV != null) {
            boolValueOf = Boolean.valueOf(interfaceC976690bWV.LJIJJLI(enumC974260bSa, enumC975850bV9));
        } else {
            boolValueOf = null;
        }
        if (C176600m4.LIZIZ(boolValueOf)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("currentStateCanHandleStatus");
            sbLIZ.append(", engine will enter to ");
            sbLIZ.append(enumC974260bSa);
            sbLIZ.append(", isReamtch = ");
            sbLIZ.append(this.LIZLLL);
            sbLIZ.append(", fromSource = ");
            sbLIZ.append(enumC975850bV9);
            C20441214yg.LIZIZ("CompetitionEngine", C2188811AlT.LIZIZ(sbLIZ));
            this.LJ.LJFF(this, enumC974260bSa);
            InterfaceC976690bWV<? extends InterfaceC981890bet> interfaceC976690bWV2 = this.LJIIIZ;
            if (interfaceC976690bWV2 != null) {
                status5 = interfaceC976690bWV2.getStatus();
            } else {
                status5 = null;
            }
            InterfaceC976690bWV<? extends InterfaceC981890bet> interfaceC976690bWV3 = this.LJIIIZ;
            if (interfaceC976690bWV3 != null) {
                interfaceC976690bWV3.LJIIZILJ(enumC974260bSa);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("currentStateCanHandleStatus");
            sbLIZ2.append(", engine did enter to ");
            sbLIZ2.append(enumC974260bSa);
            sbLIZ2.append(", oldStatus = ");
            sbLIZ2.append(status5);
            sbLIZ2.append(", isRematch = ");
            sbLIZ2.append(this.LIZLLL);
            sbLIZ2.append(", fromSource = ");
            sbLIZ2.append(enumC975850bV9);
            C20441214yg.LJIIIZ("CompetitionEngine", C2188811AlT.LIZIZ(sbLIZ2));
            this.LJ.LIZLLL(this, enumC974260bSa);
            z = true;
        } else {
            z = false;
        }
        if (z) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("transit");
            sbLIZ3.append(", currentStateCanHandleStatus, currentStatus = ");
            InterfaceC976690bWV<? extends InterfaceC981890bet> interfaceC976690bWV4 = this.LJIIIZ;
            if (interfaceC976690bWV4 != null) {
                status6 = interfaceC976690bWV4.getStatus();
            }
            sbLIZ3.append(status6);
            sbLIZ3.append(", toStatus = ");
            sbLIZ3.append(enumC974260bSa);
            C20441214yg.LJ("CompetitionEngine", C2188811AlT.LIZIZ(sbLIZ3));
            return true;
        }
        if (this.LIZLLL) {
            InterfaceC976690bWV<? extends InterfaceC981890bet> interfaceC976690bWV5 = this.LJIIIZ;
            if (interfaceC976690bWV5 == null || (status4 = interfaceC976690bWV5.getStatus()) == null) {
                status4 = EnumC974260bSa.NONE;
            }
            if (status4.compareTo(EnumC974260bSa.START) > 0) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("transit");
                sbLIZ4.append(", rematch status = ");
                InterfaceC976690bWV<? extends InterfaceC981890bet> interfaceC976690bWV6 = this.LJIIIZ;
                if (interfaceC976690bWV6 != null) {
                    status6 = interfaceC976690bWV6.getStatus();
                }
                sbLIZ4.append(status6);
                sbLIZ4.append(" , Rematch Engine can't goes after START");
                C20441214yg.LJ("CompetitionEngine", C2188811AlT.LIZIZ(sbLIZ4));
                return false;
            }
        }
        InterfaceC976690bWV<? extends InterfaceC981890bet> interfaceC976690bWV7 = this.LJIIIZ;
        if (interfaceC976690bWV7 != null) {
            status = interfaceC976690bWV7.getStatus();
        } else {
            status = null;
        }
        if (status == enumC974260bSa) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("transit");
            sbLIZ5.append(", same status, toStatus = ");
            sbLIZ5.append(enumC974260bSa);
            sbLIZ5.append(", currentIsRematch = ");
            sbLIZ5.append(this.LIZLLL);
            C20441214yg.LJ("CompetitionEngine", C2188811AlT.LIZIZ(sbLIZ5));
            return false;
        }
        InterfaceC976690bWV<? extends InterfaceC981890bet> interfaceC976690bWV8 = this.LJIIIZ;
        if (interfaceC976690bWV8 == null || (status2 = interfaceC976690bWV8.getStatus()) == null) {
            status2 = EnumC974260bSa.NONE;
        }
        Map<Pair<EnumC974260bSa, EnumC974260bSa>, Function0<Boolean>> map = C985650bkx.LIZ;
        Function0<Boolean> function0 = C985650bkx.LIZ.get(new Pair(status2, enumC974260bSa));
        if (function0 != null && !function0.invoke().booleanValue()) {
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("transit");
            sbLIZ6.append(", can't transit from ");
            InterfaceC976690bWV<? extends InterfaceC981890bet> interfaceC976690bWV9 = this.LJIIIZ;
            if (interfaceC976690bWV9 != null) {
                status6 = interfaceC976690bWV9.getStatus();
            }
            sbLIZ6.append(status6);
            sbLIZ6.append(" to ");
            sbLIZ6.append(enumC974260bSa);
            C20441214yg.LJ("CompetitionEngine", C2188811AlT.LIZIZ(sbLIZ6));
            return false;
        }
        AbstractC981450beB abstractC981450beBLIZIZ = this.LJFF.LIZIZ(this, enumC974260bSa, abstractC982800bgM, c982460bfo);
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append("updateState");
        sbLIZ7.append(", newState = ");
        sbLIZ7.append(abstractC981450beBLIZIZ);
        sbLIZ7.append(", fromSource = ");
        sbLIZ7.append(enumC975850bV9);
        sbLIZ7.append(", isRematch = ");
        sbLIZ7.append(this.LIZLLL);
        C20441214yg.LIZIZ("CompetitionEngine", C2188811AlT.LIZIZ(sbLIZ7));
        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
        sbLIZ8.append("updateState");
        sbLIZ8.append(", newState = ");
        sbLIZ8.append(abstractC981450beBLIZIZ);
        sbLIZ8.append(", fromSource = ");
        sbLIZ8.append(enumC975850bV9);
        sbLIZ8.append(", pre update data");
        C20441214yg.LIZIZ("CompetitionEngine", C2188811AlT.LIZIZ(sbLIZ8));
        StringBuilder sbLIZ9 = C2188811AlT.LIZ();
        sbLIZ9.append("Engine currentState state will leave from ");
        sbLIZ9.append(enumC975850bV9);
        sbLIZ9.append(", currentStatus=");
        InterfaceC976690bWV<? extends InterfaceC981890bet> interfaceC976690bWV10 = this.LJIIIZ;
        if (interfaceC976690bWV10 != null) {
            status3 = interfaceC976690bWV10.getStatus();
        } else {
            status3 = null;
        }
        sbLIZ9.append(status3);
        sbLIZ9.append(", isRematch = ");
        sbLIZ9.append(this.LIZLLL);
        C20441214yg.LIZIZ("CompetitionEngine", C2188811AlT.LIZIZ(sbLIZ9));
        InterfaceC976690bWV<? extends InterfaceC981890bet> interfaceC976690bWV11 = this.LJIIIZ;
        if (interfaceC976690bWV11 != null) {
            interfaceC976690bWV11.LJI(enumC975850bV9);
        }
        StringBuilder sbLIZ10 = C2188811AlT.LIZ();
        sbLIZ10.append("Engine delegate state will Enter to ");
        sbLIZ10.append(abstractC981450beBLIZIZ.LIZIZ);
        sbLIZ10.append(", isReamtch = ");
        sbLIZ10.append(this.LIZLLL);
        C20441214yg.LIZIZ("CompetitionEngine", C2188811AlT.LIZIZ(sbLIZ10));
        this.LJ.LJFF(this, abstractC981450beBLIZIZ.LIZIZ);
        InterfaceC976690bWV<? extends InterfaceC981890bet> interfaceC976690bWV12 = this.LJIIIZ;
        if (interfaceC976690bWV12 != null) {
            status6 = interfaceC976690bWV12.getStatus();
        }
        this.LJIIIZ = abstractC981450beBLIZIZ;
        StringBuilder sbLIZ11 = C2188811AlT.LIZ();
        sbLIZ11.append("Engine oldStatus = ");
        sbLIZ11.append(status6);
        sbLIZ11.append(", newStatus = ");
        sbLIZ11.append(abstractC981450beBLIZIZ.LIZIZ);
        sbLIZ11.append(", isRematch = ");
        sbLIZ11.append(this.LIZLLL);
        sbLIZ11.append(", fromSource = ");
        sbLIZ11.append(enumC975850bV9);
        C20441214yg.LIZIZ("CompetitionEngine", C2188811AlT.LIZIZ(sbLIZ11));
        InterfaceC976690bWV<? extends InterfaceC981890bet> interfaceC976690bWV13 = this.LJIIIZ;
        if (interfaceC976690bWV13 != null) {
            interfaceC976690bWV13.LIZJ(enumC975850bV9);
        }
        this.LJ.LIZLLL(this, abstractC981450beBLIZIZ.LIZIZ);
        StringBuilder sbLIZ12 = C2188811AlT.LIZ();
        sbLIZ12.append("DidEnterStatus = ");
        sbLIZ12.append(abstractC981450beBLIZIZ.LIZIZ);
        sbLIZ12.append(", fromSource = ");
        sbLIZ12.append(enumC975850bV9);
        sbLIZ12.append(" , isRematch = ");
        sbLIZ12.append(this.LIZLLL);
        C20441214yg.LIZIZ("CompetitionEngine", C2188811AlT.LIZIZ(sbLIZ12));
        return true;
    }

    public C976640bWQ(boolean z, Room room, DataChannel dataChannel, boolean z2, C976630bWP c976630bWP, InterfaceC976810bWh interfaceC976810bWh, InterfaceC981660beW interfaceC981660beW, C981480beE c981480beE) {
        this.LIZ = z;
        this.LIZIZ = room;
        this.LIZJ = dataChannel;
        this.LIZLLL = z2;
        this.LJ = c976630bWP;
        this.LJFF = interfaceC976810bWh;
        this.LJI = interfaceC981660beW;
        this.LJII = c981480beE;
        LJIILL(EnumC974260bSa.NONE, EnumC975850bV9.INITIALIZE, null, null);
    }
}
