package Y;

import X.C013C;
import X.C09JN;
import X.C1034540d1o;
import X.C1389890mGx;
import X.C13LP;
import X.C1440005kM;
import X.C1758120vqs;
import X.C1758310vrB;
import X.C1758370vrH;
import X.C1758380vrI;
import X.C1758390vrJ;
import X.C19EG;
import X.C1C7U;
import X.InterfaceC1758450vrP;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductInfoPackData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public class AfS0S0500100_26 implements C09JN {
    public final int $t;
    public long j5;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // X.C09JN
    public final void accept(Object obj) throws Throwable {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS0S0500100_26 afS0S0500100_26, Object obj) throws Throwable {
        String str;
        C1C7U.LIZ("PdpStarterOptimized@4303.open$2$1");
        ProductPackStruct productPackStruct = (ProductPackStruct) obj;
        if (TextUtils.isEmpty(((IPdpStarter.PdpEnterParam) afS0S0500100_26.l0).chainKey) && (str = productPackStruct.chainKey) != null && str.length() > 0) {
            Map<String, Object> map = ((IPdpStarter.PdpEnterParam) afS0S0500100_26.l0).visitReportParams;
            if (map != null) {
                map.put("chain_key", productPackStruct.chainKey);
            }
            ((IPdpStarter.PdpEnterParam) afS0S0500100_26.l0).setChainKey(productPackStruct.chainKey);
        }
        InterfaceC1758450vrP.LIZ.getClass();
        C1758310vrB c1758310vrB = C1758310vrB.LIZJ;
        C1758310vrB.LJJIL(((C1758370vrH) afS0S0500100_26.l1).LIZ);
        if (!((C013C) afS0S0500100_26.l2).element) {
            C1758380vrI c1758380vrI = (C1758380vrI) afS0S0500100_26.l3;
            C19EG c19eg = (C19EG) afS0S0500100_26.l4;
            IPdpStarter.PdpEnterParam pdpEnterParam = (IPdpStarter.PdpEnterParam) afS0S0500100_26.l0;
            long j = afS0S0500100_26.j5;
            int i = ((C1758370vrH) afS0S0500100_26.l1).LIZIZ;
            c1758380vrI.getClass();
            C1758380vrI.LIZLLL(c19eg, pdpEnterParam, productPackStruct, j, i, 0);
        }
        C1C7U.LIZIZ("PdpStarterOptimized@4303.open$2$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$1(AfS0S0500100_26 afS0S0500100_26, Object obj) throws Throwable {
        List<ProductPackStruct> list;
        C1C7U.LIZ("PdpStarterOptimized@4303.open$2$2");
        Throwable th = (Throwable) obj;
        ProductPackStruct productPackStruct = null;
        ((C1758380vrI) afS0S0500100_26.l0).LIZIZ = null;
        if (th instanceof C1758120vqs) {
            C1758120vqs c1758120vqs = (C1758120vqs) th;
            ProductInfoPackData productInfoPackData = (ProductInfoPackData) c1758120vqs.getResp().data;
            if (productInfoPackData != null && (list = productInfoPackData.productionInfoPack) != null) {
                productPackStruct = (ProductPackStruct) C13LP.LJJJLL(list);
            }
            if (!((C013C) afS0S0500100_26.l1).element) {
                C1758380vrI c1758380vrI = (C1758380vrI) afS0S0500100_26.l0;
                C19EG c19eg = (C19EG) afS0S0500100_26.l2;
                IPdpStarter.PdpEnterParam pdpEnterParam = (IPdpStarter.PdpEnterParam) afS0S0500100_26.l3;
                long j = afS0S0500100_26.j5;
                int i = ((C1758370vrH) afS0S0500100_26.l4).LIZIZ;
                int code = c1758120vqs.getCode();
                c1758380vrI.getClass();
                C1758380vrI.LIZLLL(c19eg, pdpEnterParam, productPackStruct, j, i, code);
            }
        } else {
            String productId = ((IPdpStarter.PdpEnterParam) afS0S0500100_26.l3).getProductId();
            IPdpStarter.PdpEnterParam pdpEnterParam2 = (IPdpStarter.PdpEnterParam) afS0S0500100_26.l3;
            C1440005kM.LIZ(new C1034540d1o(5, productId, pdpEnterParam2.awemeId, pdpEnterParam2.clickFrom));
            if (!((C013C) afS0S0500100_26.l1).element) {
                C1758380vrI c1758380vrI2 = (C1758380vrI) afS0S0500100_26.l0;
                C19EG c19eg2 = (C19EG) afS0S0500100_26.l2;
                String string = c19eg2.getString(2131829438);
                c1758380vrI2.getClass();
                C1389890mGx c1389890mGx = new C1389890mGx(c19eg2);
                c1389890mGx.LJIIJ(string);
                c1389890mGx.LJIIJJI();
            }
        }
        C1C7U.LIZIZ("PdpStarterOptimized@4303.open$2$2");
    }

    public static final void accept$2(AfS0S0500100_26 afS0S0500100_26, Object obj) throws Throwable {
        String str;
        C1C7U.LIZ("SeaPdpStarterOptimized@3f18.open$1$1");
        ProductPackStruct productPackStruct = (ProductPackStruct) obj;
        if (TextUtils.isEmpty(((IPdpStarter.PdpEnterParam) afS0S0500100_26.l0).chainKey) && (str = productPackStruct.chainKey) != null && str.length() > 0) {
            Map<String, Object> map = ((IPdpStarter.PdpEnterParam) afS0S0500100_26.l0).visitReportParams;
            if (map != null) {
                map.put("chain_key", productPackStruct.chainKey);
            }
            ((IPdpStarter.PdpEnterParam) afS0S0500100_26.l0).setChainKey(productPackStruct.chainKey);
        }
        InterfaceC1758450vrP.LIZ.getClass();
        C1758310vrB c1758310vrB = C1758310vrB.LIZJ;
        C1758310vrB.LJJIL(((C1758370vrH) afS0S0500100_26.l1).LIZ);
        if (!((C013C) afS0S0500100_26.l2).element) {
            C1758390vrJ c1758390vrJ = (C1758390vrJ) afS0S0500100_26.l3;
            C19EG c19eg = (C19EG) afS0S0500100_26.l4;
            IPdpStarter.PdpEnterParam pdpEnterParam = (IPdpStarter.PdpEnterParam) afS0S0500100_26.l0;
            long j = afS0S0500100_26.j5;
            int i = ((C1758370vrH) afS0S0500100_26.l1).LIZIZ;
            c1758390vrJ.getClass();
            C1758390vrJ.LIZLLL(c19eg, pdpEnterParam, productPackStruct, j, i, 0);
        }
        C1C7U.LIZIZ("SeaPdpStarterOptimized@3f18.open$1$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$3(AfS0S0500100_26 afS0S0500100_26, Object obj) throws Throwable {
        List<ProductPackStruct> list;
        C1C7U.LIZ("SeaPdpStarterOptimized@3f18.open$1$2");
        Throwable th = (Throwable) obj;
        ProductPackStruct productPackStruct = null;
        ((C1758390vrJ) afS0S0500100_26.l0).LIZIZ = null;
        if (th instanceof C1758120vqs) {
            C1758120vqs c1758120vqs = (C1758120vqs) th;
            ProductInfoPackData productInfoPackData = (ProductInfoPackData) c1758120vqs.getResp().data;
            if (productInfoPackData != null && (list = productInfoPackData.productionInfoPack) != null) {
                productPackStruct = (ProductPackStruct) C13LP.LJJJLL(list);
            }
            if (!((C013C) afS0S0500100_26.l1).element) {
                C1758390vrJ c1758390vrJ = (C1758390vrJ) afS0S0500100_26.l0;
                C19EG c19eg = (C19EG) afS0S0500100_26.l2;
                IPdpStarter.PdpEnterParam pdpEnterParam = (IPdpStarter.PdpEnterParam) afS0S0500100_26.l3;
                long j = afS0S0500100_26.j5;
                int i = ((C1758370vrH) afS0S0500100_26.l4).LIZIZ;
                int code = c1758120vqs.getCode();
                c1758390vrJ.getClass();
                C1758390vrJ.LIZLLL(c19eg, pdpEnterParam, productPackStruct, j, i, code);
            }
        } else {
            String productId = ((IPdpStarter.PdpEnterParam) afS0S0500100_26.l3).getProductId();
            IPdpStarter.PdpEnterParam pdpEnterParam2 = (IPdpStarter.PdpEnterParam) afS0S0500100_26.l3;
            C1440005kM.LIZ(new C1034540d1o(5, productId, pdpEnterParam2.awemeId, pdpEnterParam2.clickFrom));
            if (!((C013C) afS0S0500100_26.l1).element) {
                C1758390vrJ c1758390vrJ2 = (C1758390vrJ) afS0S0500100_26.l0;
                C19EG c19eg2 = (C19EG) afS0S0500100_26.l2;
                String string = c19eg2.getString(2131829438);
                c1758390vrJ2.getClass();
                C1389890mGx c1389890mGx = new C1389890mGx(c19eg2);
                c1389890mGx.LJIIJ(string);
                c1389890mGx.LJIIJJI();
            }
        }
        C1C7U.LIZIZ("SeaPdpStarterOptimized@3f18.open$1$2");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS0S0500100_26(long r2, X.C19EG r4, X.C1758370vrH r5, X.C1758390vrJ r6, com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter.PdpEnterParam r7, X.C013C r8, int r9) {
        /*
            r1 = this;
            r1.$t = r9
            int r9 = 2 - r9
            if (r9 == 0) goto L17
            r0 = r1
            r0.l0 = r6
            r0.l1 = r8
            r0.l2 = r4
            r0.l3 = r7
            r0.j5 = r2
            r0.l4 = r5
        L13:
            r0.<init>()
            return
        L17:
            r0 = r1
            r0.l0 = r7
            r0.l1 = r5
            r0.l2 = r8
            r0.l3 = r6
            r0.l4 = r4
            r0.j5 = r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS0S0500100_26.<init>(long, X.19EG, X.0vrH, X.0vrJ, com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter$PdpEnterParam, X.013C, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS0S0500100_26(long r2, X.C19EG r4, X.C1758370vrH r5, com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter.PdpEnterParam r6, X.C1758380vrI r7, X.C013C r8, int r9) {
        /*
            r1 = this;
            r1.$t = r9
            if (r9 == 0) goto L15
            r0 = r1
            r0.l0 = r7
            r0.l1 = r8
            r0.l2 = r4
            r0.l3 = r6
            r0.j5 = r2
            r0.l4 = r5
        L11:
            r0.<init>()
            return
        L15:
            r0 = r1
            r0.l0 = r6
            r0.l1 = r5
            r0.l2 = r8
            r0.l3 = r7
            r0.l4 = r4
            r0.j5 = r2
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS0S0500100_26.<init>(long, X.19EG, X.0vrH, com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter$PdpEnterParam, X.0vrI, X.013C, int):void");
    }
}
