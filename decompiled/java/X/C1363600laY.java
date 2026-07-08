package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0laY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1363600laY {
    public static C1364130lbP LIZ(ViewGroup viewGroup, SharePanelViewModel sharePanelViewModel, boolean z, InterfaceC1362600lYw interfaceC1362600lYw, C788580Uwa c788580Uwa, int i) {
        ViewGroup.LayoutParams layoutParams;
        int i2 = C1364130lbP.LLJIJIL;
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 16) != 0) {
            c788580Uwa = null;
        }
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cro, viewGroup, false);
        if (z) {
            C426750GoL.LJIIL(viewTd, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 0, 16);
        }
        if (c788580Uwa != null) {
            viewTd.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60));
            if (c788580Uwa.LIZ) {
                viewTd.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(68));
                View viewFindViewById = viewTd.findViewById(R.id.bj1);
                if (viewFindViewById != null && (layoutParams = viewFindViewById.getLayoutParams()) != null) {
                    layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                    layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                }
                TuxTextView tuxTextView = (TuxTextView) viewTd.findViewById(R.id.p0w);
                if (tuxTextView != null) {
                    tuxTextView.setTuxFont(102);
                    tuxTextView.setHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
                }
            }
        }
        return new C1364130lbP(viewTd, sharePanelViewModel, interfaceC1362600lYw);
    }
}
