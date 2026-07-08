package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0RWi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C697180RWi implements C0RYJ {
    public final C01GW LIZ = C452501pT.LIZIZ(new C697200RWk());

    public final ConcurrentHashMap<EnumC697700RYi, InterfaceC697190RWj<? extends FcpNodeProtocol>> LIZJ() {
        return (ConcurrentHashMap) this.LIZ.getValue();
    }

    @Override // X.C0RYJ
    public final Map<EnumC697700RYi, InterfaceC697190RWj<? extends FcpNodeProtocol>> LIZ() {
        return LIZJ();
    }

    @Override // X.C0RYJ
    public final List<String> LIZIZ() {
        Collection<InterfaceC697190RWj<? extends FcpNodeProtocol>> collectionValues = LIZJ().values();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(collectionValues, 10));
        Iterator<T> it2 = collectionValues.iterator();
        while (it2.hasNext()) {
            arrayList.add(((InterfaceC697190RWj) it2.next()).Aa());
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C19719612Di.LJJI(((Map) it3.next()).keySet(), arrayList2);
        }
        return C13LP.LJLLJ(C13LP.LJJJJI(C13LP.LLIIII(arrayList2)));
    }

    public final void LJ() {
        LIZJ().clear();
    }

    public final void LJII() {
        Iterator<T> it2 = LIZJ().values().iterator();
        while (it2.hasNext()) {
            ((InterfaceC697190RWj) it2.next()).unBind();
        }
    }

    public final void LJIIIIZZ() {
        ConcurrentHashMap<EnumC697700RYi, InterfaceC697190RWj<? extends FcpNodeProtocol>> concurrentHashMapLIZJ = LIZJ();
        ArrayList arrayList = new ArrayList(concurrentHashMapLIZJ.size());
        Iterator<Map.Entry<EnumC697700RYi, InterfaceC697190RWj<? extends FcpNodeProtocol>>> it2 = concurrentHashMapLIZJ.entrySet().iterator();
        while (it2.hasNext()) {
            it2.next().getValue().ya();
            arrayList.add(Unit.LIZ);
        }
    }

    public final void LIZLLL(VideoItemParams videoItemParams) {
        ConcurrentHashMap<EnumC697700RYi, InterfaceC697190RWj<? extends FcpNodeProtocol>> concurrentHashMapLIZJ = LIZJ();
        ArrayList arrayList = new ArrayList(concurrentHashMapLIZJ.size());
        Iterator<Map.Entry<EnumC697700RYi, InterfaceC697190RWj<? extends FcpNodeProtocol>>> it2 = concurrentHashMapLIZJ.entrySet().iterator();
        while (it2.hasNext()) {
            it2.next().getValue().xa(videoItemParams);
            arrayList.add(Unit.LIZ);
        }
    }

    public final void LJFF(boolean z) {
        ConcurrentHashMap<EnumC697700RYi, InterfaceC697190RWj<? extends FcpNodeProtocol>> concurrentHashMapLIZJ = LIZJ();
        ArrayList arrayList = new ArrayList(concurrentHashMapLIZJ.size());
        Iterator<Map.Entry<EnumC697700RYi, InterfaceC697190RWj<? extends FcpNodeProtocol>>> it2 = concurrentHashMapLIZJ.entrySet().iterator();
        while (it2.hasNext()) {
            it2.next().getValue().wa(z);
            arrayList.add(Unit.LIZ);
        }
    }

    public final void LJI(InterfaceC697190RWj<? extends FcpNodeProtocol> interfaceC697190RWj) {
        LIZJ().put(interfaceC697190RWj.Ca(), interfaceC697190RWj);
    }
}
