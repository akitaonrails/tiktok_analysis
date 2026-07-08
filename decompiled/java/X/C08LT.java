package X;

/* JADX INFO: renamed from: X.08LT, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08LT implements C08LR {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C08LT)) {
            return false;
        }
        obj.getClass();
        return Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0;
    }

    public final int hashCode() {
        return ((((((((Float.floatToIntBits(0.0f) * 31) + Float.floatToIntBits(0.0f)) * 31) + Float.floatToIntBits(0.0f)) * 31) + Float.floatToIntBits(0.0f)) * 31) + C786410Ut5.Y2(0L)) * 31;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BezierParam(x1=");
        sbLIZ.append(0.0f);
        sbLIZ.append(", y1=");
        sbLIZ.append(0.0f);
        sbLIZ.append(", x2=");
        sbLIZ.append(0.0f);
        sbLIZ.append(", y2=");
        sbLIZ.append(0.0f);
        sbLIZ.append(", duration=");
        sbLIZ.append(0L);
        sbLIZ.append(", repeatMode=");
        sbLIZ.append((Object) null);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
