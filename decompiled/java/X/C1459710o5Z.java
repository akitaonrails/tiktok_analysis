package X;

import android.content.SharedPreferences;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0o5Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1459710o5Z {
    public static final int LIZ;
    public static final int LIZIZ;
    public static final int LIZJ;
    public static final int LIZLLL;
    public static final int LJ;
    public static final int LJFF;
    public static final int LJI;
    public static final int LJII;
    public static final int LJIIIIZZ;
    public static final HashMap<String, Integer> LJIIIZ = new HashMap<>();
    public static final SharedPreferences LJIIJ = C810670Vr7.LIZJ(C0CHQ.LIZ, 0, "av_settings.xml");
    public static boolean LJIIJJI = true;

    static {
        String[] strArr = {"cut_optimized", "canvas_gesture", "countdown_sticker", "custom_sticker", "music", "text", "sticker", "effect", "voice"};
        LIZ = C13LQ.LJJIJIIJI("custom_sticker", strArr);
        LIZIZ = C13LQ.LJJIJIIJI("countdown_sticker", strArr);
        LIZJ = C13LQ.LJJIJIIJI("music", strArr);
        LIZLLL = C13LQ.LJJIJIIJI("text", strArr);
        LJ = C13LQ.LJJIJIIJI("sticker", strArr);
        LJFF = C13LQ.LJJIJIIJI("effect", strArr);
        LJI = C13LQ.LJJIJIIJI("voice", strArr);
        LJII = C13LQ.LJJIJIIJI("canvas_gesture", strArr);
        LJIIIIZZ = C13LQ.LJJIJIIJI("cut_optimized", strArr);
    }

    public static Set LIZIZ() {
        String string = LJIIJ.getString("prompt_shown", "");
        HashSet hashSet = new HashSet();
        return (string == null || string.length() <= 0) ? hashSet : C19719512Dh.LIZLLL(GsonProtectorUtils.fromJson(C0CHQ.LIZ().getGson(), string, Set.class));
    }

    public static final void LIZ(String str) {
        Set setLIZIZ = LIZIZ();
        if (setLIZIZ.add(str)) {
            LJFF(setLIZIZ);
        }
    }

    public static final boolean LIZJ(String str) {
        return LIZIZ().contains(str);
    }

    public static final void LJFF(Set<String> set) {
        if (set.isEmpty()) {
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(LIZIZ());
        linkedHashSet.addAll(set);
        LJIIJ.edit().putString("prompt_shown", GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), linkedHashSet)).commit();
    }

    public static final void LIZLLL(int i, String str) {
        LJIIIZ.put(str, Integer.valueOf(i));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final void LJ(InterfaceC1459790o5h interfaceC1459790o5h, C08CX c08cx) {
        HashSet hashSet = new HashSet();
        SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(C0CHQ.LIZ, 0, "ai_music");
        if (sharedPreferencesLIZJ.getBoolean("ai_music_guide_show", false) || LJIIJ.getBoolean("show_combine_shoot_mode_tip", false)) {
            hashSet.add("music");
            hashSet.add("effect");
            hashSet.add("sticker");
            hashSet.add("voice");
            hashSet.add("text");
        }
        sharedPreferencesLIZJ.edit().remove("ai_music_guide_show").apply();
        LJIIJ.edit().remove("show_combine_shoot_mode_tip").apply();
        LJFF(hashSet);
        if (!LJIIJJI) {
            return;
        }
        LJIIJJI = false;
        Set setLIZIZ = LIZIZ();
        if (!setLIZIZ.isEmpty()) {
            Iterator<Map.Entry<String, Integer>> it2 = LJIIIZ.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry<String, Integer> next = it2.next();
                if (setLIZIZ.contains(next.getKey()) || (c08cx != null && c08cx.contains(next.getKey()))) {
                    if (!Intrinsics.LJFF(next.getKey(), "music") || !C0C64.LJIILLIIL().LJIIIZ(31744, "tool_globally_launch_new_music_selecting_panel", true, false) || !(!C1459860o5o.LIZ.LIZ("shown", false))) {
                        it2.remove();
                    }
                }
            }
        }
        int iIntValue = Integer.MAX_VALUE;
        String str = "";
        for (String str2 : LJIIIZ.keySet()) {
            HashMap<String, Integer> map = LJIIIZ;
            if (map.get(str2).intValue() != -1 && map.get(str2).intValue() < iIntValue) {
                iIntValue = map.get(str2).intValue();
                str = str2;
            }
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "tool_globally_launch_new_music_selecting_panel", true, false)) {
            HashMap<String, Integer> map2 = LJIIIZ;
            if (map2.containsKey("music") && map2.get("music").intValue() != -1) {
                C0E12 c0e12 = C1459860o5o.LIZ;
                if ((!c0e12.LIZ("shown", false)) && !Intrinsics.LJFF(str, "canvas_gesture")) {
                    c0e12.LIZIZ("shown", true);
                    str = "music";
                }
            }
        }
        if (str.length() <= 0 || interfaceC1459790o5h == null) {
            return;
        }
        switch (str.hashCode()) {
            case -1890252483:
                if (!str.equals("sticker")) {
                    return;
                }
                break;
            case -1306084975:
                if (!str.equals("effect")) {
                    return;
                }
                interfaceC1459790o5h.LIZJ();
                return;
            case 3556653:
                if (!str.equals("text")) {
                    return;
                }
                interfaceC1459790o5h.LJI();
                return;
            case 104263205:
                if (!str.equals("music")) {
                    return;
                }
                interfaceC1459790o5h.LJ();
                return;
            case 112386354:
                if (!str.equals("voice")) {
                    return;
                }
                interfaceC1459790o5h.LIZLLL();
                return;
            case 568411439:
                if (!str.equals("countdown_sticker")) {
                    return;
                }
                break;
            case 1302272874:
                if (!str.equals("cut_optimized")) {
                    return;
                }
                interfaceC1459790o5h.LIZIZ();
                return;
            case 1523687778:
                if (!str.equals("canvas_gesture")) {
                    return;
                }
                interfaceC1459790o5h.LJFF();
                return;
            case 1878342255:
                if (!str.equals("custom_sticker")) {
                    return;
                }
                break;
            default:
                return;
        }
        interfaceC1459790o5h.LIZ();
    }
}
