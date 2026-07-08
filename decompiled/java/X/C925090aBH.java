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
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS110S0400000_12;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: renamed from: X.0aBH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C925090aBH {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static BaseResponse<AudienceMultiGuestPermissionResponseData, CheckPermissionExtra> LIZJ;
    public static final C01GW LIZLLL = C930540aK4.LJJIJIL(AFwS203S0000000_15.get$arr$(474));

    public static void LIZLLL(Long l) {
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
    }

    public static void LJ(AudienceMultiGuestPermissionResponseData audienceMultiGuestPermissionResponseData) {
        MultiGuestDataHolder multiGuestDataHolder;
        Long lValueOf;
        C948450amx c948450amx = C948450amx.LIZIZ;
        String str = null;
        if (c948450amx.LJIIIZ("MULTI_GUEST_DATA_HOLDER") != null) {
            Object objLJIIIZ = c948450amx.LJIIIZ("MULTI_GUEST_DATA_HOLDER");
            if ((objLJIIIZ instanceof MultiGuestDataHolder) && (multiGuestDataHolder = (MultiGuestDataHolder) objLJIIIZ) != null) {
                MultiGuestPermissionInfo multiGuestPermissionInfo = audienceMultiGuestPermissionResponseData.permissionInfo;
                if (multiGuestPermissionInfo != null) {
                    lValueOf = Long.valueOf(multiGuestPermissionInfo.errCode);
                } else {
                    lValueOf = null;
                }
                multiGuestDataHolder.LJJL = lValueOf;
                MultiGuestPermissionInfo multiGuestPermissionInfo2 = audienceMultiGuestPermissionResponseData.permissionInfo;
                if (multiGuestPermissionInfo2 != null) {
                    str = multiGuestPermissionInfo2.noPermissionPrompt;
                }
                multiGuestDataHolder.LJJLI = str;
            }
        }
    }

    public static final void LIZJ(Room room, InterfaceC927530aFD interfaceC927530aFD) {
        MultiLiveUserSettings multiLiveUserSettings;
        MultiLiveUserApplySettings multiLiveUserApplySettings;
        RoomAudienceMultiGuestPermissionInfo roomAudienceMultiGuestPermissionInfo;
        boolean zHasMultiGuestPermissionAudienceSide;
        MultiGuestDataHolder multiGuestDataHolder;
        String errPromptAudienceSide;
        MultiGuestDataHolder multiGuestDataHolder2;
        long jLongValue;
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
                C948450amx c948450amx = C948450amx.LIZIZ;
                if (c948450amx.LJIIIZ("MULTI_GUEST_DATA_HOLDER") != null) {
                    Object objLJIIIZ = c948450amx.LJIIIZ("MULTI_GUEST_DATA_HOLDER");
                    if ((objLJIIIZ instanceof MultiGuestDataHolder) && (multiGuestDataHolder2 = (MultiGuestDataHolder) objLJIIIZ) != null) {
                        MultiLiveUserSettings multiLiveUserSettings4 = room.multiLiveUserSettings;
                        if (multiLiveUserSettings4 != null && (multiLiveUserApplySettings2 = multiLiveUserSettings4.multiLiveUserApplySettings) != null && (roomAudienceMultiGuestPermissionInfo2 = multiLiveUserApplySettings2.roomAudienceMultiGuestPermissionInfo) != null && (multiGuestPermissionInfo = roomAudienceMultiGuestPermissionInfo2.permissionInfo) != null && (l = multiGuestPermissionInfo.linkPermissionType) != null) {
                            jLongValue = l.longValue();
                        } else {
                            jLongValue = 0;
                        }
                        multiGuestDataHolder2.LJJII(jLongValue);
                        multiGuestDataHolder2.LJJL = 0L;
                        return;
                    }
                    return;
                }
                return;
            }
            MultiLiveUserSettings multiLiveUserSettings5 = room.multiLiveUserSettings;
            if (multiLiveUserSettings5 == null || !multiLiveUserSettings5.hasErrCodeAudienceSide()) {
                return;
            }
            C948450amx c948450amx2 = C948450amx.LIZIZ;
            if (c948450amx2.LJIIIZ("MULTI_GUEST_DATA_HOLDER") == null) {
                return;
            }
            Object objLJIIIZ2 = c948450amx2.LJIIIZ("MULTI_GUEST_DATA_HOLDER");
            if (!(objLJIIIZ2 instanceof MultiGuestDataHolder) || (multiGuestDataHolder = (MultiGuestDataHolder) objLJIIIZ2) == null) {
                return;
            }
            MultiLiveUserSettings multiLiveUserSettings6 = room.multiLiveUserSettings;
            if (multiLiveUserSettings6 != null) {
                errCodeAudienceSide = multiLiveUserSettings6.getErrCodeAudienceSide();
            }
            multiGuestDataHolder.LJJL = Long.valueOf(errCodeAudienceSide);
            MultiLiveUserSettings multiLiveUserSettings7 = room.multiLiveUserSettings;
            if (multiLiveUserSettings7 == null || (errPromptAudienceSide = multiLiveUserSettings7.getErrPromptAudienceSide()) == null) {
                errPromptAudienceSide = "";
            }
            multiGuestDataHolder.LJJLI = errPromptAudienceSide;
            return;
        }
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)) == null) {
            return;
        }
        C480460Ism.LIZ().getClass();
        ((InterfaceC500100JjM) ((LinkApi) C480460Ism.LIZLLL(LinkApi.class)).checkAudienceSelfPermission(room.getId(), r2.appId(), r2.liveId()).LJFF(new C0UO0()).LIZLLL(C11RD.LJ(interfaceC927530aFD))).LIZ(new C09JN() { // from class: X.0aBI
            @Override // X.C09JN
            public final void accept(Object obj) {
                Long l2;
                C1C7U.LIZ("VoiceChatPermissionManager@120.handlePermissionFromRoom$1");
                BaseResponse baseResponse = (BaseResponse) obj;
                T t = baseResponse.data;
                if (t != null && ((AudienceMultiGuestPermissionResponseData) t).LIZ()) {
                    boolean z = C925090aBH.LIZ;
                    MultiGuestPermissionInfo multiGuestPermissionInfo2 = ((AudienceMultiGuestPermissionResponseData) baseResponse.data).permissionInfo;
                    if (multiGuestPermissionInfo2 != null) {
                        l2 = multiGuestPermissionInfo2.linkPermissionType;
                    } else {
                        l2 = null;
                    }
                    C925090aBH.LIZLLL(l2);
                } else {
                    boolean z2 = C925090aBH.LIZ;
                    C925090aBH.LJ((AudienceMultiGuestPermissionResponseData) baseResponse.data);
                }
                C1C7U.LIZIZ("VoiceChatPermissionManager@120.handlePermissionFromRoom$1");
            }
        }, new AfS184S0100000_15(interfaceC927530aFD, 251));
    }

    public static void LIZ(DataChannel dataChannel, final int i, final Activity activity, Long l, Function1 function1, AwS559S0100000_15 awS559S0100000_15) {
        long jLongValue;
        final Pair pair;
        final AwS110S0400000_12 awS110S0400000_12 = new AwS110S0400000_12(activity, function1, awS559S0100000_15, dataChannel, 5);
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        int iLIZLLL = C916490ZxP.LIZLLL(jLongValue);
        if (iLIZLLL == 2) {
            pair = new Pair(Boolean.valueOf(C202002142e.LIZJ(activity, "android.permission.RECORD_AUDIO")), new String[]{"android.permission.RECORD_AUDIO"});
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cannot enter here, linkPermission is :");
            sbLIZ.append(iLIZLLL);
            sbLIZ.append(", need to check the specific_permission_bit_map value from server");
            C1AZW.LJFF("VoiceChatPermissionManager", C2188811AlT.LIZIZ(sbLIZ), null, null);
            pair = new Pair(Boolean.valueOf(C202002142e.LIZJ(activity, "android.permission.RECORD_AUDIO")), new String[]{"android.permission.RECORD_AUDIO"});
        }
        if (((Boolean) pair.getFirst()).booleanValue()) {
            awS110S0400000_12.invoke(Integer.valueOf(i));
            return;
        }
        C19514711Wn c19514711WnLIZIZ = C19514711Wn.LIZIZ.LIZIZ(activity, TokenCert.Companion.with("bpea-voice_chat_check_audio_record_permission"));
        String[] strArr = (String[]) pair.getSecond();
        c19514711WnLIZIZ.LIZIZ((String[]) Arrays.copyOf(strArr, strArr.length)).LIZJ(new InterfaceC19515111Wr() { // from class: X.0aK2
            public final /* synthetic */ Function0<Unit> LIZLLL = null;

            @Override // X.InterfaceC19515111Wr
            public final void onCanceled() {
                Function0<Unit> function0 = this.LIZLLL;
                if (function0 != null) {
                    function0.invoke();
                }
                C766270U4b.LJFF(2131853464, activity);
                boolean z = C925090aBH.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(pair.getSecond());
                sbLIZ2.append(" onPermissionDenied");
                C1AZW.LJFF("VoiceChatPermissionManager", C2188811AlT.LIZIZ(sbLIZ2), null, null);
            }

            @Override // X.InterfaceC19515111Wr
            public final void LIZ(C0HWO... c0hwoArr) {
                for (C0HWO c0hwo : c0hwoArr) {
                    if (!c0hwo.LIZ()) {
                        Function0<Unit> function0 = this.LIZLLL;
                        if (function0 != null) {
                            function0.invoke();
                        }
                        C766270U4b.LJFF(2131843594, activity);
                        boolean z = C925090aBH.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(pair.getSecond());
                        sbLIZ2.append(" onPermissionDenied");
                        C1AZW.LJFF("VoiceChatPermissionManager", C2188811AlT.LIZIZ(sbLIZ2), null, null);
                        for (C0HWO c0hwo2 : c0hwoArr) {
                            EnumC442280HVy enumC442280HVy = c0hwo2.LIZIZ;
                            if (enumC442280HVy == EnumC442280HVy.DENIED_PERMANENT || enumC442280HVy == EnumC442280HVy.THIS_OPERATION_NOT_PERMITTED) {
                                C924690aAd.LIZ("refuse", pair.getSecond(), true);
                                return;
                            }
                        }
                        return;
                    }
                }
                Function1<Integer, Unit> function12 = awS110S0400000_12;
                if (function12 != null) {
                    function12.invoke(Integer.valueOf(i));
                }
                C924690aAd.LIZ("allow", pair.getSecond(), true);
            }
        });
    }

    public static void LIZIZ(Room room, DataChannel dataChannel, InterfaceC923660a8y interfaceC923660a8y, int i, boolean z, Function1 function1, Function0 function0, Function2 function2, Function2 function22) {
        Long l;
        if (LIZ) {
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
            return;
        }
        LIZ = true;
        C480460Ism.LIZ().getClass();
        ((C11NJ) LIZLLL.getValue()).LIZ(((InterfaceC500100JjM) ((LinkApi) C480460Ism.LIZLLL(LinkApi.class)).checkAudienceSelfPermission(room.getId(), r4.appId(), r4.liveId()).LJFF(new C0UO0()).LIZLLL(C11RD.LJ(interfaceC923660a8y))).LIZ(new AfS1S0501000_15(dataChannel, interfaceC923660a8y, i, function1, function2, function22, 2), new AfS0S0311000_15(z, dataChannel, function0, interfaceC923660a8y, i, 2)));
    }
}
