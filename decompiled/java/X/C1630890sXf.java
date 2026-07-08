package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.verify.EffectFullWidthHorizontalCarouselAB;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0sXf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1630890sXf {
    public static final InterfaceC1630900sXg LIZ(ShortVideoContext shortVideoContext) {
        if (shortVideoContext != null && C579450Mo3.LIZ(shortVideoContext)) {
            if (EffectFullWidthHorizontalCarouselAB.isEnabled()) {
                return C1630910sXh.LIZ;
            }
            return C1630920sXi.LIZ;
        }
        return C1630730sXP.LIZ;
    }

    public static final String LIZIZ(ShortVideoContext shortVideoContext, Function1<? super String, Integer> function1) {
        if (shortVideoContext == null) {
            return "";
        }
        String strLJIJJLI = shortVideoContext.LJIJJLI();
        if (!(!a0.LJJJIL(strLJIJJLI)) || strLJIJJLI == null) {
            return ShortVideoContext.LJIL(function1.invoke(C0CHQ.LIZ().LJJJJJ().getDefaultShootTabTag(shortVideoContext)).intValue());
        }
        return strLJIJJLI;
    }
}
