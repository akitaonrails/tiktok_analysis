package X;

/* JADX INFO: renamed from: X.0SN7, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SN7 {
    public final EnumC720020SMe LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public final int LIZ() {
        int i = this.LIZIZ;
        return (this.LIZJ * i) + (i > 0 ? this.LIZ.getPaddingBottom() : 0);
    }

    public C0SN7(EnumC720020SMe enumC720020SMe, int i, int i2, int i3) {
        this.LIZ = enumC720020SMe;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
    }

    public /* synthetic */ C0SN7(EnumC720020SMe enumC720020SMe, int i, int i2, int i3, int i4) {
        this(enumC720020SMe, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, 0);
    }
}
