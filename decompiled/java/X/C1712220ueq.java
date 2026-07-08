package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CVVHintInfo;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.RawTextAndIcon;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0ueq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1712220ueq {
    public static final C1712220ueq LIZ = new C1712220ueq();

    public static void LIZ(Context context, String str, C1709570uaZ c1709570uaZ, Function0 function0) {
        CVVHintInfo cVVHintInfo;
        if (str != null && !a0.LJJJIL(str)) {
            if (Intrinsics.LJFF(str, "aweme://pipo/cashier/cvv_local")) {
                RawTextAndIcon rawTextAndIconLJJIIZI = c1709570uaZ.LJJIIZI();
                if (rawTextAndIconLJJIIZI != null && (cVVHintInfo = rawTextAndIconLJJIIZI.cvvHintInfo) != null) {
                    C0HTI c0hti = new C0HTI();
                    c0hti.LIZ = R.drawable.vk;
                    C1397580mTM c1397580mTM = new C1397580mTM(context);
                    c1397580mTM.LJI(cVVHintInfo.title);
                    c1397580mTM.LIZIZ(cVVHintInfo.content);
                    LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{c0hti.LIZ(context)});
                    layerDrawable.setLayerInsetTop(0, C1722120uuo.LIZJ(20));
                    C1391820mK4.LIZIZ(c1397580mTM, layerDrawable);
                    c1397580mTM.LJIIIIZZ = false;
                    C985403tE.LIZ(c1397580mTM, new AwS392S0200000_26(cVVHintInfo, (CVVHintInfo) function0, (Function0<Unit>) 102));
                    new C1397510mTF(c1397580mTM).LJ();
                    return;
                }
                return;
            }
            C1714410uiN.LIZLLL(C1714410uiN.LIZ, context, str, null, false, null, c1709570uaZ.LJIIZILJ, null, null, null, 956);
        }
    }
}
