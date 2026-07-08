package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.services.story.forward.ICelebrationCreateService;
import com.ss.android.ugc.aweme.story.celebration.CelebrationExitStrategy;
import com.ss.android.ugc.aweme.story.celebration.CelebrationParam;
import com.ss.android.ugc.aweme.story.celebration.CelebrationPosterInfo;
import com.ss.android.ugc.aweme.story.celebration.CelebrationStickerInfo;
import com.ss.android.ugc.aweme.story.celebration.CelebrationTemplateConfig;
import com.ss.android.ugc.aweme.story.celebration.ClickInboxEntranceParams;
import com.ss.android.ugc.aweme.story.celebration.create.CelebrationRequiredConfig;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0MQ9, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MQ9 implements InterfaceC567940MPg {
    public static final C0MQ9 LIZ = new C0MQ9();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(331));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(329));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(328));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(330));

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c3 A[PHI: r3
      0x00c3: PHI (r3v5 com.ss.android.ugc.aweme.story.celebration.create.CelebrationRequiredConfig) = 
      (r3v4 com.ss.android.ugc.aweme.story.celebration.create.CelebrationRequiredConfig)
      (r3v14 com.ss.android.ugc.aweme.story.celebration.create.CelebrationRequiredConfig)
     binds: [B:13:0x004a, B:20:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.story.celebration.create.CelebrationRequiredConfig LJIIL(int r22) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MQ9.LJIIL(int):com.ss.android.ugc.aweme.story.celebration.create.CelebrationRequiredConfig");
    }

    @Override // X.InterfaceC567940MPg
    public final CelebrationStickerInfo LIZ(int i) {
        CelebrationTemplateConfig celebrationTemplateConfig;
        CelebrationRequiredConfig celebrationRequiredConfigLJIIL = LJIIL(i);
        if (celebrationRequiredConfigLJIIL != null && (celebrationTemplateConfig = celebrationRequiredConfigLJIIL.templateConfig) != null) {
            return celebrationTemplateConfig.sticker;
        }
        return null;
    }

    @Override // X.InterfaceC567940MPg
    public final CelebrationTemplateConfig LIZLLL(int i) {
        CelebrationRequiredConfig celebrationRequiredConfigLJIIL = LJIIL(i);
        if (celebrationRequiredConfigLJIIL != null) {
            return celebrationRequiredConfigLJIIL.templateConfig;
        }
        return null;
    }

    @Override // X.InterfaceC567940MPg
    public final void LJFF(List<CelebrationParam> list) {
        if (list != null && !list.isEmpty()) {
            for (CelebrationParam celebrationParam : list) {
                ((Keva) LIZLLL.getValue()).storeBoolean(String.valueOf(celebrationParam.celebrationType), celebrationParam.useAwemeCache);
            }
        }
    }

    @Override // X.InterfaceC567940MPg
    public final CelebrationExitStrategy LJI(int i) {
        CelebrationRequiredConfig celebrationRequiredConfigLJIIL = LJIIL(i);
        if (celebrationRequiredConfigLJIIL != null) {
            return celebrationRequiredConfigLJIIL.exitStrategy;
        }
        return null;
    }

    @Override // X.InterfaceC567940MPg
    public final CelebrationPosterInfo LJIIIIZZ(int i) {
        CelebrationTemplateConfig celebrationTemplateConfig;
        CelebrationRequiredConfig celebrationRequiredConfigLJIIL = LJIIL(i);
        if (celebrationRequiredConfigLJIIL != null && (celebrationTemplateConfig = celebrationRequiredConfigLJIIL.templateConfig) != null) {
            return celebrationTemplateConfig.poster;
        }
        return null;
    }

    @Override // X.InterfaceC567940MPg
    public final boolean LJIIIZ(int i) {
        return ((Keva) LIZLLL.getValue()).getBoolean(String.valueOf(i), false);
    }

    @Override // X.InterfaceC567940MPg
    public final void LJIIJJI(int i) {
        C0MTE.LIZ.getClass();
        C0MTE.LIZIZ(i);
    }

    @Override // X.InterfaceC567940MPg
    public final boolean LIZIZ(int i, int i2) {
        if (!C1601110rld.LIZ()) {
            return false;
        }
        if (!LIZJ(i, null) && i2 < 1) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC567940MPg
    public final boolean LIZJ(int i, Integer num) {
        boolean z;
        int i2;
        int iIntValue;
        boolean z2;
        CelebrationPosterInfo celebrationPosterInfoLJIIIIZZ = LJIIIIZZ(i);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("celebrationType = ");
        sbLIZ.append(i);
        sbLIZ.append(", enable poster = ");
        if (celebrationPosterInfoLJIIIIZZ != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(", material size enable poster = ");
        if (celebrationPosterInfoLJIIIIZZ != null) {
            i2 = celebrationPosterInfoLJIIIIZZ.maxMaterialsToShowPoster;
        } else {
            i2 = 0;
        }
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        if (i2 >= iIntValue) {
            z2 = true;
        } else {
            z2 = false;
        }
        sbLIZ.append(z2);
        C2188811AlT.LIZIZ(sbLIZ);
        if (celebrationPosterInfoLJIIIIZZ == null) {
            return false;
        }
        if (num == null || celebrationPosterInfoLJIIIIZZ.maxMaterialsToShowPoster >= num.intValue()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC567940MPg
    public final boolean LJ(int i, int i2) {
        if (i2 <= 1) {
            return true;
        }
        return LIZJ(i, Integer.valueOf(i2));
    }

    @Override // X.InterfaceC567940MPg
    public final boolean LJII(int i, int i2, boolean z) {
        CelebrationExitStrategy celebrationExitStrategy;
        int i3;
        CelebrationRequiredConfig celebrationRequiredConfigLJIIL = LJIIL(i);
        if (celebrationRequiredConfigLJIIL != null) {
            celebrationExitStrategy = celebrationRequiredConfigLJIIL.exitStrategy;
        } else {
            celebrationExitStrategy = null;
        }
        boolean zContains = true;
        if (celebrationExitStrategy == null) {
            if (z) {
                C0MTE.LIZ.getClass();
                C0MTE.LIZIZ(i);
            }
            return true;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                List<Integer> list = celebrationExitStrategy.exitScenes;
                if (list == null || (zContains = list.contains(2))) {
                }
                return zContains;
            }
            return false;
        }
        List<Integer> list2 = celebrationExitStrategy.exitScenes;
        if (list2 == null || list2.contains(1)) {
            ClickInboxEntranceParams clickInboxEntranceParams = celebrationExitStrategy.clickInboxEntranceParams;
            if (clickInboxEntranceParams != null) {
                i3 = clickInboxEntranceParams.clickExpireNatureDays;
            } else {
                i3 = 0;
            }
            C0MTE.LIZ.getClass();
            if (i3 != 0) {
                long j = ((Keva) C0MTE.LIZJ.getValue()).getLong(C0MTE.LIZ(i), -1L);
                if (j == -1 || TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis() - j) < i3) {
                    return false;
                }
            }
        } else {
            return false;
        }
        if (z) {
            C0MTE.LIZ.getClass();
            C0MTE.LIZIZ(i);
        }
        return zContains;
    }

    @Override // X.InterfaceC567940MPg
    public final void LJIIJ(int i, CelebrationTemplateConfig celebrationTemplateConfig, CelebrationExitStrategy celebrationExitStrategy) {
        if (celebrationTemplateConfig != null && celebrationTemplateConfig.templatePrefix.length() > 0) {
            if (celebrationExitStrategy == null) {
                celebrationExitStrategy = new CelebrationExitStrategy(Collections.singletonList(2), null);
            }
            CelebrationRequiredConfig celebrationRequiredConfig = new CelebrationRequiredConfig(celebrationTemplateConfig, celebrationExitStrategy);
            List<Integer> todayCelebrationList = ((ICelebrationCreateService) LJ.getValue()).getTodayCelebrationList();
            if (todayCelebrationList != null && todayCelebrationList.contains(Integer.valueOf(i))) {
                ((ConcurrentHashMap) LIZIZ.getValue()).put(String.valueOf(i), celebrationRequiredConfig);
            }
            Keva keva = (Keva) LIZJ.getValue();
            String strValueOf = String.valueOf(i);
            C1227904rF.LIZ.getClass();
            keva.storeString(strValueOf, C1227904rF.LJI(celebrationRequiredConfig));
        }
    }
}
