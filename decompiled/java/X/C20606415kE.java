package X;

import com.bytedance.ies.powerlist.page.PowerPageLoader;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.15kE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.bytedance.ies.powerlist.page.PowerPageLoader$refreshInner$1", f = "PowerPageLoader.kt", l = {430}, m = "invokeSuspend")
public final class C20606415kE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PowerPageLoader<T> LLILLJJLI;
    public final /* synthetic */ EnumC323450Cm7 LLILLL;
    public final /* synthetic */ C238400w2 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20606415kE(PowerPageLoader<T> powerPageLoader, EnumC323450Cm7 enumC323450Cm7, C238400w2 c238400w2, InterfaceC1364105Vn<? super C20606415kE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = powerPageLoader;
        this.LLILLL = enumC323450Cm7;
        this.LLILZ = c238400w2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20606415kE(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008c A[Catch: CancellationException -> 0x0161, TryCatch #0 {CancellationException -> 0x0161, blocks: (B:18:0x0066, B:19:0x0069, B:21:0x0070, B:23:0x007a, B:25:0x0081, B:37:0x0099, B:38:0x00a1, B:42:0x00e5, B:44:0x00eb, B:30:0x008c, B:39:0x00d0, B:41:0x00d4, B:45:0x00fa, B:47:0x00fe, B:49:0x0108, B:51:0x010f, B:63:0x0127, B:64:0x012e, B:56:0x011a, B:65:0x014b, B:67:0x014f, B:70:0x015b, B:71:0x0160, B:9:0x001c, B:11:0x0022, B:12:0x0027, B:14:0x005d), top: B:75:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011a A[Catch: CancellationException -> 0x0161, TryCatch #0 {CancellationException -> 0x0161, blocks: (B:18:0x0066, B:19:0x0069, B:21:0x0070, B:23:0x007a, B:25:0x0081, B:37:0x0099, B:38:0x00a1, B:42:0x00e5, B:44:0x00eb, B:30:0x008c, B:39:0x00d0, B:41:0x00d4, B:45:0x00fa, B:47:0x00fe, B:49:0x0108, B:51:0x010f, B:63:0x0127, B:64:0x012e, B:56:0x011a, B:65:0x014b, B:67:0x014f, B:70:0x015b, B:71:0x0160, B:9:0x001c, B:11:0x0022, B:12:0x0027, B:14:0x005d), top: B:75:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0121  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20606415kE.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
