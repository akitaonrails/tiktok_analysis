package X;

/* JADX INFO: renamed from: X.1DcU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2259681DcU implements InterfaceC846220XHo, Cloneable {
    public final String LL;
    public final String LLILLJJLI;
    public final C08NY[] LLILLL;

    @Override // X.InterfaceC846220XHo
    public final C08NY[] getParameters() {
        return (C08NY[]) this.LLILLL.clone();
    }

    public final int hashCode() {
        int iLIZ = C2259721DcY.LIZ(C2259721DcY.LIZ(17, this.LL), this.LLILLJJLI);
        int i = 0;
        while (true) {
            C08NY[] c08nyArr = this.LLILLL;
            if (i >= c08nyArr.length) {
                return iLIZ;
            }
            iLIZ = C2259721DcY.LIZ(iLIZ, c08nyArr[i]);
            i++;
        }
    }

    public final String toString() {
        C2259641DcQ c2259641DcQ = new C2259641DcQ(64);
        c2259641DcQ.LIZIZ(this.LL);
        if (this.LLILLJJLI != null) {
            c2259641DcQ.LIZIZ("=");
            c2259641DcQ.LIZIZ(this.LLILLJJLI);
        }
        for (int i = 0; i < this.LLILLL.length; i++) {
            c2259641DcQ.LIZIZ("; ");
            c2259641DcQ.LIZIZ(String.valueOf(this.LLILLL[i]));
        }
        return c2259641DcQ.toString();
    }

    public final Object clone() {
        return super.clone();
    }

    @Override // X.InterfaceC846220XHo
    public final String getName() {
        return this.LL;
    }

    @Override // X.InterfaceC846220XHo
    public final String getValue() {
        return this.LLILLJJLI;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC846220XHo)) {
            return false;
        }
        C2259681DcU c2259681DcU = (C2259681DcU) obj;
        if (!this.LL.equals(c2259681DcU.LL)) {
            return false;
        }
        String str = this.LLILLJJLI;
        String str2 = c2259681DcU.LLILLJJLI;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        C08NY[] c08nyArr = this.LLILLL;
        C08NY[] c08nyArr2 = c2259681DcU.LLILLL;
        if (c08nyArr == null) {
            if (c08nyArr2 != null) {
                return false;
            }
        } else {
            if (c08nyArr2 == null || c08nyArr.length != c08nyArr2.length) {
                return false;
            }
            for (int i = 0; i < c08nyArr.length; i++) {
                C08NY c08ny = c08nyArr[i];
                C08NY c08ny2 = c08nyArr2[i];
                if (c08ny == null) {
                    if (c08ny2 != null) {
                        return false;
                    }
                } else if (!c08ny.equals(c08ny2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public C2259681DcU(String str, String str2, C08NY[] c08nyArr) {
        if (str != null) {
            this.LL = str;
            this.LLILLJJLI = str2;
            if (c08nyArr != null) {
                this.LLILLL = c08nyArr;
                return;
            } else {
                this.LLILLL = new C08NY[0];
                return;
            }
        }
        throw new IllegalArgumentException("Name may not be null");
    }
}
