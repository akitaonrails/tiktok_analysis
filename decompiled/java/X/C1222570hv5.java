package X;

import android.text.style.ForegroundColorSpan;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.AFwS207S0000000_19;

/* JADX INFO: renamed from: X.0hv5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1222570hv5 {
    public static final C01GW LIZ;

    static {
        C0I0B.LJFF.LIZJ();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1p, C894660Z7w.LIZ());
        if (numLIZJ != null) {
            new ForegroundColorSpan(numLIZJ.intValue());
        }
        LIZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(12));
    }

    public static String LIZ(int i, int i2, Object... objArr) {
        C0I0B.LJFF.LIZJ();
        return C894660Z7w.LIZ().getResources().getQuantityString(i, i2, Arrays.copyOf(objArr, objArr.length));
    }
}
