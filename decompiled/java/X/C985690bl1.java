package X;

import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchBeansSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchCatchBeansMetricsToggleSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchGamePerformanceThreshold;
import com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0bl1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C985690bl1 {
    public static float LIZJ;
    public static int LJ;
    public static final Set<String> LJFF;
    public static final C985690bl1 LIZ = new C985690bl1();
    public static final String LIZIZ = LiveMatchBeansSettings.INSTANCE.getCatchBeansResourceID();
    public static final int LIZLLL = 1;

    static {
        if (LiveMatchCatchBeansMetricsToggleSettings.INSTANCE.isEnable()) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C981770beh(null), 3);
        }
        LJFF = new LinkedHashSet();
    }

    public static boolean LIZJ() {
        float f = LIZJ;
        if (f > 0.0f) {
            return f >= LiveMatchGamePerformanceThreshold.INSTANCE.getMatchGamePerformanceThreshold();
        }
        InterfaceC1101100elA interfaceC1101100elAOK1 = ((IHostPerformanceMonitor) C1161920gLG.LIZJ(IHostPerformanceMonitor.class)).OK1();
        float fLJ = interfaceC1101100elAOK1.LJ();
        LIZJ = fLJ;
        return fLJ < 0.0f || interfaceC1101100elAOK1.LJ() >= LiveMatchGamePerformanceThreshold.INSTANCE.getMatchGamePerformanceThreshold();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r7, X.InterfaceC1364105Vn<? super java.lang.Long> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C985710bl3
            if (r0 == 0) goto L49
            r5 = r8
            X.0bl3 r5 = (X.C985710bl3) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L49
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r1 = 1
            if (r0 == 0) goto L2d
            if (r0 != r1) goto L7c
            X.C155000ia.LIZIZ(r4)
        L22:
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r4 = (com.bytedance.android.livesdkapi.depend.model.LiveEffect) r4
            r2 = 0
            if (r4 == 0) goto L77
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r4.LIZJ
            if (r0 == 0) goto L72
            goto L4f
        L2d:
            X.C155000ia.LIZIZ(r4)
            java.lang.Class<com.bytedance.android.live.effect.api.IEffectService> r0 = com.bytedance.android.live.effect.api.IEffectService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.effect.api.IEffectService r0 = (com.bytedance.android.live.effect.api.IEffectService) r0
            X.0UEA r2 = r0.getLiveEffectController()
            r5.LLILLL = r1
            java.lang.String r1 = "interaction_games"
            java.lang.String r0 = "all"
            java.lang.Object r4 = r2.LIZJ(r7, r1, r0, r5)
            if (r4 != r3) goto L22
            return r3
        L49:
            X.0bl3 r5 = new X.0bl3
            r5.<init>(r6, r8)
            goto L12
        L4f:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = r0.getSdkExtra()     // Catch: java.lang.Throwable -> L69
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = "live_minigame"
            org.json.JSONObject r1 = r1.optJSONObject(r0)     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = "version_code"
            java.lang.String r0 = r1.optString(r0)     // Catch: java.lang.Throwable -> L69
            long r2 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)     // Catch: java.lang.Throwable -> L69
            goto L6d
        L69:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L6d:
            java.lang.Long r0 = X.C2286608xc.LJFF(r2)
            return r0
        L72:
            java.lang.Long r0 = X.C2286608xc.LJFF(r2)
            return r0
        L77:
            java.lang.Long r0 = X.C2286608xc.LJFF(r2)
            return r0
        L7c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C985690bl1.LIZ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r7, X.InterfaceC1364105Vn<? super java.lang.Boolean> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C985700bl2
            if (r0 == 0) goto L53
            r5 = r8
            X.0bl2 r5 = (X.C985700bl2) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L53
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r4 = r5.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r1 = 1
            if (r0 == 0) goto L35
            if (r0 != r1) goto L65
            X.0UEA r2 = r5.LL
            X.C155000ia.LIZIZ(r4)
        L24:
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r4 = (com.bytedance.android.livesdkapi.depend.model.LiveEffect) r4
            if (r4 == 0) goto L5f
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r4.LIZJ
            if (r0 == 0) goto L59
            boolean r0 = r2.LIZIZ(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L35:
            X.C155000ia.LIZIZ(r4)
            java.lang.Class<com.bytedance.android.live.effect.api.IEffectService> r0 = com.bytedance.android.live.effect.api.IEffectService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.effect.api.IEffectService r0 = (com.bytedance.android.live.effect.api.IEffectService) r0
            X.0UEA r2 = r0.getLiveEffectController()
            r5.LL = r2
            r5.LLILZ = r1
            java.lang.String r1 = "interaction_games"
            java.lang.String r0 = "all"
            java.lang.Object r4 = r2.LIZJ(r7, r1, r0, r5)
            if (r4 != r3) goto L24
            return r3
        L53:
            X.0bl2 r5 = new X.0bl2
            r5.<init>(r6, r8)
            goto L12
        L59:
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L5f:
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L65:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C985690bl1.LIZIZ(java.lang.String, X.05Vn):java.lang.Object");
    }
}
