package X;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.game.api.GameRevenueRetrofitApi;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.message.GameGuessToastMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.game.InputAnswerRequest;

/* JADX INFO: renamed from: X.0Tgz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C753430Tgz implements InterfaceC774140UYi {
    public static final C753430Tgz LIZ = new C753430Tgz();
    public static boolean LIZIZ;

    @Override // X.InterfaceC774140UYi
    public final void LJIIIZ() {
        LIZIZ = false;
    }

    @Override // X.InterfaceC774140UYi
    public final String LIZJ() {
        if (LIZIZ) {
            return ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).context().getString(2131852794);
        }
        return null;
    }

    @Override // X.InterfaceC774140UYi
    public final String LIZLLL() {
        if (LIZIZ) {
            return ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).context().getString(2131852796);
        }
        return null;
    }

    @Override // X.InterfaceC774140UYi
    public final String LJIIIIZZ() {
        if (LIZIZ) {
            return ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).context().getString(2131852797);
        }
        return null;
    }

    public static final boolean LJIIJJI(DataChannel dataChannel) {
        Room room;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        RoomAuthStatus roomAuthStatus;
        RoomAuthStatus roomAuthStatus2;
        Boolean boolValueOf3 = null;
        if (dataChannel != null) {
            room = (Room) dataChannel.gg0(RoomChannel.class);
        } else {
            room = null;
        }
        if (((IUserManageService) C1161920gLG.LIZJ(IUserManageService.class)).OX1()) {
            if (room != null && (roomAuthStatus2 = room.getRoomAuthStatus()) != null) {
                boolValueOf = Boolean.valueOf(roomAuthStatus2.guessEntranceForHost);
            } else {
                boolValueOf = null;
            }
            if (C500260Jjc.LJJJI(boolValueOf)) {
                if (room != null && (roomAuthStatus = room.getRoomAuthStatus()) != null) {
                    boolValueOf2 = Boolean.valueOf(roomAuthStatus.gameGuessPermission);
                } else {
                    boolValueOf2 = null;
                }
                if (C500260Jjc.LJJJI(boolValueOf2)) {
                    if (room != null) {
                        boolValueOf3 = Boolean.valueOf(C500260Jjc.LJJI(room));
                    }
                    if (C500260Jjc.LJJIJIIJIL(boolValueOf3)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC774140UYi
    public final String LIZ(DataChannel dataChannel) {
        String str;
        String strLIZ;
        GameGuessToastMessage gameGuessToastMessageLJJIIJZLJL;
        String str2 = null;
        if (!LIZIZ) {
            return null;
        }
        InterfaceC753440Th0 interfaceC753440Th0 = (InterfaceC753440Th0) C2659011d.LIZ(dataChannel, InterfaceC753440Th0.class);
        if (interfaceC753440Th0 != null && (gameGuessToastMessageLJJIIJZLJL = interfaceC753440Th0.LJJIIJZLJL()) != null) {
            str2 = gameGuessToastMessageLJJIIJZLJL.resultStarlingKey;
        }
        String strJ4 = "";
        if (str2 == null) {
            str = "";
        } else {
            str = str2;
        }
        String strLIZ2 = C297401Dg.LIZ(str);
        if (Intrinsics.LJFF(str2, "ttlive_guessing_option_yes")) {
            strLIZ = C297401Dg.LIZ("ttlive_guessingGame_endLiveModal_ocrYesDesc");
        } else if (!Intrinsics.LJFF(str2, "ttlive_guessing_option_no")) {
            strLIZ = "";
        } else {
            strLIZ = C297401Dg.LIZ("ttlive_guessingGame_endLiveModal_ocrNoDesc");
        }
        if (strLIZ2.length() > 0 && strLIZ.length() > 0) {
            strJ4 = C786410Ut5.j4(strLIZ, Arrays.copyOf(new Object[]{strLIZ2}, 1));
        }
        if (!C500260Jjc.LJJIIZ(strJ4)) {
            return ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).context().getString(2131852795);
        }
        return strJ4;
    }

    @Override // X.InterfaceC774140UYi
    public final void LIZIZ(DataChannel dataChannel) {
        if (LIZIZ) {
            LJIILJJIL(dataChannel, "cancel");
        }
    }

    @Override // X.InterfaceC774140UYi
    public final void LJ(DataChannel dataChannel) {
        boolean z;
        GameGuessToastMessage gameGuessToastMessageLJJIIJZLJL;
        List<String> listLJIJJLI;
        InterfaceC753440Th0 interfaceC753440Th0 = (InterfaceC753440Th0) C2659011d.LIZ(dataChannel, InterfaceC753440Th0.class);
        String str = null;
        if (interfaceC753440Th0 != null && (listLJIJJLI = interfaceC753440Th0.LJIJJLI()) != null && !listLJIJJLI.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        boolean z2 = !z;
        LIZIZ = z2;
        if (z2) {
            InterfaceC753440Th0 interfaceC753440Th02 = (InterfaceC753440Th0) C2659011d.LIZ(dataChannel, InterfaceC753440Th0.class);
            if (interfaceC753440Th02 != null && (gameGuessToastMessageLJJIIJZLJL = interfaceC753440Th02.LJJIIJZLJL()) != null) {
                str = gameGuessToastMessageLJJIIJZLJL.resultStarlingKey;
            }
            C500260Jjc.LJJIIZ(str);
        }
    }

    @Override // X.InterfaceC774140UYi
    public final InterfaceC517220KQe LJFF(final DataChannel dataChannel) {
        if (LIZIZ) {
            String string = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).context().getString(2131852803);
            C753460Th2 c753460Th2 = new C753460Th2();
            c753460Th2.LIZ = string;
            c753460Th2.LIZLLL = R.attr.ezq;
            c753460Th2.LJ = new InterfaceC753420Tgy() { // from class: X.0Tgi
                @Override // X.InterfaceC753420Tgy
                public final void LIZ(DialogInterface dialogInterface) {
                    GameGuessToastMessage gameGuessToastMessageLJJIIJZLJL;
                    String str;
                    C753430Tgz.LJIILJJIL(dataChannel, "submit");
                    if (dialogInterface != null) {
                        dialogInterface.dismiss();
                    }
                    InterfaceC753440Th0 interfaceC753440Th0 = (InterfaceC753440Th0) C2659011d.LIZ(dataChannel, InterfaceC753440Th0.class);
                    String str2 = null;
                    if (interfaceC753440Th0 != null) {
                        gameGuessToastMessageLJJIIJZLJL = interfaceC753440Th0.LJJIIJZLJL();
                        if (gameGuessToastMessageLJJIIJZLJL != null) {
                            str2 = gameGuessToastMessageLJJIIJZLJL.showOptionIdxStr;
                        }
                    } else {
                        gameGuessToastMessageLJJIIJZLJL = null;
                    }
                    String str3 = "";
                    if (str2 == null) {
                        str2 = "";
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (str2.length() > 0) {
                        linkedHashMap.put("show_option_idx", str2);
                        linkedHashMap.put("ui_auto_open_result_popup", "1");
                        if (gameGuessToastMessageLJJIIJZLJL != null && (str = gameGuessToastMessageLJJIIJZLJL.roundIdStr) != null) {
                            str3 = str;
                        }
                        linkedHashMap.put("round_id", str3);
                    }
                    linkedHashMap.put("open_page_time", String.valueOf(System.currentTimeMillis()));
                    C753430Tgz.LJIIL("end_live_popup", linkedHashMap, dataChannel, ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getTopActivity());
                    C753430Tgz.LIZIZ = false;
                }
            };
            return c753460Th2.LIZ();
        }
        return null;
    }

    @Override // X.InterfaceC774140UYi
    public final void LJI(DataChannel dataChannel) {
        if (LIZIZ) {
            LJIILJJIL(dataChannel, "show");
        }
    }

    @Override // X.InterfaceC774140UYi
    public final void LJII(DataChannel dataChannel) {
        GameGuessToastMessage gameGuessToastMessageLJJIIJZLJL;
        if (LIZIZ) {
            LJIILJJIL(dataChannel, "end");
            InterfaceC753440Th0 interfaceC753440Th0 = (InterfaceC753440Th0) C2659011d.LIZ(dataChannel, InterfaceC753440Th0.class);
            if (interfaceC753440Th0 != null && (gameGuessToastMessageLJJIIJZLJL = interfaceC753440Th0.LJJIIJZLJL()) != null) {
                C480460Ism.LIZ().getClass();
                GameRevenueRetrofitApi gameRevenueRetrofitApi = (GameRevenueRetrofitApi) C480460Ism.LIZLLL(GameRevenueRetrofitApi.class);
                InputAnswerRequest inputAnswerRequest = new InputAnswerRequest();
                inputAnswerRequest.roomIdStr = String.valueOf(C500260Jjc.LJJLIIIJ(dataChannel));
                inputAnswerRequest.roundIdStr = gameGuessToastMessageLJJIIJZLJL.roundIdStr;
                inputAnswerRequest.optionIdx = gameGuessToastMessageLJJIIJZLJL.optionIdStr;
                inputAnswerRequest.showEntrance = "end_live_dialog";
                gameRevenueRetrofitApi.inputGuessAnswer(inputAnswerRequest).LJFF(C0J1R.LIZJ(GameRevenueRetrofitApi.class)).LJJIIZ(new C09JN() { // from class: X.00Mp
                    @Override // X.C09JN
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                        C1C7U.LIZ("GuessBroadcastSideMgr@90cc.inputGuessAnswerEndLive$2");
                        C1C7U.LIZIZ("GuessBroadcastSideMgr@90cc.inputGuessAnswerEndLive$2");
                    }
                }, new C09JN() { // from class: X.00Jm
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("GuessBroadcastSideMgr@90cc.inputGuessAnswerEndLive$3");
                        Map<String, Object> map = C1338270kvh.LIZ;
                        C1C7U.LIZIZ("GuessBroadcastSideMgr@90cc.inputGuessAnswerEndLive$3");
                    }
                });
            }
        }
    }

    public static final boolean LJIIJ(DataChannel dataChannel, boolean z) {
        RoomAuthStatus roomAuthStatus;
        RoomCreateInfo roomCreateInfo;
        Boolean boolValueOf = null;
        if (z) {
            if (dataChannel != null && (roomCreateInfo = (RoomCreateInfo) dataChannel.gg0(RoomCreateInfoChannel.class)) != null) {
                boolValueOf = Boolean.valueOf(roomCreateInfo.hasGameGuessPermission);
            }
            return C500260Jjc.LJJJI(boolValueOf);
        }
        Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel);
        if (roomLJJLIIIIJ != null && (roomAuthStatus = roomLJJLIIIIJ.getRoomAuthStatus()) != null) {
            boolValueOf = Boolean.valueOf(roomAuthStatus.guessEntranceForHost);
        }
        return C500260Jjc.LJJJI(boolValueOf);
    }

    public static void LJIILJJIL(DataChannel dataChannel, String str) {
        String str2;
        String str3;
        Long lValueOf;
        List<String> listLJIJJLI;
        GameGuessToastMessage gameGuessToastMessageLJJIIJZLJL;
        InterfaceC753440Th0 interfaceC753440Th0 = (InterfaceC753440Th0) C2659011d.LIZ(dataChannel, InterfaceC753440Th0.class);
        Integer numLJIIJ = null;
        if (interfaceC753440Th0 != null && (gameGuessToastMessageLJJIIJZLJL = interfaceC753440Th0.LJJIIJZLJL()) != null) {
            str2 = gameGuessToastMessageLJJIIJZLJL.resultStarlingKey;
        } else {
            str2 = null;
        }
        if (Intrinsics.LJFF(str2, "ttlive_guessing_option_yes")) {
            str3 = "yes";
        } else if (Intrinsics.LJFF(str2, "ttlive_guessing_option_no")) {
            str3 = "no";
        } else {
            str3 = "";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_guessing_end_live_popup");
        c474500IjALIZ.LJJIJIIJI(Long.valueOf(C500260Jjc.LJJLIIIJ(dataChannel)));
        Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel);
        if (roomLJJLIIIIJ != null) {
            lValueOf = Long.valueOf(roomLJJLIIIIJ.getOwnerUserId());
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJI(lValueOf);
        c474500IjALIZ.LJJ(C500260Jjc.LJJJJJL(dataChannel));
        if (str3.length() > 0) {
            c474500IjALIZ.LJJII(str3, "result_suggestions");
        }
        InterfaceC753440Th0 interfaceC753440Th02 = (InterfaceC753440Th0) C2659011d.LIZ(dataChannel, InterfaceC753440Th0.class);
        if (interfaceC753440Th02 != null) {
            listLJIJJLI = interfaceC753440Th02.LJIJJLI();
        } else {
            listLJIJJLI = null;
        }
        c474500IjALIZ.LJJII(AnonymousClass0104.LIZLLL(listLJIJJLI), "round_id");
        InterfaceC753440Th0 interfaceC753440Th03 = (InterfaceC753440Th0) C2659011d.LIZ(dataChannel, InterfaceC753440Th0.class);
        if (interfaceC753440Th03 != null) {
            numLJIIJ = interfaceC753440Th03.LJIIJ();
        }
        c474500IjALIZ.LJJII(numLJIIJ, "total_viewers");
        c474500IjALIZ.LJ(str);
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIIL(java.lang.String r11, java.util.Map<java.lang.String, java.lang.String> r12, com.bytedance.ies.sdk.datachannel.DataChannel r13, android.content.Context r14) {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C753430Tgz.LJIIL(java.lang.String, java.util.Map, com.bytedance.ies.sdk.datachannel.DataChannel, android.content.Context):void");
    }

    public final void LJIILIIL(String str, Map<String, String> map, DataChannel dataChannel, Context context) {
        Boolean boolValueOf;
        if (dataChannel != null) {
            boolValueOf = Boolean.valueOf(C500260Jjc.LJIIZILJ(dataChannel));
        } else {
            boolValueOf = null;
        }
        if (!C500260Jjc.LJJJI(boolValueOf) && !LJIIJJI(dataChannel)) {
            Uri.Builder builderAppendQueryParameter = UriProtector.parse(C1152470g61.LIZ(dataChannel, false).userGuessing).buildUpon().appendQueryParameter("show_entrance", str);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("client_");
            sbLIZ.append(str);
            Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("source_entrance", C2188811AlT.LIZIZ(sbLIZ));
            for (Map.Entry entry : ((HashMap) map).entrySet()) {
                builderAppendQueryParameter2.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            String string = builderAppendQueryParameter2.build().toString();
            Map<String, Object> map2 = C1338270kvh.LIZ;
            ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(context, string, null);
            return;
        }
        LJIIL(str, map, dataChannel, context);
    }
}
