package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: renamed from: X.11Qx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19500111Qx<T> implements InterfaceC19495011Oy<T> {
    public static final int LLJ = Integer.getInteger("jctools.spsc.max.lookahead.step", SpeechEngineDefines.TTS_WORK_MODE_BOTH).intValue();
    public static final Object LLJI = new Object();
    public final AtomicLong LL;
    public int LLILLJJLI;
    public long LLILLL;
    public final int LLILZ;
    public AtomicReferenceArray<Object> LLILZIL;
    public final int LLILZLL;
    public AtomicReferenceArray<Object> LLIZ;
    public final AtomicLong LLIZLLLIL;

    @Override // X.InterfaceC19494911Ox
    public final boolean isEmpty() {
        return this.LL.get() == this.LLIZLLLIL.get();
    }

    @Override // X.InterfaceC19495011Oy, X.InterfaceC19494911Ox
    public final T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.LLIZ;
        long j = this.LLIZLLLIL.get();
        int i = this.LLILZLL;
        int i2 = ((int) j) & i;
        T t = (T) atomicReferenceArray.get(i2);
        boolean z = t == LLJI;
        if (t != null) {
            if (!z) {
                atomicReferenceArray.lazySet(i2, null);
                this.LLIZLLLIL.lazySet(j + 1);
                return t;
            }
        } else if (!z) {
            return null;
        }
        int i3 = i + 1;
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i3);
        atomicReferenceArray.lazySet(i3, null);
        this.LLIZ = atomicReferenceArray2;
        T t2 = (T) atomicReferenceArray2.get(i2);
        if (t2 != null) {
            atomicReferenceArray2.lazySet(i2, null);
            this.LLIZLLLIL.lazySet(j + 1);
        }
        return t2;
    }

    @Override // X.InterfaceC19494911Ox
    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public C19500111Qx(int i) {
        AtomicLong atomicLong = new AtomicLong();
        this.LL = atomicLong;
        this.LLIZLLLIL = new AtomicLong();
        int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(Math.max(8, i) - 1));
        int i2 = iNumberOfLeadingZeros - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(iNumberOfLeadingZeros + 1);
        this.LLILZIL = atomicReferenceArray;
        this.LLILZ = i2;
        this.LLILLJJLI = Math.min(iNumberOfLeadingZeros / 4, LLJ);
        this.LLIZ = atomicReferenceArray;
        this.LLILZLL = i2;
        this.LLILLL = i2 - 1;
        atomicLong.lazySet(0L);
    }

    @Override // X.InterfaceC19494911Ox
    public final boolean offer(T t) {
        if (t != null) {
            AtomicReferenceArray<Object> atomicReferenceArray = this.LLILZIL;
            long j = this.LL.get();
            int i = this.LLILZ;
            int i2 = ((int) j) & i;
            if (j < this.LLILLL) {
                atomicReferenceArray.lazySet(i2, t);
                this.LL.lazySet(j + 1);
                return true;
            }
            long j2 = ((long) this.LLILLJJLI) + j;
            if (atomicReferenceArray.get(((int) j2) & i) == null) {
                this.LLILLL = j2 - 1;
                atomicReferenceArray.lazySet(i2, t);
                this.LL.lazySet(j + 1);
                return true;
            }
            long j3 = j + 1;
            if (atomicReferenceArray.get(((int) j3) & i) == null) {
                atomicReferenceArray.lazySet(i2, t);
                this.LL.lazySet(j3);
                return true;
            }
            long j4 = i;
            AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
            this.LLILZIL = atomicReferenceArray2;
            this.LLILLL = (j4 + j) - 1;
            atomicReferenceArray2.lazySet(i2, t);
            atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
            atomicReferenceArray.lazySet(i2, LLJI);
            this.LL.lazySet(j3);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }
}
