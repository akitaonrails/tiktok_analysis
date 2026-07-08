package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XuP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.DefaultIMUseCaseCenter$sendMessagesInOrder$1", f = "DefaultIMUseCaseCenter.kt", l = {534}, m = "invokeSuspend")
public final class C863670XuP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public C869590Y9l LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C863650XuN LLILZ;
    public final /* synthetic */ List<C869590Y9l> LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ InterfaceC863600XuI<C869590Y9l> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C863670XuP(C863650XuN c863650XuN, List<? extends C869590Y9l> list, boolean z, InterfaceC863600XuI<C869590Y9l> interfaceC863600XuI, InterfaceC1364105Vn<? super C863670XuP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c863650XuN;
        this.LLILZIL = list;
        this.LLILZLL = z;
        this.LLIZ = interfaceC863600XuI;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C863670XuP(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047 A[Catch: all -> 0x00c4, TryCatch #1 {all -> 0x00c4, blocks: (B:11:0x0041, B:13:0x0047, B:34:0x00c0), top: B:41:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070 A[Catch: all -> 0x00a2, TryCatch #0 {all -> 0x00a2, blocks: (B:16:0x006a, B:18:0x0070, B:20:0x0076, B:21:0x0080, B:23:0x0084, B:24:0x0096, B:26:0x009a), top: B:39:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096 A[Catch: all -> 0x00a2, TryCatch #0 {all -> 0x00a2, blocks: (B:16:0x006a, B:18:0x0070, B:20:0x0076, B:21:0x0080, B:23:0x0084, B:24:0x0096, B:26:0x009a), top: B:39:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0067 -> B:39:0x006a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:? -> B:35:0x00c4). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C863670XuP.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
