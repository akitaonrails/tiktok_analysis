package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CUW, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.ug.newinstall.manager.EcUgFirstLaunchManager$checkAB$1$3", f = "EcUgFirstLaunchManager.kt", l = {316, 316}, m = "invokeSuspend")
public final class C0CUW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CUW(long j, InterfaceC1364105Vn<? super C0CUW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CUW(this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e A[Catch: all -> 0x0095, CancellationException -> 0x0114, PHI: r3 r5
      0x002e: PHI (r3v2 int) = (r3v0 int), (r3v3 int) binds: [B:9:0x0028, B:17:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x002e: PHI (r5v2 long) = (r5v0 long), (r5v3 long) binds: [B:9:0x0028, B:17:0x005b] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #2 {CancellationException -> 0x0114, all -> 0x0095, blocks: (B:15:0x0045, B:16:0x0048, B:10:0x002e, B:12:0x0038, B:23:0x007e, B:24:0x008f, B:18:0x005d), top: B:46:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0038 A[Catch: all -> 0x0095, CancellationException -> 0x0114, TryCatch #2 {CancellationException -> 0x0114, all -> 0x0095, blocks: (B:15:0x0045, B:16:0x0048, B:10:0x002e, B:12:0x0038, B:23:0x007e, B:24:0x008f, B:18:0x005d), top: B:46:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d A[Catch: all -> 0x0095, CancellationException -> 0x0114, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0114, all -> 0x0095, blocks: (B:15:0x0045, B:16:0x0048, B:10:0x002e, B:12:0x0038, B:23:0x007e, B:24:0x008f, B:18:0x005d), top: B:46:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0042 -> B:16:0x0048). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0CUW.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
