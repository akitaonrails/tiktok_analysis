package X;

import Y.AfS0S0311000_15;
import Y.AfS184S0100000_15;
import Y.AfS1S0501000_15;
import android.app.Activity;
import com.bytedance.android.live.liveinteract.gamelink.model.GameLinkDataHolder;
import com.bytedance.android.live.liveinteract.multilive.model.AudienceMultiGuestPermissionResponseData;
import com.bytedance.android.live.liveinteract.multilive.model.MultiGuestPermissionInfo;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.model.interact.CheckPermissionExtra;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicLyraxPluginAdapt;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicVEPluginAdapt;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveGameLinkButtonSetting;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplySettings;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings;
import com.bytedance.android.livesdk.model.linksetting.RoomAudienceMultiGuestPermissionInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS203S0000000_15;

/* JADX INFO: renamed from: X.0aBF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C925070aBF {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static BaseResponse<AudienceMultiGuestPermissionResponseData, CheckPermissionExtra> LIZJ;
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(238));

    public static void LIZLLL(Long l) {
        long jLongValue;
        GameLinkDataHolder gameLinkDataHolderLIZ = C924250a9v.LIZ();
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        gameLinkDataHolderLIZ.LJJII(jLongValue);
        gameLinkDataHolderLIZ.LJJL = 0L;
    }

    public static final void LIZJ(Room room, LiveWidget liveWidget) {
        MultiLiveUserSettings multiLiveUserSettings;
        MultiLiveUserApplySettings multiLiveUserApplySettings;
        RoomAudienceMultiGuestPermissionInfo roomAudienceMultiGuestPermissionInfo;
        boolean zHasMultiGuestPermissionAudienceSide;
        String errPromptAudienceSide;
        MultiLiveUserApplySettings multiLiveUserApplySettings2;
        RoomAudienceMultiGuestPermissionInfo roomAudienceMultiGuestPermissionInfo2;
        MultiGuestPermissionInfo multiGuestPermissionInfo;
        Long l;
        if (room == null) {
            return;
        }
        MultiLiveUserSettings multiLiveUserSettings2 = room.multiLiveUserSettings;
        if (multiLiveUserSettings2 != null && multiLiveUserSettings2.isRoomPackSuccAudienceSide() && (multiLiveUserSettings = room.multiLiveUserSettings) != null && (multiLiveUserApplySettings = multiLiveUserSettings.multiLiveUserApplySettings) != null && (roomAudienceMultiGuestPermissionInfo = multiLiveUserApplySettings.roomAudienceMultiGuestPermissionInfo) != null && roomAudienceMultiGuestPermissionInfo.permissionInfo != null) {
            MultiLiveUserSettings multiLiveUserSettings3 = room.multiLiveUserSettings;
            if (multiLiveUserSettings3 != null) {
                zHasMultiGuestPermissionAudienceSide = multiLiveUserSettings3.hasMultiGuestPermissionAudienceSide();
            } else {
                zHasMultiGuestPermissionAudienceSide = false;
            }
            long errCodeAudienceSide = 0;
            if (zHasMultiGuestPermissionAudienceSide) {
                MultiLiveUserSettings multiLiveUserSettings4 = room.multiLiveUserSettings;
                if (multiLiveUserSettings4 != null && (multiLiveUserApplySettings2 = multiLiveUserSettings4.multiLiveUserApplySettings) != null && (roomAudienceMultiGuestPermissionInfo2 = multiLiveUserApplySettings2.roomAudienceMultiGuestPermissionInfo) != null && (multiGuestPermissionInfo = roomAudienceMultiGuestPermissionInfo2.permissionInfo) != null && (l = multiGuestPermissionInfo.linkPermissionType) != null) {
                    errCodeAudienceSide = l.longValue();
                }
                LIZLLL(Long.valueOf(errCodeAudienceSide));
                return;
            }
            MultiLiveUserSettings multiLiveUserSettings5 = room.multiLiveUserSettings;
            if (multiLiveUserSettings5 == null || !multiLiveUserSettings5.hasErrCodeAudienceSide()) {
                return;
            }
            MultiLiveUserSettings multiLiveUserSettings6 = room.multiLiveUserSettings;
            if (multiLiveUserSettings6 != null) {
                errCodeAudienceSide = multiLiveUserSettings6.getErrCodeAudienceSide();
            }
            Long lValueOf = Long.valueOf(errCodeAudienceSide);
            MultiLiveUserSettings multiLiveUserSettings7 = room.multiLiveUserSettings;
            if (multiLiveUserSettings7 == null || (errPromptAudienceSide = multiLiveUserSettings7.getErrPromptAudienceSide()) == null) {
                errPromptAudienceSide = "";
            }
            LJ(lValueOf, errPromptAudienceSide);
            return;
        }
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)) == null) {
            return;
        }
        C480460Ism.LIZ().getClass();
        ((InterfaceC500100JjM) ((LinkApi) C480460Ism.LIZLLL(LinkApi.class)).checkAudienceSelfPermission(room.getId(), r2.appId(), r2.liveId()).LJFF(new C0UO0()).LIZLLL(C11RD.LJ(liveWidget))).LIZ(new C09JN() { // from class: X.0aBE
            @Override // X.C09JN
            public final void accept(Object obj) {
                Long lValueOf2;
                MultiGuestPermissionInfo multiGuestPermissionInfo2;
                MultiGuestPermissionInfo multiGuestPermissionInfo3;
                C1C7U.LIZ("GameLinkPermissionManager@2602.handlePermissionFromRoom$1");
                BaseResponse baseResponse = (BaseResponse) obj;
                T t = baseResponse.data;
                String str = null;
                Long l2 = null;
                str = null;
                if (t != null && ((AudienceMultiGuestPermissionResponseData) t).LIZ()) {
                    MultiGuestPermissionInfo multiGuestPermissionInfo4 = ((AudienceMultiGuestPermissionResponseData) baseResponse.data).permissionInfo;
                    if (multiGuestPermissionInfo4 != null) {
                        l2 = multiGuestPermissionInfo4.linkPermissionType;
                    }
                    C925070aBF.LIZLLL(l2);
                } else {
                    AudienceMultiGuestPermissionResponseData audienceMultiGuestPermissionResponseData = (AudienceMultiGuestPermissionResponseData) baseResponse.data;
                    if (audienceMultiGuestPermissionResponseData != null && (multiGuestPermissionInfo3 = audienceMultiGuestPermissionResponseData.permissionInfo) != null) {
                        lValueOf2 = Long.valueOf(multiGuestPermissionInfo3.errCode);
                    } else {
                        lValueOf2 = null;
                    }
                    AudienceMultiGuestPermissionResponseData audienceMultiGuestPermissionResponseData2 = (AudienceMultiGuestPermissionResponseData) baseResponse.data;
                    if (audienceMultiGuestPermissionResponseData2 != null && (multiGuestPermissionInfo2 = audienceMultiGuestPermissionResponseData2.permissionInfo) != null) {
                        str = multiGuestPermissionInfo2.noPermissionPrompt;
                    }
                    C925070aBF.LJ(lValueOf2, str);
                }
                C1C7U.LIZIZ("GameLinkPermissionManager@2602.handlePermissionFromRoom$1");
            }
        }, new AfS184S0100000_15(liveWidget, 104));
    }

    public static void LJ(Long l, String str) {
        GameLinkDataHolder gameLinkDataHolderLIZ = C924250a9v.LIZ();
        if (l == null) {
            l = 0L;
        }
        gameLinkDataHolderLIZ.LJJL = l;
        gameLinkDataHolderLIZ.LJJLI = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(final boolean z, final int i, final Activity activity, Long l, final Function1 function1, final Function0 function0, final Function0 function02) {
        long jLongValue;
        final Pair pair;
        String str;
        IHostCreativeTool iHostCreativeTool;
        IHostCreativeTool iHostCreativeTool2;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        if (C924250a9v.LIZIZ(jLongValue) == 2) {
            pair = new Pair(Boolean.valueOf(C202002142e.LIZJ(activity, "android.permission.RECORD_AUDIO")), "android.permission.RECORD_AUDIO");
        } else {
            pair = new Pair(Boolean.FALSE, "android.permission.RECORD_AUDIO");
        }
        if (((Boolean) pair.getFirst()).booleanValue()) {
            if (LinkMicVEPluginAdapt.enable() && (iHostCreativeTool2 = (IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class)) != null && !iHostCreativeTool2.a72(activity, "gamelink_interact")) {
                return;
            }
            if (LinkMicLyraxPluginAdapt.enable() && (iHostCreativeTool = (IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class)) != null && !iHostCreativeTool.cd(activity)) {
                return;
            }
            function1.invoke(Integer.valueOf(i));
            return;
        }
        C19514711Wn.LIZIZ.LIZIZ(activity, CertProviderManagerKt.findCert("bpea-live_studio_link_mic_audio", 1476788234)).LIZIZ(pair.getSecond()).LIZJ(new InterfaceC19515111Wr() { // from class: X.0Ul9
            @Override // X.InterfaceC19515111Wr
            public final void onCanceled() {
            }

            @Override // X.InterfaceC19515111Wr
            public final void LIZ(C0HWO... c0hwoArr) {
                IHostCreativeTool iHostCreativeTool3;
                IHostCreativeTool iHostCreativeTool4;
                for (C0HWO c0hwo : c0hwoArr) {
                    int i2 = C0LHE.LIZ[c0hwo.LIZIZ.ordinal()];
                    if (i2 != 1) {
                        if (i2 != 2 && i2 != 3) {
                            throw new C1954807lC();
                        }
                        boolean zLIZLLL = C202002142e.LIZLLL(activity, pair.getSecond());
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(c0hwo.LIZ);
                        sbLIZ.append(" onPermissionDenied,showRationaleNextTime =");
                        sbLIZ.append(zLIZLLL);
                        C20441214yg.LJ("GameLinkPermissionManager", C2188811AlT.LIZIZ(sbLIZ));
                        if (!zLIZLLL) {
                            C0UT8 c0ut8 = new C0UT8();
                            final Activity activity2 = activity;
                            final Pair<Boolean, String> pair2 = pair;
                            final boolean z2 = z;
                            final Function0<Unit> function03 = function02;
                            final Function0<Unit> function04 = function0;
                            c0ut8.LIZ(activity2, new InterfaceC784910Uqf() { // from class: X.0UlA
                                @Override // X.InterfaceC784910Uqf
                                public final void cancel() {
                                    Function0<Unit> function05 = function04;
                                    if (function05 != null) {
                                        function05.invoke();
                                    }
                                    C924650aAZ.LJIIL("cancel", new String[]{pair2.getSecond()}, z2);
                                }

                                @Override // X.InterfaceC784910Uqf
                                public final void execute() {
                                    C19741112Lp c19741112Lp = C19741112Lp.LIZ;
                                    Activity activity3 = activity2;
                                    String second = pair2.getSecond();
                                    c19741112Lp.getClass();
                                    C19741112Lp.LJIIIZ(activity3, second);
                                    C924650aAZ.LJIIL("set", new String[]{pair2.getSecond()}, z2);
                                    Function0<Unit> function05 = function03;
                                    if (function05 != null) {
                                        function05.invoke();
                                    }
                                }
                            }, new String[]{pair2.getSecond()});
                        } else {
                            Function0<Unit> function05 = function0;
                            if (function05 != null) {
                                function05.invoke();
                            }
                        }
                    } else {
                        if (LinkMicVEPluginAdapt.enable() && (iHostCreativeTool4 = (IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class)) != null && !iHostCreativeTool4.a72(activity, "gamelink_interact")) {
                            Function0<Unit> function06 = function0;
                            if (function06 != null) {
                                function06.invoke();
                                return;
                            }
                            return;
                        }
                        if (LinkMicLyraxPluginAdapt.enable() && (iHostCreativeTool3 = (IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class)) != null && !iHostCreativeTool3.cd(activity)) {
                            Function0<Unit> function07 = function0;
                            if (function07 != null) {
                                function07.invoke();
                                return;
                            }
                            return;
                        }
                        function1.invoke(Integer.valueOf(i));
                        C924650aAZ.LJIIL("allow", new String[]{c0hwo.LIZ}, z);
                    }
                }
            }
        });
        String[] strArr = {pair.getSecond()};
        HashMap map = new HashMap();
        C924650aAZ.LIZ(map);
        if (z) {
            str = C924650aAZ.LJI;
        } else {
            str = C924770aAl.LIZ;
        }
        if (str == null) {
            str = "";
        }
        map.put("check_permission_scene", str);
        map.put("popup_type", "first_popup");
        map.put("guest_permission", C924650aAZ.LJFF(false, null));
        map.put("require_permission", C924650aAZ.LJI(strArr));
        C924650aAZ.LJIILLIIL("livesdk_guest_sys_permission_show", null, map);
    }

    public static void LIZIZ(Room room, DataChannel dataChannel, InterfaceC923620a8u interfaceC923620a8u, int i, boolean z, Function1 function1, Function0 function0, Function2 function2, Function2 function22) {
        C11NJ c11nj;
        Long l;
        if (!LIZ) {
            if (i == 1 && LIZIZ) {
                BaseResponse<AudienceMultiGuestPermissionResponseData, CheckPermissionExtra> baseResponse = LIZJ;
                if (baseResponse != null) {
                    if (function22 != null) {
                        MultiGuestPermissionInfo multiGuestPermissionInfo = baseResponse.data.permissionInfo;
                        if (multiGuestPermissionInfo != null) {
                            l = multiGuestPermissionInfo.linkPermissionType;
                        } else {
                            l = null;
                        }
                        function22.invoke(l, Integer.valueOf(i));
                    }
                    LIZIZ = false;
                    return;
                }
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("LinkIn_Guest_Permission, roomId:");
            sbLIZ.append(room.getId());
            sbLIZ.append("; userId:");
            sbLIZ.append(room.getOwnerUserId());
            C20441214yg.LJIIIZ("GameLinkPermissionManager", C2188811AlT.LIZIZ(sbLIZ));
            if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)) == null) {
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("LinkIn_Guest_Permission2, roomId:");
            sbLIZ2.append(room.getId());
            sbLIZ2.append("; userId:");
            sbLIZ2.append(room.getOwnerUserId());
            sbLIZ2.append("， viewInterface:");
            sbLIZ2.append(interfaceC923620a8u);
            sbLIZ2.append(", compositeDisposable.isDisposed:");
            C01GW c01gw = LIZLLL;
            sbLIZ2.append(((C11NJ) c01gw.getValue()).LLILLJJLI);
            C944230ag9.LIZ("GameLinkPermissionManager", C2188811AlT.LIZIZ(sbLIZ2), true);
            LIZ = true;
            C480460Ism.LIZ().getClass();
            C11JL c11jlLIZ = ((InterfaceC500100JjM) ((LinkApi) C480460Ism.LIZLLL(LinkApi.class)).checkAudienceSelfPermission(room.getId(), r6.appId(), r6.liveId()).LJIIJ(new InterfaceC781210Ukh() { // from class: X.0a9p
                @Override // X.InterfaceC781210Ukh
                public final void run() {
                    if (LiveGameLinkButtonSetting.INSTANCE.isExperimentGroup()) {
                        return;
                    }
                    C925070aBF.LIZ = false;
                }
            }).LJFF(new C0UO0()).LIZLLL(C11RD.LJ(interfaceC923620a8u))).LIZ(new AfS1S0501000_15(dataChannel, interfaceC923620a8u, i, function1, function2, function22, 0), new AfS0S0311000_15(z, dataChannel, function0, interfaceC923620a8u, i, 0));
            if (((C11NJ) c01gw.getValue()).LLILLJJLI) {
                c11nj = new C11NJ();
            } else {
                c11nj = (C11NJ) c01gw.getValue();
            }
            c11nj.LIZ(c11jlLIZ);
        }
    }
}
