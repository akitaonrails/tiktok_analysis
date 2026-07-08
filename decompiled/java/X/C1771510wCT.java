package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wCT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallRepository$preloadVideo$1", f = "ShopMallRepository.kt", l = {}, m = "invokeSuspend")
public final class C1771510wCT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1772630wEH LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1771510wCT(C1772630wEH c1772630wEH, boolean z, String str, InterfaceC1364105Vn<? super C1771510wCT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1772630wEH;
        this.LLILLJJLI = z;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1771510wCT(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047 A[Catch: all -> 0x0159, TryCatch #0 {all -> 0x0159, blocks: (B:4:0x0015, B:6:0x001b, B:14:0x002c, B:16:0x0034, B:18:0x0038, B:19:0x0041, B:21:0x0047, B:23:0x0051, B:25:0x0055, B:27:0x005d, B:29:0x0067, B:31:0x006d, B:33:0x0071, B:35:0x0075, B:36:0x007b, B:38:0x007f, B:40:0x0083, B:41:0x008e, B:43:0x0096, B:45:0x009c, B:47:0x00aa, B:49:0x00ae, B:51:0x00b2, B:52:0x00b6, B:64:0x00d5, B:66:0x00db, B:68:0x00eb, B:72:0x0103, B:69:0x00f4, B:71:0x00fc, B:79:0x0113, B:80:0x0117, B:56:0x00bf, B:58:0x00c7, B:60:0x00cb, B:62:0x00cf, B:81:0x0119, B:83:0x011f, B:84:0x0121, B:78:0x0110, B:9:0x0023, B:11:0x0027, B:86:0x0127, B:88:0x0132, B:90:0x0143, B:89:0x013b), top: B:98:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d5 A[Catch: all -> 0x0159, TryCatch #0 {all -> 0x0159, blocks: (B:4:0x0015, B:6:0x001b, B:14:0x002c, B:16:0x0034, B:18:0x0038, B:19:0x0041, B:21:0x0047, B:23:0x0051, B:25:0x0055, B:27:0x005d, B:29:0x0067, B:31:0x006d, B:33:0x0071, B:35:0x0075, B:36:0x007b, B:38:0x007f, B:40:0x0083, B:41:0x008e, B:43:0x0096, B:45:0x009c, B:47:0x00aa, B:49:0x00ae, B:51:0x00b2, B:52:0x00b6, B:64:0x00d5, B:66:0x00db, B:68:0x00eb, B:72:0x0103, B:69:0x00f4, B:71:0x00fc, B:79:0x0113, B:80:0x0117, B:56:0x00bf, B:58:0x00c7, B:60:0x00cb, B:62:0x00cf, B:81:0x0119, B:83:0x011f, B:84:0x0121, B:78:0x0110, B:9:0x0023, B:11:0x0027, B:86:0x0127, B:88:0x0132, B:90:0x0143, B:89:0x013b), top: B:98:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023 A[Catch: all -> 0x0159, TryCatch #0 {all -> 0x0159, blocks: (B:4:0x0015, B:6:0x001b, B:14:0x002c, B:16:0x0034, B:18:0x0038, B:19:0x0041, B:21:0x0047, B:23:0x0051, B:25:0x0055, B:27:0x005d, B:29:0x0067, B:31:0x006d, B:33:0x0071, B:35:0x0075, B:36:0x007b, B:38:0x007f, B:40:0x0083, B:41:0x008e, B:43:0x0096, B:45:0x009c, B:47:0x00aa, B:49:0x00ae, B:51:0x00b2, B:52:0x00b6, B:64:0x00d5, B:66:0x00db, B:68:0x00eb, B:72:0x0103, B:69:0x00f4, B:71:0x00fc, B:79:0x0113, B:80:0x0117, B:56:0x00bf, B:58:0x00c7, B:60:0x00cb, B:62:0x00cf, B:81:0x0119, B:83:0x011f, B:84:0x0121, B:78:0x0110, B:9:0x0023, B:11:0x0027, B:86:0x0127, B:88:0x0132, B:90:0x0143, B:89:0x013b), top: B:98:0x0015 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1771510wCT.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
