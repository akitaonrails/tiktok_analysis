package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryResponse;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06WV, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.api.StoryApiHelper$getStoryHighlightUserStory$1$1", f = "StoryApiHelper.kt", l = {}, m = "invokeSuspend")
public final class C06WV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ UserStoryResponse LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06WV(UserStoryResponse userStoryResponse, InterfaceC1364105Vn<? super C06WV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = userStoryResponse;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06WV(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Aweme awemeLLILLL;
        Story story;
        C1C7U.LIZ("StoryApiHelper@d003.getStoryHighlightUserStory$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<Aweme> stories = this.LL.getUserStory().getStories();
        UserStoryResponse userStoryResponse = this.LL;
        int i = 0;
        for (Aweme aweme : stories) {
            int i2 = i + 1;
            if (i >= 0) {
                Aweme aweme2 = aweme;
                List<Aweme> stories2 = userStoryResponse.getUserStory().getStories();
                IAwemeService iAwemeService = (IAwemeService) PluggableExtentionKt.pluggableSpi$default(IAwemeService.class, false, false, false, 14, null);
                if (iAwemeService == null || (awemeLLILLL = iAwemeService.LLILLL(aweme2)) == null) {
                    awemeLLILLL = aweme2;
                }
                ListProtector.set(stories2, i, awemeLLILLL);
                if (((Boolean) C06WU.LIZ.getValue()).booleanValue() && (story = aweme2.getStory()) != null) {
                    story.setViewed(false);
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryApiHelper@d003.getStoryHighlightUserStory$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
