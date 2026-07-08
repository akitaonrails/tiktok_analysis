package X;

import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.OrderListPreLoad;
import com.ss.android.ugc.aweme.ecommerce.dependency.launcher.LauncherDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.launcher.ILauncherDependencyService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.13uf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20161513uf {
    public static void LIZ(Integer num, final AwS605S0100000_26 awS605S0100000_26) {
        AnonymousClass0317 anonymousClass0317CreateILauncherDependencyServicebyMonsterPlugin;
        boolean z;
        String name;
        int iIntValue = 0;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateILauncherDependencyServicebyMonsterPlugin = LauncherDependencyService.createILauncherDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateILauncherDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = ILauncherDependencyService.class.getName();
            if (anonymousClass0317CreateILauncherDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateILauncherDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateILauncherDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILauncherDependencyService.class);
        }
        ((ILauncherDependencyService) anonymousClass0317CreateILauncherDependencyServicebyMonsterPlugin).initPowerPreload();
        Bundle bundle = new Bundle();
        if (num != null) {
            iIntValue = num.intValue();
        }
        bundle.putInt("tab", iIntValue);
        C1524605y0.LIZ().LIZ(bundle, OrderListPreLoad.class, new InterfaceC1726310v1Z() { // from class: X.0vaH
            @Override // X.InterfaceC1726310v1Z
            public final void LIZ(Exception exc) {
                new C1747820vaG().LJIIIZ(0, "/api/v1/trade/list_order/get");
                Function1<String, Unit> function1 = awS605S0100000_26;
                if (function1 != null) {
                    function1.invoke(null);
                }
            }

            @Override // X.InterfaceC1726310v1Z
            public final void onSuccess(Object obj) {
                Object obj2;
                TypedByteArray typedByteArray;
                byte[] bytes;
                C0X52 c0x52;
                new C1747820vaG().LJIIIZ(1, "/api/v1/trade/list_order/get");
                if ((obj instanceof C0X52) && (c0x52 = (C0X52) obj) != null) {
                    obj2 = c0x52.LIZIZ;
                } else {
                    obj2 = null;
                }
                if ((obj2 instanceof TypedByteArray) && (typedByteArray = (TypedByteArray) obj2) != null && (bytes = typedByteArray.getBytes()) != null) {
                    String str = new String(bytes, Charsets.UTF_8);
                    Function1<String, Unit> function1 = awS605S0100000_26;
                    if (function1 != null) {
                        function1.invoke(str);
                        return;
                    }
                    return;
                }
                C1AF0.LIZJ("OrderListPreLoad response body TypedByteArray convert error");
                Function1<String, Unit> function12 = awS605S0100000_26;
                if (function12 == null) {
                    return;
                }
                function12.invoke(null);
            }
        }, Boolean.FALSE);
    }
}
