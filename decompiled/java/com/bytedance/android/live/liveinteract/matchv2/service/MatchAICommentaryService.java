package com.bytedance.android.live.liveinteract.matchv2.service;

import X.C01GW;
import X.C0UO0;
import X.C1300300jwS;
import X.C163000js;
import X.C20337914i1;
import X.C20441214yg;
import X.C2188811AlT;
import X.C452501pT;
import X.C480460Ism;
import X.C497740JfY;
import X.C500260Jjc;
import X.C766270U4b;
import X.C782110Um9;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C917350Zyn;
import X.C930940aKi;
import X.C973660bRc;
import X.C980380bcS;
import X.C980450bcZ;
import X.C980480bcc;
import X.C980510bcf;
import X.C980540bci;
import X.C980550bcj;
import X.C980890bdH;
import X.DialogInterfaceOnCancelListenerC986960bn4;
import X.EnumC919170a1j;
import X.EnumC944810ah5;
import X.EnumC980440bcY;
import X.EnumC980460bca;
import X.EnumC980470bcb;
import X.InterfaceC1106030et7;
import X.InterfaceC743640TFa;
import X.InterfaceC954180awC;
import X.InterfaceC973730bRj;
import X.InterfaceC975810bV5;
import X.InterfaceC980560bck;
import Y.AcS496S0100000_15;
import Y.AfS151S0200000_15;
import Y.AfS184S0100000_15;
import android.content.Context;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.match.business.event.BattleAICommentaryNoticeEvent;
import com.bytedance.android.live.liveinteract.match.service.ILiveMatchService;
import com.bytedance.android.live.liveinteract.match.service.IMatchAICommentaryService;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.userservice.UserApi;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.AnchorMatchSettings;
import com.bytedance.android.livesdkapi.depend.model.live.match.MatchSettingsInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public class MatchAICommentaryService implements IMatchAICommentaryService {
    public final C01GW LL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(49));

    public static boolean LIZ() {
        Map<Long, AnchorMatchSettings> mapLJII;
        AnchorMatchSettings anchorMatchSettings;
        User owner;
        C980510bcf c980510bcf = EnumC980460bca.Companion;
        Long l = (Long) DataChannelGlobal.LLILZ.gg0(C980550bcj.class);
        c980510bcf.getClass();
        boolean zIsOn = C980510bcf.LIZ(l).isOn();
        Room roomLJJLI = C500260Jjc.LJJLI();
        long id = (roomLJJLI == null || (owner = roomLJJLI.getOwner()) == null) ? 0L : owner.getId();
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        boolean z = (interfaceC973730bRjYf2 == null || (mapLJII = interfaceC973730bRjYf2.LJII()) == null || (anchorMatchSettings = mapLJII.get(Long.valueOf(id))) == null || !anchorMatchSettings.enableAiCommentary) ? false : true;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isAICommentaryTurnOnForAudience: anchorId: ");
        sbLIZ.append(id);
        sbLIZ.append(", isSettingSwitchOn ");
        sbLIZ.append(zIsOn);
        sbLIZ.append(", anchorEnableAICommentary ");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("MatchAICommentaryService", C2188811AlT.LIZIZ(sbLIZ));
        return SettingsManager.INSTANCE.getBooleanValue("live_match_ai_commentary_audience_enable", false) && zIsOn && z;
    }

    @Override // com.bytedance.android.live.liveinteract.match.service.IMatchAICommentaryService
    public final void Gs0() {
        boolean zJ8 = C915980Zwa.LIZLLL().J8();
        boolean zCo0 = C915980Zwa.LJFF().co0();
        boolean zLIZ = LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateUserOptOutSetting: isAnchor ");
        sbLIZ.append(zJ8);
        sbLIZ.append(", isInMatch：");
        sbLIZ.append(zCo0);
        sbLIZ.append(", isAudienceOn ");
        sbLIZ.append(zLIZ);
        sbLIZ.append(", dataChannel ");
        C1300300jwS.LIZ.getClass();
        sbLIZ.append(C1300300jwS.LJFF != null);
        C20441214yg.LJIIIZ("MatchAICommentaryService", C2188811AlT.LIZIZ(sbLIZ));
        if (!zJ8 && zCo0 && zLIZ) {
            DataChannel dataChannel = C1300300jwS.LJFF;
            if (dataChannel != null) {
                dataChannel.LC0(BattleAICommentaryNoticeEvent.class, new C980890bdH(false, true));
            }
            IY0(C1300300jwS.LJFF);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.match.service.IMatchAICommentaryService
    public final boolean IP1() {
        MatchSettingsInfo matchSettingsInfoLJJ;
        InterfaceC975810bV5 interfaceC975810bV5LIZLLL = C915980Zwa.LJI().LIZLLL();
        return (interfaceC975810bV5LIZLLL == null || (matchSettingsInfoLJJ = interfaceC975810bV5LIZLLL.LJJ()) == null || !matchSettingsInfoLJJ.enableMatchHistoryDataShare) ? false : true;
    }

    @Override // com.bytedance.android.live.liveinteract.match.service.IMatchAICommentaryService
    public final boolean jG() {
        boolean zLIZ;
        InterfaceC975810bV5 interfaceC975810bV5LIZLLL;
        MatchSettingsInfo matchSettingsInfoLJJ;
        boolean zJ8 = C915980Zwa.LIZLLL().J8();
        if (zJ8) {
            zLIZ = false;
            if (C163000js.LIZ() && (interfaceC975810bV5LIZLLL = C915980Zwa.LJI().LIZLLL()) != null && (matchSettingsInfoLJJ = interfaceC975810bV5LIZLLL.LJJ()) != null && matchSettingsInfoLJJ.enableAiCommentary) {
                zLIZ = true;
            }
        } else {
            zLIZ = LIZ();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isAICommentaryTurnOn: isAnchor ");
        sbLIZ.append(zJ8);
        sbLIZ.append(", turnOn ");
        sbLIZ.append(zLIZ);
        C20441214yg.LIZIZ("MatchAICommentaryService", C2188811AlT.LIZIZ(sbLIZ));
        return zLIZ;
    }

    @Override // com.bytedance.android.live.liveinteract.match.service.IMatchAICommentaryService
    public final void IY0(DataChannel dataChannel) {
        C20337914i1<Integer> c20337914i1 = InterfaceC1106030et7.L4;
        if (c20337914i1.LIZIZ().intValue() <= 0 && jG()) {
            c20337914i1.LJFF(Integer.valueOf(c20337914i1.LIZIZ().intValue() + 1));
            C766270U4b.LIZLLL(2131853704);
            C973660bRc.LIZ.LJJJJLI(dataChannel, "turn_on_during_match");
        }
    }

    @Override // com.bytedance.android.live.liveinteract.match.service.IMatchAICommentaryService
    public final void b0(boolean z) {
        InterfaceC954180awC interfaceC954180awCLJIIIZ;
        boolean zJ8 = C915980Zwa.LIZLLL().J8();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MatchAICommentaryService enableAIExplanationTask: enable ");
        sbLIZ.append(z);
        sbLIZ.append(" isAnchor ");
        sbLIZ.append(zJ8);
        C20441214yg.LJIIIZ("MatchAICommentaryService", C2188811AlT.LIZIZ(sbLIZ));
        if (zJ8 && (interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ()) != null) {
            interfaceC954180awCLJIIIZ.b0(z);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.match.service.IMatchAICommentaryService
    public final void Jr0(C980540bci c980540bci, InterfaceC980560bck interfaceC980560bck) {
        C480460Ism.LIZ().getClass();
        ((UserApi) C480460Ism.LIZLLL(UserApi.class)).updateSwitch(23L, c980540bci.LIZIZ.getValue()).LJIILIIL(new C0UO0()).LJJLL(new AfS151S0200000_15(c980540bci, interfaceC980560bck, 31), new AfS184S0100000_15(interfaceC980560bck, 108));
    }

    @Override // com.bytedance.android.live.liveinteract.match.service.IMatchAICommentaryService
    public final void O92(DataChannel dataChannel, String str) {
        Long lValueOf;
        String string;
        List<Long> list;
        String str2;
        InterfaceC973730bRj interfaceC973730bRjYf2;
        C973660bRc c973660bRc = C973660bRc.LIZ;
        HashMap map = new HashMap();
        boolean zLJJJJ = C973660bRc.LJJJJ();
        map.put(C973660bRc.LJJII, "user");
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        if (room != null) {
            map.put(C973660bRc.LIZJ, String.valueOf(room.getOwnerUserId()));
            map.put(C973660bRc.LJFF, room.getIdStr());
        }
        String str3 = C973660bRc.LJ;
        InterfaceC973730bRj interfaceC973730bRjYf22 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf22 != null) {
            lValueOf = Long.valueOf(interfaceC973730bRjYf22.LJJL());
        } else {
            lValueOf = null;
        }
        map.put(str3, String.valueOf(lValueOf));
        String str4 = C973660bRc.LJIILJJIL;
        ILiveMatchService iLiveMatchServiceLJFF = C915980Zwa.LJFF();
        String str5 = CardStruct.IStatusCode.DEFAULT;
        if (iLiveMatchServiceLJFF == null || (interfaceC973730bRjYf2 = iLiveMatchServiceLJFF.yf2(false)) == null || (string = Long.valueOf(interfaceC973730bRjYf2.LJJJJJL()).toString()) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        map.put(str4, string);
        map.put("live_status", C915980Zwa.LIZLLL().pY0(dataChannel));
        String strLIZIZ = (String) ((LinkedHashMap) C973660bRc.LJLJLLL).get("sub_match_type");
        if (strLIZIZ == null) {
            C917350Zyn c917350Zyn = EnumC919170a1j.Companion;
            EnumC919170a1j enumC919170a1jXB0 = C915980Zwa.LJFF().xB0();
            int size = C915980Zwa.LJII().LLILZLL(true).size();
            c917350Zyn.getClass();
            strLIZIZ = C917350Zyn.LIZIZ(enumC919170a1jXB0, size);
        }
        String str6 = C973660bRc.LJI;
        if (zLJJJJ) {
            list = C973660bRc.LJLLLL;
        } else {
            list = C973660bRc.LJLLL;
        }
        map.put(str6, String.valueOf(list.size()));
        map.put("action", str);
        if (Intrinsics.LJFF(str, "show") || Intrinsics.LJFF(str, "close")) {
            C980510bcf c980510bcf = EnumC980460bca.Companion;
            Long l = (Long) dataChannelGlobal.gg0(C980550bcj.class);
            c980510bcf.getClass();
            if (C980510bcf.LIZ(l).isOn()) {
                str2 = "on";
            } else {
                str2 = "off";
            }
            map.put("switch_status", str2);
        }
        if (zLJJJJ) {
            str5 = "1";
        }
        c973660bRc.LJLLLLLL("livesdk_pk_ai_comment_setting_page", str5, EnumC944810ah5.MANUAL_PK.getType(), strLIZIZ, map);
    }

    @Override // com.bytedance.android.live.liveinteract.match.service.IMatchAICommentaryService
    public final void PM2(DataChannel dataChannel, EnumC980470bcb enumC980470bcb, Function1<? super Boolean, Unit> function1) {
        boolean zJ8 = C915980Zwa.LIZLLL().J8();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("turnOffAICommentary: isAnchor ");
        sbLIZ.append(zJ8);
        sbLIZ.append(", scene ");
        sbLIZ.append(enumC980470bcb.name());
        C20441214yg.LJIIIZ("MatchAICommentaryService", C2188811AlT.LIZIZ(sbLIZ));
        if (zJ8) {
            LIZIZ(false, EnumC980440bcY.AI_COMMENTARY, function1, enumC980470bcb, dataChannel);
        } else {
            LIZJ(false, function1, dataChannel, enumC980470bcb);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.match.service.IMatchAICommentaryService
    public final void Z62(DataChannel dataChannel, EnumC980470bcb enumC980470bcb, AFwS250S0000000_15 aFwS250S0000000_15) {
        boolean zJ8 = C915980Zwa.LIZLLL().J8();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("turnOnAICommentary: isAnchor ");
        sbLIZ.append(zJ8);
        sbLIZ.append(", scene ");
        sbLIZ.append(enumC980470bcb.name());
        C20441214yg.LJIIIZ("MatchAICommentaryService", C2188811AlT.LIZIZ(sbLIZ));
        if (zJ8) {
            LIZIZ(true, EnumC980440bcY.AI_COMMENTARY, aFwS250S0000000_15, enumC980470bcb, dataChannel);
        } else {
            LIZJ(true, aFwS250S0000000_15, dataChannel, enumC980470bcb);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.match.service.IMatchAICommentaryService
    public final void iE1(boolean z, DataChannel dataChannel, EnumC980470bcb enumC980470bcb) {
        boolean z2;
        boolean zJ8 = C915980Zwa.LIZLLL().J8();
        boolean zLIZ = LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("triggerUpdateAICommentaryStatus: isAnchor: ");
        sbLIZ.append(zJ8);
        sbLIZ.append(", isEnable ");
        sbLIZ.append(z);
        sbLIZ.append(", isAudienceOn ");
        sbLIZ.append(zLIZ);
        sbLIZ.append(", scene ");
        sbLIZ.append(enumC980470bcb.name());
        sbLIZ.append(", dataChannel ");
        if (dataChannel != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        sbLIZ.append(z2);
        C20441214yg.LJIIIZ("MatchAICommentaryService", C2188811AlT.LIZIZ(sbLIZ));
        b0(z);
        if (dataChannel != null) {
            if (zJ8) {
                zLIZ = z;
            }
            dataChannel.LC0(BattleAICommentaryNoticeEvent.class, new C980890bdH(zJ8, zLIZ));
        }
        switch (C980480bcc.LIZ[enumC980470bcb.ordinal()]) {
            case 1:
                if (z) {
                    C766270U4b.LIZLLL(2131853713);
                    C973660bRc.LIZ.LJJJJLI(dataChannel, "turn_on_before_match");
                }
                break;
            case 2:
            case 3:
                if (z) {
                    C766270U4b.LIZLLL(2131853704);
                    C973660bRc.LIZ.LJJJJLI(dataChannel, "turn_on_during_match");
                }
                break;
            case 4:
                if (!z) {
                    C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131853693));
                    C973660bRc.LIZ.LJJJJLI(dataChannel, "creator_turn_off");
                }
                break;
            case 5:
                if (!z) {
                    if (zJ8) {
                        C766270U4b.LIZLLL(2131853693);
                        C973660bRc.LIZ.LJJJJLI(dataChannel, "turn_off");
                    } else {
                        C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131853703));
                        C973660bRc.LIZ.LJJJJLI(dataChannel, "user_turn_off");
                    }
                }
                break;
            case 6:
                if (!z) {
                    C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131853703));
                    C973660bRc.LIZ.LJJJJLI(dataChannel, "user_turn_off");
                }
                break;
        }
    }

    public final void LIZJ(boolean z, final Function1<? super Boolean, Unit> function1, DataChannel dataChannel, EnumC980470bcb enumC980470bcb) {
        EnumC980460bca enumC980460bca;
        if (z) {
            enumC980460bca = EnumC980460bca.ON;
        } else {
            enumC980460bca = EnumC980460bca.OFF;
        }
        Jr0(new C980540bci(dataChannel, enumC980460bca, enumC980470bcb), new InterfaceC980560bck() { // from class: X.0bce
            @Override // X.InterfaceC980560bck
            public final void onSuccess() {
                function1.invoke(Boolean.TRUE);
            }

            @Override // X.InterfaceC980560bck
            public final void onError(String str) {
                function1.invoke(Boolean.FALSE);
            }
        });
    }

    public final void LIZIZ(boolean z, EnumC980440bcY enumC980440bcY, Function1<? super Boolean, Unit> function1, EnumC980470bcb enumC980470bcb, DataChannel dataChannel) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestAnchorFeatureSwitch: enable ");
        sbLIZ.append(z);
        sbLIZ.append(", scene ");
        sbLIZ.append(enumC980470bcb.name());
        sbLIZ.append(", feature ");
        sbLIZ.append(enumC980440bcY.name());
        C20441214yg.LJIIIZ("MatchAICommentaryService", C2188811AlT.LIZIZ(sbLIZ));
        ((C980380bcS) this.LL.getValue()).LIZ(enumC980440bcY.getSwitchType(), z ? 1 : 0, new C980450bcZ(enumC980440bcY, this, z, function1, dataChannel, enumC980470bcb), new AwS381S0200000_15(enumC980440bcY, (EnumC980440bcY) function1, (Function1<? super Boolean, Unit>) 31));
    }

    @Override // com.bytedance.android.live.liveinteract.match.service.IMatchAICommentaryService
    public final void me1(Context context, String str, String str2, String str3, String str4, Function0<Unit> function0, Function0<Unit> function02) {
        C782110Um9 c782110Um9 = new C782110Um9(context);
        c782110Um9.LIZJ = str;
        c782110Um9.LJIIIZ(str2);
        c782110Um9.LJIILL = false;
        c782110Um9.LJIILJJIL(str3, new AcS496S0100000_15(function0, 14));
        c782110Um9.LJIIJJI(str4, new InterfaceC743640TFa() { // from class: X.0bcg
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog) {
                liveDialog.cancel();
            }
        });
        c782110Um9.LJIJI = new DialogInterfaceOnCancelListenerC986960bn4(function02, 5);
        C786410Ut5.E4(c782110Um9.LIZ());
    }
}
