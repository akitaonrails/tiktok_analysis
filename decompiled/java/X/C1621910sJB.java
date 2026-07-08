package X;

import com.ss.android.ugc.aweme.shortvideo.aigc.abtest.AIGCEffectPathRedesignExperiment;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import lnn.q;

/* JADX INFO: renamed from: X.0sJB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1621910sJB {
    public static final boolean LIZ(q qVar) {
        Effect effectLLILIL;
        if (!AIGCEffectPathRedesignExperiment.INSTANCE.isEnabled() || qVar == null || (effectLLILIL = qVar.C0().LLILIL()) == null || !C1449600npG.LJFF(effectLLILIL)) {
            return false;
        }
        return true;
    }
}
