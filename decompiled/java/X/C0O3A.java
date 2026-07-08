package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0O3A, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.localservice.optimistic.base.BaseOptimisticService$optRequest$1", f = "BaseOptimisticService.kt", l = {78, 120}, m = "invokeSuspend")
public final class C0O3A extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ List<C0O3D> LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX INFO: Incorrect field signature: TSTATE; */
    public final /* synthetic */ C0O35 LLILZIL;
    public final /* synthetic */ C0O38<STATE> LLILZLL;
    public final /* synthetic */ C0O54<REQ, RESP> LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ InterfaceC1631620sYq<STATE, Boolean, Throwable, Unit> LLJ;
    public final /* synthetic */ Function2<STATE, Boolean, Unit> LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<+LX/0O3D;>;Ljava/lang/String;TSTATE;LX/0O38<TSTATE;>;LX/0O54<TREQ;TRESP;>;ZLX/0sYq<-TSTATE;-Ljava/lang/Boolean;-Ljava/lang/Throwable;Lkotlin/Unit;>;Lkotlin/jvm/functions/Function2<-TSTATE;-Ljava/lang/Boolean;Lkotlin/Unit;>;LX/05Vn<-LX/0O3A;>;)V */
    public C0O3A(List list, String str, C0O35 c0o35, C0O38 c0o38, C0O54 c0o54, boolean z, InterfaceC1631620sYq interfaceC1631620sYq, Function2 function2, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = str;
        this.LLILZIL = c0o35;
        this.LLILZLL = c0o38;
        this.LLIZ = c0o54;
        this.LLIZLLLIL = z;
        this.LLJ = interfaceC1631620sYq;
        this.LLJI = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0O3A(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x003f -> B:19:0x004c). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0O3A.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
