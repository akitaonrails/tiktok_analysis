package X;

import com.bytedance.ies.abmock.SettingsManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Aj3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C270590Aj3 extends C09AY implements Function0<Long> {
    public C270590Aj3() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        SettingsManager.LIZLLL().getClass();
        return Long.valueOf(SettingsManager.LJFF("ad_prerender_check_delay_time", 0L));
    }
}
