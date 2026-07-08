package X;

import Y.AcS21S0310000_12;
import Y.AfS181S0100000_12;
import Y.AfS2S1100100_12;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.broadcast.api.LiveCancelEndApi;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.broadcast.end.BroadcastPagePreloadSetting;
import com.bytedance.android.livesdk.chatroom.model.AnchorFinishCancelResponse;
import com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.NotifyGameRoomShowCloseDialogEvent;
import com.bytedance.android.livesdk.dataChannel.PerceptionDialogChannel;
import com.bytedance.android.livesdk.dataChannel.PunishInfoChannel;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostCancelEndDialogRequestServer;
import com.bytedance.android.livesdk.model.message.ControlMessage;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0UYG, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UYG {
    public final Room LIZ;
    public final Context LIZIZ;
    public final DataChannel LIZJ;
    public final Fragment LIZLLL;
    public final C0UZ4 LJ;
    public String LJFF;
    public boolean LJI;
    public boolean LJII;

    public final boolean LIZ() {
        return LiveMode.SCREEN_RECORD == this.LIZJ.gg0(LiveModeChannel.class);
    }

    public final void LIZJ(Cert cert) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("anchor_close_live_confirm");
        c474500IjALIZ.LJIJJLI(this.LIZJ);
        c474500IjALIZ.LJJII(C354201Zc.LIZ(this.LIZ.getStreamType()), "live_type");
        c474500IjALIZ.LIZ();
        InterfaceC772390URp.LLLZI.LJFF(Boolean.TRUE);
        this.LJ.uI(10001);
        this.LJ.Vf(1, cert);
        C773220UUu c773220UUu = C773220UUu.LIZ;
        AFwS245S0000000_12 aFwS245S0000000_12 = AFwS245S0000000_12.get$arr$(33);
        c773220UUu.getClass();
        C773220UUu.LJIIL(aFwS245S0000000_12);
        C924790aAn.LIZLLL().LJII(0);
    }

    public final void onEvent(C465900IOu c465900IOu) {
        String strLJIJI;
        int iIntValue;
        Intent hostSingleActivityIntent;
        int i = c465900IOu.LIZ;
        boolean z = false;
        int i2 = 1;
        if (i != 6) {
            String str = null;
            if (i != 7) {
                if (i != 8) {
                    if (i != 17) {
                        switch (i) {
                            case 45:
                                if (LIZ()) {
                                    this.LJ.Vf(64, CertProviderManagerKt.findCert("bpea-stoplive_click_tips", 1476788483));
                                    if (C500260Jjc.LJJIIZ(this.LJFF)) {
                                        C781270Ukn.LJFF().Zz1();
                                        Context context = this.LIZIZ;
                                        C784600UqA c784600UqA = new C784600UqA(this.LJFF);
                                        c784600UqA.LIZJ = true;
                                        c784600UqA.LIZIZ = C497740JfY.LJIJI(2131851333);
                                        C784610UqB.LIZIZ(context, c784600UqA);
                                        break;
                                    } else if (C504210Jpz.LIZ) {
                                        Context context2 = this.LIZIZ;
                                        if (context2 != null && (hostSingleActivityIntent = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getHostSingleActivityIntent(context2, 6)) != null) {
                                            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context2, hostSingleActivityIntent, "Context_startActivity_1");
                                            C1701330uNH.LIZ(hostSingleActivityIntent, context2);
                                            C2204961BRm.LJJJJJL(context2, hostSingleActivityIntent, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD/UIh/V6eBO3Ifp+Go5M31i4UoA9XR33zeCHwvM/aaIPpgc+9Q==", null));
                                            break;
                                        }
                                    } else {
                                        Context context3 = this.LIZIZ;
                                        if (context3 != null) {
                                            Intent intent = new Intent(this.LIZIZ, (Class<?>) ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getHostActivity(6));
                                            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context3, intent, "Context_startActivity_1");
                                            C1701330uNH.LIZ(intent, context3);
                                            C2204961BRm.LJJJJJL(context3, intent, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD/UIh/V6eBO3Ifp+Go5M31i4UoA9XR33zeCHwvM/aaIPpgc+9Q==", null));
                                        }
                                        break;
                                    }
                                }
                                break;
                            case 46:
                                if (LIZ()) {
                                    this.LJI = true;
                                }
                                break;
                            case 47:
                                if (LIZ()) {
                                    this.LJI = false;
                                }
                                break;
                        }
                        return;
                    }
                    this.LJ.uI(10001);
                    C773220UUu c773220UUu = C773220UUu.LIZ;
                    AFwS245S0000000_12 aFwS245S0000000_12 = AFwS245S0000000_12.get$arr$(32);
                    c773220UUu.getClass();
                    C773220UUu.LJIIL(aFwS245S0000000_12);
                    this.LJ.Vf(1, CertProviderManagerKt.findCert("bpea-802", 1476788483));
                    return;
                }
            } else {
                ControlMessage controlMessage = c465900IOu.LJ;
                if ((controlMessage instanceof ControlMessage) && controlMessage.action == 4) {
                    Text text = controlMessage.floatText;
                    if (text != null) {
                        str = text.defaultPattern;
                    }
                    this.LJ.Nz(C1133830fbx.LJIILIIL(text, str).toString(), controlMessage.punishInfo, controlMessage.floatStyle);
                    ControlMessage.Extra extra = controlMessage.extraInfo;
                    if (extra != null) {
                        this.LJFF = extra.banInfoUrl;
                        C1133830fbx.LJIILIIL(extra.title, "");
                        C1133830fbx.LJIILIIL(extra.violationReason, "");
                        C1133830fbx.LJIILIIL(extra.illegalText, "");
                    }
                    if (LIZ() && this.LJI) {
                        z = true;
                    }
                    if (C500260Jjc.LJJIIZ(this.LJFF) && !z) {
                        C781270Ukn.LJFF().Zz1();
                        Context context4 = this.LIZIZ;
                        C784600UqA c784600UqA2 = new C784600UqA(this.LJFF);
                        c784600UqA2.LIZJ = true;
                        c784600UqA2.LIZIZ = C497740JfY.LJIJI(2131851333);
                        C784610UqB.LIZIZ(context4, c784600UqA2);
                    }
                    PerceptionDialogInfo perceptionDialogInfo = controlMessage.perceptionDialogInfo;
                    if (perceptionDialogInfo != null) {
                        DataChannelGlobal.LLILZ.HQ2(PerceptionDialogChannel.class, perceptionDialogInfo);
                    }
                    PunishEventInfo punishEventInfo = controlMessage.punishInfo;
                    if (punishEventInfo != null) {
                        DataChannelGlobal.LLILZ.HQ2(PunishInfoChannel.class, punishEventInfo);
                    }
                    this.LJ.uI(10003);
                    C773220UUu c773220UUu2 = C773220UUu.LIZ;
                    AFwS245S0000000_12 aFwS245S0000000_122 = AFwS245S0000000_12.get$arr$(31);
                    c773220UUu2.getClass();
                    C773220UUu.LJIIL(aFwS245S0000000_122);
                    i2 = 32;
                } else {
                    this.LJ.uI(c465900IOu.LIZIZ);
                    C773220UUu c773220UUu3 = C773220UUu.LIZ;
                    AwS591S0100000_12 awS591S0100000_12 = new AwS591S0100000_12(c465900IOu, 183);
                    c773220UUu3.getClass();
                    C773220UUu.LJIIL(awS591S0100000_12);
                }
                this.LJ.Vf(i2, CertProviderManagerKt.findCert("bpea-579", 1476788483));
                return;
            }
        }
        if (this.LIZIZ == null) {
            return;
        }
        if (this.LIZ.getId() != 0) {
            C15CY.LJIJJLI(this.LIZ.getId());
        }
        DataChannelGlobal.LLILZ.GQ2(NotifyGameRoomShowCloseDialogEvent.class);
        if (C0UQK.LJ(this.LIZIZ, this.LIZJ, new C774280UYw(this), new C774060UYa(this), new C0UZG(this))) {
            return;
        }
        Integer num = (Integer) this.LIZJ.gg0(C0UZS.class);
        if (num != null && (iIntValue = num.intValue()) > 0) {
            strLJIJI = C497740JfY.LJIIL(2131755504, iIntValue, Integer.valueOf(iIntValue));
        } else {
            strLJIJI = C497740JfY.LJIJI(2131840965);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C01GW<C0UVW> c01gw = C0UVW.LIZIZ;
        C01QD.LIZ().LIZ().getAnchorPreFinish(this.LIZ.getId()).LJIILIIL(C0J1R.LIZIZ(this.LIZLLL)).LJIILIIL(new C0UO0()).LJJLL(new AfS2S1100100_12(jCurrentTimeMillis, this, strLJIJI, 1), new AfS2S1100100_12(jCurrentTimeMillis, this, strLJIJI, 2));
    }

    public static void LJ(long j, long j2) {
        C11NZ<C470590Icr<AnchorFinishCancelResponse>> c11nzPostLiveCancelEndDialog;
        if (LiveHostCancelEndDialogRequestServer.getEnable()) {
            C01GW<C0UVW> c01gw = C0UVW.LIZIZ;
            C0UVW c0uvwLIZ = C01QD.LIZ();
            c0uvwLIZ.getClass();
            LiveCancelEndApi liveCancelEndApi = (LiveCancelEndApi) c0uvwLIZ.LIZJ(LiveCancelEndApi.class);
            if (liveCancelEndApi != null && (c11nzPostLiveCancelEndDialog = liveCancelEndApi.postLiveCancelEndDialog(j, j2)) != null) {
                c11nzPostLiveCancelEndDialog.LJL(C11S5.LIZ()).LJJLJ();
            }
        }
    }

    public final void LIZIZ(int i, boolean z) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("anchor_close_live_cancel");
        c474500IjALIZ.LJIJJLI(this.LIZJ);
        c474500IjALIZ.LJJII(C354201Zc.LIZ(this.LIZ.getStreamType()), "live_type");
        if (z) {
            if (i != 5) {
                if (i == 6) {
                    c474500IjALIZ.LJJII("high_subscribers", "sub_only_live_strategy");
                }
            } else {
                c474500IjALIZ.LJJII("high_acu", "sub_only_live_strategy");
            }
        }
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0), "has_sub_only_live");
        c474500IjALIZ.LIZ();
        InterfaceC772390URp.LLLZI.LJFF(Boolean.FALSE);
    }

    public final void LIZLLL(int i, boolean z) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("anchor_close_live_popup");
        c474500IjALIZ.LJIJJLI(this.LIZJ);
        c474500IjALIZ.LJJII(C354201Zc.LIZ(this.LIZ.getStreamType()), "live_type");
        if (z) {
            if (i != 5) {
                if (i == 6) {
                    c474500IjALIZ.LJJII("high_subscribers", "sub_only_live_strategy");
                }
            } else {
                c474500IjALIZ.LJJII("high_acu", "sub_only_live_strategy");
            }
        }
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0), "has_sub_only_live");
        c474500IjALIZ.LIZ();
    }

    public C0UYG(Room room, Context context, DataChannel dataChannel, Fragment fragment, C0UZ4 c0uz4) {
        this.LIZ = room;
        this.LIZIZ = context;
        this.LIZJ = dataChannel;
        this.LIZLLL = fragment;
        this.LJ = c0uz4;
        ((C0J1N) C784440Upu.LIZ().LJ(C465900IOu.class).LJIILIIL(C0J1R.LIZIZ(fragment)).LIZJ(C11RD.LIZLLL(fragment))).LIZJ(new AfS181S0100000_12(this, 58));
    }

    public final void LJFF(String str, long j, boolean z, final Integer num, final Map<String, String> map, long j2, final AnchorPreFinishData anchorPreFinishData) {
        int iIntValue;
        C782110Um9 c782110Um9;
        int iIntValue2;
        String str2;
        AnchorPreFinishData.ConfirmBox confirmBox;
        int iIntValue3;
        if (this.LJII || this.LIZIZ == null) {
            return;
        }
        this.LJII = true;
        ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).ei().getClass();
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        final boolean zLIZJ = C516680KOc.LIZJ(iIntValue);
        this.LJ.rA().LJ(this.LIZJ);
        String strLIZLLL = this.LJ.rA().LIZLLL();
        String strLIZ = this.LJ.rA().LIZ(this.LIZJ);
        if (strLIZ == null) {
            strLIZ = str;
        }
        String strLJIIIIZZ = this.LJ.rA().LJIIIIZZ();
        if (strLJIIIIZZ == null) {
            strLJIIIIZZ = this.LIZIZ.getString(2131840967);
        }
        String strLIZJ = this.LJ.rA().LIZJ();
        if (strLIZJ == null) {
            strLIZJ = this.LIZIZ.getString(2131840966);
        }
        InterfaceC517220KQe interfaceC517220KQeLJFF = this.LJ.rA().LJFF(this.LIZJ);
        C782110Um9 c782110Um92 = new C782110Um9(this.LIZIZ);
        c782110Um92.LIZJ = strLIZLLL;
        c782110Um92.LJIIIZ(strLIZ);
        c782110Um92.LJIILL = false;
        c782110Um92.LJIILJJIL(strLJIIIIZZ, new AcS21S0310000_12(this, (C0UYG) num, (Integer) zLIZJ, (boolean) map, (Map<String, String>) 0));
        c782110Um92.LJIIJJI(strLIZJ, new InterfaceC743640TFa() { // from class: X.0UYI
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog) {
                int iIntValue4;
                String strLIZ2;
                long j3;
                C0UYG c0uyg = this.LIZ;
                c0uyg.LJII = false;
                boolean z2 = zLIZJ;
                Integer num2 = num;
                if (num2 != null) {
                    iIntValue4 = num2.intValue();
                } else {
                    iIntValue4 = 0;
                }
                c0uyg.LIZIZ(iIntValue4, z2);
                liveDialog.dismiss();
                Integer num3 = num;
                if (num3 != null && num3.intValue() == 4) {
                    C781270Ukn.LJIJJLI().Tn1(0);
                }
                if (BroadcastPagePreloadSetting.INSTANCE.enable()) {
                    C782630Umz.LIZ();
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_close_live_dialog_click");
                c474500IjALIZ.LJIJJLI(this.LIZ.LIZJ);
                LiveMode streamType = this.LIZ.LIZ.getStreamType();
                if (streamType != null) {
                    strLIZ2 = C354201Zc.LIZ(streamType);
                } else {
                    strLIZ2 = null;
                }
                c474500IjALIZ.LJJ(strLIZ2);
                c474500IjALIZ.LJJII("cancel", "click_type");
                c474500IjALIZ.LJJII(num, "popup_type");
                c474500IjALIZ.LJJIIZI(map);
                c474500IjALIZ.LIZ();
                this.LIZ.LJ.rA().LIZIZ(this.LIZ.LIZJ);
                this.LIZ.LJ.rA().LJIIIZ();
                long id = this.LIZ.LIZ.getId();
                AnchorPreFinishData anchorPreFinishData2 = anchorPreFinishData;
                if (anchorPreFinishData2 != null) {
                    j3 = anchorPreFinishData2.suggestionTemplateId;
                } else {
                    j3 = -1;
                }
                C0UYG.LJ(id, j3);
            }
        });
        c782110Um92.LJIJI = new DialogInterface.OnCancelListener() { // from class: X.0UYN
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                long j3;
                this.LL.LJII = false;
                Integer num2 = num;
                if (num2 != null && num2.intValue() == 4) {
                    C781270Ukn.LJIJJLI().Tn1(2);
                }
                if (BroadcastPagePreloadSetting.INSTANCE.enable()) {
                    C782630Umz.LIZ();
                }
                this.LL.LJ.rA().LIZIZ(this.LL.LIZJ);
                this.LL.LJ.rA().LJIIIZ();
                long id = this.LL.LIZ.getId();
                AnchorPreFinishData anchorPreFinishData2 = anchorPreFinishData;
                if (anchorPreFinishData2 != null) {
                    j3 = anchorPreFinishData2.suggestionTemplateId;
                } else {
                    j3 = -1;
                }
                C0UYG.LJ(id, j3);
            }
        };
        c782110Um92.LJIJ = new DialogInterfaceOnDismissListenerC786080UsY(this, 6);
        c782110Um92.LJIJJ = interfaceC517220KQeLJFF;
        if (zLIZJ) {
            ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).ei().getClass();
            int i = (int) j2;
            if (num != null) {
                iIntValue3 = num.intValue();
            } else {
                iIntValue3 = 0;
            }
            c782110Um9 = c782110Um92;
            C516680KOc.LIZLLL(c782110Um9, i, iIntValue3, this.LIZJ, false);
        } else {
            c782110Um9 = c782110Um92;
            zLIZJ = false;
        }
        LiveDialog liveDialogLIZ = c782110Um9.LIZ();
        String strLIZ2 = null;
        if (num != null && num.intValue() == 17) {
            C753460Th2 c753460Th2 = new C753460Th2();
            Context context = this.LIZIZ;
            if (anchorPreFinishData != null && (confirmBox = anchorPreFinishData.confirmBox) != null) {
                str2 = confirmBox.schemaTitle;
            } else {
                str2 = null;
            }
            if (context != null) {
                c753460Th2.LIZ = str2;
            }
            c753460Th2.LIZJ = ColorStateList.valueOf(C20736316Cj.LIZIZ(R.attr.f00, context));
            c753460Th2.LJ = new InterfaceC753420Tgy() { // from class: X.0UYK
                @Override // X.InterfaceC753420Tgy
                public final void LIZ(DialogInterface dialogInterface) {
                    String strLIZ3;
                    AnchorPreFinishData.ConfirmBox confirmBox2;
                    String str3;
                    AnchorPreFinishData anchorPreFinishData2 = anchorPreFinishData;
                    if (anchorPreFinishData2 != null && (confirmBox2 = anchorPreFinishData2.confirmBox) != null && (str3 = confirmBox2.schemaJumpLink) != null) {
                        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(this.LIZIZ, str3);
                    }
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_close_live_dialog_click");
                    c474500IjALIZ.LJIJJLI(this.LIZJ);
                    LiveMode streamType = this.LIZ.getStreamType();
                    if (streamType != null) {
                        strLIZ3 = C354201Zc.LIZ(streamType);
                    } else {
                        strLIZ3 = null;
                    }
                    c474500IjALIZ.LJJ(strLIZ3);
                    c474500IjALIZ.LJJII("click_link", "click_type");
                    c474500IjALIZ.LJJII(num, "popup_type");
                    c474500IjALIZ.LJJIIZI(map);
                    c474500IjALIZ.LIZ();
                    dialogInterface.dismiss();
                }
            };
            liveDialogLIZ.LJLILLLLZI(new C753450Th1(c753460Th2));
        }
        C786410Ut5.E4(liveDialogLIZ);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_close_live_dialog_show");
        c474500IjALIZ.LJIJJLI(this.LIZJ);
        LiveMode streamType = this.LIZ.getStreamType();
        if (streamType != null) {
            strLIZ2 = C354201Zc.LIZ(streamType);
        }
        c474500IjALIZ.LJJ(strLIZ2);
        c474500IjALIZ.LJJII(num, "popup_type");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
        if (BroadcastPagePreloadSetting.INSTANCE.enable()) {
            C782630Umz.LIZIZ();
            C782630Umz.LIZJ();
        }
        if (num != null) {
            iIntValue2 = num.intValue();
        } else {
            iIntValue2 = 0;
        }
        LIZLLL(iIntValue2, zLIZJ);
        this.LJ.rA().LJI(this.LIZJ);
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() - j);
        C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_close_live_duration", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_0()));
        c474500IjALIZIZ.LJIJJLI(this.LIZJ);
        c474500IjALIZIZ.LJJII(Integer.valueOf(iCurrentTimeMillis), "duration");
        c474500IjALIZIZ.LJJII(Integer.valueOf(z ? 1 : 0), "request_succeed");
        c474500IjALIZIZ.LIZ();
    }
}
