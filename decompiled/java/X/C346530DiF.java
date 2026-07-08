package X;

import android.content.Context;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0DiF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C346530DiF implements C0TVI {
    public final int $t;
    public Object l0;

    @Override // X.C0TVI
    public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) {
        switch (this.$t) {
            case 0:
                return onApplyWindowInsets$0(this, view, c20246014Ju);
            case 1:
                return onApplyWindowInsets$1(this, view, c20246014Ju);
            case 2:
                return onApplyWindowInsets$2(this, view, c20246014Ju);
            case 3:
                return onApplyWindowInsets$3(this, view, c20246014Ju);
            default:
                return null;
        }
    }

    public C346530DiF(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final C20246014Ju onApplyWindowInsets$0(C346530DiF c346530DiF, View view, C20246014Ju c20246014Ju) {
        Integer numLIZJ;
        C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(7);
        view.setPadding(c20244914JjLIZ.LIZ, 0, c20244914JjLIZ.LIZJ, c20244914JjLIZ.LIZLLL);
        Context context = (Context) c346530DiF.l0;
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.e1, context)) != null) {
            view.setBackgroundColor(numLIZJ.intValue());
        }
        return c20246014Ju;
    }

    public static final C20246014Ju onApplyWindowInsets$1(C346530DiF c346530DiF, View view, C20246014Ju c20246014Ju) {
        C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(7);
        C21578619ce c21578619ce = ((C335560DDm) c346530DiF.l0).LLILZLL;
        c21578619ce.setPadding(c21578619ce.getPaddingLeft(), c20244914JjLIZ.LIZIZ, ((C335560DDm) c346530DiF.l0).LLILZLL.getPaddingRight(), c20244914JjLIZ.LIZLLL);
        return c20246014Ju;
    }

    public static final C20246014Ju onApplyWindowInsets$2(C346530DiF c346530DiF, View view, C20246014Ju c20246014Ju) {
        int iMax = Math.max(c20246014Ju.LIZ(8).LIZLLL, 0);
        int iMax2 = Math.max(c20246014Ju.LIZ(2).LIZLLL, 0);
        int iMax3 = Math.max(iMax, iMax2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bindImeInsets imeBottom = ");
        sbLIZ.append(iMax);
        sbLIZ.append(", navigationBottom = ");
        sbLIZ.append(iMax2);
        C20441214yg.LJIIIZ("LiveTitleEditDialogFragment", C2188811AlT.LIZIZ(sbLIZ));
        C786410Ut5.ed((View) c346530DiF.l0, -iMax3);
        return c20246014Ju;
    }

    public static final C20246014Ju onApplyWindowInsets$3(C346530DiF c346530DiF, View view, C20246014Ju c20246014Ju) {
        Integer numLIZJ;
        C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(7);
        view.setPadding(c20244914JjLIZ.LIZ, 0, c20244914JjLIZ.LIZJ, c20244914JjLIZ.LIZLLL);
        Context context = ((View) c346530DiF.l0).getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.bx, context)) != null) {
            view.setBackgroundColor(numLIZJ.intValue());
        }
        return c20246014Ju;
    }
}
