package X;

import com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationVM;

/* JADX INFO: renamed from: X.15gM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationVM", f = "StoryThoughtAvatarCreationVM.kt", l = {913, 916}, m = "saveDraft")
public final class C20582415gM extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ StoryThoughtAvatarCreationVM LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20582415gM(StoryThoughtAvatarCreationVM storyThoughtAvatarCreationVM, InterfaceC1364105Vn<? super C20582415gM> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = storyThoughtAvatarCreationVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryThoughtAvatarCreationVM@cb29.saveDraft$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLILZ.VQ2(null, this);
        C1C7U.LIZIZ("StoryThoughtAvatarCreationVM@cb29.saveDraft$1");
        return objVQ2;
    }
}
