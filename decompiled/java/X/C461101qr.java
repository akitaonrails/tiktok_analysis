package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01qr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C461101qr extends AbstractC461201qs {
    public final Effect LIZ;
    public final String LIZIZ;
    public final EnumC119200co LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C461101qr)) {
            return false;
        }
        C461101qr c461101qr = (C461101qr) obj;
        return Intrinsics.LJFF(this.LIZ, c461101qr.LIZ) && Intrinsics.LJFF(this.LIZIZ, c461101qr.LIZIZ) && this.LIZJ == c461101qr.LIZJ;
    }

    public final int hashCode() {
        Effect effect = this.LIZ;
        int iHashCode = (((effect == null ? 0 : effect.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31;
        EnumC119200co enumC119200co = this.LIZJ;
        return iHashCode + (enumC119200co != null ? enumC119200co.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OpenTrending(effect=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", tabType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C461101qr(Effect effect, String str, EnumC119200co enumC119200co) {
        this.LIZ = effect;
        this.LIZIZ = str;
        this.LIZJ = enumC119200co;
    }
}
