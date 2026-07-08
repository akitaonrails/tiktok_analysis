package X;

import com.ss.android.ugc.aweme.story.note.draft.StoryThoughtDraftService;

/* JADX INFO: renamed from: X.15gJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.note.draft.StoryThoughtDraftService", f = "StoryThoughtDraftService.kt", l = {61, 65}, m = "createDraft")
public final class C20582115gJ extends AbstractC23140094w {
    public C817600W5m LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ StoryThoughtDraftService LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20582115gJ(StoryThoughtDraftService storyThoughtDraftService, InterfaceC1364105Vn<? super C20582115gJ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = storyThoughtDraftService;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryThoughtDraftService@20f9.createDraft$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJIIIIZZ = this.LLILLL.LJIIIIZZ(null, null, null, null, null, this);
        C1C7U.LIZIZ("StoryThoughtDraftService@20f9.createDraft$1");
        return objLJIIIIZZ;
    }
}
