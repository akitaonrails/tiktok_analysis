package X;

import com.bytedance.ies.abmock.SettingsManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Bz3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C305990Bz3 extends C09AY implements Function0<Boolean> {
    public C305990Bz3() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        SettingsManager.LIZLLL().getClass();
        return Boolean.valueOf(SettingsManager.LJ("increase_seek_bar_touch_area", 100) > 0);
    }
}
