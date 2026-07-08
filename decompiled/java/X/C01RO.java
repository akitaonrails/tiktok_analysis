package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01RO, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.hook.AfterLoginHook$Companion$createAfterLoginHookForJava$2", f = "AfterLoginHook.kt", l = {}, m = "invokeSuspend")
public final class C01RO extends C09AX implements Function2<C0XVI, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ Function1<C0XVI, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C01RO(Function1<? super C0XVI, Unit> function1, InterfaceC1364105Vn<? super C01RO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C01RO c01ro = new C01RO(this.LLILLJJLI, interfaceC1364105Vn);
        c01ro.LL = obj;
        return c01ro;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AfterLoginHook$Companion@35b8.createAfterLoginHookForJava$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LLILLJJLI.invoke((C0XVI) this.LL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AfterLoginHook$Companion@35b8.createAfterLoginHookForJava$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C0XVI c0xvi, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c0xvi, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
