package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteDataCollection;
import com.ss.android.ugc.aweme.story.note.panel.StoryNotePanelUserVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS236S0000000_6;
import njp.a;

/* JADX INFO: renamed from: X.0HGt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.note.panel.StoryNotePanelUserVM$onStoryNotePanelViewed$1", f = "StoryNotePanelUserVM.kt", l = {172}, m = "invokeSuspend")
public final class C438330HGt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ StoryNotePanelUserVM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C438330HGt(StoryNotePanelUserVM storyNotePanelUserVM, InterfaceC1364105Vn<? super C438330HGt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = storyNotePanelUserVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C438330HGt(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Story story;
        Object objWQ2 = obj;
        C1C7U.LIZ("StoryNotePanelUserVM@e1c1.onStoryNotePanelViewed$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objWQ2);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objWQ2);
            StoryNotePanelUserVM storyNotePanelUserVM = this.LLILLJJLI;
            StoryNoteDataCollection storyNoteDataCollection = storyNotePanelUserVM.LL;
            if (storyNoteDataCollection != null && (str = storyNoteDataCollection.aid) != null) {
                this.LL = 1;
                objWQ2 = storyNotePanelUserVM.wQ2(str, this);
                if (objWQ2 == objLJFF) {
                    C1C7U.LIZIZ("StoryNotePanelUserVM@e1c1.onStoryNotePanelViewed$1");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("StoryNotePanelUserVM@e1c1.onStoryNotePanelViewed$1");
            return unit;
        }
        Aweme aweme = (Aweme) objWQ2;
        if (aweme != null) {
            this.LLILLJJLI.getClass();
            C1605650rsx.LIZIZ.LJIIJ(EnumC1615506Uf.STORY, AwemeExtKt.getAuthorUid(aweme), aweme.getAid(), AFwS236S0000000_6.get$arr$(7));
            this.LLILLJJLI.getClass();
            Story story2 = aweme.getStory();
            if (story2 != null && !story2.viewed) {
                Story story3 = aweme.getStory();
                if (story3 != null && !story3.isFaked() && (story = aweme.getStory()) != null && !story.isPublishing()) {
                    String aid = aweme.getAid();
                    if (aid != null) {
                        Story story4 = aweme.getStory();
                        if (story4 != null) {
                            story4.setViewed(true);
                        }
                        C728090ShD.LIZ.LIZJ(AwemeExtKt.getAuthorUid(aweme), aid);
                        C1618440sDa.LIZIZ.LJJIIJ().LIZIZ(null, aid, AwemeExtKt.getAuthorUid(aweme));
                        String aid2 = aweme.getAid();
                        String str2 = "";
                        if (aid2 == null) {
                            aid2 = "";
                        }
                        int awemeType = aweme.getAwemeType();
                        String requestId = aweme.getRequestId();
                        if (requestId != null) {
                            str2 = requestId;
                        }
                        C1387270mCj.LIZ(-1, awemeType, aweme, "", aid2, str2);
                    }
                } else {
                    Story story5 = aweme.getStory();
                    if (story5 != null) {
                        story5.setViewed(true);
                    }
                }
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("StoryNotePanelUserVM@e1c1.onStoryNotePanelViewed$1");
            return unit2;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("StoryNotePanelUserVM@e1c1.onStoryNotePanelViewed$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
