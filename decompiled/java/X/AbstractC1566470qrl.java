package X;

import X.AbstractC1566610qrz;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qrl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public abstract class AbstractC1566470qrl<T extends AbstractC1566610qrz> implements InterfaceC1566430qrh<T> {
    public final ArrayList<Function1<AbstractC1566610qrz, Unit>> LL = new ArrayList<>();

    @Override // X.InterfaceC1566430qrh
    public final void LIZIZ(C1566440qri c1566440qri) {
        this.LL.add(c1566440qri);
    }

    public final void LIZJ(T t) {
        Iterator it2 = new ArrayList(this.LL).iterator();
        while (it2.hasNext()) {
            ((Function1) it2.next()).invoke(t);
        }
    }
}
