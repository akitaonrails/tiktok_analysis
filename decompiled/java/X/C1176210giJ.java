package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.mapdetail.viewmodel.PoiMapDetailPageVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS562S0100000_18;
import njp.a;

/* JADX INFO: renamed from: X.0giJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.mapdetail.viewmodel.PoiMapDetailPageVM$asyncLoadPoiListData$1", f = "PoiMapDetailPageVM.kt", l = {344}, m = "invokeSuspend")
public final class C1176210giJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PoiMapDetailPageVM LLILLJJLI;
    public final /* synthetic */ C1176270giP LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ long LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1176210giJ(PoiMapDetailPageVM poiMapDetailPageVM, C1176270giP c1176270giP, boolean z, boolean z2, long j, InterfaceC1364105Vn<? super C1176210giJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = poiMapDetailPageVM;
        this.LLILLL = c1176270giP;
        this.LLILZ = z;
        this.LLILZIL = z2;
        this.LLILZLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1176210giJ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiMapDetailPageVM@b8ac.asyncLoadPoiListData$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                PoiMapDetailPageVM poiMapDetailPageVM = this.LLILLJJLI;
                C1176270giP c1176270giP = this.LLILLL;
                boolean z = this.LLILZ;
                boolean z2 = this.LLILZIL;
                long j = this.LLILZLL;
                this.LL = 1;
                if (poiMapDetailPageVM.CQ2(c1176270giP, z, z2, j, this) == objLJFF) {
                    C1C7U.LIZIZ("PoiMapDetailPageVM@b8ac.asyncLoadPoiListData$1");
                    return objLJFF;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            new AwS562S0100000_18(e, 2553).invoke();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PoiMapDetailPageVM@b8ac.asyncLoadPoiListData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
