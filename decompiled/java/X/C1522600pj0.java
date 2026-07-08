package X;

import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AwS567S0100000_23;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pj0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1522600pj0 extends AbstractC1522730pjD {
    public final C2175508fh LJIIIIZZ;
    public final C01GW LJIIIZ;

    @Override // X.AbstractC1522730pjD
    public final JSONObject LIZLLL() {
        Object c098200Yq;
        JSONObject jSONObjectOptJSONObject;
        try {
            JSONObject jSONObject = (JSONObject) this.LJIIIZ.getValue();
            c098200Yq = (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("timing")) == null) ? null : jSONObjectOptJSONObject.optJSONObject("detailed_duration");
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        return (JSONObject) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
    }

    @Override // X.AbstractC1522730pjD
    public final JSONObject LJII() {
        Object c098200Yq;
        try {
            JSONObject jSONObject = (JSONObject) this.LJIIIZ.getValue();
            c098200Yq = jSONObject != null ? jSONObject.optJSONObject("base") : null;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        return (JSONObject) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
    }

    @Override // X.AbstractC1522730pjD
    public final InputStream LIZIZ() {
        TypedInput typedInput;
        Integer numLJIIJJI;
        String str = this.LIZIZ.get("content-length");
        if ((str == null || (numLJIIJJI = C2095008Iq.LJIIJJI(str)) == null || numLJIIJJI.intValue() != 0) ? false : true) {
            close();
            return new ByteArrayInputStream(new byte[0]);
        }
        try {
            C2175508fh c2175508fh = this.LJIIIIZZ;
            InputStream inputStreamIn = (c2175508fh == null || (typedInput = c2175508fh.LJ) == null) ? null : typedInput.in();
            if (inputStreamIn == null) {
                C1534250q1n.LIZJ("TTNetDepender", "response is empty when providing input stream", null, true);
            }
            return inputStreamIn;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1534250q1n.LIZJ("TTNetDepender", "error occurs when getting input stream from response", th, true);
            return null;
        }
    }

    @Override // X.AbstractC1522730pjD
    public final JSONObject LJI() {
        C1494600ozq c1494600ozq;
        C2175508fh c2175508fh = this.LJIIIIZZ;
        Object obj = c2175508fh != null ? c2175508fh.LJFF : null;
        if (!(obj instanceof C1494850p0F) || (c1494600ozq = (C1494600ozq) obj) == null) {
            return null;
        }
        return c1494600ozq.LJJIIJZLJL;
    }

    public C1522600pj0(C2175508fh c2175508fh, AbstractC1522680pj8 abstractC1522680pj8) {
        int i = c2175508fh.LIZIZ;
        List<C080U> list = c2175508fh.LIZLLL;
        HashMap map = new HashMap();
        for (C080U c080u : list) {
            map.put(c080u.LIZ.toLowerCase(Locale.ENGLISH), c080u.LIZIZ);
        }
        this(i, map, abstractC1522680pj8, null);
        this.LJIIIIZZ = c2175508fh;
    }

    public C1522600pj0(int i, Map<String, String> map, AbstractC1522680pj8 abstractC1522680pj8, String str) {
        super(i, map, abstractC1522680pj8, str);
        this.LJIIIZ = C452501pT.LIZIZ(new AwS567S0100000_23(this, 60));
    }
}
