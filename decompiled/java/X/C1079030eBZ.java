package X;

import com.bytedance.android.livesdk.livesetting.watchlive.previewlive.LiveEnableDeleteCardCompensateSetting;

/* JADX INFO: renamed from: X.0eBZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1079030eBZ {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZ() {
        LiveEnableDeleteCardCompensateSetting liveEnableDeleteCardCompensateSetting = LiveEnableDeleteCardCompensateSetting.INSTANCE;
        return liveEnableDeleteCardCompensateSetting.enableServer() || liveEnableDeleteCardCompensateSetting.enableClient();
    }
}
