package X;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: renamed from: X.139N, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C139N<T> {
    public volatile AtomicReferenceArray<T> array;

    public final int LIZ() {
        return this.array.length();
    }

    public C139N(int i) {
        this.array = new AtomicReferenceArray<>(i);
    }

    public final T LIZIZ(int i) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        if (i < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i);
        }
        return null;
    }

    public final void LIZJ(int i, C1DF3 c1df3) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i < length) {
            atomicReferenceArray.set(i, c1df3);
            return;
        }
        int i2 = i + 1;
        int i3 = length * 2;
        if (i2 < i3) {
            i2 = i3;
        }
        AtomicReferenceArray<T> atomicReferenceArray2 = new AtomicReferenceArray<>(i2);
        for (int i4 = 0; i4 < length; i4++) {
            atomicReferenceArray2.set(i4, atomicReferenceArray.get(i4));
        }
        atomicReferenceArray2.set(i, c1df3);
        this.array = atomicReferenceArray2;
    }
}
