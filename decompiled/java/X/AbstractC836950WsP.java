package X;

import android.content.ComponentName;
import android.os.Bundle;
import java.util.Set;

/* JADX INFO: renamed from: X.0WsP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC836950WsP {
    public final String LIZ;
    public final Bundle LIZIZ;
    public final Bundle LIZJ;
    public final boolean LIZLLL;
    public final Set<ComponentName> LJ;

    public AbstractC836950WsP(String str, Bundle bundle, Bundle bundle2, boolean z, boolean z2, Set<ComponentName> set) {
        this.LIZ = str;
        this.LIZIZ = bundle;
        this.LIZJ = bundle2;
        this.LIZLLL = z;
        this.LJ = set;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z2);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z2);
    }
}
