package X;

import com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.MixStudioStatusRepoImpl;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.network.MixStudioStatusResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HSj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.MixStudioStatusRepoImpl$fetchStatusOnceAppSession$1", f = "MixStudioStatusRepoImpl.kt", l = {453, 464}, m = "invokeSuspend")
public final class C441350HSj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public MixStudioStatusResponse LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public final /* synthetic */ MixStudioStatusRepoImpl LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C441350HSj(MixStudioStatusRepoImpl mixStudioStatusRepoImpl, InterfaceC1364105Vn<? super C441350HSj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = mixStudioStatusRepoImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C441350HSj(this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1 A[Catch: 0HSx -> 0x0155, TryCatch #0 {0HSx -> 0x0155, blocks: (B:33:0x00a0, B:34:0x00a3, B:36:0x00b1, B:37:0x00c0, B:39:0x00c7, B:41:0x00cf, B:43:0x00d5, B:44:0x00d9, B:45:0x00dc, B:47:0x00e2, B:48:0x00eb, B:50:0x00f1, B:52:0x00fd, B:55:0x0112, B:57:0x0118, B:58:0x011f, B:60:0x012b, B:65:0x0138, B:67:0x0149, B:69:0x014f, B:17:0x004d, B:18:0x0050, B:20:0x005d, B:22:0x006e, B:24:0x0074, B:26:0x007c, B:27:0x0082, B:13:0x003b), top: B:74:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d5 A[Catch: 0HSx -> 0x0155, TryCatch #0 {0HSx -> 0x0155, blocks: (B:33:0x00a0, B:34:0x00a3, B:36:0x00b1, B:37:0x00c0, B:39:0x00c7, B:41:0x00cf, B:43:0x00d5, B:44:0x00d9, B:45:0x00dc, B:47:0x00e2, B:48:0x00eb, B:50:0x00f1, B:52:0x00fd, B:55:0x0112, B:57:0x0118, B:58:0x011f, B:60:0x012b, B:65:0x0138, B:67:0x0149, B:69:0x014f, B:17:0x004d, B:18:0x0050, B:20:0x005d, B:22:0x006e, B:24:0x0074, B:26:0x007c, B:27:0x0082, B:13:0x003b), top: B:74:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e2 A[Catch: 0HSx -> 0x0155, TryCatch #0 {0HSx -> 0x0155, blocks: (B:33:0x00a0, B:34:0x00a3, B:36:0x00b1, B:37:0x00c0, B:39:0x00c7, B:41:0x00cf, B:43:0x00d5, B:44:0x00d9, B:45:0x00dc, B:47:0x00e2, B:48:0x00eb, B:50:0x00f1, B:52:0x00fd, B:55:0x0112, B:57:0x0118, B:58:0x011f, B:60:0x012b, B:65:0x0138, B:67:0x0149, B:69:0x014f, B:17:0x004d, B:18:0x0050, B:20:0x005d, B:22:0x006e, B:24:0x0074, B:26:0x007c, B:27:0x0082, B:13:0x003b), top: B:74:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0138 A[Catch: 0HSx -> 0x0155, TryCatch #0 {0HSx -> 0x0155, blocks: (B:33:0x00a0, B:34:0x00a3, B:36:0x00b1, B:37:0x00c0, B:39:0x00c7, B:41:0x00cf, B:43:0x00d5, B:44:0x00d9, B:45:0x00dc, B:47:0x00e2, B:48:0x00eb, B:50:0x00f1, B:52:0x00fd, B:55:0x0112, B:57:0x0118, B:58:0x011f, B:60:0x012b, B:65:0x0138, B:67:0x0149, B:69:0x014f, B:17:0x004d, B:18:0x0050, B:20:0x005d, B:22:0x006e, B:24:0x0074, B:26:0x007c, B:27:0x0082, B:13:0x003b), top: B:74:0x000e }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C441350HSj.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
