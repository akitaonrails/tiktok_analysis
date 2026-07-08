package X;

import com.lynx.tasm.TemplateBundle;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS241S0000000_10;

/* JADX INFO: renamed from: X.0QbH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.service.EcomSearchServiceImpl$handleEcAfterBuildParam$1", f = "EcomSearchServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C673450QbH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C673450QbH(InterfaceC1364105Vn<? super C673450QbH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C673450QbH(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcomSearchServiceImpl@2921.handleEcAfterBuildParam$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!C673470QbJ.LIZ) {
            C1536940q68 c1536940q68 = new C1536940q68();
            c1536940q68.LIZ = "ec_search_shop_result_biz";
            c1536940q68.LIZ(8);
            C683880Qs6.LIZIZ(c1536940q68);
            for (String str : (List) C673440QbG.LIZIZ.getValue()) {
                C673470QbJ.LIZ("do_preload", null, null, 6);
                C683880Qs6.LIZ(str, null, new AbstractC1536860q60() { // from class: X.0Qm0
                    @Override // X.AbstractC1536860q60
                    public final void LIZIZ() {
                        C673470QbJ.LIZ("pre_code_cache_post", null, null, 6);
                    }

                    @Override // X.AbstractC1536860q60
                    public final void LJFF() {
                    }

                    @Override // X.AbstractC1536860q60
                    public final void LIZ(String str2) {
                        C673470QbJ.LIZ("pre_code_cache_error", null, str2, 2);
                    }

                    @Override // X.AbstractC1536860q60
                    public final void LIZJ(String str2) {
                        C673470QbJ.LIZ("pre_decode_error", null, str2, 2);
                    }

                    @Override // X.AbstractC1536860q60
                    public final void LIZLLL(TemplateBundle templateBundle) {
                        C673470QbJ.LIZ("pre_decode_success", null, null, 6);
                    }

                    @Override // X.AbstractC1536860q60
                    public final void LJ(String str2) {
                        C673470QbJ.LIZ("preload_error", null, str2, 2);
                    }
                }, false, AFwS241S0000000_10.get$arr$(602), 26);
            }
            C673470QbJ.LIZ = true;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcomSearchServiceImpl@2921.handleEcAfterBuildParam$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C673450QbH(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
