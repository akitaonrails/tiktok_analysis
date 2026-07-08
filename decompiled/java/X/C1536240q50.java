package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0q50, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1536240q50 extends C09AY implements Function0<String> {
    public C1536240q50() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        String strLJJIJ;
        ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
        return (iSparkHostApi == null || (strLJJIJ = iSparkHostApi.LJJIJ()) == null) ? "" : strLJJIJ;
    }
}
