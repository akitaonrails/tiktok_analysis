package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ToE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.livehostimpl.livereply.spriteimage.ScrollHandleConfiguration$getAndFillInThumbnails$getCurrentShownThumbnail$1$1", f = "ScrollHandleConfiguration.kt", l = {650, 672}, m = "invokeSuspend")
public final class C757920ToE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public int LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C1836150xsj LLILZIL;
    public final /* synthetic */ boolean[] LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C757920ToE(C1836150xsj c1836150xsj, boolean[] zArr, InterfaceC1364105Vn<? super C757920ToE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c1836150xsj;
        this.LLILZLL = zArr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C757920ToE c757920ToE = new C757920ToE(this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c757920ToE.LLILZ = obj;
        return c757920ToE;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C757920ToE.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
