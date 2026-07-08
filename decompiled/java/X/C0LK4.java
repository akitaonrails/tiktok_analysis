package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LK4, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.GeneralI2VTask$loopRefreshProgress$1", f = "GeneralI2VTask.kt", l = {431, 434}, m = "invokeSuspend")
public final class C0LK4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public int LLILLJJLI;
    public final /* synthetic */ C0LRF LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LK4(C0LRF c0lrf, InterfaceC1364105Vn<? super C0LK4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0lrf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LK4(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Path cross not found for [B:21:0x005b, B:66:0x0134], limit reached: 98 */
    /* JADX WARN: Path cross not found for [B:26:0x006f, B:65:0x012f], limit reached: 98 */
    /* JADX WARN: Path cross not found for [B:35:0x008e, B:39:0x0098], limit reached: 98 */
    /* JADX WARN: Path cross not found for [B:39:0x0098, B:35:0x008e], limit reached: 98 */
    /* JADX WARN: Path cross not found for [B:65:0x012f, B:26:0x006f], limit reached: 98 */
    /* JADX WARN: Path cross not found for [B:66:0x0134, B:21:0x005b], limit reached: 98 */
    /* JADX WARN: Path cross not found for [B:67:0x0138, B:15:0x004c], limit reached: 98 */
    /* JADX WARN: Path cross not found for [B:76:0x0157, B:13:0x0046], limit reached: 98 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r4
      0x0021: PHI (r4v1 int) = (r4v0 int), (r4v8 int) binds: [B:93:0x0197, B:8:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x0191 -> B:7:0x001e). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r47) {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LK4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
