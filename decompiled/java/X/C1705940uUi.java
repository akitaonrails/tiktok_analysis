package X;

import com.bytedance.effectcreatormobile.infrastructure.effectplatform.api.AssetsLibData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uUi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1705940uUi implements InterfaceC1705960uUk {
    @Override // X.InterfaceC1705960uUk
    public final Object LIZ(String str, final C1706100uUy c1706100uUy, InterfaceC1364105Vn<? super AssetsLibData> interfaceC1364105Vn) {
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        C2256241DSs.LJIIIZ().LIZIZ(str, "all");
        C1706380uVQ.LIZ().LJIIL(str, new AbstractC1705800uUU<AssetsLibData>() { // from class: X.0uUf
            @Override // X.AbstractC1705800uUU
            public final AssetsLibData LJ(EffectChannelResponse effectChannelResponse) {
                Boolean boolValueOf;
                ArrayList arrayList = new ArrayList();
                for (EffectCategoryResponse effectCategoryResponse : effectChannelResponse.getCategory_responses()) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Effect effect : effectCategoryResponse.getTotal_effects()) {
                        String effect_id = effect.getEffect_id();
                        String key = effectCategoryResponse.getKey();
                        String name = effect.getName();
                        String strLIZIZ = AbstractC1705830uUX.LIZIZ(effect.getIcon_url().getUrlList());
                        String effect_id2 = effect.getEffect_id();
                        String extra = effect.getExtra();
                        String unzipPath = effect.getUnzipPath();
                        boolean zLJFF = C1706380uVQ.LIZ().LJFF(effect.getEffect_id());
                        String strLIZLLL = AbstractC1705830uUX.LIZLLL(this, effect.getExtra(), "capabilities");
                        String extra2 = effect.getExtra();
                        if (extra2 != null && extra2.length() != 0) {
                            try {
                                boolValueOf = Boolean.valueOf(new JSONObject(extra2).optBoolean("unique"));
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                boolValueOf = null;
                            }
                        } else {
                            boolValueOf = null;
                        }
                        arrayList2.add(new AssetsLibData.AssetsItemData(effect_id, key, strLIZIZ, name, effect_id2, extra, unzipPath, zLJFF, strLIZLLL, boolValueOf, effect.getResourceId(), 0, 0, null, null, null, AbstractC1705830uUX.LIZLLL(this, effect.getExtra(), "item_type"), null, null, false, effect, 980992));
                    }
                    String extra3 = effectCategoryResponse.getExtra();
                    if (extra3 == null) {
                        extra3 = "";
                    }
                    arrayList.add(new AssetsLibData.AssetsLibCategory(extra3, effectCategoryResponse.getName(), effectCategoryResponse.getKey(), arrayList2, effectCategoryResponse.getId(), null, null, false, 0, 0, null, false, 4064));
                }
                return new AssetsLibData(arrayList);
            }
        }, new InterfaceC1705380uTo<AssetsLibData>() { // from class: X.0uUp
            @Override // X.InterfaceC1705380uTo
            public final void LIZ(Integer num, String str2) {
                int iIntValue;
                int iIntValue2;
                C1706130uV1 c1706130uV1LJIIIZ = C2256241DSs.LJIIIZ();
                c1706130uV1LJIIIZ.LIZ(false);
                int iIntValue3 = -999;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = -999;
                }
                c1706130uV1LJIIIZ.LIZIZ.LIZJ = iIntValue;
                C1706100uUy c1706100uUy2 = c1706100uUy;
                if (c1706100uUy2 != null) {
                    c1706100uUy2.LIZIZ.LIZJ = -2001;
                    if (num != null) {
                        iIntValue2 = num.intValue();
                    } else {
                        iIntValue2 = -999;
                    }
                    C1706110uUz c1706110uUz = c1706100uUy2.LIZIZ;
                    c1706110uUz.LIZLLL = iIntValue2;
                    c1706110uUz.LJ = "net";
                    c1706100uUy2.LJFF();
                }
                C1706090uUx c1706090uUxLJIIJ = C2256241DSs.LJIIJ();
                c1706090uUxLJIIJ.LIZIZ.LIZJ = -2001;
                if (num != null) {
                    iIntValue3 = num.intValue();
                }
                C1706050uUt c1706050uUt = c1706090uUxLJIIJ.LIZIZ;
                c1706050uUt.LIZLLL = iIntValue3;
                c1706050uUt.LJ = "net";
                InterfaceC20236714Gf<AssetsLibData> interfaceC20236714Gf = c2252611DEt;
                C189200o6.m2constructorimpl(null);
                interfaceC20236714Gf.resumeWith(null);
            }

            @Override // X.InterfaceC1705380uTo
            public final void LIZIZ(AssetsLibData assetsLibData, boolean z) {
                C1706130uV1 c1706130uV1LJIIIZ = C2256241DSs.LJIIIZ();
                c1706130uV1LJIIIZ.LIZ(z);
                c1706130uV1LJIIIZ.LIZIZ.LIZJ = 1;
                C1706090uUx c1706090uUxLJIIJ = C2256241DSs.LJIIJ();
                if (z) {
                    C1706100uUy c1706100uUy2 = c1706100uUy;
                    if (c1706100uUy2 != null) {
                        c1706100uUy2.LIZIZ.LJ = "cache_disk";
                    }
                    c1706090uUxLJIIJ.LIZIZ.LJ = "cache_disk";
                } else {
                    C1706100uUy c1706100uUy3 = c1706100uUy;
                    if (c1706100uUy3 != null) {
                        c1706100uUy3.LIZIZ.LJ = "net";
                    }
                    c1706090uUxLJIIJ.LIZIZ.LJ = "net";
                }
                InterfaceC20236714Gf<AssetsLibData> interfaceC20236714Gf = c2252611DEt;
                C189200o6.m2constructorimpl(assetsLibData);
                interfaceC20236714Gf.resumeWith(assetsLibData);
            }
        });
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }
}
