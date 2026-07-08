package X;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: X.08St, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2121308St {
    public final C08PR LIZ;

    public C2121308St(C08PR c08pr) {
        this.LIZ = c08pr;
    }

    public final synchronized void LIZ(Context context, Set set) {
        AssetManager assets = context.getAssets();
        Iterator it2 = ((HashSet) set).iterator();
        while (it2.hasNext()) {
            ((Integer) C2133408Xk.LIZ(assets, "addAssetPath", Integer.class, String.class, ((File) it2.next()).getPath())).intValue();
        }
    }
}
