package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.ml.api.CreationFeatureBridge;
import com.ss.android.ugc.aweme.ml.api.ICreationFeatureBridge;

/* JADX INFO: renamed from: X.0nn0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1448200nn0 {
    public static ICreationFeatureBridge LIZ() {
        ICreationFeatureBridge iCreationFeatureBridge = (ICreationFeatureBridge) PluggableExtentionKt.pluggableSpi$default(ICreationFeatureBridge.class, false, false, false, 14, null);
        return iCreationFeatureBridge == null ? CreationFeatureBridge.FALLBACK$delegate.getValue() : iCreationFeatureBridge;
    }
}
