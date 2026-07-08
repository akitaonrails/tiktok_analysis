package X;

import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS268S0000000_26;

/* JADX INFO: renamed from: X.0vmw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1755680vmw {
    public final CopyOnWriteArrayList<WeakReference<InterfaceC1755830vnB>> LIZ = new CopyOnWriteArrayList<>();

    public final void LIZ(Function1<? super InterfaceC1755830vnB, Unit> function1) {
        Iterator<WeakReference<InterfaceC1755830vnB>> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            InterfaceC1755830vnB interfaceC1755830vnB = it2.next().get();
            if (interfaceC1755830vnB == null) {
                it2.remove();
            } else {
                function1.invoke(interfaceC1755830vnB);
            }
        }
    }

    public final void LIZIZ(InterfaceC1755830vnB interfaceC1755830vnB) {
        C19719612Di.LJJIIJ(this.LIZ, AFwS268S0000000_26.get$arr$(638), true);
        CopyOnWriteArrayList<WeakReference<InterfaceC1755830vnB>> copyOnWriteArrayList = this.LIZ;
        if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
            Iterator<WeakReference<InterfaceC1755830vnB>> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                if (it2.next().get() == interfaceC1755830vnB) {
                    return;
                }
            }
        }
        this.LIZ.add(new WeakReference<>(interfaceC1755830vnB));
    }
}
