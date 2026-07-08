package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.translation.service.ITranslationService;

/* JADX INFO: renamed from: X.0SCU, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SCU {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C0SCT());

    public static ITranslationService LIZ() {
        return (ITranslationService) LIZ.getValue();
    }

    public static final boolean LIZIZ(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        if (!C20702515zj.LIZIZ(aweme) && !LIZ().LLIIII(aweme, true) && !C0SKF.LIZ(aweme)) {
            C161N c161n = C161N.LIZIZ;
            if (!c161n.LJJJJZ(aweme) && !c161n.LJJLIIIJJIZ(aweme) && !c161n.LLD(aweme, null)) {
                return false;
            }
        }
        return true;
    }
}
