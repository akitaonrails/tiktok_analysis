package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0rbe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1594920rbe extends C09AY implements Function1<JSONObject, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ int LLJ;
    public final /* synthetic */ int LLJI;
    public final /* synthetic */ int LLJIJIL;
    public final /* synthetic */ int LLJILJIL;
    public final /* synthetic */ int LLJILJILJ;
    public final /* synthetic */ String LLJILLL;
    public final /* synthetic */ String LLJJ;
    public final /* synthetic */ C1564600qok LLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1594920rbe(String str, boolean z, long j, long j2, long j3, long j4, int i, int i2, int i3, int i4, int i5, int i6, int i7, String str2, String str3, C1564600qok c1564600qok) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = j;
        this.LLILZ = j2;
        this.LLILZIL = j3;
        this.LLILZLL = j4;
        this.LLIZ = i;
        this.LLIZLLLIL = i2;
        this.LLJ = i3;
        this.LLJI = i4;
        this.LLJIJIL = i5;
        this.LLJILJIL = i6;
        this.LLJILJILJ = i7;
        this.LLJILLL = str2;
        this.LLJJ = str3;
        this.LLJJI = c1564600qok;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) {
        C1594810rbT c1594810rbT;
        Object c098200Yq;
        JSONObject jSONObject2 = jSONObject;
        String str = this.LL;
        boolean z = this.LLILLJJLI;
        long j = this.LLILLL;
        long j2 = this.LLILZ;
        long j3 = this.LLILZIL;
        long j4 = this.LLILZLL;
        int i = this.LLIZ;
        int i2 = this.LLIZLLLIL;
        int i3 = this.LLJ;
        int i4 = this.LLJI;
        int i5 = this.LLJIJIL;
        int i6 = this.LLJILJIL;
        int i7 = this.LLJILJILJ;
        String str2 = this.LLJILLL;
        String str3 = this.LLJJ;
        C1564600qok c1564600qok = this.LLJJI;
        try {
            jSONObject2.put("enter_from", str);
            jSONObject2.put("is_initial", z);
            jSONObject2.put("total_duration", j);
            if (!z) {
                j2 = 0;
            }
            jSONObject2.put("request_trigger_duration", j2);
            jSONObject2.put("request_duration", j3);
            jSONObject2.put("response_handle_duration", j4);
            jSONObject2.put("request_success", i);
            jSONObject2.put("request_type", i2);
            jSONObject2.put("pull_type", i3);
            jSONObject2.put("fetched_story_count", i4);
            jSONObject2.put("status_code", i5);
            jSONObject2.put("story_exp_group", i6);
            jSONObject2.put("displayed_item_cnt", i7);
            if (!TextUtils.isEmpty(str2)) {
                jSONObject2.put("status_msg", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                jSONObject2.put("error", str3);
            }
            c1564600qok.LIZ = 0;
            c1564600qok.LIZJ = 0L;
            c1564600qok.LIZLLL = 0L;
            c1594810rbT = null;
        } catch (Throwable th) {
            th = th;
            c1594810rbT = null;
        }
        try {
            c1564600qok.LJ = null;
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th2) {
            th = th2;
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C1564600qok c1564600qok2 = this.LLJJI;
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c1564600qok2.LIZ = 0;
            c1564600qok2.LIZJ = 0L;
            c1564600qok2.LIZLLL = 0L;
            c1564600qok2.LJ = c1594810rbT;
        }
        return Unit.LIZ;
    }
}
