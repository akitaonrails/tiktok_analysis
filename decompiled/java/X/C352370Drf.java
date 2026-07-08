package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Drf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C352370Drf {
    public static final String LIZ(Effect effect) {
        List<String> tags;
        String next;
        if (effect != null && (tags = effect.getTags()) != null) {
            Iterator<String> it2 = tags.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    String str = next;
                    if (str != null && str.length() > 0) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            String str2 = next;
            if (str2 != null) {
                return str2;
            }
        }
        return "";
    }

    public static final boolean LIZJ(Effect effect) {
        String effectId;
        Integer numLJIIJJI;
        if (effect != null && (effectId = effect.getEffectId()) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(effectId)) != null && numLJIIJJI.intValue() >= 0) {
            return false;
        }
        return true;
    }

    public static final boolean LIZIZ(Effect effect, String str) {
        List<String> tags;
        if (str == null || (tags = effect.getTags()) == null) {
            return false;
        }
        for (String str2 : tags) {
            if (Intrinsics.LJFF(str2, str)) {
                if (str2 == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
