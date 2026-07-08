package X;

import com.lynx.tasm.TemplateBundle;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS241S0000000_10;

/* JADX INFO: renamed from: X.0QbI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.service.EcomGeneralSearchServiceImpl$handleRouteWhenClickIcon$1", f = "EcomGeneralSearchServiceImpl.kt", l = {99}, m = "invokeSuspend")
public final class C673460QbI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C673460QbI(InterfaceC1364105Vn<? super C673460QbI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C673460QbI(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcomGeneralSearchServiceImpl@14b6.handleRouteWhenClickIcon$1");
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
            long jLongValue = ((Number) C18033074l.LIZ.getValue()).longValue();
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(jLongValue, this) == objLJFF) {
                C1C7U.LIZIZ("EcomGeneralSearchServiceImpl@14b6.handleRouteWhenClickIcon$1");
                return objLJFF;
            }
        }
        if (!C673480QbK.LIZ) {
            C1536940q68 c1536940q68 = new C1536940q68();
            c1536940q68.LIZ = "ec_search_general_biz";
            c1536940q68.LIZ(4);
            C683880Qs6.LIZIZ(c1536940q68);
            for (String str : (List) C098100Yp.LIZIZ.getValue()) {
                C673480QbK.LIZ("do_preload", null, null, 6);
                C683880Qs6.LIZ(str, null, new AbstractC1536860q60() { // from class: X.0Qm1
                    @Override // X.AbstractC1536860q60
                    public final void LIZIZ() {
                        C673480QbK.LIZ("pre_code_cache_post", null, null, 6);
                    }

                    @Override // X.AbstractC1536860q60
                    public final void LIZ(String str2) {
                        C673480QbK.LIZ("pre_code_cache_error", null, str2, 2);
                    }

                    @Override // X.AbstractC1536860q60
                    public final void LIZJ(String str2) {
                        C673480QbK.LIZ("pre_decode_error", null, str2, 2);
                    }

                    @Override // X.AbstractC1536860q60
                    public final void LIZLLL(TemplateBundle templateBundle) {
                        C673480QbK.LIZ("pre_decode_success", null, null, 6);
                    }

                    @Override // X.AbstractC1536860q60
                    public final void LJ(String str2) {
                        C673480QbK.LIZ("preload_error", null, str2, 2);
                    }

                    @Override // X.AbstractC1536860q60
                    public final void LJI(byte[] bArr, C1533790q13 c1533790q13, C1532310pyf c1532310pyf) {
                        C673480QbK.LIZ("preload_success", null, null, 6);
                    }
                }, false, AFwS241S0000000_10.get$arr$(533), 26);
            }
            C673480QbK.LIZ = true;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcomGeneralSearchServiceImpl@14b6.handleRouteWhenClickIcon$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C673460QbI(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
