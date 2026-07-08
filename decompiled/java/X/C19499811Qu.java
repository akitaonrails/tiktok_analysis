package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.11Qu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19499811Qu<T, K, V> extends AtomicInteger implements InterfaceC626120Oh8<T>, InterfaceC420801kM {
    public static final Object LLJ = new Object();
    public static final long serialVersionUID = -3688291656102519502L;
    public final InterfaceC626120Oh8<? super C098L<K, V>> LL;
    public final InterfaceC1487280oo2<? super T, ? extends K> LLILLJJLI;
    public final InterfaceC1487280oo2<? super T, ? extends V> LLILLL;
    public final int LLILZ;
    public final boolean LLILZIL;
    public InterfaceC420801kM LLIZ;
    public final AtomicBoolean LLIZLLLIL = new AtomicBoolean();
    public final Map<Object, C19500011Qw<K, V>> LLILZLL = new ConcurrentHashMap();

    @Override // X.InterfaceC420801kM
    public void dispose() {
        if (this.LLIZLLLIL.compareAndSet(false, true) && decrementAndGet() == 0) {
            this.LLIZ.dispose();
        }
    }

    @Override // X.InterfaceC420801kM
    public boolean isDisposed() {
        return this.LLIZLLLIL.get();
    }

    @Override // X.InterfaceC626120Oh8
    public void onComplete() {
        ArrayList arrayList = new ArrayList(((ConcurrentHashMap) this.LLILZLL).values());
        ((ConcurrentHashMap) this.LLILZLL).clear();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C19499711Qt<T, K> c19499711Qt = ((C19500011Qw) it2.next()).LLILLJJLI;
            c19499711Qt.LLILZIL = true;
            c19499711Qt.LIZ();
        }
        this.LL.onComplete();
    }

    public void cancel(K k) {
        if (k == null) {
            k = (K) LLJ;
        }
        ((ConcurrentHashMap) this.LLILZLL).remove(k);
        if (decrementAndGet() == 0) {
            this.LLIZ.dispose();
        }
    }

    @Override // X.InterfaceC626120Oh8
    public void onError(Throwable th) {
        ArrayList arrayList = new ArrayList(((ConcurrentHashMap) this.LLILZLL).values());
        ((ConcurrentHashMap) this.LLILZLL).clear();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C19499711Qt<T, K> c19499711Qt = ((C19500011Qw) it2.next()).LLILLJJLI;
            c19499711Qt.LLILZLL = th;
            c19499711Qt.LLILZIL = true;
            c19499711Qt.LIZ();
        }
        this.LL.onError(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC626120Oh8
    public void onNext(T t) throws Throwable {
        Object obj;
        try {
            K kApply = this.LLILLJJLI.apply(t);
            if (kApply == null) {
                obj = LLJ;
            } else {
                obj = kApply;
            }
            C19500011Qw c19500011Qw = (C19500011Qw) ((ConcurrentHashMap) this.LLILZLL).get(obj);
            if (c19500011Qw == null) {
                if (this.LLIZLLLIL.get()) {
                    return;
                }
                c19500011Qw = new C19500011Qw(kApply, new C19499711Qt(this.LLILZ, this, kApply, this.LLILZIL));
                ((ConcurrentHashMap) this.LLILZLL).put(obj, c19500011Qw);
                getAndIncrement();
                this.LL.onNext(c19500011Qw);
            }
            try {
                V vApply = this.LLILLL.apply(t);
                C1701890uOB.LIZ(vApply, "The value supplied is null");
                C19499711Qt<T, K> c19499711Qt = c19500011Qw.LLILLJJLI;
                c19499711Qt.LLILLJJLI.offer(vApply);
                c19499711Qt.LIZ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C11SP.LIZ(th);
                this.LLIZ.dispose();
                onError(th);
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C11SP.LIZ(th2);
            this.LLIZ.dispose();
            onError(th2);
        }
    }

    @Override // X.InterfaceC626120Oh8
    public void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (C11JE.validate(this.LLIZ, interfaceC420801kM)) {
            this.LLIZ = interfaceC420801kM;
            this.LL.onSubscribe(this);
        }
    }

    public C19499811Qu(InterfaceC626120Oh8<? super C098L<K, V>> interfaceC626120Oh8, InterfaceC1487280oo2<? super T, ? extends K> interfaceC1487280oo2, InterfaceC1487280oo2<? super T, ? extends V> interfaceC1487280oo22, int i, boolean z) {
        this.LL = interfaceC626120Oh8;
        this.LLILLJJLI = interfaceC1487280oo2;
        this.LLILLL = interfaceC1487280oo22;
        this.LLILZ = i;
        this.LLILZIL = z;
        lazySet(1);
    }
}
