package X;

/* JADX INFO: renamed from: X.0u8W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1692180u8W {
    public static final C1692410u8t LIZ;

    static {
        InterfaceC1692600u9C.LIZ.getClass();
        LIZ = new C1692410u8t(C1692620u9E.LIZIZ, 0, 0);
    }

    public static final C1684310tvp LIZ(InterfaceC1679160tnW interfaceC1679160tnW, C1692220u8a c1692220u8a) {
        C1684310tvp c1684310tvpLIZ = interfaceC1679160tnW.LIZ(c1692220u8a);
        int length = c1692220u8a.length();
        int length2 = c1684310tvpLIZ.LIZ.length();
        int iMin = Math.min(length, 100);
        for (int i = 0; i < iMin; i++) {
            LIZIZ(c1684310tvpLIZ.LIZIZ.LIZ(i), length2, i);
        }
        LIZIZ(c1684310tvpLIZ.LIZIZ.LIZ(length), length2, length);
        int iMin2 = Math.min(length2, 100);
        for (int i2 = 0; i2 < iMin2; i2++) {
            LIZJ(c1684310tvpLIZ.LIZIZ.LIZIZ(i2), length, i2);
        }
        LIZJ(c1684310tvpLIZ.LIZIZ.LIZIZ(length2), length, length2);
        return new C1684310tvp(c1684310tvpLIZ.LIZ, new C1692410u8t(c1684310tvpLIZ.LIZIZ, c1692220u8a.length(), c1684310tvpLIZ.LIZ.length()));
    }

    public static final void LIZIZ(int i, int i2, int i3) {
        if (i >= 0 && i <= i2) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OffsetMapping.originalToTransformed returned invalid mapping: ");
        sbLIZ.append(i3);
        sbLIZ.append(" -> ");
        sbLIZ.append(i);
        sbLIZ.append(" is not in range of transformed text [0, ");
        sbLIZ.append(i2);
        sbLIZ.append(']');
        C1691080u6k.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LIZJ(int i, int i2, int i3) {
        if (i >= 0 && i <= i2) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OffsetMapping.transformedToOriginal returned invalid mapping: ");
        sbLIZ.append(i3);
        sbLIZ.append(" -> ");
        sbLIZ.append(i);
        sbLIZ.append(" is not in range of original text [0, ");
        sbLIZ.append(i2);
        sbLIZ.append(']');
        C1691080u6k.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
    }
}
