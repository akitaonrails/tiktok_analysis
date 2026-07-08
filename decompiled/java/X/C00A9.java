package X;

/* JADX INFO: renamed from: X.00A9, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00A9 {
    public final float LIZ;

    public C00A9() {
        this(0.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C00A9) && Float.compare(this.LIZ, ((C00A9) obj).LIZ) == 0;
    }

    public C00A9(float f) {
        this.LIZ = f;
    }
}
