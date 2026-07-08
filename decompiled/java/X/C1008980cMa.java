package X;

import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentLayoutConstraintModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentLayoutModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cMa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1008980cMa {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(AnoleComponentLayoutModel anoleComponentLayoutModel) {
        if (anoleComponentLayoutModel.left > 0.0d) {
            if (anoleComponentLayoutModel.bottom > 0.0d) {
                return true;
            }
            AnoleComponentLayoutConstraintModel anoleComponentLayoutConstraintModel = anoleComponentLayoutModel.bottomConstraint;
            if (anoleComponentLayoutConstraintModel != null && (Intrinsics.LJFF(anoleComponentLayoutConstraintModel.baseline, EnumC1009140cMq.ANOLE_LEFT_INTERACT.getInteractName()) || Intrinsics.LJFF(anoleComponentLayoutConstraintModel.baseline, EnumC1009140cMq.ANOLE_BOTTOM_INTERACT.getInteractName()))) {
                return true;
            }
        }
        if (anoleComponentLayoutModel.top == -10000.0d && anoleComponentLayoutModel.left == 0.0d) {
            return true;
        }
        return false;
    }
}
