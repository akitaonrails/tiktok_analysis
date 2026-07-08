package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0OgA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.offlinemode.repo.OfflineModeManager$bootTask$1", f = "OfflineModeManager.kt", l = {113, 117, 125}, m = "invokeSuspend")
public final class C625520OgA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public boolean LLILLL;
    public int LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C625520OgA(boolean z, int i, boolean z2, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = z;
        this.LLILZLL = z2;
        this.LLIZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C625520OgA(this.LLILZIL, this.LLIZ, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00c9 A[Catch: Exception -> 0x01ac, all -> 0x01d2, TryCatch #1 {Exception -> 0x01ac, blocks: (B:28:0x00dc, B:29:0x00df, B:30:0x00e6, B:32:0x0178, B:34:0x0180, B:36:0x0188, B:37:0x018f, B:39:0x019b, B:21:0x009e, B:22:0x00a1, B:24:0x00c9, B:16:0x005c, B:17:0x005f, B:12:0x0034), top: B:65:0x0012, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0178 A[Catch: Exception -> 0x01ac, all -> 0x01d2, TryCatch #1 {Exception -> 0x01ac, blocks: (B:28:0x00dc, B:29:0x00df, B:30:0x00e6, B:32:0x0178, B:34:0x0180, B:36:0x0188, B:37:0x018f, B:39:0x019b, B:21:0x009e, B:22:0x00a1, B:24:0x00c9, B:16:0x005c, B:17:0x005f, B:12:0x0034), top: B:65:0x0012, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x019b A[Catch: Exception -> 0x01ac, all -> 0x01d2, TRY_LEAVE, TryCatch #1 {Exception -> 0x01ac, blocks: (B:28:0x00dc, B:29:0x00df, B:30:0x00e6, B:32:0x0178, B:34:0x0180, B:36:0x0188, B:37:0x018f, B:39:0x019b, B:21:0x009e, B:22:0x00a1, B:24:0x00c9, B:16:0x005c, B:17:0x005f, B:12:0x0034), top: B:65:0x0012, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c9 A[PHI: r0
      0x01c9: PHI (r0v9 com.ss.android.ugc.aweme.offlinepush.api.IOfflinePushService) = 
      (r0v4 com.ss.android.ugc.aweme.offlinepush.api.IOfflinePushService)
      (r0v31 com.ss.android.ugc.aweme.offlinepush.api.IOfflinePushService)
     binds: [B:52:0x01c7, B:44:0x01a9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r62) {
        /*
            Method dump skipped, instruction units count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C625520OgA.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
