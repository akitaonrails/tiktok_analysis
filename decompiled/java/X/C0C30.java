package X;

import com.bytedance.ies.ugc.appcontext.AppBuildConfig;
import com.ss.android.ugc.AwemeAppBuildConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0C30, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C30 extends C09AY implements Function0<AppBuildConfig> {
    public C0C30() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.ies.ugc.appcontext.AppBuildConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final AppBuildConfig invoke() {
        ?? LIZ = C04TD.LIZ(AppBuildConfig.class, false);
        if (LIZ != 0) {
            return LIZ;
        }
        if (C04TD.LJJLIIIJJI == null) {
            synchronized (AppBuildConfig.class) {
                if (C04TD.LJJLIIIJJI == null) {
                    C04TD.LJJLIIIJJI = new AwemeAppBuildConfig();
                }
            }
        }
        return C04TD.LJJLIIIJJI;
    }
}
