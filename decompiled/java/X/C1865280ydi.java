package X;

import com.ss.android.ugc.aweme.appdiff.ISettingsCommonAppDiffProtocol;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.0ydi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1865280ydi {
    public static final /* synthetic */ C1865280ydi LIZ = new C1865280ydi();
    public static final ISettingsCommonAppDiffProtocol LIZIZ;

    static {
        ISettingsCommonAppDiffProtocol downgradeInstance = (ISettingsCommonAppDiffProtocol) PluggableExtentionKt.pluggableSpi$default(ISettingsCommonAppDiffProtocol.class, false, false, false, 14, null);
        if (downgradeInstance == null) {
            downgradeInstance = new ISettingsCommonAppDiffProtocol.DowngradeInstance();
        }
        LIZIZ = downgradeInstance;
    }
}
