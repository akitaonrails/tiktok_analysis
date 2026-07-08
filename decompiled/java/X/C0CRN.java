package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CRN, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.preload.smart.v3.SmartPreloadV3Helper$checkIsWifiStateAsync$1$2$1", f = "SmartPreloadV3Helper.kt", l = {}, m = "invokeSuspend")
public final class C0CRN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C0CRP LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CRN(boolean z, C0CRP c0crp, InterfaceC1364105Vn<? super C0CRN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = c0crp;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CRN(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SmartPreloadV3Helper@94ef.checkIsWifiStateAsync$1$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Aweme aweme = C2214851BmN.LIZ;
        boolean z = this.LL;
        C2214851BmN.LJIIIIZZ = z;
        this.LLILLJJLI.LIZIZ(z);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SmartPreloadV3Helper@94ef.checkIsWifiStateAsync$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
