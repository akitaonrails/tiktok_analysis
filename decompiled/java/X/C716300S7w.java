package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.videohotswap.overlay.PaywallComponentTrigger;
import com.ss.android.ugc.aweme.videohotswap.service.IPaidContentVideoHotSwapService;

/* JADX INFO: renamed from: X.0S7w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C716300S7w {
    public static IPaidContentVideoHotSwapService LIZ() {
        return PaywallComponentTrigger.LLJLILLLLZIIL.getValue();
    }

    public static boolean LIZIZ(Aweme aweme, boolean z) {
        EnumC586210Myx enumC586210MyxLJIIIIZZ = LIZ().LJIIIIZZ(aweme, z);
        if (enumC586210MyxLJIIIIZZ != EnumC586210Myx.VHS && enumC586210MyxLJIIIIZZ != EnumC586210Myx.FYP_PREVIEW) {
            return false;
        }
        return true;
    }
}
