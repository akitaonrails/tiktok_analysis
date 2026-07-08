package X;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14jI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20345814jI {
    public static final C20345814jI LIZJ;
    public final int LIZ;
    public final Pair<Float, Float> LIZIZ;

    public C20345814jI() {
        this(3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20345814jI)) {
            return false;
        }
        C20345814jI c20345814jI = (C20345814jI) obj;
        return this.LIZ == c20345814jI.LIZ && Intrinsics.LJFF(this.LIZIZ, c20345814jI.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LottieRepeatInfo(repeatCount=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", repeatProgress=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        new C20345914jJ();
        LIZJ = new C20345814jI(3);
    }

    public /* synthetic */ C20345814jI(int i) {
        Pair pair;
        if ((i & 2) != 0) {
            pair = new Pair(Float.valueOf(0.0f), Float.valueOf(0.0f));
        } else {
            pair = null;
        }
        this(0, pair);
    }

    public C20345814jI(int i, Pair<Float, Float> pair) {
        this.LIZ = i;
        this.LIZIZ = pair;
    }
}
