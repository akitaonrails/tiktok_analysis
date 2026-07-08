package Y;

import X.AbstractC1623806Xk;
import X.C1390130mHL;
import X.C1623606Xi;
import X.C1714980ujI;
import X.C1715000ujK;
import X.C1715060ujQ;
import X.C1715220ujg;
import X.C1715330ujr;
import X.C1722950uw9;
import X.C1723610uxD;
import X.C1909107dp;
import X.C2382909Vj;
import X.C491001vg;
import X.C786410Ut5;
import X.C991740bum;
import X.InterfaceC1364105Vn;
import X.InterfaceC1715120ujW;
import X.InterfaceC1723590uxB;
import X.InterfaceC346701Wf;
import X.InterfaceC634840OvC;
import android.content.Context;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.verify.bio.BioVerifyFragment;
import kotlin.Unit;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public class AgS209S0200000_26 implements InterfaceC346701Wf {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC1364105Vn);
            case 1:
                return emit$1(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    public AgS209S0200000_26(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }

    public static final Object emit$0(AgS209S0200000_26 agS209S0200000_26, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C1390130mHL c1390130mHL;
        C1390130mHL c1390130mHL2;
        C1715060ujQ c1715060ujQ = (C1715060ujQ) obj;
        if (c1715060ujQ.LJ) {
            C1715220ujg c1715220ujg = ((BioVerifyFragment) agS209S0200000_26.l0).LLIZ;
            if (c1715220ujg != null) {
                c1390130mHL2 = c1715220ujg.LLILLJJLI;
            } else {
                c1390130mHL2 = null;
            }
            C1715330ujr.LIZJ(c1390130mHL2);
        } else {
            C1715220ujg c1715220ujg2 = ((BioVerifyFragment) agS209S0200000_26.l0).LLIZ;
            if (c1715220ujg2 != null && (c1390130mHL = c1715220ujg2.LLILLJJLI) != null && c1390130mHL.getVisibility() != 4) {
                C786410Ut5.LJLLLLLL(4, c1390130mHL);
            }
        }
        c1715060ujQ.LIZ.LIZ(new AwS605S0100000_26((BioVerifyFragment) agS209S0200000_26.l0, 429));
        c1715060ujQ.LIZIZ.LIZ(new AwS392S0200000_26((Context) agS209S0200000_26.l1, (BioVerifyFragment) agS209S0200000_26.l0, 85));
        c1715060ujQ.LIZJ.LIZ(new AwS605S0100000_26((BioVerifyFragment) agS209S0200000_26.l0, 430));
        c1715060ujQ.LIZLLL.LIZ(new AwS392S0200000_26((Context) agS209S0200000_26.l1, (BioVerifyFragment) agS209S0200000_26.l0, 86));
        InterfaceC1715120ujW interfaceC1715120ujW = c1715060ujQ.LJFF;
        if (interfaceC1715120ujW != null) {
            if (interfaceC1715120ujW instanceof C991740bum) {
                ((BioVerifyFragment) agS209S0200000_26.l0).SR("PASS", ((C991740bum) interfaceC1715120ujW).LIZ);
            } else if (interfaceC1715120ujW instanceof C1714980ujI) {
                C1714980ujI c1714980ujI = (C1714980ujI) interfaceC1715120ujW;
                ((BioVerifyFragment) agS209S0200000_26.l0).aS(c1714980ujI.LIZ, c1714980ujI.LIZIZ);
            } else if (interfaceC1715120ujW instanceof C1715000ujK) {
                BioVerifyFragment bioVerifyFragment = (BioVerifyFragment) agS209S0200000_26.l0;
                String str = ((C1715000ujK) interfaceC1715120ujW).LIZIZ;
                String str2 = BioVerifyFragment._pnsPageId;
                bioVerifyFragment.aS(null, str);
            } else {
                BioVerifyFragment bioVerifyFragment2 = (BioVerifyFragment) agS209S0200000_26.l0;
                String str3 = BioVerifyFragment._pnsPageId;
                bioVerifyFragment2.ZR(false);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object emit$1(AgS209S0200000_26 agS209S0200000_26, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        AbstractC1623806Xk abstractC1623806Xk = (AbstractC1623806Xk) obj;
        String containerID = null;
        if (abstractC1623806Xk instanceof C1623606Xi) {
            CompletionBlock completionBlock = (CompletionBlock) agS209S0200000_26.l0;
            InterfaceC634840OvC interfaceC634840OvC = ((C1723610uxD) agS209S0200000_26.l1).IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID = interfaceC634840OvC.getContainerID();
            }
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1723590uxB.class, containerID);
            InterfaceC1723590uxB interfaceC1723590uxB = (InterfaceC1723590uxB) xBaseModelLIZJ;
            C1623606Xi c1623606Xi = (C1623606Xi) abstractC1623806Xk;
            interfaceC1723590uxB.setPiList(((C1722950uw9) c1623606Xi.LIZ).LIZ);
            interfaceC1723590uxB.setExtraPiList(((C1722950uw9) c1623606Xi.LIZ).LIZIZ);
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
        } else if (abstractC1623806Xk instanceof C491001vg) {
            C2382909Vj.LIZ((CompletionBlock) agS209S0200000_26.l0, 0, ((C491001vg) abstractC1623806Xk).LIZ.toString(), null, 4);
        }
        return Unit.LIZ;
    }
}
