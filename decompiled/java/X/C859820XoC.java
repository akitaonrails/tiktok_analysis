package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0XoC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.effectcreatormobile.infrastructure.seqmgr.impl.AnimSeqShowMgrImpl$launchDoAnimLoop$loopBlock$1", f = "AnimSeqShowMgrImpl.kt", l = {187}, m = "invokeSuspend")
public final class C859820XoC extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public float LLILLL;
    public int LLILZ;
    public final /* synthetic */ C859810XoB LLILZIL;
    public final /* synthetic */ C013C LLILZLL;
    public final /* synthetic */ C118300cf LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C859820XoC(C859810XoB c859810XoB, C013C c013c, C118300cf c118300cf, InterfaceC1364105Vn<? super C859820XoC> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILZIL = c859810XoB;
        this.LLILZLL = c013c;
        this.LLIZ = c118300cf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C859820XoC(this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0045  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0079 -> B:6:0x0020). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C859820XoC.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
