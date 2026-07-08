package X;

import com.lynx.tasm.TemplateBundle;
import com.ss.android.ugc.aweme.poi.claim.route.PoiClaimPreDecodeModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS241S0000000_10;

/* JADX INFO: renamed from: X.0Qm4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.claim.route.PoiClaimPreDecodeManager$doPoiLynxPreDecodeInSingleThread$1", f = "PoiClaimPreDecodeManager.kt", l = {}, m = "invokeSuspend")
public final class C680140Qm4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C680140Qm4(InterfaceC1364105Vn<? super C680140Qm4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C680140Qm4(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<String> list;
        C1C7U.LIZ("PoiClaimPreDecodeManager@c34c.doPoiLynxPreDecodeInSingleThread$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        PoiClaimPreDecodeModel poiClaimPreDecodeModel = (PoiClaimPreDecodeModel) C680170Qm7.LIZIZ.getValue();
        if (poiClaimPreDecodeModel != null && (list = poiClaimPreDecodeModel.preDecodeList) != null) {
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                C683880Qs6.LIZ(it2.next(), null, new AbstractC1536860q60() { // from class: X.0Qm2
                    @Override // X.AbstractC1536860q60
                    public final void LIZIZ() {
                        C680160Qm6.LIZ("pre_code_cache_post", "");
                    }

                    @Override // X.AbstractC1536860q60
                    public final void LIZ(String str) {
                        C680160Qm6.LIZ("pre_code_cache_error", str);
                    }

                    @Override // X.AbstractC1536860q60
                    public final void LIZJ(String str) {
                        C680160Qm6.LIZ("pre_decode_error", str);
                    }

                    @Override // X.AbstractC1536860q60
                    public final void LIZLLL(TemplateBundle templateBundle) {
                        C680160Qm6.LIZ("pre_decode_success", "");
                    }

                    @Override // X.AbstractC1536860q60
                    public final void LJ(String str) {
                        C680160Qm6.LIZ("preload_error", str);
                    }

                    @Override // X.AbstractC1536860q60
                    public final void LJI(byte[] bArr, C1533790q13 c1533790q13, C1532310pyf c1532310pyf) {
                        C680160Qm6.LIZ("preload_success", "");
                    }
                }, false, AFwS241S0000000_10.get$arr$(475), 10);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PoiClaimPreDecodeManager@c34c.doPoiLynxPreDecodeInSingleThread$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C680140Qm4(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
