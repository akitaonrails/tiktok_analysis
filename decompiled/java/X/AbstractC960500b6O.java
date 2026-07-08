package X;

import Y.AfS0S0410100_15;
import Y.AfS0S0510100_15;
import Y.AfS109S0300000_15;
import Y.AfS151S0200000_15;
import android.os.SystemClock;
import android.util.Pair;
import com.bytedance.android.live.liveinteract.cohost.remote.api.CoHostApi;
import com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostInviteListContract$AbsView;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.BaseMultiHostInviteListFragment;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.CohostStateInMgChannel;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.UserSuggestionInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveCohostFriendListFoldNum;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostWithGuestPhase2CohostPanelRealtimeUpdateOpt;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0b6O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC960500b6O extends AbstractC960950b77 implements InterfaceC950820aqm {
    public final DataChannel LLJJJJJIL;
    public String LLJJJJLIIL;
    public boolean LLJJL;
    public Map<Long, RivalExtraInfo> LLJJLIIIJLLLLLLLZ;
    public final Map<Long, RivalExtraInfo> LLJL;
    public List<String> LLJLIL;
    public AbstractC944020afo LLJLILLLLZIIL;
    public final C960510b6P LLJLL;
    public boolean LLJLLIL;
    public final C960520b6Q LLJLLL;

    @Override // X.AbstractC960950b77
    public final void LJJIIJ() {
        this.LLJJL = false;
    }

    @Override // X.AbstractC960950b77
    public final void LJJIIJZLJL() {
        this.LLJJL = true;
    }

    @Override // X.AbstractC960950b77
    public void LJJIJIIJIL(EnumC961080b7K enumC961080b7K) {
    }

    public abstract boolean LJJIZ();

    public void LJJJI() {
    }

    @Override // X.InterfaceC950820aqm
    public final void LIZLLL() {
        MultiCoHostInviteListContract$AbsView multiCoHostInviteListContract$AbsView = (MultiCoHostInviteListContract$AbsView) this.LL;
        if (multiCoHostInviteListContract$AbsView != null) {
            multiCoHostInviteListContract$AbsView.aS();
        }
    }

    @Override // X.InterfaceC950820aqm
    public final void LJ() {
        C20441214yg.LJIIIZ("BaseMultiCoHostInviteListPresenter", "rechargeUserInfoForConflict");
        C915980Zwa.LJII().LJLZ(null);
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsPresenter
    public void LJIIIIZZ() {
        this.LLJJJJJIL.zQ2(this);
        C960510b6P c960510b6P = this.LLJLL;
        c960510b6P.LJI();
        c960510b6P.LJI = new C960530b6R();
        C958390b2z.LIZIZ.clear();
        C11JF c11jf = C958390b2z.LIZ;
        if (c11jf != null) {
            c11jf.dispose();
        }
    }

    @Override // X.AbstractC960950b77
    public void LJJIIZ() {
        C960510b6P c960510b6P = this.LLJLL;
        c960510b6P.LIZIZ();
        if (c960510b6P.LJ) {
            return;
        }
        C20441214yg.LJIIIZ("MultiCoHostUserListStatusLoopManager", "reStartFetchTask when user recover interact");
        C11JF c11jf = c960510b6P.LJFF;
        if (c11jf != null) {
            c11jf.dispose();
        }
        c960510b6P.LJFF = null;
        c960510b6P.LIZJ = SystemClock.uptimeMillis();
        c960510b6P.LIZLLL = 0;
        c960510b6P.LJFF(false);
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsPresenter
    public final void onCreate() {
        this.LLJLL.LJI = this.LLJLLL;
        C931800aM6.LIZ.getClass();
        if (C931800aM6.LIZIZ()) {
            if (CohostWithGuestPhase2CohostPanelRealtimeUpdateOpt.INSTANCE.isEnabled()) {
                this.LLJJJJJIL.DQ2(CohostStateInMgChannel.class, this, new AwS594S0100000_15(this, 71));
            } else {
                C20441214yg.LJIIIIZZ("onCreate, CohostWithGuestPhase2CohostPanelRealtimeUpdateOpt=false");
            }
        }
    }

    public static Pair LJJIL(List list) {
        int size = list.size();
        LiveCohostFriendListFoldNum liveCohostFriendListFoldNum = LiveCohostFriendListFoldNum.INSTANCE;
        int value = liveCohostFriendListFoldNum.getValue();
        if (size <= liveCohostFriendListFoldNum.getValue()) {
            return new Pair(Boolean.FALSE, Integer.valueOf(value));
        }
        return new Pair(Boolean.TRUE, Integer.valueOf(value));
    }

    @Override // X.AbstractC960950b77
    public final void LJIIJJI(Room room) {
        C950790aqj.LIZLLL(room);
    }

    @Override // X.AbstractC960950b77
    public final void LJJIJ(C955590ayT c955590ayT) {
        Long lValueOf;
        long id;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        C955400ayA c955400ayA = C955400ayA.LIZ;
        Long lValueOf2 = null;
        if (room != null) {
            lValueOf = Long.valueOf(room.getOwnerUserId());
        } else {
            lValueOf = null;
        }
        String strValueOf = String.valueOf(lValueOf);
        String strValueOf2 = String.valueOf(c955590ayT.LJ.getOwnerUserId());
        if (room != null) {
            lValueOf2 = Long.valueOf(room.getId());
        }
        C955400ayA.LJLJL(strValueOf, strValueOf2, String.valueOf(lValueOf2));
        C480460Ism.LIZ().getClass();
        CoHostApi coHostApi = (CoHostApi) C480460Ism.LIZLLL(CoHostApi.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        ((C0J1N) coHostApi.reserve(id, c955590ayT.LJ.getId(), c955590ayT.LJ.getOwnerUserId(), 1).LJIILIIL(new C0UO0()).LIZJ(LJII())).LIZ(new AfS109S0300000_15(room, c955590ayT, this, 4), new AfS151S0200000_15(this, c955590ayT, 12));
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0b6Q] */
    public AbstractC960500b6O(BaseMultiHostInviteListFragment baseMultiHostInviteListFragment, DataChannel dataChannel) {
        super(baseMultiHostInviteListFragment);
        this.LLJJJJJIL = dataChannel;
        this.LLJJJJLIIL = "";
        this.LLJJLIIIJLLLLLLLZ = new LinkedHashMap();
        this.LLJL = new LinkedHashMap();
        this.LLJLIL = C13BV.INSTANCE;
        this.LLJLL = new C960510b6P();
        this.LLJLLL = new InterfaceC960540b6S() { // from class: X.0b6Q
            @Override // X.InterfaceC960540b6S
            public final C410901il LIZ() {
                return this.LIZ.LLJILJILJ;
            }

            @Override // X.InterfaceC960540b6S
            public final C410901il LIZIZ() {
                C410901il c410901il = new C410901il();
                for (Object obj : this.LIZ.LLJILJILJ) {
                    if ((obj instanceof C955670ayb) && ((C955670ayb) obj).LIZJ) {
                        c410901il.add(obj);
                    }
                }
                return c410901il;
            }

            @Override // X.InterfaceC960540b6S
            public final boolean LIZLLL() {
                MultiCoHostInviteListContract$AbsView multiCoHostInviteListContract$AbsView = (MultiCoHostInviteListContract$AbsView) this.LIZ.LL;
                if (multiCoHostInviteListContract$AbsView != null) {
                    return multiCoHostInviteListContract$AbsView.PR();
                }
                return false;
            }

            /* JADX WARN: Code restructure failed: missing block: B:53:0x010b, code lost:
            
                r0 = (com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostInviteListContract$AbsView) r8.LIZ.LL;
             */
            /* JADX WARN: Code restructure failed: missing block: B:54:0x0111, code lost:
            
                if (r0 == null) goto L56;
             */
            /* JADX WARN: Code restructure failed: missing block: B:55:0x0113, code lost:
            
                r2 = java.lang.Boolean.valueOf(r0.LLJ);
             */
            /* JADX WARN: Code restructure failed: missing block: B:57:0x011d, code lost:
            
                if (X.C500260Jjc.LJJIJIIJIL(r2) == false) goto L19;
             */
            /* JADX WARN: Code restructure failed: missing block: B:58:0x011f, code lost:
            
                r2 = X.C500260Jjc.LJI(r8.LIZ.LLJILJILJ, kotlin.jvm.internal.AFwS250S0000000_15.get$arr$(27));
                r1 = r8.LIZ;
             */
            /* JADX WARN: Code restructure failed: missing block: B:59:0x0133, code lost:
            
                if (r2.getFirst() == null) goto L61;
             */
            /* JADX WARN: Code restructure failed: missing block: B:60:0x0135, code lost:
            
                r6 = ((java.lang.Number) r2.getSecond()).intValue() + 1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:61:0x0141, code lost:
            
                r2 = r1.LLJILJILJ;
             */
            /* JADX WARN: Code restructure failed: missing block: B:62:0x0145, code lost:
            
                if (r12 == null) goto L66;
             */
            /* JADX WARN: Code restructure failed: missing block: B:63:0x0147, code lost:
            
                r0 = r12.statusText;
             */
            /* JADX WARN: Code restructure failed: missing block: B:64:0x0149, code lost:
            
                if (r0 == null) goto L66;
             */
            /* JADX WARN: Code restructure failed: missing block: B:65:0x014b, code lost:
            
                r4 = r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:66:0x014c, code lost:
            
                r2.add(r6, new X.C960600b6Y(r4, r3));
             */
            @Override // X.InterfaceC960540b6S
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZJ(X.C410901il r9, boolean r10, java.util.Set<java.lang.Integer> r11, com.bytedance.android.livesdk.chatroom.interact.model.MGetUserLinkmicStatusResponse.ResponseData r12) {
                /*
                    Method dump skipped, instruction units count: 361
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C960520b6Q.LIZJ(X.01il, boolean, java.util.Set, com.bytedance.android.livesdk.chatroom.interact.model.MGetUserLinkmicStatusResponse$ResponseData):void");
            }
        };
    }

    @Override // X.InterfaceC950820aqm
    public final void LIZ(Throwable th, Room room) {
        MultiCoHostInviteListContract$AbsView multiCoHostInviteListContract$AbsView = (MultiCoHostInviteListContract$AbsView) this.LL;
        if (multiCoHostInviteListContract$AbsView != null) {
            multiCoHostInviteListContract$AbsView.ZR(th, room);
        }
    }

    @Override // X.AbstractC960950b77
    public final void LJIIL(C955590ayT c955590ayT, Room room) {
        C950790aqj.LIZ.LIZ(c955590ayT, room);
    }

    @Override // X.InterfaceC950820aqm
    public final void LIZJ(int i, int i2, long j) {
        RivalExtraInfo rivalExtraInfo;
        C410901il c410901il = this.LLJILJILJ;
        ArrayList arrayList = new ArrayList();
        for (Object obj : c410901il) {
            if (obj instanceof C955590ayT) {
                arrayList.add(obj);
            }
        }
        ArrayList<C955590ayT> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((C955590ayT) obj2).LJ.getId() == j) {
                arrayList2.add(obj2);
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        if (i >= 0 && (rivalExtraInfo = ((C955590ayT) ListProtector.get(arrayList2, 0)).LJIIJ) != null) {
            C955940az2.LIZJ(rivalExtraInfo, i, i2, (C955590ayT) ListProtector.get(arrayList2, 0));
        }
        for (C955590ayT c955590ayT : arrayList2) {
            int iIndexOf = this.LLJILJILJ.indexOf(c955590ayT);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onInviteFailed update item pos = ");
            sbLIZ.append(iIndexOf);
            sbLIZ.append(" nickname = ");
            sbLIZ.append(C0KVU.LJ(c955590ayT.LJ.getOwner()));
            C20441214yg.LJIIIZ("BaseMultiCoHostInviteListPresenter", C2188811AlT.LIZIZ(sbLIZ));
            MultiCoHostInviteListContract$AbsView multiCoHostInviteListContract$AbsView = (MultiCoHostInviteListContract$AbsView) this.LL;
            if (multiCoHostInviteListContract$AbsView != null) {
                multiCoHostInviteListContract$AbsView.rS(iIndexOf);
            }
        }
    }

    @Override // X.InterfaceC950820aqm
    public final void LJFF(long j, Room room, RivalExtraInfo rivalExtraInfo) {
        UserSuggestionInfo userSuggestionInfo;
        RivalExtraInfo rivalExtraInfo2;
        C410901il c410901il = this.LLJILJILJ;
        ArrayList arrayList = new ArrayList();
        for (Object obj : c410901il) {
            if (obj instanceof C955590ayT) {
                arrayList.add(obj);
            }
        }
        ArrayList<C955590ayT> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((C955590ayT) obj2).LJ.getOwner().getId() == j) {
                arrayList2.add(obj2);
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        RivalExtraInfo rivalExtraInfo3 = ((C955590ayT) ListProtector.get(arrayList2, 0)).LJIIJ;
        if (rivalExtraInfo3 != null) {
            userSuggestionInfo = rivalExtraInfo3.userSuggestionInfo;
        } else {
            userSuggestionInfo = null;
        }
        C955590ayT c955590ayT = (C955590ayT) ListProtector.get(arrayList2, 0);
        c955590ayT.LJIIJ = rivalExtraInfo;
        c955590ayT.LJIJ = c955590ayT.LJ();
        if (userSuggestionInfo != null && (rivalExtraInfo2 = ((C955590ayT) ListProtector.get(arrayList2, 0)).LJIIJ) != null) {
            rivalExtraInfo2.userSuggestionInfo = userSuggestionInfo;
        }
        for (C955590ayT c955590ayT2 : arrayList2) {
            c955590ayT2.LJ = room;
            int iIndexOf = this.LLJILJILJ.indexOf(c955590ayT2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateInviteItemPlayTypeByUid update item pos = ");
            sbLIZ.append(iIndexOf);
            sbLIZ.append(" nickname = ");
            sbLIZ.append(C0KVU.LJ(c955590ayT2.LJ.getOwner()));
            C20441214yg.LJIIIZ("BaseMultiCoHostInviteListPresenter", C2188811AlT.LIZIZ(sbLIZ));
            MultiCoHostInviteListContract$AbsView multiCoHostInviteListContract$AbsView = (MultiCoHostInviteListContract$AbsView) this.LL;
            if (multiCoHostInviteListContract$AbsView != null) {
                multiCoHostInviteListContract$AbsView.rS(iIndexOf);
            }
        }
    }

    @Override // X.InterfaceC950820aqm
    public final void LIZIZ(int i, int i2, int i3, long j) {
        Object next;
        C960450b6J c960450b6J;
        List<Long> list;
        C410901il c410901il = this.LLJILJILJ;
        ArrayList arrayList = new ArrayList();
        for (Object obj : c410901il) {
            if (obj instanceof C955590ayT) {
                arrayList.add(obj);
            }
        }
        ArrayList<C955590ayT> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((C955590ayT) obj2).LJ.getId() == j) {
                arrayList2.add(obj2);
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        RivalExtraInfo rivalExtraInfo = ((C955590ayT) ListProtector.get(arrayList2, 0)).LJIIJ;
        if (rivalExtraInfo != null) {
            rivalExtraInfo.showPlayType = i;
        }
        RivalExtraInfo rivalExtraInfo2 = ((C955590ayT) ListProtector.get(arrayList2, 0)).LJIIJ;
        if (rivalExtraInfo2 != null) {
            C955940az2.LIZJ(rivalExtraInfo2, i2, i3, (C955590ayT) ListProtector.get(arrayList2, 0));
        }
        for (C955590ayT c955590ayT : arrayList2) {
            int iIndexOf = this.LLJILJILJ.indexOf(c955590ayT);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateInviteItemPlayTypeByRoomId update item pos = ");
            sbLIZ.append(iIndexOf);
            sbLIZ.append(" nickname = ");
            sbLIZ.append(C0KVU.LJ(c955590ayT.LJ.getOwner()));
            C20441214yg.LJIIIZ("BaseMultiCoHostInviteListPresenter", C2188811AlT.LIZIZ(sbLIZ));
            MultiCoHostInviteListContract$AbsView multiCoHostInviteListContract$AbsView = (MultiCoHostInviteListContract$AbsView) this.LL;
            if (multiCoHostInviteListContract$AbsView != null) {
                multiCoHostInviteListContract$AbsView.rS(iIndexOf);
            }
        }
        Iterator<Object> it2 = this.LLJILJILJ.iterator();
        do {
            next = null;
            if (!it2.hasNext()) {
                break;
            } else {
                next = it2.next();
            }
        } while (!(next instanceof C960450b6J));
        if ((next instanceof C960450b6J) && (c960450b6J = (C960450b6J) next) != null) {
            for (Object obj3 : c960450b6J.LJ) {
                if ((obj3 instanceof C958360b2w) && (list = ((C958360b2w) obj3).LJ.requestRoomList) != null && list.contains(Long.valueOf(j))) {
                    if (obj3 != null) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("triggerRefreshLoop roomId:");
                        sbLIZ2.append(j);
                        C20441214yg.LJIIIZ("BaseMultiCoHostInviteListPresenter", C2188811AlT.LIZIZ(sbLIZ2));
                        this.LLJLL.LJFF(true);
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // X.AbstractC960950b77
    public final void LJIIIZ(C955590ayT c955590ayT, C955540ayO c955540ayO, boolean z, long j) {
        Room room = c955590ayT.LJ;
        C238400w2 c238400w2 = new C238400w2();
        long jLJIIL = C950220apo.LJIIL(room);
        c238400w2.element = jLJIIL;
        long jLongValue = 0;
        if (jLJIIL == 0) {
            C480460Ism.LIZ().getClass();
            CoHostApi coHostApi = (CoHostApi) C480460Ism.LIZLLL(CoHostApi.class);
            Long lLJIIJ = C930540aK4.LJIIJ();
            if (lLJIIJ != null) {
                jLongValue = lLJIIJ.longValue();
            }
            ((C0J1N) coHostApi.getUserLinkmicStatusMultiCoHost(jLongValue, String.valueOf(room.getOwnerUserId()), String.valueOf(room.getId()), "", "", "", "", false).LJIILIIL(new C0UO0()).LIZJ(LJII())).LIZ(new AfS0S0510100_15(c238400w2, room, c955590ayT, c955540ayO, z, this, j, 0), new AfS0S0410100_15(c955590ayT, c955540ayO, this, z, c238400w2, j, 0));
        } else {
            String str = c955590ayT.LJII;
            if (str == null) {
                str = "";
            }
            C950790aqj.LIZJ(c955590ayT, c955540ayO, z, str, this, j, jLJIIL);
        }
        this.LLJLLIL = true;
    }

    @Override // X.AbstractC960950b77
    public final void LJIJJ(C955590ayT c955590ayT, C955540ayO c955540ayO, boolean z, long j) {
        String str = c955590ayT.LJII;
        if (str == null) {
            str = "";
        }
        C950790aqj.LJ(c955590ayT, c955540ayO, z, str, this, j);
        this.LLJLLIL = true;
    }
}
