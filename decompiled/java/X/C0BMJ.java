package X;

import com.bytedance.ies.abmock.SettingsManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0BMJ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0BMJ extends C09AY implements Function0<Integer> {
    public C0BMJ() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        SettingsManager.LIZLLL().getClass();
        return Integer.valueOf(SettingsManager.LJ("inbox_unread_count_check", 1));
    }
}
