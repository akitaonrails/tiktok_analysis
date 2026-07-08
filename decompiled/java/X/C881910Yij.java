package X;

import com.ss.android.ugc.aweme.im.service.chat.InboxSocPubStatusViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Yij, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C881910Yij implements InterfaceC882100Yj2 {
    public final C1517705wt LL = new C1517705wt(C13LQ.LJLIIL(new InterfaceC1517505wr[]{C1517405wq.LIZ, C1517305wp.LIZ}));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new C881930Yil());
    public final String LLILLL = "ChatListSocPubModelUpdater";
    public final String LLILZ = "soc_pub_model_updater";
    public final C01GW LLILZIL = C452501pT.LIZIZ(new C881920Yik(this));
    public final boolean LLILZLL = true;
    public final C01GW LLIZ = C452501pT.LIZIZ(new C881900Yii());
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new C881940Yim());

    @Override // X.InterfaceC882100Yj2
    public final void LIZJ() {
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJ(InterfaceC879010Ye3 interfaceC879010Ye3) {
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJI(InterfaceC879010Ye3 interfaceC879010Ye3) {
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJII(InterfaceC879010Ye3 interfaceC879010Ye3, InterfaceC1491305sd interfaceC1491305sd, String str) {
    }

    @Override // X.InterfaceC882100Yj2
    public final C1490405sU<?> LJIIIIZZ(InterfaceC879010Ye3 interfaceC879010Ye3, C879540Yeu<?> c879540Yeu, AbstractC1491605sg<?> abstractC1491605sg, C1490405sU<?> c1490405sU) {
        return null;
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
        return (C884710YnF) this.LLILZIL.getValue();
    }

    @Override // X.InterfaceC882100Yj2
    public final List<AbstractC1491605sg<?>> LJIILIIL() {
        return (List) this.LLIZ.getValue();
    }

    public final CopyOnWriteArrayList<InterfaceC1482905rH> LJIJJ() {
        return (CopyOnWriteArrayList) this.LLILLJJLI.getValue();
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIILJJIL() {
        LJIJJ().clear();
    }

    @Override // X.InterfaceC882100Yj2
    public final String LIZ() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC882100Yj2
    public final InterfaceC1517005wm LIZLLL() {
        return this.LL;
    }

    @Override // X.InterfaceC882100Yj2
    public final boolean LJFF() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC882100Yj2
    public final String getTag() {
        return this.LLILLL;
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
    public final void LJIIJJI(InterfaceC879010Ye3 interfaceC879010Ye3, C879540Yeu<?> c879540Yeu, InterfaceC879770YfH interfaceC879770YfH) {
        C881320Yhm.LIZ(this, interfaceC879010Ye3, c879540Yeu, interfaceC879770YfH);
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIJI(InterfaceC879010Ye3 interfaceC879010Ye3, Collection<? extends C879540Yeu<?>> collection, String str, boolean z) {
        String conversationId;
        AnonymousClass0617 anonymousClass0617;
        AnonymousClass0617 anonymousClass06172;
        AbstractC883730Ylf.LJIIIIZZ.getClass();
        AbstractC883730Ylf abstractC883730YlfLJ = C881500Yi4.LJ();
        if (abstractC883730YlfLJ != null) {
            if (abstractC883730YlfLJ.LJIIZILJ().containsKey(C881500Yi4.LIZLLL())) {
                ArrayList arrayList = new ArrayList();
                Iterator<T> it2 = collection.iterator();
                while (true) {
                    String conversationId2 = null;
                    if (!it2.hasNext()) {
                        break;
                    }
                    C879540Yeu c879540Yeu = (C879540Yeu) it2.next();
                    if (Intrinsics.LJFF(c879540Yeu.LIZ, C882110Yj3.INSTANCE)) {
                        InterfaceC1491305sd interfaceC1491305sd = c879540Yeu.LIZIZ;
                        if ((interfaceC1491305sd instanceof AnonymousClass0617) && (anonymousClass06172 = (AnonymousClass0617) interfaceC1491305sd) != null) {
                            conversationId2 = anonymousClass06172.getConversationId();
                        }
                        String strValueOf = String.valueOf(C0YNP.LJII(conversationId2));
                        if (strValueOf != null) {
                            arrayList.add(strValueOf);
                        }
                    }
                }
                if (((Set) this.LLIZLLLIL.getValue()).containsAll(arrayList)) {
                    C309160C9y.LIZ();
                } else {
                    ((Set) this.LLIZLLLIL.getValue()).addAll(arrayList);
                    InboxSocPubStatusViewModel inboxSocPubStatusViewModel = C882120Yj4.LIZ().LIZIZ;
                    if (inboxSocPubStatusViewModel != null) {
                        inboxSocPubStatusViewModel.qb1(arrayList);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it3 = collection.iterator();
                while (it3.hasNext()) {
                    C879540Yeu c879540Yeu2 = (C879540Yeu) it3.next();
                    if (Intrinsics.LJFF(c879540Yeu2.LIZ, C1606306Qr.INSTANCE)) {
                        InterfaceC1491305sd interfaceC1491305sd2 = c879540Yeu2.LIZIZ;
                        if ((interfaceC1491305sd2 instanceof AnonymousClass0617) && (anonymousClass0617 = (AnonymousClass0617) interfaceC1491305sd2) != null) {
                            conversationId = anonymousClass0617.getConversationId();
                        } else {
                            conversationId = null;
                        }
                        if (C1229100i5c.LIZ.LJIIJ(conversationId) && conversationId != null) {
                            arrayList2.add(conversationId);
                        }
                    }
                }
                C0ZP6 c0zp6 = C882120Yj4.LIZ().LIZJ;
                if (c0zp6 != null) {
                    c0zp6.q20(arrayList2);
                }
            }
        }
    }
}
