package X;

import com.bytedance.tux.drawable.TuxIconDrawable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Gop, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C427050Gop {
    public static final void LIZ(C197039127h c197039127h) {
        int iIntValue;
        TuxIconDrawable tuxIconDrawable;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, C1385040m98.LIZ(c197039127h.getContext(), false));
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -16777216;
        }
        Object objLJJIIZ = C13LQ.LJJIIZ(0, c197039127h.getCompoundDrawables());
        if ((objLJJIIZ instanceof C1856690yPr) && (tuxIconDrawable = (TuxIconDrawable) objLJJIIZ) != null) {
            tuxIconDrawable.LJFF(iIntValue);
        }
    }
}
