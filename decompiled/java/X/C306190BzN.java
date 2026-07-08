package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.h;

/* JADX INFO: renamed from: X.0BzN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C306190BzN {
    public static final h LIZ;

    static {
        h hVar = new h();
        h hVar2 = (h) SettingsManager.LIZLLL().LJIIIIZZ("lynx_network_force_allow_list_experiment", h.class, hVar);
        if (hVar2 != null) {
            hVar = hVar2;
        }
        LIZ = hVar;
    }
}
