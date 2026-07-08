package X;

import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0sMp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1624170sMp {
    public static final HashMap<String, List<String>> LIZ = new HashMap<>();

    public static final boolean LIZ(Effect effect) {
        ArrayList<String> arrayListLIZ = C1958007li.LIZ();
        if (arrayListLIZ.isEmpty()) {
            return false;
        }
        return arrayListLIZ.contains(effect.getEffectId());
    }

    public static final boolean LIZIZ(Effect effect) {
        if (effect == null || !C1624200sMs.LJIIJ(effect) || C1624200sMs.LJI(effect)) {
            return false;
        }
        String effectId = effect.getEffectId();
        if (TextUtils.isEmpty(effectId)) {
            return false;
        }
        Iterator<String> it2 = C1958007li.LIZ().iterator();
        while (it2.hasNext()) {
            if (TextUtils.equals(effectId, it2.next())) {
                return false;
            }
        }
        return true;
    }
}
