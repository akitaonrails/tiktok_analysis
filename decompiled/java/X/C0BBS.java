package X;

import com.bytedance.ies.abmock.SettingsManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0BBS, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0BBS extends C09AY implements Function0<Boolean> {
    public C0BBS() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        SettingsManager.LIZLLL().getClass();
        return Boolean.valueOf(SettingsManager.LIZ("commerce_perf_feed_pre_render_strategy", false));
    }
}
