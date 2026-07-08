package X;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.livesdk.model.message.RoomMessage;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import java.util.Arrays;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.00wN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C240500wN extends C239700wF {
    @Override // X.C239700wF, X.AbstractC1110790f0n
    public final CharSequence LLFF() {
        int iLJLLLL = LJLLLL();
        String strLJIJI = C497740JfY.LJIJI(LLIILII() ? 2131844574 : 2131844576);
        if (strLJIJI == null) {
            strLJIJI = "";
        }
        String strLJIJI2 = C497740JfY.LJIJI(2131844575);
        String strJ4 = C786410Ut5.j4(strLJIJI2 != null ? strLJIJI2 : "", Arrays.copyOf(new Object[]{strLJIJI}, 1));
        int iLJJJ = a0.LJJJ(strJ4, strLJIJI, 0, false, 6);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strJ4);
        C1119920fFW.LJIIIIZZ(spannableStringBuilder, iLJJJ, strLJIJI.length() + iLJJJ, 18, OppoPermissionPopupMaskDelayExp.DEFAULT);
        C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(iLJLLLL), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public C240500wN(RoomMessage roomMessage) {
        super(roomMessage);
    }
}
