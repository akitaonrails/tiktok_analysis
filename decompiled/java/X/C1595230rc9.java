package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0rc9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1595230rc9 extends C09AY implements Function1<JSONObject, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ Long LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1595230rc9(String str, String str2, int i, String str3, String str4, String str5, String str6, int i2, Long l) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = i;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = str5;
        this.LLIZ = str6;
        this.LLIZLLLIL = i2;
        this.LLJ = l;
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
        String str5 = this.LLILZLL;
        String str6 = this.LLIZ;
        int i2 = this.LLIZLLLIL;
        Long l = this.LLJ;
        try {
            jSONObject2.put("enter_from", str);
            jSONObject2.put("cell_type", str2);
            jSONObject2.put("rank", i + 1);
            if (str3 != null) {
                jSONObject2.put("enter_method", str3);
            }
            if (str4 != null) {
                jSONObject2.put("author_id", str4);
            }
            if (str5 != null) {
                jSONObject2.put("click_position", str5);
            }
            if (str6 != null) {
                jSONObject2.put("request_id", str6);
            }
            if (str4 != null) {
                jSONObject2.put("author_id", str4);
            }
            C1596130rdb.LIZ.getClass();
            C1596120rda c1596120rda = (C1596120rda) C1596130rdb.LIZLLL().get(Integer.valueOf(i2));
            if (c1596120rda != null) {
                jSONObject2.put("request_time", c1596120rda.LJIILL);
            }
            if (C08A4.LIZIZ(l)) {
                jSONObject2.put("room_id", l.longValue());
            }
            C1595220rc8 c1595220rc8 = C1595220rc8.LIZ;
            String strLIZ = C1181204ji.LIZ(str2, str4);
            c1595220rc8.getClass();
            C1595220rc8.LJ(str, strLIZ, jSONObject2);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            int i3 = C2187451AjH.LIZ;
            C1720106oR.LIZJ("FeedSkylightTracker", thM5exceptionOrNullimpl);
        }
        return Unit.LIZ;
    }
}
