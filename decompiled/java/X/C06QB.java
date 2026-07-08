package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.story.StreakStoryFeature;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.model.streaks.StoryStreakEnterEditParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06QB, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.saas.host.impl.streak.SingleChatPostStreakToStoryHandler$postToStory$1$1", f = "SingleChatPostStreakToStoryHandler.kt", l = {}, m = "invokeSuspend")
public final class C06QB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C06QD LL;
    public final /* synthetic */ User LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06QB(C06QD c06qd, User user, boolean z, InterfaceC1364105Vn<? super C06QB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c06qd;
        this.LLILLJJLI = user;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06QB(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Activity activityLIZIZ;
        C1C7U.LIZ("SingleChatPostStreakToStoryHandler@3957.postToStory$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null) {
            StreakStoryFeature streakStoryFeatureLIZ = StreakStoryFeature.LIZ.LIZ();
            if (streakStoryFeatureLIZ != null) {
                C06QD c06qd = this.LL;
                int i = c06qd.LIZIZ;
                int i2 = c06qd.LJI;
                String conversationId = c06qd.LIZ.getConversationId();
                User user = this.LLILLJJLI;
                String singleChatFromUserId = this.LL.LIZ.getSingleChatFromUserId();
                if (singleChatFromUserId == null) {
                    singleChatFromUserId = "";
                }
                streakStoryFeatureLIZ.LIZIZ(activityLIZIZ, new StoryStreakEnterEditParam("chat", "milestone_popup_window", i, i2, conversationId, 0, user, singleChatFromUserId, this.LLILLL, "", "", false, this.LL.LIZJ, 0));
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SingleChatPostStreakToStoryHandler@3957.postToStory$1$1");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SingleChatPostStreakToStoryHandler@3957.postToStory$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
