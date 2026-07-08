package Y;

import X.C03R6;
import X.C03RS;
import X.C03RT;
import X.C03RV;
import X.C03RW;
import X.C03RX;
import X.C03W6;
import X.C098200Yq;
import X.C09JN;
import X.C189200o6;
import X.C1C7U;
import X.C23260099m;
import X.C843303Rf;
import X.EnumC840403Qc;
import X.InterfaceC1364105Vn;
import X.InterfaceC1748810vbr;
import com.ss.android.ugc.aweme.ecommerce.base.osp.preview.preload.dto.PreloadBillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest;

/* JADX INFO: loaded from: classes2.dex */
public class AfS1S0800000_1 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;
    public Object l7;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS1S0800000_1 afS1S0800000_1, Object obj) {
        C1C7U.LIZ("OrderSubmitRepository@9af5.preloadBillInfo$2$3");
        Throwable th = (Throwable) obj;
        C03RT c03rt = C03RT.DONE;
        C03RS c03rs = new C03RS(c03rt, null, (EnumC840403Qc) afS1S0800000_1.l0, (C03RX) afS1S0800000_1.l1, (C03RW) afS1S0800000_1.l2, 8);
        C03RV c03rv = C03RV.LIZ;
        InterfaceC1748810vbr interfaceC1748810vbr = (InterfaceC1748810vbr) afS1S0800000_1.l3;
        Integer numValueOf = Integer.valueOf(((PreloadBillInfoRequest) ((C03R6) afS1S0800000_1.l4)).LIZ());
        Boolean bool = Boolean.FALSE;
        c03rv.getClass();
        C03RV.LIZ(interfaceC1748810vbr, c03rs, false, c03rt, numValueOf, bool);
        boolean z = C843303Rf.LIZ;
        C843303Rf.LJ((Integer) afS1S0800000_1.l5, ((C03R6) afS1S0800000_1.l4).genCacheKey(null));
        C03W6 c03w6 = (C03W6) afS1S0800000_1.l6;
        if (c03w6 != null) {
            c03w6.LIZ(th.toString());
        }
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) afS1S0800000_1.l7;
        C098200Yq c098200Yq = new C098200Yq(th);
        C189200o6.m2constructorimpl(c098200Yq);
        interfaceC1364105Vn.resumeWith(c098200Yq);
        C1C7U.LIZIZ("OrderSubmitRepository@9af5.preloadBillInfo$2$3");
    }

    public static final void accept$1(AfS1S0800000_1 afS1S0800000_1, Object obj) {
        C1C7U.LIZ("OrderSubmitRepository@9af5.preloadBillInfo$2$6");
        Throwable th = (Throwable) obj;
        C03RT c03rt = C03RT.DONE;
        C03RS c03rs = new C03RS(c03rt, null, (EnumC840403Qc) afS1S0800000_1.l0, (C03RX) afS1S0800000_1.l1, (C03RW) afS1S0800000_1.l2, 8);
        C03RV c03rv = C03RV.LIZ;
        InterfaceC1748810vbr interfaceC1748810vbr = (InterfaceC1748810vbr) afS1S0800000_1.l3;
        Integer numValueOf = Integer.valueOf(((BillInfoRequest) ((C03R6) afS1S0800000_1.l4)).countSkuNum());
        Boolean bool = Boolean.FALSE;
        c03rv.getClass();
        C03RV.LIZ(interfaceC1748810vbr, c03rs, false, c03rt, numValueOf, bool);
        boolean z = C843303Rf.LIZ;
        C843303Rf.LJ((Integer) afS1S0800000_1.l5, ((C03R6) afS1S0800000_1.l4).genCacheKey(null));
        C03W6 c03w6 = (C03W6) afS1S0800000_1.l6;
        if (c03w6 != null) {
            c03w6.LIZ(th.toString());
        }
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) afS1S0800000_1.l7;
        C098200Yq c098200Yq = new C098200Yq(th);
        C189200o6.m2constructorimpl(c098200Yq);
        interfaceC1364105Vn.resumeWith(c098200Yq);
        C1C7U.LIZIZ("OrderSubmitRepository@9af5.preloadBillInfo$2$6");
    }

    public AfS1S0800000_1(C03RX c03rx, EnumC840403Qc enumC840403Qc, C03RW c03rw, C03R6 c03r6, C03W6 c03w6, InterfaceC1748810vbr interfaceC1748810vbr, Integer num, C23260099m c23260099m, int i) {
        this.$t = i;
        this.l0 = enumC840403Qc;
        this.l1 = c03rx;
        this.l2 = c03rw;
        this.l3 = interfaceC1748810vbr;
        this.l4 = c03r6;
        this.l5 = num;
        this.l6 = c03w6;
        this.l7 = c23260099m;
    }
}
