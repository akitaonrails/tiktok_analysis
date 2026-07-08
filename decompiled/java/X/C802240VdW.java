package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VdW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C802240VdW {
    public int LIZ;
    public int LIZIZ;
    public JSONObject LIZJ;
    public byte[] LIZLLL;
    public Map<String, List<String>> LJ;

    public final boolean LIZ() {
        int i = this.LIZ;
        return (i == 207 || i == 214) ? false : true;
    }

    public C802240VdW() {
        this.LIZ = 207;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Response:mErrorCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", mServerErrorCode=");
        sbLIZ.append(this.LIZIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (this.LIZJ == null) {
            return strLIZIZ;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append(", mServerJson=");
        sbLIZ2.append(C786410Ut5.J3(this.LIZJ));
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public C802240VdW(Throwable th) {
        this.LIZ = 207;
        th.getMessage();
    }

    public final void LIZIZ(JSONObject jSONObject) {
        this.LIZJ = jSONObject;
        try {
            String str = "";
            if (this.LJ != null) {
                new ArrayList();
                Iterator<Map.Entry<String, List<String>>> it2 = this.LJ.entrySet().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Map.Entry<String, List<String>> next = it2.next();
                    if ("Alog_quota".equalsIgnoreCase(next.getKey())) {
                        List<String> value = next.getValue();
                        if (value.size() > 0) {
                            str = value.get(0);
                            break;
                        }
                    }
                }
            }
            this.LIZJ.putOpt("Alog_quota", str);
            String strOptString = this.LIZJ.optString("message");
            if (!TextUtils.isEmpty(strOptString)) {
                if (strOptString.equals("drop all data") || strOptString.equals("drop data")) {
                    this.LIZ = 213;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public C802240VdW(int i) {
        this.LIZ = i;
    }

    public C802240VdW(int i, byte[] bArr) {
        this.LIZ = i;
        this.LIZLLL = bArr;
    }
}
