package X;

import android.graphics.Rect;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.12Kr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19738712Kr {
    public static final /* synthetic */ int LIZ = 0;

    public static C19738612Kq LIZ(C19738412Ko c19738412Ko, FoldingFeature foldingFeature) {
        C19738812Ks c19738812Ks;
        C19380710s1 c19380710s1;
        int type = foldingFeature.getType();
        if (type != 1) {
            if (type != 2) {
                return null;
            }
            c19738812Ks = C19738812Ks.LIZJ;
        } else {
            c19738812Ks = C19738812Ks.LIZIZ;
        }
        int state = foldingFeature.getState();
        if (state != 1) {
            if (state != 2) {
                return null;
            }
            c19380710s1 = C19380710s1.LIZJ;
        } else {
            c19380710s1 = C19380710s1.LIZIZ;
        }
        C19738512Kp c19738512Kp = new C19738512Kp(foldingFeature.getBounds());
        Rect rectLIZ = c19738412Ko.LIZ();
        if (c19738512Kp.LIZLLL - c19738512Kp.LIZIZ == 0 && c19738512Kp.LIZJ - c19738512Kp.LIZ == 0) {
            return null;
        }
        if (c19738512Kp.LIZJ - c19738512Kp.LIZ != rectLIZ.width() && c19738512Kp.LIZLLL - c19738512Kp.LIZIZ != rectLIZ.height()) {
            return null;
        }
        if (c19738512Kp.LIZJ - c19738512Kp.LIZ < rectLIZ.width() && c19738512Kp.LIZLLL - c19738512Kp.LIZIZ < rectLIZ.height()) {
            return null;
        }
        if (c19738512Kp.LIZJ - c19738512Kp.LIZ == rectLIZ.width() && c19738512Kp.LIZLLL - c19738512Kp.LIZIZ == rectLIZ.height()) {
            return null;
        }
        return new C19738612Kq(new C19738512Kp(foldingFeature.getBounds()), c19738812Ks, c19380710s1);
    }

    public static C0N9B LIZIZ(C19738412Ko c19738412Ko, WindowLayoutInfo windowLayoutInfo) {
        C19738612Kq c19738612KqLIZ;
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            if ((foldingFeature instanceof FoldingFeature) && (c19738612KqLIZ = LIZ(c19738412Ko, foldingFeature)) != null) {
                arrayList.add(c19738612KqLIZ);
            }
        }
        return new C0N9B(arrayList);
    }
}
