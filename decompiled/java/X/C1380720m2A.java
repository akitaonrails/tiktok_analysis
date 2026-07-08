package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.AwS230S0300000_21;

/* JADX INFO: renamed from: X.0m2A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1380720m2A {
    public static String LIZ;
    public static UrlModel LIZIZ;
    public static String LIZJ;
    public static String LIZLLL = "live_share_card.png";

    public static void LIZ(final Context context, final AwS230S0300000_21 awS230S0300000_21) {
        final C1380730m2B c1380730m2B = new C1380730m2B(context);
        c1380730m2B.LLILZLL = new InterfaceC1380740m2C() { // from class: X.0m29
            @Override // X.InterfaceC1380740m2C
            public final void LLJJIJIIJIL() {
            }

            @Override // X.InterfaceC1380740m2C
            public final void LJIJJLI() {
                C1380730m2B c1380730m2B2 = c1380730m2B;
                Context context2 = context;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("");
                sbLIZ2.append(System.currentTimeMillis());
                sbLIZ.append(C08HM.LIZJ(C2188811AlT.LIZIZ(sbLIZ2)));
                sbLIZ.append(".png");
                C1380720m2A.LIZLLL = C2188811AlT.LIZIZ(sbLIZ);
                C1380720m2A.LIZJ = C786410Ut5.w2(context2).getAbsolutePath();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(C1380720m2A.LIZJ);
                String str = C1380720m2A.LIZJ;
                sbLIZ3.append((str == null || C13LN.LJLLL(str) != '/') ? "/live_share" : "live_share");
                C1380720m2A.LIZJ = C2188811AlT.LIZIZ(sbLIZ3);
                c1380730m2B2.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                c1380730m2B2.layout(0, 0, c1380730m2B2.getMeasuredWidth(), c1380730m2B2.getMeasuredHeight());
                int measuredWidth = c1380730m2B2.getMeasuredWidth();
                int measuredHeight = c1380730m2B2.getMeasuredHeight();
                if (measuredWidth <= 0 || measuredHeight <= 0) {
                    return;
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                C842150X1x.LIZIZ(new Canvas(bitmapCreateBitmap), c1380730m2B2);
                if (bitmapCreateBitmap == null || !BitmapUtils.saveBitmapToSD(bitmapCreateBitmap, C1380720m2A.LIZJ, C1380720m2A.LIZLLL)) {
                    return;
                }
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(C1380720m2A.LIZJ);
                sbLIZ4.append('/');
                sbLIZ4.append(C1380720m2A.LIZLLL);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
                if (strLIZIZ != null) {
                    awS230S0300000_21.invoke(strLIZIZ);
                }
            }
        };
        String str = LIZ;
        UrlModel urlModel = LIZIZ;
        c1380730m2B.LLILZ = str;
        c1380730m2B.LLILZIL = urlModel;
        if (str != null) {
            TuxTextView liveShareUserNameFromXml = c1380730m2B.getLiveShareUserNameFromXml();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('@');
            sbLIZ.append(c1380730m2B.LLILZ);
            liveShareUserNameFromXml.setText(C2188811AlT.LIZIZ(sbLIZ));
        }
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(c1380730m2B.LLILZIL));
        c1331670kl3LJIIIIZZ.LIZLLL("LiveShareCodeView");
        c1331670kl3LJIIIIZZ.LJJIJL(c1380730m2B.LL);
        c1331670kl3LJIIIIZZ.LJIL = Bitmap.Config.ARGB_8888;
        c1331670kl3LJIIIIZZ.LJJII(new C1401760ma6(c1380730m2B, 1));
    }
}
