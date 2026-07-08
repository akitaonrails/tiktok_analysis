package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.feed.immersive.component.toparea.centerrow2.p1.StoryHighlightsAnchorComponent;
import com.ss.android.ugc.aweme.story.highlights.feed.BaseStoryHighlightsFeedSharedVM;
import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightsAwemeDetailResponse;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Tk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.feed.immersive.component.toparea.centerrow2.p1.StoryHighlightsAnchorComponent$onBind$1$1", f = "StoryHighlightsAnchorComponent.kt", l = {144}, m = "invokeSuspend")
public final class C1613406Tk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ StoryHighlightsAnchorComponent LLILLJJLI;
    public final /* synthetic */ View LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ VideoItemParams LLILZIL;
    public final /* synthetic */ User LLILZLL;
    public final /* synthetic */ DialogInterfaceC21560019Ze LLIZ;
    public final /* synthetic */ String LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1613406Tk(StoryHighlightsAnchorComponent storyHighlightsAnchorComponent, View view, String str, VideoItemParams videoItemParams, User user, DialogInterfaceC21560019Ze dialogInterfaceC21560019Ze, String str2, InterfaceC1364105Vn<? super C1613406Tk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = storyHighlightsAnchorComponent;
        this.LLILLL = view;
        this.LLILZ = str;
        this.LLILZIL = videoItemParams;
        this.LLILZLL = user;
        this.LLIZ = dialogInterfaceC21560019Ze;
        this.LLIZLLLIL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1613406Tk(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        UserStory userStory;
        Object objLJI = obj;
        C1C7U.LIZ("StoryHighlightsAnchorComponent@9c2e.onBind$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJI);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJI);
            C1DFB c1dfb = C0PEM.LIZJ;
            C05BM c05bm = new C05BM(this.LLILZ, this.LLIZLLLIL, null);
            this.LL = 1;
            objLJI = C23250099c.LJI(this, c1dfb, c05bm);
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("StoryHighlightsAnchorComponent@9c2e.onBind$1$1");
                return objLJFF;
            }
        }
        StoryHighlightsAwemeDetailResponse storyHighlightsAwemeDetailResponse = (StoryHighlightsAwemeDetailResponse) objLJI;
        if (storyHighlightsAwemeDetailResponse != null) {
            BaseStoryHighlightsFeedSharedVM baseStoryHighlightsFeedSharedVM = (BaseStoryHighlightsFeedSharedVM) this.LLILLJJLI.LLJZ.getValue();
            Context context = this.LLILLL.getContext();
            String str = this.LLILZ;
            String str2 = this.LLILZIL.mEventType;
            User user = this.LLILZLL;
            Aweme aweme = storyHighlightsAwemeDetailResponse.getAweme();
            if (aweme != null && (userStory = aweme.getUserStory()) != null) {
                BaseStoryHighlightsFeedSharedVM.EQ2(userStory);
                aweme.setAuthor(user);
                aweme.setAwemeType(40);
                userStory.setFakeAwemeShell(true);
                baseStoryHighlightsFeedSharedVM.BQ2(context, "skylight", Collections.singletonList(aweme), str, null, str2, "", null);
            }
        }
        DialogInterfaceC21560019Ze dialogInterfaceC21560019Ze = this.LLIZ;
        dialogInterfaceC21560019Ze.dismiss();
        C785410UrT.LIZ(dialogInterfaceC21560019Ze);
        C1440005kM.LIZ(new C453940Hr6(false, false, 6));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryHighlightsAnchorComponent@9c2e.onBind$1$1");
        return unit;
    }
}
