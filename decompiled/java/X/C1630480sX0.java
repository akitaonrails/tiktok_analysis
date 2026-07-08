package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.effectmanager.effect.model.EffectLabelInReq;
import com.ss.ugc.effectplatform.model.whitelist.EffectWhiteListFeatureFlagStruct;
import com.ss.ugc.effectplatform.model.whitelist.EffectWhitelistFeatureFlagSceneStruct;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0sX0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1630480sX0 {
    public static final EffectWhiteListFeatureFlagStruct LIZ = new EffectWhiteListFeatureFlagStruct(new EffectWhitelistFeatureFlagSceneStruct(new EffectLabelInReq(null, C1697810uHb.LJIIJJI("3340", "3341", "8", "3343", "3344", "3345", "3346", "10"), null, 5, null), null, C1697810uHb.LJIIJJI("ai", "aiself", "create", "create_new", "games_1"), false, null, 26, null), new EffectWhitelistFeatureFlagSceneStruct(null, new EffectLabelInReq(null, Collections.singletonList("3352"), Collections.singletonList("3121"), 1, null), C1697810uHb.LJIIJJI("ai", "aiself", "create", "create_new", "photo_editing"), true, Collections.singletonList("3352"), 1, null), new EffectWhitelistFeatureFlagSceneStruct(new EffectLabelInReq(null, C1697810uHb.LJIIJJI("3340", "3341", "8", "10"), null, 5, null), new EffectLabelInReq(null, null, Collections.singletonList("3121"), 3, null), C1697810uHb.LJIIJJI("ai", "aiself", "create", "create_new", "games_1", "funny", "photo_editing"), true, null, 16, null));
    public static final Map<Integer, EffectWhitelistFeatureFlagSceneStruct> LIZIZ = C2097608Jq.LJIIIIZZ(new Pair(0, null), new Pair(1, LIZ().layout), new Pair(2, LIZ().duet), new Pair(4, LIZ().duetGreenScreen));

    public static final EffectWhiteListFeatureFlagStruct LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EffectWhiteListFeatureFlagStruct effectWhiteListFeatureFlagStruct = LIZ;
        EffectWhiteListFeatureFlagStruct effectWhiteListFeatureFlagStruct2 = (EffectWhiteListFeatureFlagStruct) settingsManagerLIZLLL.LJIIIIZZ("effect_allowlist_config", EffectWhiteListFeatureFlagStruct.class, effectWhiteListFeatureFlagStruct);
        return effectWhiteListFeatureFlagStruct2 != null ? effectWhiteListFeatureFlagStruct2 : effectWhiteListFeatureFlagStruct;
    }

    public static EffectLabelInReq LIZIZ(int i) {
        EffectWhitelistFeatureFlagSceneStruct effectWhitelistFeatureFlagSceneStruct = LIZIZ.get(Integer.valueOf(i));
        if (effectWhitelistFeatureFlagSceneStruct != null) {
            return effectWhitelistFeatureFlagSceneStruct.blacklistConfig;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c A[PHI: r2
      0x001c: PHI (r2v4 java.util.List<java.lang.String>) = (r2v0 java.util.List<java.lang.String>), (r2v5 java.util.List<java.lang.String>) binds: [B:7:0x0014, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0020 A[PHI: r1 r2
      0x0020: PHI (r1v0 java.util.List<java.lang.String>) = (r1v3 java.util.List<java.lang.String>), (r1v4 java.util.List<java.lang.String>) binds: [B:11:0x001e, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]
      0x0020: PHI (r2v1 java.util.List<java.lang.String>) = (r2v4 java.util.List<java.lang.String>), (r2v5 java.util.List<java.lang.String>) binds: [B:11:0x001e, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0026 A[PHI: r1 r2
      0x0026: PHI (r1v2 java.util.List<java.lang.String>) = (r1v0 java.util.List<java.lang.String>), (r1v3 java.util.List<java.lang.String>) binds: [B:13:0x0024, B:11:0x001e] A[DONT_GENERATE, DONT_INLINE]
      0x0026: PHI (r2v3 java.util.List<java.lang.String>) = (r2v1 java.util.List<java.lang.String>), (r2v4 java.util.List<java.lang.String>) binds: [B:13:0x0024, B:11:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016 A[PHI: r2
      0x0016: PHI (r2v5 java.util.List<java.lang.String>) = (r2v0 java.util.List<java.lang.String>), (r2v6 java.util.List<java.lang.String>) binds: [B:7:0x0014, B:5:0x0010] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.effectmanager.effect.model.EffectFilterReq LIZJ(int r4) {
        /*
            com.ss.android.ugc.effectmanager.effect.model.EffectLabelInReq r0 = LIZLLL(r4)
            com.ss.android.ugc.effectmanager.effect.model.EffectLabelInReq r4 = LIZIZ(r4)
            com.ss.android.ugc.effectmanager.effect.model.EffectFilterReq r3 = new com.ss.android.ugc.effectmanager.effect.model.EffectFilterReq
            if (r0 == 0) goto L12
            java.util.List r2 = r0.getV1Tags()
            if (r2 != 0) goto L16
        L12:
            X.13BV r2 = X.C13BV.INSTANCE
            if (r0 == 0) goto L1c
        L16:
            java.util.List r1 = r0.getV2Tags()
            if (r1 != 0) goto L20
        L1c:
            X.13BV r1 = X.C13BV.INSTANCE
            if (r0 == 0) goto L26
        L20:
            java.util.List r0 = r0.getPlatformTags()
            if (r0 != 0) goto L28
        L26:
            X.13BV r0 = X.C13BV.INSTANCE
        L28:
            r3.<init>(r2, r1, r0, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1630480sX0.LIZJ(int):com.ss.android.ugc.effectmanager.effect.model.EffectFilterReq");
    }

    public static EffectLabelInReq LIZLLL(int i) {
        EffectWhitelistFeatureFlagSceneStruct effectWhitelistFeatureFlagSceneStruct = LIZIZ.get(Integer.valueOf(i));
        if (effectWhitelistFeatureFlagSceneStruct != null) {
            return effectWhitelistFeatureFlagSceneStruct.whitelistConfig;
        }
        return null;
    }

    public static List LJ(int i) {
        List<String> list;
        EffectWhitelistFeatureFlagSceneStruct effectWhitelistFeatureFlagSceneStruct = LIZIZ.get(Integer.valueOf(i));
        if (effectWhitelistFeatureFlagSceneStruct == null || (list = effectWhitelistFeatureFlagSceneStruct.excludedCategoryKeys) == null) {
            return C13BV.INSTANCE;
        }
        return list;
    }
}
