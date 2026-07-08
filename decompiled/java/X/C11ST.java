package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.Config;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11ST, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11ST<T> extends AtomicReference<Object> implements C11SW<T> {
    public static final long serialVersionUID = -733876083048047795L;
    public final List<Object> LL;
    public volatile boolean LLILLJJLI;
    public volatile int LLILLL;

    public C11ST() {
        C1701890uOB.LIZIZ(16, "capacityHint");
        this.LL = new ArrayList(16);
    }

    public final void LIZ(C11SV<T> c11sv) {
        int iIntValue;
        int i;
        if (c11sv.getAndIncrement() != 0) {
            return;
        }
        List<Object> list = this.LL;
        InterfaceC626120Oh8<? super T> interfaceC626120Oh8 = c11sv.LL;
        Integer num = (Integer) c11sv.LLILLL;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
            c11sv.LLILLL = 0;
        }
        int iAddAndGet = 1;
        while (!c11sv.LLILZ) {
            int i2 = this.LLILLL;
            while (i2 != iIntValue) {
                if (c11sv.LLILZ) {
                    c11sv.LLILLL = null;
                    return;
                }
                Config config = (Object) ListProtector.get(list, iIntValue);
                if (this.LLILLJJLI && (i = iIntValue + 1) == i2 && i == (i2 = this.LLILLL)) {
                    if (C11PO.isComplete(config)) {
                        interfaceC626120Oh8.onComplete();
                    } else {
                        interfaceC626120Oh8.onError(C11PO.getError(config));
                    }
                    c11sv.LLILLL = null;
                    c11sv.LLILZ = true;
                    return;
                }
                interfaceC626120Oh8.onNext(config);
                iIntValue++;
            }
            if (iIntValue == this.LLILLL) {
                c11sv.LLILLL = Integer.valueOf(iIntValue);
                iAddAndGet = c11sv.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
        c11sv.LLILLL = null;
    }
}
