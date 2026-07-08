package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08sJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.music.aichoosemusic.task.BaseAIMusicUploadFrameTask$start$2$zipPathDefer$1", f = "BaseAIMusicUploadFrameTask.kt", l = {351, 355}, m = "invokeSuspend")
public final class C2253708sJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AbstractC2289508y5 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2253708sJ(AbstractC2289508y5 abstractC2289508y5, InterfaceC1364105Vn<? super C2253708sJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = abstractC2289508y5;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2253708sJ c2253708sJ = new C2253708sJ(this.LLILLL, interfaceC1364105Vn);
        c2253708sJ.LLILLJJLI = obj;
        return c2253708sJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ce  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2253708sJ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
