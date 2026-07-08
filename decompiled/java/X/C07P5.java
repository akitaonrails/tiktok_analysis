package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.07P5, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07P5 implements Serializable {
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final int LLILZIL;

    public int getDimension() {
        return this.LLILLJJLI;
    }

    public int getProjectionModel() {
        return this.LLILLL;
    }

    public int getStreamingType() {
        return this.LLILZIL;
    }

    public int getVideoStyle() {
        return this.LL;
    }

    public int getViewSize() {
        return this.LLILZ;
    }

    public static C07P5 fromJSON(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new C07P5(jSONObject.optInt("Vstyle", 0), jSONObject.optInt("Dimension", 0), jSONObject.optInt("ProjectionModel", 0), jSONObject.optInt("ViewSize", 0), jSONObject.optInt("VRStreamingType", 0));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public C07P5(int i, int i2, int i3, int i4, int i5) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
        this.LLILZ = i4;
        this.LLILZIL = i5;
    }
}
