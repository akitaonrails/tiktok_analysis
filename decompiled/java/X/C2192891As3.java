package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.1As3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.csi.profile.api.CSIFreqControlAPI$checkFreqControl$2", f = "CSIFreqControlAPI.kt", l = {142}, m = "invokeSuspend")
public final class C2192891As3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C2193381Asq>, Object> {
    public int LL;
    public final /* synthetic */ C2192901As4 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2192891As3(C2192901As4 c2192901As4, InterfaceC1364105Vn<? super C2192891As3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c2192901As4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2192891As3(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007c A[Catch: Exception -> 0x00c6, CancellationException -> 0x00e4, TryCatch #2 {CancellationException -> 0x00e4, Exception -> 0x00c6, blocks: (B:19:0x0073, B:20:0x0076, B:23:0x007c, B:25:0x0082, B:26:0x0089, B:28:0x0091, B:29:0x0095, B:31:0x0099, B:32:0x009d, B:40:0x00b1, B:41:0x00b5, B:9:0x0020, B:10:0x0033, B:12:0x0039, B:13:0x0050, B:15:0x0067), top: B:49:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b5 A[Catch: Exception -> 0x00c6, CancellationException -> 0x00e4, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x00e4, Exception -> 0x00c6, blocks: (B:19:0x0073, B:20:0x0076, B:23:0x007c, B:25:0x0082, B:26:0x0089, B:28:0x0091, B:29:0x0095, B:31:0x0099, B:32:0x009d, B:40:0x00b1, B:41:0x00b5, B:9:0x0020, B:10:0x0033, B:12:0x0039, B:13:0x0050, B:15:0x0067), top: B:49:0x0010 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2192891As3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C2193381Asq> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
