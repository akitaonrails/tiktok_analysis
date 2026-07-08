package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cs5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.service.impl.AwemeFetchManager$batchQueryAweme$2", f = "AwemeFetchManager.kt", l = {172}, m = "invokeSuspend")
public final class C327150Cs5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<String> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C327150Cs5(List<String> list, InterfaceC1364105Vn<? super C327150Cs5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C327150Cs5(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009f A[Catch: Exception -> 0x0168, TryCatch #0 {Exception -> 0x0168, blocks: (B:21:0x0064, B:22:0x0067, B:24:0x006c, B:26:0x0070, B:27:0x0079, B:29:0x007f, B:31:0x008b, B:34:0x0094, B:35:0x0098, B:40:0x00a5, B:42:0x00a9, B:43:0x00b2, B:45:0x00b8, B:47:0x00c0, B:49:0x00c6, B:52:0x00cf, B:54:0x00d8, B:56:0x00de, B:58:0x00e6, B:59:0x00ea, B:61:0x00f0, B:62:0x00f4, B:63:0x00ff, B:65:0x0105, B:68:0x0115, B:69:0x0130, B:71:0x0138, B:72:0x014a, B:82:0x0160, B:76:0x0151, B:78:0x0157, B:53:0x00d3, B:38:0x009f, B:17:0x0050), top: B:94:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d3 A[Catch: Exception -> 0x0168, TryCatch #0 {Exception -> 0x0168, blocks: (B:21:0x0064, B:22:0x0067, B:24:0x006c, B:26:0x0070, B:27:0x0079, B:29:0x007f, B:31:0x008b, B:34:0x0094, B:35:0x0098, B:40:0x00a5, B:42:0x00a9, B:43:0x00b2, B:45:0x00b8, B:47:0x00c0, B:49:0x00c6, B:52:0x00cf, B:54:0x00d8, B:56:0x00de, B:58:0x00e6, B:59:0x00ea, B:61:0x00f0, B:62:0x00f4, B:63:0x00ff, B:65:0x0105, B:68:0x0115, B:69:0x0130, B:71:0x0138, B:72:0x014a, B:82:0x0160, B:76:0x0151, B:78:0x0157, B:53:0x00d3, B:38:0x009f, B:17:0x0050), top: B:94:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e6 A[Catch: Exception -> 0x0168, TryCatch #0 {Exception -> 0x0168, blocks: (B:21:0x0064, B:22:0x0067, B:24:0x006c, B:26:0x0070, B:27:0x0079, B:29:0x007f, B:31:0x008b, B:34:0x0094, B:35:0x0098, B:40:0x00a5, B:42:0x00a9, B:43:0x00b2, B:45:0x00b8, B:47:0x00c0, B:49:0x00c6, B:52:0x00cf, B:54:0x00d8, B:56:0x00de, B:58:0x00e6, B:59:0x00ea, B:61:0x00f0, B:62:0x00f4, B:63:0x00ff, B:65:0x0105, B:68:0x0115, B:69:0x0130, B:71:0x0138, B:72:0x014a, B:82:0x0160, B:76:0x0151, B:78:0x0157, B:53:0x00d3, B:38:0x009f, B:17:0x0050), top: B:94:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f0 A[Catch: Exception -> 0x0168, TryCatch #0 {Exception -> 0x0168, blocks: (B:21:0x0064, B:22:0x0067, B:24:0x006c, B:26:0x0070, B:27:0x0079, B:29:0x007f, B:31:0x008b, B:34:0x0094, B:35:0x0098, B:40:0x00a5, B:42:0x00a9, B:43:0x00b2, B:45:0x00b8, B:47:0x00c0, B:49:0x00c6, B:52:0x00cf, B:54:0x00d8, B:56:0x00de, B:58:0x00e6, B:59:0x00ea, B:61:0x00f0, B:62:0x00f4, B:63:0x00ff, B:65:0x0105, B:68:0x0115, B:69:0x0130, B:71:0x0138, B:72:0x014a, B:82:0x0160, B:76:0x0151, B:78:0x0157, B:53:0x00d3, B:38:0x009f, B:17:0x0050), top: B:94:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0105 A[Catch: Exception -> 0x0168, TRY_LEAVE, TryCatch #0 {Exception -> 0x0168, blocks: (B:21:0x0064, B:22:0x0067, B:24:0x006c, B:26:0x0070, B:27:0x0079, B:29:0x007f, B:31:0x008b, B:34:0x0094, B:35:0x0098, B:40:0x00a5, B:42:0x00a9, B:43:0x00b2, B:45:0x00b8, B:47:0x00c0, B:49:0x00c6, B:52:0x00cf, B:54:0x00d8, B:56:0x00de, B:58:0x00e6, B:59:0x00ea, B:61:0x00f0, B:62:0x00f4, B:63:0x00ff, B:65:0x0105, B:68:0x0115, B:69:0x0130, B:71:0x0138, B:72:0x014a, B:82:0x0160, B:76:0x0151, B:78:0x0157, B:53:0x00d3, B:38:0x009f, B:17:0x0050), top: B:94:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0166  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C327150Cs5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
