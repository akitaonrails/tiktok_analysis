package X;

import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.0Pf3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C650310Pf3 {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(552));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(553));
    public int LIZJ;

    public final CopyOnWriteArrayList<WeakReference<InterfaceC650320Pf4<?>>> LIZJ() {
        return (CopyOnWriteArrayList) this.LIZIZ.getValue();
    }

    public final void LIZLLL() {
        this.LIZJ++;
        EventBus.LIZLLL().LJIJJ(this);
    }

    public final void LJ() {
        int i = this.LIZJ - 1;
        this.LIZJ = i;
        if (i <= 0) {
            EventBus.LIZLLL().LJJI(this);
            LIZJ().clear();
            this.LIZJ = 0;
        }
    }

    public final void LIZ(InterfaceC650320Pf4<?> interfaceC650320Pf4) {
        LIZJ().add(new WeakReference<>(interfaceC650320Pf4));
    }

    public final void LIZIZ(Object obj) {
        for (WeakReference<InterfaceC650320Pf4<?>> weakReference : LIZJ()) {
            InterfaceC650320Pf4<?> interfaceC650320Pf4 = weakReference.get();
            if (interfaceC650320Pf4 == null) {
                LIZJ().remove(weakReference);
            } else if (Intrinsics.LJFF(interfaceC650320Pf4.LIZ(), obj.getClass())) {
                interfaceC650320Pf4.LIZIZ(obj);
            }
        }
    }

    public final void LJFF(InterfaceC650320Pf4<?> interfaceC650320Pf4) {
        for (WeakReference<InterfaceC650320Pf4<?>> weakReference : LIZJ()) {
            InterfaceC650320Pf4<?> interfaceC650320Pf42 = weakReference.get();
            if (interfaceC650320Pf42 == null || Intrinsics.LJFF(interfaceC650320Pf42, interfaceC650320Pf4)) {
                LIZJ().remove(weakReference);
            }
        }
    }
}
