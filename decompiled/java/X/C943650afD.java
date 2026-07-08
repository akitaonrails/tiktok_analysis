package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.LinkMicAbilityManager;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.CohostStateInMgChannel;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.MultiGuestLayoutExtra;
import tikcast.linkmic.common.MultiGuestSpotExtra;
import tikcast.linkmic.common.PosIdentity;
import tikcast.linkmic.common.SpotInfo;

/* JADX INFO: renamed from: X.0afD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C943650afD {
    public static final C943650afD LIZ = new C943650afD();
    public static DataChannel LIZIZ;
    public static final C943730afL LIZJ;
    public static final C943690afH LIZLLL;
    public static final C943710afJ LJ;
    public static final Set<String> LJFF;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0afL] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0afH] */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.0afJ] */
    static {
        final C943650afD c943650afD = LIZ;
        LIZJ = new InterfaceC941900acO(c943650afD) { // from class: X.0afL
            public final WeakReference<C943650afD> LL;

            {
                this.LL = new WeakReference<>(c943650afD);
            }

            @Override // X.InterfaceC941900acO
            public final void LIZJ(C01EL c01el, String str) {
                if (this.LL.get() != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("game mode state change, ability = ");
                    sbLIZ.append(str);
                    sbLIZ.append(", abilityState = ");
                    sbLIZ.append(c01el);
                    C20441214yg.LJIIIZ("NotifyCohost", C2188811AlT.LIZIZ(sbLIZ));
                    DataChannel dataChannel = C943650afD.LIZIZ;
                    if (dataChannel != null) {
                        dataChannel.zW(CohostStateInMgChannel.class, C943650afD.LIZ());
                    }
                }
            }
        };
        final C943650afD c943650afD2 = LIZ;
        LIZLLL = new InterfaceC940760aaY(c943650afD2) { // from class: X.0afH
            public final WeakReference<C943650afD> LIZ;

            @Override // X.InterfaceC940760aaY
            public final void LJFF(int i, String str) {
            }

            @Override // X.InterfaceC940760aaY
            public final void LJIJI(LayoutState layoutState, List<SpotInfo> list, MultiGuestLayoutExtra multiGuestLayoutExtra) {
            }

            @Override // X.InterfaceC940760aaY
            public final void LJJI(String str) {
            }

            @Override // X.InterfaceC940760aaY
            public final void LJJII(String str) {
            }

            @Override // X.InterfaceC940760aaY
            public final void LJJIII(List<C957020b0m> list) {
            }

            @Override // X.InterfaceC940760aaY
            public final void LJJIJ(String str) {
            }

            @Override // X.InterfaceC940760aaY
            public final void LJJIJIIJIL(String str) {
            }

            {
                this.LIZ = new WeakReference<>(c943650afD2);
            }

            @Override // X.InterfaceC940760aaY
            public final void LJJIIJZLJL(C942080acg c942080acg) {
                if (this.LIZ.get() != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("layout render success end, renderResult = ");
                    sbLIZ.append(c942080acg);
                    C20441214yg.LJIIIZ("NotifyCohost", C2188811AlT.LIZIZ(sbLIZ));
                    DataChannel dataChannel = C943650afD.LIZIZ;
                    if (dataChannel != null) {
                        dataChannel.zW(CohostStateInMgChannel.class, C943650afD.LIZ());
                    }
                }
            }
        };
        final C943650afD c943650afD3 = LIZ;
        LJ = new InterfaceC915240ZvO(c943650afD3) { // from class: X.0afJ
            public final WeakReference<C943650afD> LIZ;

            {
                this.LIZ = new WeakReference<>(c943650afD3);
            }

            @Override // X.InterfaceC915240ZvO
            public final void LIZ(int i) {
                if (this.LIZ.get() != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("multi guest num change, linkedGuestNum = ");
                    sbLIZ.append(C924810aAp.LJ().LJJII);
                    C20441214yg.LJIIIZ("NotifyCohost", C2188811AlT.LIZIZ(sbLIZ));
                    DataChannel dataChannel = C943650afD.LIZIZ;
                    if (dataChannel != null) {
                        dataChannel.zW(CohostStateInMgChannel.class, C943650afD.LIZ());
                    }
                }
            }
        };
        LJFF = C13LQ.LJLIIL(new String[]{"count_down_single", "count_down_for_all", "guest_showdown", "live_show", "aigc", "top_guests", "lets_dance"});
    }

    public static AbstractC944020afo LIZ() {
        boolean z;
        List<String> listLJIILLIIL;
        boolean z2;
        PosIdentity posIdentity;
        InterfaceC302401Fe interfaceC302401Fe;
        AbstractC928510aGn abstractC928510aGnLIZ;
        List listLJJIII;
        C931800aM6.LIZ.getClass();
        if (!C931800aM6.LIZIZ()) {
            C20441214yg.LJIIIZ("NotifyCohost", "not in union session");
            return C944050afr.LIZ;
        }
        if (!C917810ZzX.LJIIIZ()) {
            C20441214yg.LJIIIZ("NotifyCohost", "not support multi guest");
            return C944050afr.LIZ;
        }
        LinkMicAbilityManager.LJIIIZ.getClass();
        InterfaceC941720ac6 interfaceC941720ac6LIZIZ = C941700ac4.LIZIZ();
        List<String> listLJIILLIIL2 = interfaceC941720ac6LIZIZ != null ? interfaceC941720ac6LIZIZ.LJIILLIIL() : null;
        boolean z3 = false;
        boolean z4 = listLJIILLIIL2 == null || listLJIILLIIL2.isEmpty();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isRunningAbilityEmpty = ");
        sbLIZ.append(z4);
        C20441214yg.LJIIIZ("NotifyCohost", C2188811AlT.LIZIZ(sbLIZ));
        boolean z5 = C924810aAp.LJ().LJJII > 2;
        Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
        if (!(objLJIIIZ instanceof InterfaceC302401Fe) || (interfaceC302401Fe = (InterfaceC302401Fe) objLJIIIZ) == null || (abstractC928510aGnLIZ = interfaceC302401Fe.LIZ()) == null || (listLJJIII = abstractC928510aGnLIZ.LJJIII()) == null) {
            z = false;
            break;
        }
        if (!listLJJIII.isEmpty()) {
            Iterator it2 = listLJJIII.iterator();
            while (it2.hasNext()) {
                if (!((LinkPlayerInfo) it2.next()).canBringToCohostDuringMultiguest) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        C931800aM6.LIZ.getClass();
        boolean zLIZIZ = C931800aM6.LIZIZ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("currentGuestNumReachMax = ");
        sbLIZ2.append(z5);
        sbLIZ2.append(" coHostWhenMultiGuestV2Enable = ");
        sbLIZ2.append(zLIZIZ);
        sbLIZ2.append(" isCurrentAudienceVersionOk = ");
        sbLIZ2.append(z);
        C20441214yg.LJIIIZ("NotifyCohost", C2188811AlT.LIZIZ(sbLIZ2));
        if (z5 || !z || !zLIZIZ) {
            C20441214yg.LJ("NotifyCohost", "not match cohost condition");
            return C944030afp.LIZ;
        }
        if (z4) {
            C20441214yg.LJIIIZ("NotifyCohost", "isRunningAbilityEmpty, Enable");
            return C944040afq.LIZ;
        }
        LinkMicAbilityManager.LJIIIZ.getClass();
        InterfaceC941720ac6 interfaceC941720ac6LIZIZ2 = C941700ac4.LIZIZ();
        if (interfaceC941720ac6LIZIZ2 == null || (listLJIILLIIL = interfaceC941720ac6LIZIZ2.LJIILLIIL()) == null) {
            listLJIILLIIL = C13BV.INSTANCE;
        }
        StringBuilder sb = new StringBuilder("current running Abilities: ");
        sb.append(listLJIILLIIL);
        sb.append(", isInBlackList = ");
        boolean z6 = listLJIILLIIL instanceof Collection;
        if (z6 && listLJIILLIIL.isEmpty()) {
            z2 = false;
        } else {
            Iterator<String> it3 = listLJIILLIIL.iterator();
            while (it3.hasNext()) {
                if (LJFF.contains(it3.next())) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        }
        sb.append(z2);
        C20441214yg.LJIIIZ("NotifyCohost", sb.toString());
        if (!z6 || !listLJIILLIIL.isEmpty()) {
            Iterator<String> it4 = listLJIILLIIL.iterator();
            while (it4.hasNext()) {
                if (LJFF.contains(it4.next())) {
                    C20441214yg.LJIIIZ("NotifyCohost", "in black list play mode, Disable");
                    return C944030afp.LIZ;
                }
            }
        }
        List<C957020b0m> listLJIIIZ = C940770aaZ.LIZ().getDataSource().LJIIIZ();
        if (!(listLJIIIZ instanceof Collection) || !listLJIIIZ.isEmpty()) {
            Iterator<C957020b0m> it5 = listLJIIIZ.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    break;
                }
                C957020b0m next = it5.next();
                MultiGuestSpotExtra multiGuestExtra = next.getMultiGuestExtra();
                if (C176600m4.LIZIZ(multiGuestExtra != null ? Boolean.valueOf(multiGuestExtra.isEnlarged) : null) && !next.LLJIJIL && (posIdentity = next.getPosIdentity()) != null && posIdentity.type == 1) {
                    z3 = true;
                    break;
                }
            }
        }
        C20441214yg.LJIIIZ("NotifyCohost", "isHasGuestZoomed = " + z3);
        if (z3) {
            C20441214yg.LJIIIZ("NotifyCohost", "in special play mode, Disable");
            return C944030afp.LIZ;
        }
        C20441214yg.LJIIIZ("NotifyCohost", "game mode enabled by default");
        return C944040afq.LIZ;
    }
}
