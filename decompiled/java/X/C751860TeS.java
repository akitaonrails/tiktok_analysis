package X;

import com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TeS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationFragment$initObservers$24$1", f = "StoryThoughtAvatarCreationFragment.kt", l = {696}, m = "invokeSuspend")
public final class C751860TeS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ StoryThoughtAvatarCreationFragment LLILLJJLI;
    public final /* synthetic */ C20580115fz LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C751860TeS(StoryThoughtAvatarCreationFragment storyThoughtAvatarCreationFragment, C20580115fz c20580115fz, InterfaceC1364105Vn<? super C751860TeS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = storyThoughtAvatarCreationFragment;
        this.LLILLL = c20580115fz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C751860TeS(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryThoughtAvatarCreationFragment@ce9f.initObservers$24$1");
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
            C751870TeT c751870TeT = new C751870TeT(this.LLILLJJLI, this.LLILLL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, c1dfb, c751870TeT) == objLJFF) {
                C1C7U.LIZIZ("StoryThoughtAvatarCreationFragment@ce9f.initObservers$24$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryThoughtAvatarCreationFragment@ce9f.initObservers$24$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
