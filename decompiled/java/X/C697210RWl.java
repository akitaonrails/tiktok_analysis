package X;

import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.VideoTagContainer;
import com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol;
import com.ss.android.ugc.feed.platform.componentmanager.IFcpPolicyAbility;
import com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: renamed from: X.0RWl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C697210RWl implements InterfaceC697190RWj<PriorityProtocol> {
    public final AbstractC738140SxQ LL;
    public final Function0<FeedComponentPriorityData> LLILLJJLI;
    public final Function0<VideoItemParams> LLILLL;
    public final boolean LLILZ;
    public final EnumC697700RYi LLILZIL;
    public final IFcpPolicyAbility LLILZLL;
    public InterfaceC697120RWc LLIZ;
    public ViewGroup LLIZLLLIL;
    public final ConcurrentHashMap<String, InterfaceC697230RWn> LLJ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, String> LLJI = new ConcurrentHashMap<>();
    public final MutableLiveData<CopyOnWriteArrayList<PriorityProtocol>> LLJIJIL;

    @Override // X.InterfaceC697190RWj
    public final void wa(boolean z) {
    }

    @Override // X.InterfaceC697190RWj
    public final void xa(VideoItemParams videoItemParams) {
    }

    @Override // X.InterfaceC697190RWj
    public final void ya() {
    }

    public final ConcurrentHashMap<String, String> LIZ() {
        Map<String, C0RWU> config;
        if (this.LLJI.isEmpty()) {
            ConcurrentHashMap<String, String> concurrentHashMap = this.LLJI;
            ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
            InterfaceC697120RWc interfaceC697120RWc = this.LLIZ;
            if (interfaceC697120RWc != null && (config = interfaceC697120RWc.getConfig()) != null) {
                for (Map.Entry<String, C0RWU> entry : config.entrySet()) {
                    Set<String> setLIZJ = entry.getValue().LIZLLL.LIZJ();
                    String str = entry.getValue().LIZ;
                    if (setLIZJ != null && !setLIZJ.isEmpty()) {
                        Iterator<T> it2 = setLIZJ.iterator();
                        while (it2.hasNext()) {
                            concurrentHashMap2.put(it2.next(), str);
                        }
                    }
                }
            }
            concurrentHashMap.putAll(concurrentHashMap2);
        }
        return this.LLJI;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final ConcurrentHashMap<String, InterfaceC697230RWn> LIZIZ() {
        Map<String, C0RWU> config;
        if (this.LLJ.isEmpty()) {
            ConcurrentHashMap<String, InterfaceC697230RWn> concurrentHashMap = this.LLJ;
            ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
            InterfaceC697120RWc interfaceC697120RWc = this.LLIZ;
            if (interfaceC697120RWc != null && (config = interfaceC697120RWc.getConfig()) != null) {
                Iterator<Map.Entry<String, C0RWU>> it2 = config.entrySet().iterator();
                while (it2.hasNext()) {
                    C0RWU value = it2.next().getValue();
                    C0RYB c0ryb = new C0RYB(value.LIZIZ);
                    C259800zU c259800zU = new C259800zU();
                    c259800zU.element = value.LIZIZ;
                    C701370RfD c701370RfD = new C701370RfD();
                    AbstractC738140SxQ abstractC738140SxQ = this.LL;
                    final String key = ((EnumC697700RYi) c259800zU.element).getKey();
                    c701370RfD.N7(new C696020RRw(abstractC738140SxQ, new FcpNodeProtocol() { // from class: com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocolKt$createFcpNodeProtocol$1
                        @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
                        public final InterfaceC701260Rf2 vk() {
                            return null;
                        }

                        @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
                        public final InterfaceC700000Rd0 wb1() {
                            return null;
                        }

                        @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
                        public final String LLLII() {
                            return H3();
                        }

                        @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
                        public final String H3() {
                            return key;
                        }
                    }, new C0RXR(this)), ((EnumC697700RYi) c259800zU.element).getKey(), C0S9M.LIZ(), this.LLILLJJLI, new C697330RWx(this.LLILLL, new C697150RWf(this)), new C0RXN(this), new C697250RWp(this, c259800zU), C0RXA.LL, value.LJ, null, new AwS555S0100000_11(this, 1551), new AwS555S0100000_11(this, 1552), null, null, null, null, null);
                    C0RY5 c0ry5 = new C0RY5(c0ryb, c701370RfD, this.LLILZ);
                    concurrentHashMap2.put(value.LIZ, c0ry5);
                    c0ry5.ts(value.LIZJ, value.LIZLLL, null);
                    ViewGroup viewGroup = this.LLIZLLLIL;
                    if (viewGroup != null) {
                        viewGroup.addView(value.LIZJ);
                    }
                    if (C1866840ygE.LIZ()) {
                        C0RCN.LIZJ(value.LIZJ, value.LIZ, this.LLIZLLLIL, null);
                    }
                }
            }
            concurrentHashMap.putAll(concurrentHashMap2);
        }
        return this.LLJ;
    }

    @Override // X.InterfaceC697190RWj
    public final Map<String, PriorityProtocol> Aa() {
        Collection<Map<String, PriorityProtocol>> collectionValues = LIZJ().values();
        ArrayList<Map.Entry> arrayList = new ArrayList();
        Iterator<T> it2 = collectionValues.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((Map) it2.next()).entrySet(), arrayList);
        }
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (Map.Entry entry : arrayList) {
            Pair pair = new Pair(entry.getKey(), entry.getValue());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    @Override // X.InterfaceC697190RWj
    public final Map<String, PriorityProtocol> Ba() {
        Collection<Map<String, PriorityProtocol>> collectionValues = LIZLLL().values();
        ArrayList<Map.Entry> arrayList = new ArrayList();
        Iterator<T> it2 = collectionValues.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((Map) it2.next()).entrySet(), arrayList);
        }
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (Map.Entry entry : arrayList) {
            Pair pair = new Pair(entry.getKey(), entry.getValue());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    public final Map<String, Map<String, PriorityProtocol>> LIZJ() {
        ConcurrentHashMap<String, InterfaceC697230RWn> concurrentHashMapLIZIZ = LIZIZ();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(concurrentHashMapLIZIZ.size()));
        Iterator<T> it2 = concurrentHashMapLIZIZ.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            linkedHashMap.put(entry.getKey(), ((InterfaceC697190RWj) entry.getValue()).Aa());
        }
        Map<String, Map<String, PriorityProtocol>> mapLJIIZILJ = C2097608Jq.LJIIZILJ(linkedHashMap);
        return (!(mapLJIIZILJ instanceof Map) || mapLJIIZILJ == null) ? C2097608Jq.LJ() : mapLJIIZILJ;
    }

    public final Map<String, Map<String, PriorityProtocol>> LIZLLL() {
        ConcurrentHashMap<String, InterfaceC697230RWn> concurrentHashMapLIZIZ = LIZIZ();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(concurrentHashMapLIZIZ.size()));
        Iterator<T> it2 = concurrentHashMapLIZIZ.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            linkedHashMap.put(entry.getKey(), ((InterfaceC697190RWj) entry.getValue()).Ba());
        }
        Map<String, Map<String, PriorityProtocol>> mapLJIIZILJ = C2097608Jq.LJIIZILJ(linkedHashMap);
        return (!(mapLJIIZILJ instanceof Map) || mapLJIIZILJ == null) ? C2097608Jq.LJ() : mapLJIIZILJ;
    }

    public final void reset() {
        Iterator<T> it2 = LIZIZ().values().iterator();
        while (it2.hasNext()) {
            ((InterfaceC697230RWn) it2.next()).reset();
        }
    }

    @Override // X.InterfaceC697190RWj
    public final Map<String, PriorityProtocol> za() {
        ConcurrentHashMap<String, InterfaceC697230RWn> concurrentHashMapLIZIZ = LIZIZ();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(concurrentHashMapLIZIZ.size()));
        Iterator<T> it2 = concurrentHashMapLIZIZ.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            linkedHashMap.put(entry.getKey(), ((InterfaceC697190RWj) entry.getValue()).za());
        }
        Collection collectionValues = C2097608Jq.LJIIZILJ(linkedHashMap).values();
        ArrayList<Map.Entry> arrayList = new ArrayList();
        Iterator it3 = collectionValues.iterator();
        while (it3.hasNext()) {
            C19719612Di.LJJI(((Map) it3.next()).entrySet(), arrayList);
        }
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iLIZIZ);
        for (Map.Entry entry2 : arrayList) {
            Pair pair = new Pair(entry2.getKey(), entry2.getValue());
            linkedHashMap2.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap2;
    }

    @Override // X.InterfaceC697190RWj
    public final EnumC697700RYi Ca() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC697190RWj
    public final void unBind() {
        reset();
    }

    public final void LJ(boolean z) {
        Iterator<T> it2 = LIZIZ().values().iterator();
        while (it2.hasNext()) {
            ((InterfaceC697230RWn) it2.next()).js(null, z, true);
        }
    }

    public C697210RWl(VideoTagContainer videoTagContainer, C0RWW c0rww, C0RWY c0rwy, boolean z, EnumC697700RYi enumC697700RYi, IFcpPolicyAbility iFcpPolicyAbility) {
        this.LL = videoTagContainer;
        this.LLILLJJLI = c0rww;
        this.LLILLL = c0rwy;
        this.LLILZ = z;
        this.LLILZIL = enumC697700RYi;
        this.LLILZLL = iFcpPolicyAbility;
        MutableLiveData<CopyOnWriteArrayList<PriorityProtocol>> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(new CopyOnWriteArrayList<>());
        this.LLJIJIL = mutableLiveData;
    }
}
