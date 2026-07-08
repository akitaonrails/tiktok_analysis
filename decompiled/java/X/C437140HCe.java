package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.note.panel.StoryNotePanelUserVM;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0HCe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.note.panel.StoryNotePanelUserVM", f = "StoryNotePanelUserVM.kt", l = {320}, m = "sendDigg")
public final class C437140HCe extends AbstractC23140094w {
    public Aweme LL;
    public Object LLILLJJLI;
    public Function1 LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ StoryNotePanelUserVM LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C437140HCe(StoryNotePanelUserVM storyNotePanelUserVM, InterfaceC1364105Vn<? super C437140HCe> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = storyNotePanelUserVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("StoryNotePanelUserVM@e1c1.sendDigg$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objZQ2 = this.LLILZLL.zQ2(null, null, 0, null, this);
        C1C7U.LIZIZ("StoryNotePanelUserVM@e1c1.sendDigg$1");
        return objZQ2;
    }
}
