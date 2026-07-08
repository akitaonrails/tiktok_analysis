package X;

import android.os.Bundle;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sRy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1627360sRy extends AbstractC1627380sS0 {
    public final Effect LIZ;
    public final int LIZIZ;
    public final EnumC1448980noG LIZJ;
    public final boolean LIZLLL;
    public final Bundle LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1627360sRy)) {
            return false;
        }
        C1627360sRy c1627360sRy = (C1627360sRy) obj;
        return Intrinsics.LJFF(this.LIZ, c1627360sRy.LIZ) && this.LIZIZ == c1627360sRy.LIZIZ && this.LIZJ == c1627360sRy.LIZJ && this.LIZLLL == c1627360sRy.LIZLLL && Intrinsics.LJFF(this.LJ, c1627360sRy.LJ);
    }

    public final int hashCode() {
        Effect effect = this.LIZ;
        int iHashCode = (((((((effect == null ? 0 : effect.hashCode()) * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31;
        Bundle bundle = this.LJ;
        return iHashCode + (bundle != null ? bundle.hashCode() : 0);
    }

    public final String toString() {
        return C318530CeB.LIZ("UnselectedStickerHandleSession", this.LIZ, new Pair("clickPosition", Integer.valueOf(this.LIZIZ)), new Pair("requestSource", this.LIZJ), new Pair("interceptLoad", Boolean.valueOf(this.LIZLLL)), new Pair("extraData", this.LJ));
    }

    @Override // X.AbstractC1627380sS0
    public final Effect LIZ() {
        return this.LIZ;
    }

    public C1627360sRy(int i, Bundle bundle, EnumC1448980noG enumC1448980noG, Effect effect, boolean z) {
        this.LIZ = effect;
        this.LIZIZ = i;
        this.LIZJ = enumC1448980noG;
        this.LIZLLL = z;
        this.LJ = bundle;
    }
}
