package X;

import android.content.res.ColorStateList;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Ufw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C778260Ufw {
    public static final C778580UgS LIZ() {
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.c9i, C497740JfY.LJII());
        int iIntValue = numLIZJ != null ? numLIZJ.intValue() : -1;
        C20743516Fd c20743516FdLIZLLL = C20736316Cj.LIZLLL(R.attr.eny, C497740JfY.LJII());
        if (c20743516FdLIZLLL != null) {
            c20743516FdLIZLLL.setTint(iIntValue);
        } else {
            c20743516FdLIZLLL = null;
        }
        return new C778580UgS(c20743516FdLIZLLL, ColorStateList.valueOf(iIntValue));
    }
}
