package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import com.bytedance.common.utility.BitmapUtils;

/* JADX INFO: renamed from: X.0lu4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1375700lu4 {
    public static Uri LIZIZ(C19EG c19eg, Bitmap bitmap) {
        String strLJIILLIIL = C2427709fH.LJIILLIIL(c19eg);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("");
        sbLIZ2.append(System.currentTimeMillis());
        sbLIZ.append(C08HM.LIZJ(C2188811AlT.LIZIZ(sbLIZ2)));
        sbLIZ.append(".png");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (BitmapUtils.saveBitmapToSD(bitmap, strLJIILLIIL, strLIZIZ)) {
            return C2203008k8.LIZ(c19eg, new C0VSJ(strLJIILLIIL, strLIZIZ));
        }
        return null;
    }

    public static void LIZ(Context context, View view, C11FQ c11fq, boolean z, boolean z2, C1373600lqg c1373600lqg) {
        Activity activityLJII = C1375500ltk.LJII(context);
        if (activityLJII != null) {
            if (c11fq != null && c11fq.LLILLL) {
                if (view != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("");
                    sbLIZ2.append(System.currentTimeMillis());
                    sbLIZ.append(C08HM.LIZJ(C2188811AlT.LIZIZ(sbLIZ2)));
                    sbLIZ.append(".png");
                    C1375710lu5 c1375710lu5LIZIZ = C19286910ct.LIZIZ.LIZIZ(view, z2, C2188811AlT.LIZIZ(sbLIZ));
                    if (c1375710lu5LIZIZ != null) {
                        if (z) {
                            C1389890mGx c1389890mGx = new C1389890mGx(activityLJII);
                            c1389890mGx.LJIIIZ(2131846801);
                            c1389890mGx.LJIIJJI();
                        }
                        C844470XAv.LIZ.getClass();
                        view.announceForAccessibility(C844470XAv.LIZ().getString(2131846801));
                        boolean z3 = c1375710lu5LIZIZ.LIZJ;
                        if (z3) {
                            String str = c1375710lu5LIZIZ.LIZIZ;
                            if (str != null && c1373600lqg != null) {
                                c1373600lqg.LIZ(null, str, z3);
                                return;
                            }
                            return;
                        }
                        Uri uri = c1375710lu5LIZIZ.LIZ;
                        if (uri == null || c1373600lqg == null) {
                            return;
                        }
                        c1373600lqg.LIZ(uri, null, z3);
                        return;
                    }
                    return;
                }
                return;
            }
            C1389890mGx c1389890mGx2 = new C1389890mGx(activityLJII);
            c1389890mGx2.LJIIJ(activityLJII.getString(2131832374));
            c1389890mGx2.LJIIJJI();
        }
    }
}
