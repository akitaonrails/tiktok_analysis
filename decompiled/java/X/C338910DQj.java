package X;

import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0DQj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C338910DQj {
    public static final int LIZ(C19EG c19eg) {
        int iLIZIZ;
        int iLIZJ = C497820Jfg.LIZJ(c19eg);
        View viewFindViewById = c19eg.findViewById(R.id.tpm);
        if (viewFindViewById != null) {
            iLIZIZ = viewFindViewById.getMeasuredHeight();
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(58));
        }
        return iLIZJ + iLIZIZ;
    }
}
