package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BankCardRule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.UnavailableCardBin;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import go5.c;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONArray;
import org.json.JSONObject;
import yo5.a$a;

/* JADX INFO: renamed from: X.0uy6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentSdkProcess$init$9", f = "PaymentSdkProcess.kt", l = {}, m = "invokeSuspend")
public final class C1724160uy6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ PaymentMethodsData LL;
    public final /* synthetic */ List<BankCardRule> LLILLJJLI;
    public final /* synthetic */ JSONObject LLILLL;
    public final /* synthetic */ List<UnavailableCardBin> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1724160uy6(PaymentMethodsData paymentMethodsData, List<BankCardRule> list, JSONObject jSONObject, List<UnavailableCardBin> list2, InterfaceC1364105Vn<? super C1724160uy6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = paymentMethodsData;
        this.LLILLJJLI = list;
        this.LLILLL = jSONObject;
        this.LLILZ = list2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1724160uy6(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        IECommerceHostService iECommerceHostService;
        String strLJIIIIZZ;
        JSONArray jSONArray;
        JSONObject jSONObject;
        JSONArray jSONArray2;
        JSONArray jSONArray3;
        JSONArray jSONArray4;
        InterfaceC930803kQ interfaceC930803kQ;
        InterfaceC1724190uy9 interfaceC1724190uy9;
        a$a a_a;
        c cVar;
        InterfaceC1724220uyC interfaceC1724220uyC;
        Cert cert;
        Cert cert2;
        InterfaceC1724010uxr interfaceC1724010uxr;
        AbstractC808800Vo6 abstractC808800Vo6;
        InterfaceC1724090uxz interfaceC1724090uxz;
        boolean z;
        String name;
        C1C7U.LIZ("PaymentSdkProcess@9b34.init$9");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("payment_sdk_init_debug_info", "begin async init");
        C1018703yb.LIZIZ("rd_pipo_sdk_init_debug", linkedHashMap);
        C1724230uyD c1724230uyD = C1724230uyD.LIZ;
        PaymentMethodsData paymentMethodsData = this.LL;
        c1724230uyD.getClass();
        List listLIZIZ = C1724230uyD.LIZIZ(paymentMethodsData);
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name = iECommerceHostService.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        C1724180uy8 c1724180uy8 = new C1724180uy8(((IApplicationDependencyService) iECommerceHostService).getApplication());
        c1724180uy8.LIZJ = new JSONObject(C1741890vQh.LJIIIIZZ(this.LL));
        if (listLIZIZ == null || (strLJIIIIZZ = C1741890vQh.LJIIIIZZ(listLIZIZ)) == null) {
            strLJIIIIZZ = "[]";
        }
        c1724180uy8.LJI = new JSONArray(strLJIIIIZZ);
        List<BankCardRule> list = this.LLILLJJLI;
        if (list != null && !list.isEmpty()) {
            c1724180uy8.LIZLLL = new JSONArray(C1741890vQh.LJIIIIZZ(this.LLILLJJLI));
        }
        JSONObject jSONObject2 = this.LLILLL;
        if (jSONObject2 != null && jSONObject2.length() > 0) {
            c1724180uy8.LJ = this.LLILLL;
        }
        List<UnavailableCardBin> list2 = this.LLILZ;
        if (list2 != null && !list2.isEmpty()) {
            c1724180uy8.LJFF = new JSONArray(C1741890vQh.LJIIIIZZ(this.LLILZ));
        }
        C1724170uy7 c1724170uy7LIZ = c1724180uy8.LIZ();
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("async build methods len ");
        sbLIZ.append(c1724170uy7LIZ.LJ.length());
        sbLIZ.append(' ');
        sbLIZ.append(c1724170uy7LIZ.LJ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LIZ(strLIZIZ);
        C932203ke.LIZ.getClass();
        C1724150uy5 c1724150uy5 = C1724150uy5.LJIIL;
        if (c1724150uy5.LIZ != null) {
            ((C1724080uxy) c1724150uy5.LIZIZ()).LIZIZ("ECommerceSupport mergeConfig");
            C1724170uy7 c1724170uy7 = c1724150uy5.LIZ;
            if (TextUtils.isEmpty(c1724170uy7.LIZIZ) && !TextUtils.isEmpty(c1724170uy7LIZ.LIZIZ)) {
                c1724170uy7.LIZIZ = c1724170uy7LIZ.LIZIZ;
            }
            JSONArray jSONArray5 = c1724170uy7.LIZJ;
            if ((jSONArray5 == null || jSONArray5.length() == 0) && (jSONArray = c1724170uy7LIZ.LIZJ) != null) {
                c1724170uy7.LIZJ = jSONArray;
            }
            JSONObject jSONObject3 = c1724170uy7.LIZLLL;
            if ((jSONObject3 == null || jSONObject3.length() == 0) && (jSONObject = c1724170uy7LIZ.LIZLLL) != null) {
                c1724170uy7.LIZLLL = jSONObject;
            }
            JSONArray jSONArray6 = c1724170uy7.LJ;
            if ((jSONArray6 == null || jSONArray6.length() == 0) && (jSONArray2 = c1724170uy7LIZ.LJ) != null) {
                c1724170uy7.LJ = jSONArray2;
            }
            JSONArray jSONArray7 = c1724170uy7.LJFF;
            if ((jSONArray7 == null || jSONArray7.length() == 0) && (jSONArray3 = c1724170uy7LIZ.LJFF) != null) {
                c1724170uy7.LJFF = jSONArray3;
            }
            JSONArray jSONArray8 = c1724170uy7.LJI;
            if ((jSONArray8 == null || jSONArray8.length() == 0) && (jSONArray4 = c1724170uy7LIZ.LJI) != null) {
                c1724170uy7.LJI = jSONArray4;
            }
            if (TextUtils.isEmpty(c1724170uy7.LJII) && !TextUtils.isEmpty(c1724170uy7LIZ.LJII)) {
                c1724170uy7.LJII = c1724170uy7LIZ.LJII;
            }
            if (TextUtils.isEmpty(c1724170uy7.LJIIIIZZ) && !TextUtils.isEmpty(c1724170uy7LIZ.LJIIIIZZ)) {
                c1724170uy7.LJIIIIZZ = c1724170uy7LIZ.LJIIIIZZ;
            }
            if (TextUtils.isEmpty(c1724170uy7.LJIIIZ) && !TextUtils.isEmpty(c1724170uy7LIZ.LJIIIZ)) {
                c1724170uy7.LJIIIZ = c1724170uy7LIZ.LJIIIZ;
            }
            if (TextUtils.isEmpty(c1724170uy7.LJIIJ) && !TextUtils.isEmpty(c1724170uy7LIZ.LJIIJ)) {
                c1724170uy7.LJIIJ = c1724170uy7LIZ.LJIIJ;
            }
            if (c1724170uy7.LJIIJJI == null && (interfaceC1724090uxz = c1724170uy7LIZ.LJIIJJI) != null) {
                c1724170uy7.LJIIJJI = interfaceC1724090uxz;
            }
            if (TextUtils.isEmpty(c1724170uy7.LJIIL) && !TextUtils.isEmpty(c1724170uy7LIZ.LJIIL)) {
                c1724170uy7.LJIIL = c1724170uy7LIZ.LJIIL;
            }
            if (c1724170uy7.LJIILIIL == null && (abstractC808800Vo6 = c1724170uy7LIZ.LJIILIIL) != null) {
                c1724170uy7.LJIILIIL = abstractC808800Vo6;
            }
            if (TextUtils.isEmpty(c1724170uy7.LJIILL) && !TextUtils.isEmpty(c1724170uy7LIZ.LJIILL)) {
                c1724170uy7.LJIILL = c1724170uy7LIZ.LJIILL;
            }
            if (TextUtils.isEmpty(c1724170uy7.LJIILJJIL) && !TextUtils.isEmpty(c1724170uy7LIZ.LJIILJJIL)) {
                c1724170uy7.LJIILJJIL = c1724170uy7LIZ.LJIILJJIL;
            }
            if (c1724170uy7.LJIILLIIL == null && (interfaceC1724010uxr = c1724170uy7LIZ.LJIILLIIL) != null) {
                c1724170uy7.LJIILLIIL = interfaceC1724010uxr;
            }
            if (TextUtils.isEmpty(c1724170uy7.LJIIZILJ) && !TextUtils.isEmpty(c1724170uy7LIZ.LJIIZILJ)) {
                c1724170uy7.LJIIZILJ = c1724170uy7LIZ.LJIIZILJ;
            }
            if (c1724170uy7.LJIJ == null && (cert2 = c1724170uy7LIZ.LJIJ) != null) {
                c1724170uy7.LJIJ = cert2;
            }
            if (c1724170uy7.LJIJI == null && (cert = c1724170uy7LIZ.LJIJI) != null) {
                c1724170uy7.LJIJI = cert;
            }
            if (TextUtils.isEmpty(c1724170uy7.LJIJJLI) && !TextUtils.isEmpty(c1724170uy7LIZ.LJIJJLI)) {
                c1724170uy7.LJIJJLI = c1724170uy7LIZ.LJIJJLI;
            }
            if (c1724170uy7.LJIL == null && (interfaceC1724220uyC = c1724170uy7LIZ.LJIL) != null) {
                c1724170uy7.LJIL = interfaceC1724220uyC;
            }
            if (c1724170uy7.LJJ == null && (cVar = c1724170uy7LIZ.LJJ) != null) {
                c1724170uy7.LJJ = cVar;
            }
            if (c1724170uy7.LJJI == null && (a_a = c1724170uy7LIZ.LJJI) != null) {
                c1724170uy7.LJJI = a_a;
            }
            if (c1724170uy7.LJJIFFI == null && (interfaceC1724190uy9 = c1724170uy7LIZ.LJJIFFI) != null) {
                c1724170uy7.LJJIFFI = interfaceC1724190uy9;
            }
            if (c1724170uy7.LJJII == null && (interfaceC930803kQ = c1724170uy7LIZ.LJJII) != null) {
                c1724170uy7.LJJII = interfaceC930803kQ;
            }
        } else {
            ((C1724080uxy) c1724150uy5.LIZIZ()).LIZIZ("ECommerceSupport setConfig");
            c1724150uy5.LIZ = c1724170uy7LIZ;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("payment_sdk_init_debug_info", "finish async init");
        C1018703yb.LIZIZ("rd_pipo_sdk_init_debug", linkedHashMap2);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PaymentSdkProcess@9b34.init$9");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
