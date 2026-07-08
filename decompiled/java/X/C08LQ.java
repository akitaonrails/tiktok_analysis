package X;

/* JADX INFO: renamed from: X.08LQ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08LQ implements C08LR {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C08LQ)) {
            return false;
        }
        obj.getClass();
        return Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(0.0f) * 31) + Float.floatToIntBits(0.0f);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PopSpringParam(bounciness=");
        sbLIZ.append(0.0f);
        sbLIZ.append(", speed=");
        sbLIZ.append(0.0f);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
