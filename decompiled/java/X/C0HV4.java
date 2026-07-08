package X;

import android.util.Size;
import com.ss.android.ugc.aweme.ecommerce.base.selector.model.TikTokMediaModel;

/* JADX INFO: renamed from: X.0HV4, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HV4 {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Type inference failed for: r2v1, types: [REQUEST, X.0kbR] */
    public static void LIZ(C1322110kVd c1322110kVd, TikTokMediaModel tikTokMediaModel, Size size) {
        InterfaceC1320850kTb controller;
        C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(C2471909mP.LJIILIIL(tikTokMediaModel.LJFF()));
        c1325700kbQLIZLLL.LIZJ = new C1324630kZh(size.getWidth(), size.getHeight());
        ?? LIZ2 = c1325700kbQLIZLLL.LIZ();
        C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
        if (c1322110kVd != null) {
            controller = c1322110kVd.getController();
        } else {
            controller = null;
        }
        c1320810kTXLIZJ.LJIILJJIL = controller;
        c1320810kTXLIZJ.LIZLLL = LIZ2;
        AbstractC1320710kTN abstractC1320710kTNLIZ = c1320810kTXLIZJ.LIZ();
        if (c1322110kVd != null) {
            c1322110kVd.setController(abstractC1320710kTNLIZ);
        }
    }
}
