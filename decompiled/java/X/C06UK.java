package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.highlights.feed.BaseProfileStoryHighlightsFeedSharedVM;
import com.ss.android.ugc.profile.business.profile.ui.v2.UserProfileAbility;
import com.ss.android.ugc.profile.platform.business.header.business.storyhighlights.business.HeaderStoryHighlightsOtherCollectionComponent;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06UK, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.profile.platform.business.header.business.storyhighlights.business.HeaderStoryHighlightsOtherCollectionComponent$getHighlightsAdapter$1$1", f = "HeaderStoryHighlightsOtherCollectionComponent.kt", l = {}, m = "invokeSuspend")
public final class C06UK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ HeaderStoryHighlightsOtherCollectionComponent LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ StoryHighlightCollection LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06UK(HeaderStoryHighlightsOtherCollectionComponent headerStoryHighlightsOtherCollectionComponent, Context context, StoryHighlightCollection storyHighlightCollection, InterfaceC1364105Vn<? super C06UK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = headerStoryHighlightsOtherCollectionComponent;
        this.LLILLJJLI = context;
        this.LLILLL = storyHighlightCollection;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06UK(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        User user;
        String str;
        C1C7U.LIZ("HeaderStoryHighlightsOtherCollectionComponent@a2a.getHighlightsAdapter$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        UserProfileAbility userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), UserProfileAbility.class, null);
        if (userProfileAbility != null && (user = userProfileAbility.getUser()) != null) {
            BaseProfileStoryHighlightsFeedSharedVM baseProfileStoryHighlightsFeedSharedVM = (BaseProfileStoryHighlightsFeedSharedVM) this.LL.LLJJLIIIJLLLLLLLZ.getValue();
            Context context = this.LLILLJJLI;
            List<StoryHighlightCollection> list = this.LL.zp().getState().LL;
            StoryHighlightCollection storyHighlightCollection = this.LLILLL;
            if (storyHighlightCollection == null || (str = storyHighlightCollection.collectionId) == null) {
                str = "";
            }
            baseProfileStoryHighlightsFeedSharedVM.FQ2(context, "other_profile", list, str, user, "others_homepage", new C5183020f((Map) this.LL.zp().getState().LLILLJJLI, (Map<String, String>) 211));
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("HeaderStoryHighlightsOtherCollectionComponent@a2a.getHighlightsAdapter$1$1");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("HeaderStoryHighlightsOtherCollectionComponent@a2a.getHighlightsAdapter$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
