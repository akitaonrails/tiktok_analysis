package X;

import com.ss.android.ugc.aweme.friendstab.interfaces.IBottomTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabProtocolAbility;
import com.ss.android.ugc.aweme.friendstab.model.SingleTabCounter;
import com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import com.ss.android.ugc.aweme.repostfeed.experiment.RepostFeedConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rOx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1587050rOx {
    public final boolean LIZ = true;
    public final CopyOnWriteArrayList<SingleTabCounter> LIZIZ = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<SingleTabCounter> LIZJ = new CopyOnWriteArrayList<>();
    public IBottomTabLayoutAbility LIZLLL;

    public static List LIZLLL() {
        ISocial2TabProtocolAbility iSocial2TabProtocolAbilityLJI;
        List<ISocialTabProtocol> listSV1;
        C19EG c19egLIZIZ = StateOwner.LL.LIZIZ();
        return (c19egLIZIZ == null || (iSocial2TabProtocolAbilityLJI = C1583510rJF.LJI(C1558360qeg.LJI(c19egLIZIZ, null))) == null || (listSV1 = iSocial2TabProtocolAbilityLJI.sV1()) == null) ? new ArrayList() : listSV1;
    }

    public final int LIZ() {
        C1583300rIu.LIZ.getClass();
        RepostFeedConfig repostFeedConfigLIZ = C1583300rIu.LIZ();
        int i = 0;
        if (repostFeedConfigLIZ == null || (repostFeedConfigLIZ.bottomReminder & 1) != 1) {
            Iterator<SingleTabCounter> it2 = this.LIZIZ.iterator();
            while (it2.hasNext()) {
                i += it2.next().numberCount;
            }
        } else {
            CopyOnWriteArrayList<SingleTabCounter> copyOnWriteArrayList = this.LIZIZ;
            ArrayList arrayList = new ArrayList();
            for (SingleTabCounter singleTabCounter : copyOnWriteArrayList) {
                if (!Intrinsics.LJFF(singleTabCounter.tag, "REPOST_FEED")) {
                    arrayList.add(singleTabCounter);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                i += ((SingleTabCounter) it3.next()).numberCount;
            }
        }
        return i;
    }

    public final IBottomTabLayoutAbility LIZIZ() {
        IBottomTabLayoutAbility iBottomTabLayoutAbilityLJIIIZ = this.LIZLLL;
        if (iBottomTabLayoutAbilityLJIIIZ == null) {
            C19EG c19egLIZIZ = StateOwner.LL.LIZIZ();
            if (c19egLIZIZ == null || (iBottomTabLayoutAbilityLJIIIZ = C1583510rJF.LJIIIZ(C1558360qeg.LJI(c19egLIZIZ, null))) == null) {
                return null;
            }
            this.LIZLLL = iBottomTabLayoutAbilityLJIIIZ;
        }
        return iBottomTabLayoutAbilityLJIIIZ;
    }

    public final void LJ() {
        this.LIZJ.clear();
        for (SingleTabCounter singleTabCounter : this.LIZIZ) {
            this.LIZJ.add(singleTabCounter.copy(singleTabCounter.tag, singleTabCounter.numberCount, singleTabCounter.showGuideRedDot));
        }
    }

    public final String LJFF() {
        C19EG c19egLIZIZ;
        IFriendsTabLayoutAbility iFriendsTabLayoutAbilityLIZLLL;
        String strNk0;
        IBottomTabLayoutAbility iBottomTabLayoutAbilityLIZIZ = LIZIZ();
        return (iBottomTabLayoutAbilityLIZIZ == null || !iBottomTabLayoutAbilityLIZIZ.hv0() || (c19egLIZIZ = StateOwner.LL.LIZIZ()) == null || (iFriendsTabLayoutAbilityLIZLLL = C1583510rJF.LIZLLL(C1558360qeg.LJI(c19egLIZIZ, null))) == null || (strNk0 = iFriendsTabLayoutAbilityLIZLLL.nk0()) == null) ? "" : strNk0;
    }

    public final void LJIIIIZZ() {
        SingleTabCounter next;
        String strLJFF = LJFF();
        Iterator<SingleTabCounter> it2 = this.LIZIZ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            } else {
                next = it2.next();
                if (Intrinsics.LJFF(next.tag, strLJFF)) {
                    break;
                }
            }
        }
        SingleTabCounter singleTabCounter = next;
        if (singleTabCounter != null) {
            singleTabCounter.setNumberCount(0);
            singleTabCounter.setShowGuideRedDot(false);
        }
        if (C296600Bju.LIZ()) {
            C1586680rOM.LIZ.getClass();
            C1586680rOM.LIZ(strLJFF);
        }
    }

    public final boolean LJI(String str) {
        InterfaceC1584710rLB interfaceC1584710rLBKx;
        if (!this.LIZ) {
            return false;
        }
        C19EG c19egLIZIZ = StateOwner.LL.LIZIZ();
        IFriendsTabLayoutAbility iFriendsTabLayoutAbilityLIZLLL = null;
        if (c19egLIZIZ != null) {
            iFriendsTabLayoutAbilityLIZLLL = C1583510rJF.LIZLLL(C1558360qeg.LJI(c19egLIZIZ, null));
        }
        if (iFriendsTabLayoutAbilityLIZLLL != null && (interfaceC1584710rLBKx = iFriendsTabLayoutAbilityLIZLLL.Kx(str)) != null && interfaceC1584710rLBKx.Xd()) {
            return true;
        }
        C1587220rPE.LIZ.getClass();
        if (C1587220rPE.LIZIZ.getBoolean("has_shown_guide_dot", false)) {
            return false;
        }
        return true;
    }

    public final int LJII(String str) {
        SingleTabCounter next;
        Iterator<SingleTabCounter> it2 = this.LIZIZ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.tag, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        SingleTabCounter singleTabCounter = next;
        if (singleTabCounter != null) {
            return singleTabCounter.numberCount;
        }
        return 0;
    }

    public static void LIZJ(C1587050rOx c1587050rOx, String str, int i) {
        SingleTabCounter next;
        Iterator<SingleTabCounter> it2 = c1587050rOx.LIZIZ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.tag, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        SingleTabCounter singleTabCounter = next;
        if (singleTabCounter != null && i != singleTabCounter.numberCount) {
            singleTabCounter.setNumberCount(i);
        }
    }
}
