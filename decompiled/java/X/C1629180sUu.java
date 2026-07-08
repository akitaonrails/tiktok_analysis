package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;

/* JADX INFO: renamed from: X.0sUu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1629180sUu {
    public static final boolean LIZ(Effect effect, InterfaceC1635390sev interfaceC1635390sev) {
        List<String> music;
        String str;
        if (effect != null) {
            if (effect.getEffectType() != 0 || interfaceC1635390sev.LJIJJLI(effect)) {
                if (C1624200sMs.LJIILL(effect)) {
                    if (!C1624360sN8.LIZ.containsKey(effect.getEffectId()) && ((music = effect.getMusic()) == null || (str = (String) C13LP.LJJJLL(music)) == null || C1629700sVk.LIZ(str) == null)) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }
}
