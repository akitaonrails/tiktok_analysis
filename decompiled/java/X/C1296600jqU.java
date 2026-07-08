package X;

/* JADX INFO: renamed from: X.0jqU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1296600jqU implements InterfaceC1671600tbK {
    @Override // X.InterfaceC1671600tbK
    public final long LIZ(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
        int i = C1296550jqP.LIZ;
        return jFloatToRawIntBits;
    }
}
