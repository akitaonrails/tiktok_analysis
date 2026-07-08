package X;

import com.bytedance.android.livesdk.livesetting.wallet.LiveMPHostSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* JADX INFO: renamed from: X.0g69, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1152550g69 {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ() {
        LiveMPHostSetting liveMPHostSetting = LiveMPHostSetting.INSTANCE;
        if (C500260Jjc.LJJIIZ(liveMPHostSetting.getValue())) {
            return liveMPHostSetting.getValue();
        }
        ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isInMusicallyRegion();
        return "https://webcast16-normal-useast5.tiktokv.us.com";
    }
}
