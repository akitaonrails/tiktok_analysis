package X;

import com.bytedance.ies.powerlist.page.PowerPageState;

/* JADX INFO: renamed from: X.15kR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public abstract class AbstractC20607715kR {
    public final EnumC323450Cm7 LIZ;
    public final EnumC323450Cm7 LIZIZ;
    public final PowerPageState LIZJ;

    public final boolean LIZ(EnumC323450Cm7 enumC323450Cm7) {
        if (this.LIZ != enumC323450Cm7 && enumC323450Cm7 != EnumC323450Cm7.Refresh) {
            return false;
        }
        return true;
    }

    public AbstractC20607715kR(EnumC323450Cm7 enumC323450Cm7, EnumC323450Cm7 enumC323450Cm72, PowerPageState powerPageState) {
        this.LIZ = enumC323450Cm7;
        this.LIZIZ = enumC323450Cm72;
        this.LIZJ = powerPageState;
    }
}
