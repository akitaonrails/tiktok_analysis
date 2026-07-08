package X;

import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0ycK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1864420ycK {
    public static String LIZ = "";

    public static final String LIZ(TakoEnterParams takoEnterParams) {
        if (C123100dR.LIZ(takoEnterParams.getEnterAwemeId())) {
            return takoEnterParams.getEnterAwemeId();
        }
        if (Intrinsics.LJFF(takoEnterParams.enterFrom, C14TF.LIZIZ.LJJIIZ())) {
            return LIZ;
        }
        return "";
    }

    public static final boolean LIZIZ(TakoEnterParams takoEnterParams) throws JSONException {
        String str;
        String str2;
        String str3 = null;
        if (C1148304eP.LIZ()) {
            if (takoEnterParams != null) {
                str = takoEnterParams.enterMethod;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(str, "click_icon")) {
                C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                if (takoEnterParams != null) {
                    str2 = takoEnterParams.enterFrom;
                    str3 = takoEnterParams.enterMethod;
                } else {
                    str2 = null;
                }
                c1862330yYx.getClass();
                C1862330yYx.LJIIIZ(str2, str3, true);
                return true;
            }
            return false;
        }
        return false;
    }
}
