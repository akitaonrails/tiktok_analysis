package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.p;
import com.ss.android.ugc.aweme.model.api.data.ProfileNaviAnimatedGifDataModel;
import com.ss.android.ugc.aweme.model.api.data.ProfileNaviDataModel;
import com.ss.android.ugc.aweme.model.api.data.ProfileNaviFeatureDataModel;
import com.ss.android.ugc.aweme.model.api.data.ProfileNaviStaticImageDataModel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.10z8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19424810z8 {
    public static String LIZIZ(InterfaceC19402510vX interfaceC19402510vX) {
        C19402010vS c19402010vS;
        n nVar = new n();
        if (interfaceC19402510vX instanceof InterfaceC19426310zN) {
            nVar.LJJIIJ("sticker_id", interfaceC19402510vX.getKey());
        } else {
            nVar.LJJIIJ("inspiration_key", interfaceC19402510vX.getKey());
        }
        InterfaceC19403010vc category = interfaceC19402510vX.getCategory();
        C19401910vR c19401910vRLJFF = category.LJFF();
        if (c19401910vRLJFF != null && (c19402010vS = c19401910vRLJFF.LIZIZ) != null) {
            n nVar2 = new n();
            nVar2.LJJIIJ("key", c19402010vS.LIZ);
            nVar.LJJIFFI("color_picker", nVar2);
        }
        C19425210zC c19425210zCLIZIZ = category.LIZIZ();
        if (c19425210zCLIZIZ != null) {
            n nVar3 = new n();
            nVar3.LJJIIJ("key", c19425210zCLIZIZ.LIZ);
            nVar3.LJJIII(Integer.valueOf(c19425210zCLIZIZ.LIZIZ), "value");
            nVar.LJJIFFI("flip", nVar3);
        }
        HashMap<String, C19425410zE> mapLIZ = category.LIZ();
        h hVar = new h();
        for (C19425410zE c19425410zE : mapLIZ.values()) {
            n nVar4 = new n();
            nVar4.LJJIIJ("key", c19425410zE.LIZ);
            nVar4.LJJIII(Integer.valueOf(c19425410zE.LJI), "value");
            hVar.LJJIFFI(nVar4);
        }
        nVar.LJJIFFI("sliders", hVar);
        return nVar.toString();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static C19424410z4 LIZ(ProfileNaviDataModel profileNaviDataModel, HashMap map) {
        HashMap<String, C19425110zB> map2;
        InterfaceC19403010vc interfaceC19403010vc;
        String str;
        C19425110zB c19425110zB;
        C19424410z4 c19424410z4 = new C19424410z4();
        String str2 = profileNaviDataModel.navi_id;
        if (str2 != null) {
            c19424410z4.LIZ = str2;
        }
        c19424410z4.LIZIZ = profileNaviDataModel.background_color;
        List<ProfileNaviStaticImageDataModel> list = profileNaviDataModel.staticImage;
        if (list != null && (!list.isEmpty())) {
            c19424410z4.LJ = ((ProfileNaviStaticImageDataModel) ListProtector.get(list, 0)).thumbnailUrl;
        }
        List<ProfileNaviAnimatedGifDataModel> list2 = profileNaviDataModel.animationList;
        if (list2 != null && (!list2.isEmpty())) {
            c19424410z4.LJFF = ((ProfileNaviAnimatedGifDataModel) ListProtector.get(list2, 0)).url;
        }
        List<ProfileNaviFeatureDataModel> list3 = profileNaviDataModel.features;
        if (list3 != null) {
            for (ProfileNaviFeatureDataModel profileNaviFeatureDataModel : list3) {
                String str3 = profileNaviFeatureDataModel.category;
                if (str3 != null && (interfaceC19403010vc = (InterfaceC19403010vc) map.get(str3)) != null && (str = profileNaviFeatureDataModel.info) != null) {
                    try {
                        new p();
                        n nVarLJIILIIL = p.LIZJ(str).LJIILIIL();
                        if (nVarLJIILIIL.LJJIJIIJIL("sticker_id")) {
                            String strLJIL = nVarLJIILIIL.LJJIIZ("sticker_id").LJIL();
                            u.LJJIFFI(strLJIL, "\"", "", false);
                            Iterator<InterfaceC19426310zN> it2 = interfaceC19403010vc.LIZJ().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                InterfaceC19426310zN next = it2.next();
                                if (Intrinsics.LJFF(next.getKey(), strLJIL)) {
                                    String groupId = interfaceC19403010vc.getGroupId();
                                    if (groupId != null && groupId.length() != 0) {
                                        c19424410z4.LIZJ.put(interfaceC19403010vc.getGroupId(), next);
                                    } else {
                                        c19424410z4.LIZJ.put(interfaceC19403010vc.getKey(), next);
                                    }
                                }
                            }
                        } else if (nVarLJIILIIL.LJJIJIIJIL("inspiration_key")) {
                            String strLJIL2 = nVarLJIILIIL.LJJIIZ("inspiration_key").LJIL();
                            u.LJJIFFI(strLJIL2, "\"", "", false);
                            if (interfaceC19403010vc.LIZLLL().containsKey(strLJIL2) && (c19425110zB = interfaceC19403010vc.LIZLLL().get(strLJIL2)) != null) {
                                String groupId2 = interfaceC19403010vc.getGroupId();
                                if (groupId2 != null && groupId2.length() != 0) {
                                    c19424410z4.LIZLLL.put(interfaceC19403010vc.getGroupId(), c19425110zB);
                                } else {
                                    c19424410z4.LIZLLL.put(interfaceC19403010vc.getKey(), c19425110zB);
                                }
                            }
                        }
                        LIZJ(nVarLJIILIIL, interfaceC19403010vc);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        e.getMessage();
                    }
                }
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!((InterfaceC19403010vc) entry.getValue()).LJ() && (map2 = c19424410z4.LIZLLL) != null && !map2.containsKey(entry.getKey()) && (!((InterfaceC19403010vc) entry.getValue()).LIZLLL().isEmpty())) {
                c19424410z4.LIZLLL.put((String) entry.getKey(), ((InterfaceC19403010vc) entry.getValue()).LIZLLL().entrySet().iterator().next().getValue());
            }
        }
        return c19424410z4;
    }

    public static void LIZJ(n nVar, InterfaceC19403010vc interfaceC19403010vc) {
        C19425410zE c19425410zE;
        if (nVar.LJJIJIIJIL("color_picker")) {
            n nVarLJIILIIL = nVar.LJJIIZ("color_picker").LJIILIIL();
            if (nVarLJIILIIL.LJJIJIIJIL("key")) {
                String strLJIL = nVarLJIILIIL.LJJIIZ("key").LJIL();
                C19401910vR c19401910vRLJFF = interfaceC19403010vc.LJFF();
                if (c19401910vRLJFF != null) {
                    Iterator<C19402010vS> it2 = c19401910vRLJFF.LIZ.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        C19402010vS next = it2.next();
                        if (Intrinsics.LJFF(next.LIZ, strLJIL)) {
                            c19401910vRLJFF.LIZIZ = next;
                            break;
                        }
                    }
                }
            }
        }
        if (nVar.LJJIJIIJIL("flip")) {
            n nVarLJIILIIL2 = nVar.LJJIIZ("flip").LJIILIIL();
            if (nVarLJIILIIL2.LJJIJIIJIL("key")) {
                String strLJIL2 = nVarLJIILIIL2.LJJIIZ("key").LJIL();
                C19425210zC c19425210zCLIZIZ = interfaceC19403010vc.LIZIZ();
                if (c19425210zCLIZIZ != null && Intrinsics.LJFF(c19425210zCLIZIZ.LIZ, strLJIL2) && nVarLJIILIIL2.LJJIJIIJIL("value")) {
                    c19425210zCLIZIZ.LIZIZ = nVarLJIILIIL2.LJJIIZ("value").LJIIJJI();
                }
            }
        }
        if (nVar.LJJIJIIJIL("sliders")) {
            for (k kVar : nVar.LJJIIZ("sliders").LJIIL()) {
                if (kVar instanceof n) {
                    n nVar2 = (n) kVar;
                    if (nVar2.LJJIJIIJIL("value")) {
                        int iLJIIJJI = nVar2.LJJIIZ("value").LJIIJJI();
                        if (nVar2.LJJIJIIJIL("slider_key") || nVar2.LJJIJIIJIL("key")) {
                            k kVarLJJIIZ = nVar2.LJJIIZ("slider_key");
                            if (kVarLJJIIZ == null) {
                                kVarLJJIIZ = nVar2.LJJIIZ("key");
                            }
                            String strLJIL3 = kVarLJJIIZ.LJIL();
                            if (interfaceC19403010vc.LIZ().containsKey(strLJIL3) && (c19425410zE = interfaceC19403010vc.LIZ().get(strLJIL3)) != null) {
                                c19425410zE.LJI = iLJIIJJI;
                            }
                        }
                    }
                }
            }
        }
    }
}
