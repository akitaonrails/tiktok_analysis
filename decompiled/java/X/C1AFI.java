package X;

import android.graphics.Bitmap;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1AFI, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AFI extends AbstractC916103i3 {
    public final String LJFF;
    public final C1AFH LJI;
    public final String LJII;
    public final C1AFH LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final boolean LJIIL;
    public Bitmap LJIILIIL;
    public Bitmap LJIILJJIL;

    @Override // X.AbstractC916103i3
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OcrResponse{mExpiredDate='");
        sbLIZ.append(this.LJFF);
        sbLIZ.append('\'');
        sbLIZ.append(", mExpiredDateCorners=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", mNumber='");
        sbLIZ.append(this.LJII);
        sbLIZ.append('\'');
        sbLIZ.append(", mNumberCorners=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", mBankId='");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", mBankName='");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append('\'');
        sbLIZ.append(", mCardName='");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append('\'');
        sbLIZ.append(", mIsValid=");
        sbLIZ.append(this.LJIIL);
        sbLIZ.append(", mNumberBitmap=");
        sbLIZ.append(this.LJIILIIL);
        sbLIZ.append(", mResponseJsonObject=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", mSign='");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", mResultCode='");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('\'');
        sbLIZ.append(", mErrorCode='");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append('\'');
        sbLIZ.append(", mErrorMessage='");
        sbLIZ.append(this.LJ);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1AFI(String str) {
        boolean z;
        super(str);
        JSONObject jSONObject = this.LIZ;
        try {
            this.LJFF = jSONObject.optString("expired_date");
            C1AFH c1afh = new C1AFH(JSONObjectProtectorUtils.getJSONObject(jSONObject, "expired_date_corners"));
            this.LJI = c1afh;
            this.LJII = jSONObject.optString("number");
            C1AFH c1afh2 = new C1AFH(JSONObjectProtectorUtils.getJSONObject(jSONObject, "number_corners"));
            this.LJIIIIZZ = c1afh2;
            this.LJIIIZ = jSONObject.optString("bank_id");
            this.LJIIJ = jSONObject.optString("bank_name");
            this.LJIIJJI = jSONObject.optString("card_name");
            if (c1afh.LJI && c1afh2.LJI) {
                z = true;
            } else {
                z = false;
            }
            this.LJIIL = z;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            this.LJ = e.getMessage();
        }
    }

    public final void LIZ(Bitmap bitmap) {
        C1AFH c1afh = this.LJIIIIZZ;
        int i = c1afh.LIZIZ;
        Bitmap bitmapLIZLLL = C1289680jfK.LIZLLL(bitmap, i, c1afh.LIZJ, c1afh.LJ - i, c1afh.LIZLLL - c1afh.LJFF);
        C1AFH c1afh2 = this.LJI;
        int i2 = c1afh2.LIZIZ;
        Bitmap bitmapLIZLLL2 = C1289680jfK.LIZLLL(bitmap, i2, c1afh2.LIZJ, c1afh2.LJ - i2, c1afh2.LIZLLL - c1afh2.LJFF);
        this.LJIILIIL = bitmapLIZLLL;
        this.LJIILJJIL = bitmapLIZLLL2;
        this.LJIIIIZZ.getClass();
        if (this.LJIIIIZZ.LJII && bitmapLIZLLL != null) {
            this.LJIILIIL = C1289680jfK.LJ(bitmapLIZLLL, 270.0f);
        }
        if (this.LJIIIIZZ.LJIIIIZZ && bitmapLIZLLL != null) {
            this.LJIILIIL = C1289680jfK.LJ(bitmapLIZLLL, 90.0f);
        }
        this.LJI.getClass();
        if (this.LJI.LJII && bitmapLIZLLL2 != null) {
            this.LJIILJJIL = C1289680jfK.LJ(bitmapLIZLLL2, 270.0f);
        }
        if (this.LJI.LJIIIIZZ && bitmapLIZLLL2 != null) {
            this.LJIILJJIL = C1289680jfK.LJ(bitmapLIZLLL2, 90.0f);
        }
    }
}
