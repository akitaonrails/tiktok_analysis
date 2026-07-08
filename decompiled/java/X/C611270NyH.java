package X;

import com.ss.android.ugc.aweme.feed.model.story.UserStory;

/* JADX INFO: renamed from: X.0NyH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.base.service.StoryCollectionStoreServiceImpl", f = "StoryCollectionStoreServiceImpl.kt", l = {266}, m = "updateUserStory")
public final class C611270NyH extends AbstractC23140094w {
    public Object LL;
    public UserStory LLILLJJLI;
    public long LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C611250NyF LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C611270NyH(C611250NyF c611250NyF, InterfaceC1364105Vn<? super C611270NyH> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c611250NyF;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryCollectionStoreServiceImpl@fdda.updateUserStory$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILZIL.LIZIZ(null, null, this);
        C1C7U.LIZIZ("StoryCollectionStoreServiceImpl@fdda.updateUserStory$1");
        return objLIZIZ;
    }
}
