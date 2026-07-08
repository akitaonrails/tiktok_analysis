package X;

import android.content.Context;
import android.content.Intent;
import com.bytedance.globalpayment.googlepayapi.PIPOPayActivity;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Wo5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C834270Wo5 {
    public static C833960Wna LIZIZ;
    public static WeakReference<Context> LIZJ;
    public static C834280Wo6 LJ;
    public static C834350WoD LJFF;
    public static String LJI;
    public static boolean LJII;
    public static final C834270Wo5 LIZ = new C834270Wo5();
    public static InterfaceC834240Wo2 LIZLLL = new InterfaceC834240Wo2() { // from class: X.0WoA
        @Override // X.InterfaceC834240Wo2
        public final void LIZ(C834300Wo8 c834300Wo8) {
        }

        @Override // X.InterfaceC834240Wo2
        public final void LIZIZ(boolean z) {
        }
    };

    public static void LIZ() {
        C834300Wo8 c834300Wo8 = new C834300Wo8(C03YA.UserCancel, 0, null);
        LIZLLL.LIZ(c834300Wo8);
        C834350WoD c834350WoD = LJFF;
        if (c834350WoD != null) {
            c834350WoD.LIZ(c834300Wo8);
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0Wna] */
    public static final void LIZIZ(C834290Wo7 c834290Wo7) {
        boolean zBooleanValue;
        int i;
        Boolean bool = c834290Wo7.LIZ;
        if (bool == null) {
            zBooleanValue = false;
        } else {
            zBooleanValue = bool.booleanValue();
        }
        LJI = c834290Wo7.LJI;
        String str = c834290Wo7.LJFF;
        String str2 = c834290Wo7.LJII;
        if (str2 == null) {
            str2 = "pipo";
        }
        LJ = new C834280Wo6(str, str2, zBooleanValue, c834290Wo7.LIZLLL, c834290Wo7.LJIIIIZZ);
        LJFF = new C834350WoD(c834290Wo7.LIZIZ, c834290Wo7.LJ);
        C834280Wo6 c834280Wo6 = LJ;
        if (c834280Wo6 == null) {
            c834280Wo6 = null;
        }
        final Context context = c834290Wo7.LIZIZ;
        if (c834280Wo6.LIZLLL) {
            i = 3;
        } else {
            i = 1;
        }
        C834050Wnj c834050Wnj = new C834050Wnj();
        if (i != 2 && i != 1 && i != 3) {
            throw new IllegalArgumentException(C786410Ut5.k4(Locale.US, "Invalid environment value %d", new Object[]{Integer.valueOf(i)}));
        }
        c834050Wnj.LIZ = i;
        final C833940WnY c833940WnY = new C833940WnY(c834050Wnj);
        LIZIZ = new AbstractC831380WjQ<C833940WnY>(context, c833940WnY) { // from class: X.0Wna
            {
                C832010WkR<C833940WnY> c832010WkR = C833950WnZ.LIZ;
                C831490Wjb c831490Wjb = C831490Wjb.LIZJ;
            }
        };
        LIZJ = new WeakReference<>(c834290Wo7.LIZIZ);
        LIZLLL = c834290Wo7.LIZJ;
        LJII = true;
    }

    public static final void LIZJ(List<String> list) {
        if (LJII) {
            C834350WoD c834350WoD = LJFF;
            C833960Wna c833960Wna = null;
            if (c834350WoD != null) {
                c834350WoD.LIZIZ("pipo_googlepayapi_isready_start", null, null);
            }
            C834280Wo6 c834280Wo6 = LJ;
            if (c834280Wo6 == null) {
                c834280Wo6 = null;
            }
            c834280Wo6.getClass();
            JSONObject jSONObject = C834280Wo6.LJFF;
            jSONObject.put("allowedPaymentMethods", new JSONArray().put(c834280Wo6.LIZ(list, false)));
            String strJ3 = C786410Ut5.J3(jSONObject);
            IsReadyToPayRequest isReadyToPayRequest = new IsReadyToPayRequest();
            C0W3J.LJIIIZ(strJ3, "isReadyToPayRequestJson cannot be null!");
            isReadyToPayRequest.zzf = strJ3;
            C833960Wna c833960Wna2 = LIZIZ;
            if (c833960Wna2 != null) {
                c833960Wna = c833960Wna2;
            }
            c833960Wna.getClass();
            C832510WlF c832510WlF = new C832510WlF();
            c832510WlF.LIZLLL = 23705;
            c832510WlF.LIZ = new C833760WnG(isReadyToPayRequest);
            c833960Wna.doRead(c832510WlF.LIZ()).LIZIZ(new InterfaceC834580Woa() { // from class: X.0Wo3
                @Override // X.InterfaceC834580Woa
                public final void LIZ(AbstractC835450Wpz abstractC835450Wpz) throws JSONException {
                    try {
                        Boolean bool = (Boolean) abstractC835450Wpz.LJIIJJI(C0W4V.class);
                        C834270Wo5.LIZLLL.LIZIZ(bool.booleanValue());
                        C834350WoD c834350WoD2 = C834270Wo5.LJFF;
                        if (c834350WoD2 != null) {
                            c834350WoD2.LIZJ(bool.booleanValue());
                        }
                    } catch (C0W4V e) {
                        TryCatchGuardChecker.doCheck(e);
                        C834270Wo5.LIZLLL.LIZIZ(false);
                        C834350WoD c834350WoD3 = C834270Wo5.LJFF;
                        if (c834350WoD3 != null) {
                            c834350WoD3.LIZJ(false);
                        }
                    }
                }
            });
            return;
        }
        throw new Error("need to call init first");
    }

    public static final void LIZLLL(C03Y9 c03y9) {
        if (LJII) {
            try {
                JSONObject jSONObjectLIZ = c03y9.LIZ();
                String str = c03y9.LJ;
                if (str != null) {
                    LJ(str, jSONObjectLIZ);
                    return;
                } else {
                    LJFF(c03y9.LIZLLL, jSONObjectLIZ, c03y9.LJFF);
                    return;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                LIZLLL.LIZ(new C834300Wo8(C03YA.ParseError, 0, null));
                return;
            }
        }
        throw new Error("need to call init first");
    }

    public static void LJ(String str, JSONObject jSONObject) throws JSONException {
        C834350WoD c834350WoD = LJFF;
        if (c834350WoD != null) {
            c834350WoD.LIZIZ("pipo_googlepayapi_request_payment_start", jSONObject, null);
        }
        C834280Wo6 c834280Wo6 = LJ;
        if (c834280Wo6 == null) {
            c834280Wo6 = null;
        }
        String str2 = LJI;
        JSONObject jSONObject2 = C834280Wo6.LJFF;
        c834280Wo6.getClass();
        jSONObject2.put("allowedPaymentMethods", new JSONArray().put(C834280Wo6.LIZIZ(str)));
        jSONObject2.put("transactionInfo", jSONObject);
        jSONObject2.put("shippingAddressRequired", false);
        if (str2 != null) {
            jSONObject2.put("merchantInfo", new JSONObject().put("merchantName", str2));
        }
        String strJ3 = C786410Ut5.J3(jSONObject2);
        WeakReference<Context> weakReference = LIZJ;
        if (weakReference == null) {
            weakReference = null;
        }
        Intent intent = new Intent(weakReference.get(), (Class<?>) PIPOPayActivity.class);
        intent.setFlags(268435456);
        intent.putExtra("requestJSONStr", strJ3);
        WeakReference<Context> weakReference2 = LIZJ;
        if (weakReference2 == null) {
            weakReference2 = null;
        }
        Context context = weakReference2.get();
        if (context != null) {
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
            C1701330uNH.LIZ(intent, context);
            C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEgAjS8/YVFkiQFyDaoo8QRwVxHknCZM/WYiTmEVrxojTojiS5Nu2RZgmD4Y4vup+0pQpilNygURIgg==", null));
        }
    }

    public static void LJFF(List list, JSONObject jSONObject, boolean z) throws JSONException {
        C834350WoD c834350WoD = LJFF;
        if (c834350WoD != null) {
            c834350WoD.LIZIZ("pipo_googlepayapi_request_payment_start", jSONObject, null);
        }
        C834280Wo6 c834280Wo6 = LJ;
        if (c834280Wo6 == null) {
            c834280Wo6 = null;
        }
        String str = LJI;
        c834280Wo6.getClass();
        JSONObject jSONObject2 = C834280Wo6.LJFF;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObjectLIZ = c834280Wo6.LIZ(list, z);
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("gateway", c834280Wo6.LIZIZ);
        jSONObject4.put("gatewayMerchantId", c834280Wo6.LIZ);
        jSONObject3.put("parameters", jSONObject4);
        jSONObject3.put("type", "PAYMENT_GATEWAY");
        jSONObjectLIZ.put("tokenizationSpecification", jSONObject3);
        jSONObject2.put("allowedPaymentMethods", jSONArray.put(jSONObjectLIZ));
        if (z) {
            jSONObject2.put("recurringTransactionInfo", jSONObject);
            jSONObject2.put("transactionInfo", (Object) null);
        } else {
            jSONObject2.put("recurringTransactionInfo", (Object) null);
            jSONObject2.put("transactionInfo", jSONObject);
        }
        jSONObject2.put("shippingAddressRequired", false);
        if (str != null) {
            jSONObject2.put("merchantInfo", new JSONObject().put("merchantName", str));
        }
        String strJ3 = C786410Ut5.J3(jSONObject2);
        WeakReference<Context> weakReference = LIZJ;
        if (weakReference == null) {
            weakReference = null;
        }
        Intent intent = new Intent(weakReference.get(), (Class<?>) PIPOPayActivity.class);
        intent.setFlags(268435456);
        intent.putExtra("requestJSONStr", strJ3);
        WeakReference<Context> weakReference2 = LIZJ;
        if (weakReference2 == null) {
            weakReference2 = null;
        }
        Context context = weakReference2.get();
        if (context != null) {
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
            C1701330uNH.LIZ(intent, context);
            C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEgAjS8/YVFkiQFyDaoo8QRwVxHknCZM/WYiTmEVrxojTojiS5Nu2RZgmD4Y4vup+0pQpilNygURIgg==", null));
        }
    }
}
