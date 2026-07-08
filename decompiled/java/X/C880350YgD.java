package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.story.friendanniversary.StoryFriendAnniversaryService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0YgD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C880350YgD implements InterfaceC882100Yj2 {
    public final ConcurrentHashMap<String, Long> LL = new ConcurrentHashMap<>();
    public final C1491005sa LLILLJJLI = C1491005sa.LIZ;
    public final String LLILLL = "UpdateTimeUpdater";
    public final String LLILZ = "story_friend_anniversary_update_time";
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1438));
    public final boolean LLILZLL = true;
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(439));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(440));

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
    public final void LIZJ() {
        this.LL.clear();
    }

    @Override // X.InterfaceC882100Yj2
    public final List<AbstractC1491605sg<?>> LJIILIIL() {
        return (List) this.LLIZ.getValue();
    }

    public final CopyOnWriteArrayList<InterfaceC1482905rH> LJIJJ() {
        return (CopyOnWriteArrayList) this.LLIZLLLIL.getValue();
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
        return this.LLILLJJLI;
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

    /* JADX WARN: Type inference failed for: r0v11, types: [T, X.0YfV, java.lang.Object] */
    @Override // X.InterfaceC882100Yj2
    public final C1490405sU<?> LJIIIIZZ(InterfaceC879010Ye3 interfaceC879010Ye3, C879540Yeu<?> c879540Yeu, AbstractC1491605sg<?> abstractC1491605sg, C1490405sU<?> c1490405sU) {
        AnonymousClass0617 anonymousClass0617;
        String conversationId;
        long jLongValue;
        C879960Yfa c879960Yfa = C879960Yfa.LIZ;
        if (!Intrinsics.LJFF(abstractC1491605sg, c879960Yfa) || !Intrinsics.LJFF(c879540Yeu.LIZ, C882110Yj3.INSTANCE)) {
            return null;
        }
        InterfaceC1491305sd interfaceC1491305sd = c879540Yeu.LIZIZ;
        if (!(interfaceC1491305sd instanceof AnonymousClass0617) || (anonymousClass0617 = (AnonymousClass0617) interfaceC1491305sd) == null || (conversationId = anonymousClass0617.getConversationId()) == null) {
            return null;
        }
        Long l = this.LL.get(conversationId);
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            String strLJFF = C0YNP.LJFF(conversationId, "story_anniversary_refresh");
            if (strLJFF != null) {
                try {
                    jLongValue = CastLongProtector.parseLong(strLJFF);
                } catch (NumberFormatException e) {
                    TryCatchGuardChecker.doCheck(e);
                    jLongValue = -1;
                }
                this.LL.put(conversationId, Long.valueOf(jLongValue));
            } else {
                jLongValue = -1;
                this.LL.put(conversationId, Long.valueOf(jLongValue));
            }
        }
        ?? c879910YfV = new C879910YfV(jLongValue);
        if (c1490405sU == null) {
            return new C1490405sU<>(c879960Yfa, c879910YfV);
        }
        c1490405sU.LIZIZ = c879910YfV;
        return c1490405sU;
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIJI(InterfaceC879010Ye3 interfaceC879010Ye3, Collection<? extends C879540Yeu<?>> collection, String str, boolean z) {
        AnonymousClass0617 anonymousClass0617;
        C902380Zae c902380ZaeLIZ;
        long j;
        Long l;
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        if (u.LJIIZILJ(str, C878360Yd0.LIZIZ(C878360Yd0.LIZIZ("", "update"), "18"), false)) {
            Iterator<T> it2 = collection.iterator();
            while (it2.hasNext()) {
                C879540Yeu c879540Yeu = (C879540Yeu) it2.next();
                if (Intrinsics.LJFF(c879540Yeu.LIZ, C882110Yj3.INSTANCE)) {
                    InterfaceC1491305sd interfaceC1491305sd = c879540Yeu.LIZIZ;
                    if ((interfaceC1491305sd instanceof AnonymousClass0617) && (anonymousClass0617 = (AnonymousClass0617) interfaceC1491305sd) != null) {
                        String conversationId = anonymousClass0617.getConversationId();
                        StoryFriendAnniversaryService.LIZ.getClass();
                        StoryFriendAnniversaryService storyFriendAnniversaryServiceLIZ = C902340Zaa.LIZ();
                        if (storyFriendAnniversaryServiceLIZ != null && (c902380ZaeLIZ = storyFriendAnniversaryServiceLIZ.LIZ(C461720I8s.LIZIZ())) != null && c902380ZaeLIZ.LIZLLL(conversationId) != null) {
                            String strLJFF = C0YNP.LJFF(conversationId, "story_anniversary_refresh");
                            if (strLJFF != null) {
                                try {
                                    j = CastLongProtector.parseLong(strLJFF);
                                } catch (NumberFormatException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    j = -1;
                                }
                                l = this.LL.get(conversationId);
                                if (l != null || l.longValue() != j) {
                                    this.LL.put(conversationId, Long.valueOf(j));
                                    arrayList.add(c879540Yeu.LIZIZ);
                                    z2 = true;
                                }
                            } else {
                                j = -1;
                                l = this.LL.get(conversationId);
                                if (l != null) {
                                }
                                this.LL.put(conversationId, Long.valueOf(j));
                                arrayList.add(c879540Yeu.LIZIZ);
                                z2 = true;
                            }
                        }
                    }
                }
            }
            if (z2) {
                Iterator<InterfaceC1482905rH> it3 = LJIJJ().iterator();
                while (it3.hasNext()) {
                    it3.next().LIZ(interfaceC879010Ye3, arrayList, LIZIZ(), this.LLILLL);
                }
            }
        }
    }
}
