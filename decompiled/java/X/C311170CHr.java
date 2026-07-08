package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.services.external.TemplateScene;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0CHr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C311170CHr {
    public static final Map<C0CIJ, C311200CHu> LIZ;

    static {
        Pair[] pairArr = new Pair[13];
        C0CIJ c0cij = C0CIJ.UGC_PIP_MAGIC;
        String[] strArr = C311230CHx.LIZ;
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        Object[] objArr = C311230CHx.LIZ;
        Object[] objArr2 = (Object[]) c0c64LJIILLIIL.LJJIII("studio_editor_pro_pip_magic_unsupport_template_scenes", 0, objArr);
        if (objArr2 != null) {
            objArr = objArr2;
        }
        pairArr[0] = new Pair(c0cij, new C311200CHu(C13LQ.LJJLL(objArr)));
        C0CIJ c0cij2 = C0CIJ.UGC_AUDIO_FADE;
        C0C64 c0c64LJIILLIIL2 = C0C64.LJIILLIIL();
        Object[] objArr3 = C0CI1.LIZ;
        Object[] objArr4 = (Object[]) c0c64LJIILLIIL2.LJJIII("studio_editor_pro_audio_enable_fade_unsupport_template_scenes", 0, objArr3);
        if (objArr4 != null) {
            objArr3 = objArr4;
        }
        pairArr[1] = new Pair(c0cij2, new C311200CHu(C13LQ.LJJLL(objArr3)));
        C0CIJ c0cij3 = C0CIJ.CC_UPGRADE_109;
        List<String> listLJIIJJI = C13BV.INSTANCE;
        C311200CHu c311200CHu = new C311200CHu(listLJIIJJI);
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "is_support_cc_upgrade_109_anchor", true, false)) {
            listLJIIJJI = C1697810uHb.LJIIJJI(C0CI4.TEMPLATE_ANCHOR.getSceneName(), C0CI4.TEMPLATE_TAB.getSceneName(), C0CI4.AUTOCUT_LIST.getSceneName());
        }
        c311200CHu.LIZIZ = listLJIIJJI;
        pairArr[2] = new Pair(c0cij3, c311200CHu);
        C0CIJ c0cij4 = C0CIJ.UGC_FREEZE;
        String[] strArr2 = C311210CHv.LIZ;
        C0C64 c0c64LJIILLIIL3 = C0C64.LJIILLIIL();
        Object[] objArr5 = C311210CHv.LIZ;
        Object[] objArr6 = (Object[]) c0c64LJIILLIIL3.LJJIII("studio_editor_pro_freeze_unsupport_template_scenes", 0, objArr5);
        if (objArr6 != null) {
            objArr5 = objArr6;
        }
        pairArr[3] = new Pair(c0cij4, new C311200CHu(C13LQ.LJJLL(objArr5)));
        C0CIJ c0cij5 = C0CIJ.UGC_REVERSE_VIDEO;
        String[] strArr3 = C311250CHz.LIZ;
        C0C64 c0c64LJIILLIIL4 = C0C64.LJIILLIIL();
        Object[] objArr7 = C311250CHz.LIZ;
        Object[] objArr8 = (Object[]) c0c64LJIILLIIL4.LJJIII("studio_editor_pro_video_reverse_unsupport_template_scenes", 0, objArr7);
        if (objArr8 != null) {
            objArr7 = objArr8;
        }
        pairArr[4] = new Pair(c0cij5, new C311200CHu(C13LQ.LJJLL(objArr7)));
        C0CIJ c0cij6 = C0CIJ.UGC_I2V_FRAME;
        String[] strArr4 = C311220CHw.LIZ;
        C0C64 c0c64LJIILLIIL5 = C0C64.LJIILLIIL();
        Object[] objArr9 = C311220CHw.LIZ;
        Object[] objArr10 = (Object[]) c0c64LJIILLIIL5.LJJIII("studio_editor_pro_i2v_frame_unsupport_template_scenes", 0, objArr9);
        if (objArr10 != null) {
            objArr9 = objArr10;
        }
        pairArr[5] = new Pair(c0cij6, new C311200CHu(C13LQ.LJJLL(objArr9)));
        pairArr[6] = new Pair(C0CIJ.UGC_AI_CREATE_STYLIZED_I2V, new C311200CHu(C0CI3.LIZ()));
        pairArr[7] = new Pair(C0CIJ.UGC_AI_CREATE_STYLIZED_FL2V, new C311200CHu(C0CI3.LIZ()));
        C0CIJ c0cij7 = C0CIJ.SEGMENT_EFFECT;
        C0C64 c0c64LJIILLIIL6 = C0C64.LJIILLIIL();
        Object[] objArr11 = C0CI2.LIZ;
        Object[] objArr12 = (Object[]) c0c64LJIILLIIL6.LJJIII("studio_editor_pro_local_video_effect_unsupport_template_scenes", 0, objArr11);
        if (objArr12 != null) {
            objArr11 = objArr12;
        }
        pairArr[8] = new Pair(c0cij7, new C311200CHu(C13LQ.LJJLL(objArr11)));
        C0CIJ c0cij8 = C0CIJ.UGC_CUSTOM_CUTOUT;
        String[] strArr5 = C311240CHy.LIZ;
        C0C64 c0c64LJIILLIIL7 = C0C64.LJIILLIIL();
        Object[] objArr13 = C311240CHy.LIZ;
        Object[] objArr14 = (Object[]) c0c64LJIILLIIL7.LJJIII("studio_editor_pro_custom_cutout_unsupport_template_scenes", 0, objArr13);
        if (objArr14 != null) {
            objArr13 = objArr14;
        }
        pairArr[9] = new Pair(c0cij8, new C311200CHu(C13LQ.LJJLL(objArr13)));
        C0CIJ c0cij9 = C0CIJ.UGC_FREE_LAYER;
        C0C64 c0c64LJIILLIIL8 = C0C64.LJIILLIIL();
        Object[] objArr15 = C0CI0.LIZ;
        Object[] objArr16 = (Object[]) c0c64LJIILLIIL8.LJJIII("studio_ep_enable_free_layer_unsupport_template_scenes", 0, objArr15);
        if (objArr16 != null) {
            objArr15 = objArr16;
        }
        pairArr[10] = new Pair(c0cij9, new C311200CHu(C13LQ.LJJLL(objArr15)));
        C0CIJ c0cij10 = C0CIJ.AIGT_FIXED_ASSET;
        C311200CHu c311200CHu2 = new C311200CHu(C311180CHs.LIZ());
        c311200CHu2.LIZIZ = C311180CHs.LIZ();
        pairArr[11] = new Pair(c0cij10, c311200CHu2);
        pairArr[12] = new Pair(C0CIJ.UGC_SGT, new C311200CHu(Collections.singletonList("template_tab")));
        Map<C0CIJ, C311200CHu> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (((Boolean) C264380AXs.LIZ.getValue()).booleanValue()) {
            for (Map.Entry<String, List<String>> entry : ((InterfaceC274140Aom) C0BVZ.LIZ.getValue()).LIZIZ().entrySet()) {
                mapLJIIJ.put(C0CIJ.valueOf(entry.getKey()), new C311200CHu(entry.getValue()));
            }
        } else {
            C0CIJ c0cij11 = C0CIJ.UGC_PIP_ANIM;
            C0C64 c0c64LJIILLIIL9 = C0C64.LJIILLIIL();
            Object[] objArr17 = C274100Aoi.LIZ;
            Object[] objArr18 = (Object[]) c0c64LJIILLIIL9.LJJIII("studio_editor_pro_pip_anim_unsupport_template_scenes", 0, objArr17);
            if (objArr18 != null) {
                objArr17 = objArr18;
            }
            mapLJIIJ.put(c0cij11, new C311200CHu(C13LQ.LJJLL(objArr17)));
            C0CIJ c0cij12 = C0CIJ.UGC_PIP_FILTER;
            C0C64 c0c64LJIILLIIL10 = C0C64.LJIILLIIL();
            Object[] objArr19 = C274110Aoj.LIZ;
            Object[] objArr20 = (Object[]) c0c64LJIILLIIL10.LJJIII("studio_editor_pro_pip_filter_unsupport_template_scenes", 0, objArr19);
            if (objArr20 != null) {
                objArr19 = objArr20;
            }
            mapLJIIJ.put(c0cij12, new C311200CHu(C13LQ.LJJLL(objArr19)));
        }
        LIZ = mapLJIIJ;
    }

    public static String LIZ() {
        List listLLIIII = C13LP.LLIIII(LIZIZ());
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLLIIII, 10));
        Iterator it2 = listLLIIII.iterator();
        while (it2.hasNext()) {
            arrayList.add(String.valueOf(((Number) it2.next()).intValue()));
        }
        return GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), arrayList);
    }

    public static List LIZIZ() {
        List listLJJLL = C13LQ.LJJLL(C0CIJ.values());
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLL, 10));
        Iterator it2 = listLJJLL.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(((C0CIJ) it2.next()).getValue()));
        }
        return arrayList;
    }

    public static List LIZLLL(C0CI4 c0ci4) {
        List<String> list;
        List listLJJLL = C13LQ.LJJLL(C0CIJ.values());
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLJJLL) {
            C311200CHu c311200CHu = (C311200CHu) ((LinkedHashMap) LIZ).get(obj);
            if (c311200CHu == null || (list = c311200CHu.LIZIZ) == null || !list.contains(c0ci4.getSceneName())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(((C0CIJ) it2.next()).getValue()));
        }
        return arrayList2;
    }

    public static List LJ(C0CI4 c0ci4) {
        List<String> list;
        List listLJJLL = C13LQ.LJJLL(C0CIJ.values());
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLJJLL) {
            C311200CHu c311200CHu = (C311200CHu) ((LinkedHashMap) LIZ).get(obj);
            if (c311200CHu == null || (list = c311200CHu.LIZ) == null || !list.contains(c0ci4.getSceneName())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(((C0CIJ) it2.next()).getValue()));
        }
        return arrayList2;
    }

    public static List LIZJ(TemplateScene templateScene, boolean z) {
        int i = C1395030mPF.LIZ[templateScene.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i != 4) {
                    return LIZIZ();
                }
                return LJ(C0CI4.TEMPLATE_TAB);
            }
            return LJ(C0CI4.AUTOCUT_LIST);
        }
        if (z) {
            return LIZIZ();
        }
        return LJ(C0CI4.TEMPLATE_ANCHOR);
    }
}
