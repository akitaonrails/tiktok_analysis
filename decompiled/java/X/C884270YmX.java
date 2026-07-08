package X;

import Y.AComparatorS33S0000000_14;
import com.ss.android.ugc.aweme.im.core.chatlist.impl.actor.ChatListMultiThreadActor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AwS132S0110000_14;
import kotlin.jvm.internal.AwS415S0200000_14;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0YmX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C884270YmX implements InterfaceC884020Ym8 {
    public final InterfaceC884640Yn8 LIZ;
    public final List<Pair<InterfaceC884250YmV, InterfaceC878560YdK>> LIZIZ;
    public final List<InterfaceC884940Ync> LIZJ;
    public final List<InterfaceC884950Ynd> LIZLLL;
    public final C884690YnD LJ;
    public final InterfaceC884800YnO LJFF;
    public final InterfaceC884870YnV LJI;
    public boolean LJII;
    public volatile boolean LJIIJ;
    public C884730YnH LJIIL;
    public List<? extends InterfaceC884440Ymo> LJIIZILJ;
    public List<? extends InterfaceC884440Ymo> LJIJ;
    public boolean LJIJI;
    public C09AE LJJI;
    public volatile C09AE LJJIFFI;
    public volatile C09AE LJJII;
    public volatile C09AE LJJIII;
    public volatile C09AE LJJIIJ;
    public volatile boolean LJJIIJZLJL;
    public int LJJIIZI;
    public int LJJIJ;
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new C884350Ymf());
    public final C01GW LJIIIZ = C452501pT.LIZIZ(new C884340Yme());
    public String LJIIJJI = "";
    public final String LJIILIIL = "ChatListPageHandle";
    public final C01GW LJIILJJIL = C452501pT.LIZIZ(new C884320Ymc());
    public final C01GW LJIILL = C452501pT.LIZIZ(new C884300Yma());
    public final C01GW LJIILLIIL = C452501pT.LIZIZ(new C884310Ymb());
    public final C01GW LJIJJ = C452501pT.LIZIZ(new C884360Ymg());
    public final C01GW LJIJJLI = C452501pT.LIZIZ(new C884290YmZ());
    public final C01GW LJIL = C452501pT.LIZIZ(new C884280YmY());
    public final C01GW LJJ = C452501pT.LIZIZ(new C884330Ymd());
    public C878550YdJ LJJIIZ = new C878550YdJ(false, (C877600Ybm) null, 7);

    @Override // X.InterfaceC883880Ylu
    public final void LIZJ() {
        for (InterfaceC884940Ync interfaceC884940Ync : this.LIZJ) {
            if (interfaceC884940Ync instanceof C884470Ymr) {
                C309160C9y.LIZ();
                C884470Ymr c884470Ymr = (C884470Ymr) interfaceC884940Ync;
                Collection<InterfaceC884440Ymo> collectionValues = LJIIL().values();
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(collectionValues, 10));
                Iterator<T> it2 = collectionValues.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((InterfaceC884440Ymo) it2.next()).copyData());
                }
                c884470Ymr.LJIIJ(this, new ArrayList(arrayList));
                return;
            }
        }
    }

    @Override // X.InterfaceC883880Ylu
    public final void LIZLLL() {
        C1729806q0.LIZJ(this.LIZ.getKey(), new AwS558S0100000_14(this, 1463));
    }

    @Override // X.InterfaceC883880Ylu
    public final void LJ() {
        for (InterfaceC884940Ync interfaceC884940Ync : this.LIZJ) {
            if (interfaceC884940Ync instanceof C884470Ymr) {
                C309160C9y.LIZ();
                if (this.LJIJ != null) {
                    C309160C9y.LIZ();
                    return;
                } else {
                    ((C884470Ymr) interfaceC884940Ync).LIZLLL(this);
                    return;
                }
            }
        }
    }

    public final List<InterfaceC884050YmB> LJI() {
        return (List) this.LJJ.getValue();
    }

    public final C884720YnG LJII() {
        return (C884720YnG) this.LJIJJ.getValue();
    }

    public final Map<InterfaceC1491305sd, C879540Yeu<?>> LJIIIIZZ() {
        return (Map) this.LJIILL.getValue();
    }

    public final Map<C884710YnF, Set<InterfaceC1491305sd>> LJIIIZ() {
        return (Map) this.LJIL.getValue();
    }

    public final Map<C884710YnF, Set<InterfaceC1491305sd>> LJIIJ() {
        return (Map) this.LJIJJLI.getValue();
    }

    @Override // X.InterfaceC883880Ylu
    public final boolean LJIIJJI() {
        return this.LJJIIZ.LIZ;
    }

    public final Map<InterfaceC1491305sd, InterfaceC884440Ymo> LJIIL() {
        return (Map) this.LJIILLIIL.getValue();
    }

    public final Map<InterfaceC1491305sd, C879540Yeu<?>> LJIILIIL() {
        return (Map) this.LJIILJJIL.getValue();
    }

    public final void LJIILL() {
        List<InterfaceC882100Yj2> list;
        Iterator<InterfaceC884940Ync> it2 = this.LIZJ.iterator();
        while (it2.hasNext()) {
            it2.next().LJI(this.LIZ.getKey());
        }
        LJIILIIL().clear();
        LJIIIIZZ().clear();
        LJIIL().clear();
        this.LJIIZILJ = null;
        this.LJIJ = null;
        LJII().LIZ();
        LJIIJ().clear();
        LJIIIZ().clear();
        LJI().clear();
        C09AE c09ae = this.LJJI;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        C09AE c09ae2 = this.LJJIFFI;
        if (c09ae2 != null) {
            c09ae2.LIZIZ(null);
        }
        C09AE c09ae3 = this.LJJII;
        if (c09ae3 != null) {
            c09ae3.LIZIZ(null);
        }
        C09AE c09ae4 = this.LJJIII;
        if (c09ae4 != null) {
            c09ae4.LIZIZ(null);
        }
        C09AE c09ae5 = this.LJJIIJ;
        if (c09ae5 != null) {
            c09ae5.LIZIZ(null);
        }
        if (C880900Yh6.LIZ()) {
            ChatListMultiThreadActor chatListMultiThreadActor = ChatListMultiThreadActor.LIZ;
            ChatListMultiThreadActor.LIZLLL(this.LIZ.getKey());
        }
        this.LJJI = null;
        this.LJJIFFI = null;
        this.LJJII = null;
        this.LJJIII = null;
        this.LJJIIJ = null;
        for (Pair<InterfaceC884250YmV, InterfaceC878560YdK> pair : this.LIZIZ) {
            InterfaceC884250YmV first = pair.getFirst();
            InterfaceC878560YdK second = pair.getSecond();
            first.LJ(second);
            first.LJIIL(second);
        }
        C884730YnH c884730YnH = this.LJIIL;
        if (c884730YnH == null || (list = c884730YnH.LJI) == null) {
            return;
        }
        Iterator<InterfaceC882100Yj2> it3 = list.iterator();
        while (it3.hasNext()) {
            it3.next().LJI(this.LIZ.getKey());
        }
    }

    @Override // X.InterfaceC883880Ylu
    public final void clearCache() {
        C1729806q0.LIZJ(this.LIZ.getKey(), new AwS558S0100000_14(this, 1462));
    }

    @Override // X.InterfaceC883880Ylu
    public final void LJJJJZI() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPageShow page=");
        sbLIZ.append(this.LIZ.getKey());
        sbLIZ.append(", loadMoreCanceledByPageHide: ");
        sbLIZ.append(this.LJJIIJZLJL);
        C2188811AlT.LIZIZ(sbLIZ);
        C309160C9y.LIZ();
        for (Pair<InterfaceC884250YmV, InterfaceC878560YdK> pair : this.LIZIZ) {
            pair.getFirst().LJII(pair.getSecond());
        }
        if (this.LJJIIJZLJL) {
            this.LJJIIJZLJL = false;
            if (LIZIZ(false).isEmpty()) {
                LJFF(false);
            }
            c5("load_more_on_page_show_again");
        }
    }

    @Override // X.InterfaceC883880Ylu
    public final void LJLLLLLL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPageHide page=");
        sbLIZ.append(this.LIZ.getKey());
        C2188811AlT.LIZIZ(sbLIZ);
        C309160C9y.LIZ();
        C884690YnD c884690YnD = this.LJ;
        if (c884690YnD != null) {
            c884690YnD.LJ();
        }
        C09AE c09ae = this.LJJIII;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
            if (!c09ae.isCompleted()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onPageHide and cancel a loadMoreJob which is not completed yet, set loadMoreCanceledByPageHide true, pageKey: ");
                sbLIZ2.append(this.LIZ.getKey());
                C2188811AlT.LIZIZ(sbLIZ2);
                C309160C9y.LIZ();
                this.LJJIIJZLJL = true;
            }
        }
        if (!C880900Yh6.LIZIZ()) {
            this.LJJIIJ = C1729806q0.LIZ(this.LIZ.getKey(), new C884230YmT(this, null));
            return;
        }
        for (Pair<InterfaceC884250YmV, InterfaceC878560YdK> pair : this.LIZIZ) {
            pair.getFirst().LJIIJJI(pair.getSecond());
        }
    }

    @Override // X.InterfaceC884020Ym8
    public final InterfaceC884640Yn8 getConfig() {
        return this.LIZ;
    }

    @Override // X.InterfaceC883880Ylu
    public final void LIZ(InterfaceC884050YmB interfaceC884050YmB) {
        C1729806q0.LIZJ(this.LIZ.getKey(), new AwS415S0200000_14(this, interfaceC884050YmB, 103));
    }

    @Override // X.InterfaceC883880Ylu
    public final List<InterfaceC884440Ymo> LIZIZ(boolean z) {
        List listLJLLLL;
        if (this.LJIIJ) {
            listLJLLLL = C13LP.LJLLLL(new AComparatorS33S0000000_14(19), LJIIL().values());
        } else if (z || (listLJLLLL = this.LJIJ) == null) {
            listLJLLLL = C13BV.INSTANCE;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getCurrentData size=");
        sbLIZ.append(listLJLLLL.size());
        sbLIZ.append(", page=");
        sbLIZ.append(this.LIZ.getKey());
        C2188811AlT.LIZIZ(sbLIZ);
        C309160C9y.LIZ();
        return listLJLLLL;
    }

    @Override // X.InterfaceC883880Ylu
    public final void LJFF(boolean z) {
        C1729806q0.LIZJ(this.LIZ.getKey(), new AwS132S0110000_14(z, this, 4));
    }

    public final void LJIILJJIL(InterfaceC884050YmB interfaceC884050YmB) {
        C1729806q0.LIZJ(this.LIZ.getKey(), new C884260YmW(this, interfaceC884050YmB));
    }

    @Override // X.InterfaceC883880Ylu
    public final void X0(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("refresh page=");
        sbLIZ.append(this.LIZ.getKey());
        C2188811AlT.LIZIZ(sbLIZ);
        C309160C9y.LIZ();
        this.LJJII = C1729806q0.LIZ(this.LIZ.getKey(), new C884220YmS(this, str, null));
    }

    @Override // X.InterfaceC883880Ylu
    public final void c5(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadMore, source=");
        sbLIZ.append(str);
        sbLIZ.append(", page=");
        sbLIZ.append(this.LIZ.getKey());
        C2188811AlT.LIZIZ(sbLIZ);
        C309160C9y.LIZ();
        if (!this.LJJIIZ.LIZ) {
            C309160C9y.LIZLLL(this.LJIILIIL);
        } else {
            this.LJJIII = C1729806q0.LIZ(this.LIZ.getKey(), new C884240YmU(this, str, null));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C884270YmX(InterfaceC884640Yn8 interfaceC884640Yn8, List<? extends Pair<? extends InterfaceC884250YmV, ? extends InterfaceC878560YdK>> list, List<? extends InterfaceC884940Ync> list2, List<? extends InterfaceC884950Ynd> list3, C884690YnD c884690YnD, InterfaceC884800YnO interfaceC884800YnO, InterfaceC884870YnV interfaceC884870YnV) {
        this.LIZ = interfaceC884640Yn8;
        this.LIZIZ = list;
        this.LIZJ = list2;
        this.LIZLLL = list3;
        this.LJ = c884690YnD;
        this.LJFF = interfaceC884800YnO;
        this.LJI = interfaceC884870YnV;
    }
}
