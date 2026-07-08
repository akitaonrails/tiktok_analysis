package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Rxg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C712820Rxg extends C09AY implements Function1<JSONObject, Unit> {
    public final /* synthetic */ Aweme LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C712820Rxg(int i, long j, Aweme aweme, String str) {
        super(1);
        this.LL = aweme;
        this.LLILLJJLI = str;
        this.LLILLL = i;
        this.LLILZ = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) throws JSONException {
        String aid;
        JSONObject jSONObject2 = jSONObject;
        Aweme aweme = this.LL;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        jSONObject2.put("enter_from", this.LLILLJJLI);
        jSONObject2.put("card_id", "story_guide");
        jSONObject2.put("aweme_id", aid);
        jSONObject2.put("business_type", "social");
        jSONObject2.put("card_type", "video");
        jSONObject2.put("card_source", "other");
        jSONObject2.put("is_video_play", this.LLILLL);
        jSONObject2.put("is_insertion_card", 0);
        jSONObject2.put("duration", this.LLILZ);
        return Unit.LIZ;
    }
}
