package X;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0w7P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1768370w7P {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Throwable th, EnumC1771210wBz enumC1771210wBz, String str, Map map) {
        if (th != null) {
            C1AF0.LJI(th, "ecMixMallKit", C2097608Jq.LJIIIIZZ(new Pair("biz", "ecMixMallKit"), new Pair("msg", str)));
        }
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("code", Integer.valueOf(enumC1771210wBz.getCode())), new Pair("message", str));
        if (map != null) {
            mapLJIIJ.putAll(map);
        }
        C1768180w76.LIZ("rd_tiktokec_mix_mall_ensure_not_reach_here", null, mapLJIIJ, false);
    }
}
