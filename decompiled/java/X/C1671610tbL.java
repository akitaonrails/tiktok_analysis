package X;

/* JADX INFO: renamed from: X.0tbL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1671610tbL {
    public static final /* synthetic */ C1671610tbL LIZ = new C1671610tbL();
    public static final C1296620jqW LIZIZ = new InterfaceC1671600tbK() { // from class: X.0jqW
        @Override // X.InterfaceC1671600tbK
        public final long LIZ(long j, long j2) {
            float fMax = Math.max(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
            int i = C1296550jqP.LIZ;
            return jFloatToRawIntBits;
        }
    };
    public static final C1675510thd LIZJ = new InterfaceC1671600tbK() { // from class: X.0thd
        @Override // X.InterfaceC1671600tbK
        public final long LIZ(long j, long j2) {
            float fLIZ = C1675520the.LIZ(j, j2);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fLIZ)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fLIZ)));
            int i = C1296550jqP.LIZ;
            return jFloatToRawIntBits;
        }
    };
    public static final C1296610jqV LIZLLL = new InterfaceC1671600tbK() { // from class: X.0jqV
        @Override // X.InterfaceC1671600tbK
        public final long LIZ(long j, long j2) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
            int i = C1296550jqP.LIZ;
            return jFloatToRawIntBits;
        }
    };
    public static final C1675500thc LJ = new InterfaceC1671600tbK() { // from class: X.0thc
        @Override // X.InterfaceC1671600tbK
        public final long LIZ(long j, long j2) {
            if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (j2 >> 32)) && Float.intBitsToFloat((int) (j & 4294967295L)) <= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L);
                int i = C1296550jqP.LIZ;
                return jFloatToRawIntBits;
            }
            float fLIZ = C1675520the.LIZ(j, j2);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fLIZ)) << 32) | (((long) Float.floatToRawIntBits(fLIZ)) & 4294967295L);
            int i2 = C1296550jqP.LIZ;
            return jFloatToRawIntBits2;
        }
    };
    public static final C1296630jqX LJFF = new InterfaceC1671600tbK() { // from class: X.0jqX
        @Override // X.InterfaceC1671600tbK
        public final long LIZ(long j, long j2) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L));
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
            int i = C1296550jqP.LIZ;
            return jFloatToRawIntBits;
        }
    };
}
