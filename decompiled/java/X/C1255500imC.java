package X;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0imC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1255500imC extends AbstractC1255540imG {
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1255500imC) && this.LIZIZ == ((C1255500imC) obj).LIZIZ;
    }

    public final int hashCode() {
        return this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Number(count=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1255500imC(int i) {
        super(EnumC1253890ijb.NUMBER);
        this.LIZIZ = i;
    }

    @Override // X.AbstractC1255540imG
    public final void LIZ(JSONObject jSONObject) throws JSONException {
        super.LIZ(jSONObject);
        jSONObject.put("notification_cnt", this.LIZIZ);
    }

    @Override // X.AbstractC1255540imG
    public final boolean LIZIZ(AbstractC1255540imG abstractC1255540imG) {
        C1255500imC c1255500imC;
        if (abstractC1255540imG instanceof C1255500imC) {
            c1255500imC = (C1255500imC) abstractC1255540imG;
        } else {
            c1255500imC = null;
        }
        if (c1255500imC == null || c1255500imC.LIZIZ > this.LIZIZ) {
            return true;
        }
        return false;
    }
}
