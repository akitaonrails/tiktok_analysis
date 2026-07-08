package X;

/* JADX INFO: renamed from: X.0HL5, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HL5 {
    public final EnumC439280HKk LIZ;
    public final long LIZIZ;
    public final float LIZJ;

    public C0HL5() {
        this(null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0HL5)) {
            return false;
        }
        C0HL5 c0hl5 = (C0HL5) obj;
        return this.LIZ == c0hl5.LIZ && this.LIZIZ == c0hl5.LIZIZ && Float.compare(this.LIZJ, c0hl5.LIZJ) == 0;
    }

    public /* synthetic */ C0HL5(EnumC439280HKk enumC439280HKk, int i) {
        this((i & 1) != 0 ? EnumC439280HKk.NOT_IN_WAITING : enumC439280HKk, 0L, 0.0f);
    }

    public C0HL5(EnumC439280HKk enumC439280HKk, long j, float f) {
        this.LIZ = enumC439280HKk;
        this.LIZIZ = j;
        this.LIZJ = f;
    }

    public static C0HL5 LIZ(C0HL5 c0hl5, EnumC439280HKk enumC439280HKk, long j, int i) {
        float f;
        if ((i & 1) != 0) {
            enumC439280HKk = c0hl5.LIZ;
        }
        if ((i & 2) != 0) {
            j = c0hl5.LIZIZ;
        }
        if ((i & 4) != 0) {
            f = c0hl5.LIZJ;
        } else {
            f = 0.0f;
        }
        c0hl5.getClass();
        return new C0HL5(enumC439280HKk, j, f);
    }
}
