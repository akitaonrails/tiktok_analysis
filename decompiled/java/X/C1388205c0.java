package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05c0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.IMGroupChatApi$Internal$downloadDFTo$1$1", f = "IMGroupChatApi.kt", l = {204, 216}, m = "invokeSuspend")
public final class C1388205c0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Function1<InterfaceC1364105Vn<? super Unit>, Object> LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1388205c0(Function1<? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function1, Function0<Unit> function0, boolean z, InterfaceC1364105Vn<? super C1388205c0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = function1;
        this.LLILZ = function0;
        this.LLILZIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1388205c0 c1388205c0 = new C1388205c0(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1388205c0.LLILLJJLI = obj;
        return c1388205c0;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1388205c0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
