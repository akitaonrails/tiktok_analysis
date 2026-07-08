package X;

import com.bytedance.ies.abmock.SettingsManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.06GL, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06GL extends C09AY implements Function0<Integer> {
    public C06GL() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        SettingsManager.LIZLLL().getClass();
        return Integer.valueOf(SettingsManager.LJ("streak_feedback_count_settings", 3));
    }
}
