package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.videohotswap.overlay.StoryPaywallComponentTrigger;
import com.ss.android.ugc.aweme.videohotswap.service.IPaidContentVideoHotSwapService;

/* JADX INFO: renamed from: X.0S7x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C716310S7x {
    public static IPaidContentVideoHotSwapService LIZ() {
        return StoryPaywallComponentTrigger.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public static boolean LIZIZ(Aweme aweme) {
        EnumC586210Myx enumC586210MyxLJIIIIZZ;
        IPaidContentVideoHotSwapService iPaidContentVideoHotSwapServiceLIZ = LIZ();
        if (iPaidContentVideoHotSwapServiceLIZ != null) {
            enumC586210MyxLJIIIIZZ = iPaidContentVideoHotSwapServiceLIZ.LJIIIIZZ(aweme, false);
        } else {
            enumC586210MyxLJIIIIZZ = null;
        }
        if (enumC586210MyxLJIIIIZZ != EnumC586210Myx.VHS && enumC586210MyxLJIIIIZZ != EnumC586210Myx.FYP_PREVIEW) {
            return false;
        }
        return true;
    }
}
