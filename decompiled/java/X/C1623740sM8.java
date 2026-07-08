package X;

import com.ss.android.ugc.aweme.shortvideo.aigc.AigcStateHolder;
import com.ss.android.ugc.aweme.shortvideo.aigc.abtest.AIGCEffectPathRedesignExperiment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sM8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1623740sM8 {
    public static void LIZ(C0TBE c0tbe) {
        if (!AIGCEffectPathRedesignExperiment.INSTANCE.isEnabled()) {
            return;
        }
        AigcStateHolder.LIZLLL().LIZJ(c0tbe);
    }

    public final void onEvent(C1457700o2K c1457700o2K) {
        String str;
        C0V0J c0v0j = c1457700o2K.LIZ;
        if (c0v0j instanceof C0V0L) {
            LIZ(new C0TBF(((C0V0L) c0v0j).LIZIZ, 1));
            return;
        }
        if (c0v0j instanceof C0V0I) {
            T tLJI = AigcStateHolder.LIZLLL().LIZIZ().LJI();
            if (Intrinsics.LJFF(tLJI, new C0T60(0))) {
                str = "generation_page";
            } else if (Intrinsics.LJFF(tLJI, new C0TBF(false, 3))) {
                str = "count_down_page";
            } else {
                str = null;
            }
            LIZ(new C0TBD(str, true, 1));
            return;
        }
        if (c0v0j instanceof C0V0H) {
            if (((C0V0H) c0v0j).LIZIZ || !AIGCEffectPathRedesignExperiment.INSTANCE.isEnabled()) {
                return;
            }
            AigcStateHolder.LIZLLL().LIZ();
            return;
        }
        if (c0v0j instanceof C0V0K) {
            LIZ(C0TBG.LIZ);
            return;
        }
        throw new C1954807lC();
    }
}
