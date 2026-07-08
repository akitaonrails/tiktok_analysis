package X;

import java.util.Objects;

/* JADX INFO: renamed from: X.0Jc0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C495540Jc0 implements InterfaceC495530Jbz, Cloneable {
    public final String LL;
    public final String LLILLJJLI;

    public final int hashCode() {
        return Objects.hash(this.LL, this.LLILLJJLI);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0Jc1] */
    public final String toString() {
        final int length = this.LL.length();
        String str = this.LLILLJJLI;
        if (str != null) {
            length += str.length() + 1;
        }
        ?? r1 = new Object(length) { // from class: X.0Jc1
            public char[] LIZ;
            public int LIZIZ;

            public final String toString() {
                return new String(this.LIZ, 0, this.LIZIZ);
            }

            {
                if (length >= 0) {
                    this.LIZ = new char[length];
                    return;
                }
                throw new IllegalArgumentException("Buffer capacity may not be negative");
            }

            public final void LIZ(String str2) {
                if (str2 == null) {
                    str2 = "null";
                }
                int length2 = str2.length();
                int i = this.LIZIZ + length2;
                char[] cArr = this.LIZ;
                if (i > cArr.length) {
                    char[] cArr2 = new char[Math.max(cArr.length << 1, i)];
                    System.arraycopy(this.LIZ, 0, cArr2, 0, this.LIZIZ);
                    this.LIZ = cArr2;
                }
                str2.getChars(0, length2, this.LIZ, this.LIZIZ);
                this.LIZIZ = i;
            }
        };
        r1.LIZ(this.LL);
        if (this.LLILLJJLI != null) {
            r1.LIZ("=");
            r1.LIZ(this.LLILLJJLI);
        }
        return r1.toString();
    }

    public final Object clone() {
        return super.clone();
    }

    @Override // X.InterfaceC495530Jbz
    public final String getName() {
        return this.LL;
    }

    @Override // X.InterfaceC495530Jbz
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
        if (!(obj instanceof InterfaceC495530Jbz)) {
            return false;
        }
        C495540Jc0 c495540Jc0 = (C495540Jc0) obj;
        if (!this.LL.equals(c495540Jc0.LL) || !Objects.equals(this.LLILLJJLI, c495540Jc0.LLILLJJLI)) {
            return false;
        }
        return true;
    }

    public C495540Jc0(String str, String str2) {
        if (str != null) {
            this.LL = str;
            this.LLILLJJLI = str2;
            return;
        }
        throw new IllegalArgumentException("Name may not be null");
    }
}
