package X;

import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cLs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1008540cLs {
    public static boolean LIZ(AnoleComponentAppearModel anoleComponentAppearModel, int i) {
        String phase = anoleComponentAppearModel.getPhase();
        if (phase != null && !Intrinsics.LJFF(phase, EnumC1008530cLr.ALL.getValue())) {
            if (Intrinsics.LJFF(phase, EnumC1008530cLr.FIRSTSHOW.getValue())) {
                if (i != 1) {
                    return false;
                }
            } else {
                if (!Intrinsics.LJFF(phase, EnumC1008530cLr.RESHOW.getValue()) || i > 1) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }
}
