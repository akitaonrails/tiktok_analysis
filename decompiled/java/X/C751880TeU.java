package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TeU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationFragment$initObservers$24", f = "StoryThoughtAvatarCreationFragment.kt", l = {695}, m = "invokeSuspend")
public final class C751880TeU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ StoryThoughtAvatarCreationFragment LLILLJJLI;
    public final /* synthetic */ C20580115fz LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C751880TeU(StoryThoughtAvatarCreationFragment storyThoughtAvatarCreationFragment, C20580115fz c20580115fz, InterfaceC1364105Vn<? super C751880TeU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = storyThoughtAvatarCreationFragment;
        this.LLILLL = c20580115fz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C751880TeU(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryThoughtAvatarCreationFragment@ce9f.initObservers$24");
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
            Lifecycle lifecycle = this.LLILLJJLI.getViewLifecycleOwner().getLifecycle();
            Lifecycle.State state = Lifecycle.State.STARTED;
            C751860TeS c751860TeS = new C751860TeS(this.LLILLJJLI, this.LLILLL, null);
            this.LL = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, c751860TeS, this) == objLJFF) {
                C1C7U.LIZIZ("StoryThoughtAvatarCreationFragment@ce9f.initObservers$24");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryThoughtAvatarCreationFragment@ce9f.initObservers$24");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
