package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jXM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1284740jXM extends Error {
    public int code;
    public Map info;
    public final boolean playForbidden;
    public long timeStamp;

    public static int convertVeLivePlayerErrorCode(int i) {
        switch (i) {
            case -1330794744:
            case -1296385272:
            case -1094995529:
            case -499983:
            case -499975:
            case -499971:
                return -300;
            case -1128613112:
            case -499998:
            case -499997:
            case -499996:
            case -499981:
            case -499978:
            case -499977:
                return -301;
            case -499992:
            case -499990:
                return -302;
            case -499988:
            case -499987:
            case -100002:
            case -100001:
                return -100;
            case -499984:
            case -100009:
                return -101;
            case -499898:
            case -499897:
            case -499896:
            case -499895:
            case -499894:
            case -499893:
            case -499892:
            case -499891:
            case -100011:
                return -201;
            case -499799:
            case -499798:
            case -100010:
                return -200;
            case -30001:
                return -1;
            default:
                return -999;
        }
    }

    public String getInfoJSON() {
        if (this.info == null) {
            this.info = new HashMap();
        }
        JSONObject jSONObject = new JSONObject(this.info);
        try {
            jSONObject.put("timestamp", this.timeStamp);
            jSONObject.put("message", super.toString());
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            e.toString();
            C1698940uJQ.LIZ();
        }
        return C786410Ut5.J3(jSONObject);
    }

    @Override // java.lang.Throwable
    public String toString() {
        if (this.info == null) {
            this.info = new HashMap();
        }
        JSONObject jSONObject = new JSONObject(this.info);
        try {
            jSONObject.put("message", super.toString());
            jSONObject.put("code", this.code);
            jSONObject.put("timestamp", this.timeStamp);
            jSONObject.put("playForbidden", this.playForbidden);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            e.toString();
            C1698940uJQ.LIZ();
        }
        return C786410Ut5.J3(jSONObject);
    }

    public C1284740jXM(int i, String str, Map<String, String> map, boolean z) {
        super(str);
        this.code = i;
        this.info = map;
        this.timeStamp = System.currentTimeMillis();
        this.playForbidden = z;
    }
}
