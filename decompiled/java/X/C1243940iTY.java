package X;

import android.os.SystemClock;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.util.EcInboxTabConfig;
import com.ss.android.ugc.aweme.ecommerce.dependency.account.AccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS207S0000000_19;

/* JADX INFO: renamed from: X.0iTY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1243940iTY {
    public static final C1243940iTY LIZ = new C1243940iTY();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(804));
    public static final ConcurrentHashMap<String, EcInboxTabConfig> LIZJ = new ConcurrentHashMap<>();

    public final synchronized EcInboxTabConfig LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("inbox_tabs_cache_key_");
        sbLIZ.append(LIZLLL());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        EcInboxTabConfig ecInboxTabConfig = LIZJ.get(strLIZIZ);
        if (ecInboxTabConfig != null) {
            return ecInboxTabConfig;
        }
        EcInboxTabConfig ecInboxTabConfig2 = null;
        String string = ((Keva) LIZIZ.getValue()).getString(strLIZIZ, null);
        if (string != null) {
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, string, (c1121904a9LIZIZ == null || !c1121904a9LIZIZ.LJII) ? new TypeToken<EcInboxTabConfig>() { // from class: X.0iTU
                }.getType() : C2371409Qy.LIZJ(C13LE.LJII(EcInboxTabConfig.class)));
                if (!(objFromJson instanceof EcInboxTabConfig)) {
                    objFromJson = null;
                }
                ecInboxTabConfig2 = (EcInboxTabConfig) objFromJson;
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return ecInboxTabConfig2;
    }

    public static String LIZLLL() {
        AnonymousClass0317 anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, IAccountDependencyService.class.getName(), anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
        }
        return ((IAccountDependencyService) anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin).getUserId();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.ecommerce.base.messagecenter.util.EcInboxTabConfig> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C1243930iTX
            if (r0 == 0) goto L21
            r5 = r7
            X.0iTX r5 = (X.C1243930iTX) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L2f
            if (r0 != r2) goto L27
            goto L48
        L21:
            X.0iTX r5 = new X.0iTX
            r5.<init>(r6, r7)
            goto L12
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2f:
            X.C155000ia.LIZIZ(r4)
            r5.LLILLL = r2     // Catch: java.lang.Exception -> L78
            X.0vfq r0 = X.InterfaceC1243950iTZ.LIZ     // Catch: java.lang.Exception -> L78
            r0.getClass()     // Catch: java.lang.Exception -> L78
            X.01GW<X.0iTZ> r0 = X.C1751280vfq.LIZIZ     // Catch: java.lang.Exception -> L78
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L78
            X.0iTZ r0 = (X.InterfaceC1243950iTZ) r0     // Catch: java.lang.Exception -> L78
            java.lang.Object r4 = r0.LIZ(r5)     // Catch: java.lang.Exception -> L78
            if (r4 != r1) goto L4b
            return r1
        L48:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Exception -> L78
        L4b:
            com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api.CreatorPermissionResponse r4 = (com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api.CreatorPermissionResponse) r4     // Catch: java.lang.Exception -> L78
            java.util.Map<java.lang.String, java.lang.String> r1 = r4.extra     // Catch: java.lang.Exception -> L78
            if (r1 == 0) goto L75
            java.lang.String r0 = "is_new_design"
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Exception -> L78
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L78
        L59:
            boolean r0 = r4.isEcPermission     // Catch: java.lang.Exception -> L78
            if (r0 == 0) goto L6e
            java.lang.String r0 = "true"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)     // Catch: java.lang.Exception -> L78
            if (r0 == 0) goto L6e
            com.ss.android.ugc.aweme.ecommerce.base.messagecenter.util.EcInboxTabConfig r1 = new com.ss.android.ugc.aweme.ecommerce.base.messagecenter.util.EcInboxTabConfig     // Catch: java.lang.Exception -> L78
            r1.<init>(r2)     // Catch: java.lang.Exception -> L78
        L6a:
            r6.LJ(r1)     // Catch: java.lang.Exception -> L78
            goto L77
        L6e:
            com.ss.android.ugc.aweme.ecommerce.base.messagecenter.util.EcInboxTabConfig r1 = new com.ss.android.ugc.aweme.ecommerce.base.messagecenter.util.EcInboxTabConfig     // Catch: java.lang.Exception -> L78
            r0 = 0
            r1.<init>(r0)     // Catch: java.lang.Exception -> L78
            goto L6a
        L75:
            r1 = r3
            goto L59
        L77:
            return r1
        L78:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.C1AF0.LJ(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1243940iTY.LIZ(X.05Vn):java.lang.Object");
    }

    public final synchronized void LJ(EcInboxTabConfig ecInboxTabConfig) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("inbox_tabs_cache_key_");
        sbLIZ.append(LIZLLL());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        LIZJ.put(strLIZIZ, ecInboxTabConfig);
        ((Keva) LIZIZ.getValue()).storeString(strLIZIZ, C1741890vQh.LJIIIIZZ(ecInboxTabConfig));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC497601wk r6, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.ecommerce.base.messagecenter.util.EcInboxTabConfig> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C1243920iTW
            if (r0 == 0) goto L40
            r4 = r7
            X.0iTW r4 = (X.C1243920iTW) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L40
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILLL
            r0 = 1
            if (r1 == 0) goto L23
            if (r1 != r0) goto L46
            X.C155000ia.LIZIZ(r3)
        L22:
            return r3
        L23:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.ecommerce.base.messagecenter.util.EcInboxTabConfig r3 = r5.LIZIZ()
            if (r3 == 0) goto L37
            X.0iTT r2 = new X.0iTT
            r1 = 0
            r2.<init>(r1)
            r0 = 3
            X.C23250099c.LIZIZ(r6, r1, r1, r2, r0)
            return r3
        L37:
            r4.LLILLL = r0
            java.lang.Object r3 = r5.LIZ(r4)
            if (r3 != r2) goto L22
            return r2
        L40:
            X.0iTW r4 = new X.0iTW
            r4.<init>(r5, r7)
            goto L12
        L46:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1243940iTY.LIZJ(X.01wk, X.05Vn):java.lang.Object");
    }
}
