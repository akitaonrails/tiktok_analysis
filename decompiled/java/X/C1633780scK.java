package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.HorizontalEffectsModel;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0scK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1633780scK implements InterfaceC1633390sbh {
    public final Function1<String, C20008813Qo> LIZ;
    public final Function2<String, String, Unit> LIZIZ;
    public final AbstractC19987213Ig LIZJ;
    public final Function1<String, Unit> LIZLLL;
    public final InterfaceC1633810scN LJ;
    public final InterfaceC1633820scO LJFF;

    public C1633780scK() {
        throw null;
    }

    public static List LJ(List list) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Effect effect = new Effect((Effect) it2.next());
            effect.set_cached_data(true);
            arrayList.add(effect);
        }
        return arrayList;
    }

    @Override // X.InterfaceC1633390sbh
    public final HorizontalEffectsModel LIZ(C1633200sbO c1633200sbO) throws IOException {
        String next;
        Effect effectLIZ;
        InputStream inputStreamLIZ;
        Object c098200Yq;
        InputStream inputStreamLIZ2;
        Object c098200Yq2;
        C20008813Qo c20008813QoInvoke = this.LIZ.invoke(LJFF(c1633200sbO, true));
        if (c20008813QoInvoke != null && (inputStreamLIZ2 = c20008813QoInvoke.LIZ()) != null) {
            try {
                AbstractC19987213Ig abstractC19987213Ig = this.LIZJ;
                c098200Yq2 = (HorizontalEffectsModel) C13J5.LIZ(abstractC19987213Ig, C13G2.LIZIZ(abstractC19987213Ig.LIZIZ, C13LE.LJII(HorizontalEffectsModel.class)), inputStreamLIZ2);
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq2 = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                c098200Yq2 = null;
            }
            HorizontalEffectsModel horizontalEffectsModel = (HorizontalEffectsModel) c098200Yq2;
            inputStreamLIZ2.close();
            if (horizontalEffectsModel != null) {
                return horizontalEffectsModel;
            }
        }
        InterfaceC1633820scO interfaceC1633820scO = this.LJFF;
        if (interfaceC1633820scO == null) {
            return null;
        }
        Iterator<String> it2 = c1633200sbO.LIZ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (!a0.LJJJIL(next)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        String str = next;
        if (str == null || (effectLIZ = interfaceC1633820scO.LIZ(str)) == null) {
            return null;
        }
        Function1<String, Unit> function1 = this.LIZLLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("insert effect fallback: found effect ");
        sbLIZ.append(str);
        sbLIZ.append(" in ShootSameEffectCaches");
        function1.invoke(C2188811AlT.LIZIZ(sbLIZ));
        C20008813Qo c20008813QoInvoke2 = this.LIZ.invoke(LJFF(C1633200sbO.LIZ(c1633200sbO, C13BV.INSTANCE, 0, 6), true));
        if (c20008813QoInvoke2 == null || (inputStreamLIZ = c20008813QoInvoke2.LIZ()) == null) {
            return null;
        }
        try {
            AbstractC19987213Ig abstractC19987213Ig2 = this.LIZJ;
            c098200Yq = (HorizontalEffectsModel) C13J5.LIZ(abstractC19987213Ig2, C13G2.LIZIZ(abstractC19987213Ig2.LIZIZ, C13LE.LJII(HorizontalEffectsModel.class)), inputStreamLIZ);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        HorizontalEffectsModel horizontalEffectsModel2 = (HorizontalEffectsModel) c098200Yq;
        if (horizontalEffectsModel2 == null) {
            return null;
        }
        inputStreamLIZ.close();
        this.LIZLLL.invoke("insert effect fallback: merging into vanilla cache");
        Iterable iterable = horizontalEffectsModel2.insert_effects;
        if (iterable == null) {
            iterable = C13BV.INSTANCE;
        }
        return horizontalEffectsModel2.copy(horizontalEffectsModel2.trending_effects, horizontalEffectsModel2.favorite_effects, horizontalEffectsModel2.recent_effects, C13LP.LJLIL(iterable, Collections.singletonList(effectLIZ)), horizontalEffectsModel2.left_trending_effects, horizontalEffectsModel2.url_prefix, horizontalEffectsModel2.from_cache, horizontalEffectsModel2.logId);
    }

    @Override // X.InterfaceC1633390sbh
    public final PanelInfoModel LIZLLL(C1633200sbO c1633200sbO) throws IOException {
        InputStream inputStreamLIZ;
        Object c098200Yq;
        C20008813Qo c20008813QoInvoke = this.LIZ.invoke(LJFF(c1633200sbO, false));
        Object obj = null;
        if (c20008813QoInvoke == null || (inputStreamLIZ = c20008813QoInvoke.LIZ()) == null) {
            return null;
        }
        try {
            AbstractC19987213Ig abstractC19987213Ig = this.LIZJ;
            c098200Yq = (PanelInfoModel) C13J5.LIZ(abstractC19987213Ig, C13G2.LIZIZ(abstractC19987213Ig.LIZIZ, C13LE.LJII(PanelInfoModel.class)), inputStreamLIZ);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        PanelInfoModel panelInfoModel = (PanelInfoModel) obj;
        inputStreamLIZ.close();
        return panelInfoModel;
    }

    public C1633780scK(Function1 function1, Function2 function2) {
        InterfaceC1633820scO interfaceC1633820scO;
        C13IV c13ivLIZ = C13J2.LIZ(AFwS271S0000000_28.get$arr$(326));
        C1642360sqA c1642360sqA = C1642360sqA.LL;
        final boolean z = !C04QV.LIZ();
        InterfaceC1633810scN interfaceC1633810scN = new InterfaceC1633810scN(z) { // from class: X.0scL
            public final boolean LIZ;

            {
                this.LIZ = z;
            }

            @Override // X.InterfaceC1633810scN
            public final String LIZ(int i, String str, String str2) {
                if (this.LIZ) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("paneleffects_scene_");
                    sbLIZ.append(i);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    C13SS c13ss = C13SS.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("generate horizontalEffects cache Key: ");
                    sbLIZ2.append(strLIZIZ);
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    c13ss.getClass();
                    C13SS.LIZ("effect_request_chine_tag", strLIZIZ2);
                    return strLIZIZ;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(C13OQ.LJIIIZ(i, str, str2));
                sbLIZ3.append("_panel");
                return C2188811AlT.LIZIZ(sbLIZ3);
            }

            @Override // X.InterfaceC1633810scN
            public final String LIZIZ(int i, String str, String str2) {
                if (this.LIZ) {
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("horizontaleffects_scene_");
                    sbLIZ.append(i);
                    sb.append(C2188811AlT.LIZIZ(sbLIZ));
                    if (str != null && (!a0.LJJJIL(str))) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append('_');
                        sbLIZ2.append(str);
                        sb.append(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    String string = sb.toString();
                    C13SS c13ss = C13SS.LIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("generate horizontalEffects cache Key: ");
                    sbLIZ3.append(string);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                    c13ss.getClass();
                    C13SS.LIZ("effect_request_chine_tag", strLIZIZ);
                    return string;
                }
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(C13OQ.LJIIIZ(i, str, str2));
                sbLIZ4.append("_horizontal");
                return C2188811AlT.LIZIZ(sbLIZ4);
            }
        };
        if (!C04QV.LIZ()) {
            interfaceC1633820scO = new InterfaceC1633820scO() { // from class: X.0scM
                @Override // X.InterfaceC1633820scO
                public final Effect LIZ(String str) {
                    List<Effect> data;
                    EffectListResponse effectListResponseLIZ = C1398060mU8.LIZ(str);
                    if (effectListResponseLIZ != null && (data = effectListResponseLIZ.getData()) != null) {
                        return (Effect) C13LP.LJJJLL(data);
                    }
                    return null;
                }
            };
        } else {
            interfaceC1633820scO = null;
        }
        this.LIZ = function1;
        this.LIZIZ = function2;
        this.LIZJ = c13ivLIZ;
        this.LIZLLL = c1642360sqA;
        this.LJ = interfaceC1633810scN;
        this.LJFF = interfaceC1633820scO;
    }

    @Override // X.InterfaceC1633390sbh
    public final void LIZIZ(C1633200sbO c1633200sbO, PanelInfoModel panelInfoModel) {
        Object c098200Yq;
        String strLJFF = LJFF(c1633200sbO, false);
        AbstractC19987213Ig abstractC19987213Ig = this.LIZJ;
        String strLIZJ = abstractC19987213Ig.LIZJ(C13G2.LIZIZ(abstractC19987213Ig.LIZIZ, C13LE.LJII(PanelInfoModel.class)), panelInfoModel);
        AbstractC19987213Ig abstractC19987213Ig2 = this.LIZJ;
        PanelInfoModel panelInfoModel2 = (PanelInfoModel) abstractC19987213Ig2.LIZIZ(C13G2.LIZIZ(abstractC19987213Ig2.LIZIZ, C13LE.LJII(PanelInfoModel.class)), strLIZJ);
        CategoryEffectModel category_effects = panelInfoModel2.getCategory_effects();
        if (category_effects != null) {
            category_effects.setCategory_effects(LJ(category_effects.getCategory_effects()));
            category_effects.setCollection(LJ(category_effects.getCollection()));
            category_effects.setBind_effects(LJ(category_effects.getBind_effects()));
        }
        try {
            AbstractC19987213Ig abstractC19987213Ig3 = this.LIZJ;
            c098200Yq = abstractC19987213Ig3.LIZJ(C13G2.LIZIZ(abstractC19987213Ig3.LIZIZ, C13LE.LJII(PanelInfoModel.class)), panelInfoModel2);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        LJI((String) c098200Yq, strLJFF);
    }

    @Override // X.InterfaceC1633390sbh
    public final void LIZJ(C1633200sbO c1633200sbO, HorizontalEffectsModel horizontalEffectsModel) {
        List<? extends Effect> listLJ;
        List<? extends Effect> listLJ2;
        List<? extends Effect> listLJ3;
        Object c098200Yq;
        String strLJFF = LJFF(c1633200sbO, true);
        List<? extends Effect> list = horizontalEffectsModel.favorite_effects;
        List<? extends Effect> list2 = horizontalEffectsModel.recent_effects;
        List<? extends Effect> list3 = horizontalEffectsModel.insert_effects;
        List<? extends Effect> listLJ4 = LJ(horizontalEffectsModel.trending_effects);
        Object obj = null;
        if (list != null) {
            listLJ = LJ(list);
        } else {
            listLJ = null;
        }
        if (list2 != null) {
            listLJ2 = LJ(list2);
        } else {
            listLJ2 = null;
        }
        if (list3 != null) {
            listLJ3 = LJ(list3);
        } else {
            listLJ3 = null;
        }
        HorizontalEffectsModel horizontalEffectsModelCopy = horizontalEffectsModel.copy(listLJ4, listLJ, listLJ2, listLJ3, horizontalEffectsModel.left_trending_effects, horizontalEffectsModel.url_prefix, true, horizontalEffectsModel.logId);
        try {
            AbstractC19987213Ig abstractC19987213Ig = this.LIZJ;
            c098200Yq = abstractC19987213Ig.LIZJ(C13G2.LIZIZ(abstractC19987213Ig.LIZIZ, C13LE.LJII(HorizontalEffectsModel.class)), horizontalEffectsModelCopy);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        LJI((String) obj, strLJFF);
    }

    public final String LJFF(C1633200sbO c1633200sbO, boolean z) {
        List<String> list = c1633200sbO.LIZ;
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!a0.LJJJIL(str)) {
                arrayList.add(str);
            }
        }
        String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, "_", null, null, 0, null, null, 62);
        if (z) {
            return this.LJ.LIZIZ(c1633200sbO.LIZIZ, strLJJLIIIJ, c1633200sbO.LIZJ);
        }
        return this.LJ.LIZ(c1633200sbO.LIZIZ, strLJJLIIIJ, c1633200sbO.LIZJ);
    }

    public final void LJI(String str, String str2) {
        boolean z;
        Integer numValueOf;
        Function1<String, Unit> function1 = this.LIZLLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("saving to disk ");
        sbLIZ.append(str2);
        sbLIZ.append(" json is null? ");
        if (str == null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(" len = ");
        if (str != null) {
            numValueOf = Integer.valueOf(str.length());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        function1.invoke(C2188811AlT.LIZIZ(sbLIZ));
        if (str != null) {
            this.LIZIZ.invoke(str2, str);
        }
    }
}
