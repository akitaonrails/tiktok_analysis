package X;

import Y.AfS187S0100000_18;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0gYH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.revisit.vm.PoiRevisitViewModel$updateCollectStatusToServer$1", f = "PoiRevisitViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1169990gYH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C614900O9w LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1169990gYH(C614900O9w c614900O9w, InterfaceC1364105Vn<? super C1169990gYH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c614900O9w;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1169990gYH(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiRevisitViewModel@2086.updateCollectStatusToServer$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        PoiListApi.LIZ.getClass();
        PoiListApi poiListApiLIZ = C1171370gaV.LIZ();
        C614900O9w c614900O9w = this.LL;
        String str = c614900O9w.LIZIZ;
        if (str == null) {
            str = "";
        }
        poiListApiLIZ.collectPoi(str, c614900O9w.LIZ ? 1 : 0).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS187S0100000_18(this.LL, 55));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PoiRevisitViewModel@2086.updateCollectStatusToServer$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
