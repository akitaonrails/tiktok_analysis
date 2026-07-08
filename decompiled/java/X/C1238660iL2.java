package X;

import com.ss.android.ugc.aweme.appdiff.ISettingsInternalAppDiffProtocol;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.0iL2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1238660iL2 {
    public static final /* synthetic */ C1238660iL2 LIZ = new C1238660iL2();
    public static final ISettingsInternalAppDiffProtocol LIZIZ;

    static {
        ISettingsInternalAppDiffProtocol downgradeInstance = (ISettingsInternalAppDiffProtocol) PluggableExtentionKt.pluggableSpi$default(ISettingsInternalAppDiffProtocol.class, false, false, false, 14, null);
        if (downgradeInstance == null) {
            downgradeInstance = new ISettingsInternalAppDiffProtocol.DowngradeInstance();
        }
        LIZIZ = downgradeInstance;
    }
}
