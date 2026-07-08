package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.google.android.gms.common.ConnectionResult;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Aho, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C269820Aho extends C09AY implements Function0<Integer> {
    public C269820Aho() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        SettingsManager.LIZLLL().getClass();
        return Integer.valueOf(SettingsManager.LJ("vboost_feed_scroll_opt_time", ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED));
    }
}
