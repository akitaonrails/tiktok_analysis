package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CdF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C317950CdF {
    public final int LIZ;
    public final String LIZIZ;

    public C317950CdF() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C317950CdF)) {
            return false;
        }
        C317950CdF c317950CdF = (C317950CdF) obj;
        return this.LIZ == c317950CdF.LIZ && Intrinsics.LJFF(this.LIZIZ, c317950CdF.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EffectProfileDraftCardData(draftCount=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", firstDraftIconPath=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C317950CdF(int i) {
        this(0, "");
    }

    public C317950CdF(int i, String str) {
        this.LIZ = i;
        this.LIZIZ = str;
    }
}
