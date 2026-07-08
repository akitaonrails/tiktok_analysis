package X;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: renamed from: X.01nq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C442401nq {
    public static final C442401nq LIZ = new C442401nq();

    public static void LIZ(Bundle bundle, Map map) {
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (C123100dR.LIZ((String) entry.getValue())) {
                    C786410Ut5.LJJJI((String) entry.getKey(), (String) entry.getValue(), bundle);
                }
            }
        }
    }
}
