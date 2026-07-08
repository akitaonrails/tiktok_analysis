package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ELB, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.startup.EditorProLoaderComponent$loaderReShowData$1", f = "EditorProLoaderComponent.kt", l = {493, 562, 584}, m = "invokeSuspend")
public final class C0ELB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public long LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C09AE LLILZIL;
    public final /* synthetic */ C0ELH LLILZLL;
    public final /* synthetic */ C0EL6 LLIZ;
    public final /* synthetic */ C0ELA LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ELB(C0ELA c0ela, C0ELH c0elh, C0EL6 c0el6, InterfaceC1364105Vn interfaceC1364105Vn, C09AE c09ae) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c09ae;
        this.LLILZLL = c0elh;
        this.LLIZ = c0el6;
        this.LLIZLLLIL = c0ela;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C09AE c09ae = this.LLILZIL;
        C0ELB c0elb = new C0ELB(this.LLIZLLLIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn, c09ae);
        c0elb.LLILZ = obj;
        return c0elb;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0227  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ELB.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
