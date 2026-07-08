package X;

import java.util.Random;

/* JADX INFO: renamed from: X.13KK, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public abstract class C13KK extends AbstractC19994813Le {
    public abstract Random LIZ();

    @Override // X.AbstractC19994813Le
    public final boolean nextBoolean() {
        return LIZ().nextBoolean();
    }

    @Override // X.AbstractC19994813Le
    public final double nextDouble() {
        return LIZ().nextDouble();
    }

    @Override // X.AbstractC19994813Le
    public final float nextFloat() {
        return LIZ().nextFloat();
    }

    @Override // X.AbstractC19994813Le
    public final int nextInt() {
        return LIZ().nextInt();
    }

    @Override // X.AbstractC19994813Le
    public final long nextLong() {
        return LIZ().nextLong();
    }

    @Override // X.AbstractC19994813Le
    public final int nextBits(int i) {
        return ((-i) >> 31) & (LIZ().nextInt() >>> (32 - i));
    }

    @Override // X.AbstractC19994813Le
    public final byte[] nextBytes(byte[] bArr) {
        LIZ().nextBytes(bArr);
        return bArr;
    }

    @Override // X.AbstractC19994813Le
    public final int nextInt(int i) {
        return LIZ().nextInt(i);
    }
}
