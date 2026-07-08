package X;

import android.app.Dialog;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0h8U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1192440h8U {
    public static final C1192440h8U LIZ = new C1192440h8U();
    public static final ConcurrentHashMap<String, Integer> LIZIZ = new ConcurrentHashMap<>();

    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ() {
        /*
            java.lang.Class<com.ss.android.ugc.aweme.IAccountService> r0 = com.ss.android.ugc.aweme.IAccountService.class
            r1 = 0
            r4 = 14
            r5 = 0
            r2 = r1
            r3 = r1
            java.lang.Object r2 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L3f
            com.ss.android.ugc.aweme.IAccountService r2 = (com.ss.android.ugc.aweme.IAccountService) r2     // Catch: java.lang.Throwable -> L3f
            if (r2 == 0) goto L1e
            com.ss.android.ugc.aweme.AccountUserService r0 = r2.LJIIJ()     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L1e
            boolean r1 = r0.isLogin()     // Catch: java.lang.Throwable -> L3f
            r0 = 1
            if (r1 != r0) goto L1e
            goto L1f
        L1e:
            r0 = 0
        L1f:
            if (r0 == 0) goto L2a
            com.ss.android.ugc.aweme.AccountUserService r0 = r2.LJIIJ()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r2 = r0.getCurUserId()     // Catch: java.lang.Throwable -> L3f
            goto L2f
        L2a:
            java.lang.String r2 = com.ss.android.common.applog.AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId()     // Catch: java.lang.Throwable -> L3f
        L2f:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r0 = "privacy auth key: "
            r1.append(r0)     // Catch: java.lang.Throwable -> L3f
            r1.append(r2)     // Catch: java.lang.Throwable -> L3f
            X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L3f
            return r2
        L3f:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1192440h8U.LIZ():java.lang.String");
    }

    public static boolean LIZIZ() {
        String strLIZ = LIZ();
        if (strLIZ == null) {
            return false;
        }
        Integer num = LIZIZ.get(strLIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("get authStatus: ");
        sbLIZ.append(num);
        C2188811AlT.LIZIZ(sbLIZ);
        return num == null || num.intValue() != EnumC993230bxB.AUTHORIZED.getValue();
    }

    public static void LIZLLL(Integer num) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("try save authStatus: ");
        sbLIZ.append(num);
        C2188811AlT.LIZIZ(sbLIZ);
        if (num != null) {
            int iIntValue = num.intValue();
            LIZ.getClass();
            String strLIZ = LIZ();
            if (strLIZ != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("save authStatus: ");
                sbLIZ2.append(num);
                C2188811AlT.LIZIZ(sbLIZ2);
                LIZIZ.put(strLIZ, Integer.valueOf(iIntValue));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0h8T] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0h8V] */
    public static void LIZJ(String str, final Fragment fragment, PoiDetailApi.PrivacyPopupModel privacyPopupModel, Map map) {
        InterfaceC1192480h8Y interfaceC1192480h8Y;
        if (fragment == null) {
            return;
        }
        if (Intrinsics.LJFF(str, "poi_detail")) {
            interfaceC1192480h8Y = new InterfaceC1192480h8Y() { // from class: X.0h8W
                @Override // X.InterfaceC1192480h8Y
                public final void LIZ(Fragment fragment2, C1192450h8V c1192450h8V, InterfaceC20661315t5 interfaceC20661315t5) {
                    C2197301AzA.LIZ.getClass();
                    C2197301AzA.LIZLLL(fragment2, c1192450h8V, interfaceC20661315t5);
                }
            };
        } else {
            interfaceC1192480h8Y = new InterfaceC1192480h8Y() { // from class: X.0h8X
                @Override // X.InterfaceC1192480h8Y
                public final void LIZ(Fragment fragment2, C1192450h8V c1192450h8V, InterfaceC20661315t5 interfaceC20661315t5) {
                    PopupManager.LJIJI(c1192450h8V, true);
                }
            };
        }
        final ?? r2 = new InterfaceC20660615sy() { // from class: X.0h8T
            @Override // X.InterfaceC20660615sy
            public final boolean t2() {
                return true;
            }

            @Override // X.InterfaceC20658015sY
            public final boolean Xu() {
                return fragment.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED);
            }

            @Override // X.InterfaceC20658015sY
            public final C688120Qyw i2() {
                Context context = fragment.getContext();
                if (context != null) {
                    return new C688120Qyw(context, fragment, null);
                }
                return null;
            }

            @Override // X.InterfaceC20658015sY
            public final String getSceneId() {
                return C634060Otw.LIZ(this);
            }
        };
        final AwS384S0200000_18 awS384S0200000_18 = new AwS384S0200000_18(privacyPopupModel, (PoiDetailApi.PrivacyPopupModel) map, (Map<String, ? extends Object>) 0);
        interfaceC1192480h8Y.LIZ(fragment, new AbstractC20660115st<Dialog>(r2, awS384S0200000_18) { // from class: X.0h8V
            public final Function1<C688120Qyw, Dialog> LL;

            @Override // X.InterfaceC20660515sx
            public final int getPriority() {
                return 20;
            }

            @Override // com.bytedance.poplayer.IPopupTask
            public final Object showPopup(C688120Qyw c688120Qyw) {
                return this.LL.invoke(c688120Qyw);
            }

            {
                this.LL = awS384S0200000_18;
            }
        }, null);
    }
}
