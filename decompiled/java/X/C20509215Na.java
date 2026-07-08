package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.tag.viewmodel.VideoTagSearchListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.15Na, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20509215Na extends C09AY implements Function1<JSONObject, Unit> {
    public final /* synthetic */ VideoTagSearchListViewModel LL;
    public final /* synthetic */ IMUser LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20509215Na(VideoTagSearchListViewModel videoTagSearchListViewModel, IMUser iMUser, boolean z, int i) {
        super(1);
        this.LL = videoTagSearchListViewModel;
        this.LLILLJJLI = iMUser;
        this.LLILLL = z;
        this.LLILZ = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) throws JSONException {
        String str;
        String str2;
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put("previous_page", this.LL.wQ2().getEnterFrom());
        jSONObject2.put("to_user_id", this.LLILLJJLI.getUid());
        if (this.LLILLL) {
            str = "choose";
        } else {
            str = "cancel_choose";
        }
        jSONObject2.put("click_type", str);
        if (this.LL.LLILLL.contains(this.LLILLJJLI)) {
            str2 = "following";
        } else {
            str2 = "all_user";
        }
        jSONObject2.put("user_type", str2);
        jSONObject2.put("search_keyword", this.LL.LLILZLL);
        jSONObject2.put("function", "tag");
        jSONObject2.put(Scene.SCENE_SERVICE, "video_tag");
        jSONObject2.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, this.LLILZ);
        return Unit.LIZ;
    }
}
