package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;

/* JADX INFO: renamed from: X.05Fq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1322805Fq {
    public static final C1322805Fq LIZ = new C1322805Fq();
    public static final Keva LIZIZ = KevaImpl.getRepo("photo_mode_explore_fullpage_music_state", 0);

    public static final Boolean LIZ() {
        if (!C04WA.LIZ()) {
            return null;
        }
        Keva keva = LIZIZ;
        LIZ.getClass();
        if (keva.getBoolean(LIZIZ("has_last_music_muted"), false)) {
            return Boolean.valueOf(keva.getBoolean(LIZIZ("last_music_muted"), false));
        }
        return null;
    }

    public static String LIZIZ(String str) {
        String curUserId;
        if (!((Boolean) C04RJ.LIZ.getValue()).booleanValue() && (curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId()) != null && curUserId.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('|');
            sbLIZ.append(curUserId);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return str;
    }
}
