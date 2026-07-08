package X;

import com.bytedance.ies.abmock.SettingsManager;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: renamed from: X.07Na, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1851607Na {
    public static final Set<String> LIZ;
    public static final Set<String> LIZIZ;

    static {
        Set<String> setSingleton = Collections.singleton("VideoDiggAssem");
        LIZ = setSingleton;
        LIZIZ = (Set) SettingsManager.LIZLLL().LJIIIIZZ("feed_abnormal_view_interception_settings", Set.class, setSingleton);
    }
}
