package X;

import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.frequency.model.RuleHitState;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.cell.trigger.AbsComponentTrigger;
import com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent;
import com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: renamed from: X.0Rcv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C699950Rcv implements InterfaceC700010Rd1 {
    public boolean LIZ;
    public final /* synthetic */ FcpNodeProtocol LIZIZ;
    public final /* synthetic */ ReusedAssem<?> LIZJ;
    public final /* synthetic */ C700170RdH LIZLLL;
    public final /* synthetic */ Function0<InterfaceC699200Rbi<?>> LJ;

    @Override // X.InterfaceC700010Rd1
    public final boolean LJ() {
        return false;
    }

    @Override // X.InterfaceC700010Rd1
    public final FcpNodeProtocol LIZJ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC700010Rd1
    public final EnumC696040RRy getType() {
        return EnumC696040RRy.ASSEM;
    }

    @Override // X.InterfaceC700010Rd1
    public final boolean LIZIZ(C700170RdH c700170RdH) {
        boolean z;
        RuleHitState ruleHitStateLIZ;
        C699980Rcy c699980Rcy;
        Map<InterfaceC700010Rd1, C699980Rcy> map;
        String strLJLI;
        String logId;
        boolean zLJI = LJI(this.LIZJ);
        if (this.LIZ && zLJI) {
            z = true;
        } else {
            z = false;
        }
        String str = null;
        if (z) {
            C20653815rs c20653815rs = C20653815rs.LIZ;
            InterfaceC700020Rd2<?> interfaceC700020Rd2 = this.LIZLLL.LJ;
            if (interfaceC700020Rd2 != null) {
                strLJLI = interfaceC700020Rd2.LJLI();
            } else {
                strLJLI = null;
            }
            String strLLLII = this.LIZIZ.LLLII();
            InterfaceC700020Rd2<?> interfaceC700020Rd22 = this.LIZLLL.LJ;
            if (interfaceC700020Rd22 != null) {
                logId = interfaceC700020Rd22.getLogId();
            } else {
                logId = null;
            }
            c20653815rs.getClass();
            ruleHitStateLIZ = C20653815rs.LIZ(strLJLI, strLLLII, logId);
        } else {
            ruleHitStateLIZ = null;
        }
        boolean zLIZ = C700340RdY.LIZ(ruleHitStateLIZ);
        if (!zLIZ) {
            C699180Rbg c699180Rbg = C699180Rbg.LIZ;
            Function0<InterfaceC699200Rbi<?>> function0 = this.LJ;
            String strLLLII2 = this.LIZIZ.LLLII();
            c699180Rbg.getClass();
            C699180Rbg.LIZ(function0, strLLLII2, ruleHitStateLIZ);
        }
        if ((c700170RdH instanceof C700170RdH) && c700170RdH != null && (map = c700170RdH.LJIILL) != null) {
            c699980Rcy = (C699980Rcy) ((LinkedHashMap) map).get(this);
            if (c699980Rcy != null) {
                c699980Rcy.LIZIZ = Boolean.valueOf(z);
            }
        } else {
            c699980Rcy = null;
        }
        if (!z) {
            if (c699980Rcy != null) {
                c699980Rcy.LIZJ = "active check failed";
                c699980Rcy.LIZLLL = C2097608Jq.LJIIIIZZ(new Pair("biz_active", Boolean.valueOf(zLJI)), new Pair("can_apply_slot", Boolean.valueOf(this.LIZ)));
                c699980Rcy.LJII = Boolean.valueOf(zLIZ);
            }
        } else if (c699980Rcy != null) {
            c699980Rcy.LJII = Boolean.valueOf(zLIZ);
        }
        if (!zLIZ && c699980Rcy != null) {
            c699980Rcy.LJIIIIZZ = "density check failed";
            if (ruleHitStateLIZ != null) {
                str = ruleHitStateLIZ.ruleStrategy;
            }
            c699980Rcy.LJIIIZ = C2097908Jt.LIZJ(new Pair("outreach_strategy", str));
        }
        if (z && zLIZ) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC700010Rd1
    public final void LJFF(C701040Reg c701040Reg) {
        this.LIZ = false;
        ReusedAssem<?> reusedAssem = this.LIZJ;
        if ((reusedAssem instanceof PriorityProtocol) && (reusedAssem instanceof InterfaceC699970Rcx)) {
            ((InterfaceC699970Rcx) reusedAssem).l5(false);
        }
        C0CNO.LIZLLL(0L, new C695900RRk(this, reusedAssem, false, c701040Reg));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean LJI(ReusedAssem<?> reusedAssem) {
        boolean zLIZJ;
        Object obj;
        Aweme aweme;
        try {
            Object obj2 = null;
            if (reusedAssem instanceof BaseCellTriggerComponent) {
                BaseCellTriggerComponent baseCellTriggerComponent = (BaseCellTriggerComponent) reusedAssem;
                C724270Sb3 c724270Sb3 = reusedAssem.LLJI;
                if (c724270Sb3 != null) {
                    obj2 = c724270Sb3.LL;
                }
                zLIZJ = baseCellTriggerComponent.ep((VideoItemParams) obj2);
            } else if (reusedAssem instanceof DynamicComponent) {
                C724270Sb3 c724270Sb32 = reusedAssem.LLJI;
                if (c724270Sb32 != null) {
                    obj = c724270Sb32.LL;
                } else {
                    obj = null;
                }
                VideoItemParams videoItemParams = (VideoItemParams) obj;
                if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null) {
                    aweme.getAid();
                }
                new AwS555S0100000_11(this.LIZJ, (ReusedAssem<?>) 1343);
                C0T6L.LIZLLL();
                AbsComponentTrigger absComponentTriggerBp = ((DynamicComponent) reusedAssem).Bp();
                if (absComponentTriggerBp != null) {
                    C724270Sb3 c724270Sb33 = reusedAssem.LLJI;
                    if (c724270Sb33 != null) {
                        obj2 = c724270Sb33.LL;
                    }
                    zLIZJ = absComponentTriggerBp.LIZLLL(obj2);
                } else {
                    zLIZJ = true;
                }
            } else {
                zLIZJ = C724100Sam.LIZJ(reusedAssem, null);
            }
            if ((reusedAssem instanceof PriorityProtocol) && (reusedAssem instanceof InterfaceC699970Rcx)) {
                if (zLIZJ) {
                    if (!((C0RJL) reusedAssem).oh()) {
                        return true;
                    }
                    if (((InterfaceC699970Rcx) reusedAssem).Nm()) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return zLIZJ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            return true;
        }
    }

    public static void LJII(ReusedAssem reusedAssem, boolean z) {
        if (reusedAssem == null) {
            return;
        }
        C695930RRn.LJ(reusedAssem);
        new C612990O2n(reusedAssem, z);
        C0T6L.LIZLLL();
        C724100Sam.LIZ(reusedAssem, z);
    }

    @Override // X.InterfaceC700010Rd1
    public final boolean LIZ(C698680Ras c698680Ras, C700170RdH c700170RdH) {
        boolean z;
        C699980Rcy c699980Rcy;
        Map<InterfaceC700010Rd1, C699980Rcy> map;
        List<String> list;
        if (c698680Ras == null || C695930RRn.LIZJ(this.LIZJ) || ((C695930RRn.LIZLLL(c698680Ras.LIZIZ) && (list = c698680Ras.LIZIZ) != null && C13LP.LJJJJ(this.LIZIZ.LLLII(), list)) || !C695930RRn.LIZLLL(c698680Ras.LIZ))) {
            z = true;
            this.LIZ = LJI(this.LIZJ);
        } else {
            z = false;
        }
        List<String> list2 = null;
        if ((c700170RdH instanceof C700170RdH) && c700170RdH != null && (map = c700170RdH.LJIILL) != null) {
            c699980Rcy = (C699980Rcy) ((LinkedHashMap) map).get(this);
            if (c699980Rcy != null) {
                c699980Rcy.LJ = Boolean.valueOf(z);
            }
        } else {
            c699980Rcy = null;
        }
        if (!z && c699980Rcy != null) {
            c699980Rcy.LJFF = "don't handle signal";
            Pair[] pairArr = new Pair[2];
            if (c698680Ras != null) {
                list2 = c698680Ras.LIZ;
            }
            pairArr[0] = new Pair("incoming_signal", list2);
            pairArr[1] = new Pair("is_accepted", Boolean.FALSE);
            c699980Rcy.LJI = C2097608Jq.LJIIIIZZ(pairArr);
        }
        return z;
    }

    @Override // X.InterfaceC700010Rd1
    public final void LIZLLL(boolean z, C701040Reg c701040Reg) {
        this.LIZ = z;
        C0CNO.LIZLLL(0L, new C695900RRk(this, this.LIZJ, z, c701040Reg));
    }

    public C699950Rcv(ReusedAssem reusedAssem, FcpNodeProtocol fcpNodeProtocol, C700170RdH c700170RdH, Function0 function0, boolean z) {
        this.LIZIZ = fcpNodeProtocol;
        this.LIZJ = reusedAssem;
        this.LIZLLL = c700170RdH;
        this.LJ = function0;
        this.LIZ = z;
    }
}
