package X;

import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;

/* JADX INFO: renamed from: X.12Nz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19747312Nz {
    public static final Context LIZ(Context context) {
        ISparkHostApi iSparkHostApi;
        if (context != null && (iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null)) != null) {
            iSparkHostApi.LIZIZ(context);
        }
        return context;
    }
}
