package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryCurrentInfo;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.api.StoryApi;
import com.ss.android.ugc.aweme.story.reveal.TiktokV1StoryGetUserRevealStoriesResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.06Y2, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.api.StoryApiHelper$getRevealUserStory$1", f = "StoryApiHelper.kt", l = {129, 137}, m = "invokeSuspend")
public final class C06Y2 extends C09AX implements Function2<InterfaceC346701Wf<? super UserStoryResponse>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06Y2(long j, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = j;
        this.LLILZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C06Y2 c06y2 = new C06Y2(this.LLILLL, interfaceC1364105Vn, this.LLILZ);
        c06y2.LLILLJJLI = obj;
        return c06y2;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC346701Wf interfaceC346701Wf;
        String uid;
        TiktokV1StoryGetUserRevealStoriesResponse tiktokV1StoryGetUserRevealStoriesResponse;
        ArrayList arrayList;
        long jLongValue;
        long jLongValue2;
        boolean zBooleanValue;
        long jLongValue3;
        long jLongValue4;
        Object userRevealStories = obj;
        C1C7U.LIZ("StoryApiHelper@d003.getRevealUserStory$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(userRevealStories);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("StoryApiHelper@d003.getRevealUserStory$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
            try {
                C155000ia.LIZIZ(userRevealStories);
            } catch (Exception e) {
                e = e;
                TryCatchGuardChecker.doCheck(e);
                tiktokV1StoryGetUserRevealStoriesResponse = new TiktokV1StoryGetUserRevealStoriesResponse(null, null, null, null, null, null, null, null, null, 511, null);
            }
        } else {
            C155000ia.LIZIZ(userRevealStories);
            interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
            try {
                StoryApi storyApi = StoryApi.LIZIZ;
                Long lLJFF = C2286608xc.LJFF(this.LLILLL);
                Boolean boolValueOf = Boolean.valueOf(this.LLILZ);
                this.LLILLJJLI = interfaceC346701Wf;
                this.LL = 1;
                User userLIZLLL = C461720I8s.LIZLLL();
                if (userLIZLLL != null) {
                    uid = userLIZLLL.getUid();
                } else {
                    uid = null;
                }
                userRevealStories = storyApi.getUserRevealStories(46, lLJFF, null, boolValueOf, uid, this);
                if (userRevealStories == objLJFF) {
                    C1C7U.LIZIZ("StoryApiHelper@d003.getRevealUserStory$1");
                    return objLJFF;
                }
            } catch (Exception e2) {
                e = e2;
                TryCatchGuardChecker.doCheck(e);
                tiktokV1StoryGetUserRevealStoriesResponse = new TiktokV1StoryGetUserRevealStoriesResponse(null, null, null, null, null, null, null, null, null, 511, null);
            }
        }
        tiktokV1StoryGetUserRevealStoriesResponse = (TiktokV1StoryGetUserRevealStoriesResponse) userRevealStories;
        List<Aweme> list = tiktokV1StoryGetUserRevealStoriesResponse.stories;
        if (list != null) {
            arrayList = new ArrayList(list);
        } else {
            arrayList = new ArrayList();
        }
        Long l = tiktokV1StoryGetUserRevealStoriesResponse.totalCount;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        Long l2 = tiktokV1StoryGetUserRevealStoriesResponse.currentPosition;
        if (l2 != null) {
            jLongValue2 = l2.longValue();
        } else {
            jLongValue2 = 0;
        }
        Boolean bool = tiktokV1StoryGetUserRevealStoriesResponse.allViewed;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        Boolean bool2 = tiktokV1StoryGetUserRevealStoriesResponse.hasMoreAfter;
        Boolean bool3 = Boolean.TRUE;
        boolean zLJFF = Intrinsics.LJFF(bool2, bool3);
        boolean zLJFF2 = Intrinsics.LJFF(tiktokV1StoryGetUserRevealStoriesResponse.hasMoreBefore, bool3);
        Long l3 = tiktokV1StoryGetUserRevealStoriesResponse.minCursor;
        if (l3 != null) {
            jLongValue3 = l3.longValue();
        } else {
            jLongValue3 = 0;
        }
        Long l4 = tiktokV1StoryGetUserRevealStoriesResponse.maxCursor;
        if (l4 != null) {
            jLongValue4 = l4.longValue();
        } else {
            jLongValue4 = 0;
        }
        UserStoryResponse userStoryResponse = new UserStoryResponse(new UserStory(arrayList, jLongValue, jLongValue2, zBooleanValue, jLongValue3, jLongValue4, zLJFF, zLJFF2, 0L, false, null, null, false, null, 0L, new UserStoryCurrentInfo(null, null, 0), false, false, new UserStoryCurrentInfo(-1, null, 0), (int) jLongValue2, false, 0L, null, false));
        userStoryResponse.extra = tiktokV1StoryGetUserRevealStoriesResponse.extra;
        this.LLILLJJLI = null;
        this.LL = 2;
        if (interfaceC346701Wf.emit(userStoryResponse, this) == objLJFF) {
            C1C7U.LIZIZ("StoryApiHelper@d003.getRevealUserStory$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("StoryApiHelper@d003.getRevealUserStory$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super UserStoryResponse> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
