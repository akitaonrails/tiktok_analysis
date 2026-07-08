package X;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import org.json.JSONException;

/* JADX INFO: renamed from: X.1BAd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2200451BAd {
    public static final int LIZ = Runtime.getRuntime().availableProcessors();

    public static int LIZ(Bundle bundle, String str) {
        if (bundle == null) {
            return 6;
        }
        try {
            Object obj = bundle.get("RESPONSE_CODE");
            if (obj != null) {
                if (obj instanceof Integer) {
                    return ((Integer) obj).intValue();
                }
                "Unexpected type for bundle response code: ".concat(obj.getClass().getName());
                return 6;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LJI(str, "getResponseCodeFromBundle() got null response code, assuming OK");
        return 0;
    }

    public static Bundle LIZJ(C19885612rG c19885612rG, C1BAX c1bax) {
        Bundle bundle = new Bundle();
        bundle.putInt("RESPONSE_CODE", c19885612rG.LIZ);
        C786410Ut5.LJJJI("DEBUG_MESSAGE", c19885612rG.LIZJ, bundle);
        bundle.putInt("LOG_REASON", c1bax.zza());
        return bundle;
    }

    public static C19885612rG LJ(Intent intent, String str) {
        Bundle extras;
        if (intent == null) {
            C19889112rp c19889112rp = new C19889112rp();
            c19889112rp.LIZ = 6;
            c19889112rp.LIZJ = "An internal error occurred.";
            return c19889112rp.LIZ();
        }
        C19889112rp c19889112rp2 = new C19889112rp();
        Bundle extras2 = null;
        try {
            extras = intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            extras = null;
        }
        c19889112rp2.LIZ = LIZ(extras, str);
        try {
            extras2 = intent.getExtras();
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        c19889112rp2.LIZJ = LJFF(extras2, str);
        return c19889112rp2.LIZ();
    }

    public static String LJFF(Bundle bundle, String str) {
        Object obj;
        if (bundle == null) {
            return "";
        }
        try {
            obj = bundle.get("DEBUG_MESSAGE");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            obj = null;
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
            obj = null;
        }
        if (obj == null) {
            LJI(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        "Unexpected type for debug message: ".concat(obj.getClass().getName());
        return "";
    }

    public static void LJI(String str, String str2) {
        if (Log.isLoggable(str, 2) && !str2.isEmpty()) {
            int i = 40000;
            while (!str2.isEmpty() && i > 0) {
                int iMin = Math.min(str2.length(), Math.min(4000, i));
                str2 = str2.substring(iMin);
                i -= iMin;
            }
        }
    }

    public static C1BBJ LJII(String str, String str2) {
        C1BB4 c1bb4;
        if (str != null && str2 != null) {
            try {
                Purchase purchase = new Purchase(str, str2);
                C1BBC c1bbcLJIJJ = C1BB4.LJIJJ();
                c1bbcLJIJJ.LJFF(2);
                return new C1BBJ(purchase, (C1BB4) c1bbcLJIJJ.LIZIZ());
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                "Got JSONException while parsing purchase data: ".concat(e.toString());
                C1BBC c1bbcLJIJJ2 = C1BB4.LJIJJ();
                c1bbcLJIJJ2.LJFF(3);
                String strConcat = "Error parsing: ".concat(str);
                c1bbcLJIJJ2.LIZLLL();
                C1BB4.LJIL((C1BB4) c1bbcLJIJJ2.LLILLJJLI, strConcat);
                return new C1BBJ(null, (C1BB4) c1bbcLJIJJ2.LIZIZ());
            }
        }
        LJI("BillingHelper", "Received a null purchase data.");
        if (str == null) {
            C1BBC c1bbcLJIJJ3 = C1BB4.LJIJJ();
            c1bbcLJIJJ3.LJFF(5);
            c1bb4 = (C1BB4) c1bbcLJIJJ3.LIZIZ();
        } else {
            C1BBC c1bbcLJIJJ4 = C1BB4.LJIJJ();
            c1bbcLJIJJ4.LJFF(6);
            c1bb4 = (C1BB4) c1bbcLJIJJ4.LIZIZ();
        }
        return new C1BBJ(null, c1bb4);
    }

    public static void LIZIZ(long j, String str, String str2, Bundle bundle) {
        C786410Ut5.LJJJI("playBillingLibraryVersion", str, bundle);
        if (str2 != null) {
            C786410Ut5.LJJJI("playBillingLibraryWrapperVersion", str2, bundle);
        }
        bundle.putLong("billingClientSessionId", j);
    }

    public static Bundle LIZLLL(String str, String str2, ArrayList arrayList, C1BBP c1bbp, long j) {
        Bundle bundle = new Bundle();
        LIZIZ(j, str, str2, bundle);
        bundle.putBoolean("enablePendingPurchases", true);
        C786410Ut5.LJJJI("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS", bundle);
        C786410Ut5.LJJJIL(bundle, "PRODUCT_TYPES_TO_RETURN_MULTIPLE_OFFERS", new ArrayList(AbstractC19884912r9.zzm("subs", "inapp")));
        C786410Ut5.LJJJIL(bundle, "PRODUCT_TYPES_TO_RETURN_PREORDER_OFFERS", new ArrayList(AbstractC19884912r9.zzl("inapp")));
        C786410Ut5.LJJJIL(bundle, "PRODUCT_TYPES_TO_RETURN_RENT_OFFERS", new ArrayList(AbstractC19884912r9.zzl("inapp")));
        C786410Ut5.LJJJIL(bundle, "PRODUCT_TYPES_TO_RETURN_AUTOPAY_OFFERS", new ArrayList(AbstractC19884912r9.zzl("inapp")));
        bundle.putBoolean("SHOULD_RETURN_UNFETCHED_PRODUCTS", true);
        if (c1bbp.LIZ) {
            bundle.putBoolean("enablePendingPurchaseForSubscriptions", true);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            C1795970wpv c1795970wpv = (C1795970wpv) ListProtector.get(arrayList, i);
            arrayList2.add(null);
            z |= !TextUtils.isEmpty(null);
            arrayList4.add(null);
            z2 |= !TextUtils.isEmpty(null);
            if (c1795970wpv.LIZIZ.equals("first_party")) {
                C19863812nk.LIZJ(null, "Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                throw null;
            }
        }
        if (z) {
            C786410Ut5.LJJJIL(bundle, "SKU_OFFER_ID_TOKEN_LIST", arrayList2);
        }
        if (!arrayList3.isEmpty()) {
            C786410Ut5.LJJJIL(bundle, "SKU_SERIALIZED_DOCID_LIST", arrayList3);
        }
        if (!TextUtils.isEmpty(null)) {
            C786410Ut5.LJJJI("accountName", null, bundle);
        }
        if (z2) {
            C786410Ut5.LJJJIL(bundle, "SKU_DYNAMIC_PRODUCT_TOKEN_LIST", arrayList4);
        }
        return bundle;
    }
}
