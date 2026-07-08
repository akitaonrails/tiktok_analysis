package X;

import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.05Xe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1368405Xe implements InterfaceC1629850sVz<Effect> {
    public final HashMap<String, Integer> LIZ = new HashMap<>();
    public final HashMap<String, Integer> LIZIZ = new HashMap<>();
    public final HashMap<String, Integer> LIZJ = new HashMap<>();

    @Override // X.InterfaceC1629850sVz
    public final int Gp(Effect effect) {
        Integer num;
        Effect effect2 = effect;
        if (effect2 != null) {
            if (C1629100sUm.LJFF(effect2)) {
                Integer num2 = this.LIZ.get(effect2.getEffectId());
                if (num2 != null) {
                    return num2.intValue();
                }
            } else if (C1629100sUm.LIZLLL(effect2)) {
                Integer num3 = this.LIZIZ.get(effect2.getEffectId());
                if (num3 != null) {
                    return num3.intValue();
                }
            } else {
                Integer num4 = this.LIZ.get(effect2.getEffectId());
                if (num4 != null) {
                    return num4.intValue();
                }
                Integer num5 = this.LIZIZ.get(effect2.getEffectId());
                if (num5 != null) {
                    return num5.intValue();
                }
            }
            if (!TextUtils.isEmpty(effect2.getResourceId()) && (num = this.LIZJ.get(effect2.getResourceId())) != null) {
                return num.intValue();
            }
            return -1;
        }
        return -1;
    }

    @Override // X.InterfaceC1629850sVz
    public final void LIZ(int i, List list) {
        this.LIZIZ.clear();
        this.LIZJ.clear();
        this.LIZ.clear();
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1368305Xd(list, i, this, null), 3);
    }
}
