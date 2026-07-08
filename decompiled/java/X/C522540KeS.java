package X;

import com.ss.android.ugc.aweme.api.pipeline.ITemplateConsumeService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.0KeS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C522540KeS {
    public static final ITemplateConsumeService LIZ;

    static {
        ITemplateConsumeService iTemplateConsumeService = (ITemplateConsumeService) PluggableExtentionKt.pluggableSpi$default(ITemplateConsumeService.class, false, false, false, 14, null);
        LIZ = iTemplateConsumeService;
        if (iTemplateConsumeService != null) {
            iTemplateConsumeService.LIZIZ();
        }
    }
}
