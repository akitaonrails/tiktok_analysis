package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08xo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.UploadFrameServiceImpl$UploadFrameTask$start$1", f = "UploadFrameServiceImpl.kt", l = {98, 120, 132}, m = "invokeSuspend")
public final class C2287808xo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C2287408xk LLILLL;
    public final /* synthetic */ C2287508xl LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2287808xo(C2287408xk c2287408xk, C2287508xl c2287508xl, InterfaceC1364105Vn<? super C2287808xo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c2287408xk;
        this.LLILZ = c2287508xl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2287808xo(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02cd  */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.1Bb1, com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2287808xo.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
