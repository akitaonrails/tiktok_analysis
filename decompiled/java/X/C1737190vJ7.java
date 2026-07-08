package X;

import com.ss.android.ugc.aweme.IEffectConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vJ7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1737190vJ7 extends AbstractC1737400vJS {
    public final EnumC1737230vJB LIZIZ;
    public final IEffectConfig LIZJ;

    public C1737190vJ7() {
        this((EnumC1737230vJB) null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1737190vJ7)) {
            return false;
        }
        C1737190vJ7 c1737190vJ7 = (C1737190vJ7) obj;
        return this.LIZIZ == c1737190vJ7.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1737190vJ7.LIZJ);
    }

    public final int hashCode() {
        return (this.LIZIZ.hashCode() * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Random(scene=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", effectConfig=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1737400vJS
    public final IEffectConfig LIZ() {
        return this.LIZJ;
    }

    @Override // X.AbstractC1737400vJS
    public final EnumC1737230vJB LIZIZ() {
        return this.LIZIZ;
    }

    public /* synthetic */ C1737190vJ7(EnumC1737230vJB enumC1737230vJB, int i) {
        IEffectConfig.Draft draft;
        enumC1737230vJB = (i & 1) != 0 ? EnumC1737230vJB.ICON_EDIT : enumC1737230vJB;
        if ((i & 2) != 0) {
            draft = new IEffectConfig.Draft();
        } else {
            draft = null;
        }
        this(enumC1737230vJB, draft);
    }

    public C1737190vJ7(EnumC1737230vJB enumC1737230vJB, IEffectConfig iEffectConfig) {
        super(enumC1737230vJB, iEffectConfig);
        this.LIZIZ = enumC1737230vJB;
        this.LIZJ = iEffectConfig;
    }
}
