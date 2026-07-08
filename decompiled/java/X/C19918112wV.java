package X;

/* JADX INFO: renamed from: X.12wV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19918112wV implements InterfaceC19921712x5 {
    public final InterfaceC19925612xi LIZ;
    public final String LIZIZ;
    public final Object[] LIZJ;
    public final int LIZLLL;

    @Override // X.InterfaceC19921712x5
    public final boolean LIZIZ() {
        return (this.LIZLLL & 2) == 2;
    }

    @Override // X.InterfaceC19921712x5
    public final EnumC19907712up LIZJ() {
        int i = this.LIZLLL;
        return (i & 1) != 0 ? EnumC19907712up.PROTO2 : (i & 4) == 4 ? EnumC19907712up.EDITIONS : EnumC19907712up.PROTO3;
    }

    @Override // X.InterfaceC19921712x5
    public final InterfaceC19925612xi LIZ() {
        return this.LIZ;
    }

    public C19918112wV(InterfaceC19925612xi interfaceC19925612xi, String str, Object[] objArr) {
        this.LIZ = interfaceC19925612xi;
        this.LIZIZ = str;
        this.LIZJ = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.LIZLLL = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 >= 55296) {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            } else {
                this.LIZLLL = i | (cCharAt2 << i2);
                return;
            }
        }
    }
}
