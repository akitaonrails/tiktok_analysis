package X;

import com.ss.android.ugc.aweme.im.strategy.StrategyConfigData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Hmc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.strategy.api.StrategyRequestManager$fetchApi$1", f = "StrategyRequestManager.kt", l = {67}, m = "invokeSuspend")
public final class C451160Hmc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super StrategyConfigData>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ String[] LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C451160Hmc(String[] strArr, String str, InterfaceC1364105Vn<? super C451160Hmc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = strArr;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C451160Hmc(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C451160Hmc.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super StrategyConfigData> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
