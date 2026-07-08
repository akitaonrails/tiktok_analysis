package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0gjc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.mapmode.map.landmark.LandMarkerRender$tryClusterLandMarks$1$1", f = "LandMarkerRender.kt", l = {}, m = "invokeSuspend")
public final class C1177020gjc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<C1177060gjg> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1177020gjc(List<C1177060gjg> list, InterfaceC1364105Vn<? super C1177020gjc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1177020gjc(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LandMarkerRender@cdec.tryClusterLandMarks$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        for (C1177060gjg c1177060gjg : this.LL) {
            c1177060gjg.LIZ.setVisible(c1177060gjg.LIZIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LandMarkerRender@cdec.tryClusterLandMarks$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
