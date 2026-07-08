package X;

import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0hJY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.videopublish.PoiPublishExtensionRepository$operator$1$initRequestPopupEnable$1", f = "PoiPublishExtensionRepository.kt", l = {147}, m = "invokeSuspend")
public final class C1199300hJY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super PoiSearchApi.PopupEnableResponse>, Object> {
    public int LL;

    public C1199300hJY(InterfaceC1364105Vn<? super C1199300hJY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1199300hJY(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiPublishExtensionRepository@30c1.operator$1$initRequestPopupEnable$1");
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
            C1199160hJK c1199160hJK = PoiSearchApi.LIZ;
            this.LL = 1;
            obj = c1199160hJK.LJ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PoiPublishExtensionRepository@30c1.operator$1$initRequestPopupEnable$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("PoiPublishExtensionRepository@30c1.operator$1$initRequestPopupEnable$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super PoiSearchApi.PopupEnableResponse> interfaceC1364105Vn) {
        return new C1199300hJY(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
