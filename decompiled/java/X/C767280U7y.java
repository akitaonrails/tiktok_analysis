package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.p;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0U7y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C767280U7y {
    public static final void LIZ(LiveEffect liveEffect) {
        boolean zLJ;
        boolean zLJ2;
        Unit unit;
        String strLJIL;
        boolean z;
        try {
            new p();
            n nVarLJIILIIL = p.LIZJ(liveEffect.getExtra()).LJIILIIL();
            k kVarLJJIIZ = nVarLJIILIIL.LJJIIZ("is_none");
            if (kVarLJJIIZ != null) {
                zLJ = kVarLJJIIZ.LJ();
            } else {
                zLJ = false;
            }
            liveEffect.LJJLL(zLJ);
            k kVarLJJIIZ2 = nVarLJIILIIL.LJJIIZ("enable_gender_difference");
            if (kVarLJJIIZ2 != null) {
                zLJ2 = kVarLJJIIZ2.LJ();
            } else {
                zLJ2 = false;
            }
            liveEffect.LJJJJJL(zLJ2);
            k kVarLJJIIZ3 = nVarLJIILIIL.LJJIIZ("beautyConfig");
            if (kVarLJJIIZ3 != null && (strLJIL = kVarLJJIIZ3.LJIL()) != null) {
                new p();
                List<LiveEffect.ComposerConfig> list = (List) C19748512Ol.LIZIZ.LIZLLL(p.LIZJ(strLJIL).LJIILIIL().LJJIIZI("items"), new TypeToken<List<? extends LiveEffect.ComposerConfig>>() { // from class: X.0U7z
                }.getType());
                for (LiveEffect.ComposerConfig composerConfig : list) {
                    liveEffect.LLIZLLLIL(composerConfig.tag);
                    int i = composerConfig.minValue;
                    if (i < 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        composerConfig.LIZJ = 50;
                        composerConfig.LIZLLL = -50;
                    } else {
                        composerConfig.LIZJ = 100;
                        composerConfig.LIZLLL = 0;
                    }
                    float f = 100;
                    composerConfig.LJ = composerConfig.maxValue / f;
                    composerConfig.LJFF = i / f;
                    composerConfig.LIZIZ = (int) ((composerConfig.defaultValue / (r3 - i)) * (composerConfig.LIZJ - composerConfig.LIZLLL));
                }
                liveEffect.LJLJI(list);
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static final void LIZIZ(LiveEffect liveEffect) {
        boolean zLJ;
        Unit unit;
        String strLJIL;
        boolean z;
        try {
            new p();
            n nVarLJIILIIL = p.LIZJ(liveEffect.getExtra()).LJIILIIL();
            k kVarLJJIIZ = nVarLJIILIIL.LJJIIZ("is_none");
            if (kVarLJJIIZ != null) {
                zLJ = kVarLJJIIZ.LJ();
            } else {
                zLJ = false;
            }
            liveEffect.LJJLL(zLJ);
            k kVarLJJIIZ2 = nVarLJIILIIL.LJJIIZ("filterconfig");
            if (kVarLJJIIZ2 != null && (strLJIL = kVarLJJIIZ2.LJIL()) != null) {
                new p();
                List<LiveEffect.ComposerConfig> list = (List) C19748512Ol.LIZIZ.LIZLLL(p.LIZJ(strLJIL).LJIILIIL().LJJIIZI("items"), new TypeToken<List<? extends LiveEffect.ComposerConfig>>() { // from class: X.0U80
                }.getType());
                for (LiveEffect.ComposerConfig composerConfig : list) {
                    liveEffect.LLIZLLLIL(composerConfig.tag);
                    int i = composerConfig.minValue;
                    if (i < 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        composerConfig.LIZJ = 50;
                        composerConfig.LIZLLL = -50;
                    } else {
                        composerConfig.LIZJ = 100;
                        composerConfig.LIZLLL = 0;
                    }
                    float f = 100;
                    composerConfig.LJ = composerConfig.maxValue / f;
                    composerConfig.LJFF = i / f;
                    composerConfig.LIZIZ = (int) ((composerConfig.defaultValue / (r3 - i)) * (composerConfig.LIZJ - composerConfig.LIZLLL));
                }
                liveEffect.LJLJI(list);
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
