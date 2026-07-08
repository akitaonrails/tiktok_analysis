package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0bKi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C969380bKi extends C09AY implements Function2<String, Long, Unit> {
    public final /* synthetic */ C969390bKj LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ JSONObject LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C969380bKi(C969390bKj c969390bKj, String str, JSONObject jSONObject, int i, long j) {
        super(2);
        this.LL = c969390bKj;
        this.LLILLJJLI = str;
        this.LLILLL = jSONObject;
        this.LLILZ = i;
        this.LLILZIL = j;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(String str, Long l) {
        String str2 = str;
        long jLongValue = l.longValue();
        if ((!a0.LJJJIL(str2)) && !Intrinsics.LJFF(str2, "{}")) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = this.LLILLL;
            int i = this.LLILZ;
            long j = this.LLILZIL;
            C969390bKj c969390bKj = this.LL;
            String str3 = this.LLILLJJLI;
            if (jSONObject2 != null) {
                C0K04.LJII("extra", jSONObject, jSONObject2);
            }
            C0K04.LIZLLL(i, "result", jSONObject);
            C0K04.LJ("duration", j - jLongValue, jSONObject);
            c969390bKj.LJI.LIZIZ(true, -1L, true, str3, C786410Ut5.J3(jSONObject), false);
            this.LL.LJI.LIZJ(this.LLILLJJLI);
        }
        return Unit.LIZ;
    }
}
