package X;

import com.tiktok.ttm.ttmparam.ITTMParamData;
import kotlin.jvm.internal.AwS557S0100000_13;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Wgv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C829830Wgv extends ITTMParamData {
    public final boolean LIZIZ;
    public final JSONObject LIZJ;
    public final String LIZLLL;
    public final C01GW LJ = C452501pT.LIZIZ(new AwS557S0100000_13(this, 145));
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS557S0100000_13(this, 146));

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C829830Wgv)) {
            return false;
        }
        C829830Wgv c829830Wgv = (C829830Wgv) obj;
        return this.LIZIZ == c829830Wgv.LIZIZ && Intrinsics.LJFF(this.LIZJ, c829830Wgv.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c829830Wgv.LIZLLL);
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public final Object getInputData() {
        return this;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public final int getType() {
        return 2;
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LIZIZ) * 31;
        JSONObject jSONObject = this.LIZJ;
        int iHashCode = (iZ2 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        String str = this.LIZLLL;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ResponseModel(isSuccess=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", body=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", statusMsg=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public final boolean containsKey(String str) {
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case -2070216145:
                if (!str.equals("statusMsg")) {
                    return false;
                }
                return true;
            case 3029410:
                if (!str.equals("body") || this.LIZJ == null) {
                    return false;
                }
                return true;
            case 103148383:
                if (!str.equals("logID") || ((String) this.LJ.getValue()).length() <= 0) {
                    return false;
                }
                return true;
            case 247507199:
                if (!str.equals("statusCode")) {
                    return false;
                }
                return true;
            case 1848018809:
                if (!str.equals("isSuccess")) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public final ITTMParamData getObjectItem(String str) {
        if (Intrinsics.LJFF(str, "body")) {
            return C829660Wge.LIZIZ(this.LIZJ);
        }
        return null;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public final long getIntValue(String str, int i) {
        if (Intrinsics.LJFF(str, "isSuccess")) {
            if (!this.LIZIZ) {
                return 0L;
            }
            return 1L;
        }
        if (!Intrinsics.LJFF(str, "statusCode")) {
            return 0L;
        }
        return ((Number) this.LJFF.getValue()).intValue();
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public final String getStringValue(String str, int i) {
        if (Intrinsics.LJFF(str, "statusMsg")) {
            return this.LIZLLL;
        }
        if (Intrinsics.LJFF(str, "logID")) {
            return (String) this.LJ.getValue();
        }
        return "";
    }

    public C829830Wgv(JSONObject jSONObject, String str, boolean z) {
        this.LIZIZ = z;
        this.LIZJ = jSONObject;
        this.LIZLLL = str;
    }
}
