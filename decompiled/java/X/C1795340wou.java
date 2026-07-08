package X;

import android.app.Activity;
import com.android.billingclient.api.Purchase;
import com.bytedance.globalpayment.iap.google.helper.RestoreOrderService;
import com.bytedance.globalpayment.iap.google.state.GooglePaymentHandlerV2;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;
import com.bytedance.globalpayment.service.manager.iap.google.ConsumeIapProductListener;
import com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0wou, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1795340wou implements InterfaceC1795240wok, InterfaceC1796100wq8 {
    public static String LJIIZILJ = "CONSTRUCT_YOUR";
    public static volatile C1795340wou LJIJ;
    public C1796080wq6 LJIIIZ;
    public C1BAY LJIILIIL;
    public InterfaceC1794840wo6 LJIILJJIL;
    public boolean LJIILLIIL;
    public final AtomicBoolean LIZ = new AtomicBoolean(false);
    public final ConcurrentMap<String, InterfaceC1795750wpZ> LIZIZ = new ConcurrentHashMap();
    public final ConcurrentMap<String, InterfaceC1795750wpZ> LIZJ = new ConcurrentHashMap();
    public final ConcurrentMap<String, ConsumeIapProductListener> LIZLLL = new ConcurrentHashMap();
    public final CopyOnWriteArraySet<Purchase> LJ = new CopyOnWriteArraySet<>();
    public final ConcurrentLinkedQueue<InterfaceC1796310wqT> LJFF = new ConcurrentLinkedQueue<>();
    public final Map<String, C1792740wki> LJI = new HashMap();
    public final List<AbstractC1794600wni> LJII = Collections.synchronizedList(new ArrayList());
    public final GooglePaymentHandlerV2 LJIIIIZZ = GooglePaymentHandlerV2.LIZ;
    public Boolean LJIIJ = Boolean.FALSE;
    public final C1794800wo2 LJIIJJI = new InterfaceC1796310wqT() { // from class: X.0wo2
        @Override // X.InterfaceC1796310wqT
        public final void LIZIZ() {
            RestoreOrderService.getIns(((C1795210woh) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZ()).LIZ.LIZ);
            ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LJII().getClass();
        }

        @Override // X.InterfaceC1796310wqT
        public final void LIZ(C1792840wks c1792840wks) {
            this.LIZ.LJIILJJIL.onQueryFinished(EnumC1791830wjF.GOOGLE, null, null, "NOT_QUERY_mInitBillingSetUpListener_V2");
        }
    };
    public final C1795590wpJ LJIIL = new InterfaceC2200341B9s() { // from class: X.0wpJ
        @Override // X.InterfaceC2200341B9s
        public final void LIZ() {
            this.LIZ.LJIILL.set(false);
            this.LIZ.LIZ.set(false);
            this.LIZ.LIZ.set(false);
        }

        @Override // X.InterfaceC2200341B9s
        public final void LJ(C19885612rG c19885612rG) {
            this.LIZ.LJIILL.set(false);
            C1792840wks c1792840wksLIZ = C1795020woO.LIZ(c19885612rG);
            if (c19885612rG.LIZ == 0) {
                this.LIZ.LIZ.set(true);
                GoogleIapExternalService googleIapExternalService = PaymentServiceManager.get().getGoogleIapExternalService();
                this.LIZ.getClass();
                googleIapExternalService.setBillingVersionTracking("billing_success", C1527930prb.LIZ);
                while (!this.LIZ.LJFF.isEmpty()) {
                    InterfaceC1796310wqT interfaceC1796310wqTPoll = this.LIZ.LJFF.poll();
                    if (interfaceC1796310wqTPoll != null) {
                        interfaceC1796310wqTPoll.LIZIZ();
                    }
                }
                return;
            }
            this.LIZ.LIZ.set(false);
            GoogleIapExternalService googleIapExternalService2 = PaymentServiceManager.get().getGoogleIapExternalService();
            this.LIZ.getClass();
            googleIapExternalService2.setBillingVersionTracking("billing_unavailable", C1527930prb.LIZ);
            while (!this.LIZ.LJFF.isEmpty()) {
                InterfaceC1796310wqT interfaceC1796310wqTPoll2 = this.LIZ.LJFF.poll();
                if (interfaceC1796310wqTPoll2 != null) {
                    interfaceC1796310wqTPoll2.LIZ(c1792840wksLIZ);
                }
            }
        }
    };
    public final AtomicBoolean LJIILL = new AtomicBoolean(false);

    public static InterfaceC1795240wok LJI() {
        if (LJIJ == null) {
            synchronized (C1795340wou.class) {
                try {
                    if (LJIJ == null) {
                        LJIJ = new C1795340wou();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJIJ;
    }

    public final String LJ() {
        C1BAY c1bay;
        ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZLLL().getClass();
        if (!C1795410wp1.LIZ("class_name") || (c1bay = this.LJIILIIL) == null) {
            return null;
        }
        return c1bay.getClass().getSimpleName();
    }

    public static void LJIIL(C1792840wks c1792840wks) {
        ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZLLL();
        if (C1795410wp1.LJFF()) {
            C1792050wjb.LIZ(c1792840wks);
        }
    }

    public final void LIZ(InterfaceC1796310wqT interfaceC1796310wqT) {
        if (this.LJIIJ.booleanValue()) {
            interfaceC1796310wqT.LIZIZ();
            return;
        }
        if (this.LJIILL.get()) {
            this.LJFF.add(interfaceC1796310wqT);
            return;
        }
        if (this.LIZ.get()) {
            LJIIJ(false, null);
            interfaceC1796310wqT.LIZIZ();
            return;
        }
        this.LJFF.add(interfaceC1796310wqT);
        try {
            if (this.LJIILL.getAndSet(true)) {
                return;
            }
            this.LJIILIIL.LJIILIIL(this.LJIIL);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final C1792740wki LJII(String str) {
        C1792740wki c1792740wki = (C1792740wki) ((HashMap) this.LJI).get(str);
        if (c1792740wki != null) {
            return c1792740wki;
        }
        return (C1792740wki) ((LinkedHashMap) C1796020wq0.LIZ).get(str);
    }

    public final void LJIIJJI(List list) {
        this.LJ.addAll(list);
        ArrayList arrayList = (ArrayList) list;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((Purchase) it2.next()).toString();
        }
        arrayList.size();
    }

    public static List LIZIZ(Boolean bool, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            arrayList.add(new C1794710wnt((Purchase) it2.next(), bool.booleanValue()));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:271:0x050a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x04c9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009a  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.InterfaceC1796100wq8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(X.C19885612rG r18, java.util.List<com.android.billingclient.api.Purchase> r19) {
        /*
            Method dump skipped, instruction units count: 1406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1795340wou.LIZJ(X.12rG, java.util.List):void");
    }

    public final void LJIIJ(boolean z, final InterfaceC1796280wqQ interfaceC1796280wqQ) {
        if (this.LJIILIIL == null) {
            return;
        }
        if (z || this.LJIIIZ == null) {
            new C1796360wqY();
            this.LJIILIIL.LJ(new InterfaceC1796790wrF() { // from class: X.0wp2
                /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
                @Override // X.InterfaceC1796790wrF
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ(X.C19885612rG r7, X.C1796080wq6 r8) {
                    /*
                        r6 = this;
                        int r0 = r7.LIZ
                        if (r0 != 0) goto L58
                        X.0wou r0 = r6.LIZIZ
                        r0.LJIIIZ = r8
                        if (r8 == 0) goto L58
                        java.lang.String r1 = r8.LIZ
                    Lc:
                        X.0wqQ r0 = r2
                        if (r0 == 0) goto L13
                        r0.LIZ(r1)
                    L13:
                        X.0wns r0 = X.C1794700wns.LJ()
                        r0.getClass()
                        org.json.JSONObject r3 = new org.json.JSONObject
                        r3.<init>()
                        int r0 = r7.LIZ
                        if (r0 != 0) goto L2c
                        if (r8 == 0) goto L2c
                        java.lang.String r1 = "billing_country_code"
                        java.lang.String r0 = r8.LIZ
                        X.C1793980wmi.LIZIZ(r1, r0, r3)
                    L2c:
                        java.lang.String r2 = "result_code"
                        r0 = 199(0xc7, double:9.83E-322)
                        X.C1793980wmi.LIZ(r2, r0, r3)
                        int r0 = r7.LIZ
                        long r1 = (long) r0
                        java.lang.String r0 = "result_detail_code"
                        X.C1793980wmi.LIZ(r0, r1, r3)
                        java.lang.String r1 = "result_message"
                        java.lang.String r0 = r7.LIZJ
                        X.C1793980wmi.LIZIZ(r1, r0, r3)
                        X.0wgi r0 = X.C1794240wn8.LJIIIIZZ()
                        X.0wn8 r0 = (X.C1794240wn8) r0
                        X.0wnJ r0 = r0.LJ()
                        X.0wnH r1 = X.EnumC1794330wnH.BOTH
                        java.lang.String r2 = "livesdk_iap_get_store_region_result"
                        r4 = 0
                        X.0wnF r0 = (X.C1794310wnF) r0
                        r5 = r4
                        r0.LIZ(r1, r2, r3, r4, r5)
                        return
                    L58:
                        java.lang.String r1 = ""
                        goto Lc
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1795420wp2.LIZ(X.12rG, X.0wq6):void");
                }
            });
        }
    }

    public final void LJIIIIZZ(Activity activity, C1795840wpi c1795840wpi, InterfaceC1795750wpZ interfaceC1795750wpZ) {
        interfaceC1795750wpZ.LJIIJ();
        C19885612rG c19885612rGLJIIIZ = this.LJIILIIL.LJIIIZ(activity, c1795840wpi);
        if (c19885612rGLJIIIZ.LIZ == 0) {
            GooglePaymentHandlerV2 googlePaymentHandlerV2 = this.LJIIIIZZ;
            String str = c1795840wpi.LIZJ;
            googlePaymentHandlerV2.getClass();
            GooglePaymentHandlerV2.LJFF = interfaceC1795750wpZ;
            GooglePaymentHandlerV2.LJII = str;
            GooglePaymentHandlerV2 googlePaymentHandlerV22 = this.LJIIIIZZ;
            EnumC1794760wny enumC1794760wny = EnumC1794760wny.LAUNCH_CASHIER_API;
            googlePaymentHandlerV22.getClass();
            GooglePaymentHandlerV2.LIZ(enumC1794760wny);
        }
        interfaceC1795750wpZ.LJIIIIZZ(c1795840wpi, c19885612rGLJIIIZ);
    }

    public final C1795400wp0 LJFF(String str, C1794480wnW c1794480wnW, boolean z, InterfaceC1795750wpZ interfaceC1795750wpZ) {
        C1795900wpo c1795900wpoLIZ;
        C1792740wki c1792740wkiLJII = LJII(str);
        if (c1792740wkiLJII != null) {
            String str2 = c1794480wnW.LJI;
            C1795810wpf c1795810wpf = new C1795810wpf();
            c1795810wpf.LIZJ(c1792740wkiLJII);
            if (!z) {
                c1795900wpoLIZ = c1795810wpf.LIZ();
            } else if (str2.isEmpty()) {
                C1792840wks c1792840wksLIZIZ = C1795020woO.LIZIZ(2032, 2032, "empty offer token from Subscription");
                GooglePaymentHandlerV2 googlePaymentHandlerV2 = this.LJIIIIZZ;
                String strLJ = c1794480wnW.LJ();
                googlePaymentHandlerV2.getClass();
                GooglePaymentHandlerV2.LJFF = interfaceC1795750wpZ;
                GooglePaymentHandlerV2.LJII = strLJ;
                this.LJIIIIZZ.getClass();
                InterfaceC1795750wpZ interfaceC1795750wpZ2 = GooglePaymentHandlerV2.LJFF;
                if (interfaceC1795750wpZ2 != null) {
                    interfaceC1795750wpZ2.LJ(c1792840wksLIZIZ, null, null);
                }
                this.LJIIIIZZ.getClass();
                GooglePaymentHandlerV2.LIZ(EnumC1794760wny.PURCHASE_COMPLETED);
            } else {
                c1795810wpf.LIZIZ(str2);
                c1795900wpoLIZ = c1795810wpf.LIZ();
            }
            if (c1795900wpoLIZ != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(c1795900wpoLIZ);
                C1795400wp0 c1795400wp0 = new C1795400wp0();
                c1795400wp0.LIZJ = new ArrayList(arrayList);
                return c1795400wp0;
            }
        }
        return null;
    }

    public final void LJIIIZ(Activity activity, String str, boolean z, C1794480wnW c1794480wnW, InterfaceC1795750wpZ interfaceC1795750wpZ) {
        String str2;
        C1795400wp0 c1795400wp0LJFF = LJFF(str, c1794480wnW, z, interfaceC1795750wpZ);
        if (c1795400wp0LJFF != null) {
            C1795840wpi c1795840wpiLIZ = C1795010woN.LIZ(c1795400wp0LJFF, c1794480wnW);
            String strLJ = c1794480wnW.LJ();
            interfaceC1795750wpZ.LIZIZ(c1795840wpiLIZ);
            ((ConcurrentHashMap) this.LIZIZ).put(strLJ, interfaceC1795750wpZ);
            interfaceC1795750wpZ.LJII();
            LJIIIIZZ(activity, c1795840wpiLIZ, interfaceC1795750wpZ);
            return;
        }
        ArrayList arrayList = new ArrayList();
        C1795940wps c1795940wps = new C1795940wps();
        c1795940wps.LIZ = str;
        if (z) {
            str2 = "subs";
        } else {
            str2 = "inapp";
        }
        c1795940wps.LIZIZ = str2;
        arrayList.add(c1795940wps.LIZ());
        C1795630wpN c1795630wpN = new C1795630wpN();
        c1795630wpN.LIZIZ(arrayList);
        LIZLLL(activity, c1795630wpN.LIZ(), str, c1794480wnW, interfaceC1795750wpZ, 0, null);
    }

    public final void LIZLLL(Activity activity, C1796050wq3 c1796050wq3, String str, C1794480wnW c1794480wnW, InterfaceC1795750wpZ interfaceC1795750wpZ, int i, C19885612rG c19885612rG) {
        this.LJIILIIL.LJIIJJI(c1796050wq3, new C1795330wot(this, i, c19885612rG, c1794480wnW, activity, c1796050wq3, str, interfaceC1795750wpZ));
    }
}
