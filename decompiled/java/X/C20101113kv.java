package X;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import java.util.List;

/* JADX INFO: renamed from: X.13kv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20101113kv extends C20100813ks {
    @Override // X.C20100813ks
    public final ProviderInfo LIZ(ResolveInfo resolveInfo) {
        return resolveInfo.providerInfo;
    }

    @Override // X.C20100813ks
    public final List LIZJ(PackageManager packageManager, Intent intent) {
        return packageManager.queryIntentContentProviders(intent, 0);
    }
}
