package X;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.adminsetting.RoomSwitchApi;
import com.bytedance.android.live.liveinteract.api.CoHostAndMultiGuestSceneGiftPanelChangeChannel;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchAudience1v1ArchGiftTraySetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchDropOffSetting;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import tikcast.linkmic.common.CohostTypeSpotExtra;

/* JADX INFO: renamed from: X.0bBO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C963600bBO implements InterfaceC975560bUg {
    public MatchBaseWidget LL;
    public DataChannel LLILLJJLI;
    public boolean LLILLL;
    public View LLILZ;
    public boolean LLILZIL;
    public final BPEAHandler LLILZLL = new BPEAHandler(Looper.getMainLooper());
    public EnumC976730bWZ LLIZ;

    @Override // X.InterfaceC975560bUg
    public final void LIZIZ(int i, int i2, List list, List list2, List list3, List list4) {
    }

    @Override // X.InterfaceC975560bUg
    public final void LIZJ(AbstractC986700bme abstractC986700bme) {
    }

    @Override // X.InterfaceC975560bUg
    public final void LJ(InterfaceC963620bBQ interfaceC963620bBQ) {
    }

    @Override // X.InterfaceC975560bUg
    public final void LJI(EnumC919170a1j enumC919170a1j) {
    }

    @Override // X.InterfaceC975560bUg
    public final void LJII(AbstractC1136060ffY abstractC1136060ffY) {
    }

    @Override // X.InterfaceC975560bUg
    public final void LJIIIZ(InterfaceC963620bBQ interfaceC963620bBQ) {
    }

    @Override // X.InterfaceC975560bUg
    public final void LJIIJ(BattleInfoResponse battleInfoResponse, EnumC970440bMQ enumC970440bMQ) {
    }

    @Override // X.InterfaceC975560bUg
    public final void LJIIL(AbstractC970850bN5 abstractC970850bN5, EnumC970440bMQ enumC970440bMQ) {
    }

    @Override // X.InterfaceC975560bUg
    public final void onDestroy() {
        this.LLILZLL.removeCallbacksAndMessages(null);
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILZ = null;
    }

    public C963600bBO() {
        EnumSet.noneOf(EnumC963560bBK.class);
        this.LLIZ = EnumC976730bWZ.P1;
    }

    public final void LIZ() {
        DataChannel dataChannel;
        C938200aWQ c938200aWQ;
        DataChannel dataChannel2;
        C938200aWQ c938200aWQ2;
        if (C915980Zwa.LJII().LLILZLL(true).size() > 2) {
            C20441214yg.LJIIIZ("live_host_change", "more than 2");
            if (!LiveMatchAudience1v1ArchGiftTraySetting.INSTANCE.isEnable() || (dataChannel2 = this.LLILLJJLI) == null || (c938200aWQ2 = (C938200aWQ) dataChannel2.gg0(CoHostAndMultiGuestSceneGiftPanelChangeChannel.class)) == null || c938200aWQ2.LIZ != EnumC476080Ili.SMALL_TRAY_ON_WINDOW.getValue()) {
                C20441214yg.LJIIIZ("live_host_change", "more than 2 post success");
                DataChannel dataChannel3 = this.LLILLJJLI;
                if (dataChannel3 != null) {
                    dataChannel3.zW(CoHostAndMultiGuestSceneGiftPanelChangeChannel.class, C956580b04.LIZ(EnumC476080Ili.SMALL_TRAY_ON_WINDOW.getValue()));
                    return;
                }
                return;
            }
            return;
        }
        C20441214yg.LJIIIZ("MatchLayoutControlComponent", "live_host_change, less than 3");
        if (!LiveMatchAudience1v1ArchGiftTraySetting.INSTANCE.isEnable() || (dataChannel = this.LLILLJJLI) == null || (c938200aWQ = (C938200aWQ) dataChannel.gg0(CoHostAndMultiGuestSceneGiftPanelChangeChannel.class)) == null || c938200aWQ.LIZ != EnumC476080Ili.NORMAL_TRAY.getValue()) {
            C20441214yg.LJIIIZ("MatchLayoutControlComponent", "live_host_change, less than 3 post success");
            DataChannel dataChannel4 = this.LLILLJJLI;
            if (dataChannel4 != null) {
                dataChannel4.zW(CoHostAndMultiGuestSceneGiftPanelChangeChannel.class, C956580b04.LIZ(EnumC476080Ili.NORMAL_TRAY.getValue()));
            }
        }
    }

    @Override // X.InterfaceC975560bUg
    public final EnumC976730bWZ getPriority() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC975560bUg
    public final void LIZLLL(MatchBaseWidget matchBaseWidget) {
        boolean zLJIIZILJ;
        this.LL = matchBaseWidget;
        DataChannel dataChannelProvideDataChannel = matchBaseWidget.provideDataChannel();
        this.LLILLJJLI = dataChannelProvideDataChannel;
        if (dataChannelProvideDataChannel != null) {
            zLJIIZILJ = C500260Jjc.LJIIZILJ(dataChannelProvideDataChannel);
        } else {
            zLJIIZILJ = false;
        }
        this.LLILLL = zLJIIZILJ;
        this.LLILZ = matchBaseWidget.findViewById(R.id.m96);
    }

    @Override // X.InterfaceC975560bUg
    public final void LJFF(InterfaceC963620bBQ interfaceC963620bBQ) {
        C975960bVK c975960bVK;
        View view = this.LLILZ;
        if (view == null || view.getVisibility() != 0) {
            C973660bRc c973660bRc = C973660bRc.LIZ;
            boolean z = this.LLILLL;
            List<? extends TeamUsersInfo> list = null;
            if ((interfaceC963620bBQ instanceof C975960bVK) && (c975960bVK = (C975960bVK) interfaceC963620bBQ) != null) {
                list = c975960bVK.LJJIJ;
            }
            c973660bRc.LJJLIIIJL(list, z);
        }
        View view2 = this.LLILZ;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
        LJIILIIL(false);
    }

    @Override // X.InterfaceC975560bUg
    public final void LJIIIIZZ(InterfaceC963620bBQ interfaceC963620bBQ) {
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        C20441214yg.LJ("MatchLayoutControlComponent", "moveToEnd, reset container offsetY 0");
        InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
        if (interfaceC954180awCLJIIIZ != null && (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLJIIIZ.LLIIJLIL()) != null) {
            interfaceC937900aVwLLIIJLIL.LJLLLLLL(0.0f, 0, true);
        }
        this.LLILZIL = false;
        LJIILIIL(true);
    }

    /* JADX WARN: Type inference failed for: r0v29, types: [T, java.lang.Object] */
    @Override // X.InterfaceC975560bUg
    public final void LJIIJJI(InterfaceC963620bBQ interfaceC963620bBQ) {
        Long lValueOf;
        String str;
        String string;
        C975960bVK c975960bVK;
        int iIntValue;
        Context context;
        Integer num;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        C961300b7g.LIZ.getClass();
        C961300b7g.LIZIZ("");
        C955400ayA c955400ayA = C955400ayA.LIZ;
        String strValueOf = String.valueOf(C915980Zwa.LJII().getChannelId());
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        List<? extends TeamUsersInfo> list = null;
        if (interfaceC973730bRjYf2 != null) {
            lValueOf = Long.valueOf(interfaceC973730bRjYf2.LJJJJJL());
        } else {
            lValueOf = null;
        }
        String strValueOf2 = String.valueOf(lValueOf);
        String value = EnumC950500aqG.ACCEPT.getValue();
        HashMap map = new HashMap();
        map.put("connection_type", "manual_pk");
        if (C915980Zwa.LJII().LLFFF() && C915980Zwa.LJII().LJIJJ().size() > 2) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_multi", str);
        map.put("pk_id", strValueOf2);
        C955400ayA.LJIIJJI(strValueOf, value, map);
        Integer num2 = C973660bRc.LJL;
        if (num2 == null || (string = num2.toString()) == null) {
            string = "";
        }
        map.put("battle_scene", string);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_connection_invited_dismiss");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
        if (this.LLILLL) {
            if (!this.LLILZIL && !C970370bMJ.LJIIJ()) {
                C20441214yg.LJ("MatchLayoutControlComponent", "start moveDown, set container offsetY 16F");
                InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
                if (interfaceC954180awCLJIIIZ != null && (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLJIIIZ.LLIIJLIL()) != null) {
                    interfaceC937900aVwLLIIJLIL.LJLLLLLL(16.0f, 260, true);
                }
                this.LLILZIL = true;
            } else {
                C20441214yg.LJIIIZ("MatchLayoutControlComponent", "already move down or is 1v1 Match no need move");
            }
            MatchBaseWidget matchBaseWidget = this.LL;
            final DataChannel dataChannel = this.LLILLJJLI;
            if (dataChannel != null && (num = (Integer) dataChannel.gg0(C963610bBP.class)) != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = -1;
            }
            final C259800zU c259800zU = new C259800zU();
            ?? LIZIZ = InterfaceC1094160eZy.U0.LIZIZ();
            c259800zU.element = LIZIZ;
            if (iIntValue == 2) {
                if (((Boolean) LIZIZ).booleanValue()) {
                    C20441214yg.LJIIIZ("MatchLottieExtension", "skip showGiftGuideIfClosed by notShowAgain=true");
                } else if (matchBaseWidget != null && (context = matchBaseWidget.context) != null) {
                    C19GO c19go = new C19GO(context);
                    c19go.LJJIIJ = false;
                    c19go.LJI(2131842863);
                    c19go.LJ(2131842867, new DialogInterface.OnClickListener() { // from class: X.0136
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            long id;
                            InterfaceC1094160eZy.U0.LJFF(c259800zU.element);
                            C963600bBO c963600bBO = this;
                            DataChannel dataChannel2 = dataChannel;
                            c963600bBO.getClass();
                            EnumC964170bCJ enumC964170bCJRY = C915980Zwa.LJFF().RY(false);
                            if (enumC964170bCJRY.compareTo(EnumC964170bCJ.MATCH_START) >= 0 && enumC964170bCJRY.compareTo(EnumC964170bCJ.MATCH_END) < 0) {
                                C480460Ism.LIZ().getClass();
                                RoomSwitchApi roomSwitchApi = (RoomSwitchApi) C480460Ism.LIZLLL(RoomSwitchApi.class);
                                Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel2);
                                if (roomLJJLIIIIJ != null) {
                                    id = roomLJJLIIIIJ.getId();
                                } else {
                                    id = 0;
                                }
                                roomSwitchApi.updateSwitch(id, 6, true, 0L).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.00Ki
                                    @Override // X.C09JN
                                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                                        C1C7U.LIZ("MatchLayoutControlComponent@f265.updateOpenReceiveGiftSetting$1$1");
                                        C1C7U.LIZIZ("MatchLayoutControlComponent@f265.updateOpenReceiveGiftSetting$1$1");
                                    }
                                }, new C09JN() { // from class: X.00KE
                                    @Override // X.C09JN
                                    public final void accept(Object obj) {
                                        C1C7U.LIZ("MatchLayoutControlComponent@f265.updateOpenReceiveGiftSetting$1$2");
                                        C766270U4b.LIZLLL(2131842705);
                                        C1C7U.LIZIZ("MatchLayoutControlComponent@f265.updateOpenReceiveGiftSetting$1$2");
                                    }
                                });
                            }
                        }
                    }, false);
                    c19go.LIZJ(2131842866, new DialogInterfaceOnClickListenerC512101z5(c259800zU, 1), false);
                    ImageView imageView = new ImageView(context);
                    imageView.setImageResource(R.drawable.emg);
                    c19go.LJIJJ = imageView;
                    c19go.LJJII = 46;
                    c19go.LJJIII = 48;
                    View viewSd = C786410Ut5.Sd(R.layout.g79, C786410Ut5.ne(context), null);
                    C20744116Fj c20744116Fj = (C20744116Fj) viewSd.findViewById(R.id.dq1);
                    ((TextView) viewSd.findViewById(R.id.zf0)).setText(2131842864);
                    c20744116Fj.setText(2131842865);
                    C786410Ut5.z7(c20744116Fj, new C511901z3(c259800zU, 3));
                    c19go.LJIJJLI = viewSd;
                    C786410Ut5.M4(c19go.LIZ());
                }
            }
            C954660awy.LJIIIZ = "";
        }
        View view = this.LLILZ;
        if (view == null || view.getVisibility() != 0) {
            C973660bRc c973660bRc = C973660bRc.LIZ;
            if ((interfaceC963620bBQ instanceof C975960bVK) && (c975960bVK = (C975960bVK) interfaceC963620bBQ) != null) {
                list = c975960bVK.LJJIJ;
            }
            c973660bRc.LJJLIIIJL(list, false);
        }
        C786410Ut5.LJLIIL(1000L, this.LLILZLL, new RunnableC514801zW(this, 88));
        View view2 = this.LLILZ;
        if (view2 != null) {
            HandlerHook.viewPost(view2, new RunnableC514801zW(this, 89));
        }
    }

    public final void LJIILIIL(boolean z) {
        int iLJJIIJZLJL;
        int iLJJLIIIJLJLI;
        List list;
        int iLIZIZ;
        int iWidth;
        RectF rectF;
        Rect rect;
        C956040azC c956040azCLJI;
        C942080acg c942080acgLJII;
        C947470alN c947470alN;
        RectF rectF2;
        if (this.LL == null || C915980Zwa.LJII().LLI() != EnumC950120ape.Linked) {
            return;
        }
        boolean zCo0 = C915980Zwa.LJFF().co0();
        C955010axX c955010axXI30 = C915980Zwa.LJII().i30();
        Object obj = null;
        if (c955010axXI30 != null && (c942080acgLJII = c955010axXI30.LJII()) != null && (c947470alN = c942080acgLJII.LIZ) != null && (rectF2 = c947470alN.LIZJ) != null) {
            iLJJIIJZLJL = (int) rectF2.top;
            iLJJLIIIJLJLI = (int) rectF2.height();
        } else {
            iLJJIIJZLJL = C915980Zwa.LJI().LIZ().LJJIIJZLJL();
            iLJJLIIIJLJLI = C915980Zwa.LJI().LIZ().LJJLIIIJLJLI();
        }
        boolean zL6 = C915980Zwa.LJII().L6();
        int i = 0;
        C956380azk c956380azk = new C956380azk(0, "MatchLayoutControlComponent_updateWidgetWithBattleState");
        if (z) {
            zCo0 = false;
        }
        c956380azk.LJIIIIZZ = zCo0;
        c956380azk.LIZJ = iLJJIIJZLJL + iLJJLIIIJLJLI;
        if (zL6) {
            C955010axX c955010axXI302 = C915980Zwa.LJII().i30();
            if (c955010axXI302 == null || (c956040azCLJI = c955010axXI302.LJI()) == null || (list = c956040azCLJI.LIZ) == null) {
                list = C13BV.INSTANCE;
            }
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                CohostTypeSpotExtra cohostTypeSpotExtra = ((C955080axe) next).LJIILJJIL;
                if (cohostTypeSpotExtra != null && !cohostTypeSpotExtra.isEnlarged) {
                    obj = next;
                    break;
                }
            }
            C955080axe c955080axe = (C955080axe) obj;
            if (c955080axe != null && (rect = c955080axe.LJFF) != null) {
                iLIZIZ = rect.width();
            } else {
                iLIZIZ = (int) C497740JfY.LIZIZ(85.0f);
            }
            c956380azk.LIZLLL = iLIZIZ;
            if ((((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad() && C500260Jjc.LJJIII(C497740JfY.LIZ)) || ((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).Yd2()) {
                C955080axe c955080axe2 = (C955080axe) C13LP.LJJJLL(list);
                if (c955080axe2 != null && (rectF = c955080axe2.LIZIZ) != null) {
                    iWidth = (int) rectF.width();
                } else {
                    iWidth = 0;
                }
                int iLJIIZILJ = (C497740JfY.LJIIZILJ() - iWidth) / 2;
                if (iLJIIZILJ >= 0) {
                    i = iLJIIZILJ;
                }
                c956380azk.LIZLLL += i;
            }
            c956380azk.LJIIIZ = true;
        }
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.zW(LinkCrossRoomStateChangeEvent.class, c956380azk);
        }
        LIZ();
    }

    @Override // X.InterfaceC975560bUg
    public final void vc(List<C954460awe> list, List<C954460awe> list2) {
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        if ((!list.isEmpty()) && ((list2 == null || list.size() != ((ArrayList) list2).size()) && LiveMatchDropOffSetting.INSTANCE.isEnable() && C970370bMJ.LJIIIZ() && this.LLILZIL && C915980Zwa.LJFF().RY(false).compareTo(EnumC964170bCJ.PUNISH_START) < 0)) {
            InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
            if (interfaceC954180awCLJIIIZ != null && (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLJIIIZ.LLIIJLIL()) != null) {
                interfaceC937900aVwLLIIJLIL.LJLLLLLL(0.0f, 0, true);
            }
            this.LLILZIL = false;
        }
        LIZ();
    }
}
