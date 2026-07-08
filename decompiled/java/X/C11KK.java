package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AwS395S0200000_29;

/* JADX INFO: renamed from: X.11KK, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C11KK<T> extends AtomicReference<InterfaceC420801kM> implements InterfaceC626120Oh8<T>, InterfaceC420801kM {
    public T LL;
    public final AtomicBoolean LLILLJJLI = new AtomicBoolean(true);
    public final List<C11JQ<T, ?>> deliveries = new CopyOnWriteArrayList();

    @Override // X.InterfaceC626120Oh8
    public void onComplete() {
    }

    @Override // X.InterfaceC626120Oh8
    public void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
    }

    @Override // X.InterfaceC420801kM
    public void dispose() {
        InterfaceC420801kM interfaceC420801kM = get();
        C11KL c11kl = C11KM.LIZ;
        if (interfaceC420801kM != c11kl) {
            this.deliveries.clear();
            InterfaceC420801kM andSet = getAndSet(c11kl);
            if (andSet == c11kl || andSet == null) {
                return;
            }
            andSet.dispose();
        }
    }

    @Override // X.InterfaceC420801kM
    public boolean isDisposed() {
        return get() == C11KM.LIZ;
    }

    public AtomicBoolean isActive() {
        return this.LLILLJJLI;
    }

    public final void addDelivery(C11JQ<T, ?> c11jq) {
        this.deliveries.add(c11jq);
        dispatchValue(c11jq, this.LL);
    }

    @Override // X.InterfaceC626120Oh8
    public void onError(Throwable th) {
        if (!isDisposed()) {
            lazySet(C11KM.LIZ);
        }
    }

    @Override // X.InterfaceC626120Oh8
    public void onNext(T t) {
        AwS395S0200000_29 awS395S0200000_29 = new AwS395S0200000_29(this, (C11KK<int>) t, 62);
        Iterator<C11JQ<T, ?>> it2 = this.deliveries.iterator();
        while (it2.hasNext()) {
            awS395S0200000_29.invoke(it2.next());
        }
    }

    public final void removeDelivery(C11JQ<T, ?> c11jq) {
        this.deliveries.remove(c11jq);
    }

    public final void dispatchValue(C11JQ<T, ?> c11jq, T t) {
        if (t == null) {
            return;
        }
        try {
            c11jq.operateNextValue(t);
            this.LL = t;
            if (isActive().get()) {
                c11jq.onActive(false);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            removeDelivery(c11jq);
            c11jq.getWhenError().invoke(e);
        }
    }
}
