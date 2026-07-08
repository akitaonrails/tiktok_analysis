package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08ZI, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.performance.nativegame.MinisNativeGameDownloadManager$recordGameOpen$2", f = "MinisNativeGameDownloadManager.kt", l = {1482, 1131}, m = "invokeSuspend")
public final class C08ZI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC383701eN LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C08ZI(String str, InterfaceC1364105Vn<? super C08ZI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C08ZI(this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0093 A[Catch: all -> 0x00e2, TryCatch #0 {all -> 0x00e2, blocks: (B:27:0x0072, B:28:0x0075, B:29:0x008d, B:31:0x0093, B:33:0x009f, B:34:0x00a6, B:36:0x00b9, B:38:0x00c9, B:39:0x00cc, B:43:0x00de), top: B:48:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b9 A[Catch: all -> 0x00e2, LOOP:1: B:36:0x00b9->B:38:0x00c9, LOOP_START, PHI: r2
      0x00b9: PHI (r2v4 int) = (r2v3 int), (r2v5 int) binds: [B:35:0x00b7, B:38:0x00c9] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x00e2, blocks: (B:27:0x0072, B:28:0x0075, B:29:0x008d, B:31:0x0093, B:33:0x009f, B:34:0x00a6, B:36:0x00b9, B:38:0x00c9, B:39:0x00cc, B:43:0x00de), top: B:48:0x000f }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08ZI.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
