package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteDataCollection;
import com.ss.android.ugc.aweme.story.note.panel.StoryNotePanelAuthorVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05dt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.note.panel.StoryNotePanelAuthorVM$onStoryNotePublishFinished$1", f = "StoryNotePanelAuthorVM.kt", l = {292}, m = "invokeSuspend")
public final class C1399905dt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ StoryNotePanelAuthorVM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1399905dt(StoryNotePanelAuthorVM storyNotePanelAuthorVM, InterfaceC1364105Vn<? super C1399905dt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = storyNotePanelAuthorVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1399905dt(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("StoryNotePanelAuthorVM@8a90.onStoryNotePublishFinished$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            StoryNotePanelAuthorVM storyNotePanelAuthorVM = this.LLILLJJLI;
            StoryNoteDataCollection storyNoteDataCollection = storyNotePanelAuthorVM.LL;
            if (storyNoteDataCollection != null && (str = storyNoteDataCollection.aid) != null) {
                this.LL = 1;
                obj = storyNotePanelAuthorVM.vQ2(str, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("StoryNotePanelAuthorVM@8a90.onStoryNotePublishFinished$1");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("StoryNotePanelAuthorVM@8a90.onStoryNotePublishFinished$1");
            return unit;
        }
        Aweme aweme = (Aweme) obj;
        if (aweme != null) {
            this.LLILLJJLI.getClass();
            StoryNotePanelAuthorVM.yQ2(aweme);
            this.LLILLJJLI.wQ2(aweme);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("StoryNotePanelAuthorVM@8a90.onStoryNotePublishFinished$1");
            return unit2;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("StoryNotePanelAuthorVM@8a90.onStoryNotePublishFinished$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
