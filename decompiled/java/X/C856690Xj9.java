package X;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.audio.copyrightdetect.PreCheckResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AwS154S0101000_14;
import kotlin.jvm.internal.AwS593S0100000_14;

/* JADX INFO: renamed from: X.0Xj9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C856690Xj9 extends AbstractC856710XjB {
    @Override // X.AbstractC856710XjB
    public final int LIZ() {
        return C0FPS.LONG_VIDEO.getScene();
    }

    @Override // X.AbstractC856710XjB
    public final boolean LIZJ() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "enable_long_video_audio_copyright_detection", true, true);
    }

    @Override // X.AbstractC856710XjB
    public final boolean LIZIZ(InterfaceC1455860nzM interfaceC1455860nzM) {
        if (C384190F4n.LIZIZ(interfaceC1455860nzM)) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC856710XjB
    public final void LJFF(FragmentManager fragmentManager, Context context, VideoPublishEditModel videoPublishEditModel, AwS593S0100000_14 awS593S0100000_14) {
        PreCheckResult preCheckResult = this.LIZ;
        if (preCheckResult != null) {
            C858290Xlj.LIZ(fragmentManager, context, preCheckResult, videoPublishEditModel, "video_edit_page", "", LIZ(), null, awS593S0100000_14);
        }
    }

    @Override // X.AbstractC856710XjB
    public final void LJ(FragmentManager fragmentManager, Context context, VideoPublishEditModel videoPublishEditModel, int i, AwS154S0101000_14 awS154S0101000_14, AwS154S0101000_14 awS154S0101000_142) {
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C858860Xme(this, fragmentManager, context, videoPublishEditModel, i, awS154S0101000_14, awS154S0101000_142, null), 2);
    }
}
