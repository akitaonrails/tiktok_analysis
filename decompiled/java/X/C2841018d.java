package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.android.live.browser.IHybridContainerService;
import java.util.Map;

/* JADX INFO: renamed from: X.018d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2841018d {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context context, String str, Map map) {
        int iLJIILLIIL = (int) (((double) C497740JfY.LJIILLIIL()) * 0.7d);
        int iLJJI = (int) C497740JfY.LJJI(C497740JfY.LJIIZILJ());
        C760370TsB c760370TsBLIZ = C0KYL.LIZ(str);
        EnumC760350Ts9 enumC760350Ts9 = EnumC760350Ts9.DP;
        c760370TsBLIZ.LJIIIZ(iLJIILLIIL, enumC760350Ts9);
        c760370TsBLIZ.LJJ(iLJJI, enumC760350Ts9);
        c760370TsBLIZ.LJIJI(8, enumC760350Ts9);
        c760370TsBLIZ.LJJII(map);
        c760370TsBLIZ.LJIIIIZZ("bottom");
        Uri uriLIZ = c760370TsBLIZ.LIZ();
        IHybridContainerService iHybridContainerService = (IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class);
        if (iHybridContainerService != null) {
            iHybridContainerService.YC1(context, uriLIZ.toString(), null);
        }
    }
}
