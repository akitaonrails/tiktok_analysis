package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Weg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C828440Weg extends C09AY implements Function0<Unit> {
    public final /* synthetic */ JSONObject LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ JSONObject LLILLL;
    public final /* synthetic */ JSONObject LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C828440Weg(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        super(0);
        this.LL = jSONObject;
        this.LLILLJJLI = str;
        this.LLILLL = jSONObject2;
        this.LLILZ = jSONObject3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        JSONObject jSONObject;
        try {
            JSONObject jSONObject2 = this.LL;
            if (jSONObject2 != null && (jSONObject = this.LLILLL) != null) {
                jSONObject.put("extra", jSONObject2);
            }
            C1520360pfO c1520360pfO = new C1520360pfO(this.LLILLJJLI);
            c1520360pfO.LIZIZ = "hybridkit_default_bid";
            c1520360pfO.LIZLLL = this.LLILLL;
            c1520360pfO.LJ = this.LLILZ;
            c1520360pfO.LJIIJJI = EnumC993170bx5.Tea;
            C1520080pew.LIZ(null, c1520360pfO.LIZ());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return Unit.LIZ;
    }
}
