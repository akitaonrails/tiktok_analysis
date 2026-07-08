package X;

import android.app.Application;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.tablet.api.IDeviceCapability;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0nw3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1453810nw3 {
    public static final C1453810nw3 LIZ = new C1453810nw3();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(6278));

    public static boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        IDeviceCapability iDeviceCapability;
        if (!((Boolean) LIZIZ.getValue()).booleanValue() || C568750MSj.LIZIZ(videoPublishEditModel) || u4.LJIIZILJ(videoPublishEditModel) || !C1428470nHB.LJLIIL(videoPublishEditModel) || C1441980ncy.LIZIZ(videoPublishEditModel)) {
            return false;
        }
        C1546210qL5 c1546210qL5 = C1546210qL5.LIZ;
        Application application = C0CHQ.LIZ;
        c1546210qL5.getClass();
        if ((C1546210qL5.LJIIIZ(application) && ((iDeviceCapability = (IDeviceCapability) PluggableExtentionKt.pluggableSpi$default(IDeviceCapability.class, false, false, false, 14, null)) == null || !iDeviceCapability.k(C0CHQ.LIZ))) || !C0C64.LJIILLIIL().LJIIIZ(31744, "enable_photo_mode_ai_desc_user", true, false) || C1388580mEq.LIZIZ(C0CHQ.LIZ) || !C0FVE.LIZ(videoPublishEditModel)) {
            return false;
        }
        return true;
    }
}
