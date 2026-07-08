package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jmd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1294210jmd implements Serializable {
    public int LL;
    public int LLILLJJLI;
    public int LLILLL;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SimVideoFrameOffset{frame=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", time=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", offset=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public int getFrame() {
        return this.LL;
    }

    public int getOffset() {
        return this.LLILLL;
    }

    public int getTime() {
        return this.LLILLJJLI;
    }

    public static C1294210jmd[] fromJSON(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            C1294210jmd[] c1294210jmdArr = new C1294210jmd[length];
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
                c1294210jmdArr[i] = new C1294210jmd(jSONObject.optInt("frame", 0), jSONObject.optInt("time", 0), jSONObject.optInt("offset", 0));
            }
            return c1294210jmdArr;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public void setFrame(int i) {
        this.LL = i;
    }

    public void setOffset(int i) {
        this.LLILLL = i;
    }

    public void setTime(int i) {
        this.LLILLJJLI = i;
    }

    public C1294210jmd(int i, int i2, int i3) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
    }
}
