package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0931, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", l = {54, 76, 79}, m = "invokeSuspend")
public final class AnonymousClass0931 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C095E LL;
    public byte[] LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ InterfaceC346201Wa<Object>[] LLIZ;
    public final /* synthetic */ Function0<Object[]> LLIZLLLIL;
    public final /* synthetic */ InterfaceC1631620sYq<InterfaceC346701Wf<Object>, Object[], InterfaceC1364105Vn<? super Unit>, Object> LLJ;
    public final /* synthetic */ InterfaceC346701Wf<Object> LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0931(InterfaceC1364105Vn interfaceC1364105Vn, Function0 function0, InterfaceC1631620sYq interfaceC1631620sYq, InterfaceC346701Wf interfaceC346701Wf, InterfaceC346201Wa[] interfaceC346201WaArr) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = interfaceC346201WaArr;
        this.LLIZLLLIL = function0;
        this.LLJ = interfaceC1631620sYq;
        this.LLJI = interfaceC346701Wf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        AnonymousClass0931 anonymousClass0931 = new AnonymousClass0931(interfaceC1364105Vn, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLIZ);
        anonymousClass0931.LLILZLL = obj;
        return anonymousClass0931;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0021, code lost:
    
        if (r2 != 0) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0065 A[LOOP:0: B:17:0x0065->B:45:?, LOOP_START, PHI: r2 r7
      0x0065: PHI (r2v2 int) = (r2v1 int), (r2v3 int) binds: [B:14:0x0060, B:45:?] A[DONT_GENERATE, DONT_INLINE]
      0x0065: PHI (r7v5 kotlin.collections.IndexedValue) = (r7v4 kotlin.collections.IndexedValue), (r7v12 kotlin.collections.IndexedValue) binds: [B:14:0x0060, B:45:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00a6 -> B:8:0x0021). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00c3 -> B:8:0x0021). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0931.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
