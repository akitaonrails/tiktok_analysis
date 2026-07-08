package X;

import android.text.TextUtils;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLESegmentEffect;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoEffect;
import com.bytedance.ies.nle.editor_jni.VecNLEVideoEffectSPtr;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Dui, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C354260Dui {
    public static final C354260Dui LIZ = new C354260Dui();

    public static void LIZJ(NLETrackSlot nLETrackSlot) {
        nLETrackSlot.removeExtraWithKey("ep_magic_resource_id");
        nLETrackSlot.removeExtraWithKey("ep_magic_effect_id");
        nLETrackSlot.removeExtraWithKey("ep_magic_effect_name");
        nLETrackSlot.removeExtraWithKey("ep_magic_effect_icon_url");
        nLETrackSlot.removeExtraWithKey("is_video_apply_photo_magic");
        nLETrackSlot.removeExtraWithKey("magic_freeze_time_stamp");
    }

    public static NLEVideoEffect LJFF(NLETrackSlot nLETrackSlot) {
        VecNLEVideoEffectSPtr videoEffects = nLETrackSlot.getVideoEffects();
        NLEVideoEffect nLEVideoEffect = null;
        if (videoEffects == null) {
            return null;
        }
        Iterator<NLEVideoEffect> it2 = videoEffects.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            NLEVideoEffect next = it2.next();
            LIZ.getClass();
            if (LJIIJJI(next)) {
                nLEVideoEffect = next;
                break;
            }
        }
        return nLEVideoEffect;
    }

    public static NLEVideoEffect LJI(NLETrackSlot nLETrackSlot) {
        VecNLEVideoEffectSPtr videoEffects = nLETrackSlot.getVideoEffects();
        NLEVideoEffect nLEVideoEffect = null;
        if (videoEffects == null) {
            return null;
        }
        Iterator<NLEVideoEffect> it2 = videoEffects.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            NLEVideoEffect next = it2.next();
            LIZ.getClass();
            if (Intrinsics.LJFF(next.getExtra("I2V"), "I2V")) {
                nLEVideoEffect = next;
                break;
            }
        }
        return nLEVideoEffect;
    }

    public static List LJII(NLETrackSlot nLETrackSlot) {
        if (nLETrackSlot.hasExtra("ep_magic_effect_id")) {
            String extra = nLETrackSlot.getExtra("ep_magic_effect_id");
            if (extra != null) {
                List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(extra, new String[]{","}, 0, 6);
                ArrayList arrayList = new ArrayList();
                for (Object obj : listLJJLIIIJILLIZJL) {
                    if (!a0.LJJJIL((String) obj)) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.isEmpty()) {
                    return Collections.singletonList("");
                }
                return arrayList;
            }
            return Collections.singletonList("");
        }
        return Collections.singletonList("");
    }

    public static List LJIIIIZZ(NLETrackSlot nLETrackSlot) {
        if (nLETrackSlot.hasExtra("ep_magic_resource_id")) {
            String extra = nLETrackSlot.getExtra("ep_magic_resource_id");
            if (extra != null) {
                List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(extra, new String[]{","}, 0, 6);
                ArrayList arrayList = new ArrayList();
                for (Object obj : listLJJLIIIJILLIZJL) {
                    if (!a0.LJJJIL((String) obj)) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.isEmpty()) {
                    return Collections.singletonList("");
                }
                return arrayList;
            }
            return Collections.singletonList("");
        }
        return Collections.singletonList("");
    }

    public static NLEVideoEffect LJIIIZ(NLETrackSlot nLETrackSlot) {
        VecNLEVideoEffectSPtr videoEffects = nLETrackSlot.getVideoEffects();
        NLEVideoEffect nLEVideoEffect = null;
        if (videoEffects == null) {
            return null;
        }
        Iterator<NLEVideoEffect> it2 = videoEffects.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            NLEVideoEffect next = it2.next();
            LIZ.getClass();
            if (LJIILJJIL(next)) {
                nLEVideoEffect = next;
                break;
            }
        }
        return nLEVideoEffect;
    }

    public static NLEResType LJIIJ(NLETrackSlot nLETrackSlot) {
        if (LJI(nLETrackSlot) != null && !C0E5J.LJI(nLETrackSlot)) {
            return NLEResType.IMAGE;
        }
        return C351220Dpo.LJLLL(nLETrackSlot);
    }

    public static boolean LJIIJJI(NLEVideoEffect nLEVideoEffect) {
        String jsonParam;
        NLESegmentEffect segment = nLEVideoEffect.getSegment();
        if (segment != null && (jsonParam = segment.getJsonParam()) != null && !TextUtils.isEmpty(jsonParam)) {
            return new JSONObject(jsonParam).has("editing_effect_algorithm_cache_url");
        }
        return false;
    }

    public static boolean LJIIL(String str) {
        Object c098200Yq;
        try {
            JSONObject jSONObject = new JSONObject(str);
            boolean z = true;
            if (!jSONObject.optBoolean("combine_gameplay_render_with_effect") || !Intrinsics.LJFF(jSONObject.optString("game_play_type"), C0E00.COMBINE_GAME_PLAY.getTypeName())) {
                z = false;
            }
            c098200Yq = Boolean.valueOf(z);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = bool;
        }
        return ((Boolean) c098200Yq).booleanValue();
    }

    public static boolean LJIILIIL(NLETrackSlot nLETrackSlot) {
        String extra = nLETrackSlot.getExtra("ep_magic_category_id");
        if (extra.length() <= 0) {
            return false;
        }
        for (EnumC356340Dy4 enumC356340Dy4 : EnumC356340Dy4.values()) {
            if (Intrinsics.LJFF(enumC356340Dy4.getTypeName(), extra)) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJIILJJIL(NLEVideoEffect nLEVideoEffect) {
        String jsonParam;
        NLESegmentEffect segment = nLEVideoEffect.getSegment();
        if (segment != null && (jsonParam = segment.getJsonParam()) != null && !TextUtils.isEmpty(jsonParam)) {
            return new JSONObject(jsonParam).has("editing_effect_slow_motion_key_frame");
        }
        return false;
    }

    public static boolean LJIILL(NLEVideoEffect nLEVideoEffect) {
        if (LJIILJJIL(nLEVideoEffect)) {
            try {
                return JSONObjectProtectorUtils.getJSONObject(new JSONObject(nLEVideoEffect.getSegment().getJsonParam()), "editing_effect_slow_motion_key_frame").has("beats");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            }
        }
        return false;
    }

    public static void LIZ(NLETrackSlot nLETrackSlot, String str, String str2) {
        String strValueOf;
        if (nLETrackSlot.hasExtra(str)) {
            StringBuilder sb = new StringBuilder(nLETrackSlot.getExtra(str));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(',');
            sbLIZ.append(str2);
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
            strValueOf = sb.toString();
        } else {
            strValueOf = String.valueOf(str2);
        }
        nLETrackSlot.setExtra(str, strValueOf);
    }

    public static void LIZLLL(NLETrackSlot nLETrackSlot, String str, String str2) {
        if (!nLETrackSlot.hasExtra(str)) {
            return;
        }
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(nLETrackSlot.getExtra(str), new String[]{","}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLJJLIIIJILLIZJL) {
            if (!a0.LJJJIL((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        List listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL(nLETrackSlot.getExtra("ep_magic_effect_name"), new String[]{","}, 0, 6);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listLJJLIIIJILLIZJL2) {
            if (!a0.LJJJIL((String) obj2)) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(arrayList3);
        List listLJJLIIIJILLIZJL3 = a0.LJJLIIIJILLIZJL(nLETrackSlot.getExtra("ep_magic_effect_icon_url"), new String[]{","}, 0, 6);
        ArrayList arrayList5 = new ArrayList();
        for (Object obj3 : listLJJLIIIJILLIZJL3) {
            if (!a0.LJJJIL((String) obj3)) {
                arrayList5.add(obj3);
            }
        }
        ArrayList arrayList6 = new ArrayList(arrayList5);
        int iIndexOf = arrayList2.indexOf(str2);
        if (iIndexOf >= 0) {
            ListProtector.remove(arrayList2, iIndexOf);
            if (iIndexOf < arrayList4.size()) {
                ListProtector.remove(arrayList4, iIndexOf);
            }
            if (iIndexOf < arrayList6.size()) {
                ListProtector.remove(arrayList6, iIndexOf);
            }
        }
        if (arrayList2.isEmpty()) {
            nLETrackSlot.removeExtraWithKey(str);
        } else {
            nLETrackSlot.setExtra(str, C13LP.LJJLIIIJ(arrayList2, ",", null, null, 0, null, null, 62));
        }
        if (arrayList4.isEmpty()) {
            nLETrackSlot.removeExtraWithKey("ep_magic_effect_name");
        } else {
            nLETrackSlot.setExtra("ep_magic_effect_name", C13LP.LJJLIIIJ(arrayList4, ",", null, null, 0, null, null, 62));
        }
        if (arrayList6.isEmpty()) {
            nLETrackSlot.removeExtraWithKey("ep_magic_effect_icon_url");
        } else {
            nLETrackSlot.setExtra("ep_magic_effect_icon_url", C13LP.LJJLIIIJ(arrayList6, ",", null, null, 0, null, null, 62));
        }
    }

    public static void LJ(NLETrackSlot nLETrackSlot, String str, String str2) {
        LIZLLL(nLETrackSlot, "ep_magic_resource_id", str);
        LIZLLL(nLETrackSlot, "ep_magic_effect_id", str2);
    }

    public static void LIZIZ(NLETrackSlot nLETrackSlot, String str, String str2, String str3, String str4) {
        LIZ(nLETrackSlot, "ep_magic_resource_id", str);
        LIZ(nLETrackSlot, "ep_magic_effect_id", str2);
        LIZ(nLETrackSlot, "ep_magic_effect_name", str3);
        LIZ(nLETrackSlot, "ep_magic_effect_icon_url", str4);
    }
}
