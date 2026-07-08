package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CUU, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.ug.newinstall.manager.EcUgFirstLaunchManager$checkDid$1$2", f = "EcUgFirstLaunchManager.kt", l = {182, 182}, m = "invokeSuspend")
public final class C0CUU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CUU(long j, InterfaceC1364105Vn<? super C0CUU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CUU(this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Path cross not found for [B:37:0x00b0, B:40:0x00b8], limit reached: 63 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0090 A[Catch: all -> 0x00f4, CancellationException -> 0x0109, PHI: r0 r5
      0x0090: PHI (r0v7 long) = (r0v1 long), (r0v8 long) binds: [B:28:0x008a, B:41:0x00b9] A[DONT_GENERATE, DONT_INLINE]
      0x0090: PHI (r5v2 int) = (r5v0 int), (r5v3 int) binds: [B:28:0x008a, B:41:0x00b9] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #2 {CancellationException -> 0x0109, all -> 0x00f4, blocks: (B:34:0x00a7, B:35:0x00aa, B:37:0x00b0, B:29:0x0090, B:31:0x009a, B:48:0x00dd, B:49:0x00ee, B:45:0x00c0), top: B:57:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009a A[Catch: all -> 0x00f4, CancellationException -> 0x0109, TryCatch #2 {CancellationException -> 0x0109, all -> 0x00f4, blocks: (B:34:0x00a7, B:35:0x00aa, B:37:0x00b0, B:29:0x0090, B:31:0x009a, B:48:0x00dd, B:49:0x00ee, B:45:0x00c0), top: B:57:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00da  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00a4 -> B:35:0x00aa). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0CUU.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
