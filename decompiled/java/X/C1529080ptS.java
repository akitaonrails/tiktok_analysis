package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ptS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1529080ptS extends C09AY implements Function2<C1529100ptU, Long, Unit> {
    public final /* synthetic */ Function1<C1529100ptU, Unit> LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C1529040ptO LLILZ;
    public final /* synthetic */ EnumC1529090ptT LLILZIL;
    public final /* synthetic */ long LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1529080ptS(Function1<? super C1529100ptU, Unit> function1, String str, String str2, C1529040ptO c1529040ptO, EnumC1529090ptT enumC1529090ptT, long j) {
        super(2);
        this.LL = function1;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = c1529040ptO;
        this.LLILZIL = enumC1529090ptT;
        this.LLILZLL = j;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0ptR] */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C1529100ptU c1529100ptU, Long l) {
        final C1529100ptU c1529100ptU2 = c1529100ptU;
        final Long l2 = l;
        this.LL.invoke(c1529100ptU2);
        final String str = this.LLILLJJLI;
        final String str2 = this.LLILLL;
        final C1529040ptO c1529040ptO = this.LLILZ;
        final EnumC1529090ptT enumC1529090ptT = this.LLILZIL;
        try {
            final long jCurrentTimeMillis = System.currentTimeMillis() - this.LLILZLL;
            new Object(str, str2, c1529040ptO, enumC1529090ptT, c1529100ptU2, jCurrentTimeMillis, l2) { // from class: X.0ptR
                public final String LIZ;
                public final String LIZIZ;
                public final C1529040ptO LIZJ;
                public final EnumC1529090ptT LIZLLL;
                public final C1529100ptU LJ;
                public final long LJFF;
                public final Long LJI;

                public final void LIZ() {
                    Object c098200Yq;
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("schema", this.LIZ);
                        jSONObject.put("url", this.LIZIZ);
                        jSONObject.put("state", this.LJ.LIZ);
                        jSONObject.put("type", this.LIZLLL.getType());
                        jSONObject.put("oid", this.LJ.LIZJ);
                        EnumC1160050gIF enumC1160050gIF = this.LJ.LJFF;
                        jSONObject.put("from", enumC1160050gIF != null ? Integer.valueOf(enumC1160050gIF.getFrom()) : null);
                        jSONObject.put("bid", this.LIZJ.LIZ);
                        jSONObject.put("cacheOnly", this.LIZJ.LIZJ);
                        jSONObject.put("async", this.LIZJ.LIZIZ);
                        jSONObject.put("data_origin", this.LIZJ.LIZLLL);
                        jSONObject.put("data_type", this.LIZJ.LJ);
                        jSONObject.put("errorCode", this.LJ.LIZLLL);
                        jSONObject.put("errorMsg", this.LJ.LJ);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("cost", this.LJFF);
                        Long l3 = this.LJI;
                        if (l3 != null) {
                            l3.longValue();
                            jSONObject2.put("oid_cost", this.LJI.longValue());
                        }
                        C1520200pf8 c1520200pf8 = C1520200pf8.LIZ;
                        C1520360pfO c1520360pfO = new C1520360pfO("hybrid_info_sdk_pv");
                        EnumC993170bx5 enumC993170bx5 = EnumC993170bx5.Tea;
                        c1520360pfO.LJIIJJI = enumC993170bx5;
                        c1520360pfO.LIZLLL = jSONObject;
                        c1520360pfO.LJ = jSONObject2;
                        C1520350pfN c1520350pfNLIZ = c1520360pfO.LIZ();
                        c1520200pf8.getClass();
                        C1520200pf8.LIZ(c1520350pfNLIZ);
                        if (!this.LJ.LIZ) {
                            C1520360pfO c1520360pfO2 = new C1520360pfO("hybrid_info_sdk_error");
                            c1520360pfO2.LJIIJJI = enumC993170bx5;
                            c1520360pfO2.LIZLLL = jSONObject;
                            c1520360pfO2.LJ = jSONObject2;
                            c1520360pfO2.LIZIZ(0);
                            C1520200pf8.LIZ(c1520360pfO2.LIZ());
                        }
                        c098200Yq = Unit.LIZ;
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    C189200o6.m5exceptionOrNullimpl(c098200Yq);
                }

                {
                    this.LIZ = str;
                    this.LIZIZ = str2;
                    this.LIZJ = c1529040ptO;
                    this.LIZLLL = enumC1529090ptT;
                    this.LJ = c1529100ptU2;
                    this.LJFF = jCurrentTimeMillis;
                    this.LJI = l2;
                }
            }.LIZ();
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        return Unit.LIZ;
    }
}
