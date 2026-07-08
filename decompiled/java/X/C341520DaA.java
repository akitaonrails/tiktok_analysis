package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0DaA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C341520DaA extends C09AY implements Function1<JSONObject, Unit> {
    public final /* synthetic */ Aweme LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ = "story_card";
    public final /* synthetic */ List<Aweme> LLILZIL;
    public final /* synthetic */ Integer LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C341520DaA(Aweme aweme, String str, String str2, List list, Integer num) {
        super(1);
        this.LL = aweme;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZIL = list;
        this.LLILZLL = num;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) throws JSONException {
        String aid;
        String requestId;
        User author;
        JSONObject jSONObject2 = jSONObject;
        Aweme aweme = this.LL;
        Integer numValueOf = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        jSONObject2.put("group_id", aid);
        jSONObject2.put("author_id", this.LLILLJJLI);
        Aweme aweme2 = this.LL;
        if (aweme2 != null) {
            requestId = aweme2.getRequestId();
        } else {
            requestId = null;
        }
        jSONObject2.put("req_id", requestId);
        jSONObject2.put("enter_from", this.LLILLL);
        jSONObject2.put("enter_method", this.LLILZ);
        Aweme aweme3 = this.LL;
        if (aweme3 != null && (author = aweme3.getAuthor()) != null) {
            numValueOf = Integer.valueOf(author.getFollowStatus());
        }
        jSONObject2.put("follow_status", numValueOf);
        jSONObject2.put("author_cnt", this.LLILZIL.size());
        List<Aweme> list = this.LLILZIL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<Aweme> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(AwemeExtKt.getAuthorUid(it2.next()));
        }
        jSONObject2.put("author_list", C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62));
        Integer num = this.LLILZLL;
        if (num != null) {
            jSONObject2.put("has_note", num.intValue());
            jSONObject2.put("has_gif", CardStruct.IStatusCode.DEFAULT);
        }
        return Unit.LIZ;
    }
}
