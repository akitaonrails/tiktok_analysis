package X;

import com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.15gD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationVM$onAvatarThoughtGenerateStart$1", f = "StoryThoughtAvatarCreationVM.kt", l = {1020, 1023, 1028, 1036}, m = "invokeSuspend")
public final class C20581515gD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ StoryThoughtAvatarCreationVM LLILZ;
    public final /* synthetic */ Function1<Integer, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C20581515gD(StoryThoughtAvatarCreationVM storyThoughtAvatarCreationVM, Function1<? super Integer, Unit> function1, InterfaceC1364105Vn<? super C20581515gD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = storyThoughtAvatarCreationVM;
        this.LLILZIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C20581515gD c20581515gD = new C20581515gD(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c20581515gD.LLILLL = obj;
        return c20581515gD;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0122  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20581515gD.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
