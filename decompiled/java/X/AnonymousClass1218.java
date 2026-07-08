package X;

/* JADX INFO: renamed from: X.1218, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class AnonymousClass1218 implements InterfaceC384940F7k {
    public final int LL;
    public final int LLILLJJLI;
    public final float LLILLL;
    public final float LLILZ;
    public final float LLILZIL;
    public final float LLILZLL;

    public AnonymousClass1218() {
        this(0, 0, 0.0f, 0.0f, 0.0f, 0.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass1218)) {
            return false;
        }
        AnonymousClass1218 anonymousClass1218 = (AnonymousClass1218) obj;
        return this.LL == anonymousClass1218.LL && this.LLILLJJLI == anonymousClass1218.LLILLJJLI && Float.compare(this.LLILLL, anonymousClass1218.LLILLL) == 0 && Float.compare(this.LLILZ, anonymousClass1218.LLILZ) == 0 && Float.compare(this.LLILZIL, anonymousClass1218.LLILZIL) == 0 && Float.compare(this.LLILZLL, anonymousClass1218.LLILZLL) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InfoStickerTimeEditData(startTime=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", endTime=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", rotate=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", scale=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", xPercent=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", yPercent=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((((((this.LL * 31) + this.LLILLJJLI) * 31) + Float.floatToIntBits(this.LLILLL)) * 31) + Float.floatToIntBits(this.LLILZ)) * 31) + Float.floatToIntBits(this.LLILZIL)) * 31) + Float.floatToIntBits(this.LLILZLL);
    }

    public AnonymousClass1218(int i, int i2, float f, float f2, float f3, float f4) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = f;
        this.LLILZ = f2;
        this.LLILZIL = f3;
        this.LLILZLL = f4;
    }
}
