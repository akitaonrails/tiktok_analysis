package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0We8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C828100We8 extends C09AY implements Function0<Boolean> {
    public C828100We8() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean z = false;
        ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
        if (iSparkHostApi != null && iSparkHostApi.LJLILLLLZI()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
