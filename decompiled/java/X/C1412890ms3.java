package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ms3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.operation.MaterialOperationDownloadDelegate$showMusicCapsuleLoading$1", f = "MaterialOperationDownloadDelegate.kt", l = {}, m = "invokeSuspend")
public final class C1412890ms3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1412860ms0 LL;
    public final /* synthetic */ C1412900ms4 LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1412890ms3(C1412860ms0 c1412860ms0, C1412900ms4 c1412900ms4, boolean z, int i, boolean z2, boolean z3, InterfaceC1364105Vn<? super C1412890ms3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1412860ms0;
        this.LLILLJJLI = c1412900ms4;
        this.LLILLL = z;
        this.LLILZ = i;
        this.LLILZIL = z2;
        this.LLILZLL = z3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1412890ms3(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
    
        if (r0 == false) goto L10;
     */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1412890ms3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
