package X;

import com.ugc.android.clientai.lang.request.InferenceParameter;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Z9q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C895120Z9q {
    public static InferenceParameter LIZ(Map map) {
        int iIntValue;
        boolean zBooleanValue;
        int iIntValue2;
        float fFloatValue;
        float fFloatValue2;
        int iIntValue3;
        float fFloatValue3;
        float fFloatValue4;
        float fFloatValue5;
        float fFloatValue6;
        int iIntValue4;
        boolean zBooleanValue2;
        int iIntValue5;
        Integer numLJIIJJI;
        Boolean boolLJLI;
        Integer numLJIIJJI2;
        Float fLJIIIIZZ;
        Float fLJIIIIZZ2;
        Float fLJIIIIZZ3;
        Float fLJIIIIZZ4;
        Float fLJIIIIZZ5;
        Integer numLJIIJJI3;
        Float fLJIIIIZZ6;
        Float fLJIIIIZZ7;
        Integer numLJIIJJI4;
        Boolean boolLJLI2;
        Integer numLJIIJJI5;
        String str = (String) map.get("max_new_length");
        if (str != null && (numLJIIJJI5 = C2095008Iq.LJIIJJI(str)) != null) {
            iIntValue = numLJIIJJI5.intValue();
        } else {
            iIntValue = 0;
        }
        String str2 = (String) map.get("do_sample");
        if (str2 != null && (boolLJLI2 = a0.LJLI(str2)) != null) {
            zBooleanValue = boolLJLI2.booleanValue();
        } else {
            zBooleanValue = false;
        }
        String str3 = (String) map.get("num_beams");
        if (str3 != null && (numLJIIJJI4 = C2095008Iq.LJIIJJI(str3)) != null) {
            iIntValue2 = numLJIIJJI4.intValue();
        } else {
            iIntValue2 = 1;
        }
        String str4 = (String) map.get("penalty_alpha");
        float fFloatValue7 = 0.0f;
        if (str4 != null && (fLJIIIIZZ7 = C2327809Ae.LJIIIIZZ(str4)) != null) {
            fFloatValue = fLJIIIIZZ7.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        String str5 = (String) map.get("temperature");
        if (str5 != null && (fLJIIIIZZ6 = C2327809Ae.LJIIIIZZ(str5)) != null) {
            fFloatValue2 = fLJIIIIZZ6.floatValue();
        } else {
            fFloatValue2 = 1.0f;
        }
        String str6 = (String) map.get("top_k");
        if (str6 != null && (numLJIIJJI3 = C2095008Iq.LJIIJJI(str6)) != null) {
            iIntValue3 = numLJIIJJI3.intValue();
        } else {
            iIntValue3 = 50;
        }
        String str7 = (String) map.get("top_p");
        if (str7 != null && (fLJIIIIZZ5 = C2327809Ae.LJIIIIZZ(str7)) != null) {
            fFloatValue3 = fLJIIIIZZ5.floatValue();
        } else {
            fFloatValue3 = 1.0f;
        }
        String str8 = (String) map.get("typical_p");
        if (str8 != null && (fLJIIIIZZ4 = C2327809Ae.LJIIIIZZ(str8)) != null) {
            fFloatValue4 = fLJIIIIZZ4.floatValue();
        } else {
            fFloatValue4 = 1.0f;
        }
        String str9 = (String) map.get("diversity_penalty");
        if (str9 != null && (fLJIIIIZZ3 = C2327809Ae.LJIIIIZZ(str9)) != null) {
            fFloatValue7 = fLJIIIIZZ3.floatValue();
        }
        String str10 = (String) map.get("repetition_penalty");
        if (str10 != null && (fLJIIIIZZ2 = C2327809Ae.LJIIIIZZ(str10)) != null) {
            fFloatValue5 = fLJIIIIZZ2.floatValue();
        } else {
            fFloatValue5 = 1.0f;
        }
        String str11 = (String) map.get("length_penalty");
        if (str11 != null && (fLJIIIIZZ = C2327809Ae.LJIIIIZZ(str11)) != null) {
            fFloatValue6 = fLJIIIIZZ.floatValue();
        } else {
            fFloatValue6 = 1.0f;
        }
        String str12 = (String) map.get("random_seed");
        if (str12 != null && (numLJIIJJI2 = C2095008Iq.LJIIJJI(str12)) != null) {
            iIntValue4 = numLJIIJJI2.intValue();
        } else {
            iIntValue4 = 0;
        }
        String str13 = (String) map.get("is_stream");
        if (str13 != null && (boolLJLI = a0.LJLI(str13)) != null) {
            zBooleanValue2 = boolLJLI.booleanValue();
        } else {
            zBooleanValue2 = false;
        }
        String str14 = (String) map.get("repeat_last_n");
        if (str14 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str14)) != null) {
            iIntValue5 = numLJIIJJI.intValue();
        } else {
            iIntValue5 = 64;
        }
        Pair[] pairArr = new Pair[5];
        Object obj = map.get("system_prompt_template");
        if (obj == null) {
            obj = "";
        }
        pairArr[0] = new Pair("system_prompt_template", obj);
        Object obj2 = map.get("user_prompt_template");
        if (obj2 == null) {
            obj2 = "";
        }
        pairArr[1] = new Pair("user_prompt_template", obj2);
        Object obj3 = map.get("cached_system_prompt");
        if (obj3 == null) {
            obj3 = "";
        }
        pairArr[2] = new Pair("cached_system_prompt", obj3);
        Object obj4 = map.get("active_lora_name");
        if (obj4 == null) {
            obj4 = "";
        }
        pairArr[3] = new Pair("active_lora_name", obj4);
        Object obj5 = map.get("multi_model_type");
        if (obj5 == null) {
            obj5 = "";
        }
        pairArr[4] = new Pair("multi_model_type", obj5);
        return new InferenceParameter(iIntValue2, iIntValue, zBooleanValue, fFloatValue, fFloatValue2, iIntValue3, fFloatValue3, fFloatValue4, fFloatValue7, fFloatValue5, fFloatValue6, iIntValue4, zBooleanValue2, iIntValue5, C2097608Jq.LJIIJ(pairArr));
    }
}
