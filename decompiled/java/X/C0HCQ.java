package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteDataCollection;
import com.ss.android.ugc.aweme.story.note.panel.StoryNotePanelUserVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HCQ, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.note.panel.StoryNotePanelUserVM$mobStoryTryOutClick$1", f = "StoryNotePanelUserVM.kt", l = {181}, m = "invokeSuspend")
public final class C0HCQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ StoryNotePanelUserVM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HCQ(StoryNotePanelUserVM storyNotePanelUserVM, InterfaceC1364105Vn<? super C0HCQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = storyNotePanelUserVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HCQ(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("StoryNotePanelUserVM@e1c1.mobStoryTryOutClick$1");
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
            StoryNotePanelUserVM storyNotePanelUserVM = this.LLILLJJLI;
            StoryNoteDataCollection storyNoteDataCollection = storyNotePanelUserVM.LL;
            if (storyNoteDataCollection != null && (str = storyNoteDataCollection.aid) != null) {
                this.LL = 1;
                obj = storyNotePanelUserVM.wQ2(str, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("StoryNotePanelUserVM@e1c1.mobStoryTryOutClick$1");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("StoryNotePanelUserVM@e1c1.mobStoryTryOutClick$1");
            return unit;
        }
        Aweme aweme = (Aweme) obj;
        if (aweme != null) {
            C20581815gG.LIZ.getClass();
            C20581815gG.LIZJ(aweme, "thought_half_screen");
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("StoryNotePanelUserVM@e1c1.mobStoryTryOutClick$1");
            return unit2;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("StoryNotePanelUserVM@e1c1.mobStoryTryOutClick$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
