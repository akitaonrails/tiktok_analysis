package X;

import Y.AfS181S0100000_12;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.share.ShareApi;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.IBarrageService;
import com.bytedance.android.livesdk.broadcast.interaction.function.LiveHostLongPressSheet;
import com.bytedance.android.livesdk.dataChannel.ShareJoinInGoodyBag;
import com.bytedance.android.livesdk.game.broadcast.speeddetector.GamePreparationNetworkSpeedDetectionDialog;
import com.bytedance.android.livesdk.game.chatroom.ui.GamePreparationFragment;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterMockToolSwitch;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostSettingsUIConfig;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostShare;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ush, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C786170Ush implements InterfaceC781210Ukh {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC781210Ukh
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
        }
    }

    public static final void run$0(C786170Ush c786170Ush) {
        C20441214yg.LJIIIZ("PreviewGameContentHelper", "dispose");
        C11JL c11jl = ((C0UP8) c786170Ush.l0).LJIIJJI;
        if (c11jl != null) {
            c11jl.dispose();
        }
        if (!TextUtils.isEmpty(((C0UP8) c786170Ush.l0).LJIIL)) {
            C0UP8 c0up8 = (C0UP8) c786170Ush.l0;
            c0up8.LJIIJJI = (C11JL) c0up8.LJIIIZ.LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS181S0100000_12((C0UP8) c786170Ush.l0, 15), new C09JN() { // from class: X.0UP7
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("PreviewGameContentHelper@6577.init$2$2");
                    C1C7U.LIZIZ("PreviewGameContentHelper@6577.init$2$2");
                }
            });
        }
    }

    public static final void run$1(C786170Ush c786170Ush) {
        T t = ((C0UVT) c786170Ush.l0).mView;
        if (t != 0) {
            ((C0UVU) t).Lj(C497740JfY.LJIJI(2131853431), true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [X.0IuB, X.0lp5] */
    public static final void run$2(C786170Ush c786170Ush) {
        boolean z;
        final C781010UkN c781010UkN = (C781010UkN) c786170Ush.l0;
        Context context = c781010UkN.LIZLLL;
        if (context != null) {
            Room room = c781010UkN.LIZ;
            C1106200etO c1106200etOLJII = C481180Itw.LJII(room, c781010UkN.LJ, C481180Itw.LIZIZ(room.getOwner()), "live_room_long_press", null);
            c1106200etOLJII.LJJIIJZLJL = false;
            c1106200etOLJII.LJJIIZ = false;
            Room room2 = c781010UkN.LIZ;
            if (room2.liveSubOnly == 1) {
                z = true;
            } else {
                z = false;
            }
            c1106200etOLJII.LJJIIZI = z;
            c1106200etOLJII.LJJIJ = room2.visibleScopeType;
            c1106200etOLJII.LJIJJ = room2.getOwner().getSecUid();
            c1106200etOLJII.LJJLIIIJILLIZJL = LiveHostSettingsUIConfig.enable();
            C1322480kWE c1322480kWECopyOf = C1322480kWE.copyOf((List) c781010UkN.LJI.LIZ);
            if (c1322480kWECopyOf != null && !c1322480kWECopyOf.isEmpty()) {
                ((ArrayList) c1106200etOLJII.LJJIJIIJIL).addAll(c1322480kWECopyOf);
            }
            C1322480kWE c1322480kWECopyOf2 = C1322480kWE.copyOf((List) c781010UkN.LJI.LIZIZ);
            if (c1322480kWECopyOf2 != null && !c1322480kWECopyOf2.isEmpty()) {
                ((ArrayList) c1106200etOLJII.LJJIJIL).addAll(c1322480kWECopyOf2);
            }
            c1106200etOLJII.LJJIL = ((IUserManageService) C781270Ukn.LJJIJ.getValue()).hL0();
            final C1106210etP c1106210etP = new C1106210etP(c1106200etOLJII);
            ?? r14 = new InterfaceC1372610lp5() { // from class: X.0IuB
                @Override // X.InterfaceC1372610lp5
                public final void LIZ(Throwable th) {
                }

                @Override // X.InterfaceC1372610lp5
                public final /* synthetic */ void LJFF(Dialog dialog) {
                }

                @Override // X.InterfaceC1372610lp5
                public final /* synthetic */ void LJI(Dialog dialog) {
                }

                @Override // X.InterfaceC1372610lp5
                public final /* synthetic */ void onDismiss() {
                }

                @Override // X.InterfaceC1372610lp5
                public final /* synthetic */ void onShow(int i) {
                }

                @Override // X.InterfaceC1372610lp5
                public final void LJII() {
                    if (LiveHostSettingsUIConfig.enable()) {
                        if (C500260Jjc.LJIIZILJ(c781010UkN.LJ) || C500260Jjc.LJJJIL(c781010UkN.LJ)) {
                            C19322110iZ.LIZ(c781010UkN.LJII);
                        }
                    }
                }

                @Override // X.InterfaceC1372610lp5
                public final void LIZIZ(HashMap<String, String> map) {
                    C481180Itw.LJ(c781010UkN.LJ, map);
                }

                @Override // X.InterfaceC1372610lp5
                public final void LIZLLL(HashMap<String, String> map) {
                    C481180Itw.LJI(c781010UkN.LJ, map);
                }

                @Override // X.InterfaceC1372610lp5
                public final void LJ(HashMap<String, String> map) {
                    C481180Itw.LJFF(c781010UkN.LJ, map);
                }

                @Override // X.InterfaceC1372610lp5
                public final void LIZJ(String str, String str2, Bundle bundle) {
                    String[] stringArray;
                    c781010UkN.LJ.LC0(ShareJoinInGoodyBag.class, str);
                    C766270U4b.LIZLLL(2131844054);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (Intrinsics.LJFF(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getConnectionType(), "manual_pk")) {
                        if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Nt()) {
                            linkedHashMap.put("match_status", "pk_phase");
                        } else {
                            linkedHashMap.put("match_status", LiveCenterMockToolSwitch.PUNISH);
                        }
                    }
                    linkedHashMap.put("channel_id", String.valueOf(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getChannelId()));
                    C781010UkN c781010UkN2 = c781010UkN;
                    Room room3 = c781010UkN2.LIZ;
                    C481180Itw.LJIIIZ(room3, c781010UkN2.LJ, c781010UkN2.LIZIZ, str2, room3.getLabels(), bundle);
                    linkedHashMap.putAll(((InterfaceC2183451Acp) C1161920gLG.LIZJ(IInteractService.class)).LJJ(null));
                    if (bundle != null) {
                        bundle.putInt("guest_cnt", ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getGuestCount());
                    }
                    linkedHashMap.putAll(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).sR(0L, false));
                    String strNo2 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).No2();
                    if (bundle != null) {
                        C786410Ut5.LJJJI("multi_tool", strNo2, bundle);
                    }
                    C781010UkN c781010UkN3 = c781010UkN;
                    Room room4 = c781010UkN3.LIZ;
                    DataChannel dataChannel = c781010UkN3.LJ;
                    C1106210etP c1106210etP2 = c1106210etP;
                    C481180Itw.LIZLLL(room4, dataChannel, str, str2, bundle, c1106210etP2.LJJI, linkedHashMap, c1106210etP2, null);
                    C781010UkN c781010UkN4 = c781010UkN;
                    C481180Itw.LJIIIIZZ(c781010UkN4.LIZ, c781010UkN4.LJ, str);
                    long id = c781010UkN.LIZ.getId();
                    if (bundle != null && (stringArray = bundle.getStringArray(((IHostShare) C1161920gLG.LIZJ(IHostShare.class)).getBundleKey(0))) != null && stringArray.length != 0) {
                        C480460Ism.LIZ().getClass();
                        ((ShareApi) C480460Ism.LIZLLL(ShareApi.class)).submitShare(id, C13LQ.LJJJ(stringArray, ",", null, null, null, 62)).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.00La
                            @Override // X.C09JN
                            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                                C1C7U.LIZ("ShareUtils@6182.submitShare$2$1");
                                C1C7U.LIZIZ("ShareUtils@6182.submitShare$2$1");
                            }
                        }, new C09JN() { // from class: X.00Lb
                            @Override // X.C09JN
                            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                                C1C7U.LIZ("ShareUtils@6182.submitShare$2$2");
                                C1C7U.LIZIZ("ShareUtils@6182.submitShare$2$2");
                            }
                        });
                    }
                    InterfaceC1085480eLy interfaceC1085480eLyO41 = ((IBarrageService) C1161920gLG.LIZJ(IBarrageService.class)).O41(c781010UkN.LIZ.getId());
                    if (interfaceC1085480eLyO41 != null) {
                        interfaceC1085480eLyO41.LJIILL();
                    }
                    if (C500260Jjc.LJIIZILJ(c781010UkN.LJ)) {
                        C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_shared_anchor_share_special_effect_show", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_0()));
                        c474500IjALIZIZ.LJIJJLI(c781010UkN.LJ);
                        c474500IjALIZIZ.LIZ();
                    } else {
                        C474500IjA c474500IjALIZIZ2 = C0IJT.LIZIZ("livesdk_share_special_effect_shared_audience_show", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_0()));
                        c474500IjALIZIZ2.LJIJJLI(c781010UkN.LJ);
                        c474500IjALIZIZ2.LIZ();
                    }
                }
            };
            if (LiveHostSettingsUIConfig.enable() && (C500260Jjc.LJIIZILJ(c781010UkN.LJ) || C500260Jjc.LJJJIL(c781010UkN.LJ))) {
                Fragment fragmentCE0 = C781270Ukn.LJIL().cE0(context, c781010UkN.LIZ, c1106210etP, r14);
                if (fragmentCE0 != null) {
                    c781010UkN.LJII = C19322110iZ.LJFF(c781010UkN.LIZIZ.getParentFragmentManager(), new LiveHostLongPressSheet(fragmentCE0, c781010UkN.LJ), "live_toolbar_more_sheet", null, 0);
                    return;
                }
                return;
            }
            c781010UkN.LJFF = C781270Ukn.LJIL().UV1(context, true, c781010UkN.LIZ, c1106210etP, null, r14);
        }
    }

    public static final void run$3(C786170Ush c786170Ush) {
        Map<String, Object> map = C1338270kvh.LIZ;
        ((GamePreparationFragment) c786170Ush.l0).OR(0L);
        ((GamePreparationFragment) c786170Ush.l0).VR("start_stream");
        InterfaceC773750UWv interfaceC773750UWv = ((GamePreparationFragment) c786170Ush.l0).LLJJI;
        if (interfaceC773750UWv == null) {
            interfaceC773750UWv = null;
        }
        interfaceC773750UWv.jH(false, null);
    }

    public static final void run$4(C786170Ush c786170Ush) {
        C786410Ut5.LLJJJJ(((C744610TIt) c786170Ush.l0).LLILZIL, 8);
    }

    public static final void run$5(C786170Ush c786170Ush) {
        T t = ((C259800zU) c786170Ush.l0).element;
        if (t == 0) {
            return;
        }
        C782850UnL.LIZIZ.remove(t);
    }

    public static final void run$6(C786170Ush c786170Ush) {
        T t = ((C259800zU) c786170Ush.l0).element;
        if (t == 0) {
            return;
        }
        C782850UnL.LIZ.remove(t);
    }

    public static final void run$7(C786170Ush c786170Ush) {
        ((GamePreparationNetworkSpeedDetectionDialog) c786170Ush.l0).zS(0L, true);
    }

    public static final void run$8(C786170Ush c786170Ush) {
        InterfaceC773750UWv interfaceC773750UWv = ((GamePreparationFragment) c786170Ush.l0).LLJJI;
        if (interfaceC773750UWv == null) {
            interfaceC773750UWv = null;
        }
        interfaceC773750UWv.jC(false);
    }

    public static final void run$9(C786170Ush c786170Ush) {
        C16F5 c16f5 = ((C940980aau) c786170Ush.l0).LLJJJIL;
        if (c16f5 != null) {
            C786410Ut5.LLJJJJ(c16f5, 8);
        }
    }

    public C786170Ush(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
