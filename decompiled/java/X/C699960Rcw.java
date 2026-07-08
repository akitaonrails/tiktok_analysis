package X;

import com.bytedance.assem.arch.reused.ReusedAssem;
import com.ss.android.ugc.aweme.frequency.model.RuleHitState;
import com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Rcw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C699960Rcw implements InterfaceC700010Rd1 {
    public boolean LIZ;
    public final /* synthetic */ FcpNodeProtocol LIZIZ;
    public final /* synthetic */ C700170RdH LIZJ;
    public final /* synthetic */ Function0<InterfaceC699200Rbi<?>> LIZLLL;
    public final /* synthetic */ AbstractC634910OvJ<Object> LJ;

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
        return EnumC696040RRy.TRIGGER;
    }

    @Override // X.InterfaceC700010Rd1
    public final boolean LIZIZ(C700170RdH c700170RdH) {
        boolean zLIZLLL;
        boolean z;
        RuleHitState ruleHitStateLIZ;
        C699980Rcy c699980Rcy;
        Map<InterfaceC700010Rd1, C699980Rcy> map;
        String strLJLI;
        String logId;
        Object objBo;
        ReusedAssem<?> reusedAssem = this.LJ.LLILLL;
        if (reusedAssem != null && (objBo = reusedAssem.bo()) != null) {
            zLIZLLL = this.LJ.LIZLLL(objBo);
        } else {
            zLIZLLL = false;
        }
        if (this.LIZ && zLIZLLL) {
            z = true;
        } else {
            z = false;
        }
        String str = null;
        if (z) {
            C20653815rs c20653815rs = C20653815rs.LIZ;
            InterfaceC700020Rd2<?> interfaceC700020Rd2 = this.LIZJ.LJ;
            if (interfaceC700020Rd2 != null) {
                strLJLI = interfaceC700020Rd2.LJLI();
            } else {
                strLJLI = null;
            }
            String strLLLII = this.LIZIZ.LLLII();
            InterfaceC700020Rd2<?> interfaceC700020Rd22 = this.LIZJ.LJ;
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
            Function0<InterfaceC699200Rbi<?>> function0 = this.LIZLLL;
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
                c699980Rcy.LIZLLL = C2097608Jq.LJIIIIZZ(new Pair("biz_active", Boolean.valueOf(zLIZLLL)), new Pair("can_apply_slot", Boolean.valueOf(this.LIZ)));
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
        if (!z || !zLIZ) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC700010Rd1
    public final void LJFF(C701040Reg c701040Reg) {
        this.LIZ = false;
        this.LJ.LLILLJJLI = false;
    }

    @Override // X.InterfaceC700010Rd1
    public final boolean LIZ(C698680Ras c698680Ras, C700170RdH c700170RdH) {
        boolean z;
        boolean zLIZLLL;
        Object objBo;
        C699980Rcy c699980Rcy;
        Map<InterfaceC700010Rd1, C699980Rcy> map;
        List<String> list;
        if (c698680Ras == null || ((C695930RRn.LIZLLL(c698680Ras.LIZIZ) && (list = c698680Ras.LIZIZ) != null && C13LP.LJJJJ(this.LIZIZ.LLLII(), list)) || !C695930RRn.LIZLLL(c698680Ras.LIZ))) {
            z = true;
            ReusedAssem<?> reusedAssem = this.LJ.LLILLL;
            if (reusedAssem != null && (objBo = reusedAssem.bo()) != null) {
                zLIZLLL = this.LJ.LIZLLL(objBo);
            } else {
                zLIZLLL = false;
            }
            this.LIZ = zLIZLLL;
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
        C0CNO.LIZLLL(0L, new C696000RRu(this, z, c701040Reg, this.LIZJ));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C699960Rcw(FcpNodeProtocol fcpNodeProtocol, C700170RdH c700170RdH, Function0<? extends InterfaceC699200Rbi<?>> function0, AbstractC634910OvJ<Object> abstractC634910OvJ) {
        this.LIZIZ = fcpNodeProtocol;
        this.LIZJ = c700170RdH;
        this.LIZLLL = function0;
        this.LJ = abstractC634910OvJ;
    }
}
