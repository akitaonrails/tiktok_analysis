package X;

import android.net.Uri;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pipo.hybrid.prefetch.PipoPrefetchApi;
import com.ss.android.ugc.aweme.pipo.hybrid.prefetch.PipoPrefetchConfig;
import com.ss.android.ugc.aweme.pipo.hybrid.prefetch.PipoPrefetchRule;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0v0t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.hybrid.prefetch.handler.PipoPrefetchHandler$prefetch$1", f = "PipoPrefetchHandler.kt", l = {}, m = "invokeSuspend")
public final class C1725890v0t extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1725880v0s LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Uri LLILZIL;
    public final /* synthetic */ JSONObject LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ long LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1725890v0t(C1725880v0s c1725880v0s, String str, String str2, Uri uri, JSONObject jSONObject, String str3, String str4, long j, InterfaceC1364105Vn<? super C1725890v0t> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1725880v0s;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = uri;
        this.LLILZLL = jSONObject;
        this.LLIZ = str3;
        this.LLIZLLLIL = str4;
        this.LLJ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1725890v0t c1725890v0t = new C1725890v0t(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
        c1725890v0t.LL = obj;
        return c1725890v0t;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        PipoPrefetchConfig pipoPrefetchConfigLIZ;
        List<String> list;
        PipoPrefetchApi pipoPrefetchApi;
        C1C7U.LIZ("PipoPrefetchHandler@f84d.prefetch$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        try {
            pipoPrefetchConfigLIZ = ((InterfaceC1548040qO2) this.LLILLJJLI.LIZIZ.getValue()).LIZ(this.LLILZIL, this.LLILLL, this.LLILZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILLJJLI.LIZJ.LIZLLL("prefetch", th, null);
        }
        if (pipoPrefetchConfigLIZ == null) {
            this.LLILLJJLI.LIZJ.LIZJ("prefetch", EnumC1548140qOC.PREFETCH_CONFIG_NULL, this.LLILZLL);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("PipoPrefetchHandler@f84d.prefetch$1");
            return unit;
        }
        if (pipoPrefetchConfigLIZ.dslVersion > 2) {
            this.LLILLJJLI.LIZJ.LIZJ("prefetch", EnumC1548140qOC.PREFETCH_DSL_VERSION_NOT_SUPPORT, this.LLILZLL);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("PipoPrefetchHandler@f84d.prefetch$1");
            return unit2;
        }
        PipoPrefetchRule pipoPrefetchRule = (PipoPrefetchRule) C1904707d7.LIZ(this.LLIZ, pipoPrefetchConfigLIZ.rules);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (pipoPrefetchRule != null && (list = pipoPrefetchRule.prefetchApiNames) != null) {
            for (String str : list) {
                Map<String, PipoPrefetchApi> map = pipoPrefetchConfigLIZ.prefetchApis;
                if (map != null && (pipoPrefetchApi = map.get(str)) != null) {
                    linkedHashMap.put(str, pipoPrefetchApi);
                }
            }
        }
        if (!linkedHashMap.isEmpty()) {
            C1725880v0s c1725880v0s = this.LLILLJJLI;
            Uri uri = this.LLILZIL;
            String str2 = this.LLIZLLLIL;
            c1725880v0s.getClass();
            new C1725980v12(uri, interfaceC497601wk, c1725880v0s, str2, pipoPrefetchConfigLIZ).LIZJ(linkedHashMap);
            this.LLILLJJLI.LIZJ.LIZ(C2286608xc.LJFF(System.currentTimeMillis() - this.LLJ), "prefetch", this.LLILZLL);
        } else {
            this.LLILLJJLI.LIZJ.LIZJ("prefetch", EnumC1548140qOC.PREFETCH_NO_PREFETCH_API, this.LLILZLL);
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("PipoPrefetchHandler@f84d.prefetch$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
