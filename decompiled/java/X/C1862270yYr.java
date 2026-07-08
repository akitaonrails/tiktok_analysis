package X;

import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yYr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1862270yYr {
    public static final boolean LIZ(TakoEnterParams takoEnterParams) {
        String str = null;
        if (((Boolean) C2273971DzX.LIZIZ.getValue()).booleanValue()) {
            if (takoEnterParams != null) {
                str = takoEnterParams.enterMethod;
            }
            if (Intrinsics.LJFF(str, "click_icon") && ((Boolean) C2276501E8q.LIZJ.getValue()).booleanValue()) {
                return true;
            }
            return false;
        }
        if (((Boolean) C2276501E8q.LIZJ.getValue()).booleanValue()) {
            if (takoEnterParams != null) {
                str = takoEnterParams.enterMethod;
            }
            if (Intrinsics.LJFF(str, "click_icon")) {
                return true;
            }
            return false;
        }
        return false;
    }
}
