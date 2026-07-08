package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01lA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.aigc.usecase.AIGCProgressCalculationUseCase$generationStageCountDown$1", f = "AIGCProgressCalculationUseCase.kt", l = {166, 177}, m = "invokeSuspend")
public final class C425801lA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public final /* synthetic */ C426001lC LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ long LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C425801lA(C426001lC c426001lC, int i, int i2, long j, InterfaceC1364105Vn<? super C425801lA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c426001lC;
        this.LLILZLL = i;
        this.LLIZ = i2;
        this.LLIZLLLIL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C425801lA(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x001f, code lost:
    
        r0 = r0 - r6;
        r18.LLILZIL.LIZIZ.setValue(X.C2286608xc.LJ(r13));
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0089 -> B:7:0x001e). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C425801lA.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
