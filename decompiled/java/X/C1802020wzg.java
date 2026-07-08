package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wzg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.operationbanner.MinisOperationBannerCoordinator$schedulePresentationStart$1", f = "MinisOperationBannerCoordinator.kt", l = {202, 220, 237, 239, 242}, m = "invokeSuspend")
public final class C1802020wzg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1802190wzx LLILLL;
    public final /* synthetic */ InterfaceC1802030wzh LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1802020wzg(C1802190wzx c1802190wzx, InterfaceC1802030wzh interfaceC1802030wzh, InterfaceC1364105Vn<? super C1802020wzg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1802190wzx;
        this.LLILZ = interfaceC1802030wzh;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1802020wzg c1802020wzg = new C1802020wzg(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1802020wzg.LLILLJJLI = obj;
        return c1802020wzg;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00c0 A[Catch: CancellationException -> 0x012c, TryCatch #0 {CancellationException -> 0x012c, blocks: (B:12:0x0026, B:58:0x0110, B:59:0x0113, B:61:0x011b, B:62:0x0121, B:39:0x00b5, B:40:0x00b8, B:42:0x00c0, B:44:0x00c8, B:45:0x00cc, B:46:0x00d7, B:48:0x00df, B:49:0x00e5, B:51:0x00f3, B:52:0x00f6, B:54:0x00fa, B:55:0x0100, B:18:0x0043, B:19:0x0046, B:21:0x004e, B:22:0x0055, B:24:0x005b, B:25:0x0069, B:27:0x006f, B:32:0x007f, B:33:0x008f, B:35:0x0095, B:36:0x00a1, B:15:0x0035), top: B:88:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d7 A[Catch: CancellationException -> 0x012c, TryCatch #0 {CancellationException -> 0x012c, blocks: (B:12:0x0026, B:58:0x0110, B:59:0x0113, B:61:0x011b, B:62:0x0121, B:39:0x00b5, B:40:0x00b8, B:42:0x00c0, B:44:0x00c8, B:45:0x00cc, B:46:0x00d7, B:48:0x00df, B:49:0x00e5, B:51:0x00f3, B:52:0x00f6, B:54:0x00fa, B:55:0x0100, B:18:0x0043, B:19:0x0046, B:21:0x004e, B:22:0x0055, B:24:0x005b, B:25:0x0069, B:27:0x006f, B:32:0x007f, B:33:0x008f, B:35:0x0095, B:36:0x00a1, B:15:0x0035), top: B:88:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011b A[Catch: CancellationException -> 0x012c, TryCatch #0 {CancellationException -> 0x012c, blocks: (B:12:0x0026, B:58:0x0110, B:59:0x0113, B:61:0x011b, B:62:0x0121, B:39:0x00b5, B:40:0x00b8, B:42:0x00c0, B:44:0x00c8, B:45:0x00cc, B:46:0x00d7, B:48:0x00df, B:49:0x00e5, B:51:0x00f3, B:52:0x00f6, B:54:0x00fa, B:55:0x0100, B:18:0x0043, B:19:0x0046, B:21:0x004e, B:22:0x0055, B:24:0x005b, B:25:0x0069, B:27:0x006f, B:32:0x007f, B:33:0x008f, B:35:0x0095, B:36:0x00a1, B:15:0x0035), top: B:88:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0121 A[Catch: CancellationException -> 0x012c, TryCatch #0 {CancellationException -> 0x012c, blocks: (B:12:0x0026, B:58:0x0110, B:59:0x0113, B:61:0x011b, B:62:0x0121, B:39:0x00b5, B:40:0x00b8, B:42:0x00c0, B:44:0x00c8, B:45:0x00cc, B:46:0x00d7, B:48:0x00df, B:49:0x00e5, B:51:0x00f3, B:52:0x00f6, B:54:0x00fa, B:55:0x0100, B:18:0x0043, B:19:0x0046, B:21:0x004e, B:22:0x0055, B:24:0x005b, B:25:0x0069, B:27:0x006f, B:32:0x007f, B:33:0x008f, B:35:0x0095, B:36:0x00a1, B:15:0x0035), top: B:88:0x0011 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1802020wzg.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
