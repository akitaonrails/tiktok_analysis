package X;

import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: X.19kY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21627619kY {
    public final String LIZ;
    public EnumC1700580uM4 LIZIZ;
    public C006K LIZJ;
    public C006K LIZLLL;
    public final StringBuilder LJ;
    public int LJFF;
    public int LJI;
    public C21628119kd LJII;
    public int LJIIIIZZ;

    public final int LIZ() {
        return this.LJ.length();
    }

    public final char LIZIZ() {
        return this.LIZ.charAt(this.LJFF);
    }

    public final boolean LIZJ() {
        return this.LJFF < this.LIZ.length() - this.LJIIIIZZ;
    }

    public C21627619kY(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i = 0; i < length; i++) {
            char c = (char) (bytes[i] & 255);
            if (c == '?' && str.charAt(i) != '?') {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            sb.append(c);
        }
        this.LIZ = sb.toString();
        this.LIZIZ = EnumC1700580uM4.FORCE_NONE;
        this.LJ = new StringBuilder(str.length());
        this.LJI = -1;
    }

    public final void LIZLLL(int i) {
        C21628119kd c21628119kd = this.LJII;
        if (c21628119kd == null || i > c21628119kd.LIZIZ) {
            this.LJII = C21628119kd.LJFF(i, this.LIZIZ, this.LIZJ, this.LIZLLL);
        }
    }

    public final void LJ(char c) {
        this.LJ.append(c);
    }
}
