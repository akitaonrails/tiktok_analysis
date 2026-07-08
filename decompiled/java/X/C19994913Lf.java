package X;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: X.13Lf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19994913Lf extends AbstractC19994813Le implements Serializable {
    public /* synthetic */ C19994913Lf(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // X.AbstractC19994813Le
    public boolean nextBoolean() {
        return AbstractC19994813Le.defaultRandom.nextBoolean();
    }

    @Override // X.AbstractC19994813Le
    public double nextDouble() {
        return AbstractC19994813Le.defaultRandom.nextDouble();
    }

    @Override // X.AbstractC19994813Le
    public float nextFloat() {
        return AbstractC19994813Le.defaultRandom.nextFloat();
    }

    @Override // X.AbstractC19994813Le
    public int nextInt() {
        return AbstractC19994813Le.defaultRandom.nextInt();
    }

    @Override // X.AbstractC19994813Le
    public long nextLong() {
        return AbstractC19994813Le.defaultRandom.nextLong();
    }

    public C19994913Lf() {
    }

    private final Object writeReplace() {
        return new Serializable() { // from class: X.0eBU
            public static final long serialVersionUID = 0;

            private final Object readResolve() {
                return AbstractC19994813Le.Default;
            }
        };
    }

    @Override // X.AbstractC19994813Le
    public int nextBits(int i) {
        return AbstractC19994813Le.defaultRandom.nextBits(i);
    }

    @Override // X.AbstractC19994813Le
    public byte[] nextBytes(int i) {
        return AbstractC19994813Le.defaultRandom.nextBytes(i);
    }

    @Override // X.AbstractC19994813Le
    public double nextDouble(double d) {
        return AbstractC19994813Le.defaultRandom.nextDouble(d);
    }

    @Override // X.AbstractC19994813Le
    public int nextInt(int i) {
        return AbstractC19994813Le.defaultRandom.nextInt(i);
    }

    @Override // X.AbstractC19994813Le
    public long nextLong(long j) {
        return AbstractC19994813Le.defaultRandom.nextLong(j);
    }

    @Override // X.AbstractC19994813Le
    public byte[] nextBytes(byte[] bArr) {
        return AbstractC19994813Le.defaultRandom.nextBytes(bArr);
    }

    @Override // X.AbstractC19994813Le
    public double nextDouble(double d, double d2) {
        return AbstractC19994813Le.defaultRandom.nextDouble(d, d2);
    }

    @Override // X.AbstractC19994813Le
    public int nextInt(int i, int i2) {
        return AbstractC19994813Le.defaultRandom.nextInt(i, i2);
    }

    @Override // X.AbstractC19994813Le
    public long nextLong(long j, long j2) {
        return AbstractC19994813Le.defaultRandom.nextLong(j, j2);
    }

    @Override // X.AbstractC19994813Le
    public byte[] nextBytes(byte[] bArr, int i, int i2) {
        return AbstractC19994813Le.defaultRandom.nextBytes(bArr, i, i2);
    }
}
