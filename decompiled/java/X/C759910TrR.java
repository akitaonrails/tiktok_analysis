package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0TrR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C759910TrR extends C09AY implements Function1<JSONObject, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Long LLILZLL;
    public final /* synthetic */ Long LLIZ;
    public final /* synthetic */ String LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C759910TrR(int i, Long l, Long l2, String str, String str2, String str3, String str4, String str5) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = i;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = l;
        this.LLIZ = l2;
        this.LLIZLLLIL = str5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) {
        Object c098200Yq;
        JSONObject jSONObject2 = jSONObject;
        String str = this.LL;
        String str2 = this.LLILLJJLI;
        int i = this.LLILLL;
        String str3 = this.LLILZ;
        String str4 = this.LLILZIL;
        Long l = this.LLILZLL;
        Long l2 = this.LLIZ;
        String str5 = this.LLIZLLLIL;
        try {
            jSONObject2.put("enter_from", str);
            jSONObject2.put("cell_type", str2);
            jSONObject2.put("rank", i + 1);
            if (str3 != null) {
                jSONObject2.put("request_id", str3);
            }
            if (str4 == null) {
                str4 = "";
            }
            jSONObject2.put("author_id", str4);
            if (l != null) {
                jSONObject2.put("request_time", l.longValue());
            }
            if (C08A4.LIZIZ(l2)) {
                jSONObject2.put("room_id", l2.longValue());
            }
            C1595220rc8.LIZ.getClass();
            C1595220rc8.LJ(str, str5, jSONObject2);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LIZJ("FeedSkylightTracker", thM5exceptionOrNullimpl);
        }
        return Unit.LIZ;
    }
}
