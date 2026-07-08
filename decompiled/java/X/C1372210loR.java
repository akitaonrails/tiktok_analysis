package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bytedance.touchpoint.api.model.SharePanelInfo;
import com.ss.android.ugc.aweme.base.share.ShareOperationInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.specact.api.ISpecActService;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0loR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1372210loR {
    public static final C1372210loR LIZ = new C1372210loR();
    public static boolean LIZIZ;

    public static String LIZIZ() {
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getCoinShareTipCopy");
        ((ISpecActService) ServiceManager.get().getService(ISpecActService.class)).LJIJJLI();
        SharePanelInfo sharePanelInfoLJ = C1895800zQw.LJ();
        sbLIZ.append(sharePanelInfoLJ != null ? sharePanelInfoLJ.sharePanelText : null);
        C2188811AlT.LIZIZ(sbLIZ);
        ((ISpecActService) ServiceManager.get().getService(ISpecActService.class)).LJIJJLI();
        SharePanelInfo sharePanelInfoLJ2 = C1895800zQw.LJ();
        return (sharePanelInfoLJ2 == null || (str = sharePanelInfoLJ2.sharePanelText) == null) ? "" : str;
    }

    public static boolean LIZ(ShareOperationInfo shareOperationInfo) {
        ISpecActService iSpecActService = (ISpecActService) PluggableExtentionKt.pluggableSpi$default(ISpecActService.class, false, false, false, 14, null);
        if (iSpecActService != null) {
            iSpecActService.LJJLJ();
        }
        return false;
    }

    public static Drawable LIZJ(Context context) {
        ((ISpecActService) ServiceManager.get().getService(ISpecActService.class)).LJIJJLI();
        Bitmap bitmapLJFF = C1895800zQw.LJFF();
        if (bitmapLJFF != null) {
            return new BitmapDrawable(context.getResources(), bitmapLJFF);
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_color_coin_small;
        return c419910GdJ.LIZ(context);
    }

    public static boolean LIZLLL(ShareOperationInfo shareOperationInfo, boolean z) {
        ISpecActService iSpecActService = (ISpecActService) PluggableExtentionKt.pluggableSpi$default(ISpecActService.class, false, false, false, 14, null);
        if (iSpecActService != null) {
            iSpecActService.LJJLJ();
        }
        return false;
    }
}
