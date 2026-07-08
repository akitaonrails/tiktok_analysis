package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0TGL, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TGL extends C09AY implements Function1<JSONObject, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0TGL(String str, String str2, String str3, String str4, int i, int i2, int i3, String str5) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = i;
        this.LLILZIL = str4;
        this.LLILZLL = str5;
        this.LLIZ = i2;
        this.LLIZLLLIL = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) {
        Object c098200Yq;
        int iIntValue;
        JSONObject jSONObject2 = jSONObject;
        String str = this.LL;
        String str2 = this.LLILLJJLI;
        String str3 = this.LLILLL;
        int i = this.LLILZ;
        String str4 = this.LLILZIL;
        String str5 = this.LLILZLL;
        int i2 = this.LLIZ;
        int i3 = this.LLIZLLLIL;
        try {
            jSONObject2.put("enter_from", str);
            if (str2 != null) {
                jSONObject2.put("req_id", str2);
            }
            if (str3 == null) {
                str3 = "";
            }
            jSONObject2.put("author_id", str3);
            jSONObject2.put("is_unread", i);
            Integer numLJIIJJI = C2095008Iq.LJIIJJI(str4);
            int iIntValue2 = -1;
            if (numLJIIJJI != null) {
                iIntValue = numLJIIJJI.intValue();
            } else {
                iIntValue = -1;
            }
            jSONObject2.put("num", iIntValue);
            Integer numLJIIJJI2 = C2095008Iq.LJIIJJI(str5);
            if (numLJIIJJI2 != null) {
                iIntValue2 = numLJIIJJI2.intValue();
            }
            jSONObject2.put("story_num", iIntValue2);
            jSONObject2.put("rerank_num", i2);
            c098200Yq = jSONObject2.put("rank_type", i3);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            int i4 = C2187451AjH.LIZ;
            C1720106oR.LIZJ("FeedSkylightTracker", thM5exceptionOrNullimpl);
        }
        return Unit.LIZ;
    }
}
