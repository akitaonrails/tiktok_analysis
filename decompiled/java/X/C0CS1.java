package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CS1, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.preload.smart.v3.SmartPreloadV3Helper$handleWifiCheckResult$1", f = "SmartPreloadV3Helper.kt", l = {207}, m = "invokeSuspend")
public final class C0CS1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC2214871BmP LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CS1(InterfaceC2214871BmP interfaceC2214871BmP, int i, String str, boolean z, int i2, InterfaceC1364105Vn<? super C0CS1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC2214871BmP;
        this.LLILLL = i;
        this.LLILZ = str;
        this.LLILZIL = z;
        this.LLILZLL = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CS1(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SmartPreloadV3Helper@94ef.handleWifiCheckResult$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            Aweme aweme = C2214851BmN.LIZ;
            Boolean boolLIZ = C2214851BmN.LIZ(this.LLILLL, this.LLILLJJLI, this.LLILZ, this.LLILZIL);
            if (boolLIZ == null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("SmartPreloadV3Helper@94ef.handleWifiCheckResult$1");
                return unit;
            }
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C0CS2 c0cs2 = new C0CS2(boolLIZ, this.LLILZLL, this.LLILZ, this.LLILLJJLI, this.LLILZIL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c0cs2) == objLJFF) {
                C1C7U.LIZIZ("SmartPreloadV3Helper@94ef.handleWifiCheckResult$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SmartPreloadV3Helper@94ef.handleWifiCheckResult$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
