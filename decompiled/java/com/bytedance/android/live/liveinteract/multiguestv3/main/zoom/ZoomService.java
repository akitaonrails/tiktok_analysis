package com.bytedance.android.live.liveinteract.multiguestv3.main.zoom;

import X.AbstractC19486711Lt;
import X.AbstractC919970a31;
import X.C01FX;
import X.C01HE;
import X.C1954807lC;
import X.C334801Rq;
import X.C918060Zzw;
import X.C919350a21;
import X.C919710a2b;
import X.C919770a2h;
import X.C919990a33;
import X.C920010a35;
import X.C920020a36;
import X.C920040a38;
import X.C920060a3A;
import X.C930540aK4;
import X.EnumC919910a2v;
import X.EnumC920250a3T;
import X.InterfaceC920110a3F;
import X.InterfaceC927510aFB;
import X.InterfaceC948500an2;
import Y.AfS41S1200000_15;
import Y.AfS48S1100000_15;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiLiveApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.common.ISharedBgAbility;
import com.bytedance.android.live.liveinteract.multilive.model.EnlargeScreenManageParams;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.comp.api.linkcore.api.ILinkMicService;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.model.message.EnlargePositionStatusSynContent;
import com.bytedance.android.livesdk.model.message.LinkerEnlargeStatusSynContent;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: loaded from: classes16.dex */
@InterfaceC948500an2(name = "ZOOM_SERVICE")
public final class ZoomService implements InterfaceC927510aFB {
    public final C919990a33 LIZ;
    public final C920010a35 LIZIZ;
    public final C920020a36 LIZJ;

    public ZoomService() {
        this(null);
    }

    @Override // X.InterfaceC927510aFB
    public final void LIZ(PosIdentity posIdentity, boolean z, boolean z2, InterfaceC920110a3F interfaceC920110a3F) {
    }

    @Override // X.InterfaceC927510aFB
    public final void LJIIJ(List<String> list) {
    }

    @Override // X.InterfaceC927510aFB
    public final void LJIJI(String str, boolean z) {
        throw null;
    }

    @Override // X.InterfaceC927510aFB
    public final List<PosIdentity> LIZIZ() {
        return LJJI().LIZIZ();
    }

    @Override // X.InterfaceC927510aFB
    public final boolean LJFF() {
        return LJJI().LJFF();
    }

    @Override // X.InterfaceC927510aFB
    public final boolean LJIIIIZZ() {
        return LJJI().LJIIIIZZ();
    }

    @Override // X.InterfaceC927510aFB
    public final void LJIIIZ() {
        LJJI().LJIIIZ();
    }

    @Override // X.InterfaceC927510aFB
    public final void LJIIL() {
        LJJI().LJIIL();
    }

    @Override // X.InterfaceC927510aFB
    public final String LJIILIIL() {
        return LJJI().LJIILIIL();
    }

    @Override // X.InterfaceC927510aFB
    public final Integer LJIILJJIL() {
        return LJJI().LIZ.LJFF;
    }

    @Override // X.InterfaceC927510aFB
    public final String LJIILL() {
        return LJJI().LJIILL();
    }

    @Override // X.InterfaceC927510aFB
    public final Layout LJIIZILJ() {
        return LJJI().LIZ.LIZLLL;
    }

    @Override // X.InterfaceC927510aFB
    public final EnumC920250a3T LJIJJLI() {
        return LJJI().LJIJJLI();
    }

    @Override // X.InterfaceC927510aFB
    public final boolean LJJ() {
        return LJJI().LJJ();
    }

    public final AbstractC919970a31 LJJI() {
        int i = C01FX.LIZ[C01HE.LJ().ordinal()];
        if (i == 1) {
            return this.LIZ;
        }
        if (i == 2) {
            return this.LIZIZ;
        }
        if (i == 3) {
            return this.LIZJ;
        }
        throw new C1954807lC();
    }

    @Override // X.InterfaceC927510aFB
    public final void destroy() {
        LJJI().destroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.0a20] */
    public ZoomService(final DataChannel dataChannel) {
        C919990a33 c919990a33;
        C920010a35 c920010a35;
        C920020a36 c920020a36;
        C918060Zzw c918060Zzw = C918060Zzw.LIZ;
        boolean zLIZJ = C930540aK4.LIZJ();
        c918060Zzw.getClass();
        if (C918060Zzw.LIZ(zLIZJ)) {
            c919990a33 = new C920060a3A(new C919350a21(dataChannel) { // from class: X.0a20
                @Override // X.C919350a21, X.AbstractC919790a2j
                public final void LJJIFFI(LinkerEnlargeStatusSynContent linkerEnlargeStatusSynContent) {
                }

                @Override // X.C919350a21, X.AbstractC919790a2j
                public final void LJJII(int i, InterfaceC937900aVw interfaceC937900aVw) {
                }

                @Override // X.AbstractC919790a2j
                public final boolean LJIIIZ() {
                    return !LJIIIIZZ().isEmpty();
                }

                @Override // X.AbstractC919790a2j
                public final String LJJIJIL() {
                    PosIdentity next;
                    Iterator<PosIdentity> it2 = LJIIIIZZ().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        if (next.type == 1) {
                            break;
                        }
                    }
                    PosIdentity posIdentity = next;
                    if (posIdentity != null) {
                        return posIdentity.value;
                    }
                    return null;
                }

                @Override // X.AbstractC919790a2j
                public final Integer LJJIJL() {
                    PosIdentity next;
                    String str;
                    InterfaceC954180awC interfaceC954180awCLLJLL;
                    OnLineMicInfo onLineMicInfoLLII;
                    MicPositionInfo micPositionInfo;
                    Iterator<PosIdentity> it2 = LJIIIIZZ().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        if (next.type == 2) {
                            break;
                        }
                    }
                    PosIdentity posIdentity = next;
                    if (posIdentity == null || (str = posIdentity.value) == null || (interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL()) == null || (onLineMicInfoLLII = interfaceC954180awCLLJLL.LLII(str)) == null || (micPositionInfo = onLineMicInfoLLII.micPositionData) == null) {
                        return null;
                    }
                    return Integer.valueOf(micPositionInfo.position);
                }

                @Override // X.AbstractC919790a2j
                public final void LJJ(List<PosIdentity> list) {
                    if (!Intrinsics.LJFF(list, LJIIIIZZ())) {
                        boolean z = true;
                        if (list.size() == 2 && LJIIIIZZ().size() <= 1) {
                            C915850ZwN.LJI(list, true);
                        } else {
                            boolean z2 = false;
                            if (list.size() == 2 && LJIIIIZZ().size() == 2) {
                                Iterator<PosIdentity> it2 = LJIIIIZZ().iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    PosIdentity next = it2.next();
                                    C930480aJy c930480aJy = C930480aJy.LIZ;
                                    String str = next.value;
                                    c930480aJy.getClass();
                                    if (C930480aJy.LJIJJLI(str)) {
                                        if (next == null) {
                                            break;
                                        }
                                    }
                                }
                                z = false;
                                C915850ZwN.LIZLLL(LJIIIIZZ(), z, false);
                                C915850ZwN.LJI(list, false);
                            } else if (list.size() <= 1 && LJIIIIZZ().size() == 2) {
                                Iterator<PosIdentity> it3 = LJIIIIZZ().iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    PosIdentity next2 = it3.next();
                                    C930480aJy c930480aJy2 = C930480aJy.LIZ;
                                    String str2 = next2.value;
                                    c930480aJy2.getClass();
                                    if (C930480aJy.LJIJJLI(str2)) {
                                        if (next2 != null) {
                                            z2 = true;
                                        }
                                    }
                                }
                                C915850ZwN.LIZLLL(LJIIIIZZ(), z2, true);
                            }
                        }
                    }
                    super.LJJ(list);
                }

                @Override // X.C919350a21, X.AbstractC919790a2j
                public final void LJJI(EnlargePositionStatusSynContent enlargePositionStatusSynContent) {
                    if (C01HE.LJ() != C01FV.ANCHOR) {
                        return;
                    }
                    C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
                    AbstractC919790a2j.LJIIJJI.getClass();
                    c1143300frELJIIJJI.LJII(AbstractC919790a2j.LJIJI, C2097608Jq.LJIIJ(new Pair("action", "zoomFromLinkScreenChangeMessage"), new Pair("enlargePositionStatusSynContent", enlargePositionStatusSynContent.toString())));
                    if (enlargePositionStatusSynContent.enlargedPositions.size() <= 1) {
                        if (enlargePositionStatusSynContent.scene == 7) {
                            C917290Zyh.LIZ.LJIIJ(true);
                        } else {
                            C917290Zyh.LIZ.LJIIJ(false);
                        }
                    }
                    C1303170k15 c1303170k15Y22 = ((ILinkMicService) C1161920gLG.LIZJ(ILinkMicService.class)).y22();
                    if (c1303170k15Y22 != null) {
                        c1303170k15Y22.LJJL(0, enlargePositionStatusSynContent.layoutId, new InterfaceC1303160k14() { // from class: X.0Zwc
                            @Override // X.InterfaceC1303160k14
                            public final void LIZ(Layout layout) {
                                Pair<Integer, Integer> pairLJIIIIZZ;
                                MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ;
                                long id;
                                String str;
                                InterfaceC665370Q7z interfaceC665370Q7z;
                                MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModelGL0;
                                C935540aS8 state;
                                Map<Integer, String> map;
                                Map<Integer, String> map2;
                                if (layout == null || (pairLJIIIIZZ = C930540aK4.LJIIIIZZ(layout)) == null) {
                                    return;
                                }
                                MultiGuestDataHolder multiGuestDataHolderLIZJ = C916490ZxP.LIZJ();
                                if (multiGuestDataHolderLIZJ != null) {
                                    multiLiveAnchorPanelSettingsLIZIZ = multiGuestDataHolderLIZJ.LIZIZ();
                                } else {
                                    multiLiveAnchorPanelSettingsLIZIZ = null;
                                }
                                if (!Intrinsics.LJFF(layout.layoutId, C916490ZxP.LIZ(multiLiveAnchorPanelSettingsLIZIZ)) && multiLiveAnchorPanelSettingsLIZIZ != null) {
                                    C919340a20 c919340a20 = this.LIZ;
                                    multiLiveAnchorPanelSettingsLIZIZ.layoutType = pairLJIIIIZZ.getFirst().intValue();
                                    multiLiveAnchorPanelSettingsLIZIZ.fixMicNumAction = pairLJIIIIZZ.getSecond().intValue();
                                    MultiGuestDataHolder multiGuestDataHolderLIZJ2 = C916490ZxP.LIZJ();
                                    if (multiGuestDataHolderLIZJ2 != null) {
                                        multiGuestDataHolderLIZJ2.LJJ(multiLiveAnchorPanelSettingsLIZIZ);
                                    }
                                    if (pairLJIIIIZZ.getSecond().intValue() == 0) {
                                        if (pairLJIIIIZZ.getFirst().intValue() == 1) {
                                            MultiGuestDataHolder multiGuestDataHolderLIZJ3 = C916490ZxP.LIZJ();
                                            if (multiGuestDataHolderLIZJ3 != null && (map2 = multiGuestDataHolderLIZJ3.LJIJJLI) != null) {
                                                ((ConcurrentHashMap) map2).put(1, layout.layoutId);
                                            }
                                        } else {
                                            MultiGuestDataHolder multiGuestDataHolderLIZJ4 = C916490ZxP.LIZJ();
                                            if (multiGuestDataHolderLIZJ4 != null && (map = multiGuestDataHolderLIZJ4.LJIJJLI) != null) {
                                                ((ConcurrentHashMap) map).put(2, layout.layoutId);
                                            }
                                        }
                                    }
                                    C480460Ism.LIZ().getClass();
                                    MultiLiveApi multiLiveApi = (MultiLiveApi) C480460Ism.LIZLLL(MultiLiveApi.class);
                                    c919340a20.getClass();
                                    Room roomLJIJI = AbstractC919790a2j.LJIJI();
                                    if (roomLJIJI != null) {
                                        id = roomLJIJI.getId();
                                    } else {
                                        id = 0;
                                    }
                                    long jLJIILL = C921180a4y.LJIILL(C915980Zwa.LJIIIIZZ());
                                    long jLiveId = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).liveId();
                                    int i = multiLiveAnchorPanelSettingsLIZIZ.layoutType;
                                    int i2 = multiLiveAnchorPanelSettingsLIZIZ.fixMicNumAction;
                                    int i3 = multiLiveAnchorPanelSettingsLIZIZ.allowViewerReq;
                                    int i4 = multiLiveAnchorPanelSettingsLIZIZ.onlyAllowFollowerReq;
                                    String str2 = layout.layoutId;
                                    DataChannel dataChannel2 = c919340a20.LIZ;
                                    if (dataChannel2 != null && (interfaceC665370Q7z = (InterfaceC665370Q7z) dataChannel2.gg0(C956790b0P.class)) != null) {
                                        str = null;
                                        ISharedBgAbility iSharedBgAbility = (ISharedBgAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z, ISharedBgAbility.class, null);
                                        if (iSharedBgAbility != null && (multiGuestSharedBgAnchorViewModelGL0 = iSharedBgAbility.GL0()) != null && (state = multiGuestSharedBgAnchorViewModelGL0.getState()) != null) {
                                            str = state.LLILZ;
                                        }
                                    } else {
                                        str = null;
                                    }
                                    multiLiveApi.updateAnchorPanelSettings(id, jLJIILL, jLiveId, i, i2, i3, i4, str2, str, 0, multiLiveAnchorPanelSettingsLIZIZ.applierSortSetting, multiLiveAnchorPanelSettingsLIZIZ.applierSortGiftScoreThreshold, multiLiveAnchorPanelSettingsLIZIZ.LIZ, multiLiveAnchorPanelSettingsLIZIZ.allowRequestFromFriends, multiLiveAnchorPanelSettingsLIZIZ.allowRequestFromFollowers, multiLiveAnchorPanelSettingsLIZIZ.allowRequestFromOthers, 0, multiLiveAnchorPanelSettingsLIZIZ.enableShowMultiGuestLayout, C924810aAp.LJ().LJJIIJ).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.0Zwd
                                        @Override // X.C09JN
                                        public final void accept(Object obj) {
                                            C1C7U.LIZ("ZoomAnchorModelV2@4cfc.zoomFromLinkScreenChangeMessage$1$onQueried$1$2");
                                            C20441214yg.LJIIIZ("ZoomAnchorModel", "updateAnchorPanelSetting success");
                                            C1C7U.LIZIZ("ZoomAnchorModelV2@4cfc.zoomFromLinkScreenChangeMessage$1$onQueried$1$2");
                                        }
                                    }, new C09JN() { // from class: X.0Zwe
                                        @Override // X.C09JN
                                        public final void accept(Object obj) {
                                            C1C7U.LIZ("ZoomAnchorModelV2@4cfc.zoomFromLinkScreenChangeMessage$1$onQueried$1$3");
                                            C20441214yg.LJIIIZ("ZoomAnchorModel", "updateAnchorPanelSetting failed");
                                            C1C7U.LIZIZ("ZoomAnchorModelV2@4cfc.zoomFromLinkScreenChangeMessage$1$onQueried$1$3");
                                        }
                                    });
                                }
                            }
                        }, null);
                    }
                    LJJ(enlargePositionStatusSynContent.enlargedPositions);
                }
            });
        } else {
            c919990a33 = new C919990a33(new C919350a21(dataChannel));
        }
        this.LIZ = c919990a33;
        if (C918060Zzw.LIZ(C930540aK4.LIZJ())) {
            final C920040a38 c920040a38 = new C920040a38(dataChannel);
            c920010a35 = new C920010a35(c920040a38) { // from class: X.0a37
                @Override // X.AbstractC919970a31, X.InterfaceC927510aFB
                public final void LJIJI(String str, boolean z) {
                }

                @Override // X.C920010a35, X.AbstractC919970a31, X.InterfaceC927510aFB
                public final EnumC920250a3T LJIL(String str) {
                    C923330a8R c923330a8R = C923330a8R.LIZ;
                    if (C923330a8R.LJIIIZ()) {
                        return super.LJIL(str);
                    }
                    if (LJJI(str)) {
                        return EnumC920250a3T.CAN_ZOOM_TO_MIN;
                    }
                    return EnumC920250a3T.ZOOM_DISABLED;
                }

                @Override // X.C920010a35
                public final boolean LJJI(String str) {
                    if (Intrinsics.LJFF(str, LJIILL())) {
                        for (PosIdentity posIdentity : this.LIZ.LJIIIIZZ()) {
                            if (posIdentity.LIZJ(str)) {
                                if (posIdentity != null) {
                                    return true;
                                }
                                return false;
                            }
                        }
                        return false;
                    }
                    return false;
                }

                @Override // X.C920010a35
                public final void LJJIFFI(String str, InterfaceC920110a3F interfaceC920110a3F, boolean z, boolean z2, EnumC919910a2v enumC919910a2v) {
                    PosIdentity next;
                    EnlargeScreenManageParams enlargeScreenManageParams = new EnlargeScreenManageParams();
                    C914970Zux.LIZ(enlargeScreenManageParams);
                    enlargeScreenManageParams.operateUserId = -1L;
                    enlargeScreenManageParams.scene = 8;
                    Iterator<PosIdentity> it2 = this.LIZ.LJIIIIZZ().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (next.LIZJ(str)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    enlargeScreenManageParams.operatedPosition = next;
                    enlargeScreenManageParams.isRejectEnlargeScreen = z ? 1 : 0;
                    enlargeScreenManageParams.linkmicId = str;
                    C480460Ism.LIZ().getClass();
                    new C11NJ().LIZ(((MultiLiveApi) C480460Ism.LIZLLL(MultiLiveApi.class)).zoom(enlargeScreenManageParams).LJIILIIL(new C0UO0()).LJJLL(new AfS41S1200000_15(interfaceC920110a3F, this, str, 12), new AfS48S1100000_15(interfaceC920110a3F, str, 8)));
                }
            };
        } else {
            c920010a35 = new C920010a35(new C919710a2b(dataChannel));
        }
        this.LIZIZ = c920010a35;
        if (C918060Zzw.LIZ(C930540aK4.LIZJ())) {
            final C919770a2h c919770a2h = new C919770a2h(dataChannel) { // from class: X.0Zwp
                @Override // X.C919770a2h, X.AbstractC919790a2j
                public final void LJJII(int i, InterfaceC937900aVw interfaceC937900aVw) {
                }

                @Override // X.AbstractC919790a2j
                public final String LJJIJIL() {
                    PosIdentity next;
                    Iterator<PosIdentity> it2 = LJIIIIZZ().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        if (next.type == 1) {
                            break;
                        }
                    }
                    PosIdentity posIdentity = next;
                    if (posIdentity != null) {
                        return posIdentity.value;
                    }
                    return null;
                }

                @Override // X.AbstractC919790a2j
                public final Integer LJJIJL() {
                    PosIdentity next;
                    String str;
                    InterfaceC954180awC interfaceC954180awCLLJLL;
                    OnLineMicInfo onLineMicInfoLLII;
                    MicPositionInfo micPositionInfo;
                    Iterator<PosIdentity> it2 = LJIIIIZZ().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        if (next.type == 2) {
                            break;
                        }
                    }
                    PosIdentity posIdentity = next;
                    if (posIdentity == null || (str = posIdentity.value) == null || (interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL()) == null || (onLineMicInfoLLII = interfaceC954180awCLLJLL.LLII(str)) == null || (micPositionInfo = onLineMicInfoLLII.micPositionData) == null) {
                        return null;
                    }
                    return Integer.valueOf(micPositionInfo.position);
                }
            };
            c920020a36 = new AbstractC919970a31(c919770a2h) { // from class: X.0a36
                public final C919940a2y LIZJ;
                public final C920000a34 LIZLLL;

                @Override // X.InterfaceC927510aFB
                public final List<PosIdentity> LIZIZ() {
                    return this.LIZ.LJIIIIZZ();
                }

                @Override // X.AbstractC919970a31, X.InterfaceC927510aFB
                public final void destroy() {
                    super.destroy();
                    this.LIZJ.LIZ();
                }

                {
                    C920000a34 c920000a34;
                    super(c919770a2h);
                    this.LIZJ = new C919940a2y(this, c919770a2h);
                    C918060Zzw c918060Zzw2 = C918060Zzw.LIZ;
                    boolean zLIZJ2 = C930540aK4.LIZJ();
                    c918060Zzw2.getClass();
                    if (C918060Zzw.LIZ(zLIZJ2)) {
                        c920000a34 = new C920070a3B(c919770a2h);
                    } else {
                        c920000a34 = new C920000a34(c919770a2h);
                    }
                    this.LIZLLL = c920000a34;
                }

                @Override // X.AbstractC919970a31, X.InterfaceC927510aFB
                public final void LJII(SeiAppData seiAppData) {
                    C919770a2h c919770a2h2 = (C919770a2h) this.LIZ;
                    int i = C919770a2h.LJJ;
                    c919770a2h2.LJJIL(seiAppData, C920280a3W.LIZ());
                }

                @Override // X.AbstractC919970a31, X.InterfaceC927510aFB
                public final EnumC920250a3T LJIL(String str) {
                    C923330a8R c923330a8R = C923330a8R.LIZ;
                    if (C923330a8R.LJIIIZ()) {
                        C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("moderatorGetZoomStatus: linkMicId=");
                        sbLIZ.append(str);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        c1143300frELJIIJJI.getClass();
                        AbstractC1143290frD.LJI("ZoomAudiencePresent", strLIZIZ);
                        return this.LIZLLL.LJIL(str);
                    }
                    C1143300frE c1143300frELJIIJJI2 = C1143300frE.LJIIJJI();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("audienceGetZoomStatus: linkMicId=");
                    sbLIZ2.append(str);
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    c1143300frELJIIJJI2.getClass();
                    AbstractC1143290frD.LJI("ZoomAudiencePresent", strLIZIZ2);
                    return super.LJIL(str);
                }

                @Override // X.AbstractC919970a31, X.InterfaceC927510aFB
                public final void LJIIJJI(InterfaceC920110a3F interfaceC920110a3F, String str) {
                    C923330a8R c923330a8R = C923330a8R.LIZ;
                    if (C923330a8R.LJII()) {
                        this.LIZLLL.LJIIJJI(interfaceC920110a3F, str);
                    }
                }

                @Override // X.InterfaceC927510aFB
                public final AbstractC19486711Lt LJIILLIIL(int i, boolean z) {
                    return C11QJ.LL;
                }

                @Override // X.InterfaceC927510aFB
                public final void LJ(int i, Function1 function1, boolean z, boolean z2) {
                    function1.invoke(C11QJ.LL);
                }

                @Override // X.InterfaceC927510aFB
                public final void LJI(String str, InterfaceC920110a3F interfaceC920110a3F, boolean z, boolean z2, boolean z3, boolean z4, EnumC919910a2v enumC919910a2v, C334801Rq c334801Rq) {
                    C923330a8R c923330a8R = C923330a8R.LIZ;
                    if (C923330a8R.LJIIIZ()) {
                        C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("moderatorZoom: linkMicId=");
                        sbLIZ.append(str);
                        sbLIZ.append(", noMoreZoom=");
                        sbLIZ.append(z2);
                        sbLIZ.append(", zoomFromAnchor=");
                        sbLIZ.append(z3);
                        sbLIZ.append(", zoomSource=");
                        sbLIZ.append(enumC919910a2v.name());
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        c1143300frELJIIJJI.getClass();
                        AbstractC1143290frD.LJI("ZoomAudiencePresent", strLIZIZ);
                        this.LIZLLL.LJI(str, interfaceC920110a3F, z, z2, z3, z4, enumC919910a2v, null);
                        return;
                    }
                    C1143300frE c1143300frELJIIJJI2 = C1143300frE.LJIIJJI();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("audienceZoom: linkMicId=");
                    sbLIZ2.append(str);
                    sbLIZ2.append(", noMoreZoom=");
                    sbLIZ2.append(z2);
                    sbLIZ2.append(", zoomFromAnchor=");
                    sbLIZ2.append(z3);
                    sbLIZ2.append(", zoomSource=");
                    sbLIZ2.append(enumC919910a2v.name());
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    c1143300frELJIIJJI2.getClass();
                    AbstractC1143290frD.LJI("ZoomAudiencePresent", strLIZIZ2);
                    Map<String, Object> map = C1338270kvh.LIZ;
                }
            };
        } else {
            final C919770a2h c919770a2h2 = new C919770a2h(dataChannel);
            c920020a36 = new AbstractC919970a31(c919770a2h2) { // from class: X.0a36
                public final C919940a2y LIZJ;
                public final C920000a34 LIZLLL;

                @Override // X.InterfaceC927510aFB
                public final List<PosIdentity> LIZIZ() {
                    return this.LIZ.LJIIIIZZ();
                }

                @Override // X.AbstractC919970a31, X.InterfaceC927510aFB
                public final void destroy() {
                    super.destroy();
                    this.LIZJ.LIZ();
                }

                {
                    C920000a34 c920000a34;
                    super(c919770a2h2);
                    this.LIZJ = new C919940a2y(this, c919770a2h2);
                    C918060Zzw c918060Zzw2 = C918060Zzw.LIZ;
                    boolean zLIZJ2 = C930540aK4.LIZJ();
                    c918060Zzw2.getClass();
                    if (C918060Zzw.LIZ(zLIZJ2)) {
                        c920000a34 = new C920070a3B(c919770a2h2);
                    } else {
                        c920000a34 = new C920000a34(c919770a2h2);
                    }
                    this.LIZLLL = c920000a34;
                }

                @Override // X.AbstractC919970a31, X.InterfaceC927510aFB
                public final void LJII(SeiAppData seiAppData) {
                    C919770a2h c919770a2h22 = (C919770a2h) this.LIZ;
                    int i = C919770a2h.LJJ;
                    c919770a2h22.LJJIL(seiAppData, C920280a3W.LIZ());
                }

                @Override // X.AbstractC919970a31, X.InterfaceC927510aFB
                public final EnumC920250a3T LJIL(String str) {
                    C923330a8R c923330a8R = C923330a8R.LIZ;
                    if (C923330a8R.LJIIIZ()) {
                        C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("moderatorGetZoomStatus: linkMicId=");
                        sbLIZ.append(str);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        c1143300frELJIIJJI.getClass();
                        AbstractC1143290frD.LJI("ZoomAudiencePresent", strLIZIZ);
                        return this.LIZLLL.LJIL(str);
                    }
                    C1143300frE c1143300frELJIIJJI2 = C1143300frE.LJIIJJI();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("audienceGetZoomStatus: linkMicId=");
                    sbLIZ2.append(str);
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    c1143300frELJIIJJI2.getClass();
                    AbstractC1143290frD.LJI("ZoomAudiencePresent", strLIZIZ2);
                    return super.LJIL(str);
                }

                @Override // X.AbstractC919970a31, X.InterfaceC927510aFB
                public final void LJIIJJI(InterfaceC920110a3F interfaceC920110a3F, String str) {
                    C923330a8R c923330a8R = C923330a8R.LIZ;
                    if (C923330a8R.LJII()) {
                        this.LIZLLL.LJIIJJI(interfaceC920110a3F, str);
                    }
                }

                @Override // X.InterfaceC927510aFB
                public final AbstractC19486711Lt LJIILLIIL(int i, boolean z) {
                    return C11QJ.LL;
                }

                @Override // X.InterfaceC927510aFB
                public final void LJ(int i, Function1 function1, boolean z, boolean z2) {
                    function1.invoke(C11QJ.LL);
                }

                @Override // X.InterfaceC927510aFB
                public final void LJI(String str, InterfaceC920110a3F interfaceC920110a3F, boolean z, boolean z2, boolean z3, boolean z4, EnumC919910a2v enumC919910a2v, C334801Rq c334801Rq) {
                    C923330a8R c923330a8R = C923330a8R.LIZ;
                    if (C923330a8R.LJIIIZ()) {
                        C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("moderatorZoom: linkMicId=");
                        sbLIZ.append(str);
                        sbLIZ.append(", noMoreZoom=");
                        sbLIZ.append(z2);
                        sbLIZ.append(", zoomFromAnchor=");
                        sbLIZ.append(z3);
                        sbLIZ.append(", zoomSource=");
                        sbLIZ.append(enumC919910a2v.name());
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        c1143300frELJIIJJI.getClass();
                        AbstractC1143290frD.LJI("ZoomAudiencePresent", strLIZIZ);
                        this.LIZLLL.LJI(str, interfaceC920110a3F, z, z2, z3, z4, enumC919910a2v, null);
                        return;
                    }
                    C1143300frE c1143300frELJIIJJI2 = C1143300frE.LJIIJJI();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("audienceZoom: linkMicId=");
                    sbLIZ2.append(str);
                    sbLIZ2.append(", noMoreZoom=");
                    sbLIZ2.append(z2);
                    sbLIZ2.append(", zoomFromAnchor=");
                    sbLIZ2.append(z3);
                    sbLIZ2.append(", zoomSource=");
                    sbLIZ2.append(enumC919910a2v.name());
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    c1143300frELJIIJJI2.getClass();
                    AbstractC1143290frD.LJI("ZoomAudiencePresent", strLIZIZ2);
                    Map<String, Object> map = C1338270kvh.LIZ;
                }
            };
        }
        this.LIZJ = c920020a36;
    }

    @Override // X.InterfaceC927510aFB
    public final boolean LIZJ(String str) {
        return LJJI().LIZJ(str);
    }

    @Override // X.InterfaceC927510aFB
    public final void LJII(SeiAppData seiAppData) {
        LJJI().LJII(seiAppData);
    }

    @Override // X.InterfaceC927510aFB
    public final boolean LJIJ(String str) {
        return LJJI().LJIJ(str);
    }

    @Override // X.InterfaceC927510aFB
    public final boolean LJIJJ(String str) {
        return LJJI().LJIJJ(str);
    }

    @Override // X.InterfaceC927510aFB
    public final EnumC920250a3T LJIL(String str) {
        return LJJI().LJIL(str);
    }

    @Override // X.InterfaceC927510aFB
    public final void LIZLLL(String str, boolean z) {
        LJJI().LIZLLL(str, z);
    }

    @Override // X.InterfaceC927510aFB
    public final void LJIIJJI(InterfaceC920110a3F interfaceC920110a3F, String str) {
        LJJI().LJIIJJI(interfaceC920110a3F, str);
    }

    @Override // X.InterfaceC927510aFB
    public final AbstractC19486711Lt LJIILLIIL(int i, boolean z) {
        return LJJI().LJIILLIIL(i, z);
    }

    @Override // X.InterfaceC927510aFB
    public final void LJ(int i, Function1 function1, boolean z, boolean z2) {
        LJJI().LJ(i, function1, z, z2);
    }

    @Override // X.InterfaceC927510aFB
    public final void LJI(String str, InterfaceC920110a3F interfaceC920110a3F, boolean z, boolean z2, boolean z3, boolean z4, EnumC919910a2v enumC919910a2v, C334801Rq c334801Rq) {
        LJJI().LJI(str, interfaceC920110a3F, z, z2, z3, z4, enumC919910a2v, c334801Rq);
    }
}
