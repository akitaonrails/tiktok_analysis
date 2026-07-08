package X;

import android.content.Context;
import android.util.Log;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.edit.FeatureExtraction;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.MixEditingModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.mixediting.IMixEditingFeatureExtractionService;
import com.ss.android.vesdk.VEUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import njp.a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08up, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.resource.feature.MixEditingFeatureExtractionServiceKt$getLocalFeatures$1$1$1", f = "MixEditingFeatureExtractionService.kt", l = {867}, m = "invokeSuspend")
public final class C2269308up extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public int LL;
    public final /* synthetic */ List<C2262608tk> LLILLJJLI;
    public final /* synthetic */ VideoPublishEditModel LLILLL;
    public final /* synthetic */ Set<String> LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ long LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2269308up(List<C2262608tk> list, VideoPublishEditModel videoPublishEditModel, Set<String> set, String str, String str2, String str3, long j, InterfaceC1364105Vn<? super C2269308up> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = videoPublishEditModel;
        this.LLILZ = set;
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LLIZ = str3;
        this.LLIZLLLIL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2269308up(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        List<Pair> list;
        ArrayList<FeatureExtraction> arrayList;
        ArrayList arrayList2;
        Object next;
        String string;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        boolean z5;
        int i2;
        boolean z6;
        boolean z7;
        VEUtils.VEVideoFileInfo videoFileInfo;
        String str;
        long j;
        boolean z8;
        Object objLIZIZ = obj;
        C1C7U.LIZ("MixEditingFeatureExtractionServiceKt@6aea.getLocalFeatures$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i3 = this.LL;
        try {
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLIZIZ);
            } else {
                C155000ia.LIZIZ(objLIZIZ);
                C0MJ8 c0mj8 = C0MJ8.LIZIZ;
                StringBuilder sb = new StringBuilder("MixEditingFeatureExtractionService -> getLocalFeatures:extractionAssets = ");
                List<C2262608tk> list2 = this.LLILLJJLI;
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                Iterator<C2262608tk> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(it2.next().LIZ);
                }
                sb.append(arrayList3);
                sb.append(';');
                C201955140j.LIZJ(c0mj8, sb.toString());
                List<FeatureExtraction> list3 = this.LLILLL.creativeModel.mixEditingModel.mixEditingFeatureExtraction;
                if (list3 != null) {
                    C0MJ8 c0mj82 = C0MJ8.LIZIZ;
                    StringBuilder sb2 = new StringBuilder("MixEditingFeatureExtractionService -> getLocalFeatures:mixEditingModel.mixEditingFeatureExtraction = ");
                    ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(list3, 10));
                    Iterator<FeatureExtraction> it3 = list3.iterator();
                    while (it3.hasNext()) {
                        arrayList4.add(it3.next().path);
                    }
                    sb2.append(arrayList4);
                    sb2.append(';');
                    C201955140j.LIZJ(c0mj82, sb2.toString());
                    ((IMixEditingFeatureExtractionService) ServiceManager.get().getService(IMixEditingFeatureExtractionService.class)).LJIIIZ(list3);
                }
                long jLongValue = ((Number) C2269408uq.LIZ.getValue()).longValue();
                C2262408ti c2262408ti = new C2262408ti(this.LLILLJJLI, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, null);
                this.LL = 1;
                objLIZIZ = C099A.LIZIZ(jLongValue, c2262408ti, this);
                if (objLIZIZ == objLJFF) {
                    C1C7U.LIZIZ("MixEditingFeatureExtractionServiceKt@6aea.getLocalFeatures$1$1$1");
                    return objLJFF;
                }
            }
            list = (List) objLIZIZ;
        } catch (C094W e) {
            TryCatchGuardChecker.doCheck(e);
            Log.wtf("MIX_EDITING_FEATURE_EXTRACTION", e);
            list = null;
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "support_bach_cache_by_name", true, false)) {
            C2277408w8.LJIIJ.getValue().LIZ();
        }
        if (list != null) {
            for (Pair pair : list) {
                C0MJ8 c0mj83 = C0MJ8.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("localFeatureResults use cache: ");
                sbLIZ.append(((Number) pair.getSecond()).intValue());
                sbLIZ.append("；results = ");
                sbLIZ.append(((FeatureExtraction) pair.getFirst()).algorithm.keySet());
                sbLIZ.append(", ");
                sbLIZ.append(((FeatureExtraction) pair.getFirst()).algorithm.values());
                C201955140j.LIZLLL(c0mj83, "MIX_EDITING_FEATURE_EXTRACTION", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        if (list != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it4 = list.iterator();
            while (it4.hasNext()) {
                arrayList.add(((Pair) it4.next()).getFirst());
            }
        } else {
            arrayList = null;
        }
        C0MJ8 c0mj84 = C0MJ8.LIZIZ;
        StringBuilder sb3 = new StringBuilder("MixEditingFeatureExtractionService -> getLocalFeatures:localFeatureResults = ");
        if (arrayList != null) {
            arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it5 = arrayList.iterator();
            while (it5.hasNext()) {
                arrayList2.add(((FeatureExtraction) it5.next()).path);
            }
        } else {
            arrayList2 = null;
        }
        sb3.append(arrayList2);
        sb3.append(';');
        C201955140j.LIZJ(c0mj84, sb3.toString());
        CreativeModel creativeModel = this.LLILLL.creativeModel;
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "studio_fix_bach_result_not_save_draft", true, false)) {
            creativeModel.mixEditingModel.mixEditingFeatureExtraction = arrayList;
        } else {
            MixEditingModel mixEditingModel = creativeModel.mixEditingModel;
            List<FeatureExtraction> list4 = mixEditingModel.mixEditingFeatureExtraction;
            if (list4 == null) {
                mixEditingModel.mixEditingFeatureExtraction = arrayList;
            } else if (arrayList != null) {
                ArrayList arrayList5 = new ArrayList(list4);
                for (FeatureExtraction featureExtraction : arrayList) {
                    Iterator it6 = arrayList5.iterator();
                    while (true) {
                        if (it6.hasNext()) {
                            next = it6.next();
                            if (Intrinsics.LJFF(((FeatureExtraction) next).path, featureExtraction.path)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    FeatureExtraction featureExtraction2 = (FeatureExtraction) next;
                    if (featureExtraction2 != null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(featureExtraction2.algorithm);
                        for (Map.Entry<String, ? extends List<String>> entry : featureExtraction.algorithm.entrySet()) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                        featureExtraction2.algorithm = linkedHashMap;
                    } else {
                        arrayList5.add(featureExtraction);
                    }
                }
                creativeModel.mixEditingModel.mixEditingFeatureExtraction = arrayList5;
            }
        }
        if (arrayList != null) {
            long j2 = this.LLIZLLLIL;
            String str2 = this.LLILZLL;
            String str3 = this.LLIZ;
            String str4 = this.LLILZIL;
            Set<String> set = this.LLILZ;
            List<C2262608tk> list5 = this.LLILLJJLI;
            if (C296620Bjw.LIZ()) {
                C201955140j.LIZLLL(C1398350mUb.LIZIZ, "MixEditingFeatureExtractionService", "getLocalFeatures: StudioAssetApiUpgradeAB hit, building image_info_list rec_config directly");
                JSONArray jSONArray = new JSONArray();
                Iterator it7 = arrayList.iterator();
                while (true) {
                    string = "";
                    if (!it7.hasNext()) {
                        break;
                    }
                    FeatureExtraction featureExtraction3 = (FeatureExtraction) it7.next();
                    if (featureExtraction3.width > 0 && featureExtraction3.height > 0) {
                        z7 = false;
                    } else {
                        z7 = true;
                    }
                    if (z7) {
                        videoFileInfo = VEUtils.getVideoFileInfo(featureExtraction3.path);
                    } else {
                        videoFileInfo = null;
                    }
                    int i4 = featureExtraction3.width;
                    if (i4 <= 0) {
                        if (videoFileInfo != null) {
                            i4 = videoFileInfo.width;
                        } else {
                            i4 = 0;
                        }
                    }
                    int i5 = featureExtraction3.height;
                    if (i5 <= 0) {
                        if (videoFileInfo != null) {
                            i5 = videoFileInfo.height;
                        } else {
                            i5 = 0;
                        }
                    }
                    boolean zLJIILL = C2286708xd.LJIILL(featureExtraction3.path);
                    Context context = C1330760kja.LIZ;
                    String strLIZ = featureExtraction3.path;
                    if (C2471909mP.LJJIIZI(strLIZ) && context != null) {
                        strLIZ = C09N5.LIZ(context, C2471909mP.LJIILIIL(strLIZ));
                    }
                    if (strLIZ == null) {
                        str = featureExtraction3.path;
                    } else {
                        str = strLIZ;
                    }
                    Object objLJJLIIIJL = C13LP.LJJLIIIJL(a0.LJJLIIIJILLIZJL(str, new String[]{"/"}, 0, 6));
                    if (objLJJLIIIJL == null) {
                        objLJJLIIIJL = "";
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("width", i4);
                    jSONObject.put("height", i5);
                    if (zLJIILL) {
                        j = 0;
                    } else {
                        j = featureExtraction3.duration;
                    }
                    jSONObject.put("duration", j);
                    jSONObject.put("isVideo", !zLJIILL);
                    jSONObject.put("hasAudio", false);
                    jSONObject.put("path", strLIZ);
                    jSONObject.put("name", objLJJLIIIJL);
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put("image");
                    jSONObject.put("includes", jSONArray2);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("meta", jSONObject);
                    for (Map.Entry<String, ? extends List<String>> entry2 : featureExtraction3.algorithm.entrySet()) {
                        String key = entry2.getKey();
                        List<String> value = entry2.getValue();
                        if (value != null && !value.isEmpty()) {
                            z8 = false;
                        } else {
                            z8 = true;
                        }
                        if (!z8) {
                            JSONArray jSONArray3 = new JSONArray();
                            Iterator<String> it8 = value.iterator();
                            while (it8.hasNext()) {
                                jSONArray3.put(new JSONObject(it8.next()));
                            }
                            jSONObject2.put(key, jSONArray3);
                        }
                    }
                    jSONArray.put(jSONObject2);
                }
                if (jSONArray.length() != 0) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("image_info_list", jSONArray);
                    string = C786410Ut5.J3(jSONObject3);
                }
            } else {
                h hVar = new h();
                for (FeatureExtraction featureExtraction4 : arrayList) {
                    n nVar = new n();
                    nVar.LJJIII(C2286608xc.LJ(featureExtraction4.width), "width");
                    nVar.LJJIII(C2286608xc.LJ(featureExtraction4.height), "height");
                    nVar.LJJIII(C2286608xc.LJFF(featureExtraction4.duration), "duration");
                    for (Map.Entry<String, ? extends List<String>> entry3 : featureExtraction4.algorithm.entrySet()) {
                        String key2 = entry3.getKey();
                        List<String> value2 = entry3.getValue();
                        if (value2 != null && !value2.isEmpty()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (!z) {
                            h hVar2 = new h();
                            Iterator<String> it9 = value2.iterator();
                            while (it9.hasNext()) {
                                hVar2.LJJIFFI((k) C2292508yZ.LIZ(it9.next(), n.class));
                            }
                            nVar.LJJIFFI(key2, hVar2);
                        }
                    }
                    hVar.LJJIFFI(nVar);
                }
                string = hVar.toString();
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - j2;
            C1414620muq.LIZ.getClass();
            AtomicReference<C1414630mur> atomicReference = C1414620muq.LIZIZ;
            C1414630mur c1414630mur = atomicReference.get();
            if (c1414630mur != null) {
                atomicReference.set(C1414630mur.LIZ(c1414630mur, null, null, null, null, null, Long.valueOf(jCurrentTimeMillis), null, null, 223));
            }
            List<InterfaceC2342209Fs> list6 = C2341909Fp.LIZ;
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("shoot_way", str2);
            c0lab.LJ("content_source", str3);
            c0lab.LIZIZ(jCurrentTimeMillis, "time_cost");
            if (arrayList.isEmpty()) {
                z2 = false;
            } else {
                Iterator it10 = arrayList.iterator();
                while (true) {
                    if (it10.hasNext()) {
                        Collection<? extends List<String>> collectionValues = ((FeatureExtraction) it10.next()).algorithm.values();
                        if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
                            z3 = false;
                        } else {
                            Iterator<T> it11 = collectionValues.iterator();
                            while (true) {
                                if (it11.hasNext()) {
                                    List list7 = (List) it11.next();
                                    if (list7 != null && !list7.isEmpty()) {
                                        z4 = false;
                                    } else {
                                        z4 = true;
                                    }
                                    if (!z4) {
                                        z3 = true;
                                        break;
                                    }
                                } else {
                                    z3 = false;
                                    break;
                                }
                            }
                        }
                        if (z3) {
                            z2 = true;
                            break;
                        }
                    } else {
                        z2 = false;
                        break;
                    }
                }
            }
            c0lab.LJFF("success", z2);
            c0lab.LJ(Scene.SCENE_SERVICE, str4);
            c0lab.LIZ(set.size(), "algo_model_count");
            if (arrayList.isEmpty()) {
                i = 0;
            } else {
                Iterator it12 = arrayList.iterator();
                i = 0;
                while (it12.hasNext()) {
                    if (((FeatureExtraction) it12.next()).duration > 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5 && (i = i + 1) < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
            }
            c0lab.LIZ(i, "video_count");
            if (arrayList.isEmpty()) {
                i2 = 0;
            } else {
                Iterator it13 = arrayList.iterator();
                i2 = 0;
                while (it13.hasNext()) {
                    if (((FeatureExtraction) it13.next()).duration == 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (z6 && (i2 = i2 + 1) < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
            }
            c0lab.LIZ(i2, "photo_count");
            Iterator it14 = list.iterator();
            int iIntValue = 0;
            while (it14.hasNext()) {
                iIntValue += ((Number) ((Pair) it14.next()).getSecond()).intValue();
            }
            c0lab.LIZLLL(C2286608xc.LIZJ((((double) iIntValue) * 1.0d) / ((double) (set.size() * list5.size()))), "feature_cached_hit_rate");
            C2341909Fp.LIZ("tools_feature_extraction_overall_performance", c0lab.LIZ);
        } else {
            string = null;
        }
        C1C7U.LIZIZ("MixEditingFeatureExtractionServiceKt@6aea.getLocalFeatures$1$1$1");
        return string;
    }
}
