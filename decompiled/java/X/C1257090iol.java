package X;

import com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0iol, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationVM$init$1$5", f = "StoryThoughtAvatarCreationVM.kt", l = {}, m = "invokeSuspend")
public final class C1257090iol extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ StoryThoughtAvatarCreationVM LL;
    public final /* synthetic */ C1257100iom LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1257090iol(StoryThoughtAvatarCreationVM storyThoughtAvatarCreationVM, C1257100iom c1257100iom, InterfaceC1364105Vn<? super C1257090iol> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = storyThoughtAvatarCreationVM;
        this.LLILLJJLI = c1257100iom;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1257090iol(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean zLJFF;
        C1C7U.LIZ("StoryThoughtAvatarCreationVM@cb29.init$1$5");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        StoryThoughtAvatarCreationVM storyThoughtAvatarCreationVM = this.LL;
        C1257100iom c1257100iom = this.LLILLJJLI;
        if (c1257100iom != null) {
            storyThoughtAvatarCreationVM.getClass();
            zLJFF = Intrinsics.LJFF(c1257100iom.LIZJ, Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        storyThoughtAvatarCreationVM.LLLI.setValue(Boolean.valueOf(zLJFF));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryThoughtAvatarCreationVM@cb29.init$1$5");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
