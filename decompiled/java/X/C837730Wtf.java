package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.0Wtf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C837730Wtf implements InterfaceC837740Wtg {
    public static final C837730Wtf LIZ = new C837730Wtf();
    public static final CopyOnWriteArraySet<InterfaceC837740Wtg> LIZIZ = new CopyOnWriteArraySet<>();

    @Override // X.InterfaceC837740Wtg
    public final void LIZ(C825940Wae c825940Wae, C838040WuA c838040WuA) {
        Iterator<InterfaceC837740Wtg> it2 = LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(c825940Wae, c838040WuA);
        }
    }

    @Override // X.InterfaceC837740Wtg
    public final void LIZIZ(C825940Wae c825940Wae, C838040WuA c838040WuA) {
        Iterator<InterfaceC837740Wtg> it2 = LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ(c825940Wae, c838040WuA);
        }
    }
}
