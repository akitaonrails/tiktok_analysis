package X;

import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AwS567S0100000_23;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pj1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1522610pj1 extends AbstractC1522730pjD implements InterfaceC1531800pxq {
    public final C0X52<?> LJIIIIZZ;
    public final C01GW LJIIIZ;

    public C1522610pj1() {
        throw null;
    }

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
        C0X52<?> c0x52 = this.LJIIIIZZ;
        Object obj = c0x52 != null ? c0x52.LIZIZ : null;
        if (!(obj instanceof TypedInput) || (typedInput = (TypedInput) obj) == null) {
            return null;
        }
        return typedInput.in();
    }

    @Override // X.AbstractC1522730pjD
    public final JSONObject LJI() {
        C1494600ozq c1494600ozq;
        C2175508fh c2175508fh;
        C0X52<?> c0x52 = this.LJIIIIZZ;
        Object obj = (c0x52 == null || (c2175508fh = c0x52.LIZ) == null) ? null : c2175508fh.LJFF;
        if (!(obj instanceof C1494850p0F) || (c1494600ozq = (C1494600ozq) obj) == null) {
            return null;
        }
        return c1494600ozq.LJJIIJZLJL;
    }

    @Override // X.InterfaceC1531800pxq
    public final int LIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1531800pxq
    public final Map<String, String> LIZJ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1531800pxq
    public final String LJ() {
        return this.LIZLLL;
    }

    public C1522610pj1(C0X52 c0x52, AbstractC1522680pj8 abstractC1522680pj8) {
        C2175508fh c2175508fh = c0x52.LIZ;
        int i = c2175508fh.LIZIZ;
        C1522700pjA c1522700pjA = C1522700pjA.LIZ;
        List<C080U> list = c2175508fh.LIZLLL;
        c1522700pjA.getClass();
        HashMap map = new HashMap();
        for (C080U c080u : list) {
            map.put(c080u.LIZ.toLowerCase(Locale.ENGLISH), c080u.LIZIZ);
        }
        this(i, map, abstractC1522680pj8, null);
        this.LJIIIIZZ = c0x52;
    }

    public C1522610pj1(int i, Map<String, String> map, AbstractC1522680pj8 abstractC1522680pj8, String str) {
        super(i, map, abstractC1522680pj8, str);
        this.LJIIIZ = C452501pT.LIZIZ(new AwS567S0100000_23(this, 125));
    }
}
