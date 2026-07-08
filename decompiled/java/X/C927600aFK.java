package X;

import Y.AfS67S0201000_15;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiLiveApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.utils.setting.MultiGuestGuestShowdownRemainTaskSetting;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizCreateChannelParams;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DslLayoutKt;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestFloatLayoutStyleMapSettings;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS203S0000000_15;
import webcast.data.multilive_biz.BizResumeParams;

/* JADX INFO: renamed from: X.0aFK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C927600aFK {
    public static final C01GW<C927600aFK> LIZIZ = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, AFwS203S0000000_15.get$arr$(203));
    public MultiGuestDataHolder LIZ;

    public final MultiGuestDataHolder LJIILIIL() {
        MultiGuestDataHolder multiGuestDataHolder = this.LIZ;
        if (multiGuestDataHolder != null) {
            return multiGuestDataHolder;
        }
        return null;
    }

    public final void LJIIZILJ() {
        C948450amx c948450amx = C948450amx.LIZIZ;
        MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) c948450amx.LJIIJJI("MULTI_GUEST_DATA_HOLDER");
        if (multiGuestDataHolder == null) {
            MultiGuestDataHolder multiGuestDataHolder2 = new MultiGuestDataHolder();
            c948450amx.LJFF(multiGuestDataHolder2, "MULTI_GUEST_DATA_HOLDER");
            this.LIZ = multiGuestDataHolder2;
            C920830a4P.LIZ = multiGuestDataHolder2;
        }
        if (C943630afB.LIZ().fixMultiGuestV3ManagerDataHolderInitWay && multiGuestDataHolder != null && this.LIZ == null) {
            this.LIZ = multiGuestDataHolder;
            C920830a4P.LIZ = multiGuestDataHolder;
        }
    }

    public C927600aFK() {
        LJIIZILJ();
    }

    public static boolean LIZLLL() {
        if (!C931790aM5.LIZIZ()) {
            EnumC918970a1P enumC918970a1PLJII = LJII();
            return enumC918970a1PLJII == EnumC918970a1P.FLOATING_FIX || enumC918970a1PLJII == EnumC918970a1P.GRID_FIX;
        }
        if (C01ZD.LIZ(7) && C940770aaZ.LIZ().getDataSource().getPanelLayoutType() == 1) {
            return false;
        }
        return C940770aaZ.LIZ().getDataSource().LJI();
    }

    public static boolean LJ() {
        if (!C931790aM5.LIZIZ()) {
            EnumC918970a1P enumC918970a1PLJII = LJII();
            return enumC918970a1PLJII == EnumC918970a1P.FLOATING || enumC918970a1PLJII == EnumC918970a1P.FLOATING_FIX;
        }
        if (C01ZD.LIZ(7) && C940770aaZ.LIZ().getDataSource().getPanelLayoutType() == 1) {
            return false;
        }
        return C940770aaZ.LIZ().getDataSource().LJ();
    }

    @InterfaceC1294060jmO
    public static EnumC918990a1R LJFF() {
        Layout layoutLJFF;
        if (C931790aM5.LIZIZ()) {
            return C916800Zxu.LJI(C940770aaZ.LIZ().getDataSource());
        }
        InterfaceC937900aVw interfaceC937900aVwLJIIIIZZ = C921180a4y.LJIIIIZZ(C915980Zwa.LJIIIIZZ());
        return C916560ZxW.LIZ((interfaceC937900aVwLJIIIIZZ == null || (layoutLJFF = interfaceC937900aVwLJIIIIZZ.LJFF()) == null) ? null : layoutLJFF.businessType);
    }

    public static int LJI() {
        int maxCount;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        if (C931790aM5.LIZIZ()) {
            maxCount = C940770aaZ.LIZ().getDataSource().LIZJ();
        } else {
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            maxCount = DslLayoutKt.getMaxCount((interfaceC954180awCLLJLL == null || (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL()) == null) ? null : interfaceC937900aVwLLIIJLIL.LJFF());
        }
        return maxCount - 1;
    }

    @InterfaceC1294060jmO
    public static EnumC918970a1P LJII() {
        if (!C931790aM5.LIZIZ()) {
            return LIZ(LJFF());
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("verehu getCurrentLayoutType, isOptFeatOpen=");
        sbLIZ.append(C01ZD.LIZ(7));
        sbLIZ.append(" layoutStyle:");
        sbLIZ.append(C940770aaZ.LIZ().getDataSource().LJII());
        sbLIZ.append(" panelLayoutType:");
        sbLIZ.append(C940770aaZ.LIZ().getDataSource().getPanelLayoutType());
        C20441214yg.LIZIZ("OneVn_MultiGuestV3Manager", C2188811AlT.LIZIZ(sbLIZ));
        if (C01ZD.LIZ(7)) {
            Pair pair = new Pair(Integer.valueOf(C940770aaZ.LIZ().getDataSource().LJII()), Integer.valueOf(C940770aaZ.LIZ().getDataSource().getPanelLayoutType()));
            Integer num = (Integer) pair.getSecond();
            return (num == null || num.intValue() != 1) ? C916800Zxu.LJII((Integer) pair.getFirst(), C940770aaZ.LIZ().getDataSource()) : EnumC918970a1P.NORMAL;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("verehu default getCurrentLayoutType, isOptFeatOpen=");
        sbLIZ2.append(C01ZD.LIZ(7));
        sbLIZ2.append(" layoutStyle:");
        sbLIZ2.append(C940770aaZ.LIZ().getDataSource().LJII());
        sbLIZ2.append(" panelLayoutType:");
        sbLIZ2.append(C940770aaZ.LIZ().getDataSource().getPanelLayoutType());
        C20441214yg.LIZIZ("OneVn_MultiGuestV3Manager", C2188811AlT.LIZIZ(sbLIZ2));
        return C916800Zxu.LJII(Integer.valueOf(C940770aaZ.LIZ().getDataSource().LJII()), C940770aaZ.LIZ().getDataSource());
    }

    public static EnumC918970a1P LJIIIZ() {
        return C931790aM5.LIZIZ() ? C916800Zxu.LJII(Integer.valueOf(C940770aaZ.LIZ().getDataSource().LJII()), C940770aaZ.LIZ().getDataSource()) : LIZ(LJFF());
    }

    @InterfaceC1294060jmO
    public static EnumC918990a1R LJIIJ() {
        EnumC918990a1R enumC918990a1RLJFF = LJFF();
        return enumC918990a1RLJFF == null ? EnumC918990a1R.NORMAL : enumC918990a1RLJFF;
    }

    public static int LJIIJJI() {
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        Layout layoutLJFF;
        int maxCount;
        if (C931790aM5.LIZIZ()) {
            maxCount = C940770aaZ.LIZ().getDataSource().LIZJ();
        } else {
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL == null || (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL()) == null || (layoutLJFF = interfaceC937900aVwLLIIJLIL.LJFF()) == null) {
                return 8;
            }
            maxCount = DslLayoutKt.getMaxCount(layoutLJFF);
        }
        if (maxCount != 0) {
            return maxCount - 1;
        }
        return 8;
    }

    public static int LJIIL() {
        return LJIILL() ? LJIIJJI() : C924810aAp.LJ().LJJIIZ;
    }

    @InterfaceC1294060jmO
    public static boolean LJIILL() {
        return C915980Zwa.LJIIIIZZ().LLJLL() != null;
    }

    public static boolean LJIILLIIL() {
        int iLJIIJJI = LJIIJJI();
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        return (interfaceC954180awCLLJLL != null ? interfaceC954180awCLLJLL.LIZIZ() : 0) - 1 >= iLJIIJJI;
    }

    public static EnumC918970a1P LIZ(EnumC918990a1R enumC918990a1R) {
        String businessType;
        if (enumC918990a1R != null) {
            businessType = enumC918990a1R.getBusinessType();
        } else {
            businessType = null;
        }
        return C916800Zxu.LIZ(businessType);
    }

    public static C11NZ LIZIZ(C927640aFO c927640aFO) {
        int i;
        C480460Ism.LIZ().getClass();
        MultiLiveApi multiLiveApi = (MultiLiveApi) C480460Ism.LIZLLL(MultiLiveApi.class);
        long j = c927640aFO.LIZ;
        long j2 = c927640aFO.LIZIZ;
        long j3 = c927640aFO.LIZJ;
        Long l = c927640aFO.LIZLLL;
        int i2 = c927640aFO.LJ;
        if (C917810ZzX.LJIIIIZZ()) {
            i = 4;
        } else {
            i = c927640aFO.LJFF;
        }
        return multiLiveApi.anchorOrModeratorMuteGuest(j, j2, j3, l, i2, i, c927640aFO.LJI).LJIILIIL(new C0UO0());
    }

    @InterfaceC1294060jmO
    public static EnumC918970a1P LJIIIIZZ(InterfaceC937900aVw interfaceC937900aVw) {
        String str;
        Layout layoutLJFF;
        if (C931790aM5.LIZIZ()) {
            return C916800Zxu.LJII(Integer.valueOf(C940770aaZ.LIZ().getDataSource().LJII()), C940770aaZ.LIZ().getDataSource());
        }
        if (interfaceC937900aVw != null && (layoutLJFF = interfaceC937900aVw.LJFF()) != null) {
            str = layoutLJFF.businessType;
        } else {
            str = null;
        }
        return LIZ(C916560ZxW.LIZ(str));
    }

    public static boolean LJIILJJIL(C925770aCN c925770aCN) {
        if (c925770aCN != null) {
            if (c925770aCN.LIZJ == 0 || c925770aCN.LIZJ == 1 || c925770aCN.LIZJ == 3 || c925770aCN.LIZJ == 7 || c925770aCN.LIZJ == 8 || c925770aCN.LIZJ == 12 || c925770aCN.LIZJ == 15 || c925770aCN.LIZJ == 17 || c925770aCN.LIZJ == 16 || c925770aCN.LIZJ == 18 || c925770aCN.LIZJ == 19 || c925770aCN.LIZJ == 20) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void LJIJ(Room room, int i, LifecycleOwner lifecycleOwner, String str, Function1<? super Boolean, Unit> function1) {
        String str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C01HU.LIZIZ(linkedHashMap);
        linkedHashMap.put("user_id", C924660aAa.LIZIZ());
        linkedHashMap.put("setting_position", str);
        int i2 = C936070aSz.LIZ;
        if (i != 2) {
            str2 = "on";
        } else {
            str2 = "off";
        }
        linkedHashMap.put("switch_to", str2);
        C924660aAa.LJIJI("livesdk_multi_guest_switch_camera_mirror_setting", linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("room_id", String.valueOf(room.getId()));
        String.valueOf(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).liveId());
        linkedHashMap2.put("anchor_id", String.valueOf(room.getOwner().getId()));
        linkedHashMap2.put("guest_camera_mirror_status", String.valueOf(i));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateGuestMirrorStatus mirrorStatus:");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("OneVn_MultiGuestV3Manager", C2188811AlT.LIZIZ(sbLIZ));
        C480460Ism.LIZ().getClass();
        ((InterfaceC500100JjM) ((LinkApi) C480460Ism.LIZLLL(LinkApi.class)).updateGuestSetting(linkedHashMap2).LIZLLL(C11RD.LIZ(C11RB.LIZJ(lifecycleOwner, Lifecycle.Event.ON_DESTROY), new C0UO0()))).LIZ(new AfS67S0201000_15(i, this, function1, 1), new C516101zj(i, (int) function1, (Function1<? super Boolean, Unit>) 3));
    }

    public final void LIZJ(int i, int i2, String str, InterfaceC954180awC interfaceC954180awC, final InterfaceC920680a4A<CreateChannelResult> interfaceC920680a4A, final EnumC925190aBR enumC925190aBR, final DataChannel dataChannel) {
        BizCreateChannelParams bizCreateChannelParams = new BizCreateChannelParams();
        bizCreateChannelParams.displayId = 1;
        bizCreateChannelParams.layoutStyle = i2;
        bizCreateChannelParams.maxPosition = i;
        BizCreateChannelParams.UserSetting userSetting = new BizCreateChannelParams.UserSetting();
        userSetting.frameSetting = MultiGuestFloatLayoutStyleMapSettings.INSTANCE.isInFrameRatio21Lab();
        bizCreateChannelParams.userSetting = userSetting;
        final C963830bBl c963830bBl = new C963830bBl(i, str, bizCreateChannelParams, null, EnumC965730bEp.INNER);
        if (interfaceC954180awC != null) {
            InterfaceC920680a4A<CreateChannelResult> interfaceC920680a4A2 = new InterfaceC920680a4A<CreateChannelResult>() { // from class: X.0aF9
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:265:0x065a  */
                /* JADX WARN: Removed duplicated region for block: B:39:0x008d  */
                /* JADX WARN: Removed duplicated region for block: B:44:0x00b8  */
                /* JADX WARN: Removed duplicated region for block: B:47:0x00c8  */
                /* JADX WARN: Removed duplicated region for block: B:55:0x00fd  */
                /* JADX WARN: Removed duplicated region for block: B:57:0x0114  */
                @Override // X.InterfaceC920680a4A
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onSuccess(com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelResult r67) {
                    /*
                        Method dump skipped, instruction units count: 1694
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C927490aF9.onSuccess(java.lang.Object):void");
                }

                @Override // X.InterfaceC920680a4A
                public final void LIZ(LinkCoreError linkCoreError, Throwable th) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("anchor createChannel failed, ");
                    sbLIZ.append(C2199671B7d.LJIILLIIL(th));
                    C919310a1x.LIZIZ("OneVn_MultiGuestV3Manager", C2188811AlT.LIZIZ(sbLIZ));
                    interfaceC920680a4A.LIZ(linkCoreError, th);
                }
            };
            BizResumeParams bizResumeParams = new BizResumeParams();
            bizResumeParams.needShowInfo = MultiGuestLiveShowSetting.INSTANCE.isV1();
            bizResumeParams.needGuestShowdown = MultiGuestGuestShowdownRemainTaskSetting.INSTANCE.isRemainTaskOpenExcludeMinGuestCount();
            interfaceC954180awC.LLILLIZIL(c963830bBl, interfaceC920680a4A2, bizResumeParams);
        }
    }
}
