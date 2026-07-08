package com.bytedance.android.live.liveinteract.multihost.core.service;

import X.AbstractC915270ZvR;
import X.C01GW;
import X.C0JG7;
import X.C1161920gLG;
import X.C13BV;
import X.C1AYC;
import X.C20441214yg;
import X.C2188811AlT;
import X.C755560TkQ;
import X.C766270U4b;
import X.C776360Ucs;
import X.C776380Ucu;
import X.C914570ZuJ;
import X.C915980Zwa;
import X.C917110ZyP;
import X.C920410a3j;
import X.C920570a3z;
import X.C920580a40;
import X.C920590a41;
import X.C920600a42;
import X.C920610a43;
import X.C920620a44;
import X.C920630a45;
import X.C923970a9T;
import X.C936770aU7;
import X.C937970aW3;
import X.C944300agG;
import X.C945210ahj;
import X.C945320ahu;
import X.C948780anU;
import X.C949390aoT;
import X.C949400aoU;
import X.C949590aon;
import X.C950000apS;
import X.C950050apX;
import X.C950100apc;
import X.C950220apo;
import X.C950440aqA;
import X.C950470aqD;
import X.C950850aqp;
import X.C952540atY;
import X.C954460awe;
import X.C955010axX;
import X.C955430ayD;
import X.C955440ayE;
import X.EnumC919170a1j;
import X.EnumC950120ape;
import X.EnumC950510aqH;
import X.EnumC955820ayq;
import X.InterfaceC463550IFt;
import X.InterfaceC925040aBC;
import X.InterfaceC945140ahc;
import X.InterfaceC950010apT;
import X.InterfaceC954180awC;
import X.InterfaceC965060bDk;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multihost.core.adapter.IMultiHostCrossAdapter;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.VirtualWaitingUser;
import com.bytedance.android.livesdk.comp.api.linkcore.api.ILinkMicService;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MixInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicFixLiveConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostCrossRoomPushMinVersionSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCohostBgColorAnchorEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCohostBgColorAnchorSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS202S0000000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public class MultiHostService implements IMultiHostService, InterfaceC463550IFt {
    public static final /* synthetic */ int LLJI = 0;
    public boolean LL;
    public boolean LLILLJJLI;
    public DataChannel LLILLL;
    public Room LLILZ;
    public boolean LLILZIL;
    public ILinkMicService LLILZLL;
    public InterfaceC945140ahc LLIZ;
    public C949400aoU LLIZLLLIL;
    public IMultiHostCrossAdapter LLJ;

    @Override // X.InterfaceC950030apV
    public final void LLFII() {
    }

    @Override // X.InterfaceC950030apV
    public final void R5() {
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService
    public final void jn1() {
    }

    @Override // X.InterfaceC950030apV
    public final boolean L6() {
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            return iMultiHostCrossAdapter.L6();
        }
        return false;
    }

    @Override // X.InterfaceC950030apV
    public final List<String> LJIILJJIL() {
        List<String> listLJIILJJIL;
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        return (iMultiHostCrossAdapter == null || (listLJIILJJIL = iMultiHostCrossAdapter.LJIILJJIL()) == null) ? C13BV.INSTANCE : listLJIILJJIL;
    }

    @Override // X.InterfaceC950030apV
    public final EnumC919170a1j LJIJI() {
        EnumC919170a1j enumC919170a1jLJIJI;
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        return (iMultiHostCrossAdapter == null || (enumC919170a1jLJIJI = iMultiHostCrossAdapter.LJIJI()) == null) ? EnumC919170a1j.UNKNOWN : enumC919170a1jLJIJI;
    }

    @Override // X.InterfaceC950030apV
    public final List<C954460awe> LJIJJ() {
        List<C954460awe> listLJIJJ;
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        return (iMultiHostCrossAdapter == null || (listLJIJJ = iMultiHostCrossAdapter.LJIJJ()) == null) ? C13BV.INSTANCE : listLJIJJ;
    }

    @Override // X.InterfaceC950030apV
    public final boolean LJIL() {
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            return iMultiHostCrossAdapter.LJIL();
        }
        return false;
    }

    @Override // X.InterfaceC950030apV
    public final boolean LJJIII() {
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            return iMultiHostCrossAdapter.LJJIII();
        }
        return false;
    }

    @Override // X.InterfaceC950030apV
    public final List<C936770aU7> LJJIIJZLJL() {
        List<C936770aU7> listLJJIIJZLJL;
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        return (iMultiHostCrossAdapter == null || (listLJJIIJZLJL = iMultiHostCrossAdapter.LJJIIJZLJL()) == null) ? C13BV.INSTANCE : listLJJIIJZLJL;
    }

    @Override // X.InterfaceC950030apV
    public final List<VirtualWaitingUser> LJJIJIL() {
        List<VirtualWaitingUser> listLJJIJIL;
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        return (iMultiHostCrossAdapter == null || (listLJJIJIL = iMultiHostCrossAdapter.LJJIJIL()) == null) ? C13BV.INSTANCE : listLJJIJIL;
    }

    @Override // X.InterfaceC950040apW
    public final long LJJL() {
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            return iMultiHostCrossAdapter.LJJL();
        }
        return 0L;
    }

    @Override // X.InterfaceC950030apV
    public final List<C954460awe> LJJLI() {
        List<C954460awe> listLJJLI;
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        return (iMultiHostCrossAdapter == null || (listLJJLI = iMultiHostCrossAdapter.LJJLI()) == null) ? C13BV.INSTANCE : listLJJLI;
    }

    @Override // X.InterfaceC950030apV
    public final boolean LJJLIIIJJI() {
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            return iMultiHostCrossAdapter.LJJLIIIJJI();
        }
        return false;
    }

    @Override // X.InterfaceC950030apV
    public final int LJJLJ() {
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            return iMultiHostCrossAdapter.LJJLJ();
        }
        return 0;
    }

    @Override // X.InterfaceC950030apV
    public final String LJLJJL() {
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            return iMultiHostCrossAdapter.LJLJJL();
        }
        return null;
    }

    @Override // X.InterfaceC950030apV
    public final ConcurrentHashMap<Long, C914570ZuJ> LJLLI() {
        ConcurrentHashMap<Long, C914570ZuJ> concurrentHashMapLJLLI;
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        return (iMultiHostCrossAdapter == null || (concurrentHashMapLJLLI = iMultiHostCrossAdapter.LJLLI()) == null) ? new ConcurrentHashMap<>() : concurrentHashMapLJLLI;
    }

    @Override // X.InterfaceC950030apV
    public final void LJLLJ() {
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            iMultiHostCrossAdapter.LJLLJ();
        }
    }

    @Override // X.InterfaceC950030apV
    public final void LLFF() {
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            iMultiHostCrossAdapter.LLFF();
        }
    }

    @Override // X.InterfaceC950030apV
    public final boolean LLFFF() {
        boolean z = this.LL ? this.LLILLJJLI : false;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isEnableSDK_base, isAttached = ");
        sbLIZ.append(this.LL);
        sbLIZ.append(", enabled = ");
        sbLIZ.append(z);
        C20441214yg.LJIIIZ("MultiHostService", C2188811AlT.LIZIZ(sbLIZ));
        return z;
    }

    @Override // X.InterfaceC950030apV
    public final EnumC950120ape LLI() {
        EnumC950120ape enumC950120apeLLI;
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        return (iMultiHostCrossAdapter == null || (enumC950120apeLLI = iMultiHostCrossAdapter.LLI()) == null) ? EnumC950120ape.None : enumC950120apeLLI;
    }

    @Override // X.InterfaceC950030apV
    public final void LLILIL() {
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            iMultiHostCrossAdapter.LLILIL();
        }
    }

    @Override // X.InterfaceC950030apV
    public final boolean LLJ() {
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            return iMultiHostCrossAdapter.LLJ();
        }
        return false;
    }

    @Override // X.InterfaceC950030apV
    public final boolean LLJILLL() {
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            return iMultiHostCrossAdapter.LLJILLL();
        }
        return false;
    }

    @Override // X.InterfaceC950040apW
    public final String LLJJ() {
        String strLLJJ;
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        return (iMultiHostCrossAdapter == null || (strLLJJ = iMultiHostCrossAdapter.LLJJ()) == null) ? "" : strLLJJ;
    }

    @Override // X.InterfaceC950030apV
    public final boolean LLJJIJI() {
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            return iMultiHostCrossAdapter.LLJJIJI();
        }
        return false;
    }

    @Override // X.InterfaceC950030apV
    public final boolean LLJJIJIL() {
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            return iMultiHostCrossAdapter.LLJJIJIL();
        }
        return false;
    }

    @Override // X.InterfaceC950030apV
    public final boolean LLLIZZ() {
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            return iMultiHostCrossAdapter.LLLIZZ();
        }
        return false;
    }

    @Override // X.InterfaceC950040apW
    public final EnumC955820ayq LLLLJ() {
        EnumC955820ayq enumC955820ayqLLLLJ;
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        return (iMultiHostCrossAdapter == null || (enumC955820ayqLLLLJ = iMultiHostCrossAdapter.LLLLJ()) == null) ? EnumC955820ayq.COHOST_MODE_NORMAL : enumC955820ayqLLLLJ;
    }

    @Override // X.InterfaceC950030apV
    public final boolean T9() {
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            return iMultiHostCrossAdapter.T9();
        }
        return false;
    }

    @Override // X.InterfaceC950030apV
    public final int Uh() {
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            return iMultiHostCrossAdapter.Uh();
        }
        return 0;
    }

    @Override // X.InterfaceC950030apV
    public final long ff() {
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            return iMultiHostCrossAdapter.ff();
        }
        return 0L;
    }

    @Override // X.InterfaceC950030apV
    public final long getChannelId() {
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            return iMultiHostCrossAdapter.getChannelId();
        }
        return 0L;
    }

    @Override // X.InterfaceC950030apV
    public final long getInnerChannelId() {
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            return iMultiHostCrossAdapter.getInnerChannelId();
        }
        return 0L;
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService
    public final C955010axX i30() {
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            return iMultiHostCrossAdapter.id2();
        }
        return null;
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService
    public final boolean isAnchor() {
        Boolean bool;
        DataChannel dataChannel = this.LLILLL;
        if (dataChannel == null || (bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // X.InterfaceC950030apV
    public final long js() {
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            return iMultiHostCrossAdapter.js();
        }
        return 0L;
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService
    public final void zc2() {
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            iMultiHostCrossAdapter.LJJLIIJ();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService
    public final boolean BL2() {
        if (LLI() == EnumC950120ape.Linked) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("is_cross_arc_linked");
            sbLIZ.append(", true");
            C20441214yg.LJIIIZ("MultiHostService", C2188811AlT.LIZIZ(sbLIZ));
            return true;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("is_cross_arc_linked");
        sbLIZ2.append(", false");
        C20441214yg.LJIIIZ("MultiHostService", C2188811AlT.LIZIZ(sbLIZ2));
        return false;
    }

    @Override // X.InterfaceC950030apV
    public final void LJI() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("detach_base");
        sbLIZ.append(", isAttached = ");
        sbLIZ.append(this.LL);
        C20441214yg.LJIIIZ("MultiHostService", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LL) {
            IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
            if (iMultiHostCrossAdapter != null) {
                iMultiHostCrossAdapter.LJI();
            }
            this.LLIZ = null;
            this.LLIZLLLIL = null;
            this.LLILLL = null;
            this.LLILZ = null;
            this.LL = false;
            C950100apc.LIZ = 0;
        }
    }

    @Override // X.InterfaceC948650anH
    public final InterfaceC954180awC LJIIIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getLinkSession");
        sbLIZ.append(", using crossAdapter");
        C20441214yg.LJIIIZ("MultiHostService", C2188811AlT.LIZIZ(sbLIZ));
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            return iMultiHostCrossAdapter.LJIIIZ();
        }
        return null;
    }

    @Override // X.InterfaceC950030apV
    public final void LJIJ() {
        if (!LLI().isJoiningOrLinked()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("is_cross_arc_joining_or_linked");
            sbLIZ.append(", false");
            C20441214yg.LJIIIZ("MultiHostService", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("is_cross_arc_joining_or_linked");
        sbLIZ2.append(", true");
        C20441214yg.LJIIIZ("MultiHostService", C2188811AlT.LIZIZ(sbLIZ2));
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            iMultiHostCrossAdapter.LJIJ();
        }
    }

    @Override // X.InterfaceC948650anH
    public final List<LinkUser> LJJIJ() {
        return C950050apX.LIZ(this);
    }

    @Override // X.InterfaceC948650anH
    public final List<LinkUser> LJJJJIZL() {
        List<LinkUser> listLIZLLL;
        InterfaceC954180awC interfaceC954180awCLJIIIZ = LJIIIZ();
        return (interfaceC954180awCLJIIIZ == null || (listLIZLLL = C948780anU.LIZLLL(interfaceC954180awCLJIIIZ)) == null) ? C13BV.INSTANCE : listLIZLLL;
    }

    @Override // X.InterfaceC948650anH
    public final List<LinkUser> LJJJJL() {
        List<LinkUser> listLJ;
        InterfaceC954180awC interfaceC954180awCLJIIIZ = LJIIIZ();
        return (interfaceC954180awCLJIIIZ == null || (listLJ = C948780anU.LJ(interfaceC954180awCLJIIIZ)) == null) ? C13BV.INSTANCE : listLJ;
    }

    @Override // X.InterfaceC948650anH
    public final List<LinkUser> LLLLIILL() {
        List<LinkUser> listLIZLLL;
        InterfaceC954180awC interfaceC954180awCLJIIIZ = LJIIIZ();
        return (interfaceC954180awCLJIIIZ == null || (listLIZLLL = interfaceC954180awCLJIIIZ.LIZLLL()) == null) ? C13BV.INSTANCE : listLIZLLL;
    }

    @Override // X.InterfaceC950030apV
    public final boolean LIZLLL() {
        return this.LL;
    }

    @Override // X.InterfaceC950030apV
    public final InterfaceC945140ahc LLJZIJLIL() {
        return this.LLIZ;
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService
    public final DataChannel getDataChannel() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC950030apV
    public final void LIZIZ(C945320ahu c945320ahu) {
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            iMultiHostCrossAdapter.LIZIZ(c945320ahu);
        }
    }

    @Override // X.InterfaceC950030apV
    public final List<C936770aU7> LJJJJI(long j) {
        List<C936770aU7> listLJJJJI;
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter == null || (listLJJJJI = iMultiHostCrossAdapter.LJJJJI(j)) == null) {
            return C13BV.INSTANCE;
        }
        return listLJJJJI;
    }

    @Override // X.InterfaceC950030apV
    public final void LJJJJLL(Map<Long, GiftGalleryBadgeInfo> map) {
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            iMultiHostCrossAdapter.LJJJJLL(map);
        }
    }

    @Override // X.InterfaceC950060apY
    public final void LJJLIIIIJ(boolean z) {
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            iMultiHostCrossAdapter.LJJLIIIIJ(z);
        }
    }

    @Override // X.InterfaceC950030apV
    public final void LJJZ(String str) {
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            iMultiHostCrossAdapter.LJJZ(str);
        }
    }

    @Override // X.InterfaceC950030apV
    public final void LJLZ(InterfaceC950010apT<C920590a41> interfaceC950010apT) {
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            iMultiHostCrossAdapter.LJLZ(interfaceC950010apT);
        }
    }

    @Override // X.InterfaceC950030apV
    public final C954460awe LJZ(String str) {
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            return iMultiHostCrossAdapter.LJZ(str);
        }
        return null;
    }

    @Override // X.InterfaceC950030apV
    public final C954460awe LLILL(long j) {
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            return iMultiHostCrossAdapter.LLILL(j);
        }
        return null;
    }

    @Override // X.InterfaceC950030apV
    public final long LLILLL(String str) {
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            return iMultiHostCrossAdapter.LLILLL(str);
        }
        return 0L;
    }

    @Override // X.InterfaceC950030apV
    public final boolean LLILZ(long j) {
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            return iMultiHostCrossAdapter.LLILZ(j);
        }
        return false;
    }

    @Override // X.InterfaceC950030apV
    public final List<C954460awe> LLILZLL(boolean z) {
        List<C954460awe> listLLILZLL;
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter == null || (listLLILZLL = iMultiHostCrossAdapter.LLILZLL(z)) == null) {
            return C13BV.INSTANCE;
        }
        return listLLILZLL;
    }

    @Override // X.InterfaceC950060apY
    public final void LLJILJIL(C949590aon c949590aon) {
        C20441214yg.LJIIIZ("MultiHostService", "resume cohost");
        new C955440ayE().LJIJJLI("resume_multi_host_service");
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            iMultiHostCrossAdapter.LLJILJIL(c949590aon);
        }
    }

    @Override // X.InterfaceC950030apV
    public final long LLJJIII(long j) {
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            return iMultiHostCrossAdapter.LLJJIII(j);
        }
        return 0L;
    }

    @Override // X.InterfaceC950030apV
    public final void LLJL(Runnable runnable) {
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            iMultiHostCrossAdapter.LLJL(runnable);
        }
    }

    @Override // X.InterfaceC948650anH
    public final int LLLFF(LinkUser linkUser) {
        String str;
        OnLineMicInfo onLineMicInfoLJL;
        MicPositionInfo micPositionInfo;
        InterfaceC954180awC interfaceC954180awCLJIIIZ = LJIIIZ();
        if (interfaceC954180awCLJIIIZ == null || (str = linkUser.linkMicId) == null || (onLineMicInfoLJL = interfaceC954180awCLJIIIZ.LJL(str)) == null || (micPositionInfo = onLineMicInfoLJL.micPositionData) == null) {
            return -1;
        }
        return micPositionInfo.position;
    }

    @Override // X.InterfaceC950030apV
    public final boolean LLLFZ(long j) {
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            return iMultiHostCrossAdapter.LLLFZ(j);
        }
        return false;
    }

    @Override // X.InterfaceC950030apV
    public final C954460awe LLLILZLLLI(String str) {
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            return iMultiHostCrossAdapter.LLLILZLLLI(str);
        }
        return null;
    }

    @Override // X.InterfaceC950030apV
    public final EnumC950510aqH LLLLII(long j) {
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            return iMultiHostCrossAdapter.LLLLII(j);
        }
        return null;
    }

    @Override // X.InterfaceC950030apV
    public final long LLLLIL(long j) {
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            return iMultiHostCrossAdapter.LLLLIL(j);
        }
        return 0L;
    }

    @Override // X.InterfaceC950030apV
    public final C936770aU7 LLLLILI(String str) {
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            return iMultiHostCrossAdapter.LLLLILI(str);
        }
        return null;
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService
    public final boolean QP(long j) {
        InterfaceC954180awC interfaceC954180awCLJIIIZ;
        boolean z;
        String strU3;
        String strU32;
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        String strU33 = null;
        if (iMultiHostCrossAdapter != null) {
            interfaceC954180awCLJIIIZ = iMultiHostCrossAdapter.LJIIIZ();
        } else {
            interfaceC954180awCLJIIIZ = null;
        }
        if (interfaceC954180awCLJIIIZ != null && interfaceC954180awCLJIIIZ.LLILL()) {
            z = true;
        } else {
            z = false;
        }
        if (this.LLILZIL) {
            if (z) {
                if (interfaceC954180awCLJIIIZ != null) {
                    strU32 = interfaceC954180awCLJIIIZ.U3();
                } else {
                    strU32 = null;
                }
                if (C950220apo.LJJ(strU32) > 0) {
                    return true;
                }
            }
        } else if (z && j > 0) {
            String strValueOf = String.valueOf(j);
            if (interfaceC954180awCLJIIIZ != null) {
                strU3 = interfaceC954180awCLJIIIZ.U3();
            } else {
                strU3 = null;
            }
            if (Intrinsics.LJFF(strValueOf, strU3)) {
                return true;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isCrossSessionValid");
        sbLIZ.append(", isAnchor=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", ");
        sbLIZ.append(z);
        sbLIZ.append(" = ");
        sbLIZ.append(z);
        sbLIZ.append(", , innerChannelId=");
        sbLIZ.append(j);
        sbLIZ.append(", crossSession?.innerChannelId()=");
        if (interfaceC954180awCLJIIIZ != null) {
            strU33 = interfaceC954180awCLJIIIZ.U3();
        }
        sbLIZ.append(strU33);
        sbLIZ.append(' ');
        C20441214yg.LJIIIZ("MultiHostService", C2188811AlT.LIZIZ(sbLIZ));
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService
    public final void RA1(String str) {
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            iMultiHostCrossAdapter.LLLLLJLJLL(str);
        }
    }

    @Override // X.InterfaceC950030apV
    public final void S0(String str) {
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            iMultiHostCrossAdapter.S0(str);
        }
    }

    @Override // X.InterfaceC950030apV
    public final C0JG7 yq(User user) {
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            return iMultiHostCrossAdapter.yq(user);
        }
        return null;
    }

    @Override // X.InterfaceC463550IFt
    public final void zl(C937970aW3 c937970aW3) {
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter instanceof InterfaceC463550IFt) {
            ((InterfaceC463550IFt) iMultiHostCrossAdapter).zl(c937970aW3);
        }
    }

    @Override // X.InterfaceC950040apW
    public final void LJ(C920580a40 c920580a40, InterfaceC950010apT<C920600a42> interfaceC950010apT) {
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            iMultiHostCrossAdapter.LJ(c920580a40, interfaceC950010apT);
        }
    }

    @Override // X.InterfaceC950030apV
    public final void LJIILLIIL(String str, C1AYC c1ayc) {
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            iMultiHostCrossAdapter.LJIILLIIL(str, c1ayc);
        }
    }

    @Override // X.InterfaceC950040apW
    public final void LJJII(C950000apS c950000apS, InterfaceC950010apT<C920620a44> interfaceC950010apT) {
        if (BL2()) {
            IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
            if (iMultiHostCrossAdapter != null) {
                iMultiHostCrossAdapter.LJJII(c950000apS, interfaceC950010apT);
            }
        } else if (c950000apS.LIZLLL > 0) {
            IMultiHostCrossAdapter iMultiHostCrossAdapter2 = this.LLJ;
            if (iMultiHostCrossAdapter2 != null) {
                iMultiHostCrossAdapter2.LJJII(c950000apS, interfaceC950010apT);
            }
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("apply");
            sbLIZ.append(", channelId=");
            sbLIZ.append(c950000apS.LIZLLL);
            sbLIZ.append(", skipped: channelId is zero and not linked");
            C20441214yg.LJIIIZ("MultiHostService", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        C944300agG.LIZ("reentrant_apply");
    }

    @Override // X.InterfaceC950030apV
    public final void LJJIIZ(String str, boolean z) {
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            iMultiHostCrossAdapter.LJJIIZ(str, z);
        }
    }

    @Override // X.InterfaceC950030apV
    public final void LJJIJIIJI(String str, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setEnableSDK_base, isAttached = ");
        sbLIZ.append(this.LL);
        sbLIZ.append(", enable = ");
        sbLIZ.append(true);
        sbLIZ.append(", linkMicManager = ");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", source = ");
        sbLIZ.append("attach_base");
        C20441214yg.LJIIIZ("MultiHostService", C2188811AlT.LIZIZ(sbLIZ));
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            iMultiHostCrossAdapter.LJJIJIIJI("attach_base", true);
        }
        if (!this.LL) {
            return;
        }
        DataChannel dataChannel = this.LLILLL;
        if (dataChannel != null) {
            dataChannel.SX0(C755560TkQ.class, Boolean.TRUE);
        }
        InterfaceC945140ahc interfaceC945140ahc = this.LLIZ;
        if (interfaceC945140ahc != null) {
            interfaceC945140ahc.LIZIZ(false);
        }
        this.LLILLJJLI = true;
    }

    @Override // X.InterfaceC950030apV
    public final <T> void LJJLIIIJL(Class<T> cls, Function2<? super InterfaceC954180awC, ? super C917110ZyP<T>, Unit> function2) {
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            iMultiHostCrossAdapter.LJJLIIIJL(cls, function2);
        }
    }

    @Override // X.InterfaceC950040apW
    public final void LJLIL(C945210ahj c945210ahj, InterfaceC950010apT<C920610a43> interfaceC950010apT) {
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            iMultiHostCrossAdapter.LJLIL(c945210ahj, interfaceC950010apT);
        }
    }

    @Override // X.InterfaceC950030apV
    public final void LJZL(EnumC950120ape enumC950120ape, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateState, newState = ");
        sbLIZ.append(enumC950120ape);
        sbLIZ.append(", force = ");
        sbLIZ.append(z);
        sbLIZ.append(", multiHostCrossAdapter=");
        sbLIZ.append(this.LLJ);
        C20441214yg.LJIIIZ("MultiHostService", C2188811AlT.LIZIZ(sbLIZ));
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            iMultiHostCrossAdapter.LJZL(enumC950120ape, z);
        }
    }

    @Override // X.InterfaceC950030apV
    public final void LLJLIL(String str, boolean z) {
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            iMultiHostCrossAdapter.LLJLIL(str, z);
        }
    }

    @Override // X.InterfaceC950030apV
    public final C954460awe LLLI(long j, boolean z) {
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            return iMultiHostCrossAdapter.LLLI(j, z);
        }
        return null;
    }

    @Override // X.InterfaceC950040apW
    public final void LLLILZ(long j, long j2) {
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            iMultiHostCrossAdapter.LLLILZ(j, j2);
        }
    }

    @Override // X.InterfaceC950030apV
    public final <T> void LLLJIL(Class<T> cls, Function2<? super InterfaceC954180awC, ? super C917110ZyP<T>, Unit> function2) {
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            iMultiHostCrossAdapter.LLLJIL(cls, function2);
        }
    }

    @Override // X.InterfaceC950040apW
    public final void LLLJL(C920570a3z c920570a3z, InterfaceC950010apT<C920630a45> interfaceC950010apT) {
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            iMultiHostCrossAdapter.LLLJL(c920570a3z, interfaceC950010apT);
        }
    }

    @Override // X.InterfaceC950060apY
    public final void LJLIIL(C950850aqp c950850aqp, C950470aqD c950470aqD, Map map) {
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            iMultiHostCrossAdapter.LJLIIL(c950850aqp, c950470aqD, map);
        }
    }

    @Override // X.InterfaceC950040apW
    public final void LJLJLJ(C950000apS c950000apS, InterfaceC950010apT<C920620a44> interfaceC950010apT, AbstractC915270ZvR abstractC915270ZvR) {
        Object obj;
        Map<String, Object> map = c950000apS.LJII;
        Long l = null;
        if (map != null) {
            obj = map.get("webcast_sdk_version");
        } else {
            obj = null;
        }
        if (obj instanceof Long) {
            l = (Long) obj;
        }
        if (l != null) {
            long jLongValue = l.longValue();
            if (jLongValue > 0 && jLongValue < MtCoHostCrossRoomPushMinVersionSetting.INSTANCE.getValue()) {
                C766270U4b.LIZLLL(2131841145);
                C955430ayD.LJFF(c950000apS.LIZJ, c950000apS.LIZLLL, "multi_arch");
                return;
            }
        }
        if (c950000apS.LIZLLL <= 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("invite");
            sbLIZ.append(", param.channelId=");
            sbLIZ.append(c950000apS.LIZLLL);
            sbLIZ.append(", skipped: channelId is zero");
            C20441214yg.LJIIIZ("MultiHostService", C2188811AlT.LIZIZ(sbLIZ));
            C955430ayD.LJFF(c950000apS.LIZJ, c950000apS.LIZLLL, "multi_arch_2");
            new C955440ayE().LJJIIJ(c950000apS.LIZJ, "invite");
            C766270U4b.LIZLLL(2131841138);
            return;
        }
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            iMultiHostCrossAdapter.LJLJLJ(c950000apS, interfaceC950010apT, abstractC915270ZvR);
        }
        C944300agG.LIZ("reentrant_invite");
    }

    @Override // X.InterfaceC950030apV
    public final void LLIFFJFJJ(Context context, Room room, DataChannel dataChannel) {
        boolean zBooleanValue;
        String value;
        boolean z;
        List<String> list;
        InterfaceC925040aBC interfaceC925040aBCBuilder;
        IMultiHostCrossAdapter iMultiHostCrossAdapter;
        Boolean bool;
        Boolean bool2;
        if (room != null && context != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("attach_base");
            sbLIZ.append(", roomId = ");
            sbLIZ.append(Long.valueOf(room.getId()));
            C20441214yg.LJIIIZ("MultiHostService", C2188811AlT.LIZIZ(sbLIZ));
            this.LL = true;
            this.LLILLL = dataChannel;
            this.LLILZ = room;
            boolean zBooleanValue2 = false;
            if (dataChannel != null && (bool2 = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class)) != null) {
                zBooleanValue = bool2.booleanValue();
            } else {
                zBooleanValue = false;
            }
            this.LLILZIL = zBooleanValue;
            if (LiveCohostBgColorAnchorEnableSetting.INSTANCE.isEnable()) {
                value = LiveCohostBgColorAnchorSetting.INSTANCE.getValue();
            } else {
                value = null;
            }
            this.LLILZLL = (ILinkMicService) C1161920gLG.LIZJ(ILinkMicService.class);
            if (LinkMicFixLiveConfigSetting.getValue()) {
                z = this.LLILZIL;
            } else {
                z = true;
            }
            MixInfo.Builder builder = new MixInfo.Builder();
            builder.setStreamUrl(room.getStreamUrl().LIZLLL());
            MixInfo mixInfoBuild = builder.build();
            InterfaceC965060bDk interfaceC965060bDk = new InterfaceC965060bDk() { // from class: X.0ahi
                @Override // X.InterfaceC965060bDk
                public final InterfaceC754220TiG create() {
                    Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("LIVE_VIDEO_CLIENT_FACTORY");
                    if (objLJIIIZ instanceof InterfaceC754220TiG) {
                        return (InterfaceC754220TiG) objLJIIIZ;
                    }
                    return null;
                }
            };
            C776380Ucu c776380Ucu = new C776380Ucu(C776360Ucs.LIZ);
            StreamUrl streamUrl = room.getStreamUrl();
            if (streamUrl != null) {
                list = streamUrl.pushUrlList;
            } else {
                list = null;
            }
            C01GW<C949390aoT> c01gw = C949390aoT.LIZJ;
            this.LLIZLLLIL = new C949400aoU(z, mixInfoBuild, interfaceC965060bDk, false, false, value, c776380Ucu, true, new AwS202S0000000_15(2), AFwS203S0000000_15.get$arr$(350), list, C923970a9T.LIZ(), 1048);
            ILinkMicService iLinkMicService = this.LLILZLL;
            if (iLinkMicService != null) {
                interfaceC925040aBCBuilder = iLinkMicService.builder();
                if (interfaceC925040aBCBuilder != null) {
                    if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class)) != null) {
                        zBooleanValue2 = bool.booleanValue();
                    }
                    interfaceC925040aBCBuilder.LIZLLL(room);
                    interfaceC925040aBCBuilder.LJ(zBooleanValue2);
                    interfaceC925040aBCBuilder.LIZIZ(dataChannel);
                    interfaceC925040aBCBuilder.LIZJ(C915980Zwa.LJIIIIZZ().Ci(null));
                    this.LLIZ = interfaceC925040aBCBuilder.LIZ(context);
                    this.LLJ = (IMultiHostCrossAdapter) C1161920gLG.LIZJ(IMultiHostCrossAdapter.class);
                    if (LLJJIJI() && (iMultiHostCrossAdapter = this.LLJ) != null) {
                        iMultiHostCrossAdapter.mX1(room, dataChannel, context, this.LLIZLLLIL, this.LLIZ);
                    }
                    LJJIJIIJI("attach_base", true);
                    return;
                }
            } else {
                interfaceC925040aBCBuilder = null;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("attach_base");
            sbLIZ2.append(", roomId = ");
            sbLIZ2.append(Long.valueOf(room.getId()));
            sbLIZ2.append(", builder=");
            sbLIZ2.append(interfaceC925040aBCBuilder);
            sbLIZ2.append(", return");
            C20441214yg.LJIIIZ("MultiHostService", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("attach_base");
        sbLIZ3.append(", roomId=");
        sbLIZ3.append(room);
        sbLIZ3.append(", context=");
        sbLIZ3.append(context);
        sbLIZ3.append(", return");
        C20441214yg.LJIIIZ("MultiHostService", C2188811AlT.LIZIZ(sbLIZ3));
    }

    @Override // X.InterfaceC950060apY
    public final void LLII(C920410a3j c920410a3j, C950440aqA c950440aqA, Map map) {
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            iMultiHostCrossAdapter.LLII(c920410a3j, c950440aqA, map);
        }
    }

    @Override // X.InterfaceC950040apW
    public final void LLILZIL(C945210ahj c945210ahj, InterfaceC950010apT<C920610a43> interfaceC950010apT, AbstractC915270ZvR abstractC915270ZvR) {
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            iMultiHostCrossAdapter.LLILZIL(c945210ahj, interfaceC950010apT, abstractC915270ZvR);
        }
    }

    @Override // X.InterfaceC950040apW
    public final void LLJJLIIIJLLLLLLLZ(C920580a40 c920580a40, InterfaceC950010apT<C920600a42> interfaceC950010apT, AbstractC915270ZvR abstractC915270ZvR) {
        IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
        if (iMultiHostCrossAdapter != null) {
            iMultiHostCrossAdapter.LLJJLIIIJLLLLLLLZ(c920580a40, interfaceC950010apT, abstractC915270ZvR);
        }
    }

    @Override // X.InterfaceC950030apV
    public final void LLJJI(ViewGroup viewGroup, FrameLayout frameLayout, LifecycleOwner lifecycleOwner, boolean z, C952540atY c952540atY) {
        boolean zLJI = MethodIDManager.LJI(202462);
        if (z) {
            if (C950220apo.LJIIL(this.LLILZ) > 0) {
                IMultiHostCrossAdapter iMultiHostCrossAdapter = this.LLJ;
                if (iMultiHostCrossAdapter != null) {
                    iMultiHostCrossAdapter.LLJJI(viewGroup, frameLayout, lifecycleOwner, z, c952540atY);
                }
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("startCoHostUI");
                sbLIZ.append(", isEnterRoom=");
                sbLIZ.append(z);
                sbLIZ.append(", groupChannelId is zero, skipping startCoHostUI for audience");
                C20441214yg.LJIIIZ("MultiHostService", C2188811AlT.LIZIZ(sbLIZ));
            }
        } else {
            IMultiHostCrossAdapter iMultiHostCrossAdapter2 = this.LLJ;
            if (iMultiHostCrossAdapter2 != null) {
                iMultiHostCrossAdapter2.LLJJI(viewGroup, frameLayout, lifecycleOwner, false, c952540atY);
            }
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
