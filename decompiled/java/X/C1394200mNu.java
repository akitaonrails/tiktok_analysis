package X;

import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;

/* JADX INFO: renamed from: X.0mNu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1394200mNu implements InterfaceC1394190mNt {
    public static final C1394200mNu LIZ = new C1394200mNu();

    @Override // X.InterfaceC1394190mNt
    public final SmartRoute LIZ(Context context, String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aweme://stickers/detail?id=");
        sbLIZ.append(str);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, C2188811AlT.LIZIZ(sbLIZ));
        smartRouteBuildRoute.withParam("prop_page_enter_from", str2);
        return smartRouteBuildRoute;
    }
}
