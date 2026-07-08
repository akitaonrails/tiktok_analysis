package X;

import com.bytedance.android.livesdkapi.host.IHostSetting;
import com.bytedance.android.livesdkapi.host.IHostUser;

/* JADX INFO: renamed from: X.0JGF, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JGF {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(long j, String str, Throwable th, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(" info-> isAnchor:");
        sbLIZ.append(z);
        sbLIZ.append(" roomId: ");
        sbLIZ.append(j);
        sbLIZ.append(" percent: ");
        sbLIZ.append(((IHostSetting) C1161920gLG.LIZJ(IHostSetting.class)).enableDonationPercentService());
        sbLIZ.append(" + region: ");
        sbLIZ.append(((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurrentRegionCode());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (th == null) {
            th = new Throwable(strLIZIZ);
        }
        C1CC2.LIZ(strLIZIZ, th);
    }
}
