package X;

import Y.ACListenerS147S0100000_12;
import Y.ARunnableS112S0100000_12;
import Y.ARunnableS45S0300000_12;
import Y.AfS0S0100400_12;
import Y.AfS132S0000000_7;
import Y.AfS172S0100000_3;
import Y.AfS176S0100000_7;
import Y.AfS181S0100000_12;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.roomcomponents.OnlineRankConfig;
import com.bytedance.android.live.base.model.roomcomponents.OnlineRankListResponse;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.NetworkStatus;
import com.bytedance.android.live.broadcast.api.OnlineRankConfigChannel;
import com.bytedance.android.live.broadcast.api.PauseTimeChannel;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.publicscreen.api.GameBackgroundColorChannel;
import com.bytedance.android.live.publicscreen.api.GameBackgroundColorLevelChannel;
import com.bytedance.android.live.publicscreen.api.GameWelcomeMessageChannel;
import com.bytedance.android.live.publicscreen.api.MsgViewShowingTabChannel;
import com.bytedance.android.live.publicscreen.api.TipContentChannel;
import com.bytedance.android.live.publicscreen.api.TipMessageChannel;
import com.bytedance.android.live.publicscreen.impl.api.HighLightApi;
import com.bytedance.android.livesdk.comp.api.game.GameBroadcastStateChannel;
import com.bytedance.android.livesdk.comp.api.game.PrepareCountDown;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.dataChannel.GameBgmChannel;
import com.bytedance.android.livesdk.dataChannel.GameMicChannel;
import com.bytedance.android.livesdk.dataChannel.MuteMicChannel;
import com.bytedance.android.livesdk.dataChannel.MuteMicCheckedEvent;
import com.bytedance.android.livesdk.dataChannel.MuteMicSwitchClosedFromFloatingEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.RoomComponentsV2Channel;
import com.bytedance.android.livesdk.game.model.CreateHighLightResult;
import com.bytedance.android.livesdk.livesetting.broadcast.GameFloatTipsOptimize;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.rank.api.AudienceInProfileListChannel;
import com.bytedance.android.livesdk.rank.api.model.Rank;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.ILiveGameService;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS378S0200000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS582S0100000_3;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import webcast.api.room.RoomComponentsV2Response;

/* JADX INFO: renamed from: X.0UqD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C784630UqD extends AbstractC776930Udn implements InterfaceC784750UqP {
    public static final C11PQ<Integer> LLLLJI = new C11PQ<>();
    public static final C11PQ<String> LLLLL = new C11PQ<>();
    public final Context LLILLL;
    public final InterfaceC784660UqG LLILZ;
    public final DataChannel LLILZIL;
    public ConstraintLayout LLILZLL;
    public LiveIconView LLIZ;
    public C16F5 LLIZLLLIL;
    public C16F5 LLJ;
    public LinearLayout LLJI;
    public C16F5 LLJIJIL;
    public ImageView LLJILJIL;
    public ImageView LLJILJILJ;
    public ImageView LLJILLL;
    public ImageView LLJJ;
    public ImageView LLJJI;
    public ConstraintLayout LLJJIII;
    public ConstraintLayout LLJJIJI;
    public ConstraintLayout LLJJIJIIJIL;
    public ConstraintLayout LLJJIJIL;
    public ConstraintLayout LLJJJ;
    public ConstraintLayout LLJJJIL;
    public ConstraintLayout LLJJJJ;
    public C16F5 LLJJJJJIL;
    public RecyclerView LLJJJJLIIL;
    public final C01GW LLJJL;
    public final int LLJJLIIIJLLLLLLLZ;
    public final int LLJL;
    public int LLJLIL;
    public final List<View> LLJLILLLLZIIL;
    public final HashMap<View, Boolean> LLJLL;
    public final int LLJLLIL;
    public long LLJLLL;
    public final AtomicInteger LLJZ;
    public long LLJZIJLIL;
    public CreateHighLightResult LLL;
    public final C11NJ LLLF;
    public int LLLFF;
    public final ImageView LLLFFI;
    public RecyclerView LLLFZ;
    public final C01GW LLLI;
    public long LLLII;
    public C11JF LLLIIII;
    public boolean LLLIIIIL;
    public OnlineRankConfig LLLIIIL;
    public final C784680UqI LLLIIL;
    public final C784690UqJ LLLIILIL;
    public C779420Uho LLLIL;
    public C784790UqT LLLILZ;
    public final LifecycleRegistry LLLILZJ;
    public final C01GW LLLILZLLLI;
    public final C01GW LLLIZZ;
    public final C01GW LLLJ;
    public final C01GW LLLJIL;
    public final C01GW LLLJL;
    public final C01GW LLLL;
    public final C01GW LLLLII;
    public final C01GW LLLLIIIILLL;
    public final C01GW LLLLIIL;
    public final C01GW LLLLIILL;
    public final C01GW LLLLIILLL;
    public final C01GW LLLLIL;
    public final C01GW LLLLILI;
    public final C01GW LLLLJ;

    @Override // X.AbstractC776930Udn
    public final boolean LJIIIIZZ() {
        return false;
    }

    @Override // X.AbstractC776930Udn
    public void setMsgBtnActive(boolean z) {
    }

    private final String getAnchorId() {
        return (String) this.LLLJIL.getValue();
    }

    private final ViewOnTouchListenerC780220Uj6 getGameDragScaleListener() {
        return (ViewOnTouchListenerC780220Uj6) this.LLLIZZ.getValue();
    }

    private final LinearLayout getLayoutBottom() {
        return (LinearLayout) this.LLLJL.getValue();
    }

    private final ViewGroup getLayoutTop() {
        return (ViewGroup) this.LLLILZLLLI.getValue();
    }

    private final long getRoomId() {
        return ((Number) this.LLLJ.getValue()).longValue();
    }

    private final View getViewLikeCount() {
        return (View) this.LLLLIILLL.getValue();
    }

    private final View getViewLiveStatus() {
        return (View) this.LLLLIL.getValue();
    }

    private final View getViewLiveTime() {
        return (View) this.LLLLILI.getValue();
    }

    @Override // X.AbstractC776930Udn
    public final void LJIIIZ() {
        String str;
        CreateHighLightResult createHighLightResult = this.LLL;
        if (createHighLightResult == null || (str = createHighLightResult.fragmentIdStr) == null) {
            str = "";
        }
        long j = this.LLJZIJLIL;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_highlight_save_click");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(j), "room_id");
        c474500IjALIZ.LJJII("screen_share", "live_type");
        c474500IjALIZ.LJJII(str, "item_id");
        c474500IjALIZ.LIZ();
        ((IGameService) C1161920gLG.LIZJ(IGameService.class)).YD(str);
    }

    @Override // X.AbstractC776930Udn
    public final void LJIIJ() {
        InterfaceC776970Udr interfaceC776970Udr;
        this.LLLILZJ.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
        this.LLLILZJ.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
        this.LLLILZJ.setCurrentState(Lifecycle.State.DESTROYED);
        this.LLLF.dispose();
        this.LLILZIL.zQ2(this);
        C1113120f4Y msgView = getMsgView();
        if (msgView != null) {
            DataChannel dataChannel = msgView.LLJJ;
            if (dataChannel != null) {
                dataChannel.zQ2(msgView);
            }
            msgView.LLJILJILJ.dispose();
            C1113130f4Z c1113130f4Z = msgView.LLJIJIL;
            if (c1113130f4Z != null && (interfaceC776970Udr = c1113130f4Z.LLILZIL) != null) {
                interfaceC776970Udr.LJ(c1113130f4Z.LLJILJIL);
            }
            msgView.LLJJJJ.LJIIIZ.removeCallbacksAndMessages(null);
            msgView.LLJL = null;
        }
        C473960IiI countDownView = getCountDownView();
        if (countDownView != null) {
            DataChannel dataChannel2 = countDownView.LL;
            if (dataChannel2 != null) {
                dataChannel2.zQ2(countDownView);
            }
            countDownView.LL = null;
            countDownView.LLILLJJLI.dispose();
        }
        C784670UqH pauseView = getPauseView();
        if (pauseView != null) {
            DataChannel dataChannel3 = pauseView.LLIZLLLIL;
            if (dataChannel3 != null) {
                dataChannel3.zQ2(pauseView);
            }
            pauseView.LLIZLLLIL = null;
        }
    }

    public final ConstraintLayout getBtnGoLiveFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.cqm);
            this.LLJJIJI = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final ConstraintLayout getBtnHighlightFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.cr0);
            this.LLJJJJ = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final ConstraintLayout getBtnOpacityFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIJIIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.csw);
            this.LLJJIJIIJIL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final ConstraintLayout getBtnPauseFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ct6);
            this.LLJJJIL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final ConstraintLayout getBtnRoomFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIII;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.cui);
            this.LLJJIII = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final ConstraintLayout getBtnSettingFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.cuy);
            this.LLJJJ = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final ConstraintLayout getBtnSoundFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.cv_);
            this.LLJJIJIL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final C473960IiI getCountDownView() {
        return (C473960IiI) this.LLLLII.getValue();
    }

    @Override // X.AbstractC776930Udn
    public int getCurTabMsg() {
        Integer num = (Integer) this.LLILZIL.gg0(MsgViewShowingTabChannel.class);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    public final List<C1105460esC> getCurrentRankProfileItems() {
        return (List) this.LLLI.getValue();
    }

    public final ImageView getIcGoLiveFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJILJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jvi);
            this.LLJILJILJ = (ImageView) callbackFindViewById;
        }
        return (ImageView) callbackFindViewById;
    }

    public final ImageView getIcOpacityFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jw5);
            this.LLJJ = (ImageView) callbackFindViewById;
        }
        return (ImageView) callbackFindViewById;
    }

    public final ImageView getIcRoomFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jwn);
            this.LLJILLL = (ImageView) callbackFindViewById;
        }
        return (ImageView) callbackFindViewById;
    }

    public final ImageView getIcSoundFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jwu);
            this.LLJJI = (ImageView) callbackFindViewById;
        }
        return (ImageView) callbackFindViewById;
    }

    public final LiveIconView getIvCornerHandleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ld3);
            this.LLIZ = (LiveIconView) callbackFindViewById;
        }
        return (LiveIconView) callbackFindViewById;
    }

    public final ImageView getIvNetworkFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.lpl);
            this.LLJILJIL = (ImageView) callbackFindViewById;
        }
        return (ImageView) callbackFindViewById;
    }

    public final InterfaceC497601wk getLiveGameMsgViewScope() {
        return (InterfaceC497601wk) this.LLJJL.getValue();
    }

    public final C16F5 getLiveTimeFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.n8c);
            this.LLJIJIL = (C16F5) callbackFindViewById;
        }
        return (C16F5) callbackFindViewById;
    }

    public final String getLiveTimeText() {
        long j = this.LLLII;
        long j2 = 3600;
        long j3 = j / j2;
        long j4 = j % j2;
        long j5 = 60;
        long j6 = j4 / j5;
        long j7 = j4 % j5;
        return j3 <= 99 ? C786410Ut5.k4(Locale.US, "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j3), Long.valueOf(j6), Long.valueOf(j7)}, 3)) : C786410Ut5.k4(Locale.US, "%03d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j3), Long.valueOf(j6), Long.valueOf(j7)}, 3));
    }

    public final C1113120f4Y getMsgView() {
        return (C1113120f4Y) this.LLLL.getValue();
    }

    public final ConstraintLayout getMsgViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.omh);
            this.LLILZLL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final C784760UqQ getOpacityView() {
        return (C784760UqQ) this.LLLLIILL.getValue();
    }

    public final C784670UqH getPauseView() {
        return (C784670UqH) this.LLLLIIIILLL.getValue();
    }

    public final LinearLayout getPeopleCountViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.q8g);
            this.LLJI = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final FrameLayout getPipView() {
        return (FrameLayout) this.LLLLJ.getValue();
    }

    public final RecyclerView getRvTopOnlineAudienceFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJJLIIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.txj);
            this.LLJJJJLIIL = (RecyclerView) callbackFindViewById;
        }
        return (RecyclerView) callbackFindViewById;
    }

    public final C784730UqN getSoundView() {
        return (C784730UqN) this.LLLLIIL.getValue();
    }

    public final C16F5 getStatusFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJJJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.w0k);
            this.LLJJJJJIL = (C16F5) callbackFindViewById;
        }
        return (C16F5) callbackFindViewById;
    }

    public final C16F5 getTvCountFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.zfl);
            this.LLIZLLLIL = (C16F5) callbackFindViewById;
        }
        return (C16F5) callbackFindViewById;
    }

    public final C16F5 getTvCountLikeFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.zfu);
            this.LLJ = (C16F5) callbackFindViewById;
        }
        return (C16F5) callbackFindViewById;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.LLLF.dispose();
        super.onDetachedFromWindow();
    }

    @Override // X.InterfaceC784750UqP
    public final void LIZLLL() {
        LJIJJ(getBtnOpacityFromXml(), getOpacityView());
    }

    @Override // X.InterfaceC784750UqP
    public final void LJI() {
        LJIJJ(getBtnSoundFromXml(), getSoundView());
    }

    @Override // X.AbstractC776930Udn
    public final void LJIILIIL() {
        C1113120f4Y msgView = getMsgView();
        if (msgView != null) {
            msgView.LIZJ();
        }
    }

    public final boolean LJIJI() {
        C784730UqN soundView = getSoundView();
        if (C500260Jjc.LJJJI(soundView != null ? Boolean.valueOf(soundView.isShown()) : null)) {
            return true;
        }
        C784760UqQ opacityView = getOpacityView();
        return C500260Jjc.LJJJI(opacityView != null ? Boolean.valueOf(opacityView.isShown()) : null);
    }

    public final Context getActivity() {
        return this.LLILLL;
    }

    public final InterfaceC784660UqG getCallback() {
        return this.LLILZ;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.LLLILZJ;
    }

    public final LifecycleRegistry getRegistry() {
        return this.LLLILZJ;
    }

    private final void setOtherButtonUnable(View view) {
        for (View view2 : (ArrayList) this.LLJLILLLLZIIL) {
            if (!Intrinsics.LJFF(view2, view)) {
                LJJIFFI(view2, false);
            }
        }
    }

    @Override // X.InterfaceC784750UqP
    public final void LIZIZ(boolean z) {
        IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
        if (iBroadcastService != null) {
            iBroadcastService.setMicMuted(z, true, this.LLILZIL);
        }
        this.LLILZIL.zW(MuteMicChannel.class, Boolean.valueOf(z));
        this.LLILZIL.LC0(MuteMicCheckedEvent.class, Boolean.valueOf(z));
        if (!z) {
            this.LLILZIL.FQ2(MuteMicSwitchClosedFromFloatingEvent.class);
        }
    }

    @Override // X.InterfaceC784750UqP
    public final void LIZJ(int i) {
        C784690UqJ c784690UqJ = this.LLLIILIL;
        c784690UqJ.getClass();
        DataChannelGlobal.LLILZ.HQ2(GameBgmChannel.class, Float.valueOf((i * 0.1f) / 100));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append('%');
        c784690UqJ.LIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (Intrinsics.LJFF(c784690UqJ.LIZ, "")) {
            c784690UqJ.LIZ = c784690UqJ.LIZIZ;
        }
        InterfaceC772390URp.a0.LJFF(Integer.valueOf(i));
    }

    @Override // X.InterfaceC784750UqP
    public final void LJ(int i) {
        int i2;
        C784680UqI c784680UqI = this.LLLIIL;
        c784680UqI.getClass();
        InterfaceC772390URp.f130Y.LJFF(Integer.valueOf(i));
        int i3 = i + 20;
        ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).XL0(Integer.valueOf(i3), "g_broadcast_float_alpha");
        if (i <= 25) {
            i2 = 1;
        } else if (i <= 50) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        c784680UqI.LIZ.zW(GameBackgroundColorLevelChannel.class, Integer.valueOf(i2));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i3);
        sbLIZ.append('%');
        c784680UqI.LIZJ = C2188811AlT.LIZIZ(sbLIZ);
        if (Intrinsics.LJFF(c784680UqI.LIZIZ, "")) {
            c784680UqI.LIZIZ = c784680UqI.LIZJ;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append('#');
        CharsKt__CharJVMKt.checkRadix(16);
        sbLIZ2.append(Integer.toString((i3 * 255) / 100, 16));
        sbLIZ2.append("000000");
        int color = ColorProtector.parseColor(C2188811AlT.LIZIZ(sbLIZ2));
        c784680UqI.LIZ.zW(GameBackgroundColorChannel.class, Integer.valueOf(color));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(C439101nJ.LIZ(8));
        gradientDrawable.setColor(color);
        getMsgViewFromXml().setBackground(gradientDrawable);
    }

    @Override // X.AbstractC776930Udn
    public final void LJII(InterfaceC1110630f0X interfaceC1110630f0X) {
        final C1113120f4Y msgView = getMsgView();
        if (msgView != null) {
            if (msgView.LLJILJIL) {
                C20441214yg.LJ("LiveGameMsgView2", "bindTextPresenter already binded");
                return;
            }
            C11NZ<List<AbstractC1110800f0o<? extends AbstractC1136060ffY>>> c11nzLJI = interfaceC1110630f0X.LJI();
            if (c11nzLJI == null) {
                C20441214yg.LJ("LiveGameMsgView2", "bindTextPresenter observeFloatWindowMsgList return null");
                return;
            }
            msgView.LLJILJIL = true;
            C11NJ c11nj = msgView.LLJILJILJ;
            C11O8 c11o8LJJJLZIJ = msgView.LLJJJJ.LJIIIIZZ.LJJJLZIJ(C1701940uOG.LIZIZ());
            AfS181S0100000_12 afS181S0100000_12 = new AfS181S0100000_12(msgView, 285);
            AfS132S0000000_7 afS132S0000000_7 = C0J1R.LIZ;
            c11nj.LIZ(c11o8LJJJLZIJ.LJJLL(afS181S0100000_12, afS132S0000000_7));
            msgView.LLJILJILJ.LIZ(c11nzLJI.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0f4U
                @Override // X.C09JN
                public final void accept(Object obj) {
                    int size;
                    InterfaceC1112060f2q interfaceC1112060f2q;
                    int size2;
                    C1C7U.LIZ("LiveGameFloatWindowMsgView@437b.bindTextPresenter$2");
                    List<? extends AbstractC1110800f0o<? extends AbstractC1136060ffY>> list = (List) obj;
                    if (list != null && !list.isEmpty()) {
                        InterfaceC784660UqG floatMsgViewCallback2 = msgView.getFloatMsgViewCallback2();
                        if (floatMsgViewCallback2 != null) {
                            floatMsgViewCallback2.LJII(list);
                        }
                        if (!msgView.LLJJJJ.LJII.isEmpty()) {
                            if (list instanceof ArrayList) {
                                for (Pair<ChatMessage, ChatMessage> pair : msgView.LLJJJJ.LJII) {
                                    C1113120f4Y c1113120f4Y = msgView;
                                    ChatMessage first = pair.getFirst();
                                    ChatMessage second = pair.getSecond();
                                    c1113120f4Y.getClass();
                                    C1113120f4Y.LJI((ArrayList) list, first, second);
                                }
                            }
                            msgView.LLJJJJ.LJII.clear();
                        }
                        ArrayList arrayList = new ArrayList();
                        int size3 = list.size();
                        for (int i = 0; i < size3; i++) {
                            AbstractC1110800f0o abstractC1110800f0o = (AbstractC1110800f0o) C13LP.LJJJLZIJ(i, list);
                            if (abstractC1110800f0o != null) {
                                C1113120f4Y c1113120f4Y2 = msgView;
                                C1112280f3C messageBehaviorProvider = c1113120f4Y2.getMessageBehaviorProvider();
                                Class<?> cls = abstractC1110800f0o.LJIL.getClass();
                                messageBehaviorProvider.getClass();
                                AbstractC1111980f2i abstractC1111980f2i = (AbstractC1111980f2i) ((HashMap) C1112280f3C.LIZIZ).get(cls);
                                if (abstractC1111980f2i == null) {
                                    abstractC1111980f2i = C1112550f3d.LIZJ;
                                }
                                if (abstractC1111980f2i.LJII(abstractC1110800f0o.LLIIIILZ(), abstractC1110800f0o.LJIL)) {
                                    C1113110f4X c1113110f4X = c1113120f4Y2.LLJJJJ;
                                    if (((ArrayDeque) c1113110f4X.LJIIL).size() < c1113110f4X.LJIIJJI) {
                                        ((ArrayDeque) c1113110f4X.LJIIL).add(abstractC1110800f0o);
                                        abstractC1110800f0o.LJIILL.LIZ = true;
                                        C1112650f3n c1112650f3n = abstractC1110800f0o.LJIILLIIL;
                                        c1112650f3n.LIZ = true;
                                        c1112650f3n.LIZIZ = SystemClock.uptimeMillis();
                                    } else {
                                        abstractC1110800f0o.dispose();
                                    }
                                } else {
                                    arrayList.add(abstractC1110800f0o);
                                }
                            }
                        }
                        C1113120f4Y c1113120f4Y3 = msgView;
                        C1113190f4f c1113190f4f = c1113120f4Y3.LLJLIL;
                        if (c1113190f4f == null || c1113190f4f.LJII == EnumC1091490eVf.NORMAL) {
                            C1113110f4X c1113110f4X2 = c1113120f4Y3.LLJJJJ;
                            int size4 = c1113110f4X2.LIZLLL.size();
                            int size5 = c1113110f4X2.LIZLLL.size() + arrayList.size();
                            if (size5 > c1113110f4X2.LIZJ) {
                                int i2 = size5 - 70;
                                if (i2 <= c1113110f4X2.LIZLLL.size()) {
                                    size = i2;
                                } else {
                                    size = c1113110f4X2.LIZLLL.size();
                                    ((ArrayList) arrayList.subList(0, i2 - size)).clear();
                                }
                                ArrayList arrayList2 = new ArrayList(c1113110f4X2.LIZLLL.subList(0, size));
                                int size6 = arrayList2.size();
                                for (int i3 = 0; i3 < size6; i3++) {
                                    C19719512Dh.LIZ(c1113110f4X2.LIZLLL).remove(ListProtector.get(arrayList2, i3));
                                }
                                int size7 = size4 - c1113110f4X2.LIZLLL.size();
                                if (size7 > 0) {
                                    c1113110f4X2.LIZIZ.invoke(0, Integer.valueOf(size7));
                                }
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("shoulddelete=");
                                sbLIZ.append(i2);
                                sbLIZ.append("desiredCropCount=");
                                sbLIZ.append(size);
                                sbLIZ.append("realCropCount=");
                                sbLIZ.append(size7);
                                C20441214yg.LJIIIZ("LiveGameMsgPresenter2", C2188811AlT.LIZIZ(sbLIZ));
                            }
                        }
                        C1113120f4Y c1113120f4Y4 = msgView;
                        c1113120f4Y4.getClass();
                        try {
                            int size8 = c1113120f4Y4.LLJJJJ.LIZLLL.size();
                            c1113120f4Y4.LLJJJJ.LIZLLL.addAll(size8, arrayList);
                            C1113110f4X c1113110f4X3 = c1113120f4Y4.LLJJJJ;
                            if (c1113110f4X3.LIZLLL.isEmpty()) {
                                interfaceC1112060f2q = null;
                            } else {
                                interfaceC1112060f2q = (InterfaceC1112060f2q) C13LP.LJJLIIIJJI(c1113120f4Y4.LLJJJJ.LIZLLL);
                            }
                            c1113110f4X3.LJ = interfaceC1112060f2q;
                            try {
                                c1113120f4Y4.LJII();
                                C1111720f2I c1111720f2I = c1113120f4Y4.LLJI;
                                if (c1111720f2I != null) {
                                    c1111720f2I.notifyItemRangeInserted(size8, arrayList.size());
                                }
                                C1113190f4f c1113190f4f2 = c1113120f4Y4.LLJLIL;
                                if (c1113190f4f2 != null) {
                                    c1113190f4f2.LIZ(arrayList.size());
                                }
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                c1113120f4Y4.getRecyclerViewFromXml().getRecycledViewPool().clear();
                                try {
                                    C1111720f2I c1111720f2I2 = c1113120f4Y4.LLJI;
                                    if (c1111720f2I2 != null) {
                                        c1111720f2I2.notifyDataSetChanged();
                                    }
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                }
                            }
                            C1113110f4X c1113110f4X4 = c1113120f4Y4.LLJJJJ;
                            int i4 = c1113110f4X4.LJFF;
                            c1113110f4X4.LJFF = c1113110f4X4.LIZLLL.size();
                            if (i4 < c1113120f4Y4.LLJJJJ.LJFF) {
                                c1113120f4Y4.getRecyclerViewFromXml().getMeasuredHeight();
                                C439101nJ.LIZ(154);
                            }
                            if (!C086I.LIZIZ(c1113120f4Y4.LLJJJJ.LIZLLL) && (size2 = c1113120f4Y4.LLJJJJ.LIZLLL.size()) > 0 && !c1113120f4Y4.getRecyclerViewFromXml().canScrollVertically(1)) {
                                c1113120f4Y4.getRecyclerViewFromXml().scrollToPosition(size2 - 1);
                            }
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            C20441214yg.LIZLLL(th2.getMessage());
                            c1113120f4Y4.getRecyclerViewFromXml().getRecycledViewPool().clear();
                            try {
                                c1113120f4Y4.LJII();
                            } catch (Throwable th3) {
                                TryCatchGuardChecker.doCheck(th3);
                            }
                        }
                    }
                    C1C7U.LIZIZ("LiveGameFloatWindowMsgView@437b.bindTextPresenter$2");
                }
            }, afS132S0000000_7));
        }
    }

    @Override // X.AbstractC776930Udn
    public final void LJIIJJI(boolean z) {
        if (z) {
            LJJIFFI(getBtnPauseFromXml(), true);
        } else {
            LJJI(getBtnPauseFromXml(), true);
        }
    }

    @Override // X.AbstractC776930Udn
    public final void LJIIL(boolean z) {
        if (getBtnPauseFromXml().isSelected() != z) {
            getBtnPauseFromXml().setSelected(z);
        }
    }

    @Override // X.AbstractC776930Udn
    public final void LJIILL(int i) {
        ConstraintLayout constraintLayout;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        ViewOnTouchListenerC780220Uj6 gameDragScaleListener = getGameDragScaleListener();
        LiveIconView ivCornerHandleFromXml = getIvCornerHandleFromXml();
        gameDragScaleListener.getClass();
        EnumC780260UjA enumC780260UjA = EnumC780260UjA.RIGHT_BOTTOM;
        if (i == enumC780260UjA.getValue()) {
            gameDragScaleListener.LLIZLLLIL = enumC780260UjA;
        } else {
            EnumC780260UjA enumC780260UjA2 = EnumC780260UjA.RIGHT_TOP;
            if (i == enumC780260UjA2.getValue()) {
                gameDragScaleListener.LLIZLLLIL = enumC780260UjA2;
            } else {
                EnumC780260UjA enumC780260UjA3 = EnumC780260UjA.LEFT_BOTTOM;
                if (i == enumC780260UjA3.getValue()) {
                    gameDragScaleListener.LLIZLLLIL = enumC780260UjA3;
                } else {
                    EnumC780260UjA enumC780260UjA4 = EnumC780260UjA.LEFT_TOP;
                    if (i == enumC780260UjA4.getValue()) {
                        gameDragScaleListener.LLIZLLLIL = enumC780260UjA4;
                    }
                }
            }
        }
        if (ivCornerHandleFromXml.getParent() instanceof ConstraintLayout) {
            constraintLayout = (ConstraintLayout) ivCornerHandleFromXml.getParent();
        } else {
            constraintLayout = null;
        }
        if (constraintLayout != null) {
            C19MB c19mb = new C19MB();
            c19mb.LJII(constraintLayout);
            c19mb.LJI(ivCornerHandleFromXml.getId(), 2);
            c19mb.LJI(ivCornerHandleFromXml.getId(), 1);
            c19mb.LJI(ivCornerHandleFromXml.getId(), 4);
            c19mb.LJI(ivCornerHandleFromXml.getId(), 3);
            C817403Hg c817403Hg = new C817403Hg();
            c817403Hg.element = -1.0f;
            C817403Hg c817403Hg2 = new C817403Hg();
            c817403Hg2.element = -1.0f;
            int i2 = C780250Uj9.LIZ[gameDragScaleListener.LLIZLLLIL.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            c19mb.LJIIIIZZ(ivCornerHandleFromXml.getId(), 2, 0, 2);
                            c19mb.LJIIIIZZ(ivCornerHandleFromXml.getId(), 4, 0, 4);
                            c817403Hg.element = 0.0f;
                            c817403Hg2.element = 0.0f;
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        c19mb.LJIIIIZZ(ivCornerHandleFromXml.getId(), 2, 0, 2);
                        c19mb.LJIIIIZZ(ivCornerHandleFromXml.getId(), 3, 0, 3);
                        c817403Hg.element = 180.0f;
                        c817403Hg2.element = 0.0f;
                    }
                } else {
                    c19mb.LJIIIIZZ(ivCornerHandleFromXml.getId(), 1, 0, 1);
                    c19mb.LJIIIIZZ(ivCornerHandleFromXml.getId(), 3, 0, 3);
                    c817403Hg.element = 180.0f;
                    c817403Hg2.element = 180.0f;
                }
            } else {
                c19mb.LJIIIIZZ(ivCornerHandleFromXml.getId(), 1, 0, 1);
                c19mb.LJIIIIZZ(ivCornerHandleFromXml.getId(), 4, 0, 4);
                c817403Hg.element = 0.0f;
                c817403Hg2.element = 180.0f;
            }
            c19mb.LIZIZ(constraintLayout);
            if (c817403Hg.element != -1.0f && c817403Hg2.element != -1.0f) {
                HandlerHook.viewPost(ivCornerHandleFromXml, new ARunnableS45S0300000_12(ivCornerHandleFromXml, c817403Hg, c817403Hg2, 31));
            }
        }
        if (i == enumC780260UjA.getValue()) {
            LinearLayout layoutBottom = getLayoutBottom();
            if (layoutBottom != null) {
                layoutParams3 = layoutBottom.getLayoutParams();
            } else {
                layoutParams3 = null;
            }
            if ((layoutParams3 instanceof C19ME) && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                marginLayoutParams3.rightMargin = C439101nJ.LIZ(12);
                marginLayoutParams3.leftMargin = 0;
                LinearLayout layoutBottom2 = getLayoutBottom();
                if (layoutBottom2 != null) {
                    C786410Ut5.d6(layoutBottom2, marginLayoutParams3);
                    return;
                }
                return;
            }
            return;
        }
        if (i == EnumC780260UjA.LEFT_BOTTOM.getValue()) {
            LinearLayout layoutBottom3 = getLayoutBottom();
            if (layoutBottom3 != null) {
                layoutParams2 = layoutBottom3.getLayoutParams();
            } else {
                layoutParams2 = null;
            }
            if (!(layoutParams2 instanceof C19ME) || (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) == null) {
                return;
            }
            marginLayoutParams2.rightMargin = 0;
            marginLayoutParams2.leftMargin = C439101nJ.LIZ(12);
            LinearLayout layoutBottom4 = getLayoutBottom();
            if (layoutBottom4 == null) {
                return;
            }
            C786410Ut5.d6(layoutBottom4, marginLayoutParams2);
            return;
        }
        if (i != EnumC780260UjA.RIGHT_TOP.getValue() && i != EnumC780260UjA.LEFT_TOP.getValue()) {
            return;
        }
        LinearLayout layoutBottom5 = getLayoutBottom();
        if (layoutBottom5 != null) {
            layoutParams = layoutBottom5.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (!(layoutParams instanceof C19ME) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
            return;
        }
        marginLayoutParams.rightMargin = 0;
        marginLayoutParams.leftMargin = 0;
        LinearLayout layoutBottom6 = getLayoutBottom();
        if (layoutBottom6 == null) {
            return;
        }
        C786410Ut5.d6(layoutBottom6, marginLayoutParams);
    }

    @Override // X.AbstractC776930Udn
    public final void LJIILLIIL(int i) {
        ViewOnTouchListenerC780220Uj6 gameDragScaleListener = getGameDragScaleListener();
        int measuredWidth = gameDragScaleListener.LL.getMeasuredWidth();
        int measuredHeight = gameDragScaleListener.LL.getMeasuredHeight();
        boolean zLJFF = gameDragScaleListener.LJFF(measuredWidth, measuredHeight, i);
        int iLIZLLL = measuredWidth;
        while (!zLJFF) {
            EnumC780210Uj5 enumC780210Uj5LIZIZ = ViewOnTouchListenerC780220Uj6.LIZIZ(gameDragScaleListener.LLJJIJIIJIL);
            if (enumC780210Uj5LIZIZ == gameDragScaleListener.LLJJIJIIJIL) {
                break;
            }
            gameDragScaleListener.LLJJIJIIJIL = enumC780210Uj5LIZIZ;
            iLIZLLL = (int) (gameDragScaleListener.LIZLLL() * gameDragScaleListener.LLJJIJIIJIL.getRatio());
            measuredHeight = (int) (iLIZLLL * gameDragScaleListener.LJ());
            zLJFF = gameDragScaleListener.LJFF(iLIZLLL, measuredHeight, i);
        }
        ViewGroup.LayoutParams layoutParams = gameDragScaleListener.LL.getLayoutParams();
        layoutParams.width = iLIZLLL;
        layoutParams.height = measuredHeight;
        C786410Ut5.W5(gameDragScaleListener.LL, layoutParams);
        gameDragScaleListener.LLJI = iLIZLLL;
        gameDragScaleListener.LLJIJIL = measuredHeight;
        if (measuredWidth != iLIZLLL) {
            gameDragScaleListener.LLILLL.invoke(Integer.valueOf((int) ((iLIZLLL * 100) / gameDragScaleListener.LIZLLL())), gameDragScaleListener.LIZJ(iLIZLLL));
            gameDragScaleListener.LLILZ.invoke(Integer.valueOf(iLIZLLL), Integer.valueOf(measuredHeight), gameDragScaleListener.LLJJIJIIJIL);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x007f A[PHI: r4
      0x007f: PHI (r4v1 float) = (r4v0 float), (r4v2 float) binds: [B:29:0x006e, B:31:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIL(int r9) {
        /*
            r8 = this;
            android.view.ViewGroup r2 = r8.getLayoutTop()
            boolean r0 = r2 instanceof X.C784810UqV
            r1 = 0
            if (r0 == 0) goto L10
            X.0UqV r2 = (X.C784810UqV) r2
            if (r2 == 0) goto L10
            r2.setPercentWidth(r9)
        L10:
            float r3 = (float) r9
            X.0Uj5 r0 = X.EnumC780210Uj5.Scale70
            float r0 = r0.getRatio()
            r7 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 * r7
            float r6 = r3 - r0
            r5 = 1092616192(0x41200000, float:10.0)
            float r6 = r6 / r5
            r4 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L27
            r6 = 1065353216(0x3f800000, float:1.0)
        L27:
            r2 = 0
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 >= 0) goto L2d
            r6 = 0
        L2d:
            android.widget.LinearLayout r0 = r8.getLayoutBottom()
            if (r0 == 0) goto L37
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
        L37:
            boolean r0 = r1 instanceof X.C19ME
            if (r0 == 0) goto L63
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            if (r1 == 0) goto L63
            int r0 = r8.LLJJLIIIJLLLLLLLZ
            float r0 = (float) r0
            float r0 = r0 * r6
            int r0 = (int) r0
            r1.height = r0
            int r0 = r8.LLJL
            float r0 = (float) r0
            float r0 = r0 * r6
            int r0 = (int) r0
            r1.bottomMargin = r0
            android.widget.LinearLayout r0 = r8.getLayoutBottom()
            if (r0 == 0) goto L56
            X.C786410Ut5.d6(r0, r1)
        L56:
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 > 0) goto L81
            android.widget.LinearLayout r0 = r8.getLayoutBottom()
            if (r0 == 0) goto L63
            X.C439101nJ.LJI(r0)
        L63:
            X.0Uj5 r0 = X.EnumC780210Uj5.Scale60
            float r0 = r0.getRatio()
            float r0 = r0 * r7
            float r3 = r3 - r0
            float r3 = r3 / r5
            int r0 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r0 > 0) goto L7f
            r4 = r3
            int r0 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r0 >= 0) goto L7f
        L75:
            X.0f4Y r0 = r8.getMsgView()
            if (r0 == 0) goto L7e
            r0.LJFF(r2)
        L7e:
            return
        L7f:
            r2 = r4
            goto L75
        L81:
            android.widget.LinearLayout r1 = r8.getLayoutBottom()
            if (r1 == 0) goto L63
            r0 = 0
            X.C12ES.LJIILL(r0, r1)
            goto L63
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C784630UqD.LJIL(int):void");
    }

    public final void setBtnGoLiveFromXml(ConstraintLayout constraintLayout) {
        this.LLJJIJI = constraintLayout;
    }

    public final void setBtnHighlightFromXml(ConstraintLayout constraintLayout) {
        this.LLJJJJ = constraintLayout;
    }

    public final void setBtnOpacityFromXml(ConstraintLayout constraintLayout) {
        this.LLJJIJIIJIL = constraintLayout;
    }

    public final void setBtnPauseFromXml(ConstraintLayout constraintLayout) {
        this.LLJJJIL = constraintLayout;
    }

    public final void setBtnRoomFromXml(ConstraintLayout constraintLayout) {
        this.LLJJIII = constraintLayout;
    }

    public final void setBtnSettingFromXml(ConstraintLayout constraintLayout) {
        this.LLJJJ = constraintLayout;
    }

    public final void setBtnSoundFromXml(ConstraintLayout constraintLayout) {
        this.LLJJIJIL = constraintLayout;
    }

    public final void setIcGoLiveFromXml(ImageView imageView) {
        this.LLJILJILJ = imageView;
    }

    public final void setIcOpacityFromXml(ImageView imageView) {
        this.LLJJ = imageView;
    }

    public final void setIcRoomFromXml(ImageView imageView) {
        this.LLJILLL = imageView;
    }

    public final void setIcSoundFromXml(ImageView imageView) {
        this.LLJJI = imageView;
    }

    public final void setIvCornerHandleFromXml(LiveIconView liveIconView) {
        this.LLIZ = liveIconView;
    }

    public final void setIvNetworkFromXml(ImageView imageView) {
        this.LLJILJIL = imageView;
    }

    public final void setLiveTimeFromXml(C16F5 c16f5) {
        this.LLJIJIL = c16f5;
    }

    public final void setMsgViewFromXml(ConstraintLayout constraintLayout) {
        this.LLILZLL = constraintLayout;
    }

    public final void setPeopleCountViewFromXml(LinearLayout linearLayout) {
        this.LLJI = linearLayout;
    }

    public final void setRvTopOnlineAudienceFromXml(RecyclerView recyclerView) {
        this.LLJJJJLIIL = recyclerView;
    }

    public final void setStatusFromXml(C16F5 c16f5) {
        this.LLJJJJJIL = c16f5;
    }

    @Override // X.AbstractC776930Udn
    public void setTipsView(View view) {
        FrameLayout pipView = getPipView();
        if (pipView != null) {
            pipView.addView(view, -1, -2);
        }
    }

    public final void setTvCountFromXml(C16F5 c16f5) {
        this.LLIZLLLIL = c16f5;
    }

    public final void setTvCountLikeFromXml(C16F5 c16f5) {
        this.LLJ = c16f5;
    }

    public static void LJIJ(View view, String str) {
        C1143680frq.LJ(view, "tiktok_live_game_demand_1", str, ImageView.ScaleType.FIT_CENTER);
    }

    @Override // X.InterfaceC784750UqP
    public final void LIZ(int i, boolean z) {
        C784690UqJ c784690UqJ = this.LLLIILIL;
        c784690UqJ.getClass();
        DataChannelGlobal.LLILZ.HQ2(GameMicChannel.class, Float.valueOf((i * 1.0f) / 100));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append('%');
        c784690UqJ.LIZLLL = C2188811AlT.LIZIZ(sbLIZ);
        if (Intrinsics.LJFF(c784690UqJ.LIZJ, "")) {
            c784690UqJ.LIZJ = c784690UqJ.LIZLLL;
        }
        if (z) {
            InterfaceC772390URp.Z.LJFF(Integer.valueOf(i));
        }
    }

    @Override // X.AbstractC776930Udn
    public final void LJIILJJIL(ChatMessage chatMessage, ChatMessage chatMessage2) {
        C1113120f4Y msgView = getMsgView();
        if (msgView != null) {
            msgView.LLJJJJ.LJIIIIZZ.onNext(new Pair<>(chatMessage, chatMessage2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ(android.view.View r15, androidx.constraintlayout.widget.ConstraintLayout r16) {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C784630UqD.LJIJJ(android.view.View, androidx.constraintlayout.widget.ConstraintLayout):void");
    }

    public final void LJJ(int i, String str) {
        String str2;
        if (GameFloatTipsOptimize.INSTANCE.isExperimentGroup()) {
            DataChannel dataChannel = this.LLILZIL;
            if (i == 1) {
                str2 = "fail";
            } else {
                str2 = "success";
            }
            dataChannel.zW(TipContentChannel.class, new C777970UfT(str2, str));
            return;
        }
        this.LLILZIL.zW(TipMessageChannel.class, new C778500UgK(str, i, null, 24));
    }

    public final void LJJI(View view, boolean z) {
        if (z) {
            this.LLJLL.put(view, Boolean.TRUE);
        }
        if (!LJIJI()) {
            view.setEnabled(true);
            C786410Ut5.T4(view, 1.0f);
        }
    }

    public final void LJJIFFI(View view, boolean z) {
        view.setEnabled(false);
        C786410Ut5.T4(view, 0.34f);
        if (z) {
            this.LLJLL.put(view, Boolean.FALSE);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C784630UqD(Context context, InterfaceC776970Udr interfaceC776970Udr, C777030Udx c777030Udx, DataChannel dataChannel) {
        Integer numValueOf;
        RoomComponentsV2Response roomComponentsV2Response;
        RoomComponentsV2Response roomComponentsV2Response2;
        OnlineRankListResponse onlineRankListResponse;
        ImageView imageView;
        Context contextN3;
        Context contextLJII = C497740JfY.LJII();
        super((contextLJII == null || (contextN3 = C786410Ut5.N3(contextLJII)) == null) ? context : contextN3);
        this.LLILLL = context;
        this.LLILZ = c777030Udx;
        this.LLILZIL = dataChannel;
        this.LLJJL = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(470));
        this.LLJJLIIIJLLLLLLLZ = C439101nJ.LIZ(28);
        this.LLJL = C439101nJ.LIZ(6);
        this.LLJLIL = 300000;
        ArrayList arrayList = new ArrayList();
        this.LLJLILLLLZIIL = arrayList;
        this.LLJLL = new HashMap<>();
        this.LLJLLIL = C538540LAe.LLJJJIL;
        int i = 0;
        this.LLJZ = new AtomicInteger(0);
        C11NJ c11nj = new C11NJ();
        this.LLLF = c11nj;
        this.LLLI = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(510));
        List<Rank> list = null;
        this.LLLIIIL = new OnlineRankConfig(true, true, true, 2, true);
        this.LLLIIL = new C784680UqI(dataChannel);
        this.LLLIILIL = new C784690UqJ();
        LifecycleRegistry lifecycleRegistry = new LifecycleRegistry(this);
        this.LLLILZJ = lifecycleRegistry;
        this.LLLILZLLLI = C292401Bi.LIZ(new AwS556S0100000_12(this, 948));
        this.LLLIZZ = C292401Bi.LIZ(new AwS556S0100000_12(this, 941));
        this.LLLJ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(473));
        this.LLLJIL = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(472));
        this.LLLJL = C292401Bi.LIZ(new AwS556S0100000_12(this, 947));
        this.LLLL = C292401Bi.LIZ(new AwS556S0100000_12(this, 949));
        this.LLLLII = C292401Bi.LIZ(new AwS556S0100000_12(this, 953));
        this.LLLLIIIILLL = C292401Bi.LIZ(new AwS556S0100000_12(this, 951));
        this.LLLLIIL = C292401Bi.LIZ(new AwS556S0100000_12(this, 954));
        this.LLLLIILL = C292401Bi.LIZ(new AwS556S0100000_12(this, 950));
        this.LLLLIILLL = C292401Bi.LIZ(new AwS556S0100000_12(this, 956));
        this.LLLLIL = C292401Bi.LIZ(new AwS556S0100000_12(this, 942));
        this.LLLLILI = C292401Bi.LIZ(new AwS556S0100000_12(this, 943));
        this.LLLLJ = C292401Bi.LIZ(new AwS556S0100000_12(this, 952));
        lifecycleRegistry.setCurrentState(Lifecycle.State.CREATED);
        lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_START);
        lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
        Room room = (Room) dataChannel.gg0(RoomChannel.class);
        C786410Ut5.Sd(R.layout.hrk, C1834150xpV.LIZLLL(C786410Ut5.ne(getContext()), C011Z.LIZ.LJIIIZ()), this);
        LJIJ(getIvCornerHandleFromXml(), "ttlive_live_game_corner_handle.png");
        LJIJ(getIcGoLiveFromXml(), "ttlive_ic_live_float_window_msg_icon_go.png");
        LJIJ(getIcRoomFromXml(), "ttlive_ic_live_float_window_msg_icon_home.png");
        LJIJ(getIcOpacityFromXml(), "ttlive_ic_live_float_window_msg_icon_opacity.png");
        LJIJ(getIcSoundFromXml(), "ttlive_ic_live_float_window_msg_icon_sound.png");
        View viewFindViewById = findViewById(R.id.omh);
        if (viewFindViewById != null) {
            viewFindViewById.setOnTouchListener(getGameDragScaleListener());
        }
        C1113120f4Y msgView = getMsgView();
        if (msgView != null) {
            msgView.LLJJ = dataChannel;
            msgView.LLJJI = interfaceC776970Udr;
            dataChannel.CQ2(GameWelcomeMessageChannel.class, msgView, new AwS591S0100000_12(msgView, 1137));
        }
        C1113120f4Y msgView2 = getMsgView();
        if (msgView2 != null) {
            msgView2.setFloatMsgViewCallback2(c777030Udx);
        }
        C473960IiI countDownView = getCountDownView();
        if (countDownView != null) {
            countDownView.LL = dataChannel;
            dataChannel.CQ2(PrepareCountDown.class, countDownView, new AwS586S0100000_7(countDownView, 537));
        }
        C784670UqH pauseView = getPauseView();
        if (pauseView != null) {
            pauseView.LLIZLLLIL = dataChannel;
            dataChannel.CQ2(PauseTimeChannel.class, pauseView, new AwS591S0100000_12(pauseView, 1132));
        }
        getTvCountFromXml().setText(CardStruct.IStatusCode.DEFAULT);
        getTvCountLikeFromXml().setText(CardStruct.IStatusCode.DEFAULT);
        C11O8 c11o8LJJJLZIJ = LLLLJI.LJJJLZIJ(C1701940uOG.LIZIZ());
        AfS176S0100000_7 afS176S0100000_7 = new AfS176S0100000_7(this, 287);
        AfS132S0000000_7 afS132S0000000_7 = C0J1R.LIZ;
        c11nj.LIZ(c11o8LJJJLZIJ.LJJLL(afS176S0100000_7, afS132S0000000_7));
        this.LLLFFI = (ImageView) findViewById(R.id.lpl);
        if (C497740JfY.LJJ() && (imageView = this.LLLFFI) != null) {
            C786410Ut5.Qb(imageView, -1.0f);
        }
        c11nj.LIZ(LLLLL.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS172S0100000_3(this, 81), afS132S0000000_7));
        C786410Ut5.R7(getPeopleCountViewFromXml(), new ACListenerS147S0100000_12((Object) this, 422));
        Map<String, Object> map = C1338270kvh.LIZ;
        C786410Ut5.Y7(getBtnRoomFromXml(), new ACListenerS147S0100000_12((Object) this, 416));
        arrayList.add(getBtnRoomFromXml());
        C786410Ut5.Y7(getBtnGoLiveFromXml(), new ACListenerS147S0100000_12((Object) this, 417));
        C786410Ut5.Y7(getBtnOpacityFromXml(), new ACListenerS147S0100000_12((Object) this, 418));
        arrayList.add(getBtnOpacityFromXml());
        C786410Ut5.Y7(getBtnSoundFromXml(), new ACListenerS147S0100000_12((Object) this, 419));
        arrayList.add(getBtnSoundFromXml());
        C786410Ut5.Y7(getBtnSettingFromXml(), new ACListenerS147S0100000_12((Object) this, 420));
        arrayList.add(getBtnSettingFromXml());
        C786410Ut5.Y7(getBtnPauseFromXml(), new ACListenerS147S0100000_12((Object) this, 421));
        C439101nJ.LJI(getBtnPauseFromXml());
        arrayList.add(getBtnPauseFromXml());
        if (C0UKZ.LJLJLLL.LIZIZ().booleanValue()) {
            C786410Ut5.LL(0, getBtnHighlightFromXml());
            arrayList.add(getBtnHighlightFromXml());
        } else {
            C786410Ut5.LL(8, getBtnHighlightFromXml());
        }
        LJJIFFI(getBtnHighlightFromXml(), true);
        C500260Jjc.LJLIIIL(500L, getBtnHighlightFromXml(), new AwS378S0200000_12(this, C1388190mED.LIZIZ(context), 97));
        dataChannel.CQ2(NetworkStatus.class, this, new AwS591S0100000_12(this, 1135));
        dataChannel.DQ2(GameBroadcastStateChannel.class, this, new AwS591S0100000_12(this, 1134));
        boolean z = this.LLLIIIL.scoreShow;
        this.LLLFZ = (RecyclerView) findViewById(R.id.txj);
        C1117360fBO c1117360fBO = new C1117360fBO();
        C784790UqT c784790UqT = new C784790UqT(z, dataChannel, c777030Udx);
        this.LLLILZ = c784790UqT;
        c1117360fBO.LLLI(C1105460esC.class, c784790UqT);
        RecyclerView recyclerView = this.LLLFZ;
        if (recyclerView != null) {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 0, false);
            linearLayoutManager.setStackFromEnd(true);
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        RecyclerView recyclerView2 = this.LLLFZ;
        if (recyclerView2 != null) {
            if (!recyclerView2.isComputingLayout()) {
                C0IJJ c0ijj = (C0IJJ) dataChannel.gg0(RoomComponentsV2Channel.class);
                if (c0ijj != null && (roomComponentsV2Response2 = c0ijj.LIZ) != null && (onlineRankListResponse = roomComponentsV2Response2.onlineAudience) != null) {
                    list = onlineRankListResponse.ranks;
                }
                ArrayList arrayList2 = new ArrayList(2);
                if (c0ijj != null && c0ijj.LIZIZ == null && (roomComponentsV2Response = c0ijj.LIZ) != null && roomComponentsV2Response.onlineAudience != null && roomComponentsV2Response != null && roomComponentsV2Response.onlineAudienceStatus == 1 && list != null) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Rank rank : list) {
                        if (rank.user != null) {
                            arrayList3.add(rank);
                        }
                    }
                    List<Rank> listLL = C13LP.LL(arrayList3, 2);
                    ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(listLL, 10));
                    for (Rank rank2 : listLL) {
                        User user = rank2.user;
                        if (user != null) {
                            arrayList4.add(new C1105460esC(user, rank2.score, rank2.rank, rank2.gapDescription, rank2.userRestrictionLevel));
                        } else {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    }
                    arrayList2.addAll(arrayList4);
                } else if (room != null && (numValueOf = Integer.valueOf(room.getUserCount())) != null && numValueOf.intValue() >= 2 && this.LLLIIIL.avatarShow) {
                    do {
                        arrayList2.add(new C1105460esC(new User(), 0L, 0L, "", 0L));
                        i++;
                    } while (i < 2);
                }
                c1117360fBO.LL = arrayList2;
                c1117360fBO.notifyDataSetChanged();
            }
            recyclerView2.setAdapter(c1117360fBO);
        }
        this.LLILZIL.CQ2(AudienceInProfileListChannel.class, this, new AwS582S0100000_3(this, 145));
        this.LLILZIL.CQ2(OnlineRankConfigChannel.class, this, new AwS591S0100000_12(this, 1136));
        C784730UqN soundView = getSoundView();
        if (soundView != null) {
            soundView.setCallBack(this);
        }
        this.LLILZIL.DQ2(MuteMicChannel.class, this, new AwS591S0100000_12(this, 1133));
        C784760UqQ opacityView = getOpacityView();
        if (opacityView != null) {
            opacityView.setCallBack(this);
        }
        LJ(InterfaceC772390URp.f130Y.LIZIZ().intValue());
        if (C011Z.LIZ.LJJII()) {
            getLiveTimeFromXml().getLayoutParams().width = -2;
            C500260Jjc.LJLJJL(C439101nJ.LIZ(2), getIvNetworkFromXml());
        }
        getLiveTimeFromXml().setText(getLiveTimeText());
        HandlerHook.viewPost(this, new ARunnableS112S0100000_12(this, 438));
    }

    public final boolean LJIIZILJ(long j, long j2, long j3, long j4) {
        if (j3 < this.LLJLLIL) {
            LJJ(1, getContext().getString(2131841698));
            C0TGS.LIZIZ(0, j4, "", false);
            Map<String, Object> map = C1338270kvh.LIZ;
            C784650UqF.LIZ(1, "duration < 1min", 0, j, j2, j3, this.LLJLLL, j4);
            return false;
        }
        if (j - this.LLJLLL >= this.LLJLIL) {
            return true;
        }
        LJJ(1, getContext().getString(2131841699));
        C0TGS.LIZIZ(1, j4, "", false);
        Map<String, Object> map2 = C1338270kvh.LIZ;
        C784650UqF.LIZ(0, "click interval < 5min", 0, j, j2, j3, this.LLJLLL, j4);
        return false;
    }

    public final void LJIJJLI(long j, long j2, long j3, long j4) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("highlight");
        sbLIZ.append(this.LLJZ.get());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C480460Ism.LIZ().getClass();
        ((HighLightApi) C480460Ism.LIZLLL(HighLightApi.class)).createHighLightVideo(0L, j4, 0L, System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT), strLIZIZ, 1).LJIILIIL(new C0UO0()).LJJLL(new AfS0S0100400_12(j4, j, j2, j3, this, 0), new AfS0S0100400_12(j, j2, j3, j4, this, 1));
    }
}
