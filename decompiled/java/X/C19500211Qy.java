package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: renamed from: X.11Qy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19500211Qy<E> extends AtomicReferenceArray<E> implements InterfaceC19495011Oy<E> {
    public static final Integer LLILZLL = Integer.getInteger("jctools.spsc.max.lookahead.step", SpeechEngineDefines.TTS_WORK_MODE_BOTH);
    public static final long serialVersionUID = -1296597691183856449L;
    public final int LL;
    public final AtomicLong LLILLJJLI;
    public long LLILLL;
    public final AtomicLong LLILZ;
    public final int LLILZIL;

    @Override // X.InterfaceC19494911Ox
    public boolean isEmpty() {
        return this.LLILLJJLI.get() == this.LLILZ.get();
    }

    @Override // X.InterfaceC19495011Oy, X.InterfaceC19494911Ox
    public E poll() {
        long j = this.LLILZ.get();
        int i = ((int) j) & this.LL;
        E e = get(i);
        if (e == null) {
            return null;
        }
        this.LLILZ.lazySet(j + 1);
        lazySet(i, null);
        return e;
    }

    @Override // X.InterfaceC19494911Ox
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public C19500211Qy(int i) {
        super(1 << (32 - Integer.numberOfLeadingZeros(i - 1)));
        this.LL = length() - 1;
        this.LLILLJJLI = new AtomicLong();
        this.LLILZ = new AtomicLong();
        this.LLILZIL = Math.min(i / 4, LLILZLL.intValue());
    }

    @Override // X.InterfaceC19494911Ox
    public boolean offer(E e) {
        if (e != null) {
            int i = this.LL;
            long j = this.LLILLJJLI.get();
            int i2 = ((int) j) & i;
            if (j >= this.LLILLL) {
                long j2 = ((long) this.LLILZIL) + j;
                if (get(i & ((int) j2)) == null) {
                    this.LLILLL = j2;
                } else if (get(i2) != null) {
                    return false;
                }
            }
            lazySet(i2, e);
            this.LLILLJJLI.lazySet(j + 1);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    public boolean offer(E e, E e2) {
        if (offer(e) && offer(e2)) {
            return true;
        }
        return false;
    }
}
