package X;

import com.bytedance.ies.abmock.SettingsManager;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CAB, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CAB {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C0CAC());

    public static boolean LIZ(String str) {
        if (C0CAD.LIZ == null) {
            SettingsManager.LIZLLL().getClass();
            C0CAD.LIZ = Boolean.valueOf(SettingsManager.LIZ("player_duplicate_detector", true));
        }
        if (C0CAD.LIZ.booleanValue()) {
            C01GW c01gw = LIZ;
            if (((HashMap) c01gw.getValue()).size() > 0) {
                Iterator it2 = ((HashMap) c01gw.getValue()).values().iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.LJFF(str, it2.next())) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
