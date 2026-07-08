package X;

import android.view.ViewStub;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0cc3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1018570cc3 {
    public static void LIZ(C19EG c19eg) {
        C1035340d36 c1035340d36LIZIZ;
        C1030050cuZ popUpWebBottomSheetFromXml;
        C1035340d36 c1035340d36LIZIZ2 = LIZIZ(c19eg);
        if (c1035340d36LIZIZ2 != null && c1035340d36LIZIZ2.LJIIJJI() && (c1035340d36LIZIZ = LIZIZ(c19eg)) != null && c1035340d36LIZIZ.LJIIJJI() && (popUpWebBottomSheetFromXml = c1035340d36LIZIZ.getPopUpWebBottomSheetFromXml()) != null) {
            popUpWebBottomSheetFromXml.LJIJJLI();
        }
    }

    public static C1035340d36 LIZIZ(C19EG c19eg) {
        C1035340d36 c1035340d36;
        FrameLayout frameLayoutLIZJ = LIZJ(c19eg);
        if (frameLayoutLIZJ != null) {
            c1035340d36 = (C1035340d36) frameLayoutLIZJ.findViewById(R.id.a8s);
        } else {
            c1035340d36 = null;
        }
        if (!(c1035340d36 instanceof C1035340d36)) {
            return null;
        }
        return c1035340d36;
    }

    public static FrameLayout LIZJ(C19EG c19eg) {
        if (c19eg == null) {
            return null;
        }
        ViewStub viewStub = (ViewStub) c19eg.findViewById(R.id.a8q);
        if (viewStub != null && viewStub.getParent() != null) {
            return (FrameLayout) C786410Ut5.LJLLLL(viewStub);
        }
        if (c19eg == null) {
            return null;
        }
        return (FrameLayout) c19eg.findViewById(R.id.a8p);
    }
}
