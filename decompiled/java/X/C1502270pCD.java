package X;

import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS567S0100000_23;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pCD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1502270pCD implements InterfaceC1531800pxq {
    public final int LIZ;
    public final C1502260pCC LIZIZ;
    public final C2175508fh LIZJ;
    public final Map<String, String> LIZLLL;
    public final String LJ;
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS567S0100000_23(this, 103));

    @Override // X.InterfaceC1531800pxq
    public final JSONObject LIZLLL() {
        Object c098200Yq;
        JSONObject jSONObjectOptJSONObject;
        try {
            JSONObject jSONObject = (JSONObject) this.LJFF.getValue();
            c098200Yq = (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("timing")) == null) ? null : jSONObjectOptJSONObject.optJSONObject("detailed_duration");
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        return (JSONObject) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
    }

    @Override // X.InterfaceC1531800pxq
    public final InputStream LIZIZ() {
        TypedInput typedInput;
        String str;
        Integer numLJIIJJI;
        Map<String, String> map = this.LIZLLL;
        if ((map == null || (str = map.get("content-length")) == null || (numLJIIJJI = C2095008Iq.LJIIJJI(str)) == null || numLJIIJJI.intValue() != 0) ? false : true) {
            close();
            return new ByteArrayInputStream(new byte[0]);
        }
        try {
            C2175508fh c2175508fh = this.LIZJ;
            InputStream inputStreamIn = (c2175508fh == null || (typedInput = c2175508fh.LJ) == null) ? null : typedInput.in();
            if (inputStreamIn == null) {
                C1532920pze.LIZJ.LIZIZ("DefaultNetApi", "provideInputStream", "response is empty when providing input stream");
            }
            return inputStreamIn;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1532920pze.LIZJ.LIZIZ("DefaultNetApi", "provideInputStream", "error occurs when getting input stream from response");
            return null;
        }
    }

    @Override // X.InterfaceC1531800pxq
    public final void close() {
        Unit unit;
        TypedInput typedInput;
        InputStream inputStreamIn;
        try {
            C189200o6.m2constructorimpl(Boolean.valueOf(this.LIZIZ.cancel()));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        try {
            C2175508fh c2175508fh = this.LIZJ;
            if (c2175508fh == null || (typedInput = c2175508fh.LJ) == null || (inputStreamIn = typedInput.in()) == null) {
                unit = null;
            } else {
                inputStreamIn.close();
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
    }

    @Override // X.InterfaceC1531800pxq
    public final int LIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1531800pxq
    public final Map<String, String> LIZJ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1531800pxq
    public final String LJ() {
        return this.LJ;
    }

    public C1502270pCD(int i, C1502260pCC c1502260pCC, C2175508fh c2175508fh, Map<String, String> map, String str) {
        this.LIZ = i;
        this.LIZIZ = c1502260pCC;
        this.LIZJ = c2175508fh;
        this.LIZLLL = map;
        this.LJ = str;
    }
}
