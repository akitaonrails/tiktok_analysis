package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NIY, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.offlinemode.repo.OfflineCommonCacheDelegate$notifyConsumedEvent$1", f = "OfflineCommonCacheDelegate.kt", l = {165, 173}, m = "invokeSuspend")
public final class C0NIY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C0NII LLILLL;
    public final /* synthetic */ C0NHH LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NIY(String str, C0NII c0nii, C0NHH c0nhh, InterfaceC1364105Vn<? super C0NIY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = c0nii;
        this.LLILZ = c0nhh;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NIY(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00d7 A[Catch: Exception -> 0x0124, TryCatch #0 {Exception -> 0x0124, blocks: (B:46:0x00cc, B:47:0x00cf, B:49:0x00d7, B:50:0x00e5, B:52:0x00f5, B:54:0x0109, B:56:0x0111, B:18:0x0056, B:19:0x0059, B:21:0x0061, B:23:0x0067, B:24:0x007f, B:26:0x0085, B:28:0x0091, B:30:0x0097, B:36:0x00a3, B:38:0x00a9, B:42:0x00b2, B:10:0x0021, B:14:0x004c, B:13:0x0048), top: B:61:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f5 A[Catch: Exception -> 0x0124, TryCatch #0 {Exception -> 0x0124, blocks: (B:46:0x00cc, B:47:0x00cf, B:49:0x00d7, B:50:0x00e5, B:52:0x00f5, B:54:0x0109, B:56:0x0111, B:18:0x0056, B:19:0x0059, B:21:0x0061, B:23:0x0067, B:24:0x007f, B:26:0x0085, B:28:0x0091, B:30:0x0097, B:36:0x00a3, B:38:0x00a9, B:42:0x00b2, B:10:0x0021, B:14:0x004c, B:13:0x0048), top: B:61:0x000e }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0NIY.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
