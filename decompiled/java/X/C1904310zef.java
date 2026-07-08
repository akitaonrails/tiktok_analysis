package X;

import com.ss.android.ugc.aweme.IAwemeNoticeBuildConfig;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zef, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1904310zef extends C09AY implements Function0<IAwemeNoticeBuildConfig> {
    public C1904310zef() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.IAwemeNoticeBuildConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IAwemeNoticeBuildConfig invoke() {
        return PluggableExtentionKt.pluggableSpiForReal(IAwemeNoticeBuildConfig.class);
    }
}
