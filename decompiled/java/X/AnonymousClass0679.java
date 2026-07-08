package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0679, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.probe.core.infoupload.ProbeUploadManager$upload$1", f = "ProbeUploadManager.kt", l = {43, 52, 67, 80}, m = "invokeSuspend")
public final class AnonymousClass0679 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public AnonymousClass1489 LLILLJJLI;
    public C05JQ LLILLL;
    public int LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ AnonymousClass1489 LLILZLL;
    public final /* synthetic */ C05JQ LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0679(String str, AnonymousClass1489 anonymousClass1489, C05JQ c05jq, InterfaceC1364105Vn<? super AnonymousClass0679> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = str;
        this.LLILZLL = anonymousClass1489;
        this.LLIZ = c05jq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass0679(this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014d A[Catch: all -> 0x01c1, TryCatch #0 {all -> 0x01c1, blocks: (B:45:0x013e, B:31:0x00cb, B:34:0x00d1, B:40:0x00de, B:42:0x00ea, B:46:0x0141, B:52:0x014d, B:54:0x0183, B:56:0x0189, B:59:0x018f, B:25:0x006a, B:26:0x00a0, B:28:0x00b6), top: B:91:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01db  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0679.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
