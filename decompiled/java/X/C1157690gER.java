package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gER, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1157690gER extends AbstractC1157700gES {
    public final C1157680gEQ LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1157690gER) && Intrinsics.LJFF(this.LIZ, ((C1157690gER) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Video(result=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1157690gER(C1157680gEQ c1157680gEQ) {
        this.LIZ = c1157680gEQ;
    }
}
