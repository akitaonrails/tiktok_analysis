package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;

/* JADX INFO: renamed from: X.0oEW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1465260oEW {
    public static final C1465260oEW LIZ = new C1465260oEW();

    public static boolean LIZ(Effect effect) {
        List<String> tags;
        List<String> tags2;
        List<String> tags3 = effect.getTags();
        if (tags3 != null && !tags3.isEmpty() && (tags = effect.getTags()) != null && tags.size() == 1 && (tags2 = effect.getTags()) != null && tags2.contains("gif_icon_sticker")) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(Effect effect) {
        List<String> tags;
        List<String> tags2;
        List<String> tags3 = effect.getTags();
        if (tags3 != null && !tags3.isEmpty() && (tags = effect.getTags()) != null && tags.size() == 1 && (tags2 = effect.getTags()) != null && tags2.contains("photo_mode_static_sticker")) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ(Effect effect) {
        List<String> tags;
        List<String> tags2;
        List<String> tags3 = effect.getTags();
        if (tags3 != null && !tags3.isEmpty() && (tags = effect.getTags()) != null && tags.size() == 1 && (tags2 = effect.getTags()) != null && tags2.contains("static_text_sticker")) {
            return true;
        }
        return false;
    }
}
