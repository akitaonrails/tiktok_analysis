package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Arrays;
import kotlin.text.a0;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.00wy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C244200wy {
    public static String LIZ(long j) {
        String strJ4 = C786410Ut5.j4("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(j / 1048576.0f)}, 1));
        if (u.LJIIZILJ(strJ4, CardStruct.IStatusCode.DEFAULT, false) && a0.LJJIIZI(strJ4, e3.d, false)) {
            return strJ4.substring(0, a0.LJJJ(strJ4, e3.d, 0, false, 6));
        }
        return strJ4;
    }
}
