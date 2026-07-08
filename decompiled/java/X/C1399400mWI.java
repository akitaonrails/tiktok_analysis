package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectLabel;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0mWI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1399400mWI {
    public static final Set<String> LIZ = C13LQ.LJLIIL(new String[]{"18", "19"});

    public static final boolean LIZ(Effect effect) {
        EffectLabel effectLabel = effect.getEffectLabel();
        if (effectLabel == null || !LIZIZ(effectLabel)) {
            return false;
        }
        return true;
    }

    public static final boolean LIZIZ(EffectLabel effectLabel) {
        List<String> v2Tags = effectLabel.getV2Tags();
        if ((v2Tags instanceof Collection) && v2Tags.isEmpty()) {
            return false;
        }
        Iterator<String> it2 = v2Tags.iterator();
        while (it2.hasNext()) {
            if (LIZ.contains(it2.next())) {
                return true;
            }
        }
        return false;
    }
}
