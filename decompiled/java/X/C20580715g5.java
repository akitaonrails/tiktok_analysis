package X;

import com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationVM;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.15g5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationVM$onAvatarThoughtGenerateStart$1$1", f = "StoryThoughtAvatarCreationVM.kt", l = {}, m = "invokeSuspend")
public final class C20580715g5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ StoryThoughtAvatarCreationVM LL;
    public final /* synthetic */ Function1<Integer, Unit> LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C20580715g5(StoryThoughtAvatarCreationVM storyThoughtAvatarCreationVM, Function1<? super Integer, Unit> function1, String str, InterfaceC1364105Vn<? super C20580715g5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = storyThoughtAvatarCreationVM;
        this.LLILLJJLI = function1;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20580715g5(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryThoughtAvatarCreationVM@cb29.onAvatarThoughtGenerateStart$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LLLIL.setValue(EnumC339980DUm.IN_PROGRESS);
        Function1<Integer, Unit> function1 = this.LLILLJJLI;
        List list = (List) this.LL.LLLIZZ.getValue();
        EnumC1405120mfW enumC1405120mfW = EnumC1405120mfW.GENERATED_AVATAR;
        function1.invoke(C2286608xc.LJ(list.indexOf(enumC1405120mfW)));
        this.LL.LLLJ.setValue(enumC1405120mfW);
        this.LL.LLLLL.setValue(this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryThoughtAvatarCreationVM@cb29.onAvatarThoughtGenerateStart$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
