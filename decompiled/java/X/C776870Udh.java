package X;

import Y.ARunnableS112S0100000_12;
import Y.ARunnableS45S0300000_12;
import Y.ATListenerS446S0100000_12;
import Y.AcS495S0100000_12;
import Y.AfS148S0200000_12;
import Y.AfS181S0100000_12;
import Y.AfS32S0210000_12;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Point;
import android.media.projection.MediaProjectionConfig;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.os.Looper;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.bytedance.android.live.broadcast.api.GameFloatingWindowAudienceClickEvent;
import com.bytedance.android.live.broadcast.model.GameLiveInfo;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.publicscreen.api.GameBackgroundColorChannel;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.publicscreen.api.NewMessageNumChannel;
import com.bytedance.android.live.room.ChatMessageReplaceEvent;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.comp.api.game.GameBroadcastStateChannel;
import com.bytedance.android.livesdk.dataChannel.GameBroadcastFrameEndEvent;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.PauseLiveChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.game.broadcast.bgbroadcast.ConstraintFloatWindowLayout;
import com.bytedance.android.livesdk.game.broadcast.bgbroadcast.internalrecord.EnableFallbackAudioOldChainSetting;
import com.bytedance.android.livesdk.game.broadcast.dialog.GameMessageAlertDialog;
import com.bytedance.android.livesdk.game.chatroom.ui.GameBroadcastFragment;
import com.bytedance.android.livesdk.game.chatroom.ui.GameBroadcastInteractionFragment;
import com.bytedance.android.livesdk.game.chatroom.ui.GamePreparationFragment;
import com.bytedance.android.livesdk.game.common.datachannel.GameLiveFloatBallTipsUpdateEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.BroadcastGameCountDownNum;
import com.bytedance.android.livesdk.livesetting.broadcast.EnableScreenCaptureInterruptCheckSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.EnableTTCaptureSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.GameFloatTipsOptimize;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveGameMomentQuickCommentBroadcastSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePauseTimeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.TtliveGameAnchorIntelligentRotationTimeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.TtliveGameEnableIntelligentRotationSetting;
import com.bytedance.android.livesdk.livesetting.game.EnableGameBroadcastFrameSetting;
import com.bytedance.android.livesdk.livesetting.game.GameFloatWindowMsgStrategySetting;
import com.bytedance.android.livesdk.model.Creator;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.model.message.GameMomentMessage;
import com.bytedance.android.livesdk.model.message.GameRankNotifyMessage;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdk.model.message.RoomMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.PollConf;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.message.IMessageService;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS27S0010000_12;
import kotlin.jvm.internal.AwS378S0200000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS661S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Udh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C776870Udh implements InterfaceC778270Ufx, InterfaceC500720JkM {
    public final Room LIZ;
    public final GameBroadcastFragment LIZIZ;
    public final DataChannel LIZJ;
    public InterfaceC777000Udu LIZLLL;
    public C776880Udi LJ;
    public final int LJFF = LivePauseTimeSetting.INSTANCE.getPauseTimes();
    public final Context LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public final boolean LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public final C11NJ LJIILJJIL;
    public InterfaceC1110630f0X LJIILL;
    public C779880UiY LJIILLIIL;
    public AbstractC776930Udn LJIIZILJ;
    public C779480Uhu LJIJ;
    public C492270JSf LJIJI;
    public C779330Uhf LJIJJ;
    public C779260UhY LJIJJLI;
    public C777220UeG LJIL;
    public boolean LJJ;
    public C779530Uhz LJJI;
    public boolean LJJIFFI;
    public boolean LJJII;
    public boolean LJJIII;
    public boolean LJJIIJ;
    public Boolean LJJIIJZLJL;
    public boolean LJJIIZ;
    public boolean LJJIIZI;
    public Intent LJJIJ;
    public C1324720kZq LJJIJIIJI;
    public ImageView LJJIJIIJIL;
    public C778390Ug9 LJJIJIL;
    public final C01GW LJJIJL;
    public final ArrayList<C09AE> LJJIJLIJ;
    public PunishEventInfo LJJIL;
    public String LJJIZ;
    public int LJJJ;
    public PunishEventInfo LJJJI;
    public Cert LJJJIL;
    public boolean LJJJJ;
    public InterfaceC779960Uig LJJJJI;
    public LiveDialog LJJJJIZL;
    public boolean LJJJJJ;
    public boolean LJJJJJL;
    public final C01GW LJJJJL;
    public final C01GW LJJJJLI;
    public final C01GW LJJJJLL;
    public final C778120Ufi LJJJJZ;
    public final C776410Ucx LJJJJZI;
    public final C776490Ud5 LJJJLIIL;
    public final C778180Ufo LJJJLL;
    public final C01GW LJJJLZIJ;
    public final C500730JkN LJJJZ;
    public C778170Ufn LJJL;
    public InterfaceC776970Udr LJJLI;
    public IMessageManager LJJLIIIIJ;
    public C780110Uiv LJJLIIIJ;
    public final List<InterfaceC776570UdD> LJJLIIIJILLIZJL;
    public int LJJLIIIJJI;
    public final C777200UeE LJJLIIIJJIZ;
    public final C777360UeU LJJLIIIJL;
    public final C777210UeF LJJLIIIJLJLI;
    public C776940Udo LJJLIIIJLLLLLLLZ;
    public final LinkedList<ChatMessage> LJJLIIJ;
    public final LinkedList<GiftMessage> LJJLIL;
    public C779190UhR LJJLJ;
    public C778080Ufe LJJLJLI;
    public final C785760Us2 LJJLL;
    public boolean LJJZ;

    @Override // X.InterfaceC500720JkM
    public final void LJI() {
        this.LJIIJ = false;
        LJIIL();
    }

    public static void LJIIL() {
        C778030UfZ c778030UfZ;
        C778030UfZ c778030UfZ2;
        try {
            AbstractC776850Udf abstractC776850UdfLIZ = C776920Udm.LIZ("control_view");
            if ((abstractC776850UdfLIZ instanceof C778030UfZ) && (c778030UfZ2 = (C778030UfZ) abstractC776850UdfLIZ) != null) {
                c778030UfZ2.LIZ();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            C778030UfZ c778030UfZ3 = (C778030UfZ) C776920Udm.LIZ("msg_view");
            if (c778030UfZ3 != null) {
                c778030UfZ3.LIZ();
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            AbstractC776850Udf abstractC776850UdfLIZ2 = C776920Udm.LIZ("small_view");
            if (!(abstractC776850UdfLIZ2 instanceof C778030UfZ) || (c778030UfZ = (C778030UfZ) abstractC776850UdfLIZ2) == null) {
                return;
            }
            c778030UfZ.LIZ();
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
    }

    @Override // X.InterfaceC778270Ufx
    public final InterfaceC777420Uea LIZIZ() {
        return this.LIZIZ.isAdded() ? ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).Ea0(ViewModelProviders.of(this.LIZIZ)) : new C513220KAu();
    }

    @Override // X.InterfaceC778270Ufx
    public final void LIZLLL() {
        C774940Uaa c774940Uaa = this.LIZIZ.LLJJIJIIJIL;
        if (c774940Uaa == null) {
            c774940Uaa = null;
        }
        if (c774940Uaa.LLILZ != null) {
            ArrayList arrayList = new ArrayList();
            if (c774940Uaa.LLILZIL.getStreamUrl().pushUrlList == null || c774940Uaa.LLILZIL.getStreamUrl().pushUrlList.isEmpty()) {
                arrayList.add(c774940Uaa.LLILZIL.getStreamUrl().LIZLLL());
            } else {
                arrayList.addAll(c774940Uaa.LLILZIL.getStreamUrl().pushUrlList);
            }
            c774940Uaa.LLILZ.I3(arrayList);
        }
    }

    @Override // X.InterfaceC778270Ufx
    public final void LJ() throws Throwable {
        MediaProjectionManager mediaProjectionManager;
        if (EnableTTCaptureSetting.INSTANCE.enable()) {
            Context context = this.LJI;
            Object objH2 = context != null ? C786410Ut5.H2(context, "media_projection") : null;
            if (!(objH2 instanceof MediaProjectionManager) || (mediaProjectionManager = (MediaProjectionManager) objH2) == null) {
                return;
            }
            try {
                Intent intentLJIILLIIL = LJIILLIIL(mediaProjectionManager, CertProviderManagerKt.findCert("bpea-screen_capture_intent_resume", 1476411393));
                GameBroadcastFragment gameBroadcastFragment = this.LIZIZ;
                C1701330uNH.LIZ(intentLJIILLIIL, gameBroadcastFragment);
                C2204961BRm.LLLIIL(gameBroadcastFragment, intentLJIILLIIL, 1001, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl7Cugu7MyFf9A4/HWWwV5Kt9lP0Hf23rV1vA77nf4Wj+MIwLVVugJd4w=", null));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("create capture intent exception  msg: ");
                sbLIZ.append(e.getMessage());
                C20441214yg.LJ("GameUiStrategy", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    @Override // X.InterfaceC778270Ufx
    public final AbstractC777950UfR LJII() {
        C779880UiY c779880UiY;
        if (this.LJIILIIL || (c779880UiY = this.LJIILLIIL) == null) {
            return null;
        }
        return c779880UiY.LJIIIIZZ();
    }

    @Override // X.InterfaceC778270Ufx
    public final EnumC778100Ufg LJIIJ() {
        if (this.LJIILIIL) {
            return EnumC778100Ufg.LIVE_TIP_UNKNOWN;
        }
        C779880UiY c779880UiY = this.LJIILLIIL;
        if (c779880UiY != null) {
            return c779880UiY.LJIIIZ();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v15, types: [X.0JSf] */
    /* JADX WARN: Type inference failed for: r6v2, types: [X.0Udx] */
    @Override // X.InterfaceC500720JkM
    public final void LJIIJJI() {
        C778010UfX c778010UfX;
        C779480Uhu c779480Uhu;
        boolean z;
        AbstractC776930Udn abstractC776930Udn;
        C492270JSf c492270JSf;
        boolean z2;
        if (this.LJIIJ) {
            return;
        }
        this.LJIIJ = true;
        LJIIL();
        if (this.LJI == null) {
            return;
        }
        boolean z3 = C497280Jeo.LIZ;
        if ((z3 && C520010KaN.LJJIIJZLJL(this.LIZIZ) == null) || C520010KaN.LJJIIZ(this.LIZIZ)) {
            return;
        }
        if (this.LJIJJ == null) {
            this.LJIJJ = new C779330Uhf(C786410Ut5.N3(C497740JfY.LJII()), C786410Ut5.Sd(R.layout.hsl, C786410Ut5.ne(C497740JfY.LJII()), null));
        }
        if (this.LJI != null) {
            final Context context = this.LJI;
            this.LJIJI = new C776950Udp(context) { // from class: X.0JSf
                public int LLILLL;

                public final int getIconWidth() {
                    return this.LLILLL;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
                {
                    /*
                        r4 = this;
                        r4.<init>(r5)
                        r0 = 1103101952(0x41c00000, float:24.0)
                        float r0 = X.C497740JfY.LIZIZ(r0)
                        int r0 = (int) r0
                        r4.LLILLL = r0
                        r0 = 2131569825(0x7f0d2ca1, float:1.8765287E38)
                        X.C786410Ut5.LJLLJ(r5, r0, r4)
                        r0 = 2131377822(0x7f0a3e9e, float:1.837586E38)
                        android.view.View r3 = r4.findViewById(r0)
                        r0 = 2131374961(0x7f0a3371, float:1.8370056E38)
                        android.view.View r2 = r4.findViewById(r0)
                        android.widget.ImageView r2 = (android.widget.ImageView) r2
                        if (r3 == 0) goto L27
                        X.C439101nJ.LJI(r3)
                    L27:
                        com.bytedance.android.livesdk.userservice.UserService r0 = com.bytedance.android.livesdk.userservice.UserService.getInstance()
                        r1 = 0
                        if (r0 == 0) goto L38
                        X.0Jki r0 = r0.user()
                        if (r0 == 0) goto L38
                        X.1DgM r1 = r0.getCurrentUser()
                    L38:
                        com.bytedance.android.livesdk.livesetting.OptAvatarLargeUseSetting r0 = com.bytedance.android.livesdk.livesetting.OptAvatarLargeUseSetting.INSTANCE
                        boolean r0 = r0.enable()
                        if (r0 == 0) goto L4c
                        if (r1 == 0) goto L53
                        com.bytedance.android.live.base.model.ImageModel r0 = r1.getAvatarThumb()
                    L46:
                        if (r0 == 0) goto L53
                        X.C0JSS.LJII(r2, r0)
                    L4b:
                        return
                    L4c:
                        if (r1 == 0) goto L53
                        com.bytedance.android.live.base.model.ImageModel r0 = r1.getAvatarLarge()
                        goto L46
                    L53:
                        if (r2 == 0) goto L58
                        X.C439101nJ.LJI(r2)
                    L58:
                        if (r3 == 0) goto L4b
                        r0 = 0
                        X.C12ES.LJIILL(r0, r3)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C492270JSf.<init>(android.content.Context):void");
                }

                public final void setIconWidth(int i) {
                    this.LLILLL = i;
                }
            };
            GameFloatWindowMsgStrategySetting gameFloatWindowMsgStrategySetting = GameFloatWindowMsgStrategySetting.INSTANCE;
            if (gameFloatWindowMsgStrategySetting.getConfig().enableStrategyChat && ((z2 = (c492270JSf = this.LJIJI) instanceof C776950Udp))) {
                if (c492270JSf != null) {
                    c492270JSf.LL = this.LJJLIIIJLJLI;
                }
                if (z2 && c492270JSf != null) {
                    c492270JSf.LLILLJJLI = this.LJJLIIIJLLLLLLLZ;
                }
            }
            C776900Udk c776900Udk = new C776900Udk(C497740JfY.LJII());
            c776900Udk.LIZIZ = this.LJIJI;
            c776900Udk.LJIIJJI = "control_view";
            c776900Udk.LJI = 2;
            c776900Udk.LIZJ = (int) C497740JfY.LIZIZ(24.0f);
            c776900Udk.LIZLLL = (int) C497740JfY.LIZIZ(24.0f);
            c776900Udk.LJII = 0;
            c776900Udk.LJIIIIZZ = 0;
            AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
            c776900Udk.LJIIIZ = 300L;
            c776900Udk.LJIIJ = accelerateDecelerateInterpolator;
            c776900Udk.LJIIL = new C779830UiT() { // from class: X.0UiN
                @Override // X.C779830UiT, X.InterfaceC778060Ufc
                public final void LIZIZ() {
                    this.LIZ.LJJII(EnumC779790UiP.CMD_CLICK_FLOAT_BALL);
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_floating_ball_click");
                    c474500IjALIZ.LJJII(this.LIZ.LJIILIIL(), "anchor_id");
                    c474500IjALIZ.LJJ("screen_share");
                    c474500IjALIZ.LJJII(Long.valueOf(this.LIZ.LJIILL()), "room_id");
                    c474500IjALIZ.LJJII("ball", "click_icon");
                    c474500IjALIZ.LIZ();
                }

                @Override // X.InterfaceC778060Ufc
                public final void LIZLLL() {
                    C776870Udh c776870Udh = this.LIZ;
                    EnumC779790UiP enumC779790UiP = EnumC779790UiP.CMD_DRAG_MOVE_END;
                    enumC779790UiP.setParam(new C779860UiW(true));
                    c776870Udh.LJJII(enumC779790UiP);
                }

                @Override // X.InterfaceC778060Ufc
                public final void LJ() {
                    this.LIZ.LJJII(EnumC779790UiP.CMD_DRAG_MOVE_START);
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_floating_ball_drag");
                    c474500IjALIZ.LJJII(this.LIZ.LJIILIIL(), "anchor_id");
                    c474500IjALIZ.LJJ("screen_share");
                    c474500IjALIZ.LJJII(Long.valueOf(this.LIZ.LJIILL()), "room_id");
                    c474500IjALIZ.LIZ();
                }

                @Override // X.InterfaceC778060Ufc
                public final void LJFF(int i, int i2) {
                    C776870Udh c776870Udh = this.LIZ;
                    EnumC779790UiP enumC779790UiP = EnumC779790UiP.CMD_DRAG_ONGOING;
                    enumC779790UiP.setParam(new C779860UiW(true));
                    c776870Udh.LJJII(enumC779790UiP);
                }
            };
            if (gameFloatWindowMsgStrategySetting.getConfig().enableStrategyChat) {
                c776900Udk.LJIILJJIL = 262144;
            }
            c776900Udk.LJIILIIL = new InterfaceC779170UhP() { // from class: X.0UhZ
                public final int LIZ = (int) C497740JfY.LIZIZ(6.0f);

                @Override // X.InterfaceC779170UhP
                public final void LJ(ConstraintFloatWindowLayout constraintFloatWindowLayout) {
                }

                @Override // X.InterfaceC779170UhP
                public final int getResId() {
                    return R.id.my_;
                }

                @Override // X.InterfaceC779170UhP
                public final void LJFF(int i, int i2, View view) {
                    C19O5 c19o5 = new C19O5(view);
                    c19o5.LIZIZ(1);
                    c19o5.LIZIZ(3);
                    c19o5.LIZIZ(2);
                    c19o5.LIZIZ(4);
                    if (i == R.id.mya) {
                        if (i2 != 3 && i2 != 4) {
                            c19o5.LIZ(2, i, 1, this.LIZ);
                        } else {
                            c19o5.LIZ(1, i, 2, this.LIZ);
                        }
                        if (i2 != 2 && i2 != 4) {
                            c19o5.LIZ(3, i, 3, 0);
                            return;
                        } else {
                            c19o5.LIZ(4, i, 4, 0);
                            return;
                        }
                    }
                    if (i != R.id.myc) {
                        return;
                    }
                    c19o5.LIZ(1, i, 1, 0);
                    c19o5.LIZ(3, i, 3, 0);
                    c19o5.LIZ(4, i, 4, 0);
                }
            };
            c776900Udk.LIZ();
        }
        if (this.LJI != null && (!z3 || C520010KaN.LJJIIJZLJL(this.LIZIZ) != null)) {
            C784630UqD c784630UqDZL = ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).zL(this.LJI, this.LJJLI, new InterfaceC784660UqG() { // from class: X.0Udx
                @Override // X.InterfaceC784660UqG
                public final void LIZ() throws Exception {
                    this.LIZ.LIZIZ.jH(true, Boolean.TRUE);
                }

                @Override // X.InterfaceC784660UqG
                public final long LIZIZ() {
                    return this.LIZ.LIZIZ.LLJJJIL;
                }

                @Override // X.InterfaceC784660UqG
                public final void LIZJ() {
                    this.LIZ.LJJIII("audience", false, true);
                }

                @Override // X.InterfaceC784660UqG
                public final void LIZLLL() {
                    this.LIZ.LJJIII("setting", true, false);
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_floating_setting_click");
                    c474500IjALIZ.LJJII(this.LIZ.LJIILIIL(), "anchor_id");
                    c474500IjALIZ.LJJII(Long.valueOf(this.LIZ.LJIILL()), "room_id");
                    c474500IjALIZ.LJJII("screen_share", "live_type");
                    c474500IjALIZ.LIZ();
                }

                @Override // X.InterfaceC784660UqG
                public final void LJI() {
                    this.LIZ.LJJIII("home", false, false);
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_floating_ball_click");
                    c474500IjALIZ.LJJII(this.LIZ.LJIILIIL(), "anchor_id");
                    c474500IjALIZ.LJJ("screen_share");
                    c474500IjALIZ.LJJII(Long.valueOf(this.LIZ.LJIILL()), "room_id");
                    c474500IjALIZ.LJJII("home", "click_icon");
                    c474500IjALIZ.LJJII(Integer.valueOf(InterfaceC772390URp.LLLZ.LIZIZ().booleanValue() ? 1 : 0), "notification_status");
                    c474500IjALIZ.LIZ();
                }

                @Override // X.InterfaceC784660UqG
                public final long getRoomId() {
                    Long l = (Long) this.LIZ.LIZJ.gg0(C751340Tdc.class);
                    if (l != null) {
                        return l.longValue();
                    }
                    return 0L;
                }

                @Override // X.InterfaceC784660UqG
                public final boolean LJFF(boolean z4) {
                    int iIntValue;
                    boolean z5;
                    AbstractC776930Udn abstractC776930Udn2;
                    Integer num = (Integer) this.LIZ.LIZJ.gg0(C750110Tbd.class);
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    C776870Udh c776870Udh = this.LIZ;
                    if (iIntValue >= c776870Udh.LJFF) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z4) {
                        if (z5) {
                            if (GameFloatTipsOptimize.INSTANCE.isExperimentGroup()) {
                                C777840UfG.LJII(new AbstractC777950UfR() { // from class: X.0Ueb
                                    public final EnumC777930UfP LJ;
                                    public final EnumC777480Ueg LJFF;
                                    public final CharSequence LJI;

                                    {
                                        int pauseTimes = LivePauseTimeSetting.INSTANCE.getPauseTimes();
                                        this.LJ = EnumC777930UfP.PRIORITY_TYPE_P3;
                                        this.LJFF = EnumC777480Ueg.PAUSE;
                                        this.LJI = C497740JfY.LJIJJ(2131855019, Integer.valueOf(pauseTimes));
                                    }

                                    @Override // X.AbstractC777950UfR
                                    public final EnumC777930UfP LIZJ() {
                                        return this.LJ;
                                    }

                                    @Override // X.AbstractC777950UfR
                                    public final CharSequence LIZLLL() {
                                        return this.LJI;
                                    }

                                    @Override // X.AbstractC777950UfR
                                    public final EnumC777480Ueg LJ() {
                                        return this.LJFF;
                                    }
                                });
                            } else {
                                this.LIZ.LJIIIZ(EnumC778100Ufg.LIVE_TIP_MESSAGE_PAUSE_TIP.ordinal(), null, C497740JfY.LJIJJ(2131855019, Integer.valueOf(this.LIZ.LJFF)), null, true);
                            }
                            AbstractC776930Udn abstractC776930Udn3 = this.LIZ.LJIIZILJ;
                            if (abstractC776930Udn3 != null) {
                                abstractC776930Udn3.LJIIJJI(true);
                            }
                            this.LIZ.LJIL(z4, true);
                            return false;
                        }
                        c776870Udh.LIZJ.zW(GameBroadcastStateChannel.class, C0TD3.STATE_PAUSE);
                        this.LIZ.LIZJ.zW(PauseLiveChannel.class, Boolean.valueOf(z4));
                        this.LIZ.LIZJ.SX0(C750110Tbd.class, Integer.valueOf(iIntValue + 1));
                    } else {
                        if (Build.VERSION.SDK_INT >= 34) {
                            c776870Udh.LIZJ.zW(GameBroadcastStateChannel.class, C0TD3.STATE_RESUMING);
                        } else {
                            c776870Udh.LIZJ.zW(GameBroadcastStateChannel.class, C0TD3.STATE_CONNECTED);
                        }
                        this.LIZ.LIZJ.zW(PauseLiveChannel.class, Boolean.valueOf(z4));
                        if (z5 && (abstractC776930Udn2 = this.LIZ.LJIIZILJ) != null) {
                            abstractC776930Udn2.LJIIJJI(true);
                        }
                        if (EnableScreenCaptureInterruptCheckSetting.INSTANCE.enable()) {
                            try {
                                C777840UfG.LIZIZ(EnumC777480Ueg.CAPTURE_ERROR);
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                C20441214yg.LJFF("GameUiStrategy", "STATE_RESUMING", e);
                            }
                        }
                    }
                    this.LIZ.LJIL(z4, false);
                    return true;
                }

                @Override // X.InterfaceC784660UqG
                public final void LJII(List<? extends AbstractC1110800f0o<? extends AbstractC1136060ffY>> list) {
                    boolean z4;
                    long id;
                    C776870Udh c776870Udh = this.LIZ;
                    DataChannel dataChannel = c776870Udh.LIZJ;
                    if (!list.isEmpty()) {
                        GameLiveInfo gameLiveInfo = (GameLiveInfo) DataChannelGlobal.LLILZ.gg0(C931360aLO.class);
                        if (gameLiveInfo != null) {
                            z4 = gameLiveInfo.hasGameLive;
                        } else {
                            z4 = true;
                        }
                        Map<String, Object> map = C1338270kvh.LIZ;
                        if (!z4 && !c776870Udh.LJII) {
                            Iterator<? extends AbstractC1110800f0o<? extends AbstractC1136060ffY>> it2 = list.iterator();
                            while (it2.hasNext()) {
                                if (it2.next().LJIL.getMessageType() == C001A.CHAT) {
                                    boolean zIsAppForeground = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isAppForeground();
                                    Map<String, Object> map2 = C1338270kvh.LIZ;
                                    c776870Udh.LJII = true;
                                    if (zIsAppForeground) {
                                        C777060Ue0.LIZIZ(EnumC777090Ue3.FirstComment, EnumC777070Ue1.InApp);
                                        IMessageManager iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class);
                                        Room room = (Room) dataChannel.gg0(RoomChannel.class);
                                        String strLJIJI = C497740JfY.LJIJI(2131841801);
                                        if (room != null) {
                                            id = room.getId();
                                        } else {
                                            id = 0;
                                        }
                                        RoomMessage roomMessageLJ = C181500mr.LJ(id, strLJIJI);
                                        if (iMessageManager != null) {
                                            iMessageManager.insertMessage(roomMessageLJ, true);
                                            return;
                                        }
                                        return;
                                    }
                                    if (GameFloatTipsOptimize.INSTANCE.isExperimentGroup()) {
                                        C777840UfG.LJII(new C777450Ued(EnumC777090Ue3.FirstComment));
                                        return;
                                    } else {
                                        C777060Ue0.LIZIZ(EnumC777090Ue3.FirstComment, EnumC777070Ue1.Hover);
                                        c776870Udh.LJIIIZ(EnumC778100Ufg.LIVE_TIP_MESSAGE_FIRST_CHAT_MESSAGE.ordinal(), null, C497740JfY.LJIJI(2131841801), null, true);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }

                @Override // X.InterfaceC784660UqG
                public final void LJ(int i, int i2) {
                    this.LIZ.getClass();
                    C778030UfZ c778030UfZ = (C778030UfZ) C776920Udm.LIZ("msg_view");
                    if (c778030UfZ != null) {
                        C779160UhO c779160UhO = c778030UfZ.LIZ;
                        ConstraintFloatWindowLayout.LayoutParams layoutParams = c779160UhO.LIZJ;
                        int i3 = ((WindowManager.LayoutParams) layoutParams).x;
                        int i4 = ((WindowManager.LayoutParams) layoutParams).y;
                        int i5 = i3 + i;
                        C776900Udk c776900Udk2 = c778030UfZ.LIZIZ;
                        if (c776900Udk2.LJI != 0) {
                            c776900Udk2.LJ = i5;
                            c779160UhO.LJIILJJIL(i5);
                            int i6 = i4 + i2;
                            C776900Udk c776900Udk3 = c778030UfZ.LIZIZ;
                            if (c776900Udk3.LJI != 0) {
                                c776900Udk3.LJFF = i6;
                                C779160UhO c779160UhO2 = c778030UfZ.LIZ;
                                if (!c779160UhO2.LJ) {
                                    ((WindowManager.LayoutParams) c779160UhO2.LIZJ).y = i6;
                                    C779160UhO.LJIIJ(new ARunnableS112S0100000_12(c779160UhO2, 13));
                                    return;
                                }
                                return;
                            }
                            throw new IllegalArgumentException("Current type window can not be move!");
                        }
                        throw new IllegalArgumentException("Current type window can not be move!");
                    }
                }
            }, this.LIZJ);
            this.LJIIZILJ = c784630UqDZL;
            InterfaceC1110630f0X interfaceC1110630f0X = this.LJIILL;
            if (interfaceC1110630f0X != null && c784630UqDZL != null) {
                c784630UqDZL.LJII(interfaceC1110630f0X);
            }
            if (GameFloatWindowMsgStrategySetting.INSTANCE.getConfig().enableStrategyChat && (abstractC776930Udn = this.LJIIZILJ) != null) {
                abstractC776930Udn.setDetectLayoutListener(new ATListenerS446S0100000_12(this, 26));
            }
            C776900Udk c776900Udk2 = new C776900Udk(C497740JfY.LJII());
            c776900Udk2.LIZIZ = this.LJIIZILJ;
            c776900Udk2.LJIIJJI = "msg_view";
            c776900Udk2.LJI = 2;
            c776900Udk2.LJII = 0;
            c776900Udk2.LJIIIIZZ = 0;
            AccelerateDecelerateInterpolator accelerateDecelerateInterpolator2 = new AccelerateDecelerateInterpolator();
            c776900Udk2.LJIIIZ = 300L;
            c776900Udk2.LJIIJ = accelerateDecelerateInterpolator2;
            c776900Udk2.LJIIL = new C779830UiT() { // from class: X.0UiM
                @Override // X.InterfaceC778060Ufc
                public final void LIZLLL() {
                    C776870Udh c776870Udh = this.LIZ;
                    EnumC779790UiP enumC779790UiP = EnumC779790UiP.CMD_DRAG_MOVE_END;
                    enumC779790UiP.setParam(new C779860UiW(false));
                    c776870Udh.LJJII(enumC779790UiP);
                    this.LIZ.LJJZ = false;
                }

                @Override // X.InterfaceC778060Ufc
                public final void LJ() {
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_floating_ball_drag");
                    c474500IjALIZ.LJJII(this.LIZ.LJIILIIL(), "anchor_id");
                    c474500IjALIZ.LJJ("screen_share");
                    c474500IjALIZ.LJJII(Long.valueOf(this.LIZ.LJIILL()), "room_id");
                    c474500IjALIZ.LIZ();
                    this.LIZ.LJJII(EnumC779790UiP.CMD_DRAG_MOVE_START);
                    this.LIZ.LJJZ = true;
                }

                @Override // X.InterfaceC778060Ufc
                public final void LJFF(int i, int i2) {
                    C776870Udh c776870Udh = this.LIZ;
                    EnumC779790UiP enumC779790UiP = EnumC779790UiP.CMD_DRAG_ONGOING;
                    enumC779790UiP.setParam(new C779860UiW(false));
                    c776870Udh.LJJII(enumC779790UiP);
                }
            };
            c776900Udk2.LJIILIIL = new InterfaceC779170UhP() { // from class: X.0Uha
                public final int LIZ = (int) C497740JfY.LIZIZ(6.0f);

                @Override // X.InterfaceC779170UhP
                public final void LJ(ConstraintFloatWindowLayout constraintFloatWindowLayout) {
                }

                @Override // X.InterfaceC779170UhP
                public final int getResId() {
                    return R.id.mya;
                }

                @Override // X.InterfaceC779170UhP
                public final void LJFF(int i, int i2, View view) {
                    C19O5 c19o5 = new C19O5(view);
                    c19o5.LIZIZ(1);
                    c19o5.LIZIZ(3);
                    c19o5.LIZIZ(2);
                    c19o5.LIZIZ(4);
                    if (i == R.id.myc || i == R.id.my_) {
                        if (i2 != 3 && i2 != 4) {
                            c19o5.LIZ(1, R.id.my_, 2, this.LIZ);
                        } else {
                            c19o5.LIZ(2, R.id.my_, 1, this.LIZ);
                        }
                        if (i2 != 2 && i2 != 4) {
                            c19o5.LIZ(3, R.id.my_, 3, 0);
                        } else {
                            c19o5.LIZ(4, R.id.my_, 4, 0);
                        }
                    }
                }
            };
            c776900Udk2.LIZ();
            GameBroadcastFragment gameBroadcastFragment = this.LIZIZ;
            gameBroadcastFragment.getDataChannel().BQ2(gameBroadcastFragment, ChatMessageReplaceEvent.class, new AwS591S0100000_12(this, 1093));
            this.LJIILJJIL.LIZ(C784440Upu.LIZ().LJ(C251900yD.class).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS181S0100000_12(this, 279)));
            gameBroadcastFragment.getDataChannel().CQ2(GameLiveFloatBallTipsUpdateEvent.class, gameBroadcastFragment, new AwS591S0100000_12(this, 1095));
            if (EnableGameBroadcastFrameSetting.INSTANCE.enable()) {
                gameBroadcastFragment.getDataChannel().BQ2(gameBroadcastFragment, GameBroadcastFrameEndEvent.class, new AwS378S0200000_12(this, gameBroadcastFragment, 93));
            }
            Boolean bool = (Boolean) this.LIZJ.gg0(PauseLiveChannel.class);
            if (bool != null) {
                boolean zBooleanValue = bool.booleanValue();
                AbstractC776930Udn abstractC776930Udn2 = this.LJIIZILJ;
                if (abstractC776930Udn2 != null) {
                    abstractC776930Udn2.LJIIL(zBooleanValue);
                }
            }
        }
        Context contextN3 = C786410Ut5.N3(C497740JfY.LJII());
        if (contextN3 != null) {
            this.LJIJ = new C779480Uhu(contextN3, this.LJIILLIIL);
            GameFloatWindowMsgStrategySetting gameFloatWindowMsgStrategySetting2 = GameFloatWindowMsgStrategySetting.INSTANCE;
            if (gameFloatWindowMsgStrategySetting2.getConfig().enableStrategyChat && ((z = (c779480Uhu = this.LJIJ) instanceof C776950Udp))) {
                if (c779480Uhu != null) {
                    c779480Uhu.LL = this.LJJLIIIJLJLI;
                }
                if (z && c779480Uhu != null) {
                    c779480Uhu.LLILLJJLI = this.LJJLIIIJLLLLLLLZ;
                }
            }
            C779480Uhu c779480Uhu2 = this.LJIJ;
            if (c779480Uhu2 != null) {
                c779480Uhu2.setDataChannel(this.LIZJ);
            }
            C776900Udk c776900Udk3 = new C776900Udk(C497740JfY.LJII());
            c776900Udk3.LIZIZ = this.LJIJ;
            c776900Udk3.LJIIJJI = "small_view";
            c776900Udk3.LJI = 2;
            c776900Udk3.LJII = 0;
            c776900Udk3.LJIIIIZZ = 0;
            AccelerateDecelerateInterpolator accelerateDecelerateInterpolator3 = new AccelerateDecelerateInterpolator();
            c776900Udk3.LJIIIZ = 300L;
            c776900Udk3.LJIIJ = accelerateDecelerateInterpolator3;
            c776900Udk3.LJIIL = new C779830UiT() { // from class: X.0UiO
                @Override // X.C779830UiT, X.InterfaceC778060Ufc
                public final void LIZIZ() {
                    this.LIZ.LJJII(EnumC779790UiP.CMD_CLICK_SMALL_WINDOW);
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_floating_ball_click");
                    c474500IjALIZ.LJJII(this.LIZ.LJIILIIL(), "anchor_id");
                    c474500IjALIZ.LJJ("screen_share");
                    c474500IjALIZ.LJJII(Long.valueOf(this.LIZ.LJIILL()), "room_id");
                    c474500IjALIZ.LJJII("folded", "click_icon");
                    c474500IjALIZ.LIZ();
                }

                @Override // X.InterfaceC778060Ufc
                public final void LIZLLL() {
                    C776870Udh c776870Udh = this.LIZ;
                    EnumC779790UiP enumC779790UiP = EnumC779790UiP.CMD_DRAG_MOVE_END;
                    enumC779790UiP.setParam(new C779860UiW(false));
                    c776870Udh.LJJII(enumC779790UiP);
                }

                @Override // X.InterfaceC778060Ufc
                public final void LJ() {
                    this.LIZ.LJJII(EnumC779790UiP.CMD_DRAG_MOVE_START);
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_floating_ball_drag");
                    c474500IjALIZ.LJJII(this.LIZ.LJIILIIL(), "anchor_id");
                    c474500IjALIZ.LJJ("screen_share");
                    c474500IjALIZ.LJJII(Long.valueOf(this.LIZ.LJIILL()), "room_id");
                    c474500IjALIZ.LIZ();
                }

                @Override // X.InterfaceC778060Ufc
                public final void LJFF(int i, int i2) {
                    C776870Udh c776870Udh = this.LIZ;
                    EnumC779790UiP enumC779790UiP = EnumC779790UiP.CMD_DRAG_ONGOING;
                    enumC779790UiP.setParam(new C779860UiW(false));
                    c776870Udh.LJJII(enumC779790UiP);
                }
            };
            if (gameFloatWindowMsgStrategySetting2.getConfig().enableStrategyChat) {
                c776900Udk3.LJIILJJIL = 262144;
            }
            c776900Udk3.LJIILIIL = new InterfaceC779170UhP() { // from class: X.0Uhb
                @Override // X.InterfaceC779170UhP
                public final void LJ(ConstraintFloatWindowLayout constraintFloatWindowLayout) {
                }

                @Override // X.InterfaceC779170UhP
                public final int getResId() {
                    return R.id.myc;
                }

                @Override // X.InterfaceC779170UhP
                public final void LJFF(int i, int i2, View view) {
                    C19O5 c19o5 = new C19O5(view);
                    if (i != R.id.my_ && i != R.id.mya) {
                        if (i == R.id.myc) {
                            c19o5.LIZIZ(1);
                            c19o5.LIZIZ(3);
                            c19o5.LIZIZ(2);
                            c19o5.LIZIZ(4);
                            return;
                        }
                        return;
                    }
                    c19o5.LIZ(1, R.id.my_, 1, 0);
                    c19o5.LIZ(3, R.id.my_, 3, 0);
                    c19o5.LIZ(4, R.id.my_, 4, 0);
                }
            };
            c776900Udk3.LIZ();
        }
        if (this.LJIJJLI == null) {
            C779260UhY c779260UhY = new C779260UhY(C786410Ut5.N3(C497740JfY.LJII()), C786410Ut5.Sd(R.layout.hst, C786410Ut5.ne(C497740JfY.LJII()), null));
            this.LJIJJLI = c779260UhY;
            DataChannel dataChannel = this.LIZJ;
            c779260UhY.LJII = dataChannel;
            if (dataChannel != null) {
                dataChannel.CQ2(NewMessageNumChannel.class, c779260UhY, new AwS591S0100000_12(c779260UhY, 1088));
            }
        }
        C779240UhW c779240UhW = new C779240UhW(this.LJJLIIJ, this.LJJLIL, this.LIZJ);
        if (GameFloatTipsOptimize.INSTANCE.isExperimentGroup()) {
            Context context2 = this.LIZIZ.getContext();
            if (context2 == null) {
                context2 = C786410Ut5.N3(C497740JfY.LJII());
            }
            C778020UfY c778020UfY = new C778020UfY(context2);
            DataChannel dataChannel2 = this.LIZJ;
            dataChannel2.CQ2(GameBackgroundColorChannel.class, c778020UfY, new AwS591S0100000_12(c778020UfY, 1112));
            c778020UfY.LJIIJ = dataChannel2;
            AbstractC776930Udn abstractC776930Udn3 = this.LJIIZILJ;
            if (abstractC776930Udn3 != null) {
                C011Z.LIZ.getClass();
                C776980Uds c776980Uds = C783380UoC.LIZ.LIZ;
                c776980Uds.getClass();
                ((ConcurrentHashMap) c776980Uds.LIZ).put(Integer.valueOf(R.drawable.elv), new C783400UoE(0));
                C0H18 c0h18 = new C0H18(abstractC776930Udn3.getContext(), null, 0);
                abstractC776930Udn3.setTipsView(c0h18);
                this.LJJJJI = new C778010UfX(c778020UfY, c0h18);
            }
        } else {
            C778590UgT c778590UgT = new C778590UgT(0);
            DataChannel dataChannel3 = this.LIZJ;
            dataChannel3.CQ2(GameBackgroundColorChannel.class, c778590UgT, new AwS591S0100000_12(c778590UgT, 1106));
            c778590UgT.LJIILJJIL = dataChannel3;
            AbstractC776930Udn abstractC776930Udn4 = this.LJIIZILJ;
            if (abstractC776930Udn4 != null) {
                C011Z.LIZ.getClass();
                C776980Uds c776980Uds2 = C783380UoC.LIZ.LIZ;
                c776980Uds2.getClass();
                ((ConcurrentHashMap) c776980Uds2.LIZ).put(Integer.valueOf(R.drawable.elv), new C783400UoE(0));
                C778600UgU c778600UgU = new C778600UgU(abstractC776930Udn4.getContext(), null, 0);
                abstractC776930Udn4.setTipsView(c778600UgU);
                this.LJJJJI = new C778110Ufh(c778590UgT, c778600UgU, new AwS661S0100000_12(this, 5));
            }
        }
        final C779420Uho c779420Uho = new C779420Uho(LJIILL(), LJIILIIL(), C14KS.LJI(this.LIZIZ.getContext()), C14KS.LJ(this.LIZIZ.getContext()));
        this.LIZJ.SX0(C777870UfJ.class, c779420Uho);
        this.LJJI = new C779530Uhz(this.LIZJ, this.LJIIZILJ, this.LJJJJI, this);
        this.LJIL = new C777220UeG();
        AbstractC776850Udf abstractC776850UdfLIZ = C776920Udm.LIZ("control_view");
        C778030UfZ c778030UfZ = abstractC776850UdfLIZ instanceof C778030UfZ ? (C778030UfZ) abstractC776850UdfLIZ : null;
        C778030UfZ c778030UfZ2 = (C778030UfZ) C776920Udm.LIZ("msg_view");
        AbstractC776850Udf abstractC776850UdfLIZ2 = C776920Udm.LIZ("small_view");
        C778030UfZ c778030UfZ3 = abstractC776850UdfLIZ2 instanceof C778030UfZ ? (C778030UfZ) abstractC776850UdfLIZ2 : null;
        if (c778030UfZ != null && c778030UfZ2 != null && c778030UfZ3 != null) {
            C779880UiY c779880UiY = new C779880UiY(c778030UfZ, c778030UfZ2, this.LJIJJ, this.LJJJJI, c778030UfZ3, this.LJIJJLI, this.LIZLLL, c779240UhW, this.LJJI);
            C777220UeG c777220UeG = this.LJIL;
            if (c777220UeG != null) {
                ((ArrayList) c779880UiY.LJIIL).add(c777220UeG);
            }
            ((ArrayList) c779880UiY.LJIIL).add(new InterfaceC780000Uik() { // from class: X.0Uhn
                @Override // X.InterfaceC780000Uik
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC780000Uik
                public final void LLLFF() {
                }

                @Override // X.InterfaceC780000Uik
                public final void onInit() {
                }

                @Override // X.InterfaceC780000Uik
                public final void LIZ() {
                    c779420Uho.LIZIZ(EnumC779430Uhp.UNFOLDED);
                }

                @Override // X.InterfaceC780000Uik
                public final void LIZJ() {
                    c779420Uho.LIZIZ(EnumC779430Uhp.FOLDED);
                }

                @Override // X.InterfaceC780000Uik
                public final void LIZLLL() {
                    c779420Uho.LIZIZ(EnumC779430Uhp.ADSORBED);
                }

                @Override // X.InterfaceC780000Uik
                public final void LJJJIL() {
                    c779420Uho.LIZIZ(EnumC779430Uhp.HIDDEN);
                }
            });
            this.LJIILLIIL = c779880UiY;
        }
        InterfaceC779960Uig interfaceC779960Uig = this.LJJJJI;
        if ((interfaceC779960Uig instanceof C778010UfX) && (c778010UfX = (C778010UfX) interfaceC779960Uig) != null) {
            c778010UfX.LJI = this.LJIILLIIL;
        }
        C779880UiY c779880UiY2 = this.LJIILLIIL;
        c779240UhW.LJIIL = c779880UiY2;
        C779260UhY c779260UhY2 = this.LJIJJLI;
        if (c779260UhY2 != null) {
            c779260UhY2.LJI = c779880UiY2;
        }
        C437170HCh.LIZ(this.LJIIZILJ, this.LIZIZ);
        AbstractC776930Udn abstractC776930Udn5 = this.LJIIZILJ;
        if (abstractC776930Udn5 != null) {
            ViewTreeLifecycleOwner.set(abstractC776930Udn5, abstractC776930Udn5);
        }
        C437170HCh.LIZ(c779240UhW.LIZLLL, this.LIZIZ);
        View view = c779240UhW.LIZLLL;
        if (view != null) {
            ViewTreeLifecycleOwner.set(view, this.LJIIZILJ);
        }
        LJJII(EnumC779790UiP.CMD_TRANSITION_TO_INIT);
        LJJII(EnumC779790UiP.CMD_TRANSITION_TO_HIDDEN);
        C778080Ufe c778080Ufe = new C778080Ufe(this.LIZJ);
        this.LJJLJLI = c778080Ufe;
        c778080Ufe.LIZ(this.LJJLIIIIJ);
    }

    public final String LJIILIIL() {
        return (String) this.LJJJJLL.getValue();
    }

    public final Context LJIILJJIL() {
        return this.LIZIZ.getContext();
    }

    public final long LJIILL() {
        return ((Number) this.LJJJJL.getValue()).longValue();
    }

    public final C474500IjA LJIIZILJ() {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_game_rotate_screen_rotation");
        c474500IjALIZ.LJJII(LJIILIIL(), "anchor_id");
        c474500IjALIZ.LJJ("screen_share");
        c474500IjALIZ.LJJII(Long.valueOf(LJIILL()), "room_id");
        return c474500IjALIZ;
    }

    public final boolean LJIJ() {
        C779880UiY c779880UiY = this.LJIILLIIL;
        if (c779880UiY != null) {
            return c779880UiY.LJIIJJI();
        }
        return false;
    }

    public final boolean LJIJI() {
        C779880UiY c779880UiY;
        return (this.LJJLIIIJJI != 32 || (c779880UiY = this.LJIILLIIL) == null || C1697810uHb.LJIIJJI(c779880UiY.LJJIIZ, c779880UiY.LJJIIZI, c779880UiY.LJJIJ).contains(c779880UiY.LJIL)) ? false : true;
    }

    public static void LJJIFFI(Runnable runnable) {
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            runnable.run();
        } else {
            C786410Ut5.LJJZZIII(C473410IhP.LIZ(), runnable);
        }
    }

    @Override // X.InterfaceC778270Ufx
    public final void LIZ(Cert cert) {
        this.LIZIZ.Vf(1, cert);
    }

    @Override // X.InterfaceC778270Ufx
    public final void LJFF(AbstractC777950UfR abstractC777950UfR) {
        if (this.LJIILIIL || !LJIJ()) {
            return;
        }
        LJJIFFI(new ARunnableS45S0300000_12(this, EnumC779790UiP.CMD_NEW_TIP, abstractC777950UfR, 28));
    }

    @Override // X.InterfaceC778270Ufx
    public final void LJIIIIZZ(C777860UfI c777860UfI) {
        if (this.LJIILIIL || !LJIJ()) {
            return;
        }
        LJJIFFI(new ARunnableS45S0300000_12(this, EnumC779790UiP.CMD_HIDE_TIP, c777860UfI, 27));
    }

    public final void LJIJJ(boolean z) {
        boolean z2;
        String str;
        if (!TtliveGameEnableIntelligentRotationSetting.INSTANCE.isEnable()) {
            return;
        }
        Map<String, Object> map = C1338270kvh.LIZ;
        this.LJJIIZ = z;
        C474500IjA c474500IjALJIIZILJ = LJIIZILJ();
        if (!z) {
            boolean z3 = false;
            if (!this.LJJIII && Intrinsics.LJFF(InterfaceC772390URp.t.LIZIZ(), Boolean.TRUE)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.LJJII && C500260Jjc.LJJIFFI(Boolean.valueOf(this.LJJIFFI))) {
                z3 = true;
            }
            if (!z2 && !z3) {
                c474500IjALJIIZILJ.LJJII("resume_normal", Scene.SCENE_SERVICE);
                LJJI(c474500IjALJIIZILJ, this.LJJII);
                return;
            }
            boolean z4 = this.LJJIIZ;
            boolean z5 = this.LJJIFFI;
            if (z2) {
                str = "resume_app";
            } else {
                str = "resume_foreground";
            }
            c474500IjALJIIZILJ.LJJII(Integer.valueOf(z4 ? 1 : 0), "pause_status");
            c474500IjALJIIZILJ.LJJII(Integer.valueOf(z5 ? 1 : 0), "background_status");
            c474500IjALJIIZILJ.LJJII(str, Scene.SCENE_SERVICE);
            this.LJIILJJIL.LIZ(C11NZ.LJLJJLL(Mp4ScreenVideoLoadTimeout.CONTROL, TimeUnit.MILLISECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS148S0200000_12(this, c474500IjALJIIZILJ, 63), new C09JN() { // from class: X.011X
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("GameUiStrategy@3ab.onLiveStreamPaused$2");
                    C20441214yg.LIZLLL(((Throwable) obj).getMessage());
                    C1C7U.LIZIZ("GameUiStrategy@3ab.onLiveStreamPaused$2");
                }
            }));
            if (!z3) {
                return;
            }
            this.LJJIIZI = true;
        }
    }

    public final void LJJ(boolean z) {
        int i;
        GameTag gameTag;
        String str;
        Long l;
        int i2 = 1;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        if (!this.LJIIJJI) {
            i2 = 2;
        }
        C754670Tiz c754670Tiz = EnumC754690Tj1.Companion;
        LiveMode liveMode = LiveMode.SCREEN_RECORD;
        c754670Tiz.getClass();
        EnumC754690Tj1 enumC754690Tj1LIZ = C754670Tiz.LIZ(liveMode);
        if (enumC754690Tj1LIZ != null) {
            gameTag = enumC754690Tj1LIZ.getGameTag();
        } else {
            gameTag = null;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_game_smart_steering_event");
        c474500IjALIZ.LJJII(LJIILIIL(), "anchor_id");
        c474500IjALIZ.LJJII("screen_share", "live_type");
        c474500IjALIZ.LJJII(Long.valueOf(LJIILL()), "room_id");
        Object obj = "null";
        if (gameTag == null || (str = gameTag.showName) == null) {
            str = "null";
        }
        c474500IjALIZ.LJJII(str, "game_label");
        if (gameTag != null && (l = gameTag.id) != null) {
            obj = l;
        }
        c474500IjALIZ.LJJII(obj, "game_label_id");
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "game_orientation");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "adjust_orientation");
        c474500IjALIZ.LIZ();
    }

    public final void LJJII(EnumC779790UiP enumC779790UiP) {
        C779880UiY c779880UiY = this.LJIILLIIL;
        if (c779880UiY != null) {
            c779880UiY.LJI(enumC779790UiP);
        }
    }

    public static Intent LJIILLIIL(MediaProjectionManager mediaProjectionManager, Cert cert) {
        if (Build.VERSION.SDK_INT >= 34) {
            C20441214yg.LIZIZ("GameUiStrategy", "getScreenCaptureIntent when sdk version greater than 34.");
            return C0TPX.LIZIZ(mediaProjectionManager, MediaProjectionConfig.createConfigForDefaultDisplay(), cert);
        }
        C20441214yg.LIZIZ("GameUiStrategy", "getScreenCaptureIntent when sdk version smaller than 34.");
        return C0TPX.LIZJ(mediaProjectionManager, cert);
    }

    @Override // X.InterfaceC500720JkM
    public final void LIZJ(String str, String str2) {
        long id;
        if (this.LIZIZ.isAdded() && !((LiveDialogFragment) this.LJJIJL.getValue()).isShowing()) {
            GameMessageAlertDialog gameMessageAlertDialog = (GameMessageAlertDialog) this.LJJIJL.getValue();
            FragmentManager childFragmentManager = this.LIZIZ.getChildFragmentManager();
            gameMessageAlertDialog.LLILLL = str;
            gameMessageAlertDialog.LLILZ = str2;
            gameMessageAlertDialog.show(childFragmentManager, "GameMessageAlertDialog");
            if (Intrinsics.LJFF(str, "in_app") && gameMessageAlertDialog.LLILZLL) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_overlay_settings_show");
                c474500IjALIZ.LJJII(String.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
                Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                if (room != null) {
                    id = room.getId();
                } else {
                    id = 0;
                }
                c474500IjALIZ.LJJII(Long.valueOf(id), "room_id");
                c474500IjALIZ.LJJII("screen_share", "live_type");
                c474500IjALIZ.LJJII(str, "enter_from");
                c474500IjALIZ.LJJII(str2, "tab_name");
                c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(C0W78.LJFF(C497740JfY.LJII()))) ? 1 : 0), "overlay_permission");
                c474500IjALIZ.LIZ();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0Udi] */
    public final void LJIJJLI(Intent intent, Cert cert) {
        boolean z;
        int iValueOf;
        String str;
        IMessageManager iMessageManager;
        boolean z2;
        if (C500260Jjc.LJJJI((Boolean) this.LIZJ.gg0(C755590TkT.class))) {
            return;
        }
        GameBroadcastFragment gameBroadcastFragment = this.LIZIZ;
        C20441214yg.LJIIIZ("GameUiStrategy", "onProjectReady");
        this.LJJIJ = intent;
        IMessageManager iMessageManagerMessageManagerProvider = (IMessageManager) gameBroadcastFragment.getDataChannel().gg0(C776250Uch.class);
        if (iMessageManagerMessageManagerProvider == null) {
            IMessageService iMessageService = (IMessageService) C1161920gLG.LIZJ(IMessageService.class);
            long id = gameBroadcastFragment.PR().getId();
            Creator creator = gameBroadcastFragment.PR().creator;
            if (creator != null) {
                z2 = creator.isAnchorContinueKeepMsg;
            } else {
                z2 = false;
            }
            iMessageManagerMessageManagerProvider = iMessageService.messageManagerProvider(id, true, z2, gameBroadcastFragment.getContext());
        }
        this.LJJLIIIIJ = iMessageManagerMessageManagerProvider;
        DataChannel dataChannel = gameBroadcastFragment.getDataChannel();
        if (dataChannel != null) {
            dataChannel.SX0(C776250Uch.class, this.LJJLIIIIJ);
        }
        gameBroadcastFragment.NR();
        InterfaceC776970Udr interfaceC776970Udr = this.LJJLI;
        if (interfaceC776970Udr != null) {
            interfaceC776970Udr.LJI(this.LJJLIIIIJ);
        }
        InterfaceC777000Udu interfaceC777000Udu = this.LIZLLL;
        if (interfaceC777000Udu != null) {
            interfaceC777000Udu.LJ(this.LJJLIIIIJ);
        }
        C778080Ufe c778080Ufe = this.LJJLJLI;
        if (c778080Ufe != null) {
            c778080Ufe.LIZ(this.LJJLIIIIJ);
        }
        this.LJ = new OnMessageListener() { // from class: X.0Udi
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
            public final void onMessage(IMessage iMessage) {
                C779190UhR c779190UhR;
                String str2;
                String str3;
                C778580UgS c778580UgS;
                int i;
                PunishEventInfo punishEventInfo;
                String str4;
                String str5;
                PerceptionDialogInfo perceptionDialogInfo;
                String str6;
                String str7;
                Map<String, Object> map = C1338270kvh.LIZ;
                if (iMessage instanceof PerceptionMessage) {
                    C776870Udh c776870Udh = this.LL;
                    PerceptionMessage perceptionMessage = (PerceptionMessage) iMessage;
                    c776870Udh.getClass();
                    PunishEventInfo punishEventInfo2 = perceptionMessage.publicEventInfo;
                    String str8 = null;
                    C774940Uaa c774940Uaa = null;
                    if (punishEventInfo2 != null) {
                        str2 = punishEventInfo2.punishType;
                    } else {
                        str2 = null;
                    }
                    if (Intrinsics.LJFF(str2, "muting_cancel") && (perceptionDialogInfo = perceptionMessage.dialog) != null && perceptionDialogInfo.scene == 6) {
                        PunishEventInfo punishEventInfo3 = perceptionMessage.publicEventInfo;
                        if (punishEventInfo3 != null) {
                            str6 = punishEventInfo3.punishId;
                        } else {
                            str6 = null;
                        }
                        long jLIZIZ = C0IZJ.LIZIZ(str6);
                        GameBroadcastFragment gameBroadcastFragment2 = c776870Udh.LIZIZ;
                        if (jLIZIZ == gameBroadcastFragment2.LLJLLIL) {
                            C774940Uaa c774940Uaa2 = gameBroadcastFragment2.LLJJIJIIJIL;
                            if (c774940Uaa2 != null) {
                                c774940Uaa = c774940Uaa2;
                            }
                            InterfaceC769940UIe interfaceC769940UIe = c774940Uaa.LLILZ;
                            if (interfaceC769940UIe != null) {
                                interfaceC769940UIe.LJIIIIZZ(CertProviderManagerKt.findCert("bpea-game_start_audio", 1476788233), false);
                                c774940Uaa.LLJILLL.LIZ.getClass();
                                if (Build.VERSION.SDK_INT > 28 && C774950Uab.LJFF == null) {
                                    C774950Uab.LIZJ = true;
                                    C774950Uab.LIZ();
                                }
                                C775080Uao.LIZ();
                            }
                            c776870Udh.LIZIZ.LLJLLIL = -1L;
                            C778390Ug9 c778390Ug9 = c776870Udh.LJJIJIL;
                            if (c778390Ug9 != null) {
                                c778390Ug9.LLJIJIL = false;
                            }
                            if (GameFloatTipsOptimize.INSTANCE.isExperimentGroup()) {
                                PunishEventInfo punishEventInfo4 = perceptionMessage.publicEventInfo;
                                if (punishEventInfo4 != null && (str7 = punishEventInfo4.punishId) != null) {
                                    C777840UfG.LIZJ(EnumC777480Ueg.NOTICE_CENTER, str7);
                                    return;
                                }
                                return;
                            }
                            c776870Udh.LJIIIZ(EnumC778100Ufg.LIVE_TIP_MESSAGE_MUTING_TIP.ordinal(), null, "", null, false);
                            return;
                        }
                    }
                    PerceptionDialogInfo perceptionDialogInfo2 = perceptionMessage.dialog;
                    if (perceptionDialogInfo2 != null && perceptionDialogInfo2.scene == 6) {
                        if (GameFloatTipsOptimize.INSTANCE.isExperimentGroup()) {
                            PunishEventInfo punishEventInfo5 = perceptionMessage.publicEventInfo;
                            if (punishEventInfo5 == null || (str5 = punishEventInfo5.punishId) == null) {
                                return;
                            }
                            C777840UfG.LIZJ(EnumC777480Ueg.NOTICE_CENTER, str5);
                            return;
                        }
                        EnumC778100Ufg enumC778100Ufg = EnumC778100Ufg.LIVE_TIP_BOTTOM_MESSAGE_CLOSE;
                        c776870Udh.LJIIIZ(enumC778100Ufg.ordinal(), perceptionMessage.publicEventInfo, "", null, false);
                        c776870Udh.LJIIIZ(enumC778100Ufg.ordinal(), perceptionMessage.publicEventInfo, "", null, false);
                        return;
                    }
                    if (GameFloatTipsOptimize.INSTANCE.isExperimentGroup()) {
                        if (perceptionMessage.floatStyle == 5) {
                            return;
                        }
                        PerceptionDialogInfo perceptionDialogInfo3 = perceptionMessage.dialog;
                        if (perceptionDialogInfo3 != null && perceptionDialogInfo3.scene == 7) {
                            perceptionMessage.floatStyle = 6;
                        }
                        Text text = perceptionMessage.floatText;
                        if (text != null) {
                            str8 = text.defaultPattern;
                        }
                        C777840UfG.LJII(new C777500Uei(perceptionMessage.floatStyle, C1133830fbx.LJIILIIL(text, str8).toString(), perceptionMessage.publicEventInfo, Integer.valueOf(perceptionMessage.floatIconType), 16));
                        if (perceptionMessage.floatStyle != 6 || (punishEventInfo = perceptionMessage.publicEventInfo) == null || (str4 = punishEventInfo.punishId) == null) {
                            return;
                        }
                        C777840UfG.LIZLLL(EnumC777480Ueg.NOTICE_CENTER, str4, 180L);
                        return;
                    }
                    C118300cf c118300cf = new C118300cf();
                    int iLIZ = C777110Ue5.LIZ(perceptionMessage.floatStyle, -1);
                    c118300cf.element = iLIZ;
                    if (iLIZ == -1) {
                        return;
                    }
                    PerceptionDialogInfo perceptionDialogInfo4 = perceptionMessage.dialog;
                    if (perceptionDialogInfo4 != null && perceptionDialogInfo4.scene == 7) {
                        c118300cf.element = EnumC778100Ufg.LIVE_TIP_COPYRIGHT_WARNING.ordinal();
                    }
                    Text text2 = perceptionMessage.floatText;
                    if (text2 != null) {
                        str3 = text2.defaultPattern;
                    } else {
                        str3 = null;
                    }
                    String string = C1133830fbx.LJIILIIL(text2, str3).toString();
                    if (Intrinsics.LJFF(string, "")) {
                        C20441214yg.LIZIZ("GameBroadcastFragment", "PerceptionMessage tip is null");
                        return;
                    }
                    if (c776870Udh.LIZIZ.getContext() != null && (i = perceptionMessage.floatIconType) != 0) {
                        c778580UgS = new C778580UgS(C20736316Cj.LIZLLL(C777180UeC.LIZ(i), c776870Udh.LIZIZ.getContext()), ColorStateList.valueOf(C20736316Cj.LIZIZ(R.attr.exz, c776870Udh.LIZIZ.getContext())));
                    } else {
                        c778580UgS = null;
                    }
                    c776870Udh.LJIIIZ(c118300cf.element, perceptionMessage.publicEventInfo, string, c778580UgS, true);
                    if (c118300cf.element != EnumC778100Ufg.LIVE_TIP_GO_APPEAL_TIPS.ordinal()) {
                        return;
                    }
                    C817503Hh c817503Hh = C817503Hh.LL;
                    C1DFH c1dfh = C0PEM.LIZ;
                    c776870Udh.LJJIJLIJ.add(C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C01N5(c776870Udh, c118300cf, perceptionMessage, null), 2));
                    return;
                }
                if (iMessage instanceof GameRankNotifyMessage) {
                    C776870Udh c776870Udh2 = this.LL;
                    c776870Udh2.getClass();
                    final String string2 = C1133830fbx.LJIILIIL(((GameRankNotifyMessage) iMessage).notifyText, "").toString();
                    if (string2.length() == 0) {
                        return;
                    }
                    if (GameFloatTipsOptimize.INSTANCE.isExperimentGroup()) {
                        C777840UfG.LJII(new AbstractC777950UfR(string2) { // from class: X.0UfM
                            public final EnumC777930UfP LJ = EnumC777930UfP.PRIORITY_TYPE_P3;
                            public final EnumC777480Ueg LJFF = EnumC777480Ueg.RANKING_CHANGE;
                            public final CharSequence LJI;

                            @Override // X.AbstractC777950UfR
                            public final EnumC777930UfP LIZJ() {
                                return this.LJ;
                            }

                            @Override // X.AbstractC777950UfR
                            public final CharSequence LIZLLL() {
                                return this.LJI;
                            }

                            @Override // X.AbstractC777950UfR
                            public final EnumC777480Ueg LJ() {
                                return this.LJFF;
                            }

                            {
                                this.LJI = string2;
                                this.LIZIZ = new AbstractC777790UfB() { // from class: X.0UfO
                                    public final EnumC777770Uf9 LIZ = EnumC777770Uf9.CLOSE;

                                    @Override // X.AbstractC777790UfB
                                    public final EnumC777770Uf9 LIZ() {
                                        return this.LIZ;
                                    }
                                };
                                this.LIZ = new InterfaceC778710Ugf() { // from class: X.0UfN
                                    @Override // X.InterfaceC778710Ugf
                                    public final C778580UgS getIcon() {
                                        return new C778580UgS(C497740JfY.LJIIJ(R.drawable.em0), null);
                                    }
                                };
                            }
                        });
                        return;
                    } else {
                        c776870Udh2.LJIIIZ(EnumC778100Ufg.LIVE_TIP_GAMING_RANKING_CHANGE_TIPS.ordinal(), null, string2, null, true);
                        return;
                    }
                }
                if (!(iMessage instanceof GameMomentMessage) || (c779190UhR = this.LL.LJJLJ) == null) {
                    return;
                }
                C204543151x c204543151x = new C204543151x();
                c204543151x.LIZ = 0;
                c204543151x.LIZIZ = (GameMomentMessage) iMessage;
                c779190UhR.LIZIZ(c204543151x);
            }
        };
        IMessageManager iMessageManager2 = this.LJJLIIIIJ;
        if (iMessageManager2 != null) {
            iMessageManager2.addMessageListener(C001A.PERCEPTION_MESSAGE.ordinal(), this.LJ);
        }
        IMessageManager iMessageManager3 = this.LJJLIIIIJ;
        if (iMessageManager3 != null) {
            iMessageManager3.addAsyncMessageListener(C001A.GAME_RANK_NOTIFY_MESSAGE.ordinal(), this.LJ);
        }
        if (LiveGameMomentQuickCommentBroadcastSetting.INSTANCE.pipToastEnable() && (iMessageManager = this.LJJLIIIIJ) != null) {
            iMessageManager.addMessageListener(C001A.GAME_MOMENT_MESSAGE.ordinal(), this.LJ);
        }
        InterfaceC777850UfH interfaceC777850UfH = new InterfaceC777850UfH() { // from class: X.0Udy
            @Override // X.InterfaceC777850UfH
            public final void LJI(AbstractC777950UfR abstractC777950UfR) {
                C779880UiY c779880UiY;
                C777080Ue2 c777080Ue2;
                if (abstractC777950UfR instanceof C777500Uei) {
                    long jLongValue = ((Number) this.LL.LJJJJLI.getValue()).longValue();
                    long jLJIILL = this.LL.LJIILL();
                    C777500Uei c777500Uei = (C777500Uei) abstractC777950UfR;
                    String str2 = c777500Uei.LJII;
                    if (str2 == null) {
                        str2 = "";
                    }
                    C779090UhH.LIZJ(jLongValue, jLJIILL, str2);
                    C779090UhH.LIZIZ("show", c777500Uei.LJI);
                    if (c777500Uei.LJ == 4 && (c779880UiY = this.LL.LJIILLIIL) != null && (c777080Ue2 = c779880UiY.LJIIZILJ) != null) {
                        String string = c777500Uei.LJFF.toString();
                        c777080Ue2.LIZ = true;
                        c777080Ue2.LIZIZ = string;
                        return;
                    }
                    return;
                }
                if (abstractC777950UfR instanceof C777450Ued) {
                    C777060Ue0.LIZIZ(((C777450Ued) abstractC777950UfR).LJ, EnumC777070Ue1.Hover);
                } else {
                    if (!(abstractC777950UfR instanceof C777440Uec)) {
                        return;
                    }
                    ((C777440Uec) abstractC777950UfR).LJFF(this.LL.LIZJ, "show");
                }
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Removed duplicated region for block: B:55:0x00ca  */
            @Override // X.InterfaceC777850UfH
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LJII(X.AbstractC777950UfR r8, X.EnumC778130Ufj r9) {
                /*
                    Method dump skipped, instruction units count: 428
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C777040Udy.LJII(X.0UfR, X.0Ufj):void");
            }
        };
        C777840UfG.LIZ(EnumC777480Ueg.HIGHLIGHT, interfaceC777850UfH);
        C777840UfG.LIZ(EnumC777480Ueg.GUESS, interfaceC777850UfH);
        C777840UfG.LIZ(EnumC777480Ueg.NOTICE_CENTER, interfaceC777850UfH);
        C777840UfG.LIZ(EnumC777480Ueg.FIRST_EDUCATION, interfaceC777850UfH);
        C777840UfG.LIZ(EnumC777480Ueg.GAME_RANK_STICKER, interfaceC777850UfH);
        C777840UfG.LIZ(EnumC777480Ueg.XM, interfaceC777850UfH);
        C777840UfG.LIZ(EnumC777480Ueg.CAPTURE_ERROR, interfaceC777850UfH);
        C777840UfG.LIZ(EnumC777480Ueg.CAPTCHA, interfaceC777850UfH);
        PollConf pollConf = this.LIZ.pollConf;
        if (pollConf != null && pollConf.useNewGiftPoll) {
            C780110Uiv c780110Uiv = new C780110Uiv(this.LIZJ, this.LJJLIIIIJ);
            this.LJJLIIIJ = c780110Uiv;
            IMessageManager iMessageManager4 = c780110Uiv.LL;
            if (iMessageManager4 != null) {
                iMessageManager4.addMessageListener(C001A.LIVE_POLL_MESSAGE.ordinal(), c780110Uiv);
            }
            if (GameFloatTipsOptimize.INSTANCE.isExperimentGroup()) {
                C777840UfG.LIZ(EnumC777480Ueg.POLL, c780110Uiv);
            }
        }
        this.LJIIL = true;
        boolean zLJJJI = C500260Jjc.LJJJI(C520010KaN.LJFF(gameBroadcastFragment, "live.intent.extra.IS_CONTINUE_LIVE", false));
        if (C0W78.LJFF(gameBroadcastFragment.getActivity()) && BroadcastGameCountDownNum.INSTANCE.isNeedCountDown() && !zLJJJI) {
            z = true;
        } else {
            z = false;
        }
        this.LJIIIIZZ = z;
        if (z && !this.LJIIIZ) {
            C500730JkN c500730JkN = this.LJJJZ;
            if (C0W78.LJFF(c500730JkN.LL.getActivity())) {
                c500730JkN.LLILLL.LJIIJJI();
            }
            GamePreparationFragment gamePreparationFragment = new GamePreparationFragment();
            if (gameBroadcastFragment.isAdded() && !gameBroadcastFragment.mStatusDestroyed && gameBroadcastFragment.getChildFragmentManager().LJJJJZI("AbsPreparationFragment") == null) {
                gameBroadcastFragment.getDataChannel().zW(RoomChannel.class, gameBroadcastFragment.PR());
                gamePreparationFragment.WR(gameBroadcastFragment.getDataChannel(), gameBroadcastFragment);
                gameBroadcastFragment.LLJJJ = gamePreparationFragment;
                C19EH c19ehLJIIJ = gameBroadcastFragment.getChildFragmentManager().LJIIJ();
                c19ehLJIIJ.LIZJ(R.id.rod, gamePreparationFragment, "AbsPreparationFragment");
                c19ehLJIIJ.LJIIJ();
            }
            this.LJIIIZ = true;
            this.LJJJIL = cert;
            this.LJJJJ = this.LJIIJJI;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_prepare_page_show");
            c474500IjALIZ.LJJ("screen_share");
            c474500IjALIZ.LJII(LJIILIIL());
            c474500IjALIZ.LJJIJIIJI(Long.valueOf(gameBroadcastFragment.getRoomId()));
            GameTag gameTagLIZIZ = C754700Tj2.LIZIZ();
            if (gameTagLIZIZ != null && (str = gameTagLIZIZ.packageName) != null) {
                iValueOf = Integer.valueOf(C2162308dZ.LJFF(gameBroadcastFragment.getContext(), str) ? 1 : 0);
            } else {
                iValueOf = 0;
            }
            c474500IjALIZ.LJJII(iValueOf, "if_default_game");
            c474500IjALIZ.LIZ();
            return;
        }
        gameBroadcastFragment.GS(cert, this.LJIIJJI);
        gameBroadcastFragment.ES(new GameBroadcastInteractionFragment());
    }

    public final void LJIL(boolean z, boolean z2) {
        String str;
        C474500IjA c474500IjALIZ;
        if (this.LIZJ.gg0(LiveModeChannel.class) != LiveMode.VIDEO) {
            str = "screen_share";
        } else {
            str = "video_live";
        }
        if (z) {
            c474500IjALIZ = C0IJT.LIZ("livesdk_live_pause_click");
            c474500IjALIZ.LJJII(Integer.valueOf(z2 ? 1 : 0), "is_max_pause_num");
            c474500IjALIZ.LJJII(Integer.valueOf(InterfaceC772190UQv.l3.LIZIZ().booleanValue() ? 1 : 0), "is_first");
        } else {
            c474500IjALIZ = C0IJT.LIZ("livesdk_live_anchor_resume_click");
        }
        c474500IjALIZ.LJJII(str, "live_type");
        c474500IjALIZ.LJJII(0, "in_app");
        c474500IjALIZ.LJJ("screen_share");
        c474500IjALIZ.LJJII(Long.valueOf(LJIILL()), "room_id");
        c474500IjALIZ.LJJII(1, "is_floating");
        c474500IjALIZ.LJJII(Integer.valueOf(this.LJJZ ? 1 : 0), "is_dragging");
        c474500IjALIZ.LJIJJLI(this.LIZJ);
        c474500IjALIZ.LIZ();
        C773220UUu c773220UUu = C773220UUu.LIZ;
        AwS27S0010000_12 awS27S0010000_12 = new AwS27S0010000_12(z, 0);
        c773220UUu.getClass();
        C773220UUu.LJIIL(awS27S0010000_12);
    }

    public final void LJJI(C474500IjA c474500IjA, boolean z) {
        String str;
        if (!TtliveGameEnableIntelligentRotationSetting.INSTANCE.isEnable()) {
            return;
        }
        if (C500260Jjc.LJJIFFI(Boolean.valueOf(this.LJJIFFI)) && z) {
            this.LJJIIZI = true;
        }
        if (!C500260Jjc.LJJIFFI(Boolean.valueOf(this.LJJIFFI)) && !this.LJJIIZ) {
            int value = TtliveGameAnchorIntelligentRotationTimeSetting.INSTANCE.getValue();
            if (value <= 0) {
                value = 10000;
            }
            this.LJIILJJIL.LIZ(C11NZ.LJLJJLL(value, TimeUnit.MILLISECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS32S0210000_12(this, c474500IjA, z, 4), new C09JN() { // from class: X.00j1
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("GameUiStrategy@3ab.rotateScreenIfNeeded$2");
                    C20441214yg.LIZLLL(((Throwable) obj).getMessage());
                    C1C7U.LIZIZ("GameUiStrategy@3ab.rotateScreenIfNeeded$2");
                }
            }));
            return;
        }
        boolean z2 = this.LJJIIZ;
        boolean z3 = this.LJJIFFI;
        if (C500260Jjc.LJJIFFI(Boolean.valueOf(z3))) {
            str = "foreground_not_rotate";
        } else {
            str = "paused_not_rotate";
        }
        c474500IjA.LJJII(Integer.valueOf(z2 ? 1 : 0), "pause_status");
        c474500IjA.LJJII(Integer.valueOf(z3 ? 1 : 0), "background_status");
        c474500IjA.LJJII(Integer.valueOf(z ? 1 : 0), "forced");
        c474500IjA.LJJII(str, "action");
        c474500IjA.LIZ();
    }

    public C776870Udh(Room room, GameBroadcastFragment gameBroadcastFragment, DataChannel dataChannel) {
        boolean zBooleanValue;
        C776490Ud5 c776490Ud5;
        this.LIZ = room;
        this.LIZIZ = gameBroadcastFragment;
        this.LIZJ = dataChannel;
        this.LJI = C520010KaN.LJJIJIIJI(gameBroadcastFragment, false);
        Boolean boolLJFF = C520010KaN.LJFF(gameBroadcastFragment, "hotsoon.intent.extra.IS_LANDSCAPE", true);
        if (boolLJFF != null) {
            zBooleanValue = boolLJFF.booleanValue();
        } else {
            zBooleanValue = true;
        }
        this.LJIIJJI = zBooleanValue;
        this.LJIILJJIL = new C11NJ();
        this.LJJIIZ = true;
        this.LJJIJL = C292401Bi.LIZ(AFwS199S0000000_12.get$arr$(493));
        this.LJJIJLIJ = new ArrayList<>();
        this.LJJIZ = "";
        this.LJJJJ = true;
        this.LJJJJL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(495));
        this.LJJJJLI = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(496));
        this.LJJJJLL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 904));
        this.LJJJJZ = new C778120Ufi(gameBroadcastFragment, this);
        this.LJJJJZI = new C776410Ucx(gameBroadcastFragment, this);
        if (EnableFallbackAudioOldChainSetting.INSTANCE.enable()) {
            c776490Ud5 = new C776490Ud5(gameBroadcastFragment, dataChannel, this);
        } else {
            c776490Ud5 = null;
        }
        this.LJJJLIIL = c776490Ud5;
        this.LJJJLL = new C778180Ufo(gameBroadcastFragment, dataChannel, this);
        this.LJJJLZIJ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(494));
        this.LJJJZ = new C500730JkN(gameBroadcastFragment, dataChannel, this);
        this.LJJLIIIJILLIZJL = new ArrayList();
        this.LJJLIIIJJI = -1;
        this.LJJLIIIJJIZ = new C777200UeE(gameBroadcastFragment);
        this.LJJLIIIJL = new C777360UeU(gameBroadcastFragment);
        this.LJJLIIIJLJLI = new C777210UeF();
        this.LJJLIIJ = new LinkedList<>();
        this.LJJLIL = new LinkedList<>();
        this.LJJLL = new C785760Us2(this, 1);
    }

    public final void LJJIII(String str, boolean z, boolean z2) {
        Object obj;
        Intent hostSingleActivityIntent;
        int i = 0;
        if (C0W78.LIZIZ(this.LJI)) {
            GameBroadcastFragment gameBroadcastFragment = this.LIZIZ;
            gameBroadcastFragment.getClass();
            if (C504210Jpz.LIZ) {
                Context context = gameBroadcastFragment.getContext();
                if (context != null && (hostSingleActivityIntent = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getHostSingleActivityIntent(context, 6)) != null) {
                    RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, hostSingleActivityIntent, "Context_startActivity_1");
                    C1701330uNH.LIZ(hostSingleActivityIntent, context);
                    C2204961BRm.LJJJJJL(context, hostSingleActivityIntent, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl7Cugu7MzD/FV9f3YRV8iIZZA0GFt2YQS2oAhm9vdyKAXXq8iJQQ=", null));
                }
            } else {
                Context context2 = gameBroadcastFragment.getContext();
                if (context2 != null) {
                    Intent intent = new Intent(context2, (Class<?>) ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getHostActivity(6));
                    try {
                        String packageName = context2.getPackageName();
                        int length = packageName.length();
                        String str2 = packageName;
                        if (length > 0) {
                            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(packageName, new String[]{":"}, 0, 6);
                            str2 = packageName;
                            if (listLJJLIIIJILLIZJL != null) {
                                String str3 = (String) C13LP.LJJJLL(listLJJLIIIJILLIZJL);
                                str2 = packageName;
                                if (str3 != null) {
                                    str2 = str3;
                                }
                            }
                        }
                        C189200o6.m2constructorimpl(str2);
                        obj = str2;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C098200Yq c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                        obj = c098200Yq;
                    }
                    String packageName2 = context2.getPackageName();
                    boolean zM7isFailureimpl = C189200o6.m7isFailureimpl(obj);
                    Object obj2 = obj;
                    if (zM7isFailureimpl) {
                        obj2 = packageName2;
                    }
                    intent.setPackage((String) obj2);
                    RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context2, intent, "Context_startActivity_1");
                    C1701330uNH.LIZ(intent, context2);
                    C2204961BRm.LJJJJJL(context2, intent, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl7Cugu7MzD/FV9f3YRV8iIZZA0GFt2YQS2oAhm9vdyKAXXq8iJQQ=", null));
                }
            }
            if (z) {
                LIZJ("popup_panel", "full");
            }
            if (z2) {
                this.LIZJ.FQ2(GameFloatingWindowAudienceClickEvent.class);
            }
            i = 1;
        } else {
            if (this.LJJJJIZL == null) {
                C782110Um9 c782110Um9 = new C782110Um9(C520010KaN.LJJIIZI(this.LJI, false));
                c782110Um9.LJII(2131842597);
                c782110Um9.LJIILIIL(2131842598, new AcS495S0100000_12(this, 67));
                c782110Um9.LJIIJ(2131842599, new InterfaceC743640TFa() { // from class: X.0Udt
                    @Override // X.InterfaceC743640TFa
                    public final void LIZ(LiveDialog liveDialog) {
                        liveDialog.dismiss();
                    }
                });
                this.LJJJJIZL = c782110Um9.LIZ();
            }
            LiveDialog liveDialog = this.LJJJJIZL;
            if (liveDialog != null) {
                C786410Ut5.E4(liveDialog);
            }
            if (GameFloatTipsOptimize.INSTANCE.isExperimentGroup()) {
                C777840UfG.LJII(new AbstractC777950UfR() { // from class: X.0Uep
                    public final EnumC777930UfP LJ = EnumC777930UfP.PRIORITY_TYPE_P2;
                    public final EnumC777480Ueg LJFF = EnumC777480Ueg.XM;
                    public final CharSequence LJI = C497740JfY.LJIJI(2131842597);

                    {
                        this.LIZIZ = new AbstractC777790UfB() { // from class: X.0Uez
                            public final EnumC777770Uf9 LIZ = EnumC777770Uf9.BACK;

                            @Override // X.AbstractC777790UfB
                            public final EnumC777770Uf9 LIZ() {
                                return this.LIZ;
                            }
                        };
                    }

                    @Override // X.AbstractC777950UfR
                    public final EnumC777930UfP LIZJ() {
                        return this.LJ;
                    }

                    @Override // X.AbstractC777950UfR
                    public final CharSequence LIZLLL() {
                        return this.LJI;
                    }

                    @Override // X.AbstractC777950UfR
                    public final EnumC777480Ueg LJ() {
                        return this.LJFF;
                    }
                });
            } else {
                LJIIIZ(EnumC778100Ufg.LIVE_TIP_MESSAGE_UN_START.ordinal(), null, C497740JfY.LJIJI(2131842597), null, true);
            }
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_floating_window_back_to_tiktok");
        c474500IjALIZ.LJJII(LJIILIIL(), "anchor_id");
        c474500IjALIZ.LJJ("screen_share");
        c474500IjALIZ.LJJII(Long.valueOf(LJIILL()), "room_id");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "success");
        c474500IjALIZ.LJJII(str, "position");
        c474500IjALIZ.LIZ();
    }

    public final void LJJIIJ(Context context, String str, C474500IjA c474500IjA) {
        int rotation;
        int i;
        int iLIZLLL = C779350Uhh.LIZLLL();
        int iLIZJ = C779350Uhh.LIZJ();
        WindowManager windowManager = (WindowManager) C786410Ut5.H2(C786410Ut5.N3(context), "window");
        Point point = new Point();
        boolean z = false;
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl7Cugu7MyFf9A4/HWWwV5Kt9lP0Hf23rV1vA77nf4Wj+MIwLVVugJd4w=", null)).getRealSize(point);
            } else {
                C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl7Cugu7MyFf9A4/HWWwV5Kt9lP0Hf23rV1vA77nf4Wj+MIwLVVugJd4w=", null)).getSize(point);
            }
            iLIZLLL = point.x;
            iLIZJ = point.y;
            rotation = C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl7Cugu7MyFf9A4/HWWwV5Kt9lP0Hf23rV1vA77nf4Wj+MIwLVVugJd4w=", null)).getRotation();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            rotation = 0;
        }
        Map<String, Object> map = C1338270kvh.LIZ;
        int i2 = 1;
        if (rotation == 1 || rotation == 3) {
            z = true;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        this.LJJIIJZLJL = boolValueOf;
        if (C500260Jjc.LJJJI(boolValueOf)) {
            i = 1;
        } else {
            i = 2;
        }
        if (iLIZLLL <= iLIZJ) {
            i2 = 2;
        }
        c474500IjA.LJJII(Integer.valueOf(rotation), "screen_angle");
        c474500IjA.LJJII(Integer.valueOf(iLIZLLL), "screen_width");
        c474500IjA.LJJII(Integer.valueOf(iLIZJ), "screen_height");
        c474500IjA.LJJII(Integer.valueOf(i), "angle_orientation");
        c474500IjA.LJJII(Integer.valueOf(i2), "size_orientation");
        c474500IjA.LJJII(str, Scene.SCENE_SERVICE);
    }

    @Override // X.InterfaceC778270Ufx
    public final void LJIIIZ(int i, PunishEventInfo punishEventInfo, CharSequence charSequence, Object obj, boolean z) {
        EnumC779790UiP enumC779790UiP;
        if (this.LJIILIIL || !LJIJ()) {
            return;
        }
        C778500UgK c778500UgK = new C778500UgK(i, punishEventInfo, charSequence, obj, z);
        if (z) {
            enumC779790UiP = EnumC779790UiP.CMD_NEW_TIP;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_floating_toast_show");
            c474500IjALIZ.LJJII(LJIILIIL(), "anchor_id");
            c474500IjALIZ.LJJ("screen_share");
            c474500IjALIZ.LJJII(Long.valueOf(LJIILL()), "room_id");
            c474500IjALIZ.LIZ();
        } else {
            enumC779790UiP = EnumC779790UiP.CMD_HIDE_TIP;
        }
        LJJIFFI(new ARunnableS45S0300000_12(this, enumC779790UiP, c778500UgK, 30));
    }
}
