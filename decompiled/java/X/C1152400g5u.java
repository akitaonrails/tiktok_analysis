package X;

import com.bytedance.android.livesdk.livesetting.watchlive.LiveImageMonitorSceneSetting;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0g5u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1152400g5u extends C09AY implements Function0<String[]> {
    public C1152400g5u() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String[] invoke() {
        return LiveImageMonitorSceneSetting.INSTANCE.getValue();
    }
}
