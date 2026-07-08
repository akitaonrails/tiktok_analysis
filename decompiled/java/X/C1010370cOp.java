package X;

import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cOp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1010370cOp {
    public static final boolean LIZ(AnoleComponentModel anoleComponentModel, String str) {
        String str2 = anoleComponentModel.resourceLoadingStrategy;
        if (Intrinsics.LJFF(str2, str)) {
            return true;
        }
        if ((str2 == null || str2.length() == 0) && Intrinsics.LJFF(str, "preload")) {
            return true;
        }
        return false;
    }
}
