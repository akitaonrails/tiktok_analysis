package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: renamed from: X.11UL, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C11UL {
    public boolean downloaded;
    public final Effect effect;

    public boolean LIZIZ() {
        String effectId = this.effect.getEffectId();
        if (effectId == null) {
            return true;
        }
        try {
            return CastIntegerProtector.parseInt(effectId) < 0;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return true;
        }
    }

    public final boolean LIZ() {
        return LIZIZ() || this.downloaded;
    }

    public C11UL(Effect effect) {
        this.effect = effect;
    }
}
