package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.outreach.frequency.IOutreachFrequency;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0W0V, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W0V extends C09AY implements Function0<IOutreachFrequency> {
    public C0W0V() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.outreach.frequency.IOutreachFrequency, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IOutreachFrequency invoke() {
        return PluggableExtentionKt.pluggableSpi$default(IOutreachFrequency.class, false, false, false, 14, null);
    }
}
