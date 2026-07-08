package X;

import com.ss.android.ugc.aweme.creative.model.story.stickercreate.StoryStreakModel;

/* JADX INFO: renamed from: X.13wc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.story.streak.GroupChatStoryStreakInfoCollectTask", f = "GroupChatStoryStreakInfoCollectTask.kt", l = {46}, m = "run")
public final class C20173613wc extends AbstractC23140094w {
    public C20169813w0 LL;
    public StoryStreakModel LLILLJJLI;
    public C0Y8T LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C20173513wb LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20173613wc(C20173513wb c20173513wb, InterfaceC1364105Vn<? super C20173613wc> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c20173513wb;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GroupChatStoryStreakInfoCollectTask@d45f.run$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJ = this.LLILZIL.LJ(null, this);
        C1C7U.LIZIZ("GroupChatStoryStreakInfoCollectTask@d45f.run$1");
        return objLJ;
    }
}
