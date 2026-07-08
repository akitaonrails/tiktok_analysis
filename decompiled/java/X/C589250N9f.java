package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.FeatureGroup;
import com.ss.ugc.clientai.core.api.meta.FeatureItem;
import com.ss.ugc.clientai.core.api.meta.FlattenConfig;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0N9f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C589250N9f implements InterfaceC589260N9g {
    public static final C589250N9f LIZ = new C589250N9f();

    @Override // X.InterfaceC589260N9g
    public final AbstractC589320N9m LIZ(String str) {
        if (Intrinsics.LJFF(str, "boot")) {
            return new AbstractC589320N9m() { // from class: X.0N9h
                public final List<String> LIZLLL = new ArrayList();

                @Override // X.AbstractC589320N9m
                public final String LIZIZ() {
                    return "boot";
                }

                @Override // X.AbstractC589320N9m
                public final List<String> LIZJ() {
                    return Collections.singletonList("boot");
                }

                @Override // X.AbstractC589320N9m
                public final void LIZLLL(C00ET c00et) {
                    Object obj;
                    List listLJJLIIIJ;
                    Object obj2 = null;
                    if (c00et != null) {
                        obj = ((LinkedHashMap) c00et.LIZ).get("sub_type");
                    } else {
                        obj = null;
                    }
                    if (obj instanceof String) {
                        obj2 = obj;
                    }
                    String str2 = (String) obj2;
                    if (str2 != null && (listLJJLIIIJ = a0.LJJLIIIJ(str2, new char[]{'|'}, false, 0, 6)) != null) {
                        Iterator it2 = listLJJLIIIJ.iterator();
                        while (it2.hasNext()) {
                            ((ArrayList) this.LIZLLL).add(it2.next());
                        }
                    }
                }

                @Override // X.AbstractC589320N9m
                public final void LJ(C589280N9i c589280N9i) {
                    Object obj;
                    if (((ArrayList) this.LIZLLL).isEmpty()) {
                        return;
                    }
                    for (String str2 : (ArrayList) this.LIZLLL) {
                        Map<String, Object> map = c589280N9i.LIZJ;
                        if (map != null && (obj = ((HashMap) map).get(str2)) != null) {
                            LJFF(obj, str2);
                        }
                    }
                    LIZ();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("----[");
                    sbLIZ.append("boot");
                    sbLIZ.append("][");
                    sbLIZ.append(c589280N9i.LIZIZ);
                    sbLIZ.append("][");
                    sbLIZ.append(c589280N9i.LIZ);
                    sbLIZ.append("]: ");
                    sbLIZ.append(this.LIZIZ);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            };
        }
        if (Intrinsics.LJFF(str, "performance")) {
            return new AbstractC589320N9m() { // from class: X.0pP2
                @Override // X.AbstractC589320N9m
                public final List<String> LIZJ() {
                    return Collections.singletonList("on_predict");
                }

                @Override // X.AbstractC589320N9m
                public final String LIZIZ() {
                    return "performance";
                }

                @Override // X.AbstractC589320N9m
                public final void LJ(C589280N9i c589280N9i) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new FeatureItem("mem_usage", null, null, null, -1, null, new ArrayList()));
                    arrayList.add(new FeatureItem("gc_count", null, null, null, -1, null, new ArrayList()));
                    arrayList.add(new FeatureItem("gc_time", null, null, null, -1, null, new ArrayList()));
                    arrayList.add(new FeatureItem("gc_block_count", null, null, null, -1, null, new ArrayList()));
                    arrayList.add(new FeatureItem("gc_block_time", null, null, null, -1, null, new ArrayList()));
                    arrayList.add(new FeatureItem("cpu_usage", null, null, null, -1, null, new ArrayList()));
                    arrayList.add(new FeatureItem("cpu_speed", null, null, null, -1, null, new ArrayList()));
                    arrayList.add(new FeatureItem("battery_temperature", null, null, null, -1, null, new ArrayList()));
                    arrayList.add(new FeatureItem("is_save_power_mode", null, null, null, -1, null, new ArrayList()));
                    arrayList.add(new FeatureItem("drop_frame_count", null, null, null, -1, null, new ArrayList()));
                    arrayList.add(new FeatureItem("jank_count", null, null, null, -1, null, new ArrayList()));
                    arrayList.add(new FeatureItem("storage_avail_external", null, null, null, -1, null, new ArrayList()));
                    arrayList.add(new FeatureItem("storage_avail_internal", null, null, null, -1, null, new ArrayList()));
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(new FeatureItem("battery_pct", null, null, null, -1, null, new ArrayList()));
                    arrayList2.add(new FeatureItem("net_quality_lv", null, null, null, -1, null, new ArrayList()));
                    arrayList2.add(new FeatureItem("is_charge", null, null, null, -1, null, new ArrayList()));
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(new FeatureGroup("f_performance", arrayList, 0, 0, null, ""));
                    arrayList3.add(new FeatureGroup("f_phone", arrayList2, 0, 0, null, ""));
                    FeatureServiceManager.Companion.getClass();
                    JSONObject batchFeatures$default = FeatureServiceManager.getBatchFeatures$default(C1510050pOl.LIZ(), arrayList3, new FlattenConfig("", "", false, null), null, "pythia_feature", false, 20, null);
                    Iterator<String> itKeys = batchFeatures$default.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        Object objOpt = batchFeatures$default.opt(next);
                        if (objOpt != null) {
                            LJFF(objOpt, next);
                        }
                    }
                    LIZ();
                }
            };
        }
        if (Intrinsics.LJFF(str, "bytebench")) {
            return new AbstractC589320N9m() { // from class: X.0N9c
                @Override // X.AbstractC589320N9m
                public final List<String> LIZJ() {
                    return Collections.singletonList("on_predict");
                }

                @Override // X.AbstractC589320N9m
                public final String LIZIZ() {
                    return "bytebench";
                }

                @Override // X.AbstractC589320N9m
                public final void LJ(C589280N9i c589280N9i) {
                    Object feature$default;
                    Object feature$default2;
                    FeatureServiceManager.Companion.getClass();
                    FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_bytebench", 0, 2, null);
                    if (producer$default != null && (feature$default2 = FeatureProducer.getFeature$default(producer$default, "overall_score", (JSONObject) null, "pythia_feature", (ReturnCode) null, 10, (Object) null)) != null) {
                        LJFF(feature$default2, "overall_score");
                    }
                    FeatureProducer producer$default2 = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_bytebench", 0, 2, null);
                    if (producer$default2 != null && (feature$default = FeatureProducer.getFeature$default(producer$default2, "core_nums", (JSONObject) null, "pythia_feature", (ReturnCode) null, 10, (Object) null)) != null) {
                        LJFF(feature$default, "core_nums");
                    }
                    LIZ();
                }
            };
        }
        if (Intrinsics.LJFF(str, "video")) {
            return new AbstractC589320N9m() { // from class: X.0N9b
                @Override // X.AbstractC589320N9m
                public final List<String> LIZJ() {
                    return Collections.singletonList("on_predict");
                }

                @Override // X.AbstractC589320N9m
                public final String LIZIZ() {
                    return "video";
                }

                @Override // X.AbstractC589320N9m
                public final void LJ(C589280N9i c589280N9i) throws JSONException {
                    Object feature$default;
                    Object feature$default2;
                    Object feature$default3;
                    LinkedList<String> linkedList = C0N9Z.LIZIZ.LIZ;
                    if (!linkedList.isEmpty()) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("aid", ListProtector.get(linkedList, 0));
                        FeatureServiceManager.Companion.getClass();
                        FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_play", 0, 2, null);
                        if (producer$default != null && (feature$default3 = FeatureProducer.getFeature$default(producer$default, "first_frame_duration", jSONObject, "", (ReturnCode) null, 8, (Object) null)) != null) {
                            LJFF(feature$default3, "first_frame_duration");
                        }
                        FeatureProducer producer$default2 = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_play", 0, 2, null);
                        if (producer$default2 != null && (feature$default2 = FeatureProducer.getFeature$default(producer$default2, "block_count", jSONObject, "pythia_feature", (ReturnCode) null, 8, (Object) null)) != null) {
                            LJFF(feature$default2, "block_count");
                        }
                        FeatureProducer producer$default3 = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_play", 0, 2, null);
                        if (producer$default3 != null && (feature$default = FeatureProducer.getFeature$default(producer$default3, "block_duration", jSONObject, "pythia_feature", (ReturnCode) null, 8, (Object) null)) != null) {
                            LJFF(feature$default, "block_duration");
                        }
                    }
                    LIZ();
                }
            };
        }
        if (Intrinsics.LJFF(str, Scene.SCENE_SERVICE)) {
            return new AbstractC589320N9m() { // from class: X.0N9e
                @Override // X.AbstractC589320N9m
                public final List<String> LIZJ() {
                    return Collections.singletonList("on_predict");
                }

                @Override // X.AbstractC589320N9m
                public final String LIZIZ() {
                    return Scene.SCENE_SERVICE;
                }

                @Override // X.AbstractC589320N9m
                public final void LJ(C589280N9i c589280N9i) {
                    Object feature$default;
                    Object feature$default2;
                    FeatureServiceManager.Companion.getClass();
                    FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_nxet_features", 0, 2, null);
                    if (producer$default != null && (feature$default2 = FeatureProducer.getFeature$default(producer$default, "nxet_cur_page_spm", (JSONObject) null, "pythia_feature", (ReturnCode) null, 10, (Object) null)) != null) {
                        LJFF(feature$default2, "nxet_cur_page_spm");
                    }
                    FeatureProducer producer$default2 = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_scene", 0, 2, null);
                    if (producer$default2 != null && (feature$default = FeatureProducer.getFeature$default(producer$default2, "is_page_start", (JSONObject) null, "pythia_feature", (ReturnCode) null, 10, (Object) null)) != null) {
                        LJFF(feature$default, "is_page_start");
                    }
                    LIZ();
                }
            };
        }
        return null;
    }
}
