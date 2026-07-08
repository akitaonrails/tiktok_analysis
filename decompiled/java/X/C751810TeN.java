package X;

import com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationFragment;
import com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TeN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationFragment$initViews$13$1$1", f = "StoryThoughtAvatarCreationFragment.kt", l = {333}, m = "invokeSuspend")
public final class C751810TeN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ StoryThoughtAvatarCreationFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C751810TeN(StoryThoughtAvatarCreationFragment storyThoughtAvatarCreationFragment, InterfaceC1364105Vn<? super C751810TeN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = storyThoughtAvatarCreationFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C751810TeN(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryThoughtAvatarCreationFragment@ce9f.initViews$13$1$1");
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
            StoryThoughtAvatarCreationVM storyThoughtAvatarCreationVMWR = this.LLILLJJLI.WR();
            this.LL = 1;
            if (storyThoughtAvatarCreationVMWR.yQ2(this) == objLJFF) {
                C1C7U.LIZIZ("StoryThoughtAvatarCreationFragment@ce9f.initViews$13$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryThoughtAvatarCreationFragment@ce9f.initViews$13$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
