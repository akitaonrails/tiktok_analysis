package X;

import Y.ARunnableS126S0100000_26;
import Y.ARunnableS95S0200000_26;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pipo.cashier.IPIPOCashierService;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.CashierKey;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.PIPOCashierServiceImpl;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.maincashier.CashierEnterParams;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.PIPOPaymentOptionSource;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.PaymentOptionLocalInfo;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CashierBasicInfoData;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.PricingPlan;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.v3.CashierPaymentOptionInfoResp;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PODaInfo;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse;
import com.ss.android.ugc.aweme.pipo.probe.IProbeService;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS488S0200000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uaL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1709430uaL implements InterfaceC1192660h8q, InterfaceC1709390uaH {
    public final Context LL;
    public final CashierKey LLILLJJLI;
    public C1709570uaZ LLILLL;
    public C1709140uZs LLILZ;
    public C1712020ueW LLILZIL;
    public final List<InterfaceC1709520uaU> LLILZLL = new ArrayList();
    public final Map<String, String> LLIZ = new LinkedHashMap();
    public C995290c0V LLIZLLLIL;
    public WeakReference<C1712060uea> LLJ;
    public C1707840uXm LLJI;
    public boolean LLJIJIL;
    public C1710390ubt LLJILJIL;
    public String LLJILJILJ;
    public String LLJILLL;
    public boolean LLJJ;
    public final C1708990uZd LLJJI;
    public Fragment LLJJIII;
    public boolean LLJJIJI;
    public String LLJJIJIIJIL;

    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    @Override // X.InterfaceC1192660h8q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject LIZLLL() throws org.json.JSONException {
        /*
            r14 = this;
            java.lang.String r0 = "Cashier"
            X.0uZC r2 = X.C1708710uZB.LIZ(r0)
            r1 = 4
            java.lang.String r0 = "getEventPIPOCommonParams"
            r2.LIZ(r1, r0)
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            X.0uaZ r0 = r14.LLILLL
            r8 = 0
            if (r0 == 0) goto L5d
            java.util.List r1 = r0.LJJIJIIJIL()
            java.util.ArrayList r6 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r6.<init>(r0)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.util.Iterator r1 = r1.iterator()
        L2b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L43
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption r0 = (com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption) r0
            com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PODaInfo r0 = r0.trackInfo
            if (r0 == 0) goto L41
            java.lang.String r0 = r0.optionName
        L3d:
            r6.add(r0)
            goto L2b
        L41:
            r0 = r8
            goto L3d
        L43:
            java.lang.String r7 = ","
            r10 = 0
            r13 = 62
            r9 = r8
            r11 = r8
            r12 = r8
            java.lang.String r1 = X.C13LP.LJJLIIIJ(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.String r0 = "payment_method"
            r3.put(r0, r1)
            com.ss.android.ugc.aweme.pipo.cashier.cashier.CashierKey r0 = r14.LLILLJJLI
            java.lang.String r1 = r0.payRequestId
            java.lang.String r0 = "pay_request_id"
            r3.put(r0, r1)
        L5d:
            X.0uaZ r7 = r14.LLILLL
            r6 = 0
            if (r7 == 0) goto L6f
            com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption r0 = r7.LJJIJ()
            r5 = 1
            if (r0 != 0) goto L77
            com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption r0 = r7.LJJIJIIJI()
            if (r0 != 0) goto L77
        L6f:
            java.lang.String r1 = "0"
        L71:
            java.lang.String r0 = "is_default_payment_method"
            r3.put(r0, r1)
            return r3
        L77:
            r4 = 2
            java.lang.String[] r1 = new java.lang.String[r4]
            com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption r0 = r7.LJJIJ()
            if (r0 == 0) goto La9
            java.lang.String r0 = r0.LIZ
        L82:
            r1[r6] = r0
            com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption r0 = r7.LJJIJIIJI()
            if (r0 == 0) goto L8c
            java.lang.String r8 = r0.LIZ
        L8c:
            r1[r5] = r8
            java.util.List r2 = X.C13LQ.LJIJI(r1)
            java.lang.String[] r1 = new java.lang.String[r4]
            java.lang.String r0 = r7.LJIIIIZZ
            r1[r6] = r0
            java.lang.String r0 = r7.LJIIIZ
            r1[r5] = r0
            java.util.List r0 = X.C13LQ.LJIJI(r1)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 != r5) goto L6f
            java.lang.String r1 = "1"
            goto L71
        La9:
            r0 = r8
            goto L82
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1709430uaL.LIZLLL():org.json.JSONObject");
    }

    @Override // X.InterfaceC1192660h8q
    public final void LJIIIIZZ() {
        C1708710uZB.LIZ("Cashier").LIZ(4, LJIJJ("hideSecurityLoading"));
        if (!Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS126S0100000_26(this, 65));
            return;
        }
        C1712020ueW c1712020ueW = this.LLILZIL;
        if (c1712020ueW != null) {
            c1712020ueW.LIZIZ();
        }
        this.LLILZIL = null;
    }

    @Override // X.InterfaceC1192660h8q
    public final String LJIIIZ() {
        PaymentOption paymentOptionLJJIJ;
        PricingPlan pricingPlan;
        C1709570uaZ c1709570uaZ = this.LLILLL;
        if (c1709570uaZ == null) {
            return null;
        }
        PaymentOption paymentOptionLJJIJIIJI = c1709570uaZ.LJJIJIIJI();
        if ((paymentOptionLJJIJIIJI == null || (pricingPlan = paymentOptionLJJIJIIJI.LIZIZ) == null) && ((paymentOptionLJJIJ = c1709570uaZ.LJJIJ()) == null || (pricingPlan = paymentOptionLJJIJ.LIZIZ) == null)) {
            return null;
        }
        return pricingPlan.pricingPlanId;
    }

    @Override // X.InterfaceC1192660h8q
    public final boolean LJIIJJI() {
        C1712020ueW c1712020ueW = this.LLILZIL;
        return c1712020ueW != null && c1712020ueW.LIZ().isShowing();
    }

    @Override // X.InterfaceC1192660h8q
    public final void LJIILJJIL() {
        C1709570uaZ c1709570uaZ;
        C1708720uZC c1708720uZCLIZ = C1708710uZB.LIZ("Cashier");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setHostDestroyed: ");
        sbLIZ.append(true);
        c1708720uZCLIZ.LIZ(4, LJIJJ(C2188811AlT.LIZIZ(sbLIZ)));
        this.LLJJIJI = true;
        if (!this.LLJJI.LJIIZILJ || (c1709570uaZ = this.LLILLL) == null) {
            return;
        }
        c1709570uaZ.LJIILJJIL.remove(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d9 A[Catch: all -> 0x02d7, TryCatch #0 {all -> 0x02d7, blocks: (B:9:0x0035, B:10:0x0072, B:12:0x0078, B:14:0x0086, B:17:0x008c, B:19:0x0096, B:20:0x00a9, B:22:0x00b3, B:25:0x00b9, B:27:0x00c9, B:85:0x0246, B:90:0x024f, B:91:0x0251, B:24:0x00b7, B:28:0x00cd, B:30:0x00dc, B:31:0x00f9, B:33:0x00fd, B:34:0x011a, B:36:0x0156, B:38:0x015c, B:40:0x0175, B:41:0x017d, B:64:0x01d9, B:65:0x01e8, B:66:0x01f7, B:68:0x01fd, B:70:0x020d, B:72:0x0215, B:75:0x021a, B:77:0x0224, B:79:0x0228, B:81:0x022f, B:82:0x0234, B:76:0x0222, B:43:0x0187, B:45:0x018b, B:50:0x0198, B:52:0x019c, B:57:0x01ab, B:59:0x01c4, B:60:0x01cc, B:93:0x0277, B:95:0x027f, B:97:0x0283, B:99:0x0289, B:101:0x0293, B:102:0x0297, B:104:0x029f, B:106:0x02a3, B:107:0x02a5, B:109:0x02a9, B:110:0x02ab), top: B:172:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01fd A[Catch: all -> 0x02d7, TryCatch #0 {all -> 0x02d7, blocks: (B:9:0x0035, B:10:0x0072, B:12:0x0078, B:14:0x0086, B:17:0x008c, B:19:0x0096, B:20:0x00a9, B:22:0x00b3, B:25:0x00b9, B:27:0x00c9, B:85:0x0246, B:90:0x024f, B:91:0x0251, B:24:0x00b7, B:28:0x00cd, B:30:0x00dc, B:31:0x00f9, B:33:0x00fd, B:34:0x011a, B:36:0x0156, B:38:0x015c, B:40:0x0175, B:41:0x017d, B:64:0x01d9, B:65:0x01e8, B:66:0x01f7, B:68:0x01fd, B:70:0x020d, B:72:0x0215, B:75:0x021a, B:77:0x0224, B:79:0x0228, B:81:0x022f, B:82:0x0234, B:76:0x0222, B:43:0x0187, B:45:0x018b, B:50:0x0198, B:52:0x019c, B:57:0x01ab, B:59:0x01c4, B:60:0x01cc, B:93:0x0277, B:95:0x027f, B:97:0x0283, B:99:0x0289, B:101:0x0293, B:102:0x0297, B:104:0x029f, B:106:0x02a3, B:107:0x02a5, B:109:0x02a9, B:110:0x02ab), top: B:172:0x0035 }] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @X.InterfaceC1294060jmO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJJ() throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1005
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1709430uaL.LJJ():java.lang.String");
    }

    public final void LJJII() {
        C1710110ubR.LIZ.LIZ("prepareToPay", this.LLILLJJLI, C2097908Jt.LIZJ(new Pair("listenerCount", Integer.valueOf(((ArrayList) this.LLILZLL).size()))));
        Iterator<InterfaceC1709520uaU> it2 = this.LLILZLL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ();
        }
    }

    public final void LJJIIZ() {
        Object c098200Yq;
        C1712060uea c1712060uea;
        try {
            WeakReference<C1712060uea> weakReference = this.LLJ;
            if (weakReference != null && (c1712060uea = weakReference.get()) != null) {
                C1709570uaZ c1709570uaZ = this.LLILLL;
                c1712060uea.LIZ(c1709570uaZ != null ? c1709570uaZ.LJJJJLI() : null, this.LLJJI);
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            LJJIFFI("syncCachedAgreementView", thM5exceptionOrNullimpl);
        }
    }

    @Override // X.InterfaceC1709390uaH
    public final void XX1() {
        C1708710uZB.LIZ("Cashier").LIZ(4, LJIJJ("onPaymentMethodDataChanged"));
        C995290c0V c995290c0V = this.LLIZLLLIL;
        if (c995290c0V != null) {
            LJIILIIL(c995290c0V, null);
        }
    }

    public final void finalize() {
        C1709570uaZ c1709570uaZ;
        PIPOCashierServiceImpl pIPOCashierServiceImpl;
        C1708710uZB.LIZ("Cashier").LIZ(4, LJIJJ("CashierImpl is finalized"));
        String str = this.LLILLJJLI.payRequestId;
        if (str == null) {
            str = "";
        }
        C1708610uZ1.LIZ.remove(str);
        String str2 = this.LLILLJJLI.payRequestId;
        C1708610uZ1.LIZIZ.remove(str2 != null ? str2 : "");
        Object objPluggableSpi$default = PluggableExtentionKt.pluggableSpi$default(IPIPOCashierService.class, false, false, false, 14, null);
        if ((objPluggableSpi$default instanceof PIPOCashierServiceImpl) && (pIPOCashierServiceImpl = (PIPOCashierServiceImpl) objPluggableSpi$default) != null) {
            Iterator it2 = ((ArrayList) pIPOCashierServiceImpl.LIZIZ).iterator();
            while (true) {
                if (it2.hasNext()) {
                    Object next = it2.next();
                    C1709430uaL c1709430uaL = (C1709430uaL) ((Reference) next).get();
                    if (c1709430uaL != null && Intrinsics.LJFF(c1709430uaL.LLILLJJLI, this.LLILLJJLI)) {
                        if (next != null) {
                            ((ArrayList) pIPOCashierServiceImpl.LIZIZ).remove(next);
                        }
                    }
                }
            }
        }
        try {
            IProbeService iProbeService = (IProbeService) PluggableExtentionKt.pluggableSpi$default(IProbeService.class, false, false, false, 14, null);
            if (iProbeService != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LLJJI.LJ);
                sbLIZ.append("_cashier");
                iProbeService.LJIIJJI(new C1504130pFD(C2188811AlT.LIZIZ(sbLIZ)));
            }
            if (this.LLJJI.LJIIZILJ && (c1709570uaZ = this.LLILLL) != null) {
                c1709570uaZ.LJIILJJIL.remove(this);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // X.InterfaceC1709390uaH
    public final void pP1() {
        Context context;
        Activity activityLIZ;
        PaymentOption paymentOptionLJJIJIIJI;
        PODaInfo pODaInfo;
        String str;
        C1710110ubR.LIZ.LIZ("showPriceInfoChangedToast", this.LLILLJJLI, C2097908Jt.LIZJ(new Pair("contentId", 2131840171)));
        C995290c0V c995290c0V = this.LLIZLLLIL;
        if (c995290c0V == null || (context = c995290c0V.getContext()) == null || (activityLIZ = C1388190mED.LIZ(context)) == null) {
            return;
        }
        Fragment fragment = this.LLJJIII;
        if (fragment != null) {
            C1389880mGw c1389880mGw = new C1389880mGw(fragment);
            c1389880mGw.LJIIIIZZ(2131840171);
            c1389880mGw.LJIIJ();
        } else {
            C1389880mGw c1389880mGw2 = new C1389880mGw(activityLIZ);
            c1389880mGw2.LJIIIIZZ(2131840171);
            c1389880mGw2.LJIIJ();
        }
        InterfaceC1709310ua9 interfaceC1709310ua9LIZIZ = C1708610uZ1.LIZIZ(this.LLILLJJLI.payRequestId);
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("option_type", "payment_type"));
        C1709570uaZ c1709570uaZ = this.LLILLL;
        if (c1709570uaZ != null && (paymentOptionLJJIJIIJI = c1709570uaZ.LJJIJIIJI()) != null && (pODaInfo = paymentOptionLJJIJIIJI.trackInfo) != null && (str = pODaInfo.optionName) != null) {
            mapLJIIJ.put("option_name", str);
        }
        interfaceC1709310ua9LIZIZ.LJIIJJI("order_submit", "total_price_change", mapLJIIJ);
    }

    @Override // X.InterfaceC1192660h8q
    public final C995290c0V LIZJ() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C995290c0V c995290c0V = new C995290c0V(this.LL);
        c995290c0V.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1775890wJX(this, c995290c0V, 0));
        C1708720uZC c1708720uZCLIZ = C1708710uZB.LIZ("Cashier");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("create cashier view: ");
        sbLIZ.append(c995290c0V.hashCode());
        c1708720uZCLIZ.LIZ(4, LJIJJ(C2188811AlT.LIZIZ(sbLIZ)));
        C1708610uZ1.LIZIZ(this.LLILLJJLI.payRequestId).LIZ("rd_pipo_cashier_render", C2097908Jt.LIZJ(new Pair("duration_create_view", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis))));
        return c995290c0V;
    }

    @Override // X.InterfaceC1709390uaH
    public final void c3() {
        LJJIIZ();
        C1710110ubR.LIZ.LIZ("onSelectedPaymentInfoChanged", this.LLILLJJLI, C2097908Jt.LIZJ(new Pair("listenerCount", Integer.valueOf(((ArrayList) this.LLILZLL).size()))));
        Iterator it2 = ((ArrayList) this.LLILZLL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1709520uaU) it2.next()).c3();
        }
    }

    @Override // X.InterfaceC1192660h8q
    public final void LIZ(JSONObject jSONObject) {
        C1708710uZB.LIZ("Cashier").LIZ(4, "setEventBusinessCommonParams");
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                this.LLIZ.put(next, jSONObject.optString(next));
            }
        }
        String str = this.LLILLJJLI.payRequestId;
        if (str == null) {
            str = "";
        }
        C1708610uZ1.LIZ(str, this.LLIZ);
    }

    @Override // X.InterfaceC1192660h8q
    public final void LIZIZ(Map<String, String> map) {
        C1707990uY1 c1707990uY1;
        C1709570uaZ c1709570uaZ = this.LLILLL;
        if (c1709570uaZ != null) {
            C1707990uY1 c1707990uY12 = c1709570uaZ.LIZIZ;
            if (c1707990uY12 != null) {
                c1707990uY1 = new C1707990uY1(c1707990uY12.LIZ, c1707990uY12.LIZIZ, c1707990uY12.LIZJ, c1707990uY12.LIZLLL, c1707990uY12.LJ, map);
            } else {
                c1707990uY1 = null;
            }
            c1709570uaZ.LIZIZ = c1707990uY1;
        }
    }

    @Override // X.InterfaceC1192660h8q
    public final C1193620hAO LJ(boolean z) {
        C1709570uaZ c1709570uaZ = this.LLILLL;
        if (c1709570uaZ != null) {
            return c1709570uaZ.LIZIZ(this.LL, this.LLJILJIL, z);
        }
        return null;
    }

    @Override // X.InterfaceC1192660h8q
    public final boolean LJFF(Function1<? super C1164500gPQ, Unit> function1) {
        C1709570uaZ c1709570uaZ = this.LLILLL;
        if (c1709570uaZ != null) {
            C1707910uXt.LJIIIZ("order_submit", this.LLILLJJLI, c1709570uaZ);
            C1708030uY5.LIZ.LIZ(new C1708070uY9(this.LLILLJJLI.toString())).LIZJ("generate_payment_info", null);
            return c1709570uaZ.LJI(this.LLILLJJLI, this.LL, false, "buildCurrentPaymentInfoAsyncString", false, new C1776180wK0((Function1) function1, (Function1<? super C1164500gPQ, Unit>) this, (C1709430uaL) c1709570uaZ, (C1709570uaZ) 0));
        }
        function1.invoke(new C1164500gPQ(EnumC336190DFx.PAYMENT_ERROR, null, this.LL.getString(2131835079), 2));
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1192660h8q
    public final C335850DEp LJII(boolean z) {
        C335850DEp c335850DEpLJIILLIIL;
        C1709140uZs c1709140uZs;
        WeakReference<C995290c0V> weakReference;
        C995290c0V c995290c0V;
        C1709570uaZ c1709570uaZ;
        C19EG c19egLIZIZ;
        Object next;
        C1709140uZs c1709140uZs2;
        WeakReference<C995290c0V> weakReference2;
        C995290c0V c995290c0V2;
        C1709570uaZ c1709570uaZ2;
        PaymentOption paymentOptionLJJIJIIJI;
        WeakReference<C995290c0V> weakReference3;
        C995290c0V c995290c0V3;
        C1709880ub4 c1709880ub4;
        C1709570uaZ c1709570uaZ3 = this.LLILLL;
        if (c1709570uaZ3 == null) {
            c335850DEpLJIILLIIL = new C335850DEp(EnumC1709470uaP.EMPTY_PAYMENT_METHOD, this.LL.getString(2131839170));
        } else {
            c335850DEpLJIILLIIL = c1709570uaZ3.LJIILLIIL(this.LL, this.LLJILJIL);
        }
        if (!z) {
            EnumC1709470uaP enumC1709470uaP = c335850DEpLJIILLIIL.LIZ;
            if (enumC1709470uaP == EnumC1709470uaP.EMPTY_OTHER_WHEN_HYBRID) {
                C1709140uZs c1709140uZs3 = this.LLILZ;
                if (c1709140uZs3 != null && (c1709880ub4 = c1709140uZs3.LJIIJJI) != null) {
                    c1709880ub4.LJIILIIL(true);
                }
            } else if (enumC1709470uaP == EnumC1709470uaP.EMPTY_PAYMENT_METHOD) {
                C1709140uZs c1709140uZs4 = this.LLILZ;
                if (c1709140uZs4 != null) {
                    SettingsManager.LIZLLL().getClass();
                    if (SettingsManager.LIZ("pipo_ttls_inline_error_optimize_switch", false) && (weakReference3 = c1709140uZs4.LJIIL) != null && (c995290c0V3 = weakReference3.get()) != null) {
                        LinearLayout llNoSelectionHint = c995290c0V3.getLlNoSelectionHint();
                        if (llNoSelectionHint != null) {
                            C12ES.LJIILL(0, llNoSelectionHint);
                        }
                        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(c995290c0V3, PropertyValuesHolder.ofKeyframe("translationX", Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.25f, C1722120uuo.LIZIZ(-4.0f)), Keyframe.ofFloat(0.5f, C1722120uuo.LIZIZ(4.0f)), Keyframe.ofFloat(0.75f, C1722120uuo.LIZIZ(-2.0f)), Keyframe.ofFloat(1.0f, 0.0f)));
                        objectAnimatorOfPropertyValuesHolder.setDuration(480L);
                        objectAnimatorOfPropertyValuesHolder.setInterpolator(new LinearInterpolator());
                        C786410Ut5.Pd(objectAnimatorOfPropertyValuesHolder);
                    }
                }
                SettingsManager.LIZLLL().getClass();
                if (SettingsManager.LIZ("pipo_ttls_inline_error_optimize_switch", false)) {
                    c335850DEpLJIILLIIL = new C335850DEp(c335850DEpLJIILLIIL.LIZ, "");
                    this.LLJIJIL = true;
                }
            }
        }
        if (c335850DEpLJIILLIIL.LIZ == EnumC1709470uaP.DIRECT_CHECKOUT && (c1709140uZs2 = this.LLILZ) != null && (weakReference2 = c1709140uZs2.LJIIL) != null && (c995290c0V2 = weakReference2.get()) != null && (c1709570uaZ2 = c1709140uZs2.LJIILIIL) != null && (paymentOptionLJJIJIIJI = c1709570uaZ2.LJJIJIIJI()) != null && c1709570uaZ2.LJIILIIL(paymentOptionLJJIJIIJI)) {
            C1710720ucQ c1710720ucQ = new C1710720ucQ(c995290c0V2.getContext());
            CashierKey cashierKey = c1709140uZs2.LIZ;
            C1710720ucQ.LIZ(c1710720ucQ, new CashierEnterParams(cashierKey.payRequestId, cashierKey, c1709570uaZ2, null, new C1709070uZl(c1709570uaZ2.LJIJ.LIZIZ, EnumC1709200uZy.CONTINUE, EnumC1709020uZg.OSP), c1709140uZs2.LIZIZ, EnumC1708880uZS.LEGACY, new C1709220ua0(null, c1709140uZs2.LIZLLL, c1709140uZs2.LJ, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 57)), null, EnumC1709560uaY.CCDC, paymentOptionLJJIJIIJI, true, null, 32);
        }
        if (c335850DEpLJIILLIIL.LIZ == EnumC1709470uaP.INDEPENDENT_CVV && (c1709140uZs = this.LLILZ) != null && (weakReference = c1709140uZs.LJIIL) != null && (c995290c0V = weakReference.get()) != null && (c1709570uaZ = c1709140uZs.LJIILIIL) != null && (c19egLIZIZ = C1388190mED.LIZIZ(c995290c0V.getContext())) != null) {
            Iterator it2 = ((ArrayList) c1709570uaZ.LJJIJIIJIL()).iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (((PaymentOption) next).LJIILJJIL() != null) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            PaymentOption paymentOption = (PaymentOption) next;
            if (paymentOption != null) {
                C1710870ucf.LIZ(c19egLIZIZ, c1709570uaZ, paymentOption, c1709140uZs.LIZJ.invoke(), "embedded_cashier", new AwS570S0100000_26(c1709140uZs, 1395));
            }
        }
        if (!C1697810uHb.LJIIJJI(EnumC1709470uaP.SUCCESS, EnumC1709470uaP.DIRECT_CHECKOUT, EnumC1709470uaP.INDEPENDENT_CVV).contains(c335850DEpLJIILLIIL.LIZ)) {
            LJJIIJZLJL(c335850DEpLJIILLIIL.LIZ.toString(), this.LLJJIJIIJIL, false);
        }
        C1708710uZB.LIZ("Cashier").LIZ(4, LJIJJ("is ready for pay: " + c335850DEpLJIILLIIL));
        return c335850DEpLJIILLIIL;
    }

    @Override // X.InterfaceC1192660h8q
    public final void LJIIJ(View view) {
        Object c098200Yq;
        if ((view instanceof C1712060uea) && view != null) {
            try {
                this.LLJ = new WeakReference<>(view);
                LJJIIZ();
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                LJJIFFI("onBindAgreementView", thM5exceptionOrNullimpl);
            }
        }
    }

    @Override // X.InterfaceC1192660h8q
    public final C1712060uea LJIILL(View view) {
        return new C1712060uea(view.getContext());
    }

    @Override // X.InterfaceC1192660h8q
    public final void LJIILLIIL(InterfaceC1709520uaU interfaceC1709520uaU) {
        C1708710uZB.LIZ("Cashier").LIZ(4, LJIJJ("cashier register listener"));
        ((ArrayList) this.LLILZLL).add(interfaceC1709520uaU);
    }

    @Override // X.InterfaceC1192660h8q
    public final void LJIIZILJ(Context context) {
        C1708710uZB.LIZ("Cashier").LIZ(4, LJIJJ("showSecurityLoading"));
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            C1712020ueW c1712020ueW = this.LLILZIL;
            if (c1712020ueW != null && c1712020ueW.LIZ().isShowing()) {
                return;
            }
            C1712020ueW c1712020ueW2 = new C1712020ueW(context);
            c1712020ueW2.LIZJ();
            this.LLILZIL = c1712020ueW2;
            return;
        }
        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS95S0200000_26(this, context, 23));
    }

    public final String LJIJJ(String str) {
        String strLIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(", by cashier id: ");
        C1711340udQ.LIZ.getClass();
        sbLIZ.append(C1711340udQ.LIZJ(this));
        sbLIZ.append(", data is: ");
        C1709570uaZ c1709570uaZ = this.LLILLL;
        if (c1709570uaZ != null) {
            strLIZJ = C1711340udQ.LIZJ(c1709570uaZ);
        } else {
            strLIZJ = null;
        }
        sbLIZ.append(strLIZJ);
        sbLIZ.append(", cashier_key: ");
        sbLIZ.append(this.LLILLJJLI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LJIJJLI(C1707990uY1 c1707990uY1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = c1707990uY1.LIZLLL;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("merchant_id", str);
        String str3 = c1707990uY1.LJ;
        if (str3 == null) {
            str3 = "";
        }
        linkedHashMap.put("merchant_user_id", str3);
        String str4 = c1707990uY1.LIZJ;
        if (str4 == null) {
            str4 = "";
        }
        linkedHashMap.put("priority_region", str4);
        String str5 = this.LLILLJJLI.payRequestId;
        if (str5 != null) {
            str2 = str5;
        }
        C1708610uZ1.LIZ(str2, linkedHashMap);
    }

    public final void LJIL(C1709570uaZ c1709570uaZ) {
        if (c1709570uaZ == null) {
            return;
        }
        c1709570uaZ.LJJLIIIJILLIZJL(this.LLJILJILJ, this.LLJILLL, this.LLJJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C1709570uaZ LJJIIJ(String str) {
        CashierPaymentOptionInfoResp cashierPaymentOptionInfoResp;
        if (str != null) {
            try {
                C1227904rF c1227904rF = C1227904rF.LIZ;
                Type type = new TypeToken<BaseResponse<CashierPaymentOptionInfoResp>>() { // from class: X.0uZr
                }.getType();
                c1227904rF.getClass();
                BaseResponse baseResponse = (BaseResponse) C1227904rF.LIZJ(str, type);
                if (baseResponse != null && (cashierPaymentOptionInfoResp = (CashierPaymentOptionInfoResp) baseResponse.data) != null) {
                    return cashierPaymentOptionInfoResp.LIZJ(this.LLJJI, this.LLILLJJLI.payRequestId);
                }
                return null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a3  */
    @Override // X.InterfaceC1192660h8q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL(android.view.View r33, androidx.fragment.app.Fragment r34) {
        /*
            Method dump skipped, instruction units count: 1294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1709430uaL.LJIILIIL(android.view.View, androidx.fragment.app.Fragment):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075 A[Catch: all -> 0x019f, TryCatch #1 {all -> 0x019f, blocks: (B:4:0x001c, B:15:0x0043, B:19:0x005b, B:20:0x005d, B:22:0x0075, B:24:0x0080, B:26:0x0084, B:27:0x008a, B:29:0x009e, B:31:0x00b6, B:33:0x00ba, B:37:0x00c2, B:39:0x00c6, B:40:0x00c8, B:41:0x00ce, B:43:0x00d2, B:45:0x00d9, B:47:0x0101, B:49:0x0105, B:50:0x010a, B:51:0x010f, B:53:0x0113, B:54:0x011c, B:69:0x016f, B:71:0x0180, B:72:0x018c, B:74:0x0190, B:76:0x0194, B:55:0x0120, B:57:0x0124, B:58:0x0127, B:60:0x012b, B:61:0x0134, B:63:0x015a, B:64:0x015f, B:66:0x0168, B:68:0x016c, B:23:0x007a, B:14:0x0041, B:78:0x019b, B:79:0x019e, B:12:0x002b), top: B:86:0x001c, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a A[Catch: all -> 0x019f, TryCatch #1 {all -> 0x019f, blocks: (B:4:0x001c, B:15:0x0043, B:19:0x005b, B:20:0x005d, B:22:0x0075, B:24:0x0080, B:26:0x0084, B:27:0x008a, B:29:0x009e, B:31:0x00b6, B:33:0x00ba, B:37:0x00c2, B:39:0x00c6, B:40:0x00c8, B:41:0x00ce, B:43:0x00d2, B:45:0x00d9, B:47:0x0101, B:49:0x0105, B:50:0x010a, B:51:0x010f, B:53:0x0113, B:54:0x011c, B:69:0x016f, B:71:0x0180, B:72:0x018c, B:74:0x0190, B:76:0x0194, B:55:0x0120, B:57:0x0124, B:58:0x0127, B:60:0x012b, B:61:0x0134, B:63:0x015a, B:64:0x015f, B:66:0x0168, B:68:0x016c, B:23:0x007a, B:14:0x0041, B:78:0x019b, B:79:0x019e, B:12:0x002b), top: B:86:0x001c, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084 A[Catch: all -> 0x019f, TryCatch #1 {all -> 0x019f, blocks: (B:4:0x001c, B:15:0x0043, B:19:0x005b, B:20:0x005d, B:22:0x0075, B:24:0x0080, B:26:0x0084, B:27:0x008a, B:29:0x009e, B:31:0x00b6, B:33:0x00ba, B:37:0x00c2, B:39:0x00c6, B:40:0x00c8, B:41:0x00ce, B:43:0x00d2, B:45:0x00d9, B:47:0x0101, B:49:0x0105, B:50:0x010a, B:51:0x010f, B:53:0x0113, B:54:0x011c, B:69:0x016f, B:71:0x0180, B:72:0x018c, B:74:0x0190, B:76:0x0194, B:55:0x0120, B:57:0x0124, B:58:0x0127, B:60:0x012b, B:61:0x0134, B:63:0x015a, B:64:0x015f, B:66:0x0168, B:68:0x016c, B:23:0x007a, B:14:0x0041, B:78:0x019b, B:79:0x019e, B:12:0x002b), top: B:86:0x001c, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009e A[Catch: all -> 0x019f, TryCatch #1 {all -> 0x019f, blocks: (B:4:0x001c, B:15:0x0043, B:19:0x005b, B:20:0x005d, B:22:0x0075, B:24:0x0080, B:26:0x0084, B:27:0x008a, B:29:0x009e, B:31:0x00b6, B:33:0x00ba, B:37:0x00c2, B:39:0x00c6, B:40:0x00c8, B:41:0x00ce, B:43:0x00d2, B:45:0x00d9, B:47:0x0101, B:49:0x0105, B:50:0x010a, B:51:0x010f, B:53:0x0113, B:54:0x011c, B:69:0x016f, B:71:0x0180, B:72:0x018c, B:74:0x0190, B:76:0x0194, B:55:0x0120, B:57:0x0124, B:58:0x0127, B:60:0x012b, B:61:0x0134, B:63:0x015a, B:64:0x015f, B:66:0x0168, B:68:0x016c, B:23:0x007a, B:14:0x0041, B:78:0x019b, B:79:0x019e, B:12:0x002b), top: B:86:0x001c, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c2 A[Catch: all -> 0x019f, PHI: r1
      0x00c2: PHI (r1v21 java.lang.String) = (r1v19 java.lang.String), (r1v22 java.lang.String) binds: [B:36:0x00c0, B:34:0x00bc] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x019f, blocks: (B:4:0x001c, B:15:0x0043, B:19:0x005b, B:20:0x005d, B:22:0x0075, B:24:0x0080, B:26:0x0084, B:27:0x008a, B:29:0x009e, B:31:0x00b6, B:33:0x00ba, B:37:0x00c2, B:39:0x00c6, B:40:0x00c8, B:41:0x00ce, B:43:0x00d2, B:45:0x00d9, B:47:0x0101, B:49:0x0105, B:50:0x010a, B:51:0x010f, B:53:0x0113, B:54:0x011c, B:69:0x016f, B:71:0x0180, B:72:0x018c, B:74:0x0190, B:76:0x0194, B:55:0x0120, B:57:0x0124, B:58:0x0127, B:60:0x012b, B:61:0x0134, B:63:0x015a, B:64:0x015f, B:66:0x0168, B:68:0x016c, B:23:0x007a, B:14:0x0041, B:78:0x019b, B:79:0x019e, B:12:0x002b), top: B:86:0x001c, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d2 A[Catch: all -> 0x019f, TryCatch #1 {all -> 0x019f, blocks: (B:4:0x001c, B:15:0x0043, B:19:0x005b, B:20:0x005d, B:22:0x0075, B:24:0x0080, B:26:0x0084, B:27:0x008a, B:29:0x009e, B:31:0x00b6, B:33:0x00ba, B:37:0x00c2, B:39:0x00c6, B:40:0x00c8, B:41:0x00ce, B:43:0x00d2, B:45:0x00d9, B:47:0x0101, B:49:0x0105, B:50:0x010a, B:51:0x010f, B:53:0x0113, B:54:0x011c, B:69:0x016f, B:71:0x0180, B:72:0x018c, B:74:0x0190, B:76:0x0194, B:55:0x0120, B:57:0x0124, B:58:0x0127, B:60:0x012b, B:61:0x0134, B:63:0x015a, B:64:0x015f, B:66:0x0168, B:68:0x016c, B:23:0x007a, B:14:0x0041, B:78:0x019b, B:79:0x019e, B:12:0x002b), top: B:86:0x001c, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0120 A[Catch: all -> 0x019f, TryCatch #1 {all -> 0x019f, blocks: (B:4:0x001c, B:15:0x0043, B:19:0x005b, B:20:0x005d, B:22:0x0075, B:24:0x0080, B:26:0x0084, B:27:0x008a, B:29:0x009e, B:31:0x00b6, B:33:0x00ba, B:37:0x00c2, B:39:0x00c6, B:40:0x00c8, B:41:0x00ce, B:43:0x00d2, B:45:0x00d9, B:47:0x0101, B:49:0x0105, B:50:0x010a, B:51:0x010f, B:53:0x0113, B:54:0x011c, B:69:0x016f, B:71:0x0180, B:72:0x018c, B:74:0x0190, B:76:0x0194, B:55:0x0120, B:57:0x0124, B:58:0x0127, B:60:0x012b, B:61:0x0134, B:63:0x015a, B:64:0x015f, B:66:0x0168, B:68:0x016c, B:23:0x007a, B:14:0x0041, B:78:0x019b, B:79:0x019e, B:12:0x002b), top: B:86:0x001c, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0180 A[Catch: all -> 0x019f, TryCatch #1 {all -> 0x019f, blocks: (B:4:0x001c, B:15:0x0043, B:19:0x005b, B:20:0x005d, B:22:0x0075, B:24:0x0080, B:26:0x0084, B:27:0x008a, B:29:0x009e, B:31:0x00b6, B:33:0x00ba, B:37:0x00c2, B:39:0x00c6, B:40:0x00c8, B:41:0x00ce, B:43:0x00d2, B:45:0x00d9, B:47:0x0101, B:49:0x0105, B:50:0x010a, B:51:0x010f, B:53:0x0113, B:54:0x011c, B:69:0x016f, B:71:0x0180, B:72:0x018c, B:74:0x0190, B:76:0x0194, B:55:0x0120, B:57:0x0124, B:58:0x0127, B:60:0x012b, B:61:0x0134, B:63:0x015a, B:64:0x015f, B:66:0x0168, B:68:0x016c, B:23:0x007a, B:14:0x0041, B:78:0x019b, B:79:0x019e, B:12:0x002b), top: B:86:0x001c, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    @Override // X.InterfaceC1192660h8q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJI(java.lang.String r22, X.EnumC1709240ua2 r23) {
        /*
            Method dump skipped, instruction units count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1709430uaL.LJIJI(java.lang.String, X.0ua2):void");
    }

    public final void LJJIFFI(String str, Throwable th) {
        C1708720uZC c1708720uZCLIZ = C1708710uZB.LIZ("Cashier");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("agreement view sync failed at ");
        sbLIZ.append(str);
        sbLIZ.append(": ");
        sbLIZ.append(th.getMessage());
        c1708720uZCLIZ.LIZ(6, LJIJJ(C2188811AlT.LIZIZ(sbLIZ)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C1709570uaZ LJJIII(String str, EnumC1709240ua2 enumC1709240ua2) {
        CashierBasicInfoData cashierBasicInfoData;
        if (str != null) {
            try {
                C1227904rF c1227904rF = C1227904rF.LIZ;
                Type type = new TypeToken<BaseResponse<CashierBasicInfoData>>() { // from class: X.0ua7
                }.getType();
                c1227904rF.getClass();
                BaseResponse baseResponse = (BaseResponse) C1227904rF.LIZJ(str, type);
                if (baseResponse != null && (cashierBasicInfoData = (CashierBasicInfoData) baseResponse.data) != null) {
                    C1708990uZd c1708990uZd = this.LLJJI;
                    if (enumC1709240ua2 == null) {
                        enumC1709240ua2 = EnumC1709240ua2.DEFAULT;
                    }
                    return cashierBasicInfoData.LIZ(c1708990uZd, enumC1709240ua2, this.LLILLJJLI.payRequestId);
                }
                return null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return null;
    }

    public C1709430uaL(Context context, CashierKey cashierKey, EnumC1709270ua5 enumC1709270ua5) {
        C1708990uZd c1708990uZd;
        this.LL = context;
        this.LLILLJJLI = cashierKey;
        int i = C1709280ua6.LIZ[enumC1709270ua5.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        c1708990uZd = C1709000uZe.LIZIZ;
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    c1708990uZd = C1709000uZe.LIZLLL;
                }
            } else {
                c1708990uZd = C1709000uZe.LIZJ;
            }
        } else {
            c1708990uZd = C1709000uZe.LIZ;
        }
        this.LLJJI = c1708990uZd;
        this.LLJJIJIIJIL = "order_submit";
        C1708720uZC c1708720uZCLIZ = C1708710uZB.LIZ("Cashier");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("create cashier instance: ");
        C1711340udQ.LIZ.getClass();
        sbLIZ.append(C1711340udQ.LIZJ(this));
        sbLIZ.append(", cashier_key: ");
        sbLIZ.append(cashierKey);
        c1708720uZCLIZ.LIZ(4, C2188811AlT.LIZIZ(sbLIZ));
        if (enumC1709270ua5 == EnumC1709270ua5.BNPL_AGREEMENT || enumC1709270ua5 == EnumC1709270ua5.GIFT_CARD) {
            String str = cashierKey.payRequestId;
            C1708610uZ1.LIZIZ.put(str == null ? "" : str, c1708990uZd.LIZLLL);
        }
    }

    @Override // X.InterfaceC1192660h8q
    public final void LJI(String str, String str2, boolean z) {
        if (str == null || !(!a0.LJJJIL(str))) {
            str = null;
        }
        this.LLJILJILJ = str;
        if (str2 == null || !(!a0.LJJJIL(str2))) {
            str2 = null;
        }
        this.LLJILLL = str2;
        this.LLJJ = z;
        LJIL(this.LLILLL);
    }

    @Override // X.InterfaceC1192660h8q
    public final boolean LJIIL(String str, String str2, String str3) {
        Context context;
        C995290c0V c995290c0V = this.LLIZLLLIL;
        if (c995290c0V != null) {
            context = c995290c0V.getContext();
        } else {
            context = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        return LJJI(context, str, str2, str3);
    }

    @Override // X.InterfaceC1192660h8q
    public final boolean LJIJ(Context context, String str, AwS488S0200000_26 awS488S0200000_26) {
        C1709550uaX c1709550uaX;
        C1709570uaZ c1709570uaZ;
        synchronized (C1709530uaV.LIZ) {
            try {
                if (Intrinsics.LJFF(C1709530uaV.LIZIZ, str)) {
                    c1709550uaX = C1709530uaV.LIZJ;
                } else {
                    c1709550uaX = null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (c1709550uaX != null && (c1709570uaZ = c1709550uaX.LIZ) != null) {
            PIPOPaymentOptionSource pIPOPaymentOptionSourceLIZIZ = c1709570uaZ.LIZ.LIZIZ();
            List<PaymentOptionLocalInfo> list = c1709570uaZ.LJIIJJI;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<PaymentOptionLocalInfo> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().LIZIZ());
            }
            C1709570uaZ c1709570uaZLJIJJ = C1709570uaZ.LJIJJ(c1709570uaZ, pIPOPaymentOptionSourceLIZIZ, null, null, new ArrayList(arrayList), new ArrayList(), c1709570uaZ.LJIILIIL.LIZIZ(), new ArrayList(), 54395742);
            c1709570uaZLJIJJ.LJJII = c1709570uaZ.LJJII;
            c1709570uaZLJIJJ.LJJIII = c1709570uaZ.LJJIII;
            return c1709570uaZLJIJJ.LJI(this.LLILLJJLI, context, false, "buildCredentialForSelectionAsync", false, new C1776190wK1(awS488S0200000_26, 6));
        }
        awS488S0200000_26.invoke(EnumC336190DFx.PAYMENT_ERROR, null, context.getString(2131835079));
        return false;
    }

    public final void LJJIIJZLJL(String str, String str2, boolean z) {
        Map<String, String> mapLJ;
        Object obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1709570uaZ c1709570uaZ = this.LLILLL;
        if (c1709570uaZ != null) {
            mapLJ = c1709570uaZ.LIZ();
        } else {
            mapLJ = C2097608Jq.LJ();
        }
        linkedHashMap.putAll(mapLJ);
        linkedHashMap.put("page_name", str2);
        String str3 = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_success", obj);
        if (str != null) {
            linkedHashMap.put("fail_reason", str);
        }
        if (!this.LLJIJIL) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("has_inline_error", str3);
        C1708610uZ1.LIZIZ(this.LLILLJJLI.payRequestId).LIZ("tiktokls_submit_order_result", linkedHashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0064 A[PHI: r8
      0x0064: PHI (r8v6 java.lang.String) = (r8v0 java.lang.String), (r8v7 java.lang.String) binds: [B:18:0x0062, B:16:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0068 A[PHI: r8
      0x0068: PHI (r8v5 java.lang.String) = (r8v0 java.lang.String), (r8v6 java.lang.String) binds: [B:18:0x0062, B:20:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b A[PHI: r8 r9
      0x006b: PHI (r8v1 java.lang.String) = (r8v5 java.lang.String), (r8v6 java.lang.String) binds: [B:22:0x0069, B:20:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x006b: PHI (r9v0 java.lang.String) = (r9v4 java.lang.String), (r9v5 java.lang.String) binds: [B:22:0x0069, B:20:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f A[PHI: r8 r9
      0x006f: PHI (r8v4 java.lang.String) = (r8v1 java.lang.String), (r8v5 java.lang.String) binds: [B:24:0x006d, B:22:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x006f: PHI (r9v3 java.lang.String) = (r9v0 java.lang.String), (r9v4 java.lang.String) binds: [B:24:0x006d, B:22:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072 A[PHI: r8 r9 r10
      0x0072: PHI (r8v3 java.lang.String) = (r8v1 java.lang.String), (r8v4 java.lang.String) binds: [B:24:0x006d, B:26:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0072: PHI (r9v2 java.lang.String) = (r9v0 java.lang.String), (r9v3 java.lang.String) binds: [B:24:0x006d, B:26:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0072: PHI (r10v2 java.lang.String) = (r10v0 java.lang.String), (r10v3 java.lang.String) binds: [B:24:0x006d, B:26:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJI(android.content.Context r29, java.lang.String r30, java.lang.String r31, java.lang.String r32) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1709430uaL.LJJI(android.content.Context, java.lang.String, java.lang.String, java.lang.String):boolean");
    }
}
