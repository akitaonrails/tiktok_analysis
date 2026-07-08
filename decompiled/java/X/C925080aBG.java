package X;

import Y.AfS0S0311000_15;
import Y.AfS184S0100000_15;
import Y.AfS1S0501000_15;
import android.app.Activity;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multilive.model.AudienceMultiGuestPermissionResponseData;
import com.bytedance.android.live.liveinteract.multilive.model.MultiGuestPermissionInfo;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.model.interact.CheckPermissionExtra;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplySettings;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings;
import com.bytedance.android.livesdk.model.linksetting.RoomAudienceMultiGuestPermissionInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: renamed from: X.0aBG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C925080aBG {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static BaseResponse<AudienceMultiGuestPermissionResponseData, CheckPermissionExtra> LIZJ;
    public static final C01GW LIZLLL = C930540aK4.LJJIJIL(AFwS203S0000000_15.get$arr$(470));

    public static boolean LJI() {
        Long l;
        MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_DATA_HOLDER");
        return multiGuestDataHolder != null && ((l = multiGuestDataHolder.LJJL) == null || l.longValue() != 0) && (multiGuestDataHolder.LJJJLL == -1 || multiGuestDataHolder.LJJJLL == 0);
    }

    public static String LJII(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(EnumC1303240k1C.BIZ.getValue());
        sbLIZ.append("_MultiGuestPermissionManager_");
        sbLIZ.append(i);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LJIIIIZZ(Long l) {
        MultiGuestDataHolder multiGuestDataHolder;
        long jLongValue;
        C948450amx c948450amx = C948450amx.LIZIZ;
        if (c948450amx.LJIIIZ("MULTI_GUEST_DATA_HOLDER") != null) {
            Object objLJIIIZ = c948450amx.LJIIIZ("MULTI_GUEST_DATA_HOLDER");
            if ((objLJIIIZ instanceof MultiGuestDataHolder) && (multiGuestDataHolder = (MultiGuestDataHolder) objLJIIIZ) != null) {
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
                multiGuestDataHolder.LJJII(jLongValue);
                multiGuestDataHolder.LJJL = 0L;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("saveLinkPermission linkPermission: ");
        sbLIZ.append(l);
        C20441214yg.LJIIIZ("multi_init", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LJIIIZ(AudienceMultiGuestPermissionResponseData audienceMultiGuestPermissionResponseData) {
        Long lValueOf;
        MultiGuestDataHolder multiGuestDataHolder;
        Long lValueOf2;
        String str;
        C948450amx c948450amx = C948450amx.LIZIZ;
        String str2 = null;
        if (c948450amx.LJIIIZ("MULTI_GUEST_DATA_HOLDER") != null) {
            Object objLJIIIZ = c948450amx.LJIIIZ("MULTI_GUEST_DATA_HOLDER");
            if ((objLJIIIZ instanceof MultiGuestDataHolder) && (multiGuestDataHolder = (MultiGuestDataHolder) objLJIIIZ) != null) {
                MultiGuestPermissionInfo multiGuestPermissionInfo = audienceMultiGuestPermissionResponseData.permissionInfo;
                if (multiGuestPermissionInfo != null) {
                    lValueOf2 = Long.valueOf(multiGuestPermissionInfo.errCode);
                } else {
                    lValueOf2 = null;
                }
                multiGuestDataHolder.LJJL = lValueOf2;
                MultiGuestPermissionInfo multiGuestPermissionInfo2 = audienceMultiGuestPermissionResponseData.permissionInfo;
                if (multiGuestPermissionInfo2 != null) {
                    str = multiGuestPermissionInfo2.noPermissionPrompt;
                } else {
                    str = null;
                }
                multiGuestDataHolder.LJJLI = str;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("saveLinkPermissionErrInfo errCode: ");
        MultiGuestPermissionInfo multiGuestPermissionInfo3 = audienceMultiGuestPermissionResponseData.permissionInfo;
        if (multiGuestPermissionInfo3 != null) {
            lValueOf = Long.valueOf(multiGuestPermissionInfo3.errCode);
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        sbLIZ.append(", errMsg: ");
        MultiGuestPermissionInfo multiGuestPermissionInfo4 = audienceMultiGuestPermissionResponseData.permissionInfo;
        if (multiGuestPermissionInfo4 != null) {
            str2 = multiGuestPermissionInfo4.noPermissionPrompt;
        }
        sbLIZ.append(str2);
        C20441214yg.LJIIIZ("multi_init", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LJFF(Room room, InterfaceC944250agB interfaceC944250agB) {
        boolean zIsRoomPackSuccAudienceSide;
        boolean z;
        boolean zHasMultiGuestPermissionAudienceSide;
        String errPromptAudienceSide;
        long errCodeAudienceSide;
        String errPromptAudienceSide2;
        MultiGuestDataHolder multiGuestDataHolder;
        long jLongValue;
        MultiLiveUserApplySettings multiLiveUserApplySettings;
        RoomAudienceMultiGuestPermissionInfo roomAudienceMultiGuestPermissionInfo;
        MultiGuestPermissionInfo multiGuestPermissionInfo;
        Long l;
        MultiLiveUserSettings multiLiveUserSettings;
        MultiLiveUserApplySettings multiLiveUserApplySettings2;
        RoomAudienceMultiGuestPermissionInfo roomAudienceMultiGuestPermissionInfo2;
        if (room == null) {
            return;
        }
        MultiLiveUserSettings multiLiveUserSettings2 = room.multiLiveUserSettings;
        if (multiLiveUserSettings2 != null) {
            zIsRoomPackSuccAudienceSide = multiLiveUserSettings2.isRoomPackSuccAudienceSide();
        } else {
            zIsRoomPackSuccAudienceSide = false;
        }
        MultiGuestDataHolder multiGuestDataHolder2 = null;
        if (zIsRoomPackSuccAudienceSide && (multiLiveUserSettings = room.multiLiveUserSettings) != null && (multiLiveUserApplySettings2 = multiLiveUserSettings.multiLiveUserApplySettings) != null && (roomAudienceMultiGuestPermissionInfo2 = multiLiveUserApplySettings2.roomAudienceMultiGuestPermissionInfo) != null && roomAudienceMultiGuestPermissionInfo2.permissionInfo != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            MultiLiveUserSettings multiLiveUserSettings3 = room.multiLiveUserSettings;
            if (multiLiveUserSettings3 != null) {
                zHasMultiGuestPermissionAudienceSide = multiLiveUserSettings3.hasMultiGuestPermissionAudienceSide();
            } else {
                zHasMultiGuestPermissionAudienceSide = false;
            }
            long errCodeAudienceSide2 = 0;
            if (zHasMultiGuestPermissionAudienceSide) {
                C948450amx c948450amx = C948450amx.LIZIZ;
                if (c948450amx.LJIIIZ("MULTI_GUEST_DATA_HOLDER") != null) {
                    Object objLJIIIZ = c948450amx.LJIIIZ("MULTI_GUEST_DATA_HOLDER");
                    if ((objLJIIIZ instanceof MultiGuestDataHolder) && (multiGuestDataHolder = (MultiGuestDataHolder) objLJIIIZ) != null) {
                        MultiLiveUserSettings multiLiveUserSettings4 = room.multiLiveUserSettings;
                        if (multiLiveUserSettings4 != null && (multiLiveUserApplySettings = multiLiveUserSettings4.multiLiveUserApplySettings) != null && (roomAudienceMultiGuestPermissionInfo = multiLiveUserApplySettings.roomAudienceMultiGuestPermissionInfo) != null && (multiGuestPermissionInfo = roomAudienceMultiGuestPermissionInfo.permissionInfo) != null && (l = multiGuestPermissionInfo.linkPermissionType) != null) {
                            jLongValue = l.longValue();
                        } else {
                            jLongValue = 0;
                        }
                        multiGuestDataHolder.LJJII(jLongValue);
                        multiGuestDataHolder.LJJL = 0L;
                    }
                }
                C20441214yg.LJIIIZ("multi_init", "hasMultiLivePermissionAudienceSide true");
                return;
            }
            MultiLiveUserSettings multiLiveUserSettings5 = room.multiLiveUserSettings;
            if (multiLiveUserSettings5 != null && multiLiveUserSettings5.hasErrCodeAudienceSide()) {
                C948450amx c948450amx2 = C948450amx.LIZIZ;
                if (c948450amx2.LJIIIZ("MULTI_GUEST_DATA_HOLDER") != null) {
                    Object objLJIIIZ2 = c948450amx2.LJIIIZ("MULTI_GUEST_DATA_HOLDER");
                    if (objLJIIIZ2 instanceof MultiGuestDataHolder) {
                        multiGuestDataHolder2 = (MultiGuestDataHolder) objLJIIIZ2;
                    }
                }
                String str = "";
                if (multiGuestDataHolder2 != null) {
                    MultiLiveUserSettings multiLiveUserSettings6 = room.multiLiveUserSettings;
                    if (multiLiveUserSettings6 != null) {
                        errCodeAudienceSide = multiLiveUserSettings6.getErrCodeAudienceSide();
                    } else {
                        errCodeAudienceSide = 0;
                    }
                    multiGuestDataHolder2.LJJL = Long.valueOf(errCodeAudienceSide);
                    MultiLiveUserSettings multiLiveUserSettings7 = room.multiLiveUserSettings;
                    if (multiLiveUserSettings7 == null || (errPromptAudienceSide2 = multiLiveUserSettings7.getErrPromptAudienceSide()) == null) {
                        errPromptAudienceSide2 = "";
                    }
                    multiGuestDataHolder2.LJJLI = errPromptAudienceSide2;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("hasMultiLivePermissionAudienceSide false, errCode: ");
                MultiLiveUserSettings multiLiveUserSettings8 = room.multiLiveUserSettings;
                if (multiLiveUserSettings8 != null) {
                    errCodeAudienceSide2 = multiLiveUserSettings8.getErrCodeAudienceSide();
                }
                sbLIZ.append(errCodeAudienceSide2);
                sbLIZ.append(", errorMsg:");
                MultiLiveUserSettings multiLiveUserSettings9 = room.multiLiveUserSettings;
                if (multiLiveUserSettings9 != null && (errPromptAudienceSide = multiLiveUserSettings9.getErrPromptAudienceSide()) != null) {
                    str = errPromptAudienceSide;
                }
                sbLIZ.append(str);
                C20441214yg.LJIIIZ("multi_init", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            C20441214yg.LJIIIZ("multi_init", "hasMultiLivePermissionAudienceSide false");
            return;
        }
        C20441214yg.LJIIIZ("multi_init", "hasMultiLivePermissionAudienceSide false, fallback to check permission immediately");
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)) == null) {
            return;
        }
        C480460Ism.LIZ().getClass();
        ((InterfaceC500100JjM) ((LinkApi) C480460Ism.LIZLLL(LinkApi.class)).checkAudienceSelfPermission(room.getId(), r2.appId(), r2.liveId()).LJFF(new C0UO0()).LIZLLL(C11RD.LJ(interfaceC944250agB))).LIZ(new C09JN() { // from class: X.0aBJ
            @Override // X.C09JN
            public final void accept(Object obj) {
                Long l2;
                C1C7U.LIZ("MultiGuestPermissionManager@6f0.handlePermissionFromRoom$1");
                BaseResponse baseResponse = (BaseResponse) obj;
                T t = baseResponse.data;
                if (t != null && ((AudienceMultiGuestPermissionResponseData) t).LIZ()) {
                    boolean z2 = C925080aBG.LIZ;
                    MultiGuestPermissionInfo multiGuestPermissionInfo2 = ((AudienceMultiGuestPermissionResponseData) baseResponse.data).permissionInfo;
                    if (multiGuestPermissionInfo2 != null) {
                        l2 = multiGuestPermissionInfo2.linkPermissionType;
                    } else {
                        l2 = null;
                    }
                    C925080aBG.LJIIIIZZ(l2);
                } else {
                    boolean z3 = C925080aBG.LIZ;
                    C925080aBG.LJIIIZ((AudienceMultiGuestPermissionResponseData) baseResponse.data);
                }
                C1C7U.LIZIZ("MultiGuestPermissionManager@6f0.handlePermissionFromRoom$1");
            }
        }, new AfS184S0100000_15(interfaceC944250agB, 245));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(final boolean r9, final int r10, android.app.Activity r11, java.lang.Long r12, final kotlin.jvm.functions.Function1 r13, final kotlin.jvm.functions.Function0 r14, final java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C925080aBG.LIZJ(boolean, int, android.app.Activity, java.lang.Long, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, java.lang.String):void");
    }

    public static void LIZ(boolean z, DataChannel dataChannel, int i, Activity activity, Long l, String str, Function1 function1, Function0 function0) {
        LIZJ(z, i, activity, l, new C781480Ul8(str, activity, function0, function1, dataChannel), new AwS559S0100000_15(function0, (Function0<Unit>) 1163), str);
    }

    public static void LIZLLL(Room room, DataChannel dataChannel, InterfaceC923600a8s interfaceC923600a8s, int i, boolean z, Function1 function1, Function0 function0, Function2 function2, Function2 function22) {
        Long l;
        boolean zLJI = MethodIDManager.LJI(202171);
        if (LIZ) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
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
            }
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("roomId:");
        sbLIZ.append(room.getId());
        sbLIZ.append("; userId:");
        sbLIZ.append(room.getOwnerUserId());
        C944240agA.LJFF("LinkIn_Guest_Permission", C2188811AlT.LIZIZ(sbLIZ));
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)) == null) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        LIZ = true;
        C480460Ism.LIZ().getClass();
        ((C11NJ) LIZLLL.getValue()).LIZ(((InterfaceC500100JjM) ((LinkApi) C480460Ism.LIZLLL(LinkApi.class)).checkAudienceSelfPermission(room.getId(), r5.appId(), r5.liveId()).LJFF(new C0UO0()).LIZLLL(C11RD.LJ(interfaceC923600a8s))).LIZ(new AfS1S0501000_15(dataChannel, interfaceC923600a8s, i, function1, function2, function22, 1), new AfS0S0311000_15(z, dataChannel, function0, interfaceC923600a8s, i, 1)));
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
