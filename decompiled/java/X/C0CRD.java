package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CRD, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.data.HybridABEvent$sendPreciseHybridABFlowTrack$1", f = "HybridABEvent.kt", l = {}, m = "invokeSuspend")
public final class C0CRD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CRD(String str, String str2, String str3, boolean z, InterfaceC1364105Vn<? super C0CRD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CRD(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("HybridABEvent@f9d7.sendPreciseHybridABFlowTrack$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0CR3 c0cr3 = C0CR3.LIZ;
        String str = this.LL;
        String str2 = this.LLILLJJLI;
        String str3 = this.LLILLL;
        boolean z = this.LLILZ;
        c0cr3.getClass();
        C0CR3.LIZIZ(str, str2, str3, z);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("HybridABEvent@f9d7.sendPreciseHybridABFlowTrack$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
