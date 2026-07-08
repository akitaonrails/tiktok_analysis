package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.091h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23047091h {
    public static final C23047091h LIZ = new C23047091h();
    public static final Map<Integer, C23049091j> LIZIZ = new LinkedHashMap();
    public static final Map<Integer, C23049091j> LIZJ = new LinkedHashMap();

    /* JADX WARN: Removed duplicated region for block: B:24:0x0048 A[PHI: r4
      0x0048: PHI (r4v5 java.util.Set) = (r4v0 java.util.Set), (r4v6 java.util.Set) binds: [B:23:0x0046, B:21:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054 A[PHI: r4
      0x0054: PHI (r4v1 java.util.Set) = (r4v0 java.util.Set), (r4v5 java.util.Set), (r4v5 java.util.Set) binds: [B:23:0x0046, B:25:0x004c, B:27:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058 A[PHI: r2 r4
      0x0058: PHI (r2v3 java.util.Set) = (r2v0 java.util.Set), (r2v4 java.util.Set) binds: [B:29:0x0056, B:27:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x0058: PHI (r4v4 java.util.Set) = (r4v1 java.util.Set), (r4v5 java.util.Set) binds: [B:29:0x0056, B:27:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0064 A[PHI: r2 r4
      0x0064: PHI (r2v1 java.util.Set) = (r2v0 java.util.Set), (r2v3 java.util.Set), (r2v3 java.util.Set) binds: [B:29:0x0056, B:31:0x005c, B:33:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0064: PHI (r4v2 java.util.Set) = (r4v1 java.util.Set), (r4v4 java.util.Set), (r4v4 java.util.Set) binds: [B:29:0x0056, B:31:0x005c, B:33:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(java.lang.String r8, int r9, int r10, X.EnumC2005207tK r11) {
        /*
            r3 = 1
            if (r10 != 0) goto L4
            return r3
        L4:
            int r0 = r11.ordinal()
            if (r0 == 0) goto La9
            if (r0 != r3) goto Lbe
            java.util.Map<java.lang.Integer, X.091j> r7 = X.C23047091h.LIZJ
        Le:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            java.lang.Object r6 = r7.get(r0)
            X.091j r6 = (X.C23049091j) r6
            if (r6 != 0) goto L74
            r0 = -1
            if (r10 != r0) goto L97
            com.bytedance.ies.abmock.SettingsManager r4 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            java.lang.Class<com.ss.android.ugc.effectmanager.effect.model.EffectLabelInReq> r2 = com.ss.android.ugc.effectmanager.effect.model.EffectLabelInReq.class
            com.ss.android.ugc.effectmanager.effect.model.EffectLabelInReq r1 = X.C1630490sX1.LIZ
            java.lang.String r0 = "reset_effect_allowlist"
            java.lang.Object r0 = r4.LJIIIIZZ(r0, r2, r1)
            com.ss.android.ugc.effectmanager.effect.model.EffectLabelInReq r0 = (com.ss.android.ugc.effectmanager.effect.model.EffectLabelInReq) r0
            if (r0 == 0) goto L30
            r1 = r0
        L30:
            java.util.List r5 = X.C1630480sX0.LJ(r10)
            X.091j r6 = new X.091j
            if (r1 == 0) goto L44
            java.util.List r0 = r1.getV1Tags()
            if (r0 == 0) goto L44
            java.util.Set r4 = X.C13LP.LLIIJI(r0)
            if (r4 != 0) goto L48
        L44:
            X.08CX r4 = X.C08CX.INSTANCE
            if (r1 == 0) goto L54
        L48:
            java.util.List r0 = r1.getV2Tags()
            if (r0 == 0) goto L54
            java.util.Set r2 = X.C13LP.LLIIJI(r0)
            if (r2 != 0) goto L58
        L54:
            X.08CX r2 = X.C08CX.INSTANCE
            if (r1 == 0) goto L64
        L58:
            java.util.List r0 = r1.getPlatformTags()
            if (r0 == 0) goto L64
            java.util.Set r1 = X.C13LP.LLIIJI(r0)
            if (r1 != 0) goto L66
        L64:
            X.08CX r1 = X.C08CX.INSTANCE
        L66:
            java.util.Set r0 = X.C13LP.LLIIJI(r5)
            r6.<init>(r4, r2, r1, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r7.put(r0, r6)
        L74:
            if (r9 == r3) goto L94
            r0 = 2
            if (r9 == r0) goto L91
            r0 = 3
            if (r9 == r0) goto L8e
            X.08CX r1 = X.C08CX.INSTANCE
        L7e:
            int r0 = r11.ordinal()
            if (r0 == 0) goto Lb3
            if (r0 != r3) goto Lad
            boolean r0 = r1.contains(r8)
            if (r0 == 0) goto L8d
            r3 = 0
        L8d:
            return r3
        L8e:
            java.util.Set<java.lang.String> r1 = r6.LIZJ
            goto L7e
        L91:
            java.util.Set<java.lang.String> r1 = r6.LIZIZ
            goto L7e
        L94:
            java.util.Set<java.lang.String> r1 = r6.LIZ
            goto L7e
        L97:
            int r0 = r11.ordinal()
            if (r0 == 0) goto La4
            if (r0 != r3) goto Lb8
            com.ss.android.ugc.effectmanager.effect.model.EffectLabelInReq r1 = X.C1630480sX0.LIZIZ(r10)
            goto L30
        La4:
            com.ss.android.ugc.effectmanager.effect.model.EffectLabelInReq r1 = X.C1630480sX0.LIZLLL(r10)
            goto L30
        La9:
            java.util.Map<java.lang.Integer, X.091j> r7 = X.C23047091h.LIZIZ
            goto Le
        Lad:
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        Lb3:
            boolean r3 = r1.contains(r8)
            return r3
        Lb8:
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        Lbe:
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23047091h.LIZ(java.lang.String, int, int, X.07tK):boolean");
    }
}
