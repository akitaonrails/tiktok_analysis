package X;

import android.content.Context;
import android.net.Uri;
import android.util.Size;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Kpx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C529670Kpx implements InterfaceC529880KqI {
    /* JADX WARN: Type inference failed for: r1v2, types: [REQUEST, X.0kbR] */
    public static void LIZIZ(C1322110kVd c1322110kVd, Context context, Uri uri, Size size, InterfaceC529900KqK interfaceC529900KqK) {
        InterfaceC1320850kTb controller;
        if (uri == null) {
            uri = UriProtector.parse("file://");
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(uri);
        sbLIZ.append("?resize=");
        sbLIZ.append(size.getWidth());
        sbLIZ.append('x');
        sbLIZ.append(size.getHeight());
        C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ)));
        c1325700kbQLIZLLL.LJ = C1324670kZl.LJ;
        c1325700kbQLIZLLL.LIZJ = new C1324630kZh(size.getWidth(), size.getHeight());
        ?? LIZ = c1325700kbQLIZLLL.LIZ();
        C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
        if (c1322110kVd != null) {
            controller = c1322110kVd.getController();
        } else {
            controller = null;
        }
        c1320810kTXLIZJ.LJIILJJIL = controller;
        c1320810kTXLIZJ.LIZLLL = LIZ;
        c1320810kTXLIZJ.LJIIIIZZ = new C581310Mr3(interfaceC529900KqK, 0);
        AbstractC1320710kTN abstractC1320710kTNLIZ = c1320810kTXLIZJ.LIZ();
        if (c1322110kVd != null) {
            c1322110kVd.setController(abstractC1320710kTNLIZ);
            C1331070kk5 hierarchy = c1322110kVd.getHierarchy();
            if (hierarchy != null) {
                hierarchy.LJIJ(C800330VaR.LIZIZ(context, R.drawable.a49), 1);
            }
        }
    }

    @Override // X.InterfaceC529880KqI
    public final void LIZ(C529750Kq5 c529750Kq5, Size size, TikTokMediaModel tikTokMediaModel, InterfaceC529900KqK interfaceC529900KqK, boolean z) {
        LIZIZ(c529750Kq5.LL, c529750Kq5.itemView.getContext(), C2471909mP.LJIILIIL(tikTokMediaModel.LJFF()), size, interfaceC529900KqK);
    }
}
