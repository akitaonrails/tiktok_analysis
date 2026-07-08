package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0TFw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C743860TFw extends C09AY implements Function1<JSONObject, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ int LLJ;
    public final /* synthetic */ int LLJI;
    public final /* synthetic */ boolean LLJIJIL;
    public final /* synthetic */ String LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C743860TFw(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, String str3) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = i3;
        this.LLILZLL = i4;
        this.LLIZ = i5;
        this.LLIZLLLIL = i6;
        this.LLJ = i7;
        this.LLJI = i8;
        this.LLJIJIL = z;
        this.LLJILJIL = str3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) {
        Object c098200Yq;
        int i;
        JSONObject jSONObject2 = jSONObject;
        String str = this.LL;
        String str2 = this.LLILLJJLI;
        int i2 = this.LLILLL;
        int i3 = this.LLILZ;
        int i4 = this.LLILZIL;
        int i5 = this.LLILZLL;
        int i6 = this.LLIZ;
        int i7 = this.LLIZLLLIL;
        int i8 = this.LLJ;
        int i9 = this.LLJI;
        boolean z = this.LLJIJIL;
        String str3 = this.LLJILJIL;
        try {
            jSONObject2.put("enter_from", str);
            jSONObject2.put("enter_method", str2);
            jSONObject2.put("live_cnt", i2);
            jSONObject2.put("following_live_cnt", i3);
            jSONObject2.put("non_following_live_cnt", i4);
            jSONObject2.put("story_cnt", i5);
            jSONObject2.put("following_cnt", i6);
            jSONObject2.put("unread_following_cnt", i7);
            jSONObject2.put("total_story_cnt", i8);
            jSONObject2.put("story_highlight_cnt", i9);
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject2.put("has_self_story_pub", i);
            if (str3 == null) {
                c098200Yq = null;
            } else {
                c098200Yq = jSONObject2.put("request_id", str3);
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            int i10 = C2187451AjH.LIZ;
            C1720106oR.LIZJ("FeedSkylightTracker", thM5exceptionOrNullimpl);
        }
        return Unit.LIZ;
    }
}
