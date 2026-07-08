package X;

import android.util.Size;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.09o4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2482209o4 {
    public static final Size LIZ(View view) {
        int iLJIIJ = (int) ((C12ES.LJIIJ(view.getContext()) - (3 * C12ES.LIZJ(1.5f, view.getContext()))) / 4);
        Size size = new Size(iLJIIJ, (int) (((double) iLJIIJ) * 1.0d));
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = size.getWidth();
        layoutParams.height = size.getHeight();
        return size;
    }
}
