package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.10je, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19328810je {
    public static final C19328810je LIZ = new C19328810je();
    public static final Map<String, C19328910jf> LIZIZ = new LinkedHashMap();

    public static final void LIZ(String str) {
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "enable_settings_consumption_track", true, false) || str.length() == 0) {
            return;
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) LIZIZ;
        Object c19328910jf = linkedHashMap.get(str);
        if (c19328910jf == null) {
            c19328910jf = new C19328910jf(0);
            linkedHashMap.put(str, c19328910jf);
        }
        C19328910jf c19328910jf2 = (C19328910jf) c19328910jf;
        if (c19328910jf2.LIZIZ == 0) {
            c19328910jf2.LIZIZ = 1;
        }
    }

    public static final void LIZIZ(String str) {
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "enable_settings_consumption_track", true, false) || str.length() == 0) {
            return;
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) LIZIZ;
        Object c19328910jf = linkedHashMap.get(str);
        if (c19328910jf == null) {
            c19328910jf = new C19328910jf(0);
            linkedHashMap.put(str, c19328910jf);
        }
        C19328910jf c19328910jf2 = (C19328910jf) c19328910jf;
        if (c19328910jf2.LIZ == 0) {
            c19328910jf2.LIZ = 1;
        }
    }
}
