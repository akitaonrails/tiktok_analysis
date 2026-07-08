package X;

/* JADX INFO: renamed from: X.13JC, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13JC {
    public static final String LIZIZ(byte b) {
        return b == 1 ? "quotation mark '\"'" : b == 2 ? "string escape sequence '\\'" : b == 4 ? "comma ','" : b == 5 ? "colon ':'" : b == 6 ? "start of the object '{'" : b == 7 ? "end of the object '}'" : b == 8 ? "start of the array '['" : b == 9 ? "end of the array ']'" : b == 10 ? "end of the input" : b == 127 ? "invalid token" : "valid token";
    }

    public static final byte LIZ(char c) {
        if (c < '~') {
            return C13JH.LIZIZ[c];
        }
        return (byte) 0;
    }
}
