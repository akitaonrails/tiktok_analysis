package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.story.service.IStoryMentionShareService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.15ky, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20611015ky extends C09AY implements Function1<JSONObject, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C20611915l7 LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20611015ky(C20611915l7 c20611915l7, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = c20611915l7;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = z;
        this.LLIZ = str5;
        this.LLIZLLLIL = str6;
        this.LLJ = str7;
        this.LLJI = str8;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) throws JSONException {
        int i;
        String str;
        int i2;
        String str2;
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put("enter_from", this.LL);
        jSONObject2.put("previous_page", this.LLILLJJLI);
        jSONObject2.put("to_user_id", this.LLILLL.LIZ);
        jSONObject2.put("user_type", this.LLILLL.LJIIL.LIZ);
        jSONObject2.put("search_keyword", this.LLILLL.LJIIL.LIZLLL);
        jSONObject2.put("function", "mention");
        jSONObject2.put("is_valid", String.valueOf(this.LLILLL.LJIIJ ? 1 : 0));
        jSONObject2.put(Scene.SCENE_SERVICE, this.LLILZ);
        jSONObject2.put("position", this.LLILZIL);
        if (this.LLILZLL) {
            i = 1;
        } else {
            i = -1;
        }
        jSONObject2.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, String.valueOf(i));
        if (this.LLILZLL) {
            str = "choose";
        } else {
            str = "cancel_choose";
        }
        jSONObject2.put("click_type", str);
        jSONObject2.put("rank", this.LLILLL.LJIIL.LJII);
        jSONObject2.put("sort_type", this.LLILLL.LJIIL.LJIIIIZZ);
        jSONObject2.put("is_note", String.valueOf(Intrinsics.LJFF(this.LLIZ, "1") ? 1 : 0));
        String str3 = this.LLIZLLLIL;
        if (str3 != null) {
            jSONObject2.put("shoot_way", str3);
        }
        String str4 = this.LLJ;
        if (str4 != null) {
            jSONObject2.put("content_source", str4);
        }
        String str5 = this.LLJI;
        if (str5 != null) {
            jSONObject2.put("content_type", str5);
        }
        if (C298470Bmv.LIZ()) {
            IStoryMentionShareService iStoryMentionShareService = (IStoryMentionShareService) PluggableExtentionKt.pluggableSpi$default(IStoryMentionShareService.class, false, false, false, 14, null);
            if (iStoryMentionShareService != null && iStoryMentionShareService.isPrivateAccount()) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            jSONObject2.put("is_private_account", i2);
            if (iStoryMentionShareService != null && iStoryMentionShareService.LIZIZ()) {
                str2 = "on";
            } else {
                str2 = "off";
            }
            jSONObject2.put("checkbox_status", str2);
        }
        return Unit.LIZ;
    }
}
