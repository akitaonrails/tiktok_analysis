package X;

import com.ss.android.ugc.aweme.im.service.chat.InboxSocPubStatusViewModel;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YlT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C883610YlT implements InterfaceC890430YwT {
    public static final C01GW<C883610YlT> LJI = C452501pT.LIZIZ(new C883620YlU());
    public volatile boolean LIZ;
    public volatile InboxSocPubStatusViewModel LIZIZ;
    public volatile C0ZP6 LIZJ;
    public final AtomicBoolean LIZLLL = new AtomicBoolean(false);
    public boolean LJ;
    public boolean LJFF;

    @Override // X.InterfaceC890430YwT
    public final boolean LIZIZ() {
        AbstractC883730Ylf.LJIIIIZZ.getClass();
        AbstractC883730Ylf abstractC883730YlfLJ = C881500Yi4.LJ();
        if (abstractC883730YlfLJ != null) {
            Collection<InterfaceC884020Ym8> collectionValues = abstractC883730YlfLJ.LJIIZILJ().values();
            if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                Iterator<T> it2 = collectionValues.iterator();
                while (it2.hasNext()) {
                    if (!((InterfaceC883880Ylu) it2.next()).LIZIZ(true).isEmpty()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC890430YwT
    public final void LJFF() {
        AbstractC883730Ylf.LJIIIIZZ.getClass();
        AbstractC883730Ylf abstractC883730YlfLJ = C881500Yi4.LJ();
        if (abstractC883730YlfLJ != null) {
            C1729806q0.LIZIZ(new AwS546S0100000_2(abstractC883730YlfLJ, 1240), false);
        }
    }

    @Override // X.InterfaceC890430YwT
    public final void onPause() {
        if (C283890BAt.LIZ()) {
            C885110Ynt.LIZ("SessionRefactor-InboxSessionMediator-onPause", new C882290YjL(this, null));
        }
    }

    @Override // X.InterfaceC890430YwT
    public final void onResume() {
        if (C283890BAt.LIZ()) {
            C885110Ynt.LIZ("SessionRefactor-InboxSessionMediator-onResume", new C882300YjM(this, null));
        }
    }

    public static C883710Yld LIZLLL(InterfaceC888500YtM interfaceC888500YtM) {
        C883710Yld value;
        if (interfaceC888500YtM instanceof C0Z8L) {
            value = C888350Yt7.LIZIZ.getValue();
        } else if (interfaceC888500YtM instanceof C0Z8M) {
            value = C888340Yt6.LIZIZ.getValue();
        } else if (interfaceC888500YtM instanceof C0Z8P) {
            value = C883680Yla.LIZIZ.getValue();
        } else if (interfaceC888500YtM instanceof C0Z3S) {
            value = C887710Ys5.LIZIZ.getValue();
        } else {
            value = C883710Yld.LIZ.getValue();
        }
        if (!(value instanceof InterfaceC883640YlW)) {
            return null;
        }
        return value;
    }

    @C14EU
    public final void onTabChangeEvent(C0R6M c0r6m) {
        if (C283890BAt.LIZ()) {
            return;
        }
        C885110Ynt.LIZ("SessionRefactor-InboxSessionMediator-onTabChangeEvent", new C883600YlS(c0r6m, this, null));
    }

    public final void LIZJ(boolean z, boolean z2) {
        boolean z3;
        if (z && z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 == this.LIZ) {
            return;
        }
        this.LIZ = z3;
        if (z3) {
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "tt_im_sdk_init_opt", true) == 2) {
                ((C876310YZh) C876340YZk.LIZ(C876340YZk.LIZ)).LIZJ(EnumC883570YlP.ENTER_SESSION_LIST);
            }
            AbstractC883730Ylf.LJIIIIZZ.getClass();
            AbstractC883730Ylf abstractC883730YlfLJ = C881500Yi4.LJ();
            if (abstractC883730YlfLJ != null) {
                abstractC883730YlfLJ.LJIIJJI();
                return;
            }
            return;
        }
        AbstractC883730Ylf.LJIIIIZZ.getClass();
        AbstractC883730Ylf abstractC883730YlfLJ2 = C881500Yi4.LJ();
        if (abstractC883730YlfLJ2 == null) {
            return;
        }
        abstractC883730YlfLJ2.LJIL();
    }

    @Override // X.InterfaceC890430YwT
    public final Long LIZ(String str, FilterTabType filterTabType, C876860Yaa c876860Yaa) {
        C878950Ydx c878950YdxLIZIZ;
        InterfaceC884020Ym8 interfaceC884020Ym8;
        List<InterfaceC884440Ymo> listLIZIZ;
        InterfaceC884440Ymo next;
        String sessionId;
        InterfaceC887210YrH interfaceC887210YrH;
        InterfaceC888420YtE interfaceC888420YtE;
        AbstractC883730Ylf.LJIIIIZZ.getClass();
        AbstractC883730Ylf abstractC883730YlfLJ = C881500Yi4.LJ();
        if (abstractC883730YlfLJ == null || (c878950YdxLIZIZ = abstractC883730YlfLJ.LIZIZ(filterTabType, c876860Yaa.LIZ)) == null || (interfaceC884020Ym8 = abstractC883730YlfLJ.LJIIZILJ().get(c878950YdxLIZIZ)) == null || (listLIZIZ = interfaceC884020Ym8.LIZIZ(false)) == null) {
            return null;
        }
        Iterator<InterfaceC884440Ymo> it2 = listLIZIZ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                InterfaceC884440Ymo interfaceC884440Ymo = next;
                if ((interfaceC884440Ymo instanceof InterfaceC887210YrH) && (interfaceC887210YrH = (InterfaceC887210YrH) interfaceC884440Ymo) != null && (interfaceC888420YtE = (InterfaceC888420YtE) interfaceC887210YrH.getExtra()) != null) {
                    sessionId = interfaceC888420YtE.getSessionId();
                } else {
                    sessionId = null;
                }
                if (Intrinsics.LJFF(sessionId, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        InterfaceC884440Ymo interfaceC884440Ymo2 = next;
        if (interfaceC884440Ymo2 == null) {
            return null;
        }
        return Long.valueOf(interfaceC884440Ymo2.getSortOrder());
    }
}
