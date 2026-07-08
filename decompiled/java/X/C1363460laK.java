package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0laK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1363460laK {
    public static C1363960lb8 LIZ(ViewGroup viewGroup, SharePanelViewModel sharePanelViewModel, InterfaceC1362600lYw interfaceC1362600lYw, boolean z, C788580Uwa c788580Uwa, InterfaceC897330ZId interfaceC897330ZId, int i) {
        boolean z2;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        C788580Uwa c788580Uwa2 = c788580Uwa;
        InterfaceC897330ZId interfaceC897330ZId2 = interfaceC897330ZId;
        int i2 = C1363960lb8.LLJJJJ;
        if ((i & 32) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 64) != 0) {
            z = false;
        }
        if ((i & 128) != 0) {
            c788580Uwa2 = null;
        }
        if ((i & 256) != 0) {
            interfaceC897330ZId2 = null;
        }
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.crp, viewGroup, false);
        if (z) {
            C426750GoL.LJIIL(viewTd, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 0, 16);
            TuxTextView tuxTextView = (TuxTextView) viewTd.findViewById(R.id.p0w);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tuxTextView.getLayoutParams();
            marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
            C786410Ut5.R6(tuxTextView, marginLayoutParams);
        }
        if (!z2 || c788580Uwa2 != null) {
            View viewFindViewById = viewTd.findViewById(R.id.kax);
            if (viewFindViewById != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById);
            }
            if (c788580Uwa2 != null) {
                viewTd.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60));
                if (c788580Uwa2.LIZ) {
                    viewTd.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(68));
                    View viewFindViewById2 = viewTd.findViewById(R.id.biz);
                    if (viewFindViewById2 != null && (layoutParams2 = viewFindViewById2.getLayoutParams()) != null) {
                        layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                        layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                    }
                    TuxTextView tuxTextView2 = (TuxTextView) viewTd.findViewById(R.id.p0w);
                    if (tuxTextView2 != null) {
                        tuxTextView2.setTuxFont(102);
                        ViewGroup.LayoutParams layoutParams3 = tuxTextView2.getLayoutParams();
                        layoutParams3.height = -2;
                        C786410Ut5.R6(tuxTextView2, layoutParams3);
                    }
                    View viewFindViewById3 = viewTd.findViewById(R.id.cuv);
                    if (viewFindViewById3 != null && (layoutParams = viewFindViewById3.getLayoutParams()) != null) {
                        layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                    }
                }
            }
        }
        return new C1363960lb8(viewTd, sharePanelViewModel, interfaceC1362600lYw, interfaceC897330ZId2);
    }
}
