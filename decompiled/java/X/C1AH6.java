package X;

import Y.ACListenerS142S0100000_7;
import Y.ACListenerS167S0100000_33;
import Y.ALAdapterS23S0200000_29;
import Y.ARunnableS118S0100000_18;
import Y.ARunnableS43S0101000_32;
import Y.AfS202S0100000_33;
import Y.AsS55S0100000_29;
import Y.AsS9S0101000_29;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Property;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.api.EnterBackgroundEvent;
import com.bytedance.android.live.broadcast.api.LiveHostClearMemTrigger;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multiguestv3.playbook.ActivePlaybookChannel;
import com.bytedance.android.livesdk.broadcast.LiveCenterTriggerApi;
import com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter.LiveCenterApi;
import com.bytedance.android.livesdk.broadcast.setting.LiveCenterManualRefreshSetting;
import com.bytedance.android.livesdk.broadcast.setting.LiveCenterNativePageRenew;
import com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService;
import com.bytedance.android.livesdk.dataChannel.BroadcastAudioStatusChannel;
import com.bytedance.android.livesdk.dataChannel.BroadcastNetworkStatusChannel;
import com.bytedance.android.livesdk.dataChannel.BroadcastNetworkV3StatusChannel;
import com.bytedance.android.livesdk.dataChannel.BroadcastPerformanceStatusChannel;
import com.bytedance.android.livesdk.dataChannel.LiveCenterForceRefreshEvent;
import com.bytedance.android.livesdk.dataChannel.LiveCenterNativeShowEvent;
import com.bytedance.android.livesdk.dataChannel.LiveCenterPerceptionAppealChannel;
import com.bytedance.android.livesdk.dataChannel.LiveCenterPlaySLRDiamondsEvent;
import com.bytedance.android.livesdk.dataChannel.LiveCenterStatusChannel;
import com.bytedance.android.livesdk.dataChannel.LiveCenterUpdateAppealChannel;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.LiveResumeEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterLynxCardOpt;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterMessageIntervalForGameSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterMessageIntervalSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterSparkLiteABSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterStructureOpt;
import com.bytedance.android.livesdk.model.Creator;
import com.bytedance.android.livesdk.model.message.AnchorGrowLevelMessage;
import com.bytedance.android.livesdk.model.message.LiveCenterStatusBarMessage;
import com.bytedance.android.livesdk.model.message.LiveJourneyMessage;
import com.bytedance.android.livesdk.model.message.RealtimeLiveCenterMethod;
import com.bytedance.android.livesdk.model.message.RealtimeLiveCenterUpdateMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS301S0000000_17;
import kotlin.jvm.internal.AwS273S0300000_29;
import kotlin.jvm.internal.AwS440S0200000_4;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.AwS612S0100000_33;
import kotlin.jvm.internal.AwS632S0100000_18;
import kotlin.jvm.internal.AwS647S0100000_33;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import tikcast.api.anchor_data.FlareCard;
import tikcast.api.anchor_data.RealtimeLiveCenterDetailData;
import tikcast.api.anchor_data.RealtimeLiveCenterLayoutData;
import tikcast.api.anchor_data.RealtimeLiveCenterLayoutTab;
import tikcast.api.anchor_data.RealtimeLiveCenterTrafficToolInfo;
import tikcast.api.anchor_data.RealtimeLiveCenterViolationRecordInfo;
import webcast.data.AnchorReminderWordInfo;
import webcast.data.AppealInfo;
import webcast.data.ColdStartStatData;
import webcast.data.PromoteCoupon;
import webcast.data.RealtimeFlashCard;
import webcast.data.RealtimeLiveCenterBaseData;
import webcast.data.RealtimeLiveCenterLopInfo;
import webcast.data.RealtimeReminderWordInfoMsg;
import webcast.data.RealtimeViolationRecord;
import webcast.data.TrafficDiagnose;
import webcast.data.WhiteBoxData;

/* JADX INFO: renamed from: X.1AH6, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AH6 extends FrameLayout implements OnMessageListener, InterfaceC782350UmX, InterfaceC1141530foN {
    public static final HashMap<String, C1AH3> LLLLLILLIL = new HashMap<>();
    public RecyclerView LL;
    public FrameLayout LLILLJJLI;
    public DataChannel LLILLL;
    public C1AH2 LLILZ;
    public int LLILZIL;
    public final C01GW LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public List<RealtimeLiveCenterLayoutTab> LLJ;
    public RealtimeLiveCenterDetailData LLJI;
    public RealtimeLiveCenterLayoutData LLJIJIL;
    public long LLJILJIL;
    public List<RealtimeLiveCenterLayoutTab> LLJILJILJ;
    public RealtimeLiveCenterDetailData LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public final List<RealtimeLiveCenterLayoutTab> LLJJIII;
    public C2176721AGw LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public long LLJJJ;
    public boolean LLJJJIL;
    public ColdStartStatData LLJJJJ;
    public WhiteBoxData LLJJJJJIL;
    public TrafficDiagnose LLJJJJLIIL;
    public final Set<SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB> LLJJL;
    public final Set<InterfaceC1541990qEH> LLJJLIIIJLLLLLLLZ;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLJL;
    public InterfaceC1541990qEH LLJLIL;
    public int LLJLILLLLZIIL;
    public boolean LLJLL;
    public boolean LLJLLIL;
    public C781710UlV LLJLLL;
    public final List<Function1<Boolean, Unit>> LLJZ;
    public final HashMap<String, Boolean> LLJZIJLIL;
    public long LLL;
    public C16F5 LLLF;
    public C16F5 LLLFF;
    public C16FV LLLFFI;
    public View LLLFZ;
    public C16FV LLLI;
    public C16FV LLLII;
    public C16FV LLLIIII;
    public C481090Itn LLLIIIIL;
    public boolean LLLIIIL;
    public AbstractC20368114mt LLLIIL;
    public String LLLIILIL;
    public String LLLIL;
    public boolean LLLILZ;
    public boolean LLLILZJ;
    public boolean LLLILZLLLI;
    public boolean LLLIZZ;
    public View LLLJ;
    public final RunnableC1887420zDQ LLLJIL;
    public final C1AH8 LLLJL;
    public final ARunnableS118S0100000_18 LLLL;
    public final ARunnableS118S0100000_18 LLLLII;
    public boolean LLLLIIIILLL;
    public String LLLLIIL;
    public int LLLLIILL;
    public int LLLLIILLL;
    public int LLLLIL;
    public int LLLLILI;
    public final List<String> LLLLJ;
    public long LLLLJI;
    public final LayoutInflater LLLLL;
    public boolean LLLLLIL;

    public C1AH6(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    static {
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
    }

    private final long getLiveCenterShowDuration() {
        if (this.LLL == -1) {
            return 0L;
        }
        return System.currentTimeMillis() - this.LLL;
    }

    private final int getLopCardPos() {
        List<RealtimeLiveCenterLayoutTab> list = this.LLJ;
        if (list != null) {
            Iterator<RealtimeLiveCenterLayoutTab> it2 = list.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (!Intrinsics.LJFF(it2.next().layoutName, C1AH3.LOP.getLayoutName())) {
                    i++;
                } else if (i != -1) {
                    return i + getBaseFunctionCount();
                }
            }
        }
        return -1;
    }

    private final int getPlayBookPos() {
        List<RealtimeLiveCenterLayoutTab> list = this.LLJ;
        if (list != null) {
            Iterator<RealtimeLiveCenterLayoutTab> it2 = list.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (!Intrinsics.LJFF(it2.next().layoutName, C1AH3.PLAY_BOOK.getLayoutName())) {
                    i++;
                } else if (i != -1) {
                    return i + getBaseFunctionCount();
                }
            }
        }
        return -1;
    }

    private final String getRoomId() {
        return (String) this.LLILZLL.getValue();
    }

    private final int getWebGuidePos() {
        int i = this.LLJLILLLLZIIL;
        if (i != -1) {
            return i;
        }
        List<RealtimeLiveCenterLayoutTab> list = this.LLJ;
        if (list != null) {
            Iterator<RealtimeLiveCenterLayoutTab> it2 = list.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (!Intrinsics.LJFF(it2.next().layoutName, C1AH3.PC_WEBSITE.getLayoutName())) {
                    i2++;
                } else if (i2 != -1) {
                    return i2 + getBaseFunctionCount();
                }
            }
        }
        return -1;
    }

    public final void LJIIJ() {
        IMessageManager iMessageManager;
        IMessageManager iMessageManager2;
        IMessageManager iMessageManager3;
        IMessageManager iMessageManager4;
        AbstractC21674919sB abstractC21674919sB;
        if (this.LLJJI) {
            return;
        }
        this.LLJJI = true;
        FrameLayout.inflate(getContext(), getLayoutId(), this);
        DataChannel dataChannel = this.LLILLL;
        if ((dataChannel != null ? dataChannel.gg0(LiveModeChannel.class) : null) == LiveMode.LIVE_STUDIO) {
            C500260Jjc.LJIILLIIL(getBackFromXml());
        } else {
            C786410Ut5.O7(getBackFromXml(), new ACListenerS167S0100000_33(this, 4));
        }
        if (LiveCenterManualRefreshSetting.INSTANCE.isEnable()) {
            C481090Itn c481090Itn = (C481090Itn) findViewById(R.id.t25);
            this.LLLIIIIL = c481090Itn;
            if (c481090Itn != null) {
                c481090Itn.setOnRefreshListener(new AwS577S0100000_33(this, 52));
            }
        }
        LiveCenterNativePageRenew liveCenterNativePageRenew = LiveCenterNativePageRenew.INSTANCE;
        if (liveCenterNativePageRenew.isEnable()) {
            if (C1152720g6Q.LIZ()) {
                View viewFindViewById = findViewById(R.id.w13);
                if (viewFindViewById != null) {
                    C500260Jjc.LLFFF(viewFindViewById);
                }
                this.LLLF = (C16F5) findViewById(R.id.mwq);
                C16FV c16fv = (C16FV) findViewById(R.id.bau);
                this.LLLI = c16fv;
                if (c16fv != null) {
                    c16fv.setImageDrawable(C475760IlC.LIZ(this.LLLLIILLL, getContext()));
                }
                C16FV c16fv2 = (C16FV) findViewById(R.id.f773p5a);
                this.LLLII = c16fv2;
                if (c16fv2 != null) {
                    c16fv2.setImageDrawable(C475760IlC.LIZJ(this.LLLLIL, getContext()));
                }
                C16FV c16fv3 = (C16FV) findViewById(R.id.q8q);
                this.LLLIIII = c16fv3;
                if (c16fv3 != null) {
                    c16fv3.setImageDrawable(C475760IlC.LIZLLL(this.LLLLILI, getContext()));
                }
                View viewFindViewById2 = findViewById(R.id.w1d);
                this.LLLFZ = viewFindViewById2;
                if (viewFindViewById2 != null) {
                    C786410Ut5.I7(new ACListenerS142S0100000_7(this, 22), viewFindViewById2);
                }
            } else {
                View viewFindViewById3 = findViewById(R.id.w13);
                if (viewFindViewById3 != null) {
                    C500260Jjc.LLFFF(viewFindViewById3);
                }
                this.LLLF = (C16F5) findViewById(R.id.mwq);
                this.LLLFF = (C16F5) findViewById(R.id.p5_);
                this.LLLFFI = (C16FV) findViewById(R.id.p59);
            }
        }
        this.LLILZ = new C1AH2(this, this.LLLJL);
        getRecyclerViewFromXml().setAdapter(this.LLILZ);
        if (liveCenterNativePageRenew.isEnable()) {
            getRecyclerViewFromXml().addItemDecoration(new C476680Img(3));
        }
        getRecyclerViewFromXml().setLayoutManager(new LinearLayoutManager(getContext()));
        C781710UlV c781710UlV = new C781710UlV(1, 30.0d, getRecyclerViewFromXml(), new AwS647S0100000_33(this, 1));
        this.LLJLLL = c781710UlV;
        c781710UlV.LIZJ(true);
        AbstractC21673719rz itemAnimator = getRecyclerViewFromXml().getItemAnimator();
        if ((itemAnimator instanceof C423520Gj8) && (abstractC21674919sB = (AbstractC21674919sB) itemAnimator) != null) {
            abstractC21674919sB.LLIZ = false;
        }
        DataChannel dataChannel2 = this.LLILLL;
        if (dataChannel2 != null && (iMessageManager4 = (IMessageManager) dataChannel2.gg0(C776250Uch.class)) != null) {
            iMessageManager4.addMessageListener(C001A.REALTIME_LIVE_CENTER_METHOD.getIntType(), this);
        }
        DataChannel dataChannel3 = this.LLILLL;
        if (dataChannel3 != null && (iMessageManager3 = (IMessageManager) dataChannel3.gg0(C776250Uch.class)) != null) {
            iMessageManager3.addMessageListener(C001A.ANCHOR_GROW_LEVEL_MESSAGE.getIntType(), this);
        }
        DataChannel dataChannel4 = this.LLILLL;
        if (dataChannel4 != null && (iMessageManager2 = (IMessageManager) dataChannel4.gg0(C776250Uch.class)) != null) {
            iMessageManager2.addMessageListener(C001A.LIVE_JOURNEY_MESSAGE.getIntType(), this);
        }
        DataChannel dataChannel5 = this.LLILLL;
        if (dataChannel5 != null && (iMessageManager = (IMessageManager) dataChannel5.gg0(C776250Uch.class)) != null) {
            iMessageManager.addMessageListener(C001A.REALTIME_LIVE_CENTER_UPDATE_MESSAGE.getIntType(), this);
        }
        if (!C1152720g6Q.LIZ()) {
            DataChannel dataChannel6 = this.LLILLL;
            if (dataChannel6 != null) {
                dataChannel6.DQ2(BroadcastNetworkStatusChannel.class, this, new AwS611S0100000_32(this, 22));
                return;
            }
            return;
        }
        DataChannel dataChannel7 = this.LLILLL;
        if (dataChannel7 != null) {
            dataChannel7.DQ2(BroadcastNetworkV3StatusChannel.class, this, new AwS586S0100000_7(this, 25));
        }
        DataChannel dataChannel8 = this.LLILLL;
        if (dataChannel8 != null) {
            dataChannel8.DQ2(BroadcastAudioStatusChannel.class, this, new AwS586S0100000_7(this, 26));
        }
        DataChannel dataChannel9 = this.LLILLL;
        if (dataChannel9 != null) {
            dataChannel9.DQ2(BroadcastPerformanceStatusChannel.class, this, new AwS586S0100000_7(this, 27));
        }
    }

    public final void LJIIJJI() {
        try {
            C1AH2 c1ah2 = this.LLILZ;
            if (c1ah2 != null) {
                c1ah2.notifyItemChanged(getLopCardPos());
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("notifyLopCard: ");
            sbLIZ.append(e);
            C20441214yg.LJ("LiveCenterMainView", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LJIILJJIL() {
        if (this.LLLILZJ || !C12OR.LIZ) {
            return;
        }
        this.LLLILZJ = true;
        C20441214yg.LJ("songsong", "sendSrlCardPlayAnimEvent");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("play_lynx_anim", "1");
        jSONObject.put("send_gift_user_id", C12OR.LIZIZ);
        C389001fE.LIZ("live_slr_show_diamond_anim", jSONObject, System.currentTimeMillis(), false);
    }

    public final void LJIIZILJ() {
        List<RealtimeLiveCenterLayoutTab> list;
        int i;
        AnchorReminderWordInfo anchorReminderWordInfo;
        if (LiveCenterNativePageRenew.INSTANCE.isEnable() || (list = this.LLJ) == null) {
            return;
        }
        Iterator<RealtimeLiveCenterLayoutTab> it2 = list.iterator();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = -1;
            if (!it2.hasNext()) {
                break;
            }
            if (!Intrinsics.LJFF(it2.next().layoutName, C1AH3.TIPS.getLayoutName())) {
                i3++;
            } else if (i3 != -1) {
                return;
            }
        }
        RealtimeLiveCenterDetailData realtimeLiveCenterDetailData = this.LLJI;
        if (C1533950q1J.LJ((realtimeLiveCenterDetailData == null || (anchorReminderWordInfo = realtimeLiveCenterDetailData.reminderWordInfo) == null) ? null : anchorReminderWordInfo.content)) {
            RealtimeLiveCenterLayoutTab realtimeLiveCenterLayoutTab = new RealtimeLiveCenterLayoutTab();
            realtimeLiveCenterLayoutTab.layoutName = C1AH3.TIPS.getLayoutName();
            int i4 = this.LLJLILLLLZIIL;
            if (i4 == -1) {
                list.add(realtimeLiveCenterLayoutTab);
            } else {
                ListProtector.add(list, i4, realtimeLiveCenterLayoutTab);
            }
            Iterator<RealtimeLiveCenterLayoutTab> it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                if (Intrinsics.LJFF(it3.next().layoutName, C1AH3.PC_WEBSITE.getLayoutName())) {
                    i = i2;
                    break;
                }
                i2++;
            }
            this.LLJLILLLLZIIL = i;
        }
    }

    public final FrameLayout getBackFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.bmy);
            this.LLILLJJLI = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final int getBaseFunctionCount() {
        return this.LLJJIII.size();
    }

    public final RecyclerView getRecyclerViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.t0q);
            this.LL = (RecyclerView) callbackFindViewById;
        }
        return (RecyclerView) callbackFindViewById;
    }

    public final int getTipsPos() {
        List<RealtimeLiveCenterLayoutTab> list = this.LLJ;
        if (list != null) {
            Iterator<RealtimeLiveCenterLayoutTab> it2 = list.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (!Intrinsics.LJFF(it2.next().layoutName, C1AH3.TIPS.getLayoutName())) {
                    i++;
                } else if (i != -1) {
                    return i + getBaseFunctionCount();
                }
            }
        }
        return -1;
    }

    @Override // X.InterfaceC782350UmX
    public final void onDestroy() {
        BPEAHandler bPEAHandler;
        IMessageManager iMessageManager;
        if (this.LLJJ) {
            if (this.LLJJIJIIJIL) {
                C12OY.LJIILL(getLiveCenterShowDuration(), this.LLILLL, this.LLLLIIL, "other");
            }
            C20441214yg.LIZIZ("LiveCenterMainView", "onDestroy");
            if (this.LLJJI) {
                DataChannel dataChannel = this.LLILLL;
                if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
                    iMessageManager.removeMessageListener(this);
                }
                C2176721AGw c2176721AGw = this.LLJJIJI;
                if (c2176721AGw != null && (bPEAHandler = c2176721AGw.LLILZIL) != null) {
                    bPEAHandler.removeCallbacksAndMessages(null);
                }
            } else {
                C473410IhP.LIZ().removeCallbacks(this.LLLL);
            }
            this.LLLIIL = null;
            this.LLJZIJLIL.clear();
            DataChannel dataChannel2 = this.LLILLL;
            if (dataChannel2 != null) {
                dataChannel2.zQ2(this);
            }
            if (LiveCenterLynxCardOpt.INSTANCE.enable()) {
                Iterator<SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB> it2 = this.LLJJL.iterator();
                while (it2.hasNext()) {
                    it2.next().LJJ(true);
                }
                this.LLJJL.clear();
                Iterator<InterfaceC1541990qEH> it3 = this.LLJJLIIIJLLLLLLLZ.iterator();
                while (it3.hasNext()) {
                    it3.next().LLD(true);
                }
                this.LLJJLIIIJLLLLLLLZ.clear();
            } else {
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJL;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                    boolean z = SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLILZJ;
                    sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJ(true);
                }
                InterfaceC1541990qEH interfaceC1541990qEH = this.LLJLIL;
                if (interfaceC1541990qEH != null) {
                    interfaceC1541990qEH.LLD(true);
                }
            }
            this.LLJL = null;
            this.LLJLIL = null;
            ((ArrayList) this.LLJZ).clear();
            ((ArrayList) C2176561AGg.LIZIZ).clear();
            PthreadTimer pthreadTimer = C2176561AGg.LIZ;
            if (pthreadTimer != null) {
                pthreadTimer.cancel();
                C2176561AGg.LIZ = null;
            }
            ((ArrayList) C2176561AGg.LJFF).clear();
            ((ArrayList) C2176561AGg.LJ).clear();
            ((LinkedHashMap) C2176561AGg.LIZJ).clear();
        }
    }

    public final int getLayoutId() {
        return C1152720g6Q.LIZ() ? R.layout.h20 : R.layout.h1z;
    }

    public final C1AHD getBridge() {
        return this.LLLJL;
    }

    public final LayoutInflater getDarkInflater() {
        return this.LLLLL;
    }

    public final long getLastReqTimeStamp() {
        return this.LLLLJI;
    }

    public static long LJ(C1AH6 c1ah6) {
        RealtimeLiveCenterBaseData realtimeLiveCenterBaseData;
        RealtimeLiveCenterDetailData realtimeLiveCenterDetailData = c1ah6.LLJI;
        if (realtimeLiveCenterDetailData != null) {
            realtimeLiveCenterBaseData = realtimeLiveCenterDetailData.baseInfo;
        } else {
            realtimeLiveCenterBaseData = null;
        }
        c1ah6.getClass();
        if (realtimeLiveCenterBaseData != null) {
            return realtimeLiveCenterBaseData.liveEndTime - realtimeLiveCenterBaseData.liveStartTime;
        }
        return 0L;
    }

    public static void LJIIL(String str) {
        C01HZ c01hzKi1 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).ki1();
        if (c01hzKi1 != null) {
            c01hzKi1.LIZIZ(EnumC499801x6.PLAYBOOK, C915900ZwS.LIZIZ(str), null);
        }
    }

    public static void LJIILIIL(ColdStartStatData coldStartStatData) throws JSONException {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Send ColdStart IM: ");
        sbLIZ.append(coldStartStatData);
        C20441214yg.LIZIZ("LiveCenterMainView", C2188811AlT.LIZIZ(sbLIZ));
        if (coldStartStatData != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("payload", C1058250de3.LIZLLL(coldStartStatData));
            C389001fE.LIZ("live_traffic_graph_message_event", jSONObject, System.currentTimeMillis(), false);
        }
    }

    @Override // X.InterfaceC782350UmX
    public final void LIZ(DataChannel dataChannel) {
        Creator creator;
        if (!this.LLJJ && dataChannel != null) {
            this.LLJJ = true;
            for (C1AH3 c1ah3 : C1AH3.values()) {
                LLLLLILLIL.put(c1ah3.getLayoutName(), c1ah3);
            }
            this.LLILLL = dataChannel;
            dataChannel.EQ2(null, LiveCenterStatusChannel.class, new AwS612S0100000_33(this, 13));
            dataChannel.BQ2(null, LiveCenterNativeShowEvent.class, new AwS612S0100000_33(this, 14));
            dataChannel.CQ2(LiveCenterPerceptionAppealChannel.class, this, new AwS591S0100000_12(this, 204));
            dataChannel.CQ2(EnterBackgroundEvent.class, this, new AwS607S0100000_28(this, 28));
            dataChannel.BQ2(null, LiveCenterForceRefreshEvent.class, new AwS612S0100000_33(this, 9));
            dataChannel.BQ2(null, LiveResumeEvent.class, new AwS597S0100000_18(this, 49));
            dataChannel.BQ2(null, ActivePlaybookChannel.class, new AwS591S0100000_12(this, 203));
            dataChannel.BQ2(null, LiveCenterTriggerApi.class, new AwS612S0100000_33(this, 10));
            dataChannel.BQ2(null, LiveCenterUpdateAppealChannel.class, new AwS607S0100000_28(this, 27));
            dataChannel.BQ2(null, LiveCenterPlaySLRDiamondsEvent.class, new AwS612S0100000_33(this, 11));
            dataChannel.BQ2(null, LiveHostClearMemTrigger.class, new AwS612S0100000_33(this, 12));
            Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(this.LLILLL);
            if (roomLJJLIIIIJ == null || (creator = roomLJJLIIIIJ.creator) == null || creator.roomContinue != 0) {
                this.LLJJIJIL = true;
                LJIILLIIL(false);
            }
            AwS632S0100000_18 awS632S0100000_18 = new AwS632S0100000_18(this, 32);
            EnumC776070UcP enumC776070UcP = EnumC776070UcP.REALTIME_LIVE_CENTER_REFRESH_INTERVAL_INCREASE;
            C2252331DDr c2252331DDr = C775900Uc8.LIZ;
            C775900Uc8.LJI(enumC776070UcP, new AwS440S0200000_4(enumC776070UcP, awS632S0100000_18, 0));
            C775900Uc8.LJI(EnumC776070UcP.REALTIME_LIVE_CENTER_ENTRY_ANIM_BLOCK, AFwS301S0000000_17.get$arr$(4));
            C473410IhP.LIZJ(this.LLLL, 10000L);
        }
    }

    public final void LJFF(boolean z) {
        if (LiveCenterManualRefreshSetting.INSTANCE.isEnable()) {
            if (this.LLIZ) {
                C20441214yg.LIZIZ("LiveCenterMainView", "stop Refresh");
                C481090Itn c481090Itn = this.LLLIIIIL;
                if (c481090Itn != null) {
                    c481090Itn.setRefreshing(false);
                    return;
                }
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = this.LLLLJI;
            if (j != -1 && jCurrentTimeMillis - j < 1000 && !z) {
                this.LLIZ = false;
                C20441214yg.LIZIZ("LiveCenterMainView", "stop Refresh");
                C481090Itn c481090Itn2 = this.LLLIIIIL;
                if (c481090Itn2 != null) {
                    c481090Itn2.setRefreshing(false);
                    return;
                }
                return;
            }
        }
        this.LLIZ = true;
        C01GW<C0UVW> c01gw = C0UVW.LIZIZ;
        LiveCenterApi liveCenterApiLIZLLL = C01QD.LIZ().LIZLLL();
        String roomId = getRoomId();
        String str = this.LLLIILIL;
        if (str == null) {
            str = "";
        }
        String str2 = this.LLLIL;
        if (str2 == null) {
            str2 = "";
        }
        liveCenterApiLIZLLL.getOverview(roomId, 1, 1, 0, str, str2).LJIILIIL(new C0UO0()).LJJLL(new AfS202S0100000_33(this, 7), new AfS202S0100000_33(this, 8));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        r0 = r5.LLJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002f, code lost:
    
        if (r0 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0031, code lost:
    
        r1 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0039, code lost:
    
        if (r1.hasNext() == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(r1.next().layoutName, r6) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0049, code lost:
    
        if (r3 == (-1)) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        return r3 + getBaseFunctionCount();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0051, code lost:
    
        r3 = r3 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJI(java.lang.String r6) {
        /*
            r5 = this;
            r3 = 0
            if (r6 == 0) goto Le
            int r0 = r6.length()
            if (r0 == 0) goto Le
            r0 = 0
        La:
            r4 = -1
            if (r0 == 0) goto L10
            return r4
        Le:
            r0 = 1
            goto La
        L10:
            java.util.List<tikcast.api.anchor_data.RealtimeLiveCenterLayoutTab> r0 = r5.LLJJIII
            java.util.Iterator r1 = r0.iterator()
            r2 = 0
        L17:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L57
            java.lang.Object r0 = r1.next()
            tikcast.api.anchor_data.RealtimeLiveCenterLayoutTab r0 = (tikcast.api.anchor_data.RealtimeLiveCenterLayoutTab) r0
            java.lang.String r0 = r0.layoutName
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r6)
            if (r0 == 0) goto L54
            if (r2 != r4) goto L59
        L2d:
            java.util.List<tikcast.api.anchor_data.RealtimeLiveCenterLayoutTab> r0 = r5.LLJ
            if (r0 == 0) goto L59
            java.util.Iterator r1 = r0.iterator()
        L35:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L59
            java.lang.Object r0 = r1.next()
            tikcast.api.anchor_data.RealtimeLiveCenterLayoutTab r0 = (tikcast.api.anchor_data.RealtimeLiveCenterLayoutTab) r0
            java.lang.String r0 = r0.layoutName
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r6)
            if (r0 == 0) goto L51
            if (r3 == r4) goto L59
            int r0 = r5.getBaseFunctionCount()
            int r3 = r3 + r0
            return r3
        L51:
            int r3 = r3 + 1
            goto L35
        L54:
            int r2 = r2 + 1
            goto L17
        L57:
            r2 = -1
            goto L2d
        L59:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1AH6.LJI(java.lang.String):int");
    }

    public final void LJII(boolean z) {
        if (z) {
            Iterator<String> it2 = this.LLLLJ.iterator();
            while (it2.hasNext()) {
                C1548820qPI.LIZLLL(it2.next(), this);
            }
        } else {
            Iterator<String> it3 = this.LLLLJ.iterator();
            while (it3.hasNext()) {
                C1548820qPI.LJIIIIZZ(it3.next(), this);
            }
        }
    }

    public final void LJIIIIZZ(String str) {
        C20441214yg.LIZIZ("LiveCenterMainView", "hide");
        if (!this.LLJJ) {
            return;
        }
        this.LLLIZZ = false;
        long liveCenterShowDuration = getLiveCenterShowDuration();
        C12OY.LJIILL(liveCenterShowDuration, this.LLILLL, this.LLLLIIL, str);
        if (liveCenterShowDuration >= Mp4ScreenVideoLoadTimeout.CONTROL) {
            C01GW<C0UVW> c01gw = C0UVW.LIZIZ;
            C01QD.LIZ().LIZLLL().finishLiveCenterTimingTask(8).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.0gNp
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("LiveCenterMainView@9a36.hide$1");
                    C20441214yg.LIZIZ("LiveCenterMainView", "finish task");
                    C1C7U.LIZIZ("LiveCenterMainView@9a36.hide$1");
                }
            }, new C09JN() { // from class: X.0gNo
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("LiveCenterMainView@9a36.hide$2");
                    C1C7U.LIZIZ("LiveCenterMainView@9a36.hide$2");
                }
            });
        }
        this.LLL = -1L;
        this.LLJJIJIIJIL = false;
        this.LLLLIIIILLL = false;
        this.LLJZIJLIL.clear();
        Iterator it2 = ((ArrayList) this.LLJZ).iterator();
        while (it2.hasNext()) {
            ((Function1) it2.next()).invoke(Boolean.FALSE);
        }
        LJII(false);
        C473410IhP.LIZ().removeCallbacks(this.LLLLII);
        C473410IhP.LIZJ(this.LLLLII, Mp4ScreenVideoLoadTimeout.CONTROL);
        PthreadTimer pthreadTimer = C2176561AGg.LIZ;
        if (pthreadTimer != null) {
            pthreadTimer.cancel();
            C2176561AGg.LIZ = null;
        }
        C786410Ut5.LJLIIL(3000L, C473410IhP.LIZ(), this.LLLJIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, X.0rMx, Y.AsS55S0100000_29] */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.111p, java.lang.Object] */
    public final void LJIIIZ(View view) {
        Context context = getContext();
        if (context == null) {
            return;
        }
        int iLIZLLL = C497740JfY.LIZLLL(R.attr.ey_, C1834150xpV.LJII(context));
        final RecyclerView recyclerViewFromXml = getRecyclerViewFromXml();
        if (recyclerViewFromXml == 0) {
            return;
        }
        int iLIZIZ = (int) C497740JfY.LIZIZ(12.0f);
        View view2 = this.LLLJ;
        if (view2 != null) {
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, view2);
            removeView(view2);
        }
        final View view3 = new View(context);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(iLIZLLL);
        view3.setBackground(gradientDrawable);
        C786410Ut5.T4(view3, 0.0f);
        addView(view3, new FrameLayout.LayoutParams(-1, view.getHeight() + (iLIZIZ * 2)));
        this.LLLJ = view3;
        C19672811y2 c19672811y2 = new C19672811y2(view, this, iLIZIZ, view3);
        c19672811y2.invoke();
        final C259800zU c259800zU = new C259800zU();
        final C12YR c12yr = new C12YR(c19672811y2, 0);
        C786410Ut5.y3(getViewTreeObserver(), c12yr);
        ?? r4 = new Runnable() { // from class: X.111p
            public final void LIZ() {
                AbstractC1585810rMx abstractC1585810rMx = c259800zU.element;
                if (abstractC1585810rMx != null) {
                    recyclerViewFromXml.removeOnScrollListener(abstractC1585810rMx);
                }
                C786410Ut5.D3(this.getViewTreeObserver(), c12yr);
                C1AH6 c1ah6 = this;
                View view4 = view3;
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(c1ah6, view4);
                c1ah6.removeView(view4);
                if (Intrinsics.LJFF(this.LLLJ, view3)) {
                    this.LLLJ = null;
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LiveCenterMainView@9a36.highlightCardView$clearOverlay$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LiveCenterMainView@9a36.highlightCardView$clearOverlay$1");
            }
        };
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view3, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(500L);
        objectAnimatorOfFloat.addListener(new ALAdapterS23S0200000_29(view3, r4, 3));
        AwS273S0300000_29 awS273S0300000_29 = new AwS273S0300000_29(view3, (RunnableC194343111p) r4, objectAnimatorOfFloat, 0);
        ?? asS55S0100000_29 = new AsS55S0100000_29(awS273S0300000_29, 1);
        c259800zU.element = asS55S0100000_29;
        recyclerViewFromXml.addOnScrollListener(asS55S0100000_29);
        view.addOnAttachStateChangeListener(new C12YF(awS273S0300000_29, 1));
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }

    public final void LJIILL(WhiteBoxData whiteBoxData) throws JSONException {
        String str;
        TrafficDiagnose trafficDiagnose;
        TrafficDiagnose trafficDiagnose2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Send White Box IM: ");
        if (whiteBoxData != null && (trafficDiagnose2 = whiteBoxData.trafficDiagnose) != null) {
            str = trafficDiagnose2.body;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        C20441214yg.LIZIZ("LiveCenterMainView", C2188811AlT.LIZIZ(sbLIZ));
        if (whiteBoxData != null) {
            if (whiteBoxData.trafficDiagnose == null && (trafficDiagnose = this.LLJJJJLIIL) != null) {
                whiteBoxData.trafficDiagnose = trafficDiagnose;
                this.LLJJJJLIIL = null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("payload", C1058250de3.LIZLLL(whiteBoxData));
            C389001fE.LIZ("live_traffic_graph_message_event", jSONObject, System.currentTimeMillis(), false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIILLIIL(boolean z) {
        Object objGg0;
        int value;
        int i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("switchImMessage: ");
        sbLIZ.append(z);
        sbLIZ.append(", ");
        sbLIZ.append(this.LLJJIJIL);
        C20441214yg.LIZIZ("LiveCenterMainView", C2188811AlT.LIZIZ(sbLIZ));
        if (z == this.LLJJIJIL) {
            return;
        }
        if (!z && this.LLJJIJIIJIL) {
            return;
        }
        this.LLJJIJIL = z;
        DataChannel dataChannel = this.LLILLL;
        if (dataChannel != null) {
            objGg0 = dataChannel.gg0(LiveModeChannel.class);
        } else {
            objGg0 = null;
        }
        if (objGg0 == LiveMode.LIVE_STUDIO) {
            value = LiveCenterMessageIntervalForGameSetting.INSTANCE.getValue();
        } else {
            value = LiveCenterMessageIntervalSetting.INSTANCE.getValue();
        }
        this.LLILZIL = value;
        C01GW<C0UVW> c01gw = C0UVW.LIZIZ;
        LiveCenterApi liveCenterApiLIZLLL = C01QD.LIZ().LIZLLL();
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        liveCenterApiLIZLLL.switchImMessage(i, this.LLILZIL, getRoomId()).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.0gNq
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("LiveCenterMainView@9a36.switchImMessage$1");
                C1C7U.LIZIZ("LiveCenterMainView@9a36.switchImMessage$1");
            }
        }, new C09JN() { // from class: X.0gNr
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("LiveCenterMainView@9a36.switchImMessage$2");
                C1C7U.LIZIZ("LiveCenterMainView@9a36.switchImMessage$2");
            }
        });
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("should_refresh", String.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0));
        C389001fE.LIZ("live_anchor_center_refresh_data", jSONObject, System.currentTimeMillis(), false);
    }

    public final void LJIJ(RealtimeLiveCenterBaseData realtimeLiveCenterBaseData) {
        long j;
        if (LiveCenterNativePageRenew.INSTANCE.isEnable()) {
            if (C500260Jjc.LJJJIL(this.LLILLL)) {
                C16F5 c16f5 = this.LLLF;
                if (c16f5 != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(C497740JfY.LJIJI(2131844557));
                    sbLIZ.append(": -");
                    c16f5.setText(C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
                return;
            }
            if (realtimeLiveCenterBaseData != null) {
                j = realtimeLiveCenterBaseData.liveEndTime - realtimeLiveCenterBaseData.liveStartTime;
            } else {
                j = 0;
            }
            long j2 = 3600;
            long j3 = j / j2;
            long j4 = (j - (j2 * j3)) / ((long) 60);
            if (j3 > 0) {
                C16F5 c16f52 = this.LLLF;
                if (c16f52 == null) {
                    return;
                }
                c16f52.setText(C497740JfY.LJIJJ(2131855626, String.valueOf(j3), String.valueOf(j4)));
                return;
            }
            C16F5 c16f53 = this.LLLF;
            if (c16f53 == null) {
                return;
            }
            c16f53.setText(C497740JfY.LJIJJ(2131855627, String.valueOf(j4)));
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) throws JSONException {
        RealtimeFlashCard realtimeFlashCard;
        RealtimeLiveCenterTrafficToolInfo realtimeLiveCenterTrafficToolInfo;
        FlareCard flareCard;
        String str = c262100zr.LIZ;
        switch (str.hashCode()) {
            case -1889914756:
                if (str.equals("anchor_center_request_flare_card_info")) {
                    RealtimeLiveCenterDetailData realtimeLiveCenterDetailData = this.LLJI;
                    if (realtimeLiveCenterDetailData != null && (realtimeLiveCenterTrafficToolInfo = realtimeLiveCenterDetailData.trafficToolInfo) != null && (flareCard = realtimeLiveCenterTrafficToolInfo.flareCard) != null) {
                        realtimeFlashCard = new RealtimeFlashCard();
                        realtimeFlashCard.boosted = flareCard.boosted;
                        realtimeFlashCard.boostUserCount = flareCard.boostUserCount;
                    } else {
                        realtimeFlashCard = null;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Send ColdStart IM: ");
                    sbLIZ.append(realtimeFlashCard);
                    C20441214yg.LIZIZ("LiveCenterMainView", C2188811AlT.LIZIZ(sbLIZ));
                    if (realtimeFlashCard != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("boosted", realtimeFlashCard.boosted);
                        jSONObject.put("boostUserCount", realtimeFlashCard.boostUserCount);
                        C389001fE.LIZ("anchor_center_response_flare_card_info", jSONObject, System.currentTimeMillis(), false);
                    }
                }
                break;
            case 340321008:
                if (str.equals("live_anchor_center_force_update")) {
                    C20441214yg.LIZIZ("LiveCenterMainView", "Receive FE message: live_anchor_center_force_update");
                    if (this.LLJJIJIIJIL) {
                        LJFF(true);
                    }
                }
                break;
            case 1009377055:
                if (str.equals("anchor_center_request_coldstart_info")) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Receive FE message ");
                    sbLIZ2.append(this.LLJJJJLIIL);
                    C20441214yg.LIZIZ("LiveCenterMainView", C2188811AlT.LIZIZ(sbLIZ2));
                    this.LLJJJIL = true;
                    WhiteBoxData whiteBoxData = this.LLJJJJJIL;
                    if (whiteBoxData != null) {
                        LJIILL(whiteBoxData);
                    } else {
                        LJIILIIL(this.LLJJJJ);
                    }
                }
                break;
            case 1600926626:
                if (str.equals("realtime_live_center_lynx_loaded")) {
                    C20441214yg.LIZIZ("LiveCenterMainView", "Receive FE message: realtime_live_center_lynx_loaded");
                    if (this.LLJJIJIIJIL) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("visibility", "1");
                        C389001fE.LIZ("realtime_live_center_lynx_load_complete", jSONObject2, System.currentTimeMillis(), false);
                    }
                }
                break;
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) throws JSONException {
        Boolean boolValueOf;
        String str;
        if ((iMessage instanceof AnchorGrowLevelMessage) || (iMessage instanceof LiveJourneyMessage)) {
            LJFF(true);
        }
        if (iMessage instanceof LiveCenterStatusBarMessage) {
            C781380Uky c781380Uky = C781380Uky.LIZ;
            LiveCenterStatusBarMessage liveCenterStatusBarMessage = (LiveCenterStatusBarMessage) iMessage;
            RealtimeLiveCenterLopInfo realtimeLiveCenterLopInfo = liveCenterStatusBarMessage.lopInfo;
            c781380Uky.getClass();
            C781380Uky.LJFF(realtimeLiveCenterLopInfo);
            C781380Uky.LIZ(this.LLILLL, liveCenterStatusBarMessage.lopInfo);
            RealtimeLiveCenterLopInfo realtimeLiveCenterLopInfo2 = liveCenterStatusBarMessage.lopInfo;
            if (realtimeLiveCenterLopInfo2 != null) {
                DataChannel dataChannel = this.LLILLL;
                c781380Uky.getClass();
                C781380Uky.LIZ(dataChannel, realtimeLiveCenterLopInfo2);
                RealtimeLiveCenterDetailData realtimeLiveCenterDetailData = this.LLJI;
                if (realtimeLiveCenterDetailData != null) {
                    realtimeLiveCenterDetailData.lopInfo = realtimeLiveCenterLopInfo2;
                    LJIIJJI();
                }
            }
        }
        if (iMessage instanceof RealtimeLiveCenterUpdateMessage) {
            String strLIZLLL = C1058250de3.LIZLLL(((RealtimeLiveCenterUpdateMessage) iMessage).list);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Receive RealtimeLiveCenterUpdateMessage: ");
            sbLIZ.append(strLIZLLL);
            C20441214yg.LIZIZ("LiveCenterMainView", C2188811AlT.LIZIZ(sbLIZ));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("lynx_data", strLIZLLL);
            C389001fE.LIZ("live_anchor_center_im_data_response", jSONObject, System.currentTimeMillis(), false);
        }
        if (this.LLJJ && this.LLJJI && this.LLJJIJIL && (iMessage instanceof RealtimeLiveCenterMethod)) {
            RealtimeLiveCenterMethod realtimeLiveCenterMethod = (RealtimeLiveCenterMethod) iMessage;
            LJIJ(realtimeLiveCenterMethod.baseInfo);
            C781380Uky c781380Uky2 = C781380Uky.LIZ;
            RealtimeLiveCenterLopInfo realtimeLiveCenterLopInfo3 = realtimeLiveCenterMethod.lopInfo;
            c781380Uky2.getClass();
            C781380Uky.LJFF(realtimeLiveCenterLopInfo3);
            if (realtimeLiveCenterMethod.timestamp >= this.LLJJJ) {
                RecyclerView recyclerViewFromXml = getRecyclerViewFromXml();
                AnchorReminderWordInfo anchorReminderWordInfo = null;
                if (recyclerViewFromXml != null) {
                    boolValueOf = Boolean.valueOf(recyclerViewFromXml.isComputingLayout());
                } else {
                    boolValueOf = null;
                }
                if (!C500260Jjc.LJJIJIL(boolValueOf)) {
                    long j = realtimeLiveCenterMethod.timestamp;
                    if (j - this.LLJJJ < 3000) {
                        return;
                    }
                    this.LLJJJ = j;
                    if (this.LLJI == null) {
                        this.LLJI = new RealtimeLiveCenterDetailData();
                    }
                    RealtimeLiveCenterDetailData realtimeLiveCenterDetailData2 = this.LLJI;
                    if (realtimeLiveCenterDetailData2 != null) {
                        realtimeLiveCenterDetailData2.baseInfo = realtimeLiveCenterMethod.baseInfo;
                        if (!LiveCenterNativePageRenew.INSTANCE.isEnable()) {
                            realtimeLiveCenterDetailData2.tipsInfo = realtimeLiveCenterMethod.tipsInfo;
                        }
                        realtimeLiveCenterDetailData2.shopInfo = realtimeLiveCenterMethod.shopInfo;
                        RealtimeLiveCenterLopInfo realtimeLiveCenterLopInfo4 = realtimeLiveCenterMethod.lopInfo;
                        if (realtimeLiveCenterLopInfo4 != null) {
                            realtimeLiveCenterDetailData2.lopInfo = realtimeLiveCenterLopInfo4;
                        }
                        RealtimeReminderWordInfoMsg realtimeReminderWordInfoMsg = realtimeLiveCenterMethod.reminderWordInfo;
                        if (realtimeReminderWordInfoMsg != null) {
                            anchorReminderWordInfo = new AnchorReminderWordInfo();
                            Text text = realtimeReminderWordInfoMsg.title;
                            if (text == null || (str = text.defaultPattern) == null) {
                                str = "";
                            }
                            anchorReminderWordInfo.title = C1133830fbx.LJIILIIL(text, str).toString();
                            anchorReminderWordInfo.content = realtimeReminderWordInfoMsg.content;
                            anchorReminderWordInfo.messageKey = realtimeReminderWordInfoMsg.messageKey;
                            anchorReminderWordInfo.scene = realtimeReminderWordInfoMsg.scene;
                        }
                        realtimeLiveCenterDetailData2.reminderWordInfo = anchorReminderWordInfo;
                        PromoteCoupon promoteCoupon = realtimeLiveCenterMethod.promoteCoupon;
                        if (promoteCoupon != null) {
                            if (realtimeLiveCenterDetailData2.trafficToolInfo == null) {
                                realtimeLiveCenterDetailData2.trafficToolInfo = new RealtimeLiveCenterTrafficToolInfo();
                            }
                            RealtimeLiveCenterTrafficToolInfo realtimeLiveCenterTrafficToolInfo = realtimeLiveCenterDetailData2.trafficToolInfo;
                            if (realtimeLiveCenterTrafficToolInfo != null) {
                                realtimeLiveCenterTrafficToolInfo.promoteCoupon = promoteCoupon;
                            }
                        }
                    }
                    this.LLLLJI = System.currentTimeMillis();
                    this.LLJILJIL = SystemClock.elapsedRealtime();
                    C20441214yg.LIZIZ("LiveCenterMainView", "Receive ColdStart IM: " + this.LLJJJIL + ", " + this.LLJJJJ + ' ' + this.LLJJJJLIIL);
                    if (this.LLJJJIL) {
                        WhiteBoxData whiteBoxData = realtimeLiveCenterMethod.whiteBoxData;
                        if (whiteBoxData != null) {
                            LJIILL(whiteBoxData);
                        } else {
                            LJIILIIL(realtimeLiveCenterMethod.coldStartStatData);
                        }
                    } else {
                        this.LLJJJJ = realtimeLiveCenterMethod.coldStartStatData;
                        this.LLJJJJJIL = realtimeLiveCenterMethod.whiteBoxData;
                    }
                    if (this.LLJJIJIIJIL) {
                        RealtimeLiveCenterLopInfo realtimeLiveCenterLopInfo5 = realtimeLiveCenterMethod.lopInfo;
                        if (realtimeLiveCenterLopInfo5 != null) {
                            DataChannel dataChannel2 = this.LLILLL;
                            c781380Uky2.getClass();
                            C781380Uky.LIZ(dataChannel2, realtimeLiveCenterLopInfo5);
                            RealtimeLiveCenterDetailData realtimeLiveCenterDetailData3 = this.LLJI;
                            if (realtimeLiveCenterDetailData3 != null) {
                                realtimeLiveCenterDetailData3.lopInfo = realtimeLiveCenterLopInfo5;
                                LJIIJJI();
                            }
                        }
                        LJIIZILJ();
                        LIZJ(this.LLJILJILJ, this.LLJ, false);
                        this.LLJILJILJ = this.LLJ;
                        C1AH2 c1ah2 = this.LLILZ;
                        if (c1ah2 != null) {
                            c1ah2.notifyItemRangeChanged(1, getBaseFunctionCount() - 1);
                        }
                    }
                }
            }
        }
    }

    public final void setBackFromXml(FrameLayout frameLayout) {
        this.LLILLJJLI = frameLayout;
    }

    public final void setLastReqTimeStamp(long j) {
        this.LLLLJI = j;
    }

    public final void setRecyclerViewFromXml(RecyclerView recyclerView) {
        this.LL = recyclerView;
    }

    public final void LIZIZ(RecyclerView recyclerView, int i) {
        LinearLayoutManager linearLayoutManager;
        int iFindFirstVisibleItemPosition;
        View view;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            linearLayoutManager = (LinearLayoutManager) layoutManager;
        } else {
            linearLayoutManager = null;
        }
        int iFindLastVisibleItemPosition = -1;
        if (linearLayoutManager != null) {
            iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        } else {
            iFindFirstVisibleItemPosition = -1;
        }
        if (iFindFirstVisibleItemPosition <= i && i <= iFindLastVisibleItemPosition) {
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i);
            if (viewHolderFindViewHolderForAdapterPosition != null && (view = viewHolderFindViewHolderForAdapterPosition.itemView) != null) {
                LJIIIZ(view);
                return;
            }
            return;
        }
        recyclerView.addOnScrollListener(new AsS9S0101000_29(i, this, 0));
    }

    public final void LIZLLL(final List<RealtimeViolationRecord> list, final List<RealtimeViolationRecord> list2) {
        long j;
        RealtimeLiveCenterViolationRecordInfo realtimeLiveCenterViolationRecordInfo;
        if (list == null) {
            if (list2 == null) {
                return;
            }
        } else if (list2 != null) {
            C21341918fZ c21341918fZLIZ = C21342318fd.LIZ(new AbstractC21342018fa(list, list2) { // from class: X.1AH0
                public final List<RealtimeViolationRecord> LIZ;
                public final List<RealtimeViolationRecord> LIZIZ;

                @Override // X.AbstractC21342018fa
                public final boolean LIZIZ(int i, int i2) {
                    return true;
                }

                @Override // X.AbstractC21342018fa
                public final int LIZLLL() {
                    return this.LIZIZ.size();
                }

                @Override // X.AbstractC21342018fa
                public final int LJ() {
                    return this.LIZ.size();
                }

                {
                    this.LIZ = list;
                    this.LIZIZ = list2;
                }

                @Override // X.AbstractC21342018fa
                public final boolean LIZ(int i, int i2) {
                    Boolean boolValueOf;
                    Boolean boolValueOf2;
                    Integer numValueOf;
                    RealtimeViolationRecord realtimeViolationRecord = (RealtimeViolationRecord) ListProtector.get(this.LIZ, i);
                    RealtimeViolationRecord realtimeViolationRecord2 = (RealtimeViolationRecord) ListProtector.get(this.LIZIZ, i2);
                    if (realtimeViolationRecord.startTime == realtimeViolationRecord2.startTime && realtimeViolationRecord.endTime == realtimeViolationRecord2.endTime && Intrinsics.LJFF(realtimeViolationRecord.title, realtimeViolationRecord2.title) && Intrinsics.LJFF(realtimeViolationRecord.reason, realtimeViolationRecord2.reason) && Intrinsics.LJFF(realtimeViolationRecord.suggestion, realtimeViolationRecord2.suggestion) && realtimeViolationRecord.type == realtimeViolationRecord2.type && Intrinsics.LJFF(realtimeViolationRecord.punishInfo, realtimeViolationRecord2.punishInfo)) {
                        AppealInfo appealInfo = realtimeViolationRecord.appealInfo;
                        Integer numValueOf2 = null;
                        if (appealInfo != null) {
                            boolValueOf = Boolean.valueOf(appealInfo.showAppeal);
                        } else {
                            boolValueOf = null;
                        }
                        AppealInfo appealInfo2 = realtimeViolationRecord2.appealInfo;
                        if (appealInfo2 != null) {
                            boolValueOf2 = Boolean.valueOf(appealInfo2.showAppeal);
                        } else {
                            boolValueOf2 = null;
                        }
                        if (Intrinsics.LJFF(boolValueOf, boolValueOf2)) {
                            AppealInfo appealInfo3 = realtimeViolationRecord.appealInfo;
                            if (appealInfo3 != null) {
                                numValueOf = Integer.valueOf(appealInfo3.appealStatus);
                            } else {
                                numValueOf = null;
                            }
                            AppealInfo appealInfo4 = realtimeViolationRecord2.appealInfo;
                            if (appealInfo4 != null) {
                                numValueOf2 = Integer.valueOf(appealInfo4.appealStatus);
                            }
                            if (Intrinsics.LJFF(numValueOf, numValueOf2) && realtimeViolationRecord.status == realtimeViolationRecord2.status) {
                                return true;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
            }, true);
            C2176721AGw c2176721AGw = this.LLJJIJI;
            if (c2176721AGw != null) {
                RealtimeLiveCenterDetailData realtimeLiveCenterDetailData = this.LLJI;
                if (realtimeLiveCenterDetailData != null && (realtimeLiveCenterViolationRecordInfo = realtimeLiveCenterDetailData.violationRecordInfo) != null) {
                    j = realtimeLiveCenterViolationRecordInfo.keepShowingTime;
                } else {
                    j = 180000;
                }
                c2176721AGw.LLLIIIIL(j, list2, true);
                c21341918fZLIZ.LIZJ(c2176721AGw);
                return;
            }
            return;
        }
        C2176721AGw c2176721AGw2 = this.LLJJIJI;
        if (c2176721AGw2 != null) {
            c2176721AGw2.LLILLL = list2;
            c2176721AGw2.notifyDataSetChanged();
        }
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [X.1AH8] */
    public C1AH6(Context context, AttributeSet attributeSet, int i) {
        List<RealtimeLiveCenterLayoutTab> listLJIIJJI;
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.LLILZIL = LiveCenterMessageIntervalSetting.INSTANCE.getValue();
        this.LLILZLL = C292401Bi.LIZ(new AwS556S0100000_12(this, 167));
        this.LLJILJIL = -1L;
        if (LiveCenterStructureOpt.INSTANCE.isEnable()) {
            String layoutName = C1AH3.DATA_BOARD.getLayoutName();
            RealtimeLiveCenterLayoutTab realtimeLiveCenterLayoutTab = new RealtimeLiveCenterLayoutTab();
            realtimeLiveCenterLayoutTab.layoutName = layoutName;
            realtimeLiveCenterLayoutTab.lynxUrl = "";
            listLJIIJJI = Collections.singletonList(realtimeLiveCenterLayoutTab);
        } else {
            String layoutName2 = C1AH3.TITLE.getLayoutName();
            RealtimeLiveCenterLayoutTab realtimeLiveCenterLayoutTab2 = new RealtimeLiveCenterLayoutTab();
            realtimeLiveCenterLayoutTab2.layoutName = layoutName2;
            realtimeLiveCenterLayoutTab2.lynxUrl = "";
            String layoutName3 = C1AH3.DATA_BOARD.getLayoutName();
            RealtimeLiveCenterLayoutTab realtimeLiveCenterLayoutTab3 = new RealtimeLiveCenterLayoutTab();
            realtimeLiveCenterLayoutTab3.layoutName = layoutName3;
            realtimeLiveCenterLayoutTab3.lynxUrl = "";
            listLJIIJJI = C1697810uHb.LJIIJJI(realtimeLiveCenterLayoutTab2, realtimeLiveCenterLayoutTab3);
        }
        this.LLJJIII = listLJIIJJI;
        this.LLJJL = new LinkedHashSet();
        this.LLJJLIIIJLLLLLLLZ = new LinkedHashSet();
        this.LLJLILLLLZIIL = -1;
        this.LLJLL = true;
        this.LLJZ = new ArrayList();
        this.LLJZIJLIL = new HashMap<>();
        this.LLL = -1L;
        this.LLLIIIL = true;
        this.LLLIILIL = "";
        this.LLLIL = "";
        this.LLLJIL = RunnableC1887420zDQ.LL;
        this.LLLJL = new C1AHD() { // from class: X.1AH8
            @Override // X.C1AHD
            public final AbstractC20368114mt LJFF() {
                C1AH6 c1ah6 = this.LIZ;
                if (c1ah6.LLLIIL == null) {
                    C0UTJ c0utjPl1 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Pl1(this.LIZ.LLILLL);
                    c1ah6.LLLIIL = c0utjPl1 != null ? c0utjPl1.LJIJJLI() : null;
                }
                return this.LIZ.LLLIIL;
            }

            @Override // X.C1AHD
            public final boolean LJI() {
                return this.LIZ.LLJLLIL;
            }

            @Override // X.C1AHD
            public final boolean LJII() {
                return LJIIIZ() < 180;
            }

            @Override // X.C1AHD
            public final long LJIIIZ() {
                return C1AH6.LJ(this.LIZ);
            }

            @Override // X.C1AHD
            public final RealtimeLiveCenterDetailData LJIIJJI() {
                return this.LIZ.LLJI;
            }

            @Override // X.C1AHD
            public final void LJIIL() {
                this.LIZ.LJIIJJI();
            }

            @Override // X.C1AHD
            public final Context getContext() {
                return this.LIZ.getContext();
            }

            @Override // X.C1AHD
            public final DataChannel getDataChannel() {
                return this.LIZ.LLILLL;
            }

            @Override // X.C1AHD
            public final String getDataSource() {
                return this.LIZ.LLLLLIL ? "api" : "im";
            }

            @Override // X.C1AHD
            public final Drawable LJIIIIZZ() {
                return C800330VaR.LIZIZ(C1834150xpV.LJII(getContext()), R.drawable.dx5);
            }

            @Override // X.C1AHD
            public final RealtimeLiveCenterLayoutTab LIZIZ(String str) {
                RealtimeLiveCenterLayoutTab realtimeLiveCenterLayoutTab4;
                RealtimeLiveCenterLayoutTab next;
                List<RealtimeLiveCenterLayoutTab> list;
                Iterator<RealtimeLiveCenterLayoutTab> it2 = this.LIZ.LLJJIII.iterator();
                while (true) {
                    realtimeLiveCenterLayoutTab4 = null;
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(next.layoutName, str)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                RealtimeLiveCenterLayoutTab realtimeLiveCenterLayoutTab5 = next;
                if (realtimeLiveCenterLayoutTab5 == null) {
                    RealtimeLiveCenterLayoutData realtimeLiveCenterLayoutData = this.LIZ.LLJIJIL;
                    if (realtimeLiveCenterLayoutData == null || (list = realtimeLiveCenterLayoutData.tabList) == null) {
                        return null;
                    }
                    Iterator<RealtimeLiveCenterLayoutTab> it3 = list.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        RealtimeLiveCenterLayoutTab next2 = it3.next();
                        if (Intrinsics.LJFF(next2.layoutName, str)) {
                            realtimeLiveCenterLayoutTab4 = next2;
                            break;
                        }
                    }
                    return realtimeLiveCenterLayoutTab4;
                }
                return realtimeLiveCenterLayoutTab5;
            }

            @Override // X.C1AHD
            public final void LIZJ(C2176721AGw c2176721AGw) {
                this.LIZ.LLJJIJI = c2176721AGw;
            }

            @Override // X.C1AHD
            public final void LJ(Function1<? super Boolean, Unit> function1) {
                ((ArrayList) this.LIZ.LLJZ).add(function1);
            }

            @Override // X.C1AHD
            public final void LJIIJ(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) {
                this.LIZ.LLJL = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
            }

            @Override // X.C1AHD
            public final RealtimeLiveCenterLayoutTab LJIILIIL(int i2) {
                try {
                    C1AH6 c1ah6 = this.LIZ;
                    List<RealtimeLiveCenterLayoutTab> list = c1ah6.LLJ;
                    if (list != null) {
                        return (RealtimeLiveCenterLayoutTab) C13LP.LJJJLZIJ(i2 - c1ah6.getBaseFunctionCount(), list);
                    }
                    return null;
                } catch (IndexOutOfBoundsException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return null;
                }
            }

            @Override // X.C1AHD
            public final void LJIILJJIL(InterfaceC1541990qEH interfaceC1541990qEH) {
                this.LIZ.LLJLIL = interfaceC1541990qEH;
            }

            @Override // X.C1AHD
            public final void LIZ(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2) {
                if (LiveCenterLynxCardOpt.INSTANCE.enable()) {
                    if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                        this.LIZ.LLJJL.remove(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
                        boolean z = SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLILZJ;
                        sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJ(true);
                    }
                    this.LIZ.LLJJL.add(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2);
                }
            }

            @Override // X.C1AHD
            public final void LIZLLL(InterfaceC1541990qEH interfaceC1541990qEH, InterfaceC1541990qEH interfaceC1541990qEH2) {
                if (LiveCenterLynxCardOpt.INSTANCE.enable() && LiveCenterSparkLiteABSetting.INSTANCE.isMatch()) {
                    if (interfaceC1541990qEH != null) {
                        this.LIZ.LLJJLIIIJLLLLLLLZ.remove(interfaceC1541990qEH);
                        interfaceC1541990qEH.LLD(true);
                    }
                    if (interfaceC1541990qEH2 != null) {
                        this.LIZ.LLJJLIIIJLLLLLLLZ.add(interfaceC1541990qEH2);
                    }
                }
            }
        };
        this.LLLL = new ARunnableS118S0100000_18(this, 3);
        this.LLLLII = new ARunnableS118S0100000_18(this, 2);
        this.LLLLIIL = "";
        this.LLLLIILL = -1;
        this.LLLLJ = C1697810uHb.LJIIJJI("anchor_center_request_coldstart_info", "anchor_center_request_flare_card_info", "live_anchor_center_force_update", "realtime_live_center_lynx_loaded");
        this.LLLLJI = -1L;
        this.LLLLL = C1834150xpV.LIZJ(C786410Ut5.ne(context));
    }

    public final void LIZJ(List<RealtimeLiveCenterLayoutTab> list, List<RealtimeLiveCenterLayoutTab> list2, final boolean z) {
        this.LLLLLIL = z;
        if (list == null) {
            if (list2 == null) {
                return;
            }
        } else if (list2 != null) {
            final ArrayList arrayList = new ArrayList(list);
            final ArrayList arrayList2 = new ArrayList(list2);
            List<RealtimeLiveCenterLayoutTab> list3 = this.LLJJIII;
            arrayList.addAll(0, list3);
            arrayList2.addAll(0, list3);
            Iterator it2 = arrayList2.iterator();
            int i = 0;
            while (true) {
                if (it2.hasNext()) {
                    if (Intrinsics.LJFF(((RealtimeLiveCenterLayoutTab) it2.next()).layoutName, C1AH3.PC_WEBSITE.getLayoutName())) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            this.LLJLILLLLZIIL = i;
            Iterator it3 = arrayList2.iterator();
            int i2 = 0;
            while (true) {
                if (it3.hasNext()) {
                    if (Intrinsics.LJFF(((RealtimeLiveCenterLayoutTab) it3.next()).layoutName, C1AH3.TIPS_LYNX.getLayoutName())) {
                        break;
                    } else {
                        i2++;
                    }
                } else {
                    i2 = -1;
                    break;
                }
            }
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext() && !Intrinsics.LJFF(((RealtimeLiveCenterLayoutTab) it4.next()).layoutName, C1AH3.PLAY_BOOK.getLayoutName())) {
            }
            if (this.LLLLIIIILLL && i2 != -1) {
                this.LLLLIIIILLL = false;
                C473410IhP.LIZJ(new ARunnableS43S0101000_32(i2, this, 0), 1000L);
            }
            C21341918fZ c21341918fZLIZ = C21342318fd.LIZ(new AbstractC21342018fa(arrayList, arrayList2, z) { // from class: X.1AH5
                public final List<RealtimeLiveCenterLayoutTab> LIZ;
                public final List<RealtimeLiveCenterLayoutTab> LIZIZ;
                public final boolean LIZJ;

                @Override // X.AbstractC21342018fa
                public final Object LIZJ(int i3, int i4) {
                    return null;
                }

                @Override // X.AbstractC21342018fa
                public final int LIZLLL() {
                    return this.LIZIZ.size();
                }

                @Override // X.AbstractC21342018fa
                public final int LJ() {
                    return this.LIZ.size();
                }

                @Override // X.AbstractC21342018fa
                public final boolean LIZ(int i3, int i4) {
                    RealtimeLiveCenterLayoutTab realtimeLiveCenterLayoutTab = (RealtimeLiveCenterLayoutTab) ListProtector.get(this.LIZ, i3);
                    C1AH3 c1ah3 = C1AH6.LLLLLILLIL.get(realtimeLiveCenterLayoutTab.layoutName);
                    if (c1ah3 != null && c1ah3.getShouldForceRefesh()) {
                        return false;
                    }
                    RealtimeLiveCenterLayoutTab realtimeLiveCenterLayoutTab2 = (RealtimeLiveCenterLayoutTab) ListProtector.get(this.LIZIZ, i4);
                    if ((!C1533950q1J.LJ(realtimeLiveCenterLayoutTab2.lynxUrl) || !this.LIZJ) && Intrinsics.LJFF(realtimeLiveCenterLayoutTab.layoutName, realtimeLiveCenterLayoutTab2.layoutName) && Intrinsics.LJFF(realtimeLiveCenterLayoutTab.lynxUrl, realtimeLiveCenterLayoutTab2.lynxUrl)) {
                        return true;
                    }
                    return false;
                }

                @Override // X.AbstractC21342018fa
                public final boolean LIZIZ(int i3, int i4) {
                    return Intrinsics.LJFF(((RealtimeLiveCenterLayoutTab) ListProtector.get(this.LIZ, i3)).layoutName, ((RealtimeLiveCenterLayoutTab) ListProtector.get(this.LIZIZ, i4)).layoutName);
                }

                {
                    this.LIZ = arrayList;
                    this.LIZIZ = arrayList2;
                    this.LIZJ = z;
                }
            }, true);
            C1AH2 c1ah2 = this.LLILZ;
            if (c1ah2 != null) {
                c21341918fZLIZ.LIZJ(c1ah2);
                return;
            }
            return;
        }
        C1AH2 c1ah22 = this.LLILZ;
        if (c1ah22 != null) {
            c1ah22.notifyDataSetChanged();
        }
    }
}
