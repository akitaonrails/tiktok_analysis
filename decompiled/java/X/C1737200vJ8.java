package X;

import com.ss.android.ugc.aweme.IEffectConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vJ8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1737200vJ8 extends AbstractC1737400vJS {
    public final String LIZIZ;
    public final boolean LIZJ;
    public final EnumC1737230vJB LIZLLL;
    public final IEffectConfig LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1737200vJ8)) {
            return false;
        }
        C1737200vJ8 c1737200vJ8 = (C1737200vJ8) obj;
        return Intrinsics.LJFF(this.LIZIZ, c1737200vJ8.LIZIZ) && this.LIZJ == c1737200vJ8.LIZJ && this.LIZLLL == c1737200vJ8.LIZLLL && Intrinsics.LJFF(this.LJ, c1737200vJ8.LJ);
    }

    public final int hashCode() {
        return (((((this.LIZIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Custom(originImgPath=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", applyEffect=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", effectConfig=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1737400vJS
    public final IEffectConfig LIZ() {
        return this.LJ;
    }

    @Override // X.AbstractC1737400vJS
    public final EnumC1737230vJB LIZIZ() {
        return this.LIZLLL;
    }

    public C1737200vJ8(String str, EnumC1737230vJB enumC1737230vJB) {
        IEffectConfig.Draft draft = new IEffectConfig.Draft();
        super(enumC1737230vJB, draft);
        this.LIZIZ = str;
        this.LIZJ = true;
        this.LIZLLL = enumC1737230vJB;
        this.LJ = draft;
    }
}
