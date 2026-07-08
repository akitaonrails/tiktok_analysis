package X;

import android.text.TextUtils;
import android.util.Base64;
import com.android.billingclient.api.Purchase;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wnt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1794710wnt extends AbstractC1794600wni {
    public final JSONObject LJIIL;
    public final Purchase LJIILIIL;
    public final String LJIILJJIL;

    @Override // X.AbstractC1794600wni
    public final void LIZIZ() {
    }

    @Override // X.AbstractC1794600wni
    public final String LIZ() {
        JSONObject jSONObject = this.LJIIL;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    @Override // X.AbstractC1794600wni
    public final String LIZJ() {
        return this.LJIIL.optString("developerPayload");
    }

    @Override // X.AbstractC1794600wni
    public final int LJ() {
        Purchase purchase = this.LJIILIIL;
        return purchase != null ? purchase.LIZLLL() : this.LJIIL.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    @Override // X.AbstractC1794600wni
    public final long LJFF() {
        Purchase purchase = this.LJIILIIL;
        return purchase != null ? purchase.LIZJ.optLong("purchaseTime") : this.LJIIL.optLong("purchaseTime", 0L);
    }

    @Override // X.AbstractC1794600wni
    public final boolean LJIIJ() {
        Purchase purchase = this.LJIILIIL;
        return (purchase == null || purchase.LIZIZ() == null) ? false : true;
    }

    @Override // X.AbstractC1794600wni
    public final boolean LJIIJJI() {
        if ((this.LJIILIIL.LIZJ.optJSONObject("pendingPurchaseUpdate") == null ? null : new Object() { // from class: X.0woL
        }) != null) {
            return false;
        }
        Purchase purchase = this.LJIILIIL;
        return purchase != null ? purchase.LIZLLL() == 1 : LJ() == 1;
    }

    @Override // X.AbstractC1794600wni
    public final String LIZLLL() {
        return this.LJIILJJIL;
    }

    @Override // X.AbstractC1794600wni
    public final String LJII() {
        return this.LJIIIIZZ;
    }

    @Override // X.AbstractC1794600wni
    public final String LJIIIIZZ() {
        return this.LJII;
    }

    public final String toString() {
        return this.LJIIIIZZ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1794710wnt)) {
            return false;
        }
        AbstractC1794600wni abstractC1794600wni = (AbstractC1794600wni) obj;
        if (TextUtils.equals(this.LJIIIIZZ, abstractC1794600wni.LJIIIIZZ) && TextUtils.equals(this.LJII, abstractC1794600wni.LJII)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d0 A[Catch: JSONException -> 0x0110, TryCatch #1 {JSONException -> 0x0110, blocks: (B:3:0x001d, B:7:0x0035, B:19:0x0070, B:35:0x00c0, B:37:0x00c6, B:39:0x00cc, B:41:0x00eb, B:40:0x00d0, B:9:0x0041, B:11:0x0047, B:13:0x0054, B:16:0x005f, B:18:0x0068, B:20:0x007d, B:22:0x0080, B:23:0x0085, B:25:0x008f, B:27:0x00a7, B:29:0x00ad, B:31:0x00b3, B:32:0x00b6, B:15:0x0057), top: B:55:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011a A[Catch: JSONException -> 0x0130, TRY_ENTER, TryCatch #0 {JSONException -> 0x0130, blocks: (B:46:0x011a, B:48:0x0127, B:47:0x0122), top: B:53:0x0118 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0122 A[Catch: JSONException -> 0x0130, TryCatch #0 {JSONException -> 0x0130, blocks: (B:46:0x011a, B:48:0x0127, B:47:0x0122), top: B:53:0x0118 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1794710wnt(com.android.billingclient.api.Purchase r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1794710wnt.<init>(com.android.billingclient.api.Purchase, boolean):void");
    }

    public static JSONObject LJIIL(String str, String str2) {
        String str3;
        String str4 = "";
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                str3 = new String(Base64.decode(str, 2), "UTF-8");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                str3 = "";
            }
            String[] strArrSplit = str3.split("-");
            try {
                str4 = new String(Base64.decode(str2, 2), "UTF-8");
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            String[] strArrSplit2 = str4.split("-");
            if (strArrSplit.length == 0 || strArrSplit2.length == 0) {
                return null;
            }
            jSONObject.put("trade_no", strArrSplit2[0]);
            jSONObject.put("trade_amount", strArrSplit2[1]);
            jSONObject.put("app_id", strArrSplit[0]);
            jSONObject.put("merchant_id", strArrSplit[1]);
            jSONObject.put("uid", strArrSplit[2]);
            return jSONObject;
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            return null;
        }
    }
}
