package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ujD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.verify.usecase.VerifyUseCase$invoke$2", f = "VerifyUseCase.kt", l = {35, 37}, m = "invokeSuspend")
public final class C1714930ujD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super InterfaceC1715120ujW>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ C1714950ujF LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1714930ujD(C1714950ujF c1714950ujF, String str, InterfaceC1364105Vn<? super C1714930ujD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1714950ujF;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1714930ujD(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006b A[Catch: all -> 0x00cf, TryCatch #2 {all -> 0x00cf, blocks: (B:23:0x0064, B:24:0x0067, B:26:0x006b, B:27:0x006f, B:29:0x0075, B:30:0x007c, B:32:0x0082, B:34:0x0095, B:37:0x009b, B:38:0x00bb), top: B:55:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075 A[Catch: all -> 0x00cf, TryCatch #2 {all -> 0x00cf, blocks: (B:23:0x0064, B:24:0x0067, B:26:0x006b, B:27:0x006f, B:29:0x0075, B:30:0x007c, B:32:0x0082, B:34:0x0095, B:37:0x009b, B:38:0x00bb), top: B:55:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0082 A[Catch: all -> 0x00cf, TryCatch #2 {all -> 0x00cf, blocks: (B:23:0x0064, B:24:0x0067, B:26:0x006b, B:27:0x006f, B:29:0x0075, B:30:0x007c, B:32:0x0082, B:34:0x0095, B:37:0x009b, B:38:0x00bb), top: B:55:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d9  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1714930ujD.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super InterfaceC1715120ujW> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
