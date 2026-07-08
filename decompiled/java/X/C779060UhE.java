package X;

import android.text.SpannableStringBuilder;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0UhE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C779060UhE {
    public static SpannableStringBuilder LIZ(String str, String str2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int iLJJIJLIJ = a0.LJJIJLIJ(0, str, str2, true);
        if (iLJJIJLIJ >= 0) {
            C1119920fFW.LJIIIIZZ(spannableStringBuilder, iLJJIJLIJ, str2.length() + iLJJIJLIJ, 18, OppoPermissionPopupMaskDelayExp.DEFAULT);
        }
        return spannableStringBuilder;
    }
}
