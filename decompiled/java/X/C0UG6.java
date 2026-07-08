package X;

import com.bytedance.android.live.effect.model.composer.LiveComposerNode;
import com.bytedance.android.live.effect.model.composer.LiveComposerTagNode;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAIBeautyWhiteList;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectErrorInfoReportSetting;
import com.bytedance.android.livesdk.livesetting.effect.LiveEffectAudioGraphSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0UG6, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public abstract class C0UG6 implements C0U78 {
    public C0UG8 LIZJ;
    public final List<LiveComposerNode> LJFF;
    public final Set<String> LJI;
    public final HashMap<String, ArrayList<String>> LIZIZ = new HashMap<>();
    public final Map<String, List<LiveEffect>> LIZLLL = new ConcurrentHashMap();
    public final C0UGD LJ = new C0UGD();

    @Override // X.C0U78
    public void LJIILLIIL(LiveEffect liveEffect) {
    }

    @Override // X.C0U78
    public boolean LJJIIZ(List<? extends LiveEffect> list) {
        return true;
    }

    public static List LJJIJIIJIL() {
        return a0.LJJLIIIJILLIZJL(LiveAIBeautyWhiteList.INSTANCE.getValue(), new String[]{","}, 0, 6);
    }

    @Override // X.C0U78
    public final String LIZLLL() {
        C0UG9 c0ug9;
        String strLIZLLL;
        C0UG8 c0ug8 = this.LIZJ;
        return (c0ug8 == null || (c0ug9 = c0ug8.LIZJ) == null || (strLIZLLL = c0ug9.LIZLLL()) == null) ? "" : strLIZLLL;
    }

    @Override // X.C0U78
    public final JSONObject LJIIIZ() throws JSONException {
        LiveComposerTagNode next;
        JSONObject jSONObject = new JSONObject();
        List listLJJIJIIJIL = LJJIJIIJIL();
        C20441214yg.LIZIZ("AIBeauty#whiteList", listLJJIJIIJIL != null ? C13LP.LJJLIIIJ(listLJJIJIIJIL, ",", null, null, 0, null, null, 62) : null);
        List<String> listLJJIJIIJIL2 = LJJIJIIJIL();
        if (listLJJIJIIJIL2 != null) {
            String str = Intrinsics.LJFF(InterfaceC766480U4w.LJJJJZI.LIZ(), EnumC770010UIl.MALE.value) ? "_male" : "_female";
            for (String str2 : listLJJIJIIJIL2) {
                List<LiveComposerNode> listLJJIFFI = LJJIFFI();
                ArrayList<LiveComposerNode> arrayList = new ArrayList();
                for (LiveComposerNode liveComposerNode : listLJJIFFI) {
                    LiveComposerNode liveComposerNode2 = liveComposerNode;
                    if (Intrinsics.LJFF(liveComposerNode2.panel, C0UD4.LJFF) && Intrinsics.LJFF(liveComposerNode2.LIZ, str2)) {
                        arrayList.add(liveComposerNode);
                    }
                }
                for (LiveComposerNode liveComposerNode3 : arrayList) {
                    Iterator<LiveComposerTagNode> it2 = liveComposerNode3.tagList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        if (u.LJIIZILJ(next.LIZ, str, true)) {
                            break;
                        }
                    }
                    LiveComposerTagNode liveComposerTagNode = next;
                    if (liveComposerTagNode != null || (liveComposerTagNode = (LiveComposerTagNode) C13LP.LJJJLL(liveComposerNode3.tagList)) != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("value", Float.valueOf(liveComposerTagNode.value));
                        jSONObject2.put("min", 0);
                        jSONObject2.put("max", 1);
                        jSONObject.put(str2, jSONObject2);
                    }
                }
            }
        }
        return jSONObject;
    }

    @Override // X.C0U78
    public final void LJIJJ() {
        String strOk;
        C0UG9 c0ug9;
        if (LiveEffectErrorInfoReportSetting.INSTANCE.enable()) {
            try {
                C0UC4 c0uc4 = C0UC4.LIZ;
                C0UG8 c0ug8 = this.LIZJ;
                if (c0ug8 == null || (c0ug9 = c0ug8.LIZJ) == null || (strOk = c0ug9.ok()) == null) {
                    strOk = "";
                }
                HashMap<String, ArrayList<String>> map = this.LIZIZ;
                C0UG8 c0ug82 = this.LIZJ;
                C0UC4.LJJIFFI(strOk, map, Intrinsics.LJFF(c0ug82 != null ? c0ug82.LJI : null, "guest_linkmic"));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LIZIZ("errorInfo", e.getMessage());
            }
        }
    }

    @Override // X.C0U78
    public final void LJJLIIIJJI() {
        C0UG9 c0ug9;
        C0UG8 c0ug8 = this.LIZJ;
        if (c0ug8 == null || (c0ug9 = c0ug8.LIZJ) == null) {
            return;
        }
        c0ug9.LJJLIIIJJI();
    }

    public C0UG6() {
        new HashMap();
        this.LJFF = new ArrayList();
        this.LJI = new LinkedHashSet();
    }

    @Override // X.C0U78
    public final void LJJIIZI() {
        Iterator<LiveComposerNode> it2 = LJJIFFI().iterator();
        while (it2.hasNext()) {
            for (LiveComposerTagNode liveComposerTagNode : it2.next().tagList) {
                float f = liveComposerTagNode.LIZIZ;
                if (f != -999.0f) {
                    liveComposerTagNode.value = f;
                    liveComposerTagNode.LIZIZ = -999.0f;
                }
            }
        }
        zr(false);
    }

    public static Pair LJJIJIL(String str) {
        String str2 = C0UD4.LIZ;
        if (Intrinsics.LJFF(str, "livefiltercomposerexperiment")) {
            return new Pair("filter_effect_id", "filter_resource_id");
        }
        if (!Intrinsics.LJFF(str, C0UD4.LJ) && !Intrinsics.LJFF(str, C0UD4.LIZIZ)) {
            if (Intrinsics.LJFF(str, "livebackground")) {
                return new Pair("matting_effect_id", "matting_resource_id");
            }
            if (Intrinsics.LJFF(str, C0UD4.LJFF)) {
                return new Pair("beauty_effect_list", "beauty_resource_list");
            }
            if (!u.LJJIIJZLJL(str, "beauty", false) && !u.LJJIIJZLJL(str, "makeup", false)) {
                return new Pair("", "");
            }
            return new Pair("beauty_effect_list", "beauty_resource_list");
        }
        return new Pair("effect_effect_id", "effect_resource_id");
    }

    public static boolean LJJJI(String str) {
        if (!LiveEffectErrorInfoReportSetting.INSTANCE.enable()) {
            return false;
        }
        String str2 = C0UD4.LIZ;
        if (!Intrinsics.LJFF(str, "livefiltercomposerexperiment") && !Intrinsics.LJFF(str, C0UD4.LJFF) && !Intrinsics.LJFF(str, C0UD4.LJ) && !Intrinsics.LJFF(str, C0UD4.LIZIZ) && !Intrinsics.LJFF(str, "livehorizontaleffects") && !Intrinsics.LJFF(str, "livebackground")) {
            return false;
        }
        return true;
    }

    @Override // X.C0U78
    public final boolean LJIILJJIL(String str) {
        return LJJIJIIJIL().contains(str);
    }

    @Override // X.C0U78
    public final void LJJI(JSONObject jSONObject) {
        String str;
        boolean z;
        List<String> listLJJIJIIJIL = LJJIJIIJIL();
        if (listLJJIJIIJIL != null) {
            if (Intrinsics.LJFF(InterfaceC766480U4w.LJJJJZI.LIZ(), EnumC770010UIl.MALE.value)) {
                str = "_male";
            } else {
                str = "_female";
            }
            for (String str2 : listLJJIJIIJIL) {
                if (jSONObject.has(str2)) {
                    double d = JSONObjectProtectorUtils.getDouble(JSONObjectProtectorUtils.getJSONObject(jSONObject, str2), "value");
                    List<LiveComposerNode> listLJJIFFI = LJJIFFI();
                    ArrayList<LiveComposerNode> arrayList = new ArrayList();
                    for (LiveComposerNode liveComposerNode : listLJJIFFI) {
                        LiveComposerNode liveComposerNode2 = liveComposerNode;
                        if (Intrinsics.LJFF(liveComposerNode2.panel, C0UD4.LJFF) && Intrinsics.LJFF(liveComposerNode2.LIZ, str2)) {
                            arrayList.add(liveComposerNode);
                        }
                    }
                    for (LiveComposerNode liveComposerNode3 : arrayList) {
                        for (LiveComposerTagNode liveComposerTagNode : liveComposerNode3.tagList) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("value: ");
                            sbLIZ.append(d);
                            sbLIZ.append(", tag: ");
                            sbLIZ.append(liveComposerTagNode.LIZ);
                            sbLIZ.append(", suffix: ");
                            sbLIZ.append(str);
                            sbLIZ.append(", prefix: ");
                            sbLIZ.append(str2);
                            sbLIZ.append(", rollback: ");
                            sbLIZ.append(liveComposerTagNode.LIZIZ);
                            C20441214yg.LIZIZ("AIBeauty#applyTag", C2188811AlT.LIZIZ(sbLIZ));
                            this.LJI.add(liveComposerNode3.resourceId);
                            if (liveComposerTagNode.LIZIZ == -999.0f) {
                                liveComposerTagNode.LIZIZ = liveComposerTagNode.value;
                            }
                            float f = (float) d;
                            int iLIZJ = C0UG7.LIZJ(liveComposerTagNode.LIZJ, f);
                            LiveEffect.ComposerConfig composerConfig = liveComposerTagNode.LIZJ;
                            if (composerConfig != null && composerConfig.LIZIZ == iLIZJ) {
                                z = true;
                            } else {
                                z = false;
                            }
                            liveComposerNode3.modified = C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0;
                            liveComposerTagNode.value = f;
                            liveComposerTagNode.uiValue = Integer.valueOf(iLIZJ);
                        }
                    }
                }
            }
            zr(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIIJI(java.util.List<com.bytedance.android.live.effect.model.composer.LiveComposerNode> r15) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UG6.LJJIJIIJI(java.util.List):void");
    }

    public final void LJJIJL(List<LiveComposerNode> list) {
        boolean z;
        Object next;
        String strLJI;
        List listLJIJJLI = C15438062q.LJIJJLI(((ConcurrentHashMap) this.LIZLLL).values());
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((ArrayList) listLJIJJLI).iterator();
        while (true) {
            z = true;
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (((LiveEffect) next2).LJJIJIL().length() > 0) {
                arrayList.add(next2);
            }
        }
        Iterator it3 = arrayList.iterator();
        loop1: while (true) {
            if (it3.hasNext()) {
                next = it3.next();
                LiveEffect liveEffect = (LiveEffect) next;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<LiveComposerNode> it4 = list.iterator();
                    while (it4.hasNext()) {
                        if (Intrinsics.LJFF(it4.next().resourceId, liveEffect.getResourceId())) {
                            break loop1;
                        }
                    }
                }
            } else {
                next = null;
                break;
            }
        }
        LiveEffect liveEffect2 = (LiveEffect) next;
        if (liveEffect2 == null) {
            return;
        }
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        for (LiveComposerNode liveComposerNode : list) {
            if (!arrayList.isEmpty()) {
                Iterator it5 = arrayList.iterator();
                while (it5.hasNext()) {
                    if (Intrinsics.LJFF(((LiveEffect) it5.next()).getResourceId(), liveComposerNode.resourceId)) {
                        String strLIZLLL = C771370UNr.LIZLLL(C0UGA.LIZ(liveEffect2, ""));
                        int i = C771340UNo.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(liveEffect2.LLJI());
                        sbLIZ.append('-');
                        sbLIZ.append(strLIZLLL);
                        C771340UNo.LJFF("sticker_quiz", C2188811AlT.LIZIZ(sbLIZ));
                        C0VSJ c0vsj = new C0VSJ(strLIZLLL);
                        if (c0vsj.exists()) {
                            strLJI = C09BH.LJI(c0vsj, Charsets.UTF_8);
                        } else {
                            strLJI = "";
                        }
                        if (strLJI.length() <= 0) {
                            z = false;
                        }
                        if (z) {
                            C0UA1.LIZ().setRenderCacheString("quiz", strLJI);
                            return;
                        } else {
                            C0UA1.LIZ().setRenderCacheString("quiz", "");
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void LJJIZ(boolean z) {
        String strOk;
        String str;
        C0UG9 c0ug9;
        if (!LiveEffectErrorInfoReportSetting.INSTANCE.enable()) {
            return;
        }
        if (z) {
            try {
                C0UC4 c0uc4 = C0UC4.LIZ;
                C0UG8 c0ug8 = this.LIZJ;
                if (c0ug8 == null || (c0ug9 = c0ug8.LIZJ) == null || (strOk = c0ug9.ok()) == null) {
                    strOk = "";
                }
                HashMap<String, ArrayList<String>> map = this.LIZIZ;
                C0UG8 c0ug82 = this.LIZJ;
                if (c0ug82 != null) {
                    str = c0ug82.LJI;
                } else {
                    str = null;
                }
                C0UC4.LJJIFFI(strOk, map, Intrinsics.LJFF(str, "guest_linkmic"));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LIZIZ("errorInfo", e.getMessage());
            }
        }
        this.LIZIZ.clear();
    }

    public final void LJJJ(String[] strArr) {
        C0UG9 c0ug9;
        C0UG9 c0ug92;
        if (LiveEffectAudioGraphSetting.INSTANCE.enable()) {
            C0UG8 c0ug8 = this.LIZJ;
            if (c0ug8 != null && (c0ug92 = c0ug8.LIZJ) != null) {
                C0UGD c0ugd = this.LJ;
                c0ug92.LJIILL(strArr, c0ugd.LIZ, c0ugd.LIZIZ, c0ugd.LIZJ);
                return;
            }
            return;
        }
        C0UG8 c0ug82 = this.LIZJ;
        if (c0ug82 == null || (c0ug9 = c0ug82.LIZJ) == null) {
            return;
        }
        c0ug9.LJII(strArr);
    }

    public final void LJJJIL(LiveComposerNode liveComposerNode) {
        if (!LiveEffectAudioGraphSetting.INSTANCE.enable()) {
            return;
        }
        C0UGD c0ugd = this.LJ;
        c0ugd.LIZ |= liveComposerNode.inMic;
        c0ugd.LIZIZ |= liveComposerNode.inMusic;
        c0ugd.LIZJ = liveComposerNode.useOutput | c0ugd.LIZJ;
    }

    @Override // X.C0U78
    public final boolean LJJIIJZLJL(LiveEffect liveEffect, String str) {
        boolean zBooleanValue;
        C0UG9 c0ug9;
        String resourceId = liveEffect.getResourceId();
        String filePath = liveEffect.getFilePath();
        Boolean boolLJIIZILJ = liveEffect.LJIIZILJ();
        if (boolLJIIZILJ != null) {
            zBooleanValue = boolLJIIZILJ.booleanValue();
        } else {
            zBooleanValue = false;
        }
        LiveComposerNode liveComposerNode = new LiveComposerNode(str, resourceId, filePath, zBooleanValue, System.currentTimeMillis());
        liveComposerNode.LIZIZ(liveEffect);
        String strLIZIZ = C0UG7.LIZIZ(liveComposerNode);
        C0UG8 c0ug8 = this.LIZJ;
        if (c0ug8 == null || (c0ug9 = c0ug8.LIZJ) == null) {
            return false;
        }
        return c0ug9.LJIJJLI(new String[]{liveEffect.getFilePath()}, new String[]{strLIZIZ});
    }

    public final void LJJIJLIJ(LiveEffect liveEffect, String str) {
        Pair pairLJJIJIL = LJJIJIL(str);
        if (((CharSequence) pairLJJIJIL.getFirst()).length() == 0) {
            return;
        }
        ArrayList<String> arrayList = this.LIZIZ.get(pairLJJIJIL.getFirst());
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        if (!arrayList.contains(String.valueOf(liveEffect.getEffectId()))) {
            arrayList.add(String.valueOf(liveEffect.getEffectId()));
        }
        this.LIZIZ.put((String) pairLJJIJIL.getFirst(), arrayList);
        ArrayList<String> arrayList2 = this.LIZIZ.get(pairLJJIJIL.getSecond());
        if (arrayList2 == null) {
            arrayList2 = new ArrayList<>();
        }
        if (!arrayList2.contains(liveEffect.getResourceId())) {
            arrayList2.add(liveEffect.getResourceId());
        }
        this.LIZIZ.put((String) pairLJJIJIL.getSecond(), arrayList2);
    }

    public final void LJJIL(LiveEffect liveEffect, String str) {
        if (liveEffect.LJJJJLL()) {
            C520080KaU.LIZ.getClass();
            C520080KaU.LIZ(null, "", null, null, true);
        }
        Pair pairLJJIJIL = LJJIJIL(str);
        if (((CharSequence) pairLJJIJIL.getFirst()).length() == 0) {
            return;
        }
        ArrayList<String> arrayList = this.LIZIZ.get(pairLJJIJIL.getFirst());
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        arrayList.remove(String.valueOf(liveEffect.getEffectId()));
        this.LIZIZ.put((String) pairLJJIJIL.getFirst(), arrayList);
        ArrayList<String> arrayList2 = this.LIZIZ.get(pairLJJIJIL.getSecond());
        if (arrayList2 == null) {
            arrayList2 = new ArrayList<>();
        }
        arrayList2.remove(liveEffect.getResourceId());
        this.LIZIZ.put((String) pairLJJIJIL.getSecond(), arrayList2);
    }
}
