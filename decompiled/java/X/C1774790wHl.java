package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wHl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallRepository$preloadVideoAweme$1", f = "ShopMallRepository.kt", l = {1165}, m = "invokeSuspend")
public final class C1774790wHl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1772630wEH LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1774790wHl(C1772630wEH c1772630wEH, boolean z, String str, InterfaceC1364105Vn<? super C1774790wHl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1772630wEH;
        this.LLILZ = z;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1774790wHl c1774790wHl = new C1774790wHl(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1774790wHl.LLILLJJLI = obj;
        return c1774790wHl;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d A[Catch: all -> 0x00cb, TryCatch #0 {all -> 0x00cb, blocks: (B:53:0x00c2, B:54:0x00c5, B:55:0x00c7, B:10:0x0027, B:12:0x002d, B:15:0x0034, B:17:0x003c, B:26:0x004d, B:27:0x0056, B:29:0x005c, B:31:0x006a, B:32:0x006c, B:34:0x0072, B:35:0x007a, B:36:0x007e, B:39:0x0084, B:41:0x008f, B:43:0x0096, B:47:0x00a1, B:49:0x00a7, B:21:0x0043, B:23:0x0047), top: B:60:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008f A[Catch: all -> 0x00cb, TryCatch #0 {all -> 0x00cb, blocks: (B:53:0x00c2, B:54:0x00c5, B:55:0x00c7, B:10:0x0027, B:12:0x002d, B:15:0x0034, B:17:0x003c, B:26:0x004d, B:27:0x0056, B:29:0x005c, B:31:0x006a, B:32:0x006c, B:34:0x0072, B:35:0x007a, B:36:0x007e, B:39:0x0084, B:41:0x008f, B:43:0x0096, B:47:0x00a1, B:49:0x00a7, B:21:0x0043, B:23:0x0047), top: B:60:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0096 A[Catch: all -> 0x00cb, TryCatch #0 {all -> 0x00cb, blocks: (B:53:0x00c2, B:54:0x00c5, B:55:0x00c7, B:10:0x0027, B:12:0x002d, B:15:0x0034, B:17:0x003c, B:26:0x004d, B:27:0x0056, B:29:0x005c, B:31:0x006a, B:32:0x006c, B:34:0x0072, B:35:0x007a, B:36:0x007e, B:39:0x0084, B:41:0x008f, B:43:0x0096, B:47:0x00a1, B:49:0x00a7, B:21:0x0043, B:23:0x0047), top: B:60:0x000c }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1774790wHl.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
