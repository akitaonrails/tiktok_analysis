package X;

import android.os.SystemClock;
import android.widget.ImageView;
import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.dependency.HybridDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.hybrid.IHybridDependencyService;
import java.io.File;
import kotlin.jvm.internal.AwS602S0100000_23;

/* JADX INFO: renamed from: X.0paC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1517140paC {
    public static final C1517140paC LIZ = new C1517140paC();

    public static boolean LIZ() {
        AnonymousClass0317 anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin;
        if ("tiktok_gec_search_native_resource".length() == 0) {
            return false;
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin = HybridDependencyService.createIHybridDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, IHybridDependencyService.class.getName(), anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IHybridDependencyService.class);
        }
        return ((IHybridDependencyService) anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin).isGeckoBundleExists("tiktok_gec_search_native_resource");
    }

    public static void LIZIZ(C1517140paC c1517140paC, ImageView imageView, String str) {
        AnonymousClass0317 anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin;
        AnonymousClass0317 anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin2;
        boolean z;
        boolean z2;
        String name;
        c1517140paC.getClass();
        if (imageView != null && str.length() != 0) {
            String name2 = null;
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin = HybridDependencyService.createIHybridDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String name3 = IHybridDependencyService.class.getName();
                if (anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin != null) {
                    name = anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name3, name, z2);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IHybridDependencyService.class);
            }
            if (!((IHybridDependencyService) anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin).isGeckoBundleExists("tiktok_gec_search_native_resource")) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Gecko bundle not found: channel=");
                sbLIZ.append("tiktok_gec_search_native_resource");
                C2188811AlT.LIZIZ(sbLIZ);
                return;
            }
            try {
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin2 = HybridDependencyService.createIHybridDependencyServicebyMonsterPlugin(false);
                    if (anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin2 != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    String name4 = IHybridDependencyService.class.getName();
                    if (anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin2 != null) {
                        name2 = anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin2.getClass().getName();
                    }
                    C1AQS.LIZJ(jElapsedRealtime2, 1, name4, name2, z);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IHybridDependencyService.class);
                }
                Forest forestProvider = ((IHybridDependencyService) anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin2).getForestProvider();
                RequestParams requestParams = new RequestParams(EnumC1533980q1M.OTHER);
                requestParams.disableCdn = true;
                requestParams.consumeType = File.class;
                requestParams.channel = "tiktok_gec_search_native_resource";
                requestParams.bundle = str;
                forestProvider.fetchResourceAsync("", requestParams, new AwS602S0100000_23(imageView, 86));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Exception loading from Forest: ");
                sbLIZ2.append(e.getMessage());
                C2188811AlT.LIZIZ(sbLIZ2);
            }
        }
    }
}
