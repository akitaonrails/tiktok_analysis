package X;

/* JADX INFO: renamed from: X.00E7, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00E7 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00E7)) {
            return false;
        }
        obj.getClass();
        return true;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(false);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreloadDecision(triggerPreload=");
        sbLIZ.append(false);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
