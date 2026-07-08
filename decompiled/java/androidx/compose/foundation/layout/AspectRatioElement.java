package androidx.compose.foundation.layout;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C1676450tj9;
import X.C1679560toA;
import X.C1684370tvv;
import X.C1688620u2m;
import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public final class AspectRatioElement extends AbstractC1685820tyG<C1676450tj9> {
    public final float LIZIZ;
    public final boolean LIZJ;
    public final Function1<C1688620u2m, Unit> LIZLLL;

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C1676450tj9(this.LIZIZ, this.LIZJ);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.LIZIZ) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        C1676450tj9 c1676450tj9 = (C1676450tj9) abstractC20055413dY;
        c1676450tj9.LLJJ = this.LIZIZ;
        c1676450tj9.LLJJI = this.LIZJ;
    }

    public final boolean equals(Object obj) {
        AspectRatioElement aspectRatioElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof AspectRatioElement) {
            aspectRatioElement = (AspectRatioElement) obj;
        } else {
            aspectRatioElement = null;
        }
        if (aspectRatioElement != null && this.LIZIZ == aspectRatioElement.LIZIZ && this.LIZJ == ((AspectRatioElement) obj).LIZJ) {
            return true;
        }
        return false;
    }

    public AspectRatioElement(float f, boolean z, C1684370tvv c1684370tvv) {
        this.LIZIZ = f;
        this.LIZJ = z;
        this.LIZLLL = c1684370tvv;
        if (f <= 0.0f) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("aspectRatio ");
            sbLIZ.append(f);
            sbLIZ.append(" must be > 0");
            C1679560toA.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
