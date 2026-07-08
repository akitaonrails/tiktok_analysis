package X;

/* JADX INFO: renamed from: X.12u2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19902812u2 implements InterfaceC19903912uD {
    public final InterfaceC19901112tl LIZ;
    public final String LIZIZ;
    public final Object[] LIZJ;
    public final int LIZLLL;

    @Override // X.InterfaceC19903912uD
    public final EnumC19903112u5 LIZ() {
        int i = this.LIZLLL;
        return (i & 1) != 0 ? EnumC19903112u5.PROTO2 : (i & 4) == 4 ? EnumC19903112u5.EDITIONS : EnumC19903112u5.PROTO3;
    }

    @Override // X.InterfaceC19903912uD
    public final boolean LIZIZ() {
        return (this.LIZLLL & 2) == 2;
    }

    @Override // X.InterfaceC19903912uD
    public final InterfaceC19901112tl zza() {
        return this.LIZ;
    }

    public C19902812u2(AbstractC19899612tW abstractC19899612tW, String str, Object[] objArr) {
        this.LIZ = abstractC19899612tW;
        this.LIZIZ = str;
        this.LIZJ = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.LIZLLL = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            int i4 = i2 + 1;
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 >= 55296) {
                i |= (cCharAt2 & 8191) << i3;
                i3 += 13;
                i2 = i4;
            } else {
                this.LIZLLL = i | (cCharAt2 << i3);
                return;
            }
        }
    }
}
