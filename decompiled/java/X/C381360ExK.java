package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ExK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.task.template.tasks.TemplateCombineEffectTask$processCombineEffectInfoList$jobs$1$1", f = "TemplateCombineEffectTask.kt", l = {318, 111}, m = "invokeSuspend")
public final class C381360ExK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC1337805Lk LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public int LLILZLL;
    public final /* synthetic */ InterfaceC1337805Lk LLIZ;
    public final /* synthetic */ C0FQS LLIZLLLIL;
    public final /* synthetic */ C381340ExI LLJ;
    public final /* synthetic */ C381370ExL LLJI;
    public final /* synthetic */ List<C381340ExI> LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C381360ExK(InterfaceC1337805Lk interfaceC1337805Lk, C0FQS c0fqs, C381340ExI c381340ExI, C381370ExL c381370ExL, List<C381340ExI> list, InterfaceC1364105Vn<? super C381360ExK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = interfaceC1337805Lk;
        this.LLIZLLLIL = c0fqs;
        this.LLJ = c381340ExI;
        this.LLJI = c381370ExL;
        this.LLJIJIL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C381360ExK(this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(1:(1:(5:6|48|7|36|37)(2:10|11))(1:12))(4:13|(0)|15|16)|50|17|(1:23)(1:21)|22|(3:25|15|16)|36|37|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b3, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b5, code lost:
    
        r3 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.0ExL, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [X.0L8m] */
    /* JADX WARN: Type inference failed for: r5v6, types: [X.0L8j] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C381360ExK.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
