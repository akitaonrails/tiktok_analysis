package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tNx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1663310tNx extends AbstractC1663570tON implements InterfaceC1663600tOQ {
    public final Effect LIZ;
    public final String LIZIZ = "normal";
    public final String LIZJ = "";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1663310tNx)) {
            return false;
        }
        C1663310tNx c1663310tNx = (C1663310tNx) obj;
        return Intrinsics.LJFF(this.LIZ, c1663310tNx.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1663310tNx.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1663310tNx.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VCSlipNormalEffect(effect=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", tabName=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", speakState=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1663600tOQ
    public final Effect LIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1663600tOQ
    public final String getTabName() {
        return this.LIZIZ;
    }

    public C1663310tNx(Effect effect) {
        this.LIZ = effect;
    }
}
