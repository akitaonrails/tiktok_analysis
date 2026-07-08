package X;

/* JADX INFO: renamed from: X.0HA9, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HA9 {
    public final float LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0HA9) && Float.compare(this.LIZ, ((C0HA9) obj).LIZ) == 0;
    }

    public C0HA9(float f) {
        this.LIZ = f;
    }
}
