package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.wallet.PaymentData;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Wo8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C834300Wo8 {
    public final C03YA LIZ;
    public final int LIZIZ;
    public final JSONArray LIZJ;

    public C834300Wo8(C03YA c03ya, int i, PaymentData paymentData) {
        this.LIZ = c03ya;
        this.LIZIZ = i;
        if (paymentData != null) {
            try {
                JSONObject jSONObject = C834280Wo6.LJFF;
                this.LIZJ = C834330WoB.LIZ(paymentData);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LIZ = C03YA.ParseError;
            }
        }
    }
}
