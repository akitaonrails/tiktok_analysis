package X;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: X.133N, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C133N extends C133O implements Serializable, C138K {
    public static final long serialVersionUID = 7249069246863182397L;

    @Override // X.C138K
    public final void LIZ() {
        add(1L);
    }

    public final long LJ() {
        long j = this.base;
        C19918212wW[] c19918212wWArr = this.LL;
        if (c19918212wWArr != null) {
            for (C19918212wW c19918212wW : c19918212wWArr) {
                if (c19918212wW != null) {
                    j += c19918212wW.value;
                }
            }
        }
        return j;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return LJ();
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return LJ();
    }

    @Override // java.lang.Number
    public final int intValue() {
        return (int) LJ();
    }

    @Override // java.lang.Number
    public final long longValue() {
        return LJ();
    }

    public final String toString() {
        return Long.toString(LJ());
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.busy = 0;
        this.LL = null;
        this.base = objectInputStream.readLong();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeLong(LJ());
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x009c, code lost:
    
        if (r12.LL != r6) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x009e, code lost:
    
        r2 = new X.C19918212wW[r7 << 1];
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a3, code lost:
    
        r2[r1] = r6[r1];
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00a9, code lost:
    
        if (r1 < r7) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ab, code lost:
    
        r12.LL = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0034 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0034 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f8  */
    @Override // X.C138K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void add(long r13) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C133N.add(long):void");
    }
}
