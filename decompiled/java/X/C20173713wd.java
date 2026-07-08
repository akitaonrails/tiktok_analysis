package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.story.stickercreate.StoryStreakModel;

/* JADX INFO: renamed from: X.13wd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.story.streak.GroupChatStoryStreakInfoCollectTask", f = "GroupChatStoryStreakInfoCollectTask.kt", l = {128}, m = "getAvatarList")
public final class C20173713wd extends AbstractC23140094w {
    public StoryStreakModel LL;
    public UrlModel LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C20173513wb LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20173713wd(C20173513wb c20173513wb, InterfaceC1364105Vn<? super C20173713wd> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c20173513wb;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GroupChatStoryStreakInfoCollectTask@d45f.getAvatarList$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJII = this.LLILZ.LJII(null, null, null, this);
        C1C7U.LIZIZ("GroupChatStoryStreakInfoCollectTask@d45f.getAvatarList$1");
        return objLJII;
    }
}
