package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS246S0300000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05wf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1516305wf implements InterfaceC882100Yj2 {
    public final C1517705wt LL = new C1517705wt(C13LQ.LJLIIL(new InterfaceC1517505wr[]{C1517305wp.LIZ, C1517405wq.LIZ}));
    public final String LLILLJJLI = "ChatListTypingUpdater";
    public final String LLILLL = "typing_updater";
    public final C01GW LLILZ = C452501pT.LIZIZ(new C1516405wg(this));
    public final boolean LLILZIL = true;
    public final C01GW LLILZLL = C452501pT.LIZIZ(new C1516505wh());
    public final C01GW LLIZ = C452501pT.LIZIZ(new C1516805wk());
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new C1516705wj());

    @Override // X.InterfaceC882100Yj2
    public final void LJ(InterfaceC879010Ye3 interfaceC879010Ye3) {
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIIL(InterfaceC879010Ye3 interfaceC879010Ye3, Collection collection) {
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
    public final void init() {
    }

    @Override // X.InterfaceC882100Yj2
    public final C884710YnF LIZIZ() {
        return (C884710YnF) this.LLILZ.getValue();
    }

    @Override // X.InterfaceC882100Yj2
    public final void LIZJ() {
        ((ConcurrentHashMap) this.LLIZLLLIL.getValue()).clear();
    }

    @Override // X.InterfaceC882100Yj2
    public final List<AbstractC1491605sg<?>> LJIILIIL() {
        return (List) this.LLILZLL.getValue();
    }

    public final CopyOnWriteArrayList<InterfaceC1482905rH> LJIJJ() {
        return (CopyOnWriteArrayList) this.LLIZ.getValue();
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIILJJIL() {
        LJIJJ().clear();
    }

    @Override // X.InterfaceC882100Yj2
    public final String LIZ() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC882100Yj2
    public final InterfaceC1517005wm LIZLLL() {
        return this.LL;
    }

    @Override // X.InterfaceC882100Yj2
    public final boolean LJFF() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC882100Yj2
    public final String getTag() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJI(InterfaceC879010Ye3 interfaceC879010Ye3) {
        ((ConcurrentHashMap) this.LLIZLLLIL.getValue()).remove(interfaceC879010Ye3);
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIIJ(List<? extends InterfaceC1482905rH> list) {
        LJIJJ().addAll(list);
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIIIZ(C879540Yeu c879540Yeu, InterfaceC879010Ye3 interfaceC879010Ye3) {
        C881320Yhm.LIZIZ(this, interfaceC879010Ye3, c879540Yeu);
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJII(InterfaceC879010Ye3 interfaceC879010Ye3, InterfaceC1491305sd interfaceC1491305sd, String str) {
        C1517605ws c1517605ws;
        if ((interfaceC1491305sd instanceof AnonymousClass0617) && interfaceC1491305sd != null && (c1517605ws = (C1517605ws) ((ConcurrentHashMap) this.LLIZLLLIL.getValue()).get(interfaceC879010Ye3)) != null) {
            ((Map) c1517605ws.LIZ.getValue()).remove(interfaceC1491305sd);
            ((Map) c1517605ws.LIZIZ.getValue()).remove(interfaceC1491305sd);
            ((Map) c1517605ws.LIZJ.getValue()).remove(interfaceC1491305sd);
            C09AE c09ae = (C09AE) ((ConcurrentHashMap) c1517605ws.LIZLLL.getValue()).remove(interfaceC1491305sd);
            if (c09ae != null) {
                c09ae.LIZIZ(null);
            }
            C09AE c09ae2 = (C09AE) ((ConcurrentHashMap) c1517605ws.LJ.getValue()).remove(interfaceC1491305sd);
            if (c09ae2 != null) {
                c09ae2.LIZIZ(null);
            }
            ((Map) c1517605ws.LJFF.getValue()).remove(interfaceC1491305sd);
        }
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIIJJI(InterfaceC879010Ye3 interfaceC879010Ye3, C879540Yeu<?> c879540Yeu, InterfaceC879770YfH interfaceC879770YfH) {
        C881320Yhm.LIZ(this, interfaceC879010Ye3, c879540Yeu, interfaceC879770YfH);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f4  */
    @Override // X.InterfaceC882100Yj2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1490405sU<?> LJIIIIZZ(X.InterfaceC879010Ye3 r16, X.C879540Yeu<?> r17, X.AbstractC1491605sg<?> r18, X.C1490405sU<?> r19) {
        /*
            Method dump skipped, instruction units count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1516305wf.LJIIIIZZ(X.0Ye3, X.0Yeu, X.05sg, X.05sU):X.05sU");
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIJI(InterfaceC879010Ye3 interfaceC879010Ye3, Collection<? extends C879540Yeu<?>> collection, String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            C879540Yeu c879540Yeu = (C879540Yeu) obj;
            if (Intrinsics.LJFF(c879540Yeu.LIZ, C882110Yj3.INSTANCE) || Intrinsics.LJFF(c879540Yeu.LIZ, C1606106Qp.INSTANCE)) {
                arrayList.add(obj);
            }
        }
        C1729806q0.LIZJ(interfaceC879010Ye3, new AwS246S0300000_2(this, (C1516305wf) interfaceC879010Ye3, (InterfaceC879010Ye3) arrayList, (Collection<? extends C879540Yeu<?>>) 29));
        if (C1666706fp.LIZ() == 4 || C1666706fp.LIZ() == 3) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : collection) {
                if (Intrinsics.LJFF(((C879540Yeu) obj2).LIZ, C1606306Qr.INSTANCE)) {
                    arrayList2.add(obj2);
                }
            }
            C1729806q0.LIZJ(interfaceC879010Ye3, new AwS246S0300000_2(this, (C1516305wf) interfaceC879010Ye3, (InterfaceC879010Ye3) arrayList2, (Collection<? extends C879540Yeu<?>>) 28));
        }
    }
}
