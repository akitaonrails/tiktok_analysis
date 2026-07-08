package X;

import Y.ARunnableS126S0100000_26;
import android.content.Context;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pipo.IPipoService;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.CashierKey;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.ab.PipoTTLSParamsCheckV2Settings;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.ab.PipoTtlsOspDirectCheckoutSettings;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.PIPOPaymentMethod;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.PIPOPaymentOptionArea;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.PIPOPaymentOptionHybridInfo;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.PIPOPaymentOptionSource;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.PaymentOptionLocalInfo;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.PaymentOptionLocalInstallmentInfo;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CBIInstallmentPlan;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CBIPaymentMethod;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CBIPaymentMethodDetail;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CashierBasicInfoData;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.PayRequestElement;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.PayRequestPaymentConsult;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.PayRequestPaymentDetailItem;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.PayRequestPaymentDetails;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.PayRequestPaymentMethod;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.PricingPlan;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.RawTextAndIcon;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.v3.CashierPaymentOptionInfoResp;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POActionMode;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POConfiguration;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PODaInfo;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PODisplayInfo;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POPayElement;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POPayInfo;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POPaymentMethodBaseInfo;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PriceAmount;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.richtext.PipoRichText;
import defpackage.Config;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uaZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1709570uaZ {
    public static final /* synthetic */ int LJJIIZI = 0;
    public PIPOPaymentOptionSource LIZ;
    public C1707990uY1 LIZIZ;
    public CashierPaymentOptionInfoResp.GlobalDisplayInfo LIZJ;
    public CashierPaymentOptionInfoResp.GlobalConfiguration LIZLLL;
    public PricingPlan LJ;
    public CashierBasicInfoData LJFF;
    public CashierPaymentOptionInfoResp LJI;
    public C1709570uaZ LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public final C1709570uaZ LJIIJ;
    public final List<PaymentOptionLocalInfo> LJIIJJI;
    public final List<PaymentOptionLocalInfo> LJIIL;
    public PIPOPaymentOptionSource LJIILIIL;
    public final List<InterfaceC1709390uaH> LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public final C1708990uZd LJIIZILJ;
    public C1157320gDq LJIJ;
    public Set<? extends EnumC586150Myr> LJIJI;
    public String LJIJJ;
    public String LJIJJLI;
    public String LJIL;
    public String LJJ;
    public boolean LJJI;
    public String LJJIFFI;
    public String LJJII;
    public String LJJIII;
    public final Set<String> LJJIIJ;
    public final List<InterfaceC835070WpN> LJJIIJZLJL;
    public AwS392S0200000_26 LJJIIZ;

    public final List<String> LJJJJZ() {
        return C13LQ.LJIJI(new String[]{this.LJJII, this.LJJIII});
    }

    public final String toString() {
        return "PIPOPaymentOptionsData";
    }

    public final Map<String, String> LIZ() {
        Object objLJ;
        PaymentOption paymentOptionLJ;
        String str;
        PriceAmount priceAmount;
        String str2;
        PaymentOption paymentOptionLJ2;
        String str3;
        String str4;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str5 = this.LJJIII;
        String str6 = "";
        String str7 = CardStruct.IStatusCode.DEFAULT;
        if (str5 != null && (paymentOptionLJ2 = this.LJIILIIL.LJ(str5)) != null) {
            PODaInfo pODaInfo = paymentOptionLJ2.trackInfo;
            if (pODaInfo == null || (str3 = pODaInfo.optionName) == null) {
                str3 = "";
            }
            linkedHashMap.put("payment_method", str3);
            linkedHashMap.put("is_saved", Intrinsics.LJFF(LJJIIJZLJL(paymentOptionLJ2.LIZ).storePaymentMethod, Boolean.TRUE) ? "1" : CardStruct.IStatusCode.DEFAULT);
            linkedHashMap.put("is_default_first", Intrinsics.LJFF(str5, this.LJIIIZ) ? "1" : CardStruct.IStatusCode.DEFAULT);
            linkedHashMap.put("is_default_second", CardStruct.IStatusCode.DEFAULT);
            String str8 = paymentOptionLJ2.parentKey;
            if (str8 != null && C123100dR.LIZ(str8) && Intrinsics.LJFF(str5, this.LJIIIZ)) {
                linkedHashMap.put("is_default_first", "1");
                linkedHashMap.put("is_default_second", "1");
            }
            PODaInfo pODaInfo2 = paymentOptionLJ2.trackInfo;
            if (pODaInfo2 != null && (str4 = pODaInfo2.bankCode) != null) {
                linkedHashMap.put("bank_code", str4);
            }
            String strLJIJJ = paymentOptionLJ2.LJIJJ();
            if (strLJIJJ != null) {
                linkedHashMap.put("payment_discount", strLJIJJ);
            }
        }
        Iterator it2 = ((ArrayList) C13LQ.LJIJI(new PaymentOption[]{LJJIJIIJI(), LJJIJ()})).iterator();
        while (true) {
            if (!it2.hasNext()) {
                objLJ = C2097608Jq.LJ();
                break;
            }
            CBIInstallmentPlan cBIInstallmentPlanLJJJJLL = LJJJJLL((PaymentOption) it2.next());
            if (cBIInstallmentPlanLJJJJLL != null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                Long l = cBIInstallmentPlanLJJJJLL.tenure;
                if (l != null) {
                    linkedHashMap2.put("tenure", String.valueOf(l.longValue()));
                }
                String str9 = cBIInstallmentPlanLJJJJLL.installmentPlanId;
                if (str9 != null && C123100dR.LIZ(str9)) {
                    linkedHashMap2.put("installment_plan_id", str9);
                }
                String str10 = cBIInstallmentPlanLJJJJLL.installmentOptionId;
                if (str10 != null && C123100dR.LIZ(str10)) {
                    linkedHashMap2.put("installment_option_id", str10);
                }
                String str11 = cBIInstallmentPlanLJJJJLL.displayRawName;
                if (str11 != null && C123100dR.LIZ(str11)) {
                    linkedHashMap2.put("installment_plan_name", str11);
                }
                linkedHashMap2.put("installment_plan_is_default", Intrinsics.LJFF(cBIInstallmentPlanLJJJJLL.isDefault, Boolean.TRUE) ? "1" : CardStruct.IStatusCode.DEFAULT);
                objLJ = linkedHashMap2;
            }
        }
        linkedHashMap.putAll(objLJ);
        String str12 = this.LJJII;
        if (str12 != null && (paymentOptionLJ = this.LJIILIIL.LJ(str12)) != null) {
            PODaInfo pODaInfo3 = paymentOptionLJ.trackInfo;
            if (pODaInfo3 == null || (str = pODaInfo3.optionName) == null) {
                str = "";
            }
            linkedHashMap.put("hybrid_payment_method", str);
            POPayInfo pOPayInfo = paymentOptionLJ.payInfo;
            if (pOPayInfo != null && (priceAmount = pOPayInfo.actualPaymentAmount) != null && (str2 = priceAmount.amount) != null) {
                str6 = str2;
            }
            linkedHashMap.put("credit_amount", str6);
            if (Intrinsics.LJFF(str12, this.LJIIIIZZ)) {
                linkedHashMap.put("is_default_hybrid", "1");
            } else {
                linkedHashMap.put("is_default_hybrid", CardStruct.IStatusCode.DEFAULT);
            }
            String strLJIJJ2 = paymentOptionLJ.LJIJJ();
            if (strLJIJJ2 != null) {
                linkedHashMap.put("payment_discount", strLJIJJ2);
            }
        }
        if (this.LJIILLIIL) {
            str7 = "1";
        }
        linkedHashMap.put("is_pay_info_complete", str7);
        return linkedHashMap;
    }

    public final String LJII() {
        String str;
        CashierPaymentOptionInfoResp.GlobalConfiguration globalConfiguration = this.LIZLLL;
        String str2 = null;
        if (globalConfiguration == null) {
            return null;
        }
        C1711340udQ c1711340udQ = C1711340udQ.LIZ;
        String str3 = globalConfiguration.paymentConsultId;
        PaymentOption paymentOptionLJJIJIIJI = LJJIJIIJI();
        if (paymentOptionLJJIJIIJI == null || (str = paymentOptionLJJIJIIJI.paymentUnitId) == null) {
            PaymentOption paymentOptionLJJIJ = LJJIJ();
            if (paymentOptionLJJIJ != null) {
                str2 = paymentOptionLJJIJ.paymentUnitId;
            }
        } else {
            str2 = str;
        }
        PayRequestPaymentConsult payRequestPaymentConsult = new PayRequestPaymentConsult(str3, str2, globalConfiguration.paymentParam);
        c1711340udQ.getClass();
        return C1711340udQ.LJ(payRequestPaymentConsult);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJIIJ() throws org.json.JSONException {
        /*
            r9 = this;
            java.lang.String r0 = r9.LJJIII
            r5 = 0
            if (r0 == 0) goto La
            com.ss.android.ugc.aweme.pipo.cashier.common.model.PaymentOptionLocalInfo r1 = r9.LJJIIJZLJL(r0)
            goto Lb
        La:
            r1 = r5
        Lb:
            java.lang.String r2 = com.ss.android.common.util.NetworkUtils.getUserAgent()     // Catch: java.lang.Throwable -> L1f
            if (r2 == 0) goto L1d
            boolean r0 = kotlin.text.a0.LJJJIL(r2)     // Catch: java.lang.Throwable -> L1f
            r0 = r0 ^ 1
            if (r0 == 0) goto L1d
        L19:
            X.C189200o6.m2constructorimpl(r2)     // Catch: java.lang.Throwable -> L1f
            goto L2b
        L1d:
            r2 = r5
            goto L19
        L1f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r2 = new X.00Yq
            r2.<init>(r0)
            X.C189200o6.m2constructorimpl(r2)
        L2b:
            boolean r0 = X.C189200o6.m7isFailureimpl(r2)
            if (r0 == 0) goto L32
            r2 = r5
        L32:
            if (r1 == 0) goto L5c
            java.lang.String r3 = r1.verifyRequestId
        L36:
            if (r1 == 0) goto L5a
            java.lang.String r4 = r1.pmDeviceData
        L3a:
            X.0uY1 r0 = r9.LIZIZ
            if (r0 == 0) goto L40
            java.lang.String r5 = r0.LJ
        L40:
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r6 = r0.toString()
            r7 = 0
            r8 = r7
            org.json.JSONObject r1 = X.C1708600uZ0.LIZ(r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L55
            java.lang.String r0 = "browser_user_agent"
            r1.put(r0, r2)
        L55:
            java.lang.String r0 = X.C786410Ut5.J3(r1)
            return r0
        L5a:
            r4 = r5
            goto L3a
        L5c:
            r3 = r5
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1709570uaZ.LJIIJ():java.lang.String");
    }

    public final Map<String, String> LJIIJJI() {
        PaymentOption paymentOptionLJ;
        String str;
        PaymentOption paymentOptionLJ2;
        String str2;
        String str3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str4 = this.LJJIII;
        if (str4 != null && (paymentOptionLJ2 = this.LJIILIIL.LJ(str4)) != null) {
            PODaInfo pODaInfo = paymentOptionLJ2.trackInfo;
            if (pODaInfo == null || (str2 = pODaInfo.optionName) == null) {
                str2 = "";
            }
            linkedHashMap.put("payment_method", str2);
            String strLJIL = paymentOptionLJ2.LJIL();
            if (strLJIL == null) {
                strLJIL = "";
            }
            linkedHashMap.put("payment_method_id", strLJIL);
            String strLJJ = paymentOptionLJ2.LJJ();
            if (strLJJ != null) {
                linkedHashMap.put("token", strLJJ);
            }
            PODaInfo pODaInfo2 = paymentOptionLJ2.trackInfo;
            if (pODaInfo2 != null && (str3 = pODaInfo2.bankCode) != null) {
                linkedHashMap.put("bank_code", str3);
            }
        }
        String str5 = this.LJJII;
        if (str5 != null && (paymentOptionLJ = this.LJIILIIL.LJ(str5)) != null) {
            PODaInfo pODaInfo3 = paymentOptionLJ.trackInfo;
            if (pODaInfo3 == null || (str = pODaInfo3.optionName) == null) {
                str = "";
            }
            linkedHashMap.put("hybrid_payment_method", str);
            String strLJIL2 = paymentOptionLJ.LJIL();
            linkedHashMap.put("hybrid_payment_method_id", strLJIL2 != null ? strLJIL2 : "");
            String strLJJ2 = paymentOptionLJ.LJJ();
            if (strLJJ2 != null) {
                linkedHashMap.put("hybrid_token", strLJJ2);
            }
        }
        return linkedHashMap;
    }

    public final C1709570uaZ LJIIZILJ() {
        C1709570uaZ c1709570uaZLJIJJ = LJIJJ(this, null, null, this, null, new ArrayList(), null, new ArrayList(), 67087359);
        c1709570uaZLJIJJ.LJJII = this.LJJII;
        c1709570uaZLJIJJ.LJJIII = this.LJJIII;
        return c1709570uaZLJIJJ;
    }

    public final RawTextAndIcon LJJIIZI() {
        CashierPaymentOptionInfoResp.GlobalDisplayInfo globalDisplayInfo = this.LIZJ;
        if (globalDisplayInfo != null) {
            return globalDisplayInfo.rawTextAndIcon;
        }
        return null;
    }

    public final PaymentOption LJJIJ() {
        String str = this.LJJII;
        if (str != null) {
            return this.LJIILIIL.LJ(str);
        }
        return null;
    }

    public final PaymentOption LJJIJIIJI() {
        String str = this.LJJIII;
        if (str != null) {
            return this.LJIILIIL.LJ(str);
        }
        return null;
    }

    public final List<PaymentOption> LJJIJIIJIL() {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = C13LQ.LJIJI(new String[]{this.LJJII, this.LJJIII}).iterator();
        while (it2.hasNext()) {
            PaymentOption paymentOptionLJ = this.LJIILIIL.LJ((String) it2.next());
            if (paymentOptionLJ != null) {
                arrayList.add(paymentOptionLJ);
            }
        }
        return arrayList;
    }

    public final void LJJJJ() {
        C1710110ubR.LJIIIIZZ("notify_source_changed", "post_listener_callback", "payment_option_source", null, LJJJJZI(), LJIJJLI(new Pair<>("listenerCount", Integer.valueOf(this.LJIILJJIL.size()))));
        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS126S0100000_26(this, 54));
    }

    public final void LJJJZ() {
        C1710110ubR.LJIIIIZZ("show_price_info_change_toast", "pricing_plan_changed", "price_info", null, LJJJJZI(), LJIJJLI(new Pair<>("listenerCount", Integer.valueOf(this.LJIILJJIL.size()))));
        Iterator<InterfaceC1709390uaH> it2 = this.LJIILJJIL.iterator();
        while (it2.hasNext()) {
            it2.next().pP1();
        }
    }

    public final String LJJLIIIIJ() {
        C1709550uaX c1709550uaX;
        C1709570uaZ c1709570uaZ = this.LJIIJ;
        if (c1709570uaZ == null) {
            c1709570uaZ = this;
        }
        String string = null;
        if (((ArrayList) c1709570uaZ.LJJJJZ()).isEmpty()) {
            c1709550uaX = null;
        } else {
            PIPOPaymentOptionSource pIPOPaymentOptionSourceLIZIZ = c1709570uaZ.LIZ.LIZIZ();
            List<PaymentOptionLocalInfo> list = c1709570uaZ.LJIIJJI;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<PaymentOptionLocalInfo> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().LIZIZ());
            }
            C1709570uaZ c1709570uaZLJIJJ = LJIJJ(c1709570uaZ, pIPOPaymentOptionSourceLIZIZ, null, null, new ArrayList(arrayList), new ArrayList(), c1709570uaZ.LJIILIIL.LIZIZ(), new ArrayList(), 54394894);
            c1709570uaZLJIJJ.LJJII = c1709570uaZ.LJJII;
            c1709570uaZLJIJJ.LJJIII = c1709570uaZ.LJJIII;
            c1709570uaZLJIJJ.LJJIIJ.clear();
            c1709550uaX = new C1709550uaX(c1709570uaZLJIJJ);
        }
        if (c1709550uaX != null) {
            synchronized (C1709530uaV.LIZ) {
                try {
                    string = UUID.randomUUID().toString();
                    C1709530uaV.LIZIZ = string;
                    C1709530uaV.LIZJ = c1709550uaX;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return string;
    }

    public final void LJJLIIIJJI() {
        PaymentOption paymentOptionLJ;
        String str = this.LJJII;
        boolean z = (str == null || (paymentOptionLJ = this.LJIILIIL.LJ(str)) == null || !paymentOptionLJ.LJIJ()) ? false : true;
        PIPOPaymentOptionSource pIPOPaymentOptionSource = this.LJIILIIL;
        Iterator it2 = C1697810uHb.LJIIJJI(pIPOPaymentOptionSource.recPOAreas, pIPOPaymentOptionSource.allPOAreas).iterator();
        while (it2.hasNext()) {
            for (PIPOPaymentOptionArea pIPOPaymentOptionArea : (List) it2.next()) {
                pIPOPaymentOptionArea.displayAmount = null;
                if (z) {
                    PaymentOption paymentOptionLIZJ = pIPOPaymentOptionArea.LIZJ(this.LJJII);
                    if (paymentOptionLIZJ != null) {
                        PIPOPaymentOptionHybridInfo pIPOPaymentOptionHybridInfo = paymentOptionLIZJ.LJ;
                        pIPOPaymentOptionArea.displayAmount = pIPOPaymentOptionHybridInfo != null ? pIPOPaymentOptionHybridInfo.displayAmount : null;
                    } else {
                        PaymentOption paymentOptionLIZJ2 = pIPOPaymentOptionArea.LIZJ(this.LJJIII);
                        if (paymentOptionLIZJ2 != null) {
                            PODisplayInfo.TextInfo textInfo = paymentOptionLIZJ2.displayInfo.textInfo;
                            pIPOPaymentOptionArea.displayAmount = textInfo != null ? textInfo.paymentAmountDisplayText : null;
                        } else {
                            pIPOPaymentOptionArea.displayAmount = pIPOPaymentOptionArea.defaultDisplayAmount;
                        }
                    }
                }
            }
        }
    }

    public final void LJJI() {
        CBIPaymentMethod cBIPaymentMethod;
        CBIPaymentMethodDetail cBIPaymentMethodDetailLIZ;
        Object next;
        while (true) {
            for (PaymentOption paymentOption : (ArrayList) LJJIJIIJIL()) {
                PIPOPaymentMethod pIPOPaymentMethod = paymentOption.legacyPM;
                Object obj = null;
                if (pIPOPaymentMethod != null && (cBIPaymentMethod = pIPOPaymentMethod.cbiPaymentMethod) != null && (cBIPaymentMethodDetailLIZ = cBIPaymentMethod.LIZ()) != null && cBIPaymentMethodDetailLIZ.installmentInfo != null) {
                    PaymentOptionLocalInfo paymentOptionLocalInfoLJJIIJZLJL = LJJIIJZLJL(paymentOption.LIZ);
                    List<CBIInstallmentPlan> listLJIILLIIL = paymentOption.LJIILLIIL();
                    ArrayList arrayList = new ArrayList();
                    for (CBIInstallmentPlan cBIInstallmentPlan : listLJIILLIIL) {
                        CBIInstallmentPlan cBIInstallmentPlan2 = cBIInstallmentPlan;
                        if (cBIInstallmentPlan2.tenure != null && cBIInstallmentPlan2.LIZ()) {
                            arrayList.add(cBIInstallmentPlan);
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        Long l = ((CBIInstallmentPlan) next).tenure;
                        PaymentOptionLocalInstallmentInfo paymentOptionLocalInstallmentInfo = paymentOptionLocalInfoLJJIIJZLJL.selectedInstallmentInfo;
                        if (Intrinsics.LJFF(l, paymentOptionLocalInstallmentInfo != null ? paymentOptionLocalInstallmentInfo.tenure : null)) {
                            break;
                        }
                    }
                    CBIInstallmentPlan cBIInstallmentPlan3 = (CBIInstallmentPlan) next;
                    if (cBIInstallmentPlan3 == null) {
                        Iterator it3 = arrayList.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            Object next2 = it3.next();
                            if (Intrinsics.LJFF(((CBIInstallmentPlan) next2).isDefault, Boolean.TRUE)) {
                                obj = next2;
                                break;
                            }
                        }
                        cBIInstallmentPlan3 = (CBIInstallmentPlan) obj;
                        if (cBIInstallmentPlan3 == null) {
                            cBIInstallmentPlan3 = (CBIInstallmentPlan) C13LP.LJJJLL(arrayList);
                        }
                    }
                    if (paymentOptionLocalInfoLJJIIJZLJL.LIZ(cBIInstallmentPlan3)) {
                        continue;
                    }
                }
                boolean z = z;
            }
            return;
        }
    }

    public final PricingPlan LJJIIZ() {
        PricingPlan pricingPlan;
        PricingPlan pricingPlan2;
        PaymentOption paymentOptionLJJIJIIJI = LJJIJIIJI();
        if (paymentOptionLJJIJIIJI != null && (pricingPlan2 = paymentOptionLJJIJIIJI.LIZIZ) != null) {
            return pricingPlan2;
        }
        PaymentOption paymentOptionLJJIJ = LJJIJ();
        return (paymentOptionLJJIJ == null || (pricingPlan = paymentOptionLJJIJ.LIZIZ) == null) ? this.LJ : pricingPlan;
    }

    public final PipoRichText LJJJJLI() {
        CBIInstallmentPlan cBIInstallmentPlanLJJJJLL;
        PipoRichText pipoRichText;
        String strLIZ;
        PaymentOption paymentOptionLJJIJIIJI = LJJIJIIJI();
        if (paymentOptionLJJIJIIJI == null) {
            paymentOptionLJJIJIIJI = LJJIJ();
        }
        if (paymentOptionLJJIJIIJI == null || (cBIInstallmentPlanLJJJJLL = LJJJJLL(paymentOptionLJJIJIIJI)) == null || (pipoRichText = cBIInstallmentPlanLJJJJLL.agreementInfo) == null || (strLIZ = C1711870ueH.LIZ(pipoRichText)) == null || a0.LJJJIL(strLIZ)) {
            return null;
        }
        return pipoRichText;
    }

    public final String LJJJJZI() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("source=");
        sbLIZ.append(C1710110ubR.LIZJ(this.LJIILIIL.key));
        sbLIZ.append(",hybrid=");
        sbLIZ.append(C1710110ubR.LIZJ(this.LJJII));
        sbLIZ.append(",other=");
        sbLIZ.append(C1710110ubR.LIZJ(this.LJJIII));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LJJJLL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("set is_binding_wallet_or_real_binding_ccdc: ");
        sbLIZ.append(true);
        LJJJ(C2188811AlT.LIZIZ(sbLIZ));
        C1709570uaZ c1709570uaZ = this.LJIIJ;
        if (c1709570uaZ == null) {
            c1709570uaZ = this;
        }
        c1709570uaZ.LJIILL = true;
    }

    public static Pair LJFF(PaymentOption paymentOption) {
        if (Intrinsics.LJFF(paymentOption.LJIL(), "pm_pi_ew_venmo_c_d")) {
            C1708470uYn c1708470uYn = C1708470uYn.LIZ;
            Context applicationContext = C1948707kD.LIZ().getApplicationContext();
            c1708470uYn.getClass();
            return new Pair(applicationContext.getString(2131857118), "VENMO_ERROR_DF_OPEN_FAIL");
        }
        return new Pair(C1948707kD.LIZ().getApplicationContext().getString(2131835079), "COMMON_ERROR_INVALID_CONTEXT");
    }

    public static Map LJIL(C1709570uaZ c1709570uaZ) {
        Map mapLJ = C2097608Jq.LJ();
        c1709570uaZ.getClass();
        C1711340udQ.LIZ.getClass();
        return C1709400uaI.LIZ(C1711340udQ.LIZJ(c1709570uaZ), mapLJ);
    }

    public static String LJJL(PIPOPaymentOptionSource pIPOPaymentOptionSource) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("source=");
        sbLIZ.append(C1710110ubR.LIZJ(pIPOPaymentOptionSource.key));
        sbLIZ.append(",pool=");
        sbLIZ.append(pIPOPaymentOptionSource.pool.size());
        sbLIZ.append(",rec=");
        sbLIZ.append(pIPOPaymentOptionSource.recPOAreas.size());
        sbLIZ.append(",all=");
        sbLIZ.append(pIPOPaymentOptionSource.allPOAreas.size());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LJIILIIL(PaymentOption paymentOption) {
        POConfiguration.CCDCBindType cCDCBindType;
        if (paymentOption == null) {
            return false;
        }
        String strLJIL = paymentOption.LJIL();
        if (!this.LJIJI.isEmpty() || !this.LJIIZILJ.LJIILL || this.LJIJ.LIZJ != EnumC994640bzS.NORMAL) {
            return false;
        }
        C1709570uaZ c1709570uaZ = this.LJIIJ;
        if (c1709570uaZ == null) {
            c1709570uaZ = this;
        }
        if (c1709570uaZ.LJIILL || !Intrinsics.LJFF(strLJIL, "pm_pi_ccdc_all")) {
            return false;
        }
        PipoTtlsOspDirectCheckoutSettings.Config config = PipoTtlsOspDirectCheckoutSettings.LIZ;
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PipoTtlsOspDirectCheckoutSettings.Config config2 = PipoTtlsOspDirectCheckoutSettings.LIZ;
        PipoTtlsOspDirectCheckoutSettings.Config config3 = (PipoTtlsOspDirectCheckoutSettings.Config) settingsManagerLIZLLL.LJIIIIZZ("pipo_ttls_osp_checkout_bind_to_pay_settings", PipoTtlsOspDirectCheckoutSettings.Config.class, config2);
        if (config3 != null) {
            config2 = config3;
        }
        List list = config2.pmIdList;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (true) {
            cCDCBindType = null;
            if (!it2.hasNext()) {
                break;
            }
            String str = (String) it2.next();
            if (str != null && (!a0.LJJJIL(str))) {
                arrayList.add(str);
            }
        }
        if (!C13LP.LLIIJI(arrayList).contains(strLJIL)) {
            return false;
        }
        POConfiguration pOConfiguration = paymentOption.config;
        if (pOConfiguration != null) {
            cCDCBindType = pOConfiguration.bindType;
        }
        if (cCDCBindType != POConfiguration.CCDCBindType.FAKE) {
            return false;
        }
        return true;
    }

    public final void LJIILL(Context context) {
        List<String> list;
        if (this.LJJI) {
            LJJLIIIJ(null, false, true);
            return;
        }
        List<PaymentOption> list2 = this.LIZ.pool;
        ArrayList<PaymentOption> arrayList = new ArrayList();
        for (PaymentOption paymentOption : list2) {
            C834520WoU c834520WoU = C834520WoU.LIZ;
            String strLJIL = paymentOption.LJIL();
            c834520WoU.getClass();
            if (C834520WoU.LJFF(strLJIL)) {
                arrayList.add(paymentOption);
            }
        }
        for (PaymentOption paymentOption2 : arrayList) {
            if (!paymentOption2.statusAttr.available || !Intrinsics.LJFF(this.LJIJJ, this.LJIL) || !Intrinsics.LJFF(this.LJIJJLI, this.LJJ)) {
                this.LJJIIZ = new AwS392S0200000_26(this, paymentOption2, 65);
                AwS392S0200000_26 awS392S0200000_26 = this.LJJIIZ;
                if (awS392S0200000_26 != null) {
                    C834520WoU c834520WoU2 = C834520WoU.LIZ;
                    POConfiguration pOConfiguration = paymentOption2.config;
                    if (pOConfiguration != null) {
                        list = pOConfiguration.supportNetworks;
                    } else {
                        list = null;
                    }
                    c834520WoU2.LJ(context, this);
                    C834520WoU.LJI = new WeakReference<>(awS392S0200000_26);
                    if (C834520WoU.LIZLLL != null) {
                        C834270Wo5.LIZJ(list);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0190  */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJ(boolean r25) {
        /*
            Method dump skipped, instruction units count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1709570uaZ.LJIJ(boolean):void");
    }

    public final List<PayRequestElement> LJIJI(List<POPayElement> list) {
        String strLIZ;
        String str;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (POPayElement pOPayElement : list) {
            if (Intrinsics.LJFF(pOPayElement.isEncrypted, Boolean.TRUE)) {
                C1709650uah c1709650uah = C1709720uao.LIZ;
                String str2 = pOPayElement.paramValue;
                CashierPaymentOptionInfoResp.GlobalConfiguration globalConfiguration = this.LIZLLL;
                if (globalConfiguration == null || (str = globalConfiguration.encodeKey) == null) {
                    str = "";
                }
                c1709650uah.getClass();
                strLIZ = C1709650uah.LIZ(str2, str);
            } else {
                strLIZ = pOPayElement.paramValue;
            }
            String str3 = pOPayElement.paramValue;
            if (str3 != null) {
                this.LJJIIJ.add(str3);
            }
            if (strLIZ != null) {
                this.LJJIIJ.add(strLIZ);
            }
            arrayList.add(new PayRequestElement(pOPayElement.id, pOPayElement.paramName, strLIZ, pOPayElement.isEncrypted));
        }
        return arrayList;
    }

    public final Map<String, Object> LJIJJLI(Pair<String, ? extends Object>... pairArr) {
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        C1711340udQ.LIZ.getClass();
        return C1709400uaI.LIZ(C1711340udQ.LIZJ(this), mapLJIIIIZZ);
    }

    public final void LJJ(EnumC586150Myr enumC586150Myr) {
        String strLJJLIIIJ = C13LP.LJJLIIIJ(this.LJIJI, ",", null, null, 0, null, AFwS268S0000000_26.get$arr$(437), 30);
        Set<? extends EnumC586150Myr> setLJIIIIZZ = C15442062u.LJIIIIZZ(enumC586150Myr, this.LJIJI);
        this.LJIJI = setLJIIIIZZ;
        String strLJJLIIIJ2 = C13LP.LJJLIIIJ(setLJIIIIZZ, ",", null, null, 0, null, AFwS268S0000000_26.get$arr$(436), 30);
        if (!Intrinsics.LJFF(strLJJLIIIJ, strLJJLIIIJ2)) {
            String strName = enumC586150Myr.name();
            String str = "empty";
            if (a0.LJJJIL(strLJJLIIIJ)) {
                strLJJLIIIJ = "empty";
            }
            if (!a0.LJJJIL(strLJJLIIIJ2)) {
                str = strLJJLIIIJ2;
            }
            C1710110ubR.LJIIIIZZ("disable_direct_checkout", strName, "direct_checkout_disabled_reasons", strLJJLIIIJ, str, LJIL(this));
        }
    }

    public final InterfaceC835070WpN LJJIFFI(PaymentOption paymentOption) {
        InterfaceC835070WpN next;
        Iterator<InterfaceC835070WpN> it2 = this.LJJIIJZLJL.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LIZJ(paymentOption)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }

    public final PaymentOption LJJII(boolean z) {
        Object obj;
        Object obj2;
        Iterator<PaymentOption> it2 = this.LJIILIIL.pool.iterator();
        while (true) {
            obj = null;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            POConfiguration pOConfiguration = ((PaymentOption) next).config;
            if (pOConfiguration != null) {
                obj = pOConfiguration.actionMode;
            }
            if (z) {
                obj2 = POActionMode.JUMP_TO_CCDC_PAGE;
            } else {
                obj2 = POActionMode.JUMP_TO_CCI_PAGE;
            }
            if (obj == obj2) {
                obj = next;
                break;
            }
        }
        return (PaymentOption) obj;
    }

    public final PaymentOptionLocalInfo LJJIIJ(String str) {
        PaymentOptionLocalInfo next;
        Iterator<PaymentOptionLocalInfo> it2 = this.LJIIJJI.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.poKey, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        PaymentOptionLocalInfo paymentOptionLocalInfo = next;
        if (paymentOptionLocalInfo == null) {
            PaymentOptionLocalInfo paymentOptionLocalInfo2 = new PaymentOptionLocalInfo(str, false, null, 0L, null, null, null, null, null, null);
            this.LJIIJJI.add(paymentOptionLocalInfo2);
            return paymentOptionLocalInfo2;
        }
        return paymentOptionLocalInfo;
    }

    public final PaymentOptionLocalInfo LJJIIJZLJL(String str) {
        PaymentOptionLocalInfo next;
        if (this.LJIIJ != null) {
            Iterator<PaymentOptionLocalInfo> it2 = this.LJIIL.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.poKey, str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            PaymentOptionLocalInfo paymentOptionLocalInfo = next;
            if (paymentOptionLocalInfo == null) {
                PaymentOptionLocalInfo paymentOptionLocalInfoLIZIZ = LJJIIJ(str).LIZIZ();
                this.LJIIL.add(paymentOptionLocalInfoLIZIZ);
                return paymentOptionLocalInfoLIZIZ;
            }
            return paymentOptionLocalInfo;
        }
        return LJJIIJ(str);
    }

    public final boolean LJJIZ(PaymentOption paymentOption) {
        if (paymentOption == null) {
            return false;
        }
        List listLJIJI = C13LQ.LJIJI(new String[]{this.LJJII, this.LJJIII});
        if (listLJIJI.isEmpty()) {
            return false;
        }
        for (Object obj : listLJIJI) {
            if (!Intrinsics.LJFF(obj, paymentOption.LIZ)) {
                List<PaymentOption> list = paymentOption.LIZLLL;
                if (list != null && !list.isEmpty()) {
                    Iterator<PaymentOption> it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (Intrinsics.LJFF(it2.next().LIZ, obj)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void LJJJ(String str) {
        C1708720uZC c1708720uZCLIZ = C1708710uZB.LIZ("Cashier");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(", data is: ");
        C1711340udQ.LIZ.getClass();
        sbLIZ.append(C1711340udQ.LIZJ(this));
        c1708720uZCLIZ.LIZ(4, C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJJJI(String str) throws JSONException {
        String strLIZ = PipoTTLSParamsCheckV2Settings.LIZ("place_order");
        if (strLIZ != null && C123100dR.LIZ(strLIZ)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("order_create_info", new JSONObject(str));
            CashierBasicInfoData cashierBasicInfoData = this.LJFF;
            if (cashierBasicInfoData != null) {
                C1227904rF.LIZ.getClass();
                String strLJI = C1227904rF.LJI(cashierBasicInfoData);
                if (strLJI != null) {
                    jSONObject.put("cbi_pay_info", new JSONObject(strLJI));
                }
            }
            ((IPipoService) ServiceManager.get().getService(IPipoService.class)).LJIILL("pipo_ttls_cashier", strLIZ, "", jSONObject, C13LP.LLIIII(this.LJJIIJ), null);
        }
    }

    public final void LJJJIL(String str) {
        C1710110ubR.LJIIIIZZ("notify_selected_payment_info_changed", str, "selected_payment_info", null, LJJJJZI(), LJIJJLI(new Pair<>("listenerCount", Integer.valueOf(this.LJIILJJIL.size()))));
        Iterator<InterfaceC1709390uaH> it2 = this.LJIILJJIL.iterator();
        while (it2.hasNext()) {
            it2.next().c3();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r3.LJIILJJIL.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJJ(X.InterfaceC1709390uaH r4) {
        /*
            r3 = this;
            java.util.List<X.0uaH> r0 = r3.LJIILJJIL
            java.util.Iterator r2 = r0.iterator()
        L6:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r1 = r2.next()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r4)
            if (r0 == 0) goto L6
            if (r1 != 0) goto L1d
        L18:
            java.util.List<X.0uaH> r0 = r3.LJIILJJIL
            r0.add(r4)
        L1d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1709570uaZ.LJJJJJ(X.0uaH):void");
    }

    public final void LJJJJJL(PaymentOption paymentOption) {
        PaymentOption paymentOptionLJ;
        PaymentOption next;
        String str = paymentOption.parentKey;
        if (str != null && (paymentOptionLJ = this.LJIILIIL.LJ(str)) != null) {
            List<PaymentOption> list = paymentOptionLJ.LIZLLL;
            if (list != null) {
                Iterator<PaymentOption> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (LJJIIJZLJL(next.LIZ).isPreselected) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                PaymentOption paymentOption2 = next;
                if (paymentOption2 != null) {
                    LJJIIJZLJL(paymentOption2.LIZ).isPreselected = false;
                }
            }
            LJJIIJZLJL(paymentOption.LIZ).isPreselected = true;
        }
    }

    public final CBIInstallmentPlan LJJJJLL(PaymentOption paymentOption) {
        Long l;
        PaymentOptionLocalInstallmentInfo paymentOptionLocalInstallmentInfo = LJJIIJZLJL(paymentOption.LIZ).selectedInstallmentInfo;
        CBIInstallmentPlan cBIInstallmentPlan = null;
        if (paymentOptionLocalInstallmentInfo == null || (l = paymentOptionLocalInstallmentInfo.tenure) == null) {
            return null;
        }
        long jLongValue = l.longValue();
        Iterator<CBIInstallmentPlan> it2 = paymentOption.LJIILLIIL().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            CBIInstallmentPlan next = it2.next();
            Long l2 = next.tenure;
            if (l2 != null && l2.longValue() == jLongValue) {
                cBIInstallmentPlan = next;
                break;
            }
        }
        return cBIInstallmentPlan;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C335850DEp LJIILLIIL(android.content.Context r20, X.C1710390ubt r21) {
        /*
            Method dump skipped, instruction units count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1709570uaZ.LJIILLIIL(android.content.Context, X.0ubt):X.0DEp");
    }

    public final List<POPayElement> LJJIII(PaymentOption paymentOption, boolean z) {
        List<POPayElement> list;
        InterfaceC835070WpN interfaceC835070WpNLJJIFFI = LJJIFFI(paymentOption);
        if (interfaceC835070WpNLJJIFFI == null || !z || !interfaceC835070WpNLJJIFFI.LIZ() || (list = LJJIIJZLJL(paymentOption.LIZ).asyncPaymentElements) == null || !(!list.isEmpty())) {
            return null;
        }
        return list;
    }

    public final void LJJIJIL(PIPOPaymentOptionSource pIPOPaymentOptionSource, Set<String> set) {
        PIPOPaymentOptionSource pIPOPaymentOptionSource2;
        String str;
        String str2;
        if (!set.add(pIPOPaymentOptionSource.key)) {
            return;
        }
        for (PaymentOption paymentOption : pIPOPaymentOptionSource.pool) {
            C1709610uad c1709610uad = paymentOption.LJII;
            if (c1709610uad != null) {
                PaymentOption paymentOption2 = c1709610uad.LIZIZ;
                if (paymentOption2 != null && (str2 = paymentOption2.LIZ) != null) {
                    LJJJLZIJ(str2, true);
                }
                PaymentOption paymentOption3 = c1709610uad.LIZJ;
                if (paymentOption3 != null && (str = paymentOption3.LIZ) != null) {
                    LJJJLZIJ(str, false);
                }
            }
            PIPOPaymentOptionHybridInfo pIPOPaymentOptionHybridInfo = paymentOption.LJ;
            if (pIPOPaymentOptionHybridInfo != null && (pIPOPaymentOptionSource2 = pIPOPaymentOptionHybridInfo.source) != null) {
                LJJIJIL(pIPOPaymentOptionSource2, set);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        r2 = X.C2188811AlT.LIZ();
        r2.append("recordLocalAddedToRecPO, ");
        r2.append(" add to local rec: ");
        r1 = X.C1709720uao.LIZ;
        r0 = r5.LIZ;
        r1.getClass();
        r2.append(X.C1709650uah.LIZJ(r0));
        LJJJ(X.C2188811AlT.LIZIZ(r2));
        r4.localAddedToRecPOs.add(r5.LIZ);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJI(com.ss.android.ugc.aweme.pipo.cashier.common.model.PIPOPaymentOptionSource r4, com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption r5) {
        /*
            r3 = this;
            X.07tZ r1 = r5.LJI
            X.07tZ r0 = X.EnumC2006707tZ.CCDC_ADD_LOCAL
            if (r1 == r0) goto L4a
            java.util.List<java.lang.String> r0 = r4.localAddedToRecPOs
            java.util.Iterator r2 = r0.iterator()
        Lc:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L20
            java.lang.Object r1 = r2.next()
            java.lang.String r0 = r5.LIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto Lc
            if (r1 != 0) goto L4a
        L20:
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "recordLocalAddedToRecPO, "
            r2.append(r0)
            java.lang.String r0 = " add to local rec: "
            r2.append(r0)
            X.0uah r1 = X.C1709720uao.LIZ
            java.lang.String r0 = r5.LIZ
            r1.getClass()
            java.lang.String r0 = X.C1709650uah.LIZJ(r0)
            r2.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r2)
            r3.LJJJ(r0)
            java.util.List<java.lang.String> r1 = r4.localAddedToRecPOs
            java.lang.String r0 = r5.LIZ
            r1.add(r0)
        L4a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1709570uaZ.LJJJJI(com.ss.android.ugc.aweme.pipo.cashier.common.model.PIPOPaymentOptionSource, com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v5, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    public final void LJJJJL(PIPOPaymentOptionSource pIPOPaymentOptionSource, boolean z) {
        PIPOPaymentOptionHybridInfo pIPOPaymentOptionHybridInfo;
        PIPOPaymentOptionSource pIPOPaymentOptionSource2;
        T next;
        if (z) {
            this.LJJII = null;
        }
        this.LJJIII = null;
        PaymentOption paymentOption = null;
        for (PIPOPaymentOptionArea pIPOPaymentOptionArea : pIPOPaymentOptionSource.allPOAreas) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(pIPOPaymentOptionArea.paymentOptions);
            List<PaymentOption> list = pIPOPaymentOptionArea.paymentOptions;
            ArrayList arrayList2 = new ArrayList();
            for (PaymentOption paymentOption2 : list) {
                if (paymentOption2.LIZLLL != null && (!r0.isEmpty())) {
                    arrayList2.add(paymentOption2);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                List<PaymentOption> list2 = ((PaymentOption) it2.next()).LIZLLL;
                if (list2 != null) {
                    arrayList.addAll(list2);
                }
            }
            C259800zU c259800zU = new C259800zU();
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next = it3.next();
                    PaymentOption paymentOption3 = (PaymentOption) next;
                    if (Intrinsics.LJFF(paymentOption3.statusAttr.isDefault, Boolean.TRUE) && paymentOption3.LIZIZ(this)) {
                        break;
                    }
                } else {
                    next = 0;
                    break;
                }
            }
            c259800zU.element = next;
            if (this.LJIIZILJ.LJII) {
                Iterator it4 = arrayList.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    ?? next2 = it4.next();
                    PaymentOption paymentOption4 = (PaymentOption) next2;
                    if (Intrinsics.LJFF(paymentOption4.statusAttr.isPrimary, Boolean.TRUE) && paymentOption4.LIZIZ(this)) {
                        if (next2 != 0) {
                            c259800zU.element = next2;
                        }
                    }
                }
            }
            PaymentOption paymentOption5 = (PaymentOption) c259800zU.element;
            if (paymentOption5 != null) {
                if (!paymentOption5.LJIJ() && !paymentOption5.LJIIZILJ()) {
                    StringBuilder sb = new StringBuilder("select pd default,  select pd other po: ");
                    C1709650uah c1709650uah = C1709720uao.LIZ;
                    String str = paymentOption5.LIZ;
                    c1709650uah.getClass();
                    sb.append(C1709650uah.LIZJ(str));
                    LJJJ(sb.toString());
                    String str2 = paymentOption5.LIZ;
                    this.LJJIII = str2;
                    this.LJIIIZ = str2;
                } else if (z) {
                    StringBuilder sb2 = new StringBuilder("select pd default,  select pd hybrid po: ");
                    C1709650uah c1709650uah2 = C1709720uao.LIZ;
                    String str3 = paymentOption5.LIZ;
                    c1709650uah2.getClass();
                    sb2.append(C1709650uah.LIZJ(str3));
                    LJJJ(sb2.toString());
                    String str4 = paymentOption5.LIZ;
                    this.LJJII = str4;
                    this.LJIIIIZZ = str4;
                    paymentOption = paymentOption5;
                }
            }
        }
        if (z && paymentOption != null && paymentOption.LJIJ() && (pIPOPaymentOptionHybridInfo = paymentOption.LJ) != null && (pIPOPaymentOptionSource2 = pIPOPaymentOptionHybridInfo.source) != null) {
            LJJJJL(pIPOPaymentOptionSource2, false);
        }
    }

    public final void LJJJLIIL(long j, String str) {
        PaymentOptionLocalInfo paymentOptionLocalInfoLJJIIJZLJL;
        PaymentOption paymentOptionLJ = this.LJIILIIL.LJ(str);
        if (paymentOptionLJ != null) {
            LJJIIJZLJL(paymentOptionLJ.LIZ).addedToRecTS = j;
            PaymentOption paymentOptionLIZLLL = this.LJIILIIL.LIZLLL(paymentOptionLJ.LIZ);
            if (paymentOptionLIZLLL != null && (paymentOptionLocalInfoLJJIIJZLJL = LJJIIJZLJL(paymentOptionLIZLLL.LIZ)) != null) {
                paymentOptionLocalInfoLJJIIJZLJL.addedToRecTS = j;
            }
        }
    }

    public final void LJJJLZIJ(String str, boolean z) {
        String string;
        if (str.length() == 0) {
            return;
        }
        PaymentOptionLocalInfo paymentOptionLocalInfoLJJIIJZLJL = LJJIIJZLJL(str);
        Boolean bool = paymentOptionLocalInfoLJJIIJZLJL.storePaymentMethod;
        if (Intrinsics.LJFF(bool, Boolean.valueOf(z))) {
            return;
        }
        paymentOptionLocalInfoLJJIIJZLJL.storePaymentMethod = Boolean.valueOf(z);
        if (bool != null) {
            string = bool.toString();
        } else {
            string = null;
        }
        C1710110ubR.LJIIIIZZ("init_checkbox_store_payment_method", "po_checkbox_info", "store_payment_method", string, String.valueOf(z), LJIJJLI(new Pair<>("poKey", C1710110ubR.LIZJ(str))));
    }

    public static String LIZJ(PaymentOption paymentOption, String str, String str2) {
        String str3;
        String str4;
        String strLJIJJ;
        PODaInfo pODaInfo;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str2 == null) {
            str2 = "order_submit";
        }
        linkedHashMap.put("page_name", str2);
        if (paymentOption == null || (pODaInfo = paymentOption.trackInfo) == null || (str3 = pODaInfo.optionName) == null) {
            str3 = "";
        }
        linkedHashMap.put("option_name", str3);
        if (str == null) {
            str4 = "";
        } else {
            str4 = str;
        }
        linkedHashMap.put("pay_request_id", str4);
        if (paymentOption == null || (strLJIJJ = paymentOption.LJIJJ()) == null) {
            strLJIJJ = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("payment_discount", strLJIJJ);
        Map<String, String> map = C1708610uZ1.LIZ.get(str);
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("universal_cashier_type", C1709000uZe.LIZ.LIZLLL);
        C1227904rF.LIZ.getClass();
        String strLJI = C1227904rF.LJI(linkedHashMap);
        if (strLJI == null) {
            return "";
        }
        return strLJI;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bb A[PHI: r5
      0x00bb: PHI (r5v7 java.lang.String) = (r5v4 java.lang.String), (r5v8 java.lang.String) binds: [B:81:0x00ea, B:66:0x00b9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ed A[PHI: r5
      0x00ed: PHI (r5v5 java.lang.String) = (r5v4 java.lang.String), (r5v7 java.lang.String), (r5v7 java.lang.String) binds: [B:81:0x00ea, B:68:0x00bd, B:70:0x00c5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1193620hAO LIZIZ(android.content.Context r20, X.C1710390ubt r21, boolean r22) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1709570uaZ.LIZIZ(android.content.Context, X.0ubt, boolean):X.0hAO");
    }

    public final PayRequestPaymentDetailItem LIZLLL(PaymentOption paymentOption, PIPOPaymentMethod pIPOPaymentMethod, List<PayRequestElement> list) {
        String str;
        Long l;
        String str2;
        CBIInstallmentPlan cBIInstallmentPlanLJJJJLL = LJJJJLL(paymentOption);
        PIPOPaymentOptionHybridInfo pIPOPaymentOptionHybridInfo = pIPOPaymentMethod.hybridInfo;
        if (pIPOPaymentOptionHybridInfo == null || (str = pIPOPaymentOptionHybridInfo.amount) == null) {
            str = pIPOPaymentMethod.paymentAmount;
        }
        String str3 = pIPOPaymentMethod.id;
        String str4 = pIPOPaymentMethod.token;
        String str5 = pIPOPaymentMethod.methodType;
        String str6 = pIPOPaymentMethod.rawCBIPaymentMethod;
        String str7 = null;
        if (cBIInstallmentPlanLJJJJLL != null) {
            l = cBIInstallmentPlanLJJJJLL.tenure;
            str2 = cBIInstallmentPlanLJJJJLL.installmentPlanId;
            str7 = cBIInstallmentPlanLJJJJLL.installmentOptionId;
        } else {
            l = null;
            str2 = null;
        }
        return new PayRequestPaymentDetailItem(str, new PayRequestPaymentMethod(str3, str4, str5, str6, str3, "PAYIN", list, null, null, l, str2, str7));
    }

    public final PayRequestPaymentDetailItem LJIIIIZZ(PaymentOption paymentOption, boolean z, List<POPayElement> list) {
        PODaInfo pODaInfo;
        PIPOPaymentMethod pIPOPaymentMethod;
        String str;
        String strLJIJJLI = paymentOption.LJIJJLI();
        String strLJIL = paymentOption.LJIL();
        String strLJJ = paymentOption.LJJ();
        POPaymentMethodBaseInfo pOPaymentMethodBaseInfo = paymentOption.paymentMethodBaseInfo;
        List<PayRequestElement> listLJIJI = null;
        if ((pOPaymentMethodBaseInfo == null || (str = pOPaymentMethodBaseInfo.paymentMethodV2) == null) && (((pODaInfo = paymentOption.trackInfo) == null || (str = pODaInfo.optionName) == null) && ((pIPOPaymentMethod = paymentOption.legacyPM) == null || (str = pIPOPaymentMethod.rawCBIPaymentMethod) == null))) {
            str = paymentOption.displayInfo.name;
        }
        String strLJIL2 = paymentOption.LJIL();
        POConfiguration pOConfiguration = paymentOption.config;
        if (pOConfiguration != null && Intrinsics.LJFF(pOConfiguration.pciSensitive, Boolean.TRUE) && !z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("build payment option pay elements, skip pay elements for pci_sensitive po: ");
            sbLIZ.append(paymentOption.LIZ);
            LJJJ(C2188811AlT.LIZIZ(sbLIZ));
        } else {
            PaymentOptionLocalInfo paymentOptionLocalInfoLJJIIJZLJL = LJJIIJZLJL(paymentOption.LIZ);
            ArrayList arrayList = new ArrayList();
            List<POPayElement> list2 = paymentOptionLocalInfoLJJIIJZLJL.localPaymentElements;
            if (list2 != null) {
                arrayList.addAll(list2);
            }
            if (list != null) {
                arrayList.addAll(list);
            }
            if (!arrayList.isEmpty()) {
                listLJIJI = LJIJI(arrayList);
            }
        }
        return new PayRequestPaymentDetailItem(strLJIJJLI, new PayRequestPaymentMethod(strLJIL, strLJJ, null, str, strLJIL2, "PAYIN", listLJIJI, paymentOption.id, paymentOption.paymentUnitId, null, null, null));
    }

    public final void LJIIL(InterfaceC835070WpN interfaceC835070WpN, PaymentOption paymentOption, List<POPayElement> list) {
        if (interfaceC835070WpN.LIZ() && list != null && !list.isEmpty()) {
            LJJIIJZLJL(paymentOption.LIZ).asyncPaymentElements = list;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIILJJIL(java.lang.String r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1709570uaZ.LJIILJJIL(java.lang.String, boolean, boolean):boolean");
    }

    public final void LJJIJL(PIPOPaymentOptionSource pIPOPaymentOptionSource, PaymentOption paymentOption, PIPOPaymentOptionArea pIPOPaymentOptionArea) {
        PaymentOption paymentOptionLIZLLL = pIPOPaymentOptionSource.LIZLLL(paymentOption.LIZ);
        if (paymentOptionLIZLLL != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("insertPOToArea, ");
            sbLIZ.append(", Insert parent for po: ");
            C1709650uah c1709650uah = C1709720uao.LIZ;
            String str = paymentOption.LIZ;
            c1709650uah.getClass();
            sbLIZ.append(C1709650uah.LIZJ(str));
            LJJJ(C2188811AlT.LIZIZ(sbLIZ));
            if (LJJIJLIJ(true, this.LJIJ.LIZJ, paymentOptionLIZLLL, pIPOPaymentOptionArea.paymentOptions)) {
                LJJJJI(pIPOPaymentOptionSource, paymentOptionLIZLLL);
                return;
            }
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("insertPOToArea, ");
        sbLIZ2.append(", Insert self for po: ");
        C1709650uah c1709650uah2 = C1709720uao.LIZ;
        String str2 = paymentOption.LIZ;
        c1709650uah2.getClass();
        sbLIZ2.append(C1709650uah.LIZJ(str2));
        LJJJ(C2188811AlT.LIZIZ(sbLIZ2));
        if (!LJJIJLIJ(true, this.LJIJ.LIZJ, paymentOption, pIPOPaymentOptionArea.paymentOptions)) {
            return;
        }
        LJJJJI(pIPOPaymentOptionSource, paymentOption);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJIZL(android.content.Context r16, boolean r17, X.C1709570uaZ r18) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1709570uaZ.LJJJJIZL(android.content.Context, boolean, X.0uaZ):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x024e  */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List<com.ss.android.ugc.aweme.pipo.cashier.common.model.PIPOPaymentOptionArea>] */
    /* JADX WARN: Type inference failed for: r4v22, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List<com.ss.android.ugc.aweme.pipo.cashier.common.model.PIPOPaymentOptionArea>] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLI(com.ss.android.ugc.aweme.pipo.cashier.common.model.PIPOPaymentOptionSource r26, boolean r27, java.lang.String r28) {
        /*
            Method dump skipped, instruction units count: 1282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1709570uaZ.LJJLI(com.ss.android.ugc.aweme.pipo.cashier.common.model.PIPOPaymentOptionSource, boolean, java.lang.String):void");
    }

    public final void LJJLIIIJ(String str, boolean z, boolean z2) {
        String str2;
        PIPOPaymentOptionSource pIPOPaymentOptionSource;
        PIPOPaymentOptionSource pIPOPaymentOptionSource2 = this.LIZ;
        String str3 = this.LJJIFFI;
        C1711340udQ.LIZ.getClass();
        boolean zLJI = pIPOPaymentOptionSource2.LJI(str3, str, C1711340udQ.LIZJ(this), z, z2, true);
        PIPOPaymentOptionSource pIPOPaymentOptionSource3 = this.LJIILIIL;
        if (pIPOPaymentOptionSource3 != this.LIZ && pIPOPaymentOptionSource3.LJI(this.LJJIFFI, str, C1711340udQ.LIZJ(this), z, z2, false)) {
            zLJI = true;
        }
        Iterator<PaymentOption> it2 = this.LIZ.pool.iterator();
        while (it2.hasNext()) {
            PIPOPaymentOptionHybridInfo pIPOPaymentOptionHybridInfo = it2.next().LJ;
            if (pIPOPaymentOptionHybridInfo != null && (pIPOPaymentOptionSource = pIPOPaymentOptionHybridInfo.source) != null) {
                String str4 = this.LJJIFFI;
                C1711340udQ.LIZ.getClass();
                if (pIPOPaymentOptionSource.LJI(str4, str, C1711340udQ.LIZJ(this), z, z2, true)) {
                    zLJI = true;
                }
            }
        }
        if (zLJI) {
            if (z2) {
                str2 = "force_filter";
            } else {
                str2 = "google_pay_ready_check";
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("changed=");
            sbLIZ.append(zLJI);
            sbLIZ.append(",available=");
            sbLIZ.append(z);
            C1710110ubR.LJIIIIZZ("update_google_pay_available_state", str2, "google_pay_available_state", null, C2188811AlT.LIZIZ(sbLIZ), LJIJJLI(new Pair<>("poKey", C1710110ubR.LIZJ(str)), new Pair<>("forceFilter", Boolean.valueOf(z2)), new Pair<>("currentSource", LJJL(this.LJIILIIL))));
            LJJJJ();
        }
    }

    public final void LJJLIIIJILLIZJL(String str, String str2, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("gateway=");
        String str3 = this.LJIJJ;
        if (str3 != null && !a0.LJJJIL(str3)) {
            z2 = false;
        } else {
            z2 = true;
        }
        sbLIZ.append(!z2);
        sbLIZ.append(",merchant=");
        String str4 = this.LJIJJLI;
        if (str4 != null && !a0.LJJJIL(str4)) {
            z3 = false;
        } else {
            z3 = true;
        }
        sbLIZ.append(!z3);
        sbLIZ.append(",forceFilter=");
        sbLIZ.append(this.LJJI);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        this.LJIJJ = str;
        this.LJIJJLI = str2;
        this.LJJI = z;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("gateway=");
        String str5 = this.LJIJJ;
        if (str5 != null && !a0.LJJJIL(str5)) {
            z4 = false;
        } else {
            z4 = true;
        }
        sbLIZ2.append(!z4);
        sbLIZ2.append(",merchant=");
        String str6 = this.LJIJJLI;
        if (str6 != null && !a0.LJJJIL(str6)) {
            z5 = false;
        } else {
            z5 = true;
        }
        sbLIZ2.append(!z5);
        sbLIZ2.append(",forceFilter=");
        sbLIZ2.append(this.LJJI);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        if (!Intrinsics.LJFF(strLIZIZ, strLIZIZ2)) {
            C1710110ubR.LJIIIIZZ("update_google_pay_config", "local_control_params", "google_pay_config", strLIZIZ, strLIZIZ2, LJIL(this));
        }
        if (this.LJJI) {
            LJJLIIIJ(null, false, true);
        }
    }

    public final boolean LJJIJLIJ(boolean z, EnumC994640bzS enumC994640bzS, PaymentOption paymentOption, List<PaymentOption> list) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (PaymentOption paymentOption2 : list) {
                if (!Intrinsics.LJFF(paymentOption2.LIZ, paymentOption.LIZ)) {
                    List<PaymentOption> list2 = paymentOption2.LIZLLL;
                    if (list2 != null && !list2.isEmpty()) {
                        Iterator<PaymentOption> it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (Intrinsics.LJFF(it2.next().LIZ, paymentOption.LIZ)) {
                            }
                        }
                    }
                }
                return false;
            }
        }
        if (z && enumC994640bzS == EnumC994640bzS.EXPRESS) {
            list.clear();
            list.add(paymentOption);
            return true;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            PaymentOption paymentOption3 = (PaymentOption) ListProtector.get(list, i);
            if ((paymentOption.statusAttr.available || !paymentOption3.statusAttr.available) && paymentOption.LJIILIIL(this) >= paymentOption3.LJIILIIL(this)) {
                ListProtector.add(list, i, paymentOption);
                return true;
            }
        }
        list.add(paymentOption);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJIL(com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption r8, com.ss.android.ugc.aweme.pipo.cashier.common.model.PIPOPaymentOptionSource r9, boolean r10, kotlin.jvm.functions.Function1<? super com.ss.android.ugc.aweme.pipo.cashier.common.model.PIPOPaymentOptionArea, java.lang.Boolean> r11) {
        /*
            Method dump skipped, instruction units count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1709570uaZ.LJJIL(com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption, com.ss.android.ugc.aweme.pipo.cashier.common.model.PIPOPaymentOptionSource, boolean, kotlin.jvm.functions.Function1):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x015e A[Catch: all -> 0x020e, TryCatch #0 {all -> 0x020e, blocks: (B:6:0x000e, B:8:0x0012, B:9:0x0016, B:12:0x001d, B:14:0x0021, B:16:0x0025, B:17:0x0029, B:20:0x0030, B:23:0x003d, B:25:0x005a, B:27:0x0069, B:28:0x0086, B:30:0x008a, B:31:0x00a7, B:33:0x00e3, B:35:0x00ea, B:37:0x0103, B:38:0x010b, B:55:0x015e, B:58:0x0171, B:60:0x0177, B:62:0x0188, B:64:0x018e, B:66:0x019c, B:68:0x01b2, B:69:0x01b8, B:71:0x01be, B:73:0x01ca, B:75:0x01d0, B:77:0x01e1, B:79:0x01fd, B:40:0x0115, B:42:0x011a, B:44:0x0122, B:46:0x0126, B:49:0x0131, B:51:0x014a, B:52:0x0152), top: B:90:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0171 A[Catch: all -> 0x020e, TryCatch #0 {all -> 0x020e, blocks: (B:6:0x000e, B:8:0x0012, B:9:0x0016, B:12:0x001d, B:14:0x0021, B:16:0x0025, B:17:0x0029, B:20:0x0030, B:23:0x003d, B:25:0x005a, B:27:0x0069, B:28:0x0086, B:30:0x008a, B:31:0x00a7, B:33:0x00e3, B:35:0x00ea, B:37:0x0103, B:38:0x010b, B:55:0x015e, B:58:0x0171, B:60:0x0177, B:62:0x0188, B:64:0x018e, B:66:0x019c, B:68:0x01b2, B:69:0x01b8, B:71:0x01be, B:73:0x01ca, B:75:0x01d0, B:77:0x01e1, B:79:0x01fd, B:40:0x0115, B:42:0x011a, B:44:0x0122, B:46:0x0126, B:49:0x0131, B:51:0x014a, B:52:0x0152), top: B:90:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b2 A[Catch: all -> 0x020e, TryCatch #0 {all -> 0x020e, blocks: (B:6:0x000e, B:8:0x0012, B:9:0x0016, B:12:0x001d, B:14:0x0021, B:16:0x0025, B:17:0x0029, B:20:0x0030, B:23:0x003d, B:25:0x005a, B:27:0x0069, B:28:0x0086, B:30:0x008a, B:31:0x00a7, B:33:0x00e3, B:35:0x00ea, B:37:0x0103, B:38:0x010b, B:55:0x015e, B:58:0x0171, B:60:0x0177, B:62:0x0188, B:64:0x018e, B:66:0x019c, B:68:0x01b2, B:69:0x01b8, B:71:0x01be, B:73:0x01ca, B:75:0x01d0, B:77:0x01e1, B:79:0x01fd, B:40:0x0115, B:42:0x011a, B:44:0x0122, B:46:0x0126, B:49:0x0131, B:51:0x014a, B:52:0x0152), top: B:90:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(android.content.Context r14, boolean r15, com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption r16, boolean r17, X.InterfaceC1631630sYr r18) {
        /*
            Method dump skipped, instruction units count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1709570uaZ.LJ(android.content.Context, boolean, com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption, boolean, X.0sYr):void");
    }

    public final void LJIIIZ(Context context, boolean z, PaymentOption paymentOption, boolean z2, InterfaceC1631630sYr<? super EnumC336190DFx, ? super PayRequestPaymentDetailItem, ? super String, ? super String, Unit> interfaceC1631630sYr) {
        boolean z3;
        String string;
        if (paymentOption == null) {
            EnumC336190DFx enumC336190DFx = EnumC336190DFx.PAYMENT_ERROR;
            if (context != null) {
                string = context.getString(2131835079);
            } else {
                string = null;
            }
            interfaceC1631630sYr.invoke(enumC336190DFx, null, string, "COMMON_ERROR_NULL_METHOD");
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("build payment option pay detail, po: ");
        sbLIZ.append(paymentOption.LIZ);
        sbLIZ.append(", has_context: ");
        if (context != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        sbLIZ.append(z3);
        sbLIZ.append(", ignore_pci: ");
        sbLIZ.append(z);
        sbLIZ.append(", use_cache: ");
        sbLIZ.append(z2);
        LJJJ(C2188811AlT.LIZIZ(sbLIZ));
        if (context != null) {
            for (InterfaceC835070WpN interfaceC835070WpN : this.LJJIIJZLJL) {
                if (interfaceC835070WpN.LIZJ(paymentOption)) {
                    List<POPayElement> listLJJIII = LJJIII(paymentOption, z2);
                    if (listLJJIII != null) {
                        interfaceC1631630sYr.invoke(EnumC336190DFx.SUCCESS, LJIIIIZZ(paymentOption, z, listLJJIII), null, null);
                        return;
                    } else {
                        interfaceC835070WpN.LIZIZ(context, this, paymentOption, new C1709590uab(this, interfaceC835070WpN, paymentOption, interfaceC1631630sYr, z));
                        return;
                    }
                }
            }
            interfaceC1631630sYr.invoke(EnumC336190DFx.SUCCESS, LJIIIIZZ(paymentOption, z, null), null, null);
            return;
        }
        List<POPayElement> listLJJIII2 = LJJIII(paymentOption, z2);
        if (listLJJIII2 != null) {
            interfaceC1631630sYr.invoke(EnumC336190DFx.SUCCESS, LJIIIIZZ(paymentOption, z, listLJJIII2), null, null);
            return;
        }
        if (LJJIFFI(paymentOption) == null) {
            interfaceC1631630sYr.invoke(EnumC336190DFx.SUCCESS, LJIIIIZZ(paymentOption, z, null), null, null);
            return;
        }
        Pair pairLJFF = LJFF(paymentOption);
        interfaceC1631630sYr.invoke(EnumC336190DFx.PAYMENT_ERROR, null, pairLJFF.getFirst(), pairLJFF.getSecond());
    }

    public final boolean LJI(CashierKey cashierKey, Context context, boolean z, String str, boolean z2, InterfaceC1631630sYr<? super EnumC336190DFx, ? super PayRequestPaymentDetails, ? super String, ? super String, Unit> interfaceC1631630sYr) {
        String string;
        Object c098200Yq;
        Config config;
        String string2;
        boolean z3;
        if (this.LJIJ.LIZLLL) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("build payment details, ");
                sbLIZ.append("scene: ");
                sbLIZ.append(str);
                sbLIZ.append(", cashier_key: ");
                sbLIZ.append(cashierKey.toString());
                LJJJ(C2188811AlT.LIZIZ(sbLIZ));
            } catch (Throwable th) {
                th = th;
            }
            try {
                LJ(context, z, this.LJIILIIL.LJ(this.LJJII), z2, new C1708520uYs(this, new ArrayList(), context, z, str, z2, interfaceC1631630sYr, cashierKey, this));
                ArrayList arrayList = (ArrayList) C13LQ.LJIJI(new String[]{this.LJJIII, this.LJJII});
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        PaymentOption paymentOptionLJ = this.LJIILIIL.LJ((String) it2.next());
                        if (paymentOptionLJ != null && ((C1708640uZ4.LIZ.LIZJ(paymentOptionLJ) && C1708640uZ4.LJI(paymentOptionLJ)) || C1708460uYm.LIZ.LIZJ(paymentOptionLJ))) {
                            return true;
                        }
                    }
                    return false;
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                TryCatchGuardChecker.doCheck(th);
                C098200Yq c098200Yq2 = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq2);
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq2) != null) {
                    EnumC336190DFx enumC336190DFx = EnumC336190DFx.EXCEPTION_ERROR;
                    if (context != null) {
                        string = context.getString(2131835079);
                    } else {
                        string = null;
                    }
                    interfaceC1631630sYr.invoke(enumC336190DFx, null, string, "COMMON_ERROR_EXCEPTION");
                    return false;
                }
                throw new C2197108jB();
            }
        }
        try {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("build payment option details async, scene: ");
            sbLIZ2.append(str);
            sbLIZ2.append(", cashier_key: ");
            sbLIZ2.append(cashierKey.toString());
            LJJJ(C2188811AlT.LIZIZ(sbLIZ2));
            LJIIIZ(context, z, this.LJIILIIL.LJ(this.LJJII), z2, new C1708510uYr(this, new ArrayList(), context, z, z2, interfaceC1631630sYr, cashierKey, this));
            ArrayList arrayList2 = (ArrayList) C13LQ.LJIJI(new String[]{this.LJJIII, this.LJJII});
            if (!arrayList2.isEmpty()) {
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    PaymentOption paymentOptionLJ2 = this.LJIILIIL.LJ((String) it3.next());
                    if (paymentOptionLJ2 != null && ((C1708640uZ4.LIZ.LIZJ(paymentOptionLJ2) && C1708640uZ4.LJI(paymentOptionLJ2)) || C1708460uYm.LIZ.LIZJ(paymentOptionLJ2))) {
                        z3 = true;
                        break;
                    }
                }
                z3 = false;
                c098200Yq = Boolean.valueOf(z3);
                C189200o6.m2constructorimpl(c098200Yq);
            } else {
                z3 = false;
                c098200Yq = Boolean.valueOf(z3);
                C189200o6.m2constructorimpl(c098200Yq);
            }
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            c098200Yq = new C098200Yq(th3);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            EnumC336190DFx enumC336190DFx2 = EnumC336190DFx.EXCEPTION_ERROR;
            if (context != null) {
                string2 = context.getString(2131835079);
                config = null;
            } else {
                config = null;
                string2 = null;
            }
            interfaceC1631630sYr.invoke(enumC336190DFx2, config, string2, "COMMON_ERROR_EXCEPTION");
            c098200Yq = Boolean.FALSE;
        }
        return ((Boolean) c098200Yq).booleanValue();
    }

    public static C1709570uaZ LJIJJ(C1709570uaZ c1709570uaZ, PIPOPaymentOptionSource pIPOPaymentOptionSource, C1707990uY1 c1707990uY1, C1709570uaZ c1709570uaZ2, List list, List list2, PIPOPaymentOptionSource pIPOPaymentOptionSource2, List list3, int i) {
        CashierPaymentOptionInfoResp.GlobalDisplayInfo globalDisplayInfo;
        CashierPaymentOptionInfoResp.GlobalConfiguration globalConfiguration;
        PricingPlan pricingPlan;
        CashierBasicInfoData cashierBasicInfoData;
        CashierPaymentOptionInfoResp cashierPaymentOptionInfoResp;
        C1709570uaZ c1709570uaZ3;
        String str;
        String str2;
        boolean z;
        boolean z2;
        C1708990uZd c1708990uZd;
        C1157320gDq c1157320gDq;
        Set<? extends EnumC586150Myr> set;
        String str3;
        String str4;
        String str5;
        String str6;
        boolean z3;
        String str7;
        List list4 = list3;
        PIPOPaymentOptionSource pIPOPaymentOptionSource3 = pIPOPaymentOptionSource2;
        C1707990uY1 c1707990uY12 = c1707990uY1;
        List list5 = list2;
        PIPOPaymentOptionSource pIPOPaymentOptionSource4 = pIPOPaymentOptionSource;
        List list6 = list;
        C1709570uaZ c1709570uaZ4 = c1709570uaZ2;
        if ((i & 1) != 0) {
            pIPOPaymentOptionSource4 = c1709570uaZ.LIZ;
        }
        if ((i & 2) != 0) {
            c1707990uY12 = c1709570uaZ.LIZIZ;
        }
        if ((i & 4) != 0) {
            globalDisplayInfo = c1709570uaZ.LIZJ;
        } else {
            globalDisplayInfo = null;
        }
        if ((i & 8) != 0) {
            globalConfiguration = c1709570uaZ.LIZLLL;
        } else {
            globalConfiguration = null;
        }
        if ((i & 16) != 0) {
            pricingPlan = c1709570uaZ.LJ;
        } else {
            pricingPlan = null;
        }
        if ((i & 32) != 0) {
            cashierBasicInfoData = c1709570uaZ.LJFF;
        } else {
            cashierBasicInfoData = null;
        }
        if ((i & 64) != 0) {
            cashierPaymentOptionInfoResp = c1709570uaZ.LJI;
        } else {
            cashierPaymentOptionInfoResp = null;
        }
        if ((i & 128) != 0) {
            c1709570uaZ3 = c1709570uaZ.LJII;
        } else {
            c1709570uaZ3 = null;
        }
        if ((i & 256) != 0) {
            str = c1709570uaZ.LJIIIIZZ;
        } else {
            str = null;
        }
        if ((i & 512) != 0) {
            str2 = c1709570uaZ.LJIIIZ;
        } else {
            str2 = null;
        }
        if ((i & 1024) != 0) {
            c1709570uaZ4 = c1709570uaZ.LJIIJ;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            list6 = c1709570uaZ.LJIIJJI;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            list5 = c1709570uaZ.LJIIL;
        }
        if ((i & 8192) != 0) {
            pIPOPaymentOptionSource3 = c1709570uaZ.LJIILIIL;
        }
        if ((i & 16384) != 0) {
            list4 = c1709570uaZ.LJIILJJIL;
        }
        if ((32768 & i) != 0) {
            z = c1709570uaZ.LJIILL;
        } else {
            z = false;
        }
        if ((65536 & i) != 0) {
            z2 = c1709570uaZ.LJIILLIIL;
        } else {
            z2 = false;
        }
        if ((131072 & i) != 0) {
            c1708990uZd = c1709570uaZ.LJIIZILJ;
        } else {
            c1708990uZd = null;
        }
        if ((262144 & i) != 0) {
            c1157320gDq = c1709570uaZ.LJIJ;
        } else {
            c1157320gDq = null;
        }
        if ((524288 & i) != 0) {
            set = c1709570uaZ.LJIJI;
        } else {
            set = null;
        }
        if ((1048576 & i) != 0) {
            str3 = c1709570uaZ.LJIJJ;
        } else {
            str3 = null;
        }
        if ((2097152 & i) != 0) {
            str4 = c1709570uaZ.LJIJJLI;
        } else {
            str4 = null;
        }
        if ((4194304 & i) != 0) {
            str5 = c1709570uaZ.LJIL;
        } else {
            str5 = null;
        }
        if ((8388608 & i) != 0) {
            str6 = c1709570uaZ.LJJ;
        } else {
            str6 = null;
        }
        if ((16777216 & i) != 0) {
            z3 = c1709570uaZ.LJJI;
        } else {
            z3 = false;
        }
        if ((i & 33554432) != 0) {
            str7 = c1709570uaZ.LJJIFFI;
        } else {
            str7 = null;
        }
        c1709570uaZ.getClass();
        List list7 = list5;
        PIPOPaymentOptionSource pIPOPaymentOptionSource5 = pIPOPaymentOptionSource3;
        List list8 = list4;
        return new C1709570uaZ(pIPOPaymentOptionSource4, c1707990uY12, globalDisplayInfo, globalConfiguration, pricingPlan, cashierBasicInfoData, cashierPaymentOptionInfoResp, c1709570uaZ3, str, str2, c1709570uaZ4, list6, list7, pIPOPaymentOptionSource5, list8, z, z2, c1708990uZd, c1157320gDq, set, str3, str4, str5, str6, z3, str7);
    }

    public C1709570uaZ(PIPOPaymentOptionSource pIPOPaymentOptionSource, C1707990uY1 c1707990uY1, CashierPaymentOptionInfoResp.GlobalDisplayInfo globalDisplayInfo, CashierPaymentOptionInfoResp.GlobalConfiguration globalConfiguration, PricingPlan pricingPlan, CashierBasicInfoData cashierBasicInfoData, CashierPaymentOptionInfoResp cashierPaymentOptionInfoResp, C1708990uZd c1708990uZd, C1157320gDq c1157320gDq, String str) {
        this(pIPOPaymentOptionSource, c1707990uY1, globalDisplayInfo, globalConfiguration, pricingPlan, cashierBasicInfoData, cashierPaymentOptionInfoResp, null, null, null, null, new ArrayList(), new ArrayList(), pIPOPaymentOptionSource, new ArrayList(), false, false, c1708990uZd, c1157320gDq, C08CX.INSTANCE, null, null, null, null, false, str);
    }

    public C1709570uaZ(PIPOPaymentOptionSource pIPOPaymentOptionSource, C1707990uY1 c1707990uY1, CashierPaymentOptionInfoResp.GlobalDisplayInfo globalDisplayInfo, CashierPaymentOptionInfoResp.GlobalConfiguration globalConfiguration, PricingPlan pricingPlan, CashierBasicInfoData cashierBasicInfoData, CashierPaymentOptionInfoResp cashierPaymentOptionInfoResp, C1709570uaZ c1709570uaZ, String str, String str2, C1709570uaZ c1709570uaZ2, List<PaymentOptionLocalInfo> list, List<PaymentOptionLocalInfo> list2, PIPOPaymentOptionSource pIPOPaymentOptionSource2, List<InterfaceC1709390uaH> list3, boolean z, boolean z2, C1708990uZd c1708990uZd, C1157320gDq c1157320gDq, Set<? extends EnumC586150Myr> set, String str3, String str4, String str5, String str6, boolean z3, String str7) {
        this.LIZ = pIPOPaymentOptionSource;
        this.LIZIZ = c1707990uY1;
        this.LIZJ = globalDisplayInfo;
        this.LIZLLL = globalConfiguration;
        this.LJ = pricingPlan;
        this.LJFF = cashierBasicInfoData;
        this.LJI = cashierPaymentOptionInfoResp;
        this.LJII = c1709570uaZ;
        this.LJIIIIZZ = str;
        this.LJIIIZ = str2;
        this.LJIIJ = c1709570uaZ2;
        this.LJIIJJI = list;
        this.LJIIL = list2;
        this.LJIILIIL = pIPOPaymentOptionSource2;
        this.LJIILJJIL = list3;
        this.LJIILL = z;
        this.LJIILLIIL = z2;
        this.LJIIZILJ = c1708990uZd;
        this.LJIJ = c1157320gDq;
        this.LJIJI = set;
        this.LJIJJ = str3;
        this.LJIJJLI = str4;
        this.LJIL = str5;
        this.LJJ = str6;
        this.LJJI = z3;
        this.LJJIFFI = str7;
        this.LJJIIJ = new LinkedHashSet();
        this.LJJIIJZLJL = C1697810uHb.LJIILJJIL(C1708640uZ4.LIZ, C834520WoU.LIZ, C1708460uYm.LIZ);
    }
}
