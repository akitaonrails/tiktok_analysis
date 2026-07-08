package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AwS258S0300000_14;
import kotlin.jvm.internal.AwS415S0200000_14;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.0Yh9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C880930Yh9 implements InterfaceC882100Yj2 {
    public final C01GW LL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(381));
    public final String LLILLJJLI = "MessageRequestAggregationUpdater";
    public final String LLILLL = "message_request_aggregation_updater";
    public final C13BV LLILZ = C13BV.INSTANCE;
    public final ConcurrentHashMap<InterfaceC879010Ye3, Set<InterfaceC1491305sd>> LLILZIL = new ConcurrentHashMap<>();

    @Override // X.InterfaceC882100Yj2
    public final boolean LJFF() {
        return false;
    }

    @Override // X.InterfaceC882100Yj2
    public final C1490405sU<?> LJIIIIZZ(InterfaceC879010Ye3 interfaceC879010Ye3, C879540Yeu<?> c879540Yeu, AbstractC1491605sg<?> abstractC1491605sg, C1490405sU<?> c1490405sU) {
        return null;
    }

    @Override // X.InterfaceC882100Yj2
    public final C1490405sU LJIILL(InterfaceC879010Ye3 interfaceC879010Ye3, C879540Yeu c879540Yeu, AbstractC1491605sg abstractC1491605sg, C1490405sU c1490405sU) {
        return null;
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIILLIIL(InterfaceC879010Ye3 interfaceC879010Ye3, Collection<? extends C879540Yeu<?>> collection, Collection<? extends InterfaceC1491305sd> collection2, String str) {
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIIZILJ(InterfaceC879010Ye3 interfaceC879010Ye3, Collection collection, String str) {
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIJ() {
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIJI(InterfaceC879010Ye3 interfaceC879010Ye3, Collection<? extends C879540Yeu<?>> collection, String str, boolean z) {
    }

    @Override // X.InterfaceC882100Yj2
    public final C884710YnF LIZIZ() {
        return new C884710YnF(this.LLILLJJLI, false, false, true, true, false, false, Collections.singleton(C13LE.LIZ(C880930Yh9.class)), Collections.singleton(C13LE.LIZ(C879550Yev.class)), 102);
    }

    @Override // X.InterfaceC882100Yj2
    public final void LIZJ() {
        this.LLILZIL.clear();
        if (EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJJI(this);
        }
    }

    public final CopyOnWriteArrayList<InterfaceC1482905rH> LJIJJ() {
        return (CopyOnWriteArrayList) this.LL.getValue();
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIILJJIL() {
        LJIJJ().clear();
    }

    @Override // X.InterfaceC882100Yj2
    public final void init() {
        if (EventBus.LIZLLL().LJIIJ(this)) {
            return;
        }
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // X.InterfaceC882100Yj2
    public final String LIZ() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC882100Yj2
    public final InterfaceC1517005wm LIZLLL() {
        return C1491005sa.LIZ;
    }

    @Override // X.InterfaceC882100Yj2
    public final List<AbstractC1491605sg<?>> LJIILIIL() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC882100Yj2
    public final String getTag() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJ(InterfaceC879010Ye3 interfaceC879010Ye3) {
        this.LLILZIL.put(interfaceC879010Ye3, new LinkedHashSet());
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJI(InterfaceC879010Ye3 interfaceC879010Ye3) {
        this.LLILZIL.remove(interfaceC879010Ye3);
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIIJ(List<? extends InterfaceC1482905rH> list) {
        LJIJJ().addAll(list);
    }

    @C14EU
    public final void onAggregationUpdate(C880950YhB c880950YhB) {
        if (C880900Yh6.LIZ()) {
            for (InterfaceC879010Ye3 interfaceC879010Ye3 : Collections.list(this.LLILZIL.keys())) {
                C1729806q0.LIZJ(interfaceC879010Ye3, new AwS258S0300000_14(this, interfaceC879010Ye3, c880950YhB, 13));
            }
            return;
        }
        InterfaceC879010Ye3 interfaceC879010Ye32 = (InterfaceC879010Ye3) ListProtector.get(Collections.list(this.LLILZIL.keys()), 0);
        if (interfaceC879010Ye32 == null) {
            return;
        }
        C1729806q0.LIZJ(interfaceC879010Ye32, new AwS415S0200000_14(this, c880950YhB, 82));
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIIIZ(C879540Yeu c879540Yeu, InterfaceC879010Ye3 interfaceC879010Ye3) {
        C881320Yhm.LIZIZ(this, interfaceC879010Ye3, c879540Yeu);
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIIL(InterfaceC879010Ye3 interfaceC879010Ye3, Collection collection) {
        Set set = this.LLILZIL.get(interfaceC879010Ye3);
        if (set != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(collection, 10));
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                arrayList.add(((C879540Yeu) it2.next()).LIZIZ);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (obj instanceof C879580Yey) {
                    arrayList2.add(obj);
                }
            }
            set.addAll(arrayList2);
        }
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJII(InterfaceC879010Ye3 interfaceC879010Ye3, InterfaceC1491305sd interfaceC1491305sd, String str) {
        Set<InterfaceC1491305sd> set = this.LLILZIL.get(interfaceC879010Ye3);
        if (set != null) {
            set.remove(interfaceC1491305sd);
        }
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIIJJI(InterfaceC879010Ye3 interfaceC879010Ye3, C879540Yeu<?> c879540Yeu, InterfaceC879770YfH interfaceC879770YfH) {
        C881320Yhm.LIZ(this, interfaceC879010Ye3, c879540Yeu, interfaceC879770YfH);
    }
}
