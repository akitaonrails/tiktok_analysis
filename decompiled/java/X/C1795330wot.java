package X;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.globalpayment.iap.google.state.GooglePaymentHandlerV2;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wot, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1795330wot implements InterfaceC1797860wsy {
    public final /* synthetic */ int LIZ;
    public final /* synthetic */ C19885612rG LIZIZ;
    public final /* synthetic */ C1794480wnW LIZJ;
    public final /* synthetic */ Activity LIZLLL;
    public final /* synthetic */ C1796050wq3 LJ;
    public final /* synthetic */ String LJFF;
    public final /* synthetic */ InterfaceC1795750wpZ LJI;
    public final /* synthetic */ C1795340wou LJII;

    @Override // X.InterfaceC1797860wsy
    public final void LIZ(final C19885612rG c19885612rG, C1796230wqL c1796230wqL) {
        C1794700wns c1794700wnsLJ = C1794700wns.LJ();
        int i = this.LIZ;
        C19885612rG c19885612rG2 = this.LIZIZ;
        c1794700wnsLJ.getClass();
        JSONObject jSONObject = new JSONObject();
        C1793980wmi.LIZ("retry_count", i, jSONObject);
        if (c19885612rG != null) {
            C1793980wmi.LIZ("cur_result_code", c19885612rG.LIZ, jSONObject);
            C1793980wmi.LIZIZ("cur_result_message", c19885612rG.LIZJ, jSONObject);
        } else {
            C1793980wmi.LIZ("cur_result_code", -1L, jSONObject);
            C1793980wmi.LIZIZ("cur_result_message", "unknown", jSONObject);
        }
        if (c19885612rG2 != null) {
            C1793980wmi.LIZ("pre_result_code", c19885612rG.LIZ, jSONObject);
            C1793980wmi.LIZIZ("pre_result_message", c19885612rG.LIZJ, jSONObject);
        } else {
            C1793980wmi.LIZ("pre_result_code", -1L, jSONObject);
            C1793980wmi.LIZIZ("pre_result_message", "unknown", jSONObject);
        }
        C1793980wmi.LIZIZ("payment_method", EnumC1791830wjF.GOOGLE.channelName, jSONObject);
        ((C1796060wq4) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZIZ()).onEventV3("retry_query_sku_details_event", jSONObject);
        int i2 = c19885612rG.LIZ;
        if (i2 == 0) {
            List<C1792740wki> list = c1796230wqL.LIZ;
            C1794480wnW c1794480wnW = this.LIZJ;
            if (list != null && !list.isEmpty()) {
                for (C1792740wki c1792740wki : list) {
                    if (c1792740wki != null) {
                        ((HashMap) this.LJII.LJI).put(c1792740wki.LIZJ, c1792740wki);
                    }
                }
                C1792740wki c1792740wkiLJII = this.LJII.LJII(this.LJFF);
                if (c1792740wkiLJII != null) {
                    C1795840wpi c1795840wpiLIZ = C1795010woN.LIZ(this.LJII.LJFF(c1792740wkiLJII.LIZJ, c1794480wnW, c1792740wkiLJII.LIZLLL.equals("subs"), this.LJI), this.LIZJ);
                    C1795340wou c1795340wou = this.LJII;
                    Activity activity = this.LIZLLL;
                    String strLJ = this.LIZJ.LJ();
                    InterfaceC1795750wpZ interfaceC1795750wpZ = this.LJI;
                    c1795340wou.getClass();
                    interfaceC1795750wpZ.LIZIZ(c1795840wpiLIZ);
                    ((ConcurrentHashMap) c1795340wou.LIZIZ).put(strLJ, interfaceC1795750wpZ);
                    interfaceC1795750wpZ.LJII();
                    c1795340wou.LJIIIIZZ(activity, c1795840wpiLIZ, interfaceC1795750wpZ);
                    return;
                }
                LIZIZ(this.LIZJ, new C1792840wks(-2, -1, "-2:google details doesn't has this product."));
                return;
            }
            LIZIZ(this.LIZJ, new C1792840wks(-1, -1, "-1:google details is empty, doesn't has this product."));
            return;
        }
        if (this.LIZ == 0) {
            if (i2 == -3) {
                this.LJII.LIZLLL(this.LIZLLL, this.LJ, this.LJFF, this.LIZJ, this.LJI, 1, c19885612rG);
                return;
            }
            if (i2 == -1) {
                this.LJII.LIZ(new InterfaceC1796310wqT() { // from class: X.0wpK
                    @Override // X.InterfaceC1796310wqT
                    public final void LIZIZ() {
                        C1795330wot c1795330wot = this.LIZIZ;
                        c1795330wot.LJII.LIZLLL(c1795330wot.LIZLLL, c1795330wot.LJ, c1795330wot.LJFF, c1795330wot.LIZJ, c1795330wot.LJI, c1795330wot.LIZ + 1, c19885612rG);
                    }

                    @Override // X.InterfaceC1796310wqT
                    public final void LIZ(C1792840wks c1792840wks) {
                        C1792840wks c1792840wksLIZ = C1795020woO.LIZ(c19885612rG);
                        C1795330wot c1795330wot = this.LIZIZ;
                        c1795330wot.LIZIZ(c1795330wot.LIZJ, c1792840wksLIZ);
                    }
                });
                return;
            } else if (TextUtils.equals("An internal error occurred.", c19885612rG.LIZJ)) {
                this.LJII.LIZLLL(this.LIZLLL, this.LJ, this.LJFF, this.LIZJ, this.LJI, this.LIZ + 1, c19885612rG);
                return;
            } else {
                LIZIZ(this.LIZJ, C1795020woO.LIZ(c19885612rG));
                return;
            }
        }
        LIZIZ(this.LIZJ, C1795020woO.LIZ(c19885612rG));
    }

    public final void LIZIZ(C1794480wnW c1794480wnW, C1792840wks c1792840wks) {
        String strLIZLLL = c1794480wnW.LIZLLL();
        String str = c1794480wnW.LIZ.LIZIZ;
        String str2 = c1794480wnW.LIZLLL;
        C1794700wns c1794700wnsLJ = C1794700wns.LJ();
        String str3 = this.LJFF;
        c1794700wnsLJ.getClass();
        JSONObject jSONObject = new JSONObject();
        C1793980wmi.LIZ("result_code", c1792840wks.LIZ, jSONObject);
        C1793980wmi.LIZIZ("result_message", c1792840wks.LJ, jSONObject);
        C1793980wmi.LIZIZ("sku_id", str3, jSONObject);
        C1793980wmi.LIZIZ("order_id", strLIZLLL, jSONObject);
        C1793980wmi.LIZIZ("merchant_id", str, jSONObject);
        C1793980wmi.LIZIZ("user_id", str2, jSONObject);
        C1793980wmi.LIZIZ("payment_method", EnumC1791830wjF.GOOGLE.channelName, jSONObject);
        ((C1796060wq4) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZIZ()).onEventV3("query_sku_details_failed", jSONObject);
        InterfaceC1795750wpZ interfaceC1795750wpZ = this.LJI;
        if (interfaceC1795750wpZ != null) {
            interfaceC1795750wpZ.LJ(c1792840wks, null, null);
        }
        GooglePaymentHandlerV2 googlePaymentHandlerV2 = this.LJII.LJIIIIZZ;
        EnumC1794760wny enumC1794760wny = EnumC1794760wny.PURCHASE_COMPLETED;
        googlePaymentHandlerV2.getClass();
        GooglePaymentHandlerV2.LIZ(enumC1794760wny);
    }

    public C1795330wot(C1795340wou c1795340wou, int i, C19885612rG c19885612rG, C1794480wnW c1794480wnW, Activity activity, C1796050wq3 c1796050wq3, String str, InterfaceC1795750wpZ interfaceC1795750wpZ) {
        this.LJII = c1795340wou;
        this.LIZ = i;
        this.LIZIZ = c19885612rG;
        this.LIZJ = c1794480wnW;
        this.LIZLLL = activity;
        this.LJ = c1796050wq3;
        this.LJFF = str;
        this.LJI = interfaceC1795750wpZ;
    }
}
