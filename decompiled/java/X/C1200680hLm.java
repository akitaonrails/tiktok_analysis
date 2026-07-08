package X;

import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.claim.view.PoiClaimMapAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hLm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.claim.view.PoiClaimMapAssem$initObserver$2$1", f = "PoiClaimMapAssem.kt", l = {147}, m = "invokeSuspend")
public final class C1200680hLm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public PoiData LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ PoiData LLILZ;
    public final /* synthetic */ PoiClaimMapAssem LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1200680hLm(PoiData poiData, PoiClaimMapAssem poiClaimMapAssem, InterfaceC1364105Vn<? super C1200680hLm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = poiData;
        this.LLILZIL = poiClaimMapAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1200680hLm c1200680hLm = new C1200680hLm(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1200680hLm.LLILLL = obj;
        return c1200680hLm;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        PoiData poiData;
        C1C7U.LIZ("PoiClaimMapAssem@161b.initObserver$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                poiData = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            Object obj2 = this.LLILLL;
            poiData = this.LLILZ;
            if (poiData != null) {
                C099F c099f = this.LLILZIL.LLJIJIL;
                this.LLILLL = obj2;
                this.LL = poiData;
                this.LLILLJJLI = 1;
                obj = c099f.LJLIIIL(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("PoiClaimMapAssem@161b.initObserver$2$1");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("PoiClaimMapAssem@161b.initObserver$2$1");
            return unit;
        }
        InterfaceC1177250gjz interfaceC1177250gjz = (InterfaceC1177250gjz) obj;
        if (interfaceC1177250gjz != null) {
            interfaceC1177250gjz.LIZIZ(new C1177960gl8(poiData.latitude, poiData.longitude), C2286608xc.LIZLLL(15.0f), null);
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("googleMap=");
            sbLIZ.append(interfaceC1177250gjz);
            sbLIZ.append(", so moveCamera failed");
            C2188811AlT.LIZIZ(sbLIZ);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PoiClaimMapAssem@161b.initObserver$2$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
