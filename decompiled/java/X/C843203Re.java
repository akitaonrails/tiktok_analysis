package X;

import android.app.Activity;
import android.os.SystemClock;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.dependency.ActivityStackDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.activitystack.IActivityStackDependencyService;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03Re, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C843203Re extends AbstractC843703Rj {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        boolean z;
        AnonymousClass0317 anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin;
        InterfaceC497601wk lifecycleScope;
        C03R6 c03r6;
        C03R4 c03r4;
        boolean z2;
        String name;
        InterfaceC843603Ri interfaceC843603Ri = (InterfaceC843603Ri) xBaseParamModel;
        C03RV.LIZ.getClass();
        boolean zLIZ = C03RU.LIZ();
        boolean zLIZ2 = C03XD.LIZ();
        int iIntValue = 0;
        if (!zLIZ && !zLIZ2) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC843903Rl.class, null), "");
            return;
        }
        if (Intrinsics.LJFF(interfaceC843603Ri.getClearCache(), Boolean.TRUE)) {
            boolean z3 = C843303Rf.LIZ;
            C843303Rf.LIZ(1);
        } else {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = ActivityStackDependencyService.createIActivityStackDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String name2 = IActivityStackDependencyService.class.getName();
                if (anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null) {
                    name = anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z2);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IActivityStackDependencyService.class);
            }
            Activity topActivity = ((IActivityStackDependencyService) anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin).getTopActivity();
            if (!(topActivity instanceof SparkActivity) || topActivity == null) {
                return;
            }
            AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(interfaceC843603Ri, 1516);
            LifecycleOwner lifecycleOwnerLIZ = C843803Rk.LIZ(topActivity);
            if (lifecycleOwnerLIZ == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerLIZ)) == null) {
                lifecycleScope = C817503Hh.LL;
            }
            String pageName = interfaceC843603Ri.getPageName();
            String source = interfaceC843603Ri.getSource();
            C03RX c03rx = new C03RX(pageName, source);
            boolean zLIZ3 = C03RU.LIZ();
            boolean zLIZ4 = C03XD.LIZ();
            if ((zLIZ3 || zLIZ4) && C03U5.LIZJ()) {
                C03R6 c03r62 = (C03R6) awS545S0100000_1.invoke();
                if (zLIZ3 && c03r62 != null) {
                    if (source != null) {
                        ((ArrayList) C843303Rf.LJFF).add(source);
                        ConcurrentHashMap<String, Integer> concurrentHashMap = C843303Rf.LJ;
                        Integer num = concurrentHashMap.get(source);
                        if (num != null) {
                            iIntValue = num.intValue();
                        }
                        concurrentHashMap.put(source, Integer.valueOf(iIntValue + 1));
                    }
                    C03WX c03wxLIZ = C857103Wn.LIZ((String) C03RV.LIZJ.getValue());
                    if (c03r62 instanceof BillInfoRequest) {
                        c03r4 = C03RV.LJ;
                    } else {
                        c03r4 = C03RV.LIZLLL;
                    }
                    c03r6 = c03r62;
                    C03R4.LIZIZ(c03r4, c03r62, lifecycleScope, c03wxLIZ, 0L, 1, c03rx, null, null, null, 896);
                } else {
                    c03r6 = c03r62;
                }
                if (zLIZ4) {
                    C035Q.LIZ(new AwS580S0100000_1(c03rx, c03r6, 940));
                }
            }
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC843903Rl.class, null), "");
    }
}
