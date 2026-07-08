package X;

import Y.ARunnableS130S0100000_30;
import com.bytedance.scene.Scene;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.13Wz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20025513Wz implements InterfaceC21495019Ae {
    public final Function1<List<? extends InterfaceC214942199w>, Unit> LIZIZ;
    public final int LIZ = 5;
    public final C13E8<InterfaceC214942199w> LIZJ = new C13E8<>();
    public final ConcurrentHashMap<InterfaceC214942199w, C13X1> LIZLLL = new ConcurrentHashMap<>();

    @Override // X.InterfaceC21495019Ae
    public final void clear() {
        int size = this.LIZJ.size();
        this.LIZJ.clear();
        this.LIZLLL.clear();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[ReusePool] Pool cleared, removed ");
        sbLIZ.append(size);
        sbLIZ.append(" scenes");
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC21495019Ae
    public final boolean isEmpty() {
        return this.LIZJ.isEmpty();
    }

    public C20025513Wz(C1561490qjj c1561490qjj) {
        Float fValueOf;
        this.LIZIZ = c1561490qjj;
        if (((Boolean) C1834407Gk.LIZ.getValue()).booleanValue()) {
            fValueOf = Float.valueOf(0.75f);
        } else {
            fValueOf = ((Boolean) C1834407Gk.LIZIZ.getValue()).booleanValue() ? Float.valueOf(0.5f) : fValueOf;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[ReusePool] Finish init. maxCacheSize: ");
            sbLIZ.append(5);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        if (fValueOf != null) {
            new C0V4G(fValueOf.floatValue(), new ARunnableS130S0100000_30(this, 30)).LIZ();
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[ReusePool] Finish init. maxCacheSize: ");
        sbLIZ2.append(5);
        C2188811AlT.LIZIZ(sbLIZ2);
    }

    @Override // X.InterfaceC21495019Ae
    public final List LIZ(C13X3 c13x3) {
        C13E8<InterfaceC214942199w> c13e8 = this.LIZJ;
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC214942199w> it2 = c13e8.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        if (arrayList.isEmpty()) {
            return C13BV.INSTANCE;
        }
        this.LIZJ.removeAll(C13LP.LLIIJI(arrayList));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            this.LIZLLL.remove(it3.next());
        }
        arrayList.size();
        this.LIZJ.size();
        return arrayList;
    }

    @Override // X.InterfaceC21495019Ae
    public final boolean LIZIZ(InterfaceC214942199w interfaceC214942199w) {
        Function1<List<? extends InterfaceC214942199w>, Unit> function1;
        if (!interfaceC214942199w.W1()) {
            return false;
        }
        if (this.LIZJ.contains(interfaceC214942199w)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[ReusePool] Already exist in pool: ");
            sbLIZ.append(interfaceC214942199w);
            C2188811AlT.LIZIZ(sbLIZ);
            return false;
        }
        if (this.LIZJ.size() >= this.LIZ) {
            ArrayList arrayList = new ArrayList();
            InterfaceC214942199w interfaceC214942199wRemoveFirst = this.LIZJ.removeFirst();
            this.LIZLLL.remove(interfaceC214942199wRemoveFirst);
            arrayList.add(interfaceC214942199wRemoveFirst);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[ReusePool] Exceed maximum, remove the oldest: ");
            sbLIZ2.append(interfaceC214942199wRemoveFirst);
            C2188811AlT.LIZIZ(sbLIZ2);
            if (!arrayList.isEmpty() && (function1 = this.LIZIZ) != null) {
                function1.invoke(arrayList);
            }
        }
        this.LIZJ.addLast(interfaceC214942199w);
        this.LIZLLL.put(interfaceC214942199w, C13X1.RELEASED);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("[ReusePool] Added to pool: ");
        sbLIZ3.append(interfaceC214942199w);
        sbLIZ3.append(", current size: ");
        sbLIZ3.append(this.LIZJ.size());
        C2188811AlT.LIZIZ(sbLIZ3);
        return true;
    }

    @Override // X.InterfaceC21495019Ae
    public final Scene LIZJ(C13X2 c13x2) {
        InterfaceC214942199w next;
        Iterator<InterfaceC214942199w> it2 = this.LIZJ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (c13x2.LIZ(next)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        InterfaceC214942199w interfaceC214942199w = next;
        if (interfaceC214942199w == null) {
            return null;
        }
        this.LIZJ.remove(interfaceC214942199w);
        this.LIZLLL.put(interfaceC214942199w, C13X1.REUSED);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[ReusePool] Reuse: ");
        sbLIZ.append(interfaceC214942199w);
        sbLIZ.append(", remain: ");
        sbLIZ.append(this.LIZJ.size());
        C2188811AlT.LIZIZ(sbLIZ);
        return (Scene) interfaceC214942199w;
    }

    @Override // X.InterfaceC21495019Ae
    public final C13X1 LIZLLL(InterfaceC214942199w interfaceC214942199w) {
        C13X1 c13x1 = this.LIZLLL.get(interfaceC214942199w);
        if (c13x1 == null) {
            return C13X1.INITED;
        }
        return c13x1;
    }
}
