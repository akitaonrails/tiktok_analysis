package X;

import com.ss.android.ugc.aweme.story.note.draft.StoryThoughtDraftViewModel;

/* JADX INFO: renamed from: X.0DUW, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.note.draft.StoryThoughtDraftViewModel", f = "StoryThoughtDraftViewModel.kt", l = {168, 172, 175, 177}, m = "requestDraftResults")
public final class C0DUW extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public C817600W5m LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ StoryThoughtDraftViewModel LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DUW(StoryThoughtDraftViewModel storyThoughtDraftViewModel, InterfaceC1364105Vn<? super C0DUW> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = storyThoughtDraftViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryThoughtDraftViewModel@35b7.requestDraftResults$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLILZLL.vQ2(null, this);
        C1C7U.LIZIZ("StoryThoughtDraftViewModel@35b7.requestDraftResults$1");
        return objVQ2;
    }
}
