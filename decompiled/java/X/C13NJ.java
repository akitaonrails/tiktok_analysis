package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.13NJ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13NJ {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final String[] LIZJ;
    public boolean LIZLLL;

    public final boolean LIZ(Effect effect) {
        if (effect == null) {
            return false;
        }
        if (!C13LQ.LJIILLIIL(effect.getPanel(), this.LIZJ) || !this.LIZ || !this.LIZLLL) {
            return false;
        }
        return true;
    }

    public final boolean LIZIZ(Effect effect) {
        if (effect == null) {
            return false;
        }
        if (!C13LQ.LJIILLIIL(effect.getPanel(), this.LIZJ) || !this.LIZIZ) {
            return false;
        }
        return true;
    }

    public C13NJ(boolean z, boolean z2, String[] strArr) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = strArr;
        new LinkedHashMap();
    }
}
