package X;

import com.ss.android.ugc.aweme.story.note.draft.StoryThoughtDraftViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DLr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.note.draft.StoryThoughtDraftViewModel$deleteAllSelectedDrafts$1", f = "StoryThoughtDraftViewModel.kt", l = {45}, m = "invokeSuspend")
public final class C337690DLr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ StoryThoughtDraftViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C337690DLr(StoryThoughtDraftViewModel storyThoughtDraftViewModel, InterfaceC1364105Vn<? super C337690DLr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = storyThoughtDraftViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C337690DLr(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryThoughtDraftViewModel@35b7.deleteAllSelectedDrafts$1");
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
            C1DFB c1dfb = C0PEM.LIZJ;
            C337700DLs c337700DLs = new C337700DLs(this.LLILLJJLI, null);
            this.LL = 1;
            if (C23250099c.LJI(this, c1dfb, c337700DLs) == objLJFF) {
                C1C7U.LIZIZ("StoryThoughtDraftViewModel@35b7.deleteAllSelectedDrafts$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.LLILZIL.setValue(C13BV.INSTANCE);
        this.LLILLJJLI.LLILZ.setValue(false);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryThoughtDraftViewModel@35b7.deleteAllSelectedDrafts$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
