package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.RouteIntent;
import com.ss.android.ugc.tiktok.security.settings.BostonRouterGatewayModel;
import com.ss.android.ugc.tiktok.security.settings.BostonVirtualRouterModel;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.19Fh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21508319Fh implements InterfaceC21508919Fn {
    public BostonVirtualRouterModel LIZ;

    public static boolean LJ(RouteIntent routeIntent, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(routeIntent.getHost());
        sbLIZ.append(routeIntent.getPath());
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(C2188811AlT.LIZIZ(sbLIZ), new String[]{"/"}, 0, 6);
        List listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL(str, new String[]{"/"}, 0, 6);
        int size = listLJJLIIIJILLIZJL2.size();
        for (int i = 0; i < size; i++) {
            if (i >= listLJJLIIIJILLIZJL.size()) {
                return false;
            }
            String str2 = (String) ListProtector.get(listLJJLIIIJILLIZJL2, i);
            if (Intrinsics.LJFF(str2, "*")) {
                return true;
            }
            if (!u.LJJIIJZLJL(str2, ":", false) && !Intrinsics.LJFF(str2, ListProtector.get(listLJJLIIIJILLIZJL, i))) {
                return false;
            }
        }
        return true;
    }

    public final BostonVirtualRouterModel LIZLLL(RouteIntent routeIntent, BostonRouterGatewayModel bostonRouterGatewayModel, String str) {
        boolean z;
        Map<String, BostonVirtualRouterModel> map;
        BostonVirtualRouterModel bostonVirtualRouterModel;
        String strLIZ;
        String strLIZ2;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || routeIntent == null || (map = bostonRouterGatewayModel.LIZ) == null || (bostonVirtualRouterModel = map.get(str)) == null || !LJ(routeIntent, bostonVirtualRouterModel.routerName)) {
            return null;
        }
        Map<String, String> map2 = bostonVirtualRouterModel.routerParams;
        if (map2 != null) {
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                Uri uri = routeIntent.getUri();
                if (uri != null) {
                    strLIZ = C416901jj.LIZ(uri, key);
                } else {
                    strLIZ = null;
                }
                if (!Intrinsics.LJFF(strLIZ, value)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("getVirtualRouters: router params not match config-> ");
                    sbLIZ.append(key);
                    sbLIZ.append(':');
                    sbLIZ.append(value);
                    sbLIZ.append(", router: ");
                    sbLIZ.append(key);
                    sbLIZ.append(':');
                    Uri uri2 = routeIntent.getUri();
                    if (uri2 != null) {
                        strLIZ2 = C416901jj.LIZ(uri2, key);
                    } else {
                        strLIZ2 = null;
                    }
                    sbLIZ.append(strLIZ2);
                    C2188811AlT.LIZIZ(sbLIZ);
                    return null;
                }
            }
        }
        this.LIZ = bostonVirtualRouterModel;
        return bostonVirtualRouterModel;
    }

    public final boolean LJFF(RouteIntent routeIntent, BostonRouterGatewayModel bostonRouterGatewayModel, List<String> list) {
        String str;
        for (String str2 : list) {
            if (LJ(routeIntent, str2)) {
                return true;
            }
            if (LIZLLL(routeIntent, bostonRouterGatewayModel, str2) != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("matchRouterInternal: match virtual router: ");
                sbLIZ.append(str2);
                sbLIZ.append(", virtualRouter: ");
                BostonVirtualRouterModel bostonVirtualRouterModel = this.LIZ;
                if (bostonVirtualRouterModel != null) {
                    str = bostonVirtualRouterModel.routerName;
                } else {
                    str = null;
                }
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
                return true;
            }
        }
        return false;
    }
}
