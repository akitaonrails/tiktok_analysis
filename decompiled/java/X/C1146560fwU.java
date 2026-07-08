package X;

import android.content.Context;
import com.bytedance.android.live.browser.IHybridContainerService;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0fwU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1146560fwU {
    public static final boolean LIZ(C1146350fw9 c1146350fw9, Context context) {
        IHybridContainerService iHybridContainerService;
        if (context == null) {
            return false;
        }
        String str = c1146350fw9.LLJILLL;
        if (!(!a0.LJJJIL(str)) || str == null || (iHybridContainerService = (IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)) == null) {
            return false;
        }
        iHybridContainerService.YC1(context, str, null);
        return true;
    }
}
