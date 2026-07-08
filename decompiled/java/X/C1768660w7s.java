package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVMV2;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.CustomDotResponseV2;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0w7s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVMV2$requestReachCfg$1", f = "CustomDotVMV2.kt", l = {352, 355, 357, 352, 355, 357}, m = "invokeSuspend")
public final class C1768660w7s extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ CustomDotVMV2 LLILLL;
    public final /* synthetic */ EnumC1768960w8M LLILZ;
    public final /* synthetic */ Map<String, Object> LLILZIL;
    public final /* synthetic */ Function2<Boolean, InterfaceC1364105Vn<? super C0X52<Response<CustomDotResponseV2>>>, Object> LLILZLL;
    public final /* synthetic */ boolean LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1768660w7s(CustomDotVMV2 customDotVMV2, EnumC1768960w8M enumC1768960w8M, Map<String, Object> map, Function2<? super Boolean, ? super InterfaceC1364105Vn<? super C0X52<Response<CustomDotResponseV2>>>, ? extends Object> function2, boolean z, InterfaceC1364105Vn<? super C1768660w7s> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = customDotVMV2;
        this.LLILZ = enumC1768960w8M;
        this.LLILZIL = map;
        this.LLILZLL = function2;
        this.LLIZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1768660w7s c1768660w7s = new C1768660w7s(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c1768660w7s.LLILLJJLI = obj;
        return c1768660w7s;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d2 A[Catch: all -> 0x0131, CancellationException -> 0x0161, TryCatch #2 {CancellationException -> 0x0161, all -> 0x0131, blocks: (B:38:0x00a0, B:42:0x00a9, B:44:0x00b6, B:50:0x00cc, B:53:0x00d2, B:55:0x00d6, B:57:0x00dc, B:61:0x00eb, B:67:0x0101, B:69:0x0105, B:76:0x011d, B:77:0x011f, B:49:0x00c9, B:66:0x00fe, B:75:0x011a), top: B:88:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00eb A[Catch: all -> 0x0131, CancellationException -> 0x0161, TryCatch #2 {CancellationException -> 0x0161, all -> 0x0131, blocks: (B:38:0x00a0, B:42:0x00a9, B:44:0x00b6, B:50:0x00cc, B:53:0x00d2, B:55:0x00d6, B:57:0x00dc, B:61:0x00eb, B:67:0x0101, B:69:0x0105, B:76:0x011d, B:77:0x011f, B:49:0x00c9, B:66:0x00fe, B:75:0x011a), top: B:88:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0105 A[Catch: all -> 0x0131, CancellationException -> 0x0161, TryCatch #2 {CancellationException -> 0x0161, all -> 0x0131, blocks: (B:38:0x00a0, B:42:0x00a9, B:44:0x00b6, B:50:0x00cc, B:53:0x00d2, B:55:0x00d6, B:57:0x00dc, B:61:0x00eb, B:67:0x0101, B:69:0x0105, B:76:0x011d, B:77:0x011f, B:49:0x00c9, B:66:0x00fe, B:75:0x011a), top: B:88:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0114  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1768660w7s.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
