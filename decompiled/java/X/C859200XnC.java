package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XnC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C859200XnC extends C09AY implements Function1<JSONObject, Unit> {
    public final /* synthetic */ C860330Xp1 LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ Map<String, String> LLILLL;
    public final /* synthetic */ EnumC860460XpE LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C859200XnC(C860330Xp1 c860330Xp1, long j, Map<String, String> map, EnumC860460XpE enumC860460XpE) {
        super(1);
        this.LL = c860330Xp1;
        this.LLILLJJLI = j;
        this.LLILLL = map;
        this.LLILZ = enumC860460XpE;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) {
        C860470XpF.LJ(this.LL, jSONObject, this.LLILLJJLI);
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C859190XnB(this.LL, this.LLILLL, this.LLILZ, null), 3);
        return Unit.LIZ;
    }
}
