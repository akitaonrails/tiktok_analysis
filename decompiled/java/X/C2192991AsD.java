package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.1AsD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.csi.profile.repo.SearchCSIProfileBannerRepo$request$2", f = "SearchCSIProfileBannerRepo.kt", l = {415}, m = "invokeSuspend")
public final class C2192991AsD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C2193041AsI>, Object> {
    public long LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C2159008d2 LLILZ;
    public final /* synthetic */ C2193081AsM LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2192991AsD(C2159008d2 c2159008d2, C2193081AsM c2193081AsM, InterfaceC1364105Vn<? super C2192991AsD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c2159008d2;
        this.LLILZIL = c2193081AsM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2192991AsD c2192991AsD = new C2192991AsD(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c2192991AsD.LLILLL = obj;
        return c2192991AsD;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fb A[Catch: all -> 0x015a, PHI: r0
      0x00fb: PHI (r0v14 java.lang.Integer) = (r0v13 java.lang.Integer), (r0v39 java.lang.Integer) binds: [B:45:0x00da, B:54:0x00f6] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x015a, blocks: (B:15:0x0050, B:16:0x0053, B:18:0x0057, B:20:0x0069, B:22:0x0087, B:24:0x008d, B:25:0x009c, B:27:0x00a2, B:28:0x00b1, B:33:0x00bc, B:35:0x00c2, B:40:0x00cb, B:41:0x00cd, B:43:0x00d1, B:44:0x00d8, B:46:0x00dc, B:48:0x00e2, B:57:0x00ff, B:59:0x0103, B:61:0x0109, B:66:0x011a, B:68:0x011e, B:70:0x0124, B:74:0x0132, B:76:0x0143, B:78:0x014b, B:79:0x014d, B:73:0x012e, B:65:0x0116, B:56:0x00fb, B:49:0x00e9, B:51:0x00ef, B:81:0x0156, B:9:0x002f, B:11:0x003e), top: B:91:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0103 A[Catch: all -> 0x015a, TryCatch #0 {all -> 0x015a, blocks: (B:15:0x0050, B:16:0x0053, B:18:0x0057, B:20:0x0069, B:22:0x0087, B:24:0x008d, B:25:0x009c, B:27:0x00a2, B:28:0x00b1, B:33:0x00bc, B:35:0x00c2, B:40:0x00cb, B:41:0x00cd, B:43:0x00d1, B:44:0x00d8, B:46:0x00dc, B:48:0x00e2, B:57:0x00ff, B:59:0x0103, B:61:0x0109, B:66:0x011a, B:68:0x011e, B:70:0x0124, B:74:0x0132, B:76:0x0143, B:78:0x014b, B:79:0x014d, B:73:0x012e, B:65:0x0116, B:56:0x00fb, B:49:0x00e9, B:51:0x00ef, B:81:0x0156, B:9:0x002f, B:11:0x003e), top: B:91:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0116 A[Catch: all -> 0x015a, PHI: r0
      0x0116: PHI (r0v16 java.lang.Integer) = (r0v15 java.lang.Integer), (r0v33 java.lang.Integer) binds: [B:58:0x0101, B:63:0x0111] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x015a, blocks: (B:15:0x0050, B:16:0x0053, B:18:0x0057, B:20:0x0069, B:22:0x0087, B:24:0x008d, B:25:0x009c, B:27:0x00a2, B:28:0x00b1, B:33:0x00bc, B:35:0x00c2, B:40:0x00cb, B:41:0x00cd, B:43:0x00d1, B:44:0x00d8, B:46:0x00dc, B:48:0x00e2, B:57:0x00ff, B:59:0x0103, B:61:0x0109, B:66:0x011a, B:68:0x011e, B:70:0x0124, B:74:0x0132, B:76:0x0143, B:78:0x014b, B:79:0x014d, B:73:0x012e, B:65:0x0116, B:56:0x00fb, B:49:0x00e9, B:51:0x00ef, B:81:0x0156, B:9:0x002f, B:11:0x003e), top: B:91:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011e A[Catch: all -> 0x015a, TryCatch #0 {all -> 0x015a, blocks: (B:15:0x0050, B:16:0x0053, B:18:0x0057, B:20:0x0069, B:22:0x0087, B:24:0x008d, B:25:0x009c, B:27:0x00a2, B:28:0x00b1, B:33:0x00bc, B:35:0x00c2, B:40:0x00cb, B:41:0x00cd, B:43:0x00d1, B:44:0x00d8, B:46:0x00dc, B:48:0x00e2, B:57:0x00ff, B:59:0x0103, B:61:0x0109, B:66:0x011a, B:68:0x011e, B:70:0x0124, B:74:0x0132, B:76:0x0143, B:78:0x014b, B:79:0x014d, B:73:0x012e, B:65:0x0116, B:56:0x00fb, B:49:0x00e9, B:51:0x00ef, B:81:0x0156, B:9:0x002f, B:11:0x003e), top: B:91:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012e A[Catch: all -> 0x015a, PHI: r0
      0x012e: PHI (r0v18 java.lang.Integer) = (r0v17 java.lang.Integer), (r0v27 java.lang.Integer) binds: [B:67:0x011c, B:72:0x012c] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x015a, blocks: (B:15:0x0050, B:16:0x0053, B:18:0x0057, B:20:0x0069, B:22:0x0087, B:24:0x008d, B:25:0x009c, B:27:0x00a2, B:28:0x00b1, B:33:0x00bc, B:35:0x00c2, B:40:0x00cb, B:41:0x00cd, B:43:0x00d1, B:44:0x00d8, B:46:0x00dc, B:48:0x00e2, B:57:0x00ff, B:59:0x0103, B:61:0x0109, B:66:0x011a, B:68:0x011e, B:70:0x0124, B:74:0x0132, B:76:0x0143, B:78:0x014b, B:79:0x014d, B:73:0x012e, B:65:0x0116, B:56:0x00fb, B:49:0x00e9, B:51:0x00ef, B:81:0x0156, B:9:0x002f, B:11:0x003e), top: B:91:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0154  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2192991AsD.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C2193041AsI> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
