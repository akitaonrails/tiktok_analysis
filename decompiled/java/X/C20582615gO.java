package X;

import com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationVM;

/* JADX INFO: renamed from: X.15gO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationVM", f = "StoryThoughtAvatarCreationVM.kt", l = {1127, 1132}, m = "pollForAvatarResults")
public final class C20582615gO extends AbstractC23140094w {
    public Object LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ StoryThoughtAvatarCreationVM LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20582615gO(StoryThoughtAvatarCreationVM storyThoughtAvatarCreationVM, InterfaceC1364105Vn<? super C20582615gO> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = storyThoughtAvatarCreationVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryThoughtAvatarCreationVM@cb29.pollForAvatarResults$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objTQ2 = this.LLILZ.TQ2(null, this);
        C1C7U.LIZIZ("StoryThoughtAvatarCreationVM@cb29.pollForAvatarResults$1");
        return objTQ2;
    }
}
