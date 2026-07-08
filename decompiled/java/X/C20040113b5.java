package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.nimblecard.model.NimbleJson;
import com.ss.android.ugc.aweme.tako.ccl.net.TakoLanguageStyleSetting;
import com.ss.android.ugc.aweme.tako.ccl.net.TakoUserFeatureResponse;
import defpackage.u2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.13b5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.actionbar.TakoBotSetting$fetchUserFeature$1", f = "TakoBotSetting.kt", l = {103}, m = "invokeSuspend")
public final class C20040113b5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C20040113b5(InterfaceC1364105Vn<? super C20040113b5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20040113b5(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        boolean z;
        long j;
        String str2;
        String str3;
        Object objLJIILL = obj;
        C1C7U.LIZ("TakoBotSetting@84d0.fetchUserFeature$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJIILL);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJIILL);
            u2 u2VarLJFF = C1863380yae.LJJII.LJFF(C2286608xc.LJ(1), C2286608xc.LJFF(1L));
            if (u2VarLJFF != null && (str = u2VarLJFF.LIZIZ) != null && str.length() > 0) {
                if (((Number) C07IK.LIZ.getValue()).intValue() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                long j2 = 0;
                if (z) {
                    j = 32;
                } else {
                    j = 0;
                }
                AnonymousClass1426.LIZ.getClass();
                if (AnonymousClass1426.LIZ()) {
                    j2 = 256;
                }
                C1863980ybc c1863980ybc = C1863980ybc.LIZ;
                long j3 = j2 | j;
                C20039913b3.LIZ.getClass();
                NimbleJson nimbleJson = C20039913b3.LIZLLL;
                String str4 = "";
                if (nimbleJson == null || (str2 = nimbleJson.version) == null) {
                    str2 = "";
                }
                String strLIZ = C1849107Mb.LIZ();
                NimbleJson nimbleJson2 = C20039913b3.LIZJ;
                if (nimbleJson2 != null && (str3 = nimbleJson2.version) != null) {
                    str4 = str3;
                }
                this.LL = 1;
                objLJIILL = c1863980ybc.LJIILL(j3, str, "", str2, strLIZ, str4, this);
                if (objLJIILL == objLJFF) {
                    C1C7U.LIZIZ("TakoBotSetting@84d0.fetchUserFeature$1");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("TakoBotSetting@84d0.fetchUserFeature$1");
                return unit;
            }
        }
        TakoUserFeatureResponse takoUserFeatureResponse = (TakoUserFeatureResponse) objLJIILL;
        NimbleJson nimbleJsonLIZIZ = C685390QuX.LIZIZ(takoUserFeatureResponse.nimbleConf);
        if (nimbleJsonLIZIZ != null) {
            C20039913b3.LIZ.getClass();
            C20039913b3.LIZLLL = nimbleJsonLIZIZ;
            C1860520yW2 c1860520yW2 = C1860520yW2.LIZ;
            String strLIZ2 = C1849107Mb.LIZ();
            c1860520yW2.getClass();
            Keva kevaLJIIL = C1860520yW2.LJIIL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tako_nimble_template_local _");
            sbLIZ.append(strLIZ2);
            kevaLJIIL.storeString(C2188811AlT.LIZIZ(sbLIZ), C685390QuX.LIZ(nimbleJsonLIZIZ));
        }
        NimbleJson nimbleJsonLIZIZ2 = C685390QuX.LIZIZ(takoUserFeatureResponse.fullNimbleConf);
        if (nimbleJsonLIZIZ2 != null) {
            C20039913b3.LIZ.getClass();
            C20039913b3.LIZJ = nimbleJsonLIZIZ2;
            C1860520yW2.LIZ.getClass();
            C1860520yW2.LJIIL().storeString("tako_nimble_template_local _tako_nimble_conf", C685390QuX.LIZ(nimbleJsonLIZIZ2));
        }
        TakoLanguageStyleSetting takoLanguageStyleSetting = takoUserFeatureResponse.langStyleSetting;
        if (takoLanguageStyleSetting != null) {
            C201992141u.LIZ.getClass();
            C201992141u.LJFF(takoLanguageStyleSetting, false, null);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TakoBotSetting@84d0.fetchUserFeature$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C20040113b5(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
