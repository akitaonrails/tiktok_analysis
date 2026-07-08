package X;

import Y.AComparatorS514S0100000_15;
import com.bytedance.android.live.liveinteract.competition.states.event.CompetitionScoreChangeEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0beI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C981520beI {
    public final C981480beE LIZ;

    public final void LIZ() {
        this.LIZ.LJIILJJIL.clear();
        this.LIZ.LJIILL.clear();
        this.LIZ.LJIILLIIL.clear();
    }

    public C981520beI(C981480beE c981480beE) {
        this.LIZ = c981480beE;
    }

    public final void LIZIZ(DataChannel dataChannel) {
        if (dataChannel != null) {
            C981480beE c981480beE = this.LIZ;
            dataChannel.zW(CompetitionScoreChangeEvent.class, new C981900beu(c981480beE.LJIILJJIL, c981480beE.LJIILL, c981480beE.LJIILLIIL));
        }
    }

    public final void LJ(List<C982390bfh> list) {
        if (list.isEmpty()) {
            LIZ();
        } else {
            if (this.LIZ.LJIIL.isEmpty()) {
                for (C982390bfh c982390bfh : list) {
                    this.LIZ.LJIIL.add(new C981870ber(c982390bfh.LIZ, c982390bfh.LJI));
                }
            }
            boolean z = true;
            for (C982390bfh c982390bfh2 : list) {
                C982390bfh c982390bfh3 = this.LIZ.LJIILL.get(Long.valueOf(c982390bfh2.LIZ));
                if (c982390bfh3 != null && c982390bfh2.LIZLLL < c982390bfh3.LIZLLL) {
                    z = false;
                }
            }
            if (!z) {
                return;
            }
            this.LIZ.LJIILJJIL = new ArrayList(list);
            for (C982390bfh c982390bfh4 : list) {
                this.LIZ.LJIILL.put(Long.valueOf(c982390bfh4.LIZ), c982390bfh4);
                Iterator<C982710bgD> it2 = c982390bfh4.LJI.iterator();
                while (it2.hasNext()) {
                    this.LIZ.LJIILLIIL.put(Long.valueOf(it2.next().LIZ), c982390bfh4);
                }
            }
        }
        Map<Long, C982390bfh> map = C973920bS2.LJFF;
        ((LinkedHashMap) map).clear();
        map.putAll(this.LIZ.LJIILLIIL);
    }

    public final void LJFF(List<C981870ber> list) {
        this.LIZ.LJIIL.clear();
        this.LIZ.LJIIL = new ArrayList(list);
        long j = 0;
        for (C981870ber c981870ber : list) {
            Iterator<C982710bgD> it2 = c981870ber.LIZIZ.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C982710bgD next = it2.next();
                if (next.LIZ == this.LIZ.LJFF) {
                    if (next != null) {
                        j = c981870ber.LIZ;
                    }
                }
            }
            List<C982710bgD> list2 = c981870ber.LIZIZ;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator<C982710bgD> it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList.add(Long.valueOf(it3.next().LIZ));
            }
            LIZJ(c981870ber.LIZ, arrayList);
        }
        if (this.LIZ.LJIIL.size() > 2 && this.LIZ.LJIIL.size() == this.LIZ.LJI.size()) {
            int size = this.LIZ.LJIIL.size();
            for (int i = 1; i < size; i++) {
                C981870ber c981870ber2 = (C981870ber) ListProtector.get(this.LIZ.LJIIL, i);
                int size2 = this.LIZ.LJI.size();
                for (int i2 = 1; i2 < size2; i2++) {
                    if (((C954460awe) ListProtector.get(this.LIZ.LJI, i2)).LJ == c981870ber2.LIZ && i2 != i) {
                        List<C981870ber> list3 = this.LIZ.LJIIL;
                        ListProtector.set(list3, i, ListProtector.set(list3, i2, c981870ber2));
                    }
                }
            }
        }
        this.LIZ.LJIILIIL = j;
    }

    public final void LIZJ(long j, List<Long> list) {
        C981870ber next;
        EnumC982700bgC enumC982700bgC;
        if (list.isEmpty()) {
            return;
        }
        Iterator<C981870ber> it2 = this.LIZ.LJIIL.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LIZ == j) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C981870ber c981870ber = next;
        if (c981870ber == null) {
            c981870ber = new C981870ber(j, C13BV.INSTANCE);
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<Long> it3 = list.iterator();
        while (it3.hasNext()) {
            long jLongValue = it3.next().longValue();
            if (jLongValue == this.LIZ.LJIIJJI) {
                enumC982700bgC = EnumC982700bgC.INVITER;
            } else {
                enumC982700bgC = EnumC982700bgC.INVITEE;
            }
            arrayList.add(new C982710bgD(jLongValue, enumC982700bgC, 0L));
        }
        c981870ber.LIZIZ = arrayList;
        if (!this.LIZ.LJIIL.contains(c981870ber)) {
            if (list.contains(Long.valueOf(this.LIZ.LJFF))) {
                ListProtector.add(this.LIZ.LJIIL, 0, c981870ber);
            } else {
                this.LIZ.LJIIL.add(c981870ber);
            }
        }
    }

    public final void LIZLLL(String str, List<C954460awe> list) {
        Object objRemove;
        C954460awe c954460awe = (C954460awe) C13LP.LJJJLL(list);
        if (c954460awe == null || c954460awe.LJ != this.LIZ.LJFF) {
            ArrayList arrayList = new ArrayList(list);
            Iterator<C954460awe> it2 = list.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (it2.next().LJ == this.LIZ.LJFF) {
                    if (i != -1 && (objRemove = ListProtector.remove(arrayList, i)) != null) {
                        ListProtector.add(arrayList, 0, objRemove);
                    }
                } else {
                    i++;
                }
            }
            list = arrayList;
        }
        List<C954460awe> list2 = this.LIZ.LJI;
        ArrayList arrayList2 = new ArrayList();
        for (C954460awe c954460awe2 : list2) {
            C954460awe c954460awe3 = c954460awe2;
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<C954460awe> it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList3.add(Long.valueOf(it3.next().LJ));
            }
            if (!arrayList3.contains(Long.valueOf(c954460awe3.LJ))) {
                arrayList2.add(c954460awe2);
            }
        }
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            C19719612Di.LJJIIJ(this.LIZ.LJIIL, new AwS594S0100000_15((C954460awe) it4.next(), 723), true);
        }
        C981480beE c981480beE = this.LIZ;
        c981480beE.LJI = list;
        c981480beE.LJII = C13LP.LJLLLL(new AComparatorS514S0100000_15(this, 13), list);
        StringBuilder sb = new StringBuilder("updateLinkedHostListAndTeams, source=");
        sb.append(str);
        sb.append(", linkedHostList.size=");
        sb.append(list.size());
        sb.append(", linkedHostList=");
        ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C954460awe> it5 = list.iterator();
        while (it5.hasNext()) {
            arrayList4.add(Long.valueOf(it5.next().LJ));
        }
        sb.append(arrayList4);
        sb.append(", linkedHostListSortByUid=");
        List<C954460awe> list3 = this.LIZ.LJII;
        ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(list3, 10));
        Iterator<C954460awe> it6 = list3.iterator();
        while (it6.hasNext()) {
            arrayList5.add(Long.valueOf(it6.next().LJ));
        }
        sb.append(arrayList5);
        C20441214yg.LIZIZ("CompetitionModelUpdater", sb.toString());
    }
}
