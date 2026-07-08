package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0sNR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1624550sNR {
    public static final Integer LIZ(Effect effect) {
        if (C1624570sNT.LJJIII(effect, "camera_front")) {
            return 1;
        }
        if (!C1624570sNT.LJJIII(effect, "camera_back") && !C1624570sNT.LJFF(effect)) {
            if (C1624570sNT.LJIJ(effect)) {
                return 1;
            }
            return null;
        }
        return 0;
    }

    public static final boolean LIZIZ(Effect effect) {
        if (!a0.LJJIIZI(effect.getSdkExtra(), "model_name", false) && effect.getSource() != 103) {
            return false;
        }
        return true;
    }

    public static final boolean LIZJ(Effect effect) {
        return a0.LJJIIZI(effect.getSdkExtra(), "is_facefilter", false);
    }

    public static final boolean LIZLLL(Effect effect) {
        return a0.LJJIIZI(effect.getSdkExtra(), "is_lalaland", false);
    }

    public static final boolean LJ(Effect effect) {
        List<String> tags = effect.getTags();
        if (tags != null) {
            return tags.contains("canStack");
        }
        return false;
    }
}
