package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.feed.immersive.component.post.HighlightStoryTagComponent;
import com.ss.android.ugc.aweme.story.highlights.feed.InboxSkylightHighlightsCellFeedSharedVM;
import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightsAwemeDetailResponse;
import com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Tj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.feed.immersive.component.post.HighlightStoryTagComponent$jumpToHighlightsFeed$1", f = "HighlightStoryTagComponent.kt", l = {128}, m = "invokeSuspend")
public final class C1613306Tj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public IStoryHighlightsMyDataManager LL;
    public DialogInterfaceC21560019Ze LLILLJJLI;
    public C013C LLILLL;
    public AnonymousClass0956 LLILZ;
    public int LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ HighlightStoryTagComponent LLIZLLLIL;
    public final /* synthetic */ Context LLJ;
    public final /* synthetic */ User LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1613306Tj(String str, HighlightStoryTagComponent highlightStoryTagComponent, Context context, User user, InterfaceC1364105Vn<? super C1613306Tj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = str;
        this.LLIZLLLIL = highlightStoryTagComponent;
        this.LLJ = context;
        this.LLJI = user;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1613306Tj c1613306Tj = new C1613306Tj(this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
        c1613306Tj.LLILZLL = obj;
        return c1613306Tj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        IStoryHighlightsMyDataManager iStoryHighlightsMyDataManager;
        DialogInterfaceC21560019Ze dialogInterfaceC21560019ZeLIZ;
        C013C c013c;
        AnonymousClass0956 anonymousClass0956LIZLLL;
        String str;
        StoryHighlightsAwemeDetailResponse storyHighlightsAwemeDetailResponseLJIJJ;
        Object objLJLIIIL = obj;
        C1C7U.LIZ("HighlightStoryTagComponent@e5f5.jumpToHighlightsFeed$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZIL;
        if (i != 0) {
            if (i == 1) {
                anonymousClass0956LIZLLL = this.LLILZ;
                c013c = this.LLILLL;
                dialogInterfaceC21560019ZeLIZ = this.LLILLJJLI;
                iStoryHighlightsMyDataManager = this.LL;
                str = (String) this.LLILZLL;
                C155000ia.LIZIZ(objLJLIIIL);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJLIIIL);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILZLL;
            iStoryHighlightsMyDataManager = (IStoryHighlightsMyDataManager) PluggableExtentionKt.pluggableSpi$default(IStoryHighlightsMyDataManager.class, false, false, false, 14, null);
            if (iStoryHighlightsMyDataManager != null && (storyHighlightsAwemeDetailResponseLJIJJ = iStoryHighlightsMyDataManager.LJIJJ(this.LLIZ)) != null) {
                ((InboxSkylightHighlightsCellFeedSharedVM) this.LLIZLLLIL.LLLFF.getValue()).FQ2(this.LLJ, storyHighlightsAwemeDetailResponseLJIJJ, this.LLIZ, this.LLJI);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("HighlightStoryTagComponent@e5f5.jumpToHighlightsFeed$1");
                return unit;
            }
            HighlightStoryTagComponent highlightStoryTagComponent = this.LLIZLLLIL;
            Context context = this.LLJ;
            highlightStoryTagComponent.getClass();
            C1749280vcc c1749280vcc = new C1749280vcc(context, null, 6);
            c1749280vcc.LJ();
            C21560119Zf c21560119Zf = new C21560119Zf(context);
            c21560119Zf.LIZ.LJIJI = c1749280vcc;
            dialogInterfaceC21560019ZeLIZ = c21560119Zf.LIZ();
            Window window = dialogInterfaceC21560019ZeLIZ.getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            Window window2 = dialogInterfaceC21560019ZeLIZ.getWindow();
            if (window2 != null) {
                window2.clearFlags(2);
            }
            C1440005kM.LIZ(new C453940Hr6(true, false, 6));
            C099G c099gLIZIZ = C23250099c.LIZIZ(interfaceC497601wk, C0PEM.LIZJ, null, new C1613006Tg(this.LLIZ, this.LLIZLLLIL, null), 2);
            c013c = new C013C();
            anonymousClass0956LIZLLL = C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1613106Th(c099gLIZIZ, dialogInterfaceC21560019ZeLIZ, c013c, null), 3);
            str = "inbox";
            this.LLILZLL = "inbox";
            this.LL = iStoryHighlightsMyDataManager;
            this.LLILLJJLI = dialogInterfaceC21560019ZeLIZ;
            this.LLILLL = c013c;
            this.LLILZ = anonymousClass0956LIZLLL;
            this.LLILZIL = 1;
            objLJLIIIL = c099gLIZIZ.LJLIIIL(this);
            if (objLJLIIIL == objLJFF) {
                C1C7U.LIZIZ("HighlightStoryTagComponent@e5f5.jumpToHighlightsFeed$1");
                return objLJFF;
            }
        }
        StoryHighlightsAwemeDetailResponse storyHighlightsAwemeDetailResponse = (StoryHighlightsAwemeDetailResponse) objLJLIIIL;
        anonymousClass0956LIZLLL.LIZIZ(null);
        if (storyHighlightsAwemeDetailResponse != null) {
            if (iStoryHighlightsMyDataManager != null) {
                iStoryHighlightsMyDataManager.LJIILIIL(this.LLIZ, str, storyHighlightsAwemeDetailResponse);
            }
            ((InboxSkylightHighlightsCellFeedSharedVM) this.LLIZLLLIL.LLLFF.getValue()).FQ2(this.LLJ, storyHighlightsAwemeDetailResponse, this.LLIZ, this.LLJI);
        }
        if (c013c.element) {
            dialogInterfaceC21560019ZeLIZ.dismiss();
            C785410UrT.LIZ(dialogInterfaceC21560019ZeLIZ);
        }
        C1440005kM.LIZ(new C453940Hr6(false, false, 6));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("HighlightStoryTagComponent@e5f5.jumpToHighlightsFeed$1");
        return unit2;
    }
}
