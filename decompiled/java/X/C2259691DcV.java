package X;

/* JADX INFO: renamed from: X.1DcV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2259691DcV implements C08NY, Cloneable {
    public final String LL;
    public final String LLILLJJLI;

    public final int hashCode() {
        return C2259721DcY.LIZ(C2259721DcY.LIZ(17, this.LL), this.LLILLJJLI);
    }

    public final String toString() {
        int length = this.LL.length();
        String str = this.LLILLJJLI;
        if (str != null) {
            length += str.length() + 1;
        }
        C2259641DcQ c2259641DcQ = new C2259641DcQ(length);
        c2259641DcQ.LIZIZ(this.LL);
        if (this.LLILLJJLI != null) {
            c2259641DcQ.LIZIZ("=");
            c2259641DcQ.LIZIZ(this.LLILLJJLI);
        }
        return c2259641DcQ.toString();
    }

    public final Object clone() {
        return super.clone();
    }

    @Override // X.C08NY
    public final String getName() {
        return this.LL;
    }

    @Override // X.C08NY
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
        if (!(obj instanceof C08NY)) {
            return false;
        }
        C2259691DcV c2259691DcV = (C2259691DcV) obj;
        if (!this.LL.equals(c2259691DcV.LL)) {
            return false;
        }
        String str = this.LLILLJJLI;
        String str2 = c2259691DcV.LLILLJJLI;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        return true;
    }

    public C2259691DcV(String str, String str2) {
        if (str != null) {
            this.LL = str;
            this.LLILLJJLI = str2;
            return;
        }
        throw new IllegalArgumentException("Name may not be null");
    }
}
