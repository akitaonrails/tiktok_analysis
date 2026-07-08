package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0El4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.portrait.cutout.toolbar.CutoutToolBarComponent$initResources$1", f = "CutoutToolBarComponent.kt", l = {550, 561, 569}, m = "invokeSuspend")
public final class C373760El4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C354690DvP LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C373720El0 LLILZ;
    public final /* synthetic */ InterfaceC360730ECh LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C373760El4(C373720El0 c373720El0, InterfaceC360730ECh interfaceC360730ECh, InterfaceC1364105Vn<? super C373760El4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c373720El0;
        this.LLILZIL = interfaceC360730ECh;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C373760El4(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0148 A[EDGE_INSN: B:57:0x0148->B:49:0x0148 BREAK  A[LOOP:0: B:44:0x0134->B:59:?], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v41, types: [T, X.0ElE] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C373760El4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
