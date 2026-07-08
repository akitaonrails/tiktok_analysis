package Y;

import X.AbstractC1583720rJa;
import X.AbstractC1616100s9o;
import X.AbstractC21673619ry;
import X.C08JS;
import X.C09AE;
import X.C0DWP;
import X.C0N33;
import X.C0PEM;
import X.C1256850ioN;
import X.C13DA;
import X.C15438062q;
import X.C1576400r7m;
import X.C1585280rM6;
import X.C1615990s9d;
import X.C1616000s9e;
import X.C1616020s9g;
import X.C1697810uHb;
import X.C16FB;
import X.C1720106oR;
import X.C1954807lC;
import X.C1AF0;
import X.C1C7U;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C23250099c;
import X.EnumC1256840ioM;
import X.EnumC1585100rLo;
import X.EnumC1585300rM8;
import X.EnumC1607270rvZ;
import X.EnumC19356710o9;
import X.InterfaceC1570900qyu;
import X.InterfaceC1583770rJf;
import X.InterfaceC1606880ruw;
import X.InterfaceC1608850ry7;
import X.InterfaceC497601wk;
import X.InterfaceC713050Ry3;
import android.view.View;
import com.bytedance.hox.HoxFragmentGroup;
import com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.avatar.ui.AvatarDelegate;
import com.ss.android.ugc.aweme.vibefeed.feed.interact.msg.VibeMessageListAssem;
import com.ss.android.ugc.feed.platform.ab.FeedPagingDurationConfig;
import com.ss.android.ugc.feed.platform.panel.viewpager.ViewPagerPagingDurationComponent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes25.dex */
public class ARunnableS32S0400000_24 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        AbstractC21673619ry adapter;
        C16FB c16fb;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("list.computeVerticalScrollRange(): ");
        sbLIZ.append(((C0DWP) this.l0).computeVerticalScrollRange());
        sbLIZ.append(", list.computeVerticalScrollExtent(): ");
        sbLIZ.append(((C0DWP) this.l0).computeVerticalScrollExtent());
        C2188811AlT.LIZIZ(sbLIZ);
        if (((C0DWP) this.l0).computeVerticalScrollRange() > ((C0DWP) this.l0).computeVerticalScrollExtent()) {
            View view = (View) this.l1;
            if ((view instanceof C16FB) && (c16fb = (C16FB) view) != null) {
                c16fb.setOverScrollMode(EnumC19356710o9.ALWAYS);
            }
            C0DWP c0dwp = ((VibeMessageListAssem) this.l2).LLJZ;
            if (c0dwp == null || (adapter = c0dwp.getAdapter()) == null) {
                return;
            }
            adapter.unregisterAdapterDataObserver((C1576400r7m) this.l3);
        }
    }

    public final void LIZ$1() {
        InterfaceC1606880ruw interfaceC1606880ruw;
        InterfaceC1608850ry7 interfaceC1608850ry7 = (InterfaceC1608850ry7) ((ConcurrentHashMap) ((AvatarDelegate) this.l0).LLJI.getValue()).get((EnumC1607270rvZ) this.l1);
        if (interfaceC1608850ry7 == null) {
            return;
        }
        HashMap<EnumC1607270rvZ, InterfaceC1606880ruw> map = ((AvatarDelegate) this.l0).LLJ;
        if (map != null) {
            interfaceC1606880ruw = map.get((EnumC1607270rvZ) this.l1);
            if (interfaceC1606880ruw == null) {
            }
            interfaceC1608850ry7.LIZIZ(interfaceC1606880ruw, (EnumC1256840ioM) this.l2, (InterfaceC713050Ry3) this.l3);
        }
        interfaceC1606880ruw = null;
        if (((Set) C1256850ioN.LIZ.getValue()).contains((EnumC1256840ioM) this.l2)) {
            return;
        }
        interfaceC1608850ry7.LIZIZ(interfaceC1606880ruw, (EnumC1256840ioM) this.l2, (InterfaceC713050Ry3) this.l3);
    }

    public final void LIZ$2() {
        C1616020s9g c1616020s9g = (C1616020s9g) this.l3;
        AbstractC1616100s9o abstractC1616100s9o = (AbstractC1616100s9o) this.l1;
        try {
            int iOrdinal = c1616020s9g.LIZ.ordinal();
            if (iOrdinal == 0) {
                abstractC1616100s9o.LIZJ(c1616020s9g.LIZIZ);
            } else {
                if (iOrdinal != 1) {
                    throw new C1954807lC();
                }
                abstractC1616100s9o.getClass();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C09AE c09ae = ((C1616000s9e) this.l0).LJFF.get((AbstractC1616100s9o) this.l1);
        C1616000s9e c1616000s9e = (C1616000s9e) this.l0;
        IdentityHashMap<AbstractC1616100s9o, C09AE> identityHashMap = c1616000s9e.LJFF;
        AbstractC1616100s9o abstractC1616100s9o2 = (AbstractC1616100s9o) this.l1;
        identityHashMap.put(abstractC1616100s9o2, C23250099c.LIZLLL((InterfaceC497601wk) this.l2, C0PEM.LIZJ, null, new C1615990s9d(c09ae, c1616000s9e, (C1616020s9g) this.l3, abstractC1616100s9o2, null), 2));
    }

    public final void LIZ$3() {
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("monitorTabEmpty:");
            sbLIZ.append((EnumC1585100rLo) this.l0);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            EnumC1585100rLo enumC1585100rLo = (EnumC1585100rLo) this.l0;
            List list = (List) this.l1;
            List list2 = (List) this.l2;
            Pair pair = (Pair) this.l3;
            C13DA c13da = new C13DA();
            c13da.put(EnumC1585300rM8.ERROR_TAB_PART.getCateGoryStr(), enumC1585100rLo.getPartStr());
            String partStr = EnumC1585100rLo.TOP_TAB.getPartStr();
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((TopTabProtocol) it2.next()).getTag());
            }
            c13da.put(partStr, C08JS.LIZLLL(arrayList));
            String partStr2 = EnumC1585100rLo.BOTTOM_TAB.getPartStr();
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((BottomTabProtocol) it3.next()).getTag());
            }
            c13da.put(partStr2, C08JS.LIZLLL(arrayList2));
            if (pair != null) {
                String partStr3 = EnumC1585100rLo.TOP_ICON.getPartStr();
                List[] listArr = new List[2];
                Iterable iterable = (Iterable) pair.getFirst();
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(iterable, 10));
                Iterator it4 = iterable.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(((InterfaceC1570900qyu) it4.next()).getTag());
                }
                listArr[0] = arrayList3;
                Iterable iterable2 = (Iterable) pair.getSecond();
                ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(iterable2, 10));
                Iterator it5 = iterable2.iterator();
                while (it5.hasNext()) {
                    arrayList4.add(((InterfaceC1570900qyu) it5.next()).getTag());
                }
                listArr[1] = arrayList4;
                c13da.put(partStr3, new JSONArray((Collection) C1697810uHb.LJIIJJI(listArr)).toString());
            }
            C1AF0.LIZLLL(strLIZIZ, c13da.build());
            C1585280rM6.LIZLLL = true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("monitorTabEmpty exception: ");
            sbLIZ2.append(e.getMessage());
            C1720106oR.LJI("fcp_tab_monitor", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public static final void run$0(ARunnableS32S0400000_24 aRunnableS32S0400000_24) {
        boolean zLIZ;
        C1C7U.LIZ("VibeMessageListAssem@e815.initBubbleList$5$1$onItemRangeInserted$1");
        try {
            aRunnableS32S0400000_24.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VibeMessageListAssem@e815.initBubbleList$5$1$onItemRangeInserted$1");
    }

    public static final void run$1(ARunnableS32S0400000_24 aRunnableS32S0400000_24) {
        boolean zLIZ;
        C1C7U.LIZ("HoxFragmentGroup@a988.notifyChildNodeVisibleChange$task$1");
        try {
            super/*X.0rJa*/.LJIJJ((AbstractC1583720rJa) aRunnableS32S0400000_24.l1, (AbstractC1583720rJa) aRunnableS32S0400000_24.l2, (List) aRunnableS32S0400000_24.l3);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("HoxFragmentGroup@a988.notifyChildNodeVisibleChange$task$1");
    }

    public static final void run$2(ARunnableS32S0400000_24 aRunnableS32S0400000_24) {
        boolean zLIZ;
        C1C7U.LIZ("HoxFragmentGroup@a988.notifyObservers$task$1");
        try {
            super/*X.0rJa*/.LJIJJLI((AbstractC1583720rJa) aRunnableS32S0400000_24.l1, (AbstractC1583720rJa) aRunnableS32S0400000_24.l2, (CopyOnWriteArrayList) aRunnableS32S0400000_24.l3);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("HoxFragmentGroup@a988.notifyObservers$task$1");
    }

    public static final void run$3(ARunnableS32S0400000_24 aRunnableS32S0400000_24) {
        boolean zLIZ;
        C1C7U.LIZ("AvatarDelegate@92fb.controlAnimation$runnable$1");
        try {
            aRunnableS32S0400000_24.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AvatarDelegate@92fb.controlAnimation$runnable$1");
    }

    public static final void run$4(ARunnableS32S0400000_24 aRunnableS32S0400000_24) {
        boolean zLIZ;
        C1C7U.LIZ("ViewPagerPagingDurationComponent@f7ab.determineScrollAnimDurationOffset$2$onSmartResult$1");
        try {
            ((ViewPagerPagingDurationComponent) aRunnableS32S0400000_24.l0).Ho((List) aRunnableS32S0400000_24.l1, (FeedPagingDurationConfig) aRunnableS32S0400000_24.l2, ((C0N33) aRunnableS32S0400000_24.l3).LJIIJ);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ViewPagerPagingDurationComponent@f7ab.determineScrollAnimDurationOffset$2$onSmartResult$1");
    }

    public static final void run$5(ARunnableS32S0400000_24 aRunnableS32S0400000_24) {
        boolean zLIZ;
        C1C7U.LIZ("TimeSlicingDispatchStrategy@95b0.flushEvent$1$1");
        try {
            aRunnableS32S0400000_24.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TimeSlicingDispatchStrategy@95b0.flushEvent$1$1");
    }

    public static final void run$6(ARunnableS32S0400000_24 aRunnableS32S0400000_24) {
        boolean zLIZ;
        C1C7U.LIZ("TabProcessMonitor@51ee.monitorTabEmpty$1");
        try {
            aRunnableS32S0400000_24.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TabProcessMonitor@51ee.monitorTabEmpty$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS32S0400000_24(Object obj, HoxFragmentGroup hoxFragmentGroup, AbstractC1583720rJa abstractC1583720rJa, AbstractC1583720rJa abstractC1583720rJa2, List<InterfaceC1583770rJf> list) {
        this.$t = list;
        this.l0 = obj;
        this.l1 = hoxFragmentGroup;
        this.l2 = abstractC1583720rJa;
        this.l3 = abstractC1583720rJa2;
    }
}
