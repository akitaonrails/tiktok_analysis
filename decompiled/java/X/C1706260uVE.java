package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.effectcreator.models.EffectHint;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0uVE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1706260uVE implements InterfaceC1557470qdF {
    public final String LIZ;
    public LinkedHashMap<String, EffectHint> LIZIZ;

    public C1706260uVE() {
        C1706360uVO.LIZ().LIZ().getClass();
        this.LIZ = "ame_trigger_instant";
    }

    @Override // X.InterfaceC1557470qdF
    public final Object LIZ(InterfaceC1364105Vn<? super C1706280uVG> interfaceC1364105Vn) {
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        final C013C c013c = new C013C();
        LinkedHashMap<String, EffectHint> linkedHashMap = this.LIZIZ;
        if (linkedHashMap != null) {
            c013c.element = true;
            C1706280uVG c1706280uVG = new C1706280uVG(linkedHashMap, true);
            C189200o6.m2constructorimpl(c1706280uVG);
            c2252611DEt.resumeWith(c1706280uVG);
        }
        C1706380uVQ.LIZ().LJIIL(this.LIZ, new AbstractC1705800uUU<LinkedHashMap<String, EffectHint>>() { // from class: X.0uVD
            @Override // X.AbstractC1705800uUU
            public final LinkedHashMap<String, EffectHint> LJ(EffectChannelResponse effectChannelResponse) {
                String str;
                LinkedHashMap<String, EffectHint> linkedHashMap2 = new LinkedHashMap<>();
                Iterator<EffectCategoryResponse> it2 = effectChannelResponse.getCategory_responses().iterator();
                while (it2.hasNext()) {
                    for (Effect effect : it2.next().getTotal_effects()) {
                        String strLIZLLL = AbstractC1705830uUX.LIZLLL(this, effect.getExtra(), "hint_key");
                        if (strLIZLLL.length() != 0) {
                            String strLIZLLL2 = AbstractC1705830uUX.LIZLLL(this, effect.getExtra(), "effect_key");
                            List<String> urlList = effect.getHint_icon().getUrlList();
                            List<String> urlList2 = effect.getHint_file().getUrlList();
                            String hint = effect.getHint();
                            String str2 = "";
                            if (!(!urlList.isEmpty())) {
                                str = "";
                            } else {
                                str = (String) ListProtector.get(urlList, 0);
                            }
                            if (true ^ urlList2.isEmpty()) {
                                str2 = (String) ListProtector.get(urlList2, 0);
                            }
                            linkedHashMap2.put(strLIZLLL2, new EffectHint(strLIZLLL, strLIZLLL2, hint, str, str2, effect.getHint_file_format()));
                        }
                    }
                }
                return linkedHashMap2;
            }
        }, new InterfaceC1705380uTo<LinkedHashMap<String, EffectHint>>() { // from class: X.0uVF
            @Override // X.InterfaceC1705380uTo
            public final void LIZ(Integer num, String str) {
                this.LIZ.LIZIZ = null;
                if (c013c.element) {
                    return;
                }
                InterfaceC20236714Gf<C1706280uVG> interfaceC20236714Gf = c2252611DEt;
                C1706280uVG c1706280uVG2 = new C1706280uVG(new LinkedHashMap(), false);
                C189200o6.m2constructorimpl(c1706280uVG2);
                interfaceC20236714Gf.resumeWith(c1706280uVG2);
            }

            @Override // X.InterfaceC1705380uTo
            public final void LIZIZ(LinkedHashMap<String, EffectHint> linkedHashMap2, boolean z) {
                LinkedHashMap<String, EffectHint> linkedHashMap3 = linkedHashMap2;
                this.LIZ.LIZIZ = linkedHashMap3;
                if (!c013c.element) {
                    InterfaceC20236714Gf<C1706280uVG> interfaceC20236714Gf = c2252611DEt;
                    C1706280uVG c1706280uVG2 = new C1706280uVG(linkedHashMap3, true);
                    C189200o6.m2constructorimpl(c1706280uVG2);
                    interfaceC20236714Gf.resumeWith(c1706280uVG2);
                }
            }
        });
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }
}
