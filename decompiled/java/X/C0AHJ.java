package X;

import com.bytedance.ies.abmock.SettingsManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0AHJ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0AHJ extends C09AY implements Function0<Boolean> {
    public C0AHJ() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        SettingsManager.LIZLLL().getClass();
        return Boolean.valueOf(SettingsManager.LJ("allow_long_video_scrubbing", 0) == 1);
    }
}
