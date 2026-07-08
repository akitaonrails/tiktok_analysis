package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.common.utils.JsonExtKt;
import com.ss.android.vesdk.VEUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mj3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1407310mj3 {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(String str, List list) {
        int iIntValue;
        int iIntValue2;
        Integer num;
        int i = 0;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Object> entry : JsonExtKt.toMap(new JSONObject(str)).entrySet()) {
                String lowerCase = entry.getKey().toLowerCase(Locale.ROOT);
                Object value = entry.getValue();
                if ((value instanceof Integer) && (num = (Integer) value) != null) {
                    iIntValue2 = num.intValue();
                } else {
                    iIntValue2 = 0;
                }
                linkedHashMap.put(lowerCase, Integer.valueOf(iIntValue2));
            }
            Iterator it2 = ((ArrayList) list).iterator();
            i = 0;
            while (it2.hasNext()) {
                try {
                    Integer num2 = (Integer) linkedHashMap.get(((String) it2.next()).toLowerCase(Locale.ROOT));
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    i += iIntValue;
                } catch (Exception e) {
                    e = e;
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
        return i;
    }

    public static List LIZJ(String str, String str2) {
        boolean z;
        boolean z2;
        boolean zLJFF;
        JSONObject jSONObjectOptJSONObject;
        ArrayList arrayList = new ArrayList();
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (str2.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                try {
                    JSONObject jSONObjectOptJSONObject2 = new JSONObject(str).optJSONObject("blackResult");
                    if (jSONObjectOptJSONObject2 == null) {
                        return arrayList;
                    }
                    JSONObject jSONObject = new JSONObject(str2);
                    JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("audio_params");
                    if (jSONObjectOptJSONObject3 != null) {
                        zLJFF = Intrinsics.LJFF(jSONObjectOptJSONObject3.opt("num_channel"), 1);
                    } else {
                        zLJFF = false;
                    }
                    if (zLJFF) {
                        arrayList.add("Mono");
                    }
                    JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject2.optJSONObject("clipping");
                    if (jSONObjectOptJSONObject4 != null) {
                        if (jSONObjectOptJSONObject4.optDouble("rate") <= jSONObject.optDouble("clipping_rate") && jSONObjectOptJSONObject4.optDouble("peak_rate_left") <= jSONObject.optDouble("peak_rate_left")) {
                            if (jSONObjectOptJSONObject3 != null && jSONObjectOptJSONObject3.optInt("num_channel") > 1 && jSONObjectOptJSONObject4.optDouble("peak_rate_right") > jSONObject.optDouble("peak_rate_right")) {
                                arrayList.add("Clipping");
                            }
                        } else {
                            arrayList.add("Clipping");
                        }
                    }
                    JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject2.optJSONObject("cutoff_frequency");
                    if (jSONObjectOptJSONObject5 != null) {
                        if (jSONObjectOptJSONObject5.optDouble("rel_left") < jSONObject.optDouble("cutoff_frequency_left") && jSONObjectOptJSONObject5.optDouble("rel_left_conf") > jSONObject.optDouble("cutoff_frequency_left_conf") && jSONObjectOptJSONObject5.optDouble("band_std_left") < jSONObject.optDouble("band_std_left")) {
                            arrayList.add("CutOffFrequency");
                        } else if (jSONObjectOptJSONObject3 != null && jSONObjectOptJSONObject3.optInt("num_channel") > 1 && jSONObjectOptJSONObject5.optDouble("rel_right") < jSONObject.optDouble("cutoff_frequency_right") && jSONObjectOptJSONObject5.optDouble("rel_right_conf") > jSONObject.optDouble("cutoff_frequency_right_conf") && jSONObjectOptJSONObject5.optDouble("band_std_right") < jSONObject.optDouble("band_std_right")) {
                            arrayList.add("CutOffFrequency");
                        }
                    }
                    JSONObject jSONObjectOptJSONObject6 = jSONObjectOptJSONObject2.optJSONObject("rms_stats");
                    if (jSONObjectOptJSONObject6 != null) {
                        if (jSONObjectOptJSONObject6.optDouble("dc_offset_left") <= jSONObject.optDouble("dc_offset_left")) {
                            if (jSONObjectOptJSONObject3 != null && jSONObjectOptJSONObject3.optInt("num_channel") > 1 && jSONObjectOptJSONObject6.optDouble("dc_offset_right") > jSONObject.optDouble("dc_offset_right")) {
                                arrayList.add("DCOffset");
                            }
                        } else {
                            arrayList.add("DCOffset");
                        }
                    }
                    JSONObject jSONObjectOptJSONObject7 = jSONObjectOptJSONObject2.optJSONObject("rms_stats");
                    if (jSONObjectOptJSONObject7 != null) {
                        if (jSONObjectOptJSONObject7.optDouble("left_total") <= jSONObject.optDouble("rms_left_upper") && jSONObjectOptJSONObject7.optDouble("left_total") >= jSONObject.optDouble("rms_left_lower") && jSONObjectOptJSONObject7.optDouble("peak") <= jSONObject.optDouble("rms_peak")) {
                            if (jSONObjectOptJSONObject3 != null && jSONObjectOptJSONObject3.optInt("num_channel") > 1 && (jSONObjectOptJSONObject7.optDouble("right_total") > jSONObject.optDouble("rms_right_upper") || jSONObjectOptJSONObject7.optDouble("right_total") < jSONObject.optDouble("rms_right_lower") || Math.abs(jSONObjectOptJSONObject7.optDouble("left_right_diff")) <= jSONObject.optDouble("rms_diff"))) {
                                arrayList.add("RMS");
                            }
                        } else {
                            arrayList.add("RMS");
                        }
                    }
                    if (jSONObjectOptJSONObject3 != null && jSONObjectOptJSONObject3.optInt("num_channel") == 2 && (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("phase_check")) != null) {
                        if (!jSONObjectOptJSONObject.optBoolean("has_phase_issue")) {
                            if (jSONObjectOptJSONObject3.optInt("num_channel") > 1 && Math.abs(jSONObjectOptJSONObject.optDouble("rms_downmix_diff")) < jSONObject.optDouble("rms_downmix_diff")) {
                                arrayList.add("Phase");
                            }
                        } else {
                            arrayList.add("Phase");
                        }
                    }
                    JSONObject jSONObjectOptJSONObject8 = jSONObjectOptJSONObject2.optJSONObject("loudness");
                    if (jSONObjectOptJSONObject8 != null && jSONObjectOptJSONObject8.optDouble("integrated_loudness") > jSONObject.optDouble("integrated_loudness")) {
                        arrayList.add("Loudness");
                        return arrayList;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        return arrayList;
    }

    public static Object LIZIZ(String str, String str2, String str3, InterfaceC1364105Vn interfaceC1364105Vn) {
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        if (str != null && str2 != null) {
            VEUtils.detectAudioMetrics(str, str2, str3, new InterfaceC1407610mjX() { // from class: X.0mj2
                @Override // X.InterfaceC1407610mjX
                public final void LIZ(String str4, int i) {
                    if (i != -1) {
                        if (i == 2) {
                            InterfaceC1364105Vn<String> interfaceC1364105Vn2 = c23260099m;
                            if (str4 == null) {
                                str4 = "";
                            }
                            C189200o6.m2constructorimpl(str4);
                            interfaceC1364105Vn2.resumeWith(str4);
                            return;
                        }
                        return;
                    }
                    InterfaceC1364105Vn<String> interfaceC1364105Vn3 = c23260099m;
                    if (str4 == null) {
                        str4 = "";
                    }
                    C189200o6.m2constructorimpl(str4);
                    interfaceC1364105Vn3.resumeWith(str4);
                }
            });
        } else {
            C189200o6.m2constructorimpl("");
            c23260099m.resumeWith("");
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }
}
