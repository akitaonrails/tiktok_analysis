package X;

import com.bytedance.ies.abmock.SettingsManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07QS, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07QS extends C09AY implements Function0<Boolean> {
    public C07QS() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        SettingsManager.LIZLLL().getClass();
        return Boolean.valueOf(System.currentTimeMillis() % ((long) 100) < ((long) SettingsManager.LJ("im_conv_load_event_sample", 100)));
    }
}
