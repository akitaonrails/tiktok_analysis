package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.06mA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1706006mA extends AbstractC1706106mB {
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077 A[Catch: all -> 0x008d, PHI: r2
      0x0077: PHI (r2v10 android.content.Context) = (r2v3 android.content.Context), (r2v11 android.content.Context) binds: [B:26:0x0075, B:6:0x000b] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x008d, blocks: (B:3:0x0001, B:5:0x0007, B:27:0x0077, B:28:0x007d, B:30:0x0081, B:32:0x0085, B:22:0x006c, B:25:0x0073, B:21:0x0061, B:7:0x000d, B:9:0x0013, B:14:0x003f, B:16:0x0047, B:17:0x004f, B:18:0x0054, B:13:0x002f), top: B:41:0x0001, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ() {
        /*
            r11 = this;
            r4 = 0
            X.0OvC r0 = r11.IBridgeSdkContext     // Catch: java.lang.Throwable -> L8d
            r7 = 1
            r1 = 0
            if (r0 == 0) goto Ld
            android.content.Context r2 = r0.getContext()     // Catch: java.lang.Throwable -> L8d
            if (r2 != 0) goto L77
        Ld:
            boolean r0 = X.C034S.LIZ()     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto L2f
            X.04Zw r0 = X.C1120604Zw.LIZ     // Catch: java.lang.Throwable -> L60
            r0.LIZ()     // Catch: java.lang.Throwable -> L60
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L60
            com.ss.android.ugc.aweme.framework.services.ServiceManager r2 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()     // Catch: java.lang.Throwable -> L60
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService> r0 = com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService.class
            java.lang.Object r3 = r2.getService(r0)     // Catch: java.lang.Throwable -> L60
            r2 = r3
            com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService r2 = (com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService) r2     // Catch: java.lang.Throwable -> L60
            if (r2 == 0) goto L2d
            r10 = 1
            goto L3f
        L2d:
            r10 = 0
            goto L3f
        L2f:
            X.04Zw r0 = X.C1120604Zw.LIZ     // Catch: java.lang.Throwable -> L60
            r0.LIZ()     // Catch: java.lang.Throwable -> L60
            X.04aq r2 = X.C1120604Zw.LIZJ     // Catch: java.lang.Throwable -> L60
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService> r0 = com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService.class
            X.0317 r3 = r2.LIZLLL(r0)     // Catch: java.lang.Throwable -> L60
            com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService r3 = (com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService) r3     // Catch: java.lang.Throwable -> L60
            goto L54
        L3f:
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService> r0 = com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService.class
            java.lang.String r8 = r0.getName()     // Catch: java.lang.Throwable -> L60
            if (r2 == 0) goto L5e
            java.lang.Class r0 = r2.getClass()     // Catch: java.lang.Throwable -> L60
            java.lang.String r9 = r0.getName()     // Catch: java.lang.Throwable -> L60
        L4f:
            X.C1AQS.LIZJ(r5, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L60
            com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService r3 = (com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService) r3     // Catch: java.lang.Throwable -> L60
        L54:
            com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService r3 = (com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService) r3     // Catch: java.lang.Throwable -> L60
            android.content.Context r2 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L60
            X.C189200o6.m2constructorimpl(r2)     // Catch: java.lang.Throwable -> L60
            goto L6c
        L5e:
            r9 = r1
            goto L4f
        L60:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L8d
            X.00Yq r2 = new X.00Yq     // Catch: java.lang.Throwable -> L8d
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L8d
            X.C189200o6.m2constructorimpl(r2)     // Catch: java.lang.Throwable -> L8d
        L6c:
            boolean r0 = X.C189200o6.m7isFailureimpl(r2)     // Catch: java.lang.Throwable -> L8d
            if (r0 == 0) goto L73
            r2 = r1
        L73:
            android.content.Context r2 = (android.content.Context) r2     // Catch: java.lang.Throwable -> L8d
            if (r2 == 0) goto L7d
        L77:
            java.lang.String r0 = "accessibility"
            java.lang.Object r1 = X.C786410Ut5.H2(r2, r0)     // Catch: java.lang.Throwable -> L8d
        L7d:
            boolean r0 = r1 instanceof android.view.accessibility.AccessibilityManager     // Catch: java.lang.Throwable -> L8d
            if (r0 == 0) goto L91
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1     // Catch: java.lang.Throwable -> L8d
            if (r1 == 0) goto L91
            boolean r0 = r1.isTouchExplorationEnabled()     // Catch: java.lang.Throwable -> L8d
            if (r0 != r7) goto L91
            r4 = 1
            return r4
        L8d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L91:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1706006mA.LIZJ():boolean");
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        try {
            int iIntValue = ((InterfaceC1706206mC) xBaseParamModel).getAccessibilityFeature().intValue();
            if (iIntValue == 1) {
                boolean zLIZJ = LIZJ();
                XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1706306mD.class, null);
                ((InterfaceC1706306mD) xBaseModelLIZJ).setOpen(Boolean.valueOf(zLIZJ));
                completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("unsupported accessibilityFeature: ");
            sbLIZ.append(iIntValue);
            C2382909Vj.LIZ(completionBlock, 0, C2188811AlT.LIZIZ(sbLIZ), null, 4);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("ecAccessibilityCheck error: ");
            sbLIZ2.append(th.getMessage());
            C2382909Vj.LIZ(completionBlock, 0, C2188811AlT.LIZIZ(sbLIZ2), null, 4);
        }
    }
}
