package X;

import Y.AfS151S0200000_15;
import Y.AfS41S1200000_15;
import android.content.Context;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiLiveApi;
import com.bytedance.android.live.liveinteract.multilive.model.EnlargeScreenManageParams;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.model.message.EnlargePositionStatusSynContent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Collections;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS224S0300000_15;
import kotlin.jvm.internal.AwS259S0300000_15;
import kotlin.jvm.internal.AwS55S1300000_15;
import kotlin.jvm.internal.AwS80S1300000_15;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.LinkerMediaChangeOperator;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0a3A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C920060a3A extends C919990a33 {
    public final C916180Zwu LJI;

    @Override // X.AbstractC919970a31, X.InterfaceC927510aFB
    public final void LJIJI(String str, boolean z) {
    }

    public C920060a3A(C919340a20 c919340a20) {
        super(c919340a20);
        this.LJI = new C916180Zwu(c919340a20.LIZ, new C11NJ());
    }

    public static C19489111Mr LJJIIZI(EnlargeScreenManageParams enlargeScreenManageParams) {
        C480460Ism.LIZ().getClass();
        return new C11IW(((MultiLiveApi) C480460Ism.LIZLLL(MultiLiveApi.class)).zoom(enlargeScreenManageParams).LJIILIIL(new C0UO0())).LJII(new C987100bnI(enlargeScreenManageParams, 19));
    }

    @Override // X.C919990a33, X.AbstractC919970a31, X.InterfaceC927510aFB
    public final EnumC920250a3T LJIL(String str) {
        if (LJJI(str)) {
            Iterator<PosIdentity> it2 = this.LIZ.LJIIIIZZ().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                PosIdentity next = it2.next();
                if (next.LIZJ(str)) {
                    if (next != null) {
                        return EnumC920250a3T.CAN_ZOOM_TO_MIN;
                    }
                }
            }
            return EnumC920250a3T.CAN_ZOOM_TO_MAX;
        }
        return EnumC920250a3T.ZOOM_DISABLED;
    }

    @Override // X.C919990a33
    public final boolean LJJI(String str) {
        boolean zLJFF;
        if (!this.LIZ.LJIIIIZZ().isEmpty()) {
            C930480aJy.LIZ.getClass();
            if (C930480aJy.LJIJJLI(str) || !this.LIZ.LJIIJ(str)) {
                return true;
            }
            return false;
        }
        boolean zLJIIJJI = this.LIZ.LJIIJJI(Boolean.FALSE, str);
        Layout layoutLIZLLL = this.LIZ.LIZLLL();
        if (layoutLIZLLL == null) {
            return false;
        }
        if (zLJIIJJI) {
            zLJFF = Intrinsics.LJFF(layoutLIZLLL.layoutId, layoutLIZLLL.anchorZoomLayoutId);
        } else {
            if (this.LIZ.LJIIJ(str)) {
                return false;
            }
            zLJFF = Intrinsics.LJFF(layoutLIZLLL.layoutId, layoutLIZLLL.zoomLayoutId);
        }
        return !zLJFF;
    }

    @Override // X.C919990a33
    public final void LJJIIJ(EnlargePositionStatusSynContent enlargePositionStatusSynContent) {
        Integer numValueOf;
        String str;
        String str2;
        PosIdentity next;
        AbstractC928510aGn abstractC928510aGnLIZ;
        LinkPlayerInfo linkPlayerInfo;
        AbstractC928510aGn abstractC928510aGnLIZ2;
        LinkPlayerInfo linkPlayerInfo2;
        if (C01HE.LJ() != C01FV.ANCHOR) {
            return;
        }
        LinkerMediaChangeOperator linkerMediaChangeOperator = enlargePositionStatusSynContent.operatorInfo;
        User user = null;
        if (linkerMediaChangeOperator != null && (numValueOf = Integer.valueOf(linkerMediaChangeOperator.operatorType)) != null && numValueOf.intValue() == 1) {
            LinkerMediaChangeOperator linkerMediaChangeOperator2 = enlargePositionStatusSynContent.operatorInfo;
            if (linkerMediaChangeOperator2 != null) {
                str = linkerMediaChangeOperator2.displayId;
                str2 = linkerMediaChangeOperator2.nickName;
            } else {
                str = null;
                str2 = null;
            }
            String strLIZIZ = C0KVU.LIZIZ(str, str2);
            Iterator<PosIdentity> it2 = enlargePositionStatusSynContent.enlargedPositions.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (!this.LIZ.LJIIIIZZ().contains(next)) {
                        break;
                    }
                } else {
                    Iterator<PosIdentity> it3 = this.LIZ.LJIIIIZZ().iterator();
                    while (it3.hasNext()) {
                        next = it3.next();
                        if (!enlargePositionStatusSynContent.enlargedPositions.contains(next)) {
                        }
                    }
                    return;
                }
            }
            if (next != null) {
                if (enlargePositionStatusSynContent.enlargedPositions.contains(next)) {
                    InterfaceC302401Fe interfaceC302401FeLJJIII = LJJIII();
                    if (interfaceC302401FeLJJIII != null && (abstractC928510aGnLIZ2 = interfaceC302401FeLJJIII.LIZ()) != null && (linkPlayerInfo2 = (LinkPlayerInfo) abstractC928510aGnLIZ2.LJFF(next.value)) != null) {
                        user = linkPlayerInfo2.mUser;
                    }
                    C01I3.LIZJ(2131843069, "expanded_guest", strLIZIZ, C0KVU.LIZ(user));
                    return;
                }
                if (!this.LIZ.LJIIIIZZ().contains(next)) {
                    return;
                }
                InterfaceC302401Fe interfaceC302401FeLJJIII2 = LJJIII();
                if (interfaceC302401FeLJJIII2 != null && (abstractC928510aGnLIZ = interfaceC302401FeLJJIII2.LIZ()) != null && (linkPlayerInfo = (LinkPlayerInfo) abstractC928510aGnLIZ.LJFF(next.value)) != null) {
                    user = linkPlayerInfo.mUser;
                }
                C01I3.LIZJ(2131843074, "shrank_guest", strLIZIZ, C0KVU.LIZ(user));
            }
        }
    }

    @Override // X.AbstractC919970a31, X.InterfaceC927510aFB
    public final void LIZLLL(String str, boolean z) {
        AbstractC919790a2j abstractC919790a2j = this.LIZ;
        PosIdentity posIdentity = new PosIdentity();
        posIdentity.type = 1;
        posIdentity.value = str;
        abstractC919790a2j.LJJ(Collections.singletonList(posIdentity));
    }

    @Override // X.AbstractC919970a31, X.InterfaceC927510aFB
    public final void LJIIJJI(InterfaceC920110a3F interfaceC920110a3F, String str) {
        EnlargeScreenManageParams enlargeScreenManageParams = new EnlargeScreenManageParams();
        C914970Zux.LIZ(enlargeScreenManageParams);
        enlargeScreenManageParams.scene = 9;
        enlargeScreenManageParams.layoutId = str;
        C480460Ism.LIZ().getClass();
        new C11NJ().LIZ(((MultiLiveApi) C480460Ism.LIZLLL(MultiLiveApi.class)).zoom(enlargeScreenManageParams).LJIILIIL(new C0UO0()).LJJLL(new AfS151S0200000_15(this, interfaceC920110a3F, 56), new AfS151S0200000_15(this, interfaceC920110a3F, 57)));
    }

    public final void LJJIJ(String str, EnlargeScreenManageParams enlargeScreenManageParams, InterfaceC920110a3F interfaceC920110a3F) {
        C480460Ism.LIZ().getClass();
        new C11NJ().LIZ(((MultiLiveApi) C480460Ism.LIZLLL(MultiLiveApi.class)).zoom(enlargeScreenManageParams).LJIILIIL(new C0UO0()).LJJLL(new AfS41S1200000_15(this, interfaceC920110a3F, str, 10), new AfS41S1200000_15(this, interfaceC920110a3F, str, 11)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C919990a33, X.InterfaceC927510aFB
    public final void LJ(int i, Function1 function1, boolean z, boolean z2) {
        String strLLJIJIL;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ;
        String strLIZ;
        Context context;
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null && (strLLJIJIL = interfaceC954180awCLLJLL.LLJIJIL(i)) != null) {
            EnlargeScreenManageParams enlargeScreenManageParams = new EnlargeScreenManageParams();
            C914970Zux.LIZ(enlargeScreenManageParams);
            PosIdentity posIdentity = new PosIdentity();
            posIdentity.type = 2;
            posIdentity.value = strLLJIJIL;
            enlargeScreenManageParams.operatedPosition = posIdentity;
            if (z) {
                int size = this.LIZ.LJIIIIZZ().size();
                Iterator<PosIdentity> it2 = this.LIZ.LJIIIIZZ().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    PosIdentity next = it2.next();
                    PosIdentity posIdentity2 = next;
                    if (posIdentity2.type == 2 && Intrinsics.LJFF(posIdentity2.value, strLLJIJIL)) {
                        if (next != null) {
                            C20441214yg.LJ("ZoomAnchorPresenterV2", "current spot is already zoomed");
                            return;
                        }
                    }
                }
                if (size > 1) {
                    DataChannel dataChannel = this.LIZ.LIZ;
                    if (dataChannel != null && (context = (Context) dataChannel.gg0(C956860b0W.class)) != null) {
                        DialogC933230aOP dialogC933230aOPLIZ = C920230a3R.LIZ(context, true, (PosIdentity) ListProtector.get(this.LIZ.LJIIIIZZ(), 0), (PosIdentity) ListProtector.get(this.LIZ.LJIIIIZZ(), 1), new AwS224S0300000_15(this, enlargeScreenManageParams, function1, 52));
                        dialogC933230aOPLIZ.setOnDismissListener(new DialogInterfaceOnDismissListenerC987000bn8(dialogC933230aOPLIZ, this, 3));
                        C786410Ut5.N4(dialogC933230aOPLIZ);
                        C915850ZwN.LJIIJ(strLLJIJIL, true);
                        return;
                    }
                    return;
                }
                if (size == 1 && z2) {
                    enlargeScreenManageParams.replacedPos = C1697810uHb.LJIILJJIL(ListProtector.get(this.LIZ.LJIIIIZZ(), 0));
                }
                enlargeScreenManageParams.scene = 7;
                function1.invoke(LJJIIZI(enlargeScreenManageParams));
                return;
            }
            enlargeScreenManageParams.scene = 8;
            MultiGuestDataHolder multiGuestDataHolderLIZJ = C916490ZxP.LIZJ();
            if (multiGuestDataHolderLIZJ != null && (multiLiveAnchorPanelSettingsLIZIZ = multiGuestDataHolderLIZJ.LIZIZ()) != null && (strLIZ = C916490ZxP.LIZ(multiLiveAnchorPanelSettingsLIZIZ)) != null) {
                this.LJI.LIZ(strLIZ, new AwS259S0300000_15(this, enlargeScreenManageParams, function1, 45));
            } else {
                function1.invoke(LJJIIZI(enlargeScreenManageParams));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C919990a33, X.InterfaceC927510aFB
    public final void LJI(String str, InterfaceC920110a3F interfaceC920110a3F, boolean z, boolean z2, boolean z3, boolean z4, EnumC919910a2v enumC919910a2v, C334801Rq c334801Rq) {
        Context context;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ;
        String strLIZ;
        EnlargeScreenManageParams enlargeScreenManageParams = new EnlargeScreenManageParams();
        C914970Zux.LIZ(enlargeScreenManageParams);
        PosIdentity posIdentity = new PosIdentity();
        posIdentity.type = 1;
        posIdentity.value = str;
        enlargeScreenManageParams.operatedPosition = posIdentity;
        enlargeScreenManageParams.linkmicId = str;
        enlargeScreenManageParams.guestUserId = C01HE.LJI(str);
        enlargeScreenManageParams.mgTraceInfo = C01IF.LIZ(c334801Rq);
        Iterator<PosIdentity> it2 = this.LIZ.LJIIIIZZ().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            PosIdentity next = it2.next();
            if (next.LIZJ(str)) {
                if (next != null) {
                    enlargeScreenManageParams.scene = 8;
                    MultiGuestDataHolder multiGuestDataHolderLIZJ = C916490ZxP.LIZJ();
                    if (multiGuestDataHolderLIZJ != null && (multiLiveAnchorPanelSettingsLIZIZ = multiGuestDataHolderLIZJ.LIZIZ()) != null && (strLIZ = C916490ZxP.LIZ(multiLiveAnchorPanelSettingsLIZIZ)) != null) {
                        this.LJI.LIZ(strLIZ, new AwS80S1300000_15(this, interfaceC920110a3F, enlargeScreenManageParams, str, 5));
                        return;
                    } else {
                        LJJIJ(str, enlargeScreenManageParams, interfaceC920110a3F);
                        return;
                    }
                }
            }
        }
        int size = this.LIZ.LJIIIIZZ().size();
        if (size > 1) {
            DataChannel dataChannel = this.LIZ.LIZ;
            if (dataChannel == null || (context = (Context) dataChannel.gg0(C956860b0W.class)) == null) {
                return;
            }
            DialogC933230aOP dialogC933230aOPLIZ = C920230a3R.LIZ(context, true, (PosIdentity) ListProtector.get(this.LIZ.LJIIIIZZ(), 0), (PosIdentity) ListProtector.get(this.LIZ.LJIIIIZZ(), 1), new AwS55S1300000_15(this, interfaceC920110a3F, enlargeScreenManageParams, str, 4));
            dialogC933230aOPLIZ.setOnDismissListener(new DialogInterfaceOnDismissListenerC987030bnB(dialogC933230aOPLIZ, this, str, 4));
            C786410Ut5.N4(dialogC933230aOPLIZ);
            C915850ZwN.LJIIJ(str, false);
            return;
        }
        if (size == 1 && z4) {
            enlargeScreenManageParams.replacedPos = C1697810uHb.LJIILJJIL(ListProtector.get(this.LIZ.LJIIIIZZ(), 0));
        }
        enlargeScreenManageParams.scene = 7;
        LJJIJ(str, enlargeScreenManageParams, interfaceC920110a3F);
    }
}
