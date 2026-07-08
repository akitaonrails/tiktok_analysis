package X;

import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.api.IAppContextManagerService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pipo.postpayment.impl.PostPaymentActionHostFragment;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uXK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public abstract class AbstractC1707560uXK implements InterfaceC1707610uXP {
    public static final Set<InterfaceC1548890qPP> LIZ = Collections.synchronizedSet(new LinkedHashSet());

    public abstract String LIZJ();

    public abstract void LJ(Context context, C1707140uWe c1707140uWe, C1211110hcb c1211110hcb, String str);

    @Override // X.InterfaceC1707610uXP
    public final boolean LIZIZ(C1707140uWe c1707140uWe) {
        String upperCase;
        String str = c1707140uWe.LIZ;
        if (str != null) {
            upperCase = str.toUpperCase(Locale.ROOT);
        } else {
            upperCase = null;
        }
        return Intrinsics.LJFF(upperCase, LIZJ());
    }

    public static void LJFF(Context context, C1707140uWe c1707140uWe, C1211110hcb c1211110hcb, String str) {
        String str2 = PostPaymentActionHostFragment._pnsPageId;
        String str3 = c1707140uWe.LIZJ;
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//pipo/post_payment/action_host");
        smartRouteBuildRoute.withParam("action_type", str);
        if (str3 != null) {
            smartRouteBuildRoute.withParam("material_content", str3);
        }
        String str4 = c1211110hcb.actionSessionId;
        if (str4 != null) {
            smartRouteBuildRoute.withParam("action_session_id", str4);
        }
        String str5 = c1211110hcb.pageName;
        if (str5 != null) {
            smartRouteBuildRoute.withParam("page_name", str5);
        }
        smartRouteBuildRoute.open();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [T, X.0qPP, X.0uXJ, java.lang.Object] */
    @Override // X.InterfaceC1707610uXP
    public final void LIZ(Context context, C1707140uWe c1707140uWe, final C1211110hcb c1211110hcb, final C1707590uXN c1707590uXN) {
        final String upperCase;
        Object c098200Yq;
        Context applicationContext = null;
        if (context == null) {
            IAppContextManagerService iAppContextManagerService = (IAppContextManagerService) PluggableExtentionKt.pluggableSpi$default(IAppContextManagerService.class, false, false, false, 14, null);
            if (iAppContextManagerService != null) {
                applicationContext = iAppContextManagerService.getApplicationContext();
            }
        } else {
            applicationContext = context;
        }
        if (applicationContext == null) {
            c1707590uXN.LIZ(new C1707530uXH(false, true, "missing_route_context"));
            return;
        }
        String str = c1707140uWe.LIZ;
        if (str == null || (upperCase = str.toUpperCase(Locale.ROOT)) == null) {
            upperCase = "";
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final C1548870qPN c1548870qPN = new C1548870qPN();
        final C259800zU c259800zU = new C259800zU();
        ?? r4 = new InterfaceC1548890qPP() { // from class: X.0uXJ
            /* JADX WARN: Removed duplicated region for block: B:33:0x006a  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x006e A[PHI: r8
              0x006e: PHI (r8v1 java.lang.String) = (r8v0 java.lang.String), (r8v2 java.lang.String) binds: [B:34:0x006c, B:31:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // X.InterfaceC1548890qPP
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onEvent(java.lang.String r10, java.lang.String r11) {
                /*
                    r9 = this;
                    org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L9
                    r1.<init>(r11)     // Catch: java.lang.Throwable -> L9
                    X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L9
                    goto L15
                L9:
                    r0 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                    X.00Yq r1 = new X.00Yq
                    r1.<init>(r0)
                    X.C189200o6.m2constructorimpl(r1)
                L15:
                    boolean r0 = X.C189200o6.m7isFailureimpl(r1)
                    r7 = 0
                    if (r0 == 0) goto L1d
                    r1 = r7
                L1d:
                    org.json.JSONObject r1 = (org.json.JSONObject) r1
                    if (r1 == 0) goto L3a
                    java.lang.String r0 = "action_type"
                    java.lang.String r2 = r1.optString(r0)
                L27:
                    r5 = 1
                    r6 = 0
                    if (r2 == 0) goto L3c
                    boolean r0 = kotlin.text.a0.LJJJIL(r2)
                    if (r0 != 0) goto L3c
                    java.lang.String r0 = r1
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
                    if (r0 != 0) goto L3c
                    return
                L3a:
                    r2 = r7
                    goto L27
                L3c:
                    if (r1 == 0) goto L6a
                    java.lang.String r0 = "action_session_id"
                    java.lang.String r2 = r1.optString(r0)
                    if (r2 == 0) goto L57
                    boolean r0 = kotlin.text.a0.LJJJIL(r2)
                    if (r0 != 0) goto L57
                    X.0hcb r0 = r2
                    java.lang.String r0 = r0.actionSessionId
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
                    if (r0 != 0) goto L57
                    return
                L57:
                    if (r1 == 0) goto L6a
                    java.lang.String r0 = "status"
                    java.lang.String r8 = r1.optString(r0)
                    if (r8 == 0) goto L6a
                    boolean r0 = kotlin.text.a0.LJJJIL(r8)
                    r0 = r0 ^ 1
                    if (r0 == 0) goto L6a
                    goto L6e
                L6a:
                    java.lang.String r8 = "completed"
                    if (r1 == 0) goto L87
                L6e:
                    java.lang.String r0 = "result"
                    boolean r0 = r1.optBoolean(r0, r5)
                    if (r0 != 0) goto L87
                    java.util.concurrent.atomic.AtomicBoolean r4 = r3
                    X.00zU<X.0qPP> r3 = r4
                    X.0uXR r2 = r5
                    X.0qPN r1 = r6
                    X.0uXH r0 = new X.0uXH
                    r0.<init>(r5, r6, r8)
                    X.AbstractC1707560uXK.LIZLLL(r4, r3, r2, r1, r0)
                    return
                L87:
                    java.util.concurrent.atomic.AtomicBoolean r4 = r3
                    X.00zU<X.0qPP> r3 = r4
                    X.0uXR r2 = r5
                    X.0qPN r1 = r6
                    X.0uXH r0 = new X.0uXH
                    r0.<init>(r5, r5, r7)
                    X.AbstractC1707560uXK.LIZLLL(r4, r3, r2, r1, r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1707550uXJ.onEvent(java.lang.String, java.lang.String):void");
            }
        };
        c259800zU.element = r4;
        LIZ.add((InterfaceC1548890qPP) r4);
        c1548870qPN.LJFF("pipo_post_payment_action_complete", r4);
        try {
            LJ(applicationContext, c1707140uWe, c1211110hcb, upperCase);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            LIZLLL(atomicBoolean, c259800zU, c1707590uXN, c1548870qPN, new C1707530uXH(true, false, "open_action_failed"));
        }
    }

    public static final void LIZLLL(AtomicBoolean atomicBoolean, C259800zU<InterfaceC1548890qPP> c259800zU, InterfaceC1707630uXR interfaceC1707630uXR, C1548870qPN c1548870qPN, C1707530uXH c1707530uXH) {
        if (!atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        InterfaceC1548890qPP interfaceC1548890qPP = c259800zU.element;
        if (interfaceC1548890qPP != null) {
            c1548870qPN.LJI("pipo_post_payment_action_complete", interfaceC1548890qPP);
            LIZ.remove(interfaceC1548890qPP);
        }
        interfaceC1707630uXR.LIZ(c1707530uXH);
    }
}
