package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0D29, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.network.fetcher.UcpAsyncFetcher$fetch$1", f = "UcpAsyncFetcher.kt", l = {55, 63, 71, 75, 88}, m = "invokeSuspend")
public final class C0D29 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C0D27<T> LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0D29(boolean z, C0D27<T> c0d27, String str, InterfaceC1364105Vn<? super C0D29> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = c0d27;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0D29(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0072 A[Catch: Exception -> 0x012c, TryCatch #0 {Exception -> 0x012c, blocks: (B:47:0x00fd, B:48:0x0100, B:50:0x0104, B:51:0x0109, B:39:0x00be, B:40:0x00c1, B:42:0x00c5, B:43:0x00ca, B:27:0x006b, B:28:0x006e, B:30:0x0072, B:31:0x0078, B:22:0x0054, B:24:0x0058, B:32:0x009e, B:34:0x00a4, B:36:0x00af, B:44:0x00ed), top: B:70:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0078 A[Catch: Exception -> 0x012c, TryCatch #0 {Exception -> 0x012c, blocks: (B:47:0x00fd, B:48:0x0100, B:50:0x0104, B:51:0x0109, B:39:0x00be, B:40:0x00c1, B:42:0x00c5, B:43:0x00ca, B:27:0x006b, B:28:0x006e, B:30:0x0072, B:31:0x0078, B:22:0x0054, B:24:0x0058, B:32:0x009e, B:34:0x00a4, B:36:0x00af, B:44:0x00ed), top: B:70:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c5 A[Catch: Exception -> 0x012c, TryCatch #0 {Exception -> 0x012c, blocks: (B:47:0x00fd, B:48:0x0100, B:50:0x0104, B:51:0x0109, B:39:0x00be, B:40:0x00c1, B:42:0x00c5, B:43:0x00ca, B:27:0x006b, B:28:0x006e, B:30:0x0072, B:31:0x0078, B:22:0x0054, B:24:0x0058, B:32:0x009e, B:34:0x00a4, B:36:0x00af, B:44:0x00ed), top: B:70:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ca A[Catch: Exception -> 0x012c, TryCatch #0 {Exception -> 0x012c, blocks: (B:47:0x00fd, B:48:0x0100, B:50:0x0104, B:51:0x0109, B:39:0x00be, B:40:0x00c1, B:42:0x00c5, B:43:0x00ca, B:27:0x006b, B:28:0x006e, B:30:0x0072, B:31:0x0078, B:22:0x0054, B:24:0x0058, B:32:0x009e, B:34:0x00a4, B:36:0x00af, B:44:0x00ed), top: B:70:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0104 A[Catch: Exception -> 0x012c, TryCatch #0 {Exception -> 0x012c, blocks: (B:47:0x00fd, B:48:0x0100, B:50:0x0104, B:51:0x0109, B:39:0x00be, B:40:0x00c1, B:42:0x00c5, B:43:0x00ca, B:27:0x006b, B:28:0x006e, B:30:0x0072, B:31:0x0078, B:22:0x0054, B:24:0x0058, B:32:0x009e, B:34:0x00a4, B:36:0x00af, B:44:0x00ed), top: B:70:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0109 A[Catch: Exception -> 0x012c, TRY_LEAVE, TryCatch #0 {Exception -> 0x012c, blocks: (B:47:0x00fd, B:48:0x0100, B:50:0x0104, B:51:0x0109, B:39:0x00be, B:40:0x00c1, B:42:0x00c5, B:43:0x00ca, B:27:0x006b, B:28:0x006e, B:30:0x0072, B:31:0x0078, B:22:0x0054, B:24:0x0058, B:32:0x009e, B:34:0x00a4, B:36:0x00af, B:44:0x00ed), top: B:70:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014a  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D29.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
