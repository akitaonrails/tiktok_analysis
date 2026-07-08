package X;

import com.bytedance.ies.abmock.SettingsManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0AdQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C267100AdQ extends C09AY implements Function0<Long> {
    public C267100AdQ() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        SettingsManager.LIZLLL().getClass();
        return Long.valueOf(SettingsManager.LJFF("mock_first_launch_time", -1L));
    }
}
