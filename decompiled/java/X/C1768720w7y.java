package X;

import com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVMV2;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0w7y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVMV2$reachControlGet$1", f = "CustomDotVMV2.kt", l = {1046, 1046}, m = "invokeSuspend")
public final class C1768720w7y extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1768850w8B LL;
    public Object LLILLJJLI;
    public CustomDotVMV2 LLILLL;
    public boolean LLILZ;
    public int LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ CustomDotVMV2 LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ EnumC1768950w8L LLJ;
    public final /* synthetic */ C1768850w8B LLJI;
    public final /* synthetic */ Map<String, Object> LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1768720w7y(CustomDotVMV2 customDotVMV2, boolean z, EnumC1768950w8L enumC1768950w8L, C1768850w8B c1768850w8B, Map<String, Object> map, InterfaceC1364105Vn<? super C1768720w7y> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = customDotVMV2;
        this.LLIZLLLIL = z;
        this.LLJ = enumC1768950w8L;
        this.LLJI = c1768850w8B;
        this.LLJIJIL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1768720w7y c1768720w7y = new C1768720w7y(this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
        c1768720w7y.LLILZLL = obj;
        return c1768720w7y;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009b  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1768720w7y.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
