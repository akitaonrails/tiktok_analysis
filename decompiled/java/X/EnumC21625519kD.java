package X;

/* JADX INFO: renamed from: X.19kD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public enum EnumC21625519kD {
    TERMINATOR(0, new int[]{0, 0, 0}),
    NUMERIC(1, new int[]{10, 12, 14}),
    ALPHANUMERIC(2, new int[]{9, 11, 13}),
    STRUCTURED_APPEND(3, new int[]{0, 0, 0}),
    BYTE(4, new int[]{8, 16, 16}),
    ECI(7, new int[]{0, 0, 0}),
    KANJI(8, new int[]{8, 10, 12}),
    FNC1_FIRST_POSITION(5, new int[]{0, 0, 0}),
    FNC1_SECOND_POSITION(9, new int[]{0, 0, 0}),
    HANZI(13, new int[]{8, 10, 12});

    public final int[] LL;
    public final int LLILLJJLI;

    public int getBits() {
        return this.LLILLJJLI;
    }

    public static EnumC21625519kD forBits(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                if (i != 7) {
                                    if (i != 8) {
                                        if (i != 9) {
                                            if (i == 13) {
                                                return HANZI;
                                            }
                                            throw new IllegalArgumentException();
                                        }
                                        return FNC1_SECOND_POSITION;
                                    }
                                    return KANJI;
                                }
                                return ECI;
                            }
                            return FNC1_FIRST_POSITION;
                        }
                        return BYTE;
                    }
                    return STRUCTURED_APPEND;
                }
                return ALPHANUMERIC;
            }
            return NUMERIC;
        }
        return TERMINATOR;
    }

    public static EnumC21625519kD valueOf(String str) {
        return (EnumC21625519kD) C08FF.LIZ(EnumC21625519kD.class, str);
    }

    public int getCharacterCountBits(C21625819kG c21625819kG) {
        char c;
        int i = c21625819kG.LIZ;
        if (i <= 9) {
            c = 0;
        } else if (i <= 26) {
            c = 1;
        } else {
            c = 2;
        }
        return this.LL[c];
    }

    EnumC21625519kD(int i, int[] iArr) {
        this.LL = iArr;
        this.LLILLJJLI = i;
    }
}
