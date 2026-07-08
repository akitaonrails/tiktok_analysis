package X;

import com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0TeO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationFragment$saveToDraft$1$2", f = "StoryThoughtAvatarCreationFragment.kt", l = {}, m = "invokeSuspend")
public final class C751820TeO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ StoryThoughtAvatarCreationFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C751820TeO(StoryThoughtAvatarCreationFragment storyThoughtAvatarCreationFragment, InterfaceC1364105Vn<? super C751820TeO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = storyThoughtAvatarCreationFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C751820TeO(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryThoughtAvatarCreationFragment@ce9f.saveToDraft$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!((Boolean) C281270B0r.LIZIZ.getValue()).booleanValue() && !Intrinsics.LJFF(this.LL.WR().LLJZ.getValue(), true)) {
            this.LL.WR().KQ2();
        } else {
            this.LL.requireActivity().finish();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryThoughtAvatarCreationFragment@ce9f.saveToDraft$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
