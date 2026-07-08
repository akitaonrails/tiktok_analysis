package X;

import com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0CVZ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.mapmode.PoiMapModePreload$preload$1", f = "PoiMapModePreload.kt", l = {}, m = "invokeSuspend")
public final class C0CVZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super PoiMapModeResponse>, Object> {
    public C0CVZ(InterfaceC1364105Vn<? super C0CVZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CVZ(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiMapModePreload@1037.preload$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1C7U.LIZIZ("PoiMapModePreload@1037.preload$1");
        return null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super PoiMapModeResponse> interfaceC1364105Vn) {
        new C0CVZ(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
        return null;
    }
}
