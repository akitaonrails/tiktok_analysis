package X;

import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.facebook.FacebookSdk;

/* JADX INFO: renamed from: X.1BJR, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BJR {
    public final synchronized C2202701BIu LIZ() {
        C2202701BIu c2202701BIu;
        if (C2202701BIu.LJ == null) {
            C2202701BIu.LJ = new C2202701BIu(LocalBroadcastManager.LIZ(FacebookSdk.LIZJ()), new C2202771BJb());
        }
        c2202701BIu = C2202701BIu.LJ;
        if (c2202701BIu == null) {
            throw null;
        }
        return c2202701BIu;
    }
}
