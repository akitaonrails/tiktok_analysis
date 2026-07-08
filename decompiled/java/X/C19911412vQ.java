package X;

/* JADX INFO: renamed from: X.12vQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19911412vQ implements InterfaceC19909012v2 {
    public final InterfaceC19911612vS LIZ;
    public final String LIZIZ;
    public final Object[] LIZJ;
    public final int LIZLLL;

    @Override // X.InterfaceC19909012v2
    public final boolean LIZ() {
        return (this.LIZLLL & 2) == 2;
    }

    @Override // X.InterfaceC19909012v2
    public final int LIZIZ() {
        int i = this.LIZLLL;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }

    @Override // X.InterfaceC19909012v2
    public final InterfaceC19911612vS zza() {
        return this.LIZ;
    }

    public C19911412vQ(AbstractC19907912ur abstractC19907912ur, String str, Object[] objArr) {
        this.LIZ = abstractC19907912ur;
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
