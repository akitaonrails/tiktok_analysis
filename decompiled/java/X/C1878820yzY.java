package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.touchpoint.api.touchpoint.ITouchPointModuleService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0yzY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1878820yzY {
    public static final C1878820yzY LIZ = new C1878820yzY();

    public static void LIZIZ(String str) {
        ITouchPointModuleService iTouchPointModuleService;
        if (str == null) {
            return;
        }
        String host = UriProtector.parse(str).getHost();
        if (host == null) {
            host = "";
        }
        if (!a0.LJJIIZI(host, "feed_support", false) && (iTouchPointModuleService = (ITouchPointModuleService) PluggableExtentionKt.pluggableSpi$default(ITouchPointModuleService.class, false, false, false, 14, null)) != null) {
            iTouchPointModuleService.LJFF();
        }
    }

    public static boolean LIZJ(Uri uri) {
        ITouchPointModuleService iTouchPointModuleService;
        boolean zBooleanValue = ((Boolean) C01U6.LJ(new AwS572S0100000_28(uri, 1094), Boolean.FALSE)).booleanValue();
        if (!zBooleanValue && (iTouchPointModuleService = (ITouchPointModuleService) PluggableExtentionKt.pluggableSpi$default(ITouchPointModuleService.class, false, false, false, 14, null)) != null) {
            iTouchPointModuleService.LJFF();
        }
        return zBooleanValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.0yzZ] */
    public static final void LIZ(final Context context, final Uri uri, final boolean z) {
        String string = uri.toString();
        LIZ.getClass();
        if (LIZJ(uri)) {
            AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
            if (abstractC1896090zRP != null && !abstractC1896090zRP.LJJIIJZLJL()) {
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//main");
                smartRouteBuildRoute.addFlags(67108864);
                smartRouteBuildRoute.addFlags(536870912);
                smartRouteBuildRoute.open();
            }
            ITouchPointModuleService iTouchPointModuleService = (ITouchPointModuleService) PluggableExtentionKt.pluggableSpi$default(ITouchPointModuleService.class, false, false, false, 14, null);
            if (iTouchPointModuleService != 0) {
                iTouchPointModuleService.LJJIII(uri.toString(), new InterfaceC1896280zRi() { // from class: X.0yzZ
                    @Override // X.InterfaceC1896280zRi
                    public final void onFail() {
                        String string2 = uri.buildUpon().scheme("aweme").build().toString();
                        C1878820yzY.LIZ.getClass();
                        C1878820yzY.LIZIZ(string2);
                        C1893370zN1 c1893370zN1 = (C1893370zN1) C1619720sFe.LIZ.LIZ(1003);
                        if (c1893370zN1 != null) {
                            c1893370zN1.LJIIL(context, string2, z);
                        }
                    }

                    @Override // X.InterfaceC1896280zRi
                    public final void onSuccess(String str) {
                        if (str == null || str.length() == 0) {
                            str = uri.buildUpon().scheme("aweme").build().toString();
                        }
                        C1878820yzY.LIZ.getClass();
                        C1878820yzY.LIZIZ(str);
                        C1893370zN1 c1893370zN1 = (C1893370zN1) C1619720sFe.LIZ.LIZ(1003);
                        if (c1893370zN1 != null) {
                            c1893370zN1.LJIIL(context, str, z);
                        }
                    }
                });
                return;
            }
            return;
        }
        SmartRouter.buildRoute(context, string).open();
    }
}
