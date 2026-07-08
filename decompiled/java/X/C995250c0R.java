package X;

import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0c0R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C995250c0R {
    public static C995260c0S LIZ(ViewGroup viewGroup, boolean z, C788580Uwa c788580Uwa) {
        ViewGroup.LayoutParams layoutParams;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ckb, viewGroup, false);
        if (z) {
            C426750GoL.LJIIL(viewTd, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 0, 16);
        }
        if (c788580Uwa != null) {
            viewTd.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60));
            if (c788580Uwa.LIZ) {
                viewTd.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(68));
                View viewFindViewById = viewTd.findViewById(R.id.biz);
                if (viewFindViewById != null && (layoutParams = viewFindViewById.getLayoutParams()) != null) {
                    layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                    layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                }
            }
        }
        return new C995260c0S(viewTd);
    }
}
