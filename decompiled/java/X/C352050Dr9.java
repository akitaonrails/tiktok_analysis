package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dr9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.edit.audioedit.record.AERecordUIComponent$initOriginWaveData$1", f = "AERecordUIComponent.kt", l = {483}, m = "invokeSuspend")
public final class C352050Dr9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public final /* synthetic */ C12SE LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C352050Dr9(C12SE c12se, InterfaceC1364105Vn<? super C352050Dr9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c12se;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C352050Dr9(this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029 A[LOOP:0: B:7:0x0027->B:8:0x0029, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x01e4 -> B:6:0x0023). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) throws java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C352050Dr9.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
