package X;

import java.util.ArrayList;

/* JADX INFO: renamed from: X.11RV, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11RV<T> extends ArrayList<Object> implements C11RY<T> {
    public static final long serialVersionUID = 7063189396499112664L;
    public volatile int LL;

    public C11RV() {
        super(16);
    }

    @Override // X.C11RY
    public final void LJFF() {
        add(C11PO.complete());
        this.LL++;
    }

    @Override // X.C11RY
    public final void LJIJ(T t) {
        C11PO.next(t);
        add(t);
        this.LL++;
    }

    @Override // X.C11RY
    public final void LJIJI(Throwable th) {
        add(C11PO.error(th));
        this.LL++;
    }

    @Override // X.C11RY
    public final void LJIL(C11RX<T> c11rx) {
        int iIntValue;
        if (c11rx.getAndIncrement() != 0) {
            return;
        }
        InterfaceC626120Oh8<? super T> interfaceC626120Oh8 = c11rx.LLILLJJLI;
        int iAddAndGet = 1;
        while (!c11rx.LLILZ) {
            int i = this.LL;
            Integer num = (Integer) c11rx.LLILLL;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            while (iIntValue < i) {
                if (C11PO.accept(get(iIntValue), interfaceC626120Oh8) || c11rx.LLILZ) {
                    return;
                } else {
                    iIntValue++;
                }
            }
            c11rx.LLILLL = Integer.valueOf(iIntValue);
            iAddAndGet = c11rx.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }
}
