package X;

import Y.AComparatorS33S0000000_14;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.im.core.chatlist.api.engine.IChatListEngine;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ylf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC883730Ylf implements InterfaceC882680Yjy {
    public static final C881500Yi4 LJIIIIZZ = new C881500Yi4();
    public static final C01GW<C883920Yly> LJIIIZ = C452501pT.LIZIZ(new C883990Ym5());
    public static final C01GW<C883740Ylg> LJIIJ = C452501pT.LIZIZ(new C883980Ym4());
    public static final C01GW<Long> LJIIJJI = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(625));
    public InterfaceC884020Ym8 LJ;
    public volatile boolean LJFF;
    public C876610YaB LJI;
    public final C01GW LIZ = C452501pT.LIZIZ(new C883940Ym0());
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C883960Ym2());
    public final C01GW LIZJ = C452501pT.LIZIZ(new C883950Ym1());
    public final C01GW LIZLLL = C452501pT.LIZIZ(new C883970Ym3());
    public final C01GW LJII = C452501pT.LIZIZ(new C884030Ym9(this));

    public abstract InterfaceC1517505wr LJIILIIL();

    public abstract String LJIJ();

    public abstract void LJJ(FilterTabType filterTabType, Set<? extends EnumC880480YgQ> set);

    @Override // X.InterfaceC882680Yjy
    public final C878950Ydx LIZLLL() {
        InterfaceC884640Yn8 config;
        InterfaceC884020Ym8 interfaceC884020Ym8 = this.LJ;
        InterfaceC879010Ye3 key = (interfaceC884020Ym8 == null || (config = interfaceC884020Ym8.getConfig()) == null) ? null : config.getKey();
        if (key instanceof C878950Ydx) {
            return (C878950Ydx) key;
        }
        return null;
    }

    @Override // X.InterfaceC882680Yjy
    public final int LJI() {
        LJIIIIZZ.getClass();
        if (C881500Yi4.LIZJ()) {
            return 20;
        }
        return C878570YdL.LIZ.preLoadCount;
    }

    @Override // X.InterfaceC882680Yjy
    public final boolean LJIIIZ() {
        LJIIIIZZ.getClass();
        return (C881500Yi4.LJII() || C881500Yi4.LIZJ()) ? false : true;
    }

    public final C11PQ<C885880Yp8> LJIILLIIL() {
        return (C11PQ) this.LIZLLL.getValue();
    }

    public final Map<InterfaceC879010Ye3, InterfaceC884020Ym8> LJIIZILJ() {
        return (Map) this.LIZ.getValue();
    }

    public final void LJIJJLI() {
        C878950Ydx c878950Ydx;
        C19212010Ec c19212010Ec = C19212010Ec.LIZJ;
        Pair<FilterTabType, Set<EnumC880480YgQ>> pairLJJL = c19212010Ec.LJJL();
        if (Intrinsics.LJFF(pairLJJL, c19212010Ec.LJLIIIL())) {
            LJIIIIZZ.getClass();
            c878950Ydx = C881500Yi4.LIZLLL();
        } else {
            c878950Ydx = new C878950Ydx(null, pairLJJL.getFirst(), pairLJJL.getSecond(), SystemClock.elapsedRealtime(), 19);
        }
        IChatListEngine.LIZ.getClass();
        IChatListEngine iChatListEngineLIZ = C884160YmM.LIZ();
        LJIIIIZZ.getClass();
        C884270YmX c884270YmXLJIIJ = iChatListEngineLIZ.LJIIJ(LJIIL(C881500Yi4.LIZLLL()));
        c884270YmXLJIIJ.LJIILJJIL((InterfaceC884050YmB) this.LJII.getValue());
        LJIIZILJ().put(C881500Yi4.LIZLLL(), c884270YmXLJIIJ);
        if (Intrinsics.LJFF(c878950Ydx, C881500Yi4.LIZLLL())) {
            this.LJ = c884270YmXLJIIJ;
        }
        if (Intrinsics.LJFF(c878950Ydx, C881500Yi4.LIZLLL())) {
            return;
        }
        C884270YmX c884270YmXLJIIJ2 = C884160YmM.LIZ().LJIIJ(LJIIL(c878950Ydx));
        c884270YmXLJIIJ2.LJIILJJIL((InterfaceC884050YmB) this.LJII.getValue());
        LJIIZILJ().put(c878950Ydx, c884270YmXLJIIJ2);
        this.LJ = c884270YmXLJIIJ2;
    }

    public final void LJIIJJI() {
        LJIJ();
        C309160C9y.LIZ();
        IChatListEngine.LIZ.getClass();
        IChatListEngine iChatListEngineLIZ = C884160YmM.LIZ();
        LJIIIIZZ.getClass();
        iChatListEngineLIZ.LJIIL(C881500Yi4.LIZLLL(), LJIILIIL());
        InterfaceC884020Ym8 interfaceC884020Ym8 = this.LJ;
        if (interfaceC884020Ym8 != null) {
            interfaceC884020Ym8.LJJJJZI();
        }
    }

    public final int LJIILJJIL() {
        List<C890610Ywl> list;
        C885880Yp8 c885880Yp8LJLZ = LJIILLIIL().LJLZ();
        int i = 0;
        if (c885880Yp8LJLZ != null && (list = c885880Yp8LJLZ.LIZ) != null) {
            Iterator<C890610Ywl> it2 = list.iterator();
            i = 0;
            while (it2.hasNext()) {
                C0ZA7 c0za7 = it2.next().LLILZLL;
                i += c0za7 != null ? c0za7.LIZ : 0;
            }
        }
        return i;
    }

    public final void LJIL() {
        LJIJ();
        C309160C9y.LIZ();
        C888490YtL.LIZ.getClass();
        C888490YtL.LIZJ(null);
        IChatListEngine.LIZ.getClass();
        IChatListEngine iChatListEngineLIZ = C884160YmM.LIZ();
        LJIIIIZZ.getClass();
        iChatListEngineLIZ.LIZ(C881500Yi4.LIZLLL(), LJIILIIL());
        for (InterfaceC883880Ylu interfaceC883880Ylu : LJIIZILJ().values()) {
            C1ED8.LIZ.getClass();
            if (((Boolean) C1ED8.LJIIIIZZ.getValue()).booleanValue()) {
                interfaceC883880Ylu.LIZJ();
            }
            interfaceC883880Ylu.LJLLLLLL();
        }
    }

    public static int LJIILL(AbstractC883730Ylf abstractC883730Ylf) {
        List<InterfaceC884440Ymo> listLIZIZ;
        int num;
        InterfaceC887210YrH interfaceC887210YrH;
        AbstractC884010Ym7 unreadViewState;
        Map<InterfaceC879010Ye3, InterfaceC884020Ym8> mapLJIIZILJ = abstractC883730Ylf.LJIIZILJ();
        LJIIIIZZ.getClass();
        InterfaceC884020Ym8 interfaceC884020Ym8 = mapLJIIZILJ.get(C881500Yi4.LIZLLL());
        int i = 0;
        if (interfaceC884020Ym8 != null && (listLIZIZ = interfaceC884020Ym8.LIZIZ(false)) != null) {
            ArrayList arrayList = new ArrayList();
            for (InterfaceC884440Ymo interfaceC884440Ymo : listLIZIZ) {
                if (!(interfaceC884440Ymo instanceof C887190YrF)) {
                    arrayList.add(interfaceC884440Ymo);
                }
            }
            List<InterfaceC884440Ymo> listLL = C13LP.LL(arrayList, 5);
            if (listLL != null) {
                i = 0;
                for (InterfaceC884440Ymo interfaceC884440Ymo2 : listLL) {
                    if ((interfaceC884440Ymo2 instanceof InterfaceC887210YrH) && (interfaceC887210YrH = (InterfaceC887210YrH) interfaceC884440Ymo2) != null && (unreadViewState = interfaceC887210YrH.getUnreadViewState()) != null) {
                        num = unreadViewState.getNum();
                    } else {
                        num = 0;
                    }
                    i += num;
                }
            }
        }
        return i;
    }

    public static InterfaceC1491305sd LJIJJ(InterfaceC888500YtM interfaceC888500YtM) {
        Integer numValueOf;
        if (interfaceC888500YtM == null || (numValueOf = Integer.valueOf(interfaceC888500YtM.getSessionType())) == null) {
            return null;
        }
        if (numValueOf.intValue() != 0 && numValueOf.intValue() != 3) {
            if (numValueOf.intValue() != 2) {
                return null;
            }
            return C878820Ydk.INSTANCE;
        }
        return new AnonymousClass0617(C0YM2.TIKTOK_SOCIAL_IM, interfaceC888500YtM.getSessionId());
    }

    public static void LJJI(List list) {
        IChatListEngine.LIZ.getClass();
        IChatListEngine iChatListEngineLIZ = C884160YmM.LIZ();
        LJIIIIZZ.getClass();
        iChatListEngineLIZ.LJ(C881500Yi4.LIZLLL(), list);
    }

    public static void LJJIFFI(List list) {
        IChatListEngine.LIZ.getClass();
        IChatListEngine iChatListEngineLIZ = C884160YmM.LIZ();
        LJIIIIZZ.getClass();
        iChatListEngineLIZ.LIZIZ(C881500Yi4.LIZLLL(), list);
    }

    @Override // X.InterfaceC882680Yjy
    public final void LIZ(InterfaceC884050YmB interfaceC884050YmB) {
        ((CopyOnWriteArrayList) this.LIZIZ.getValue()).remove(interfaceC884050YmB);
    }

    @Override // X.InterfaceC882680Yjy
    public final void LIZJ(InterfaceC884050YmB interfaceC884050YmB) {
        ((CopyOnWriteArrayList) this.LIZIZ.getValue()).add(interfaceC884050YmB);
    }

    @Override // X.InterfaceC882680Yjy
    public final void LJ(StringBuilder sb) {
        int i;
        for (Map.Entry<InterfaceC879010Ye3, InterfaceC884020Ym8> entry : LJIIZILJ().entrySet()) {
            sb.append(entry.getKey());
            sb.append(":{");
            sb.append("total_count:");
            int i2 = 0;
            sb.append(entry.getValue().LIZIZ(false).size());
            sb.append(", ");
            sb.append("private_count:");
            List<InterfaceC884440Ymo> listLIZIZ = entry.getValue().LIZIZ(false);
            if ((listLIZIZ instanceof Collection) && listLIZIZ.isEmpty()) {
                i = 0;
            } else {
                Iterator<InterfaceC884440Ymo> it2 = listLIZIZ.iterator();
                i = 0;
                while (it2.hasNext()) {
                    if ((it2.next() instanceof C0Z8N) && (i = i + 1) < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
            }
            sb.append(i);
            sb.append(", ");
            sb.append("group_count:");
            List<InterfaceC884440Ymo> listLIZIZ2 = entry.getValue().LIZIZ(false);
            if (!(listLIZIZ2 instanceof Collection) || !listLIZIZ2.isEmpty()) {
                Iterator<InterfaceC884440Ymo> it3 = listLIZIZ2.iterator();
                while (it3.hasNext()) {
                    if ((it3.next() instanceof C0Z8O) && (i2 = i2 + 1) < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
            }
            sb.append(i2);
            sb.append("}, ");
        }
    }

    @Override // X.InterfaceC882680Yjy
    public final void LJFF(StringBuilder sb) {
        for (Map.Entry entry : ((Map) this.LIZJ.getValue()).entrySet()) {
            sb.append(entry.getKey().toString());
            sb.append(":");
            sb.append(((Number) entry.getValue()).intValue());
            sb.append(", ");
        }
    }

    @Override // X.InterfaceC882680Yjy
    @InterfaceC1294060jmO
    public final InterfaceC884440Ymo LJII(String str) {
        AnonymousClass0617 anonymousClass0617 = new AnonymousClass0617(C0YM2.TIKTOK_SOCIAL_IM, str);
        IChatListEngine.LIZ.getClass();
        return C884160YmM.LIZ().LIZJ(anonymousClass0617);
    }

    @Override // X.InterfaceC882680Yjy
    public final boolean LJIIIIZZ(String str) {
        LJIIIIZZ.getClass();
        return C881500Yi4.LJFF(str);
    }

    @Override // X.InterfaceC882680Yjy
    public final List<InterfaceC884440Ymo> LJIIJ(boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = LJIIZILJ().values().iterator();
        while (it2.hasNext()) {
            arrayList.addAll(((InterfaceC883880Ylu) it2.next()).LIZIZ(true));
        }
        if (z) {
            C13LP.LJLLLL(new AComparatorS33S0000000_14(33), arrayList);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x049a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C885040Ynm LJIIL(X.C878950Ydx r54) {
        /*
            Method dump skipped, instruction units count: 1185
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC883730Ylf.LJIIL(X.0Ydx):X.0Ynm");
    }

    public static C879540Yeu LJIJI(C878950Ydx c878950Ydx, String str) {
        AnonymousClass0617 anonymousClass0617 = new AnonymousClass0617(C0YM2.TIKTOK_SOCIAL_IM, str);
        IChatListEngine.LIZ.getClass();
        return C884160YmM.LIZ().LJII(anonymousClass0617, c878950Ydx);
    }

    @Override // X.InterfaceC882680Yjy
    public final C878950Ydx LIZIZ(FilterTabType filterTabType, Set<? extends EnumC880480YgQ> set) {
        Object next;
        C878950Ydx c878950Ydx;
        Iterator<T> it2 = LJIIZILJ().keySet().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                InterfaceC879010Ye3 interfaceC879010Ye3 = (InterfaceC879010Ye3) next;
                if ((interfaceC879010Ye3 instanceof C878950Ydx) && (c878950Ydx = (C878950Ydx) interfaceC879010Ye3) != null && c878950Ydx.LLILLL == filterTabType && (set == null || Intrinsics.LJFF(c878950Ydx.LLILZ, set))) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        if (!(next instanceof C878950Ydx)) {
            return null;
        }
        return (C878950Ydx) next;
    }
}
