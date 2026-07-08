package X;

import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.livesdkapi.message.LiveMessageID;
import com.bytedance.android.livesdkapi.message.LiveMessageSEI;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.google.gson.Gson;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.feed.model.live.LiveCoreSDKData;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.StreamUrlStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;

/* JADX INFO: renamed from: X.16E0, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C16E0 implements InterfaceC2175541ACi, View.OnTouchListener, GestureDetector.OnGestureListener, Application.ActivityLifecycleCallbacks {
    public static final LinkedHashMap<Integer, Boolean> LLJJJJ = new LinkedHashMap<>(10);
    public final C19FO LL;
    public final StreamUrlStruct LLILLJJLI;
    public final EnterRoomConfig LLILLL;
    public final String LLILZ;
    public boolean LLILZIL;
    public final String LLILZLL;
    public Function2<? super Boolean, ? super String, Unit> LLIZ;
    public final CardView LLIZLLLIL;
    public LiveRoomStruct LLJ;
    public final C1ACD LLJI;
    public final C01GW LLJIJIL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(111));
    public boolean LLJILJIL;
    public String LLJILJILJ;
    public final Map<String, Object> LLJILLL;
    public long LLJJ;
    public long LLJJI;
    public float LLJJIII;
    public float LLJJIJI;
    public int LLJJIJIIJIL;
    public int LLJJIJIL;
    public Animator LLJJJ;
    public final GestureDetector LLJJJIL;

    @Override // X.InterfaceC2175541ACi
    public final Integer Dk() {
        return null;
    }

    @Override // X.InterfaceC2175541ACi
    public final boolean LLILLIZIL() {
        return false;
    }

    @Override // X.InterfaceC2175541ACi
    public final void LLLIL() {
    }

    @Override // X.InterfaceC2175541ACi
    public final void LLLLLLIL() {
    }

    @Override // X.InterfaceC2175541ACi
    public final Object Md() {
        return null;
    }

    @Override // X.InterfaceC2175541ACi
    public final void T5() {
    }

    @Override // X.InterfaceC2175541ACi
    public final boolean U1() {
        return true;
    }

    @Override // X.InterfaceC2175541ACi
    public final boolean We() {
        return false;
    }

    @Override // X.InterfaceC2175541ACi
    public final Object Y7() {
        return null;
    }

    @Override // X.InterfaceC2175541ACi
    public final void o() {
    }

    @Override // X.InterfaceC2175541ACi
    public final void oc(C945320ahu c945320ahu) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // X.InterfaceC2175541ACi
    public final void v() {
    }

    @Override // X.InterfaceC2175541ACi
    public final void w9(String str) {
    }

    public final void LIZLLL() {
        Object c098200Yq;
        C519740KZw c519740KZw;
        LiveCoreSDKData liveCoreSDKData;
        LiveCoreSDKData.Quality defaultQuality;
        LiveCoreSDKData liveCoreSDKData2;
        LiveCoreSDKData.Quality defaultQuality2;
        if (this.LLILLJJLI != null) {
            LiveRoomStruct liveRoomStruct = new LiveRoomStruct();
            StreamUrlStruct streamUrlStruct = this.LLILLJJLI;
            liveRoomStruct.stream_url = streamUrlStruct;
            this.LLJ = liveRoomStruct;
            try {
                String streamData = streamUrlStruct.liveCoreSDKData.getPullData().getStreamData();
                if (C123100dR.LIZ((String) this.LLJIJIL.getValue()) && C123100dR.LIZ(streamData)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('\"');
                    sbLIZ.append((String) this.LLJIJIL.getValue());
                    sbLIZ.append('\"');
                    if (a0.LJJIIZI(streamData, C2188811AlT.LIZIZ(sbLIZ), false)) {
                        StreamUrlStruct streamUrlStruct2 = liveRoomStruct.stream_url;
                        this.LLJILJILJ = (streamUrlStruct2 == null || (liveCoreSDKData2 = streamUrlStruct2.liveCoreSDKData) == null || (defaultQuality2 = liveCoreSDKData2.getDefaultQuality()) == null) ? null : defaultQuality2.sdkKey;
                        StreamUrlStruct streamUrlStruct3 = liveRoomStruct.stream_url;
                        if (streamUrlStruct3 != null && (liveCoreSDKData = streamUrlStruct3.liveCoreSDKData) != null && (defaultQuality = liveCoreSDKData.getDefaultQuality()) != null) {
                            defaultQuality.sdkKey = (String) this.LLJIJIL.getValue();
                        }
                    }
                }
                if (C948503nH.LIZJ(this.LL)) {
                    this.LLJI.LJJIIJZLJL(this.LLILZIL, liveRoomStruct, (FrameLayout) this.LLIZLLLIL.findViewById(R.id.eqx), false, null, "", false, null);
                }
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        } else {
            try {
                c098200Yq = C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LIZIZ), null, null, new C16E1(this, null), 3);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m1boximpl(c098200Yq);
        }
        CardView cardView = this.LLIZLLLIL;
        if (!(cardView instanceof C519740KZw) || (c519740KZw = (C519740KZw) cardView) == null) {
            return;
        }
        c519740KZw.setDelegate(new InterfaceC519660KZo() { // from class: X.16E2
            @Override // X.InterfaceC519660KZo
            public final void LIZ() {
                this.LIZ.LIZJ("manual");
            }

            @Override // X.InterfaceC519660KZo
            public final String LIZJ() {
                return this.LIZ.LIZ(false);
            }

            @Override // X.InterfaceC519660KZo
            public final void LIZIZ(boolean z) {
                int i;
                C16E0 c16e0;
                LiveRoomStruct liveRoomStruct2;
                CardView cardView2 = this.LIZ.LLIZLLLIL;
                if (z) {
                    i = 0;
                } else {
                    i = 8;
                }
                int visibility = cardView2.getVisibility();
                cardView2.setVisibility(i);
                C1602160rnK.LIZIZ(visibility, i, cardView2);
                if (z && !this.LIZ.LLJI.LJJII() && (liveRoomStruct2 = (c16e0 = this.LIZ).LLJ) != null) {
                    c16e0.LLJI.LJJIIJZLJL(c16e0.LLILZIL, liveRoomStruct2, (FrameLayout) c16e0.LLIZLLLIL.findViewById(R.id.eqx), false, null, "", false, null);
                }
            }

            @Override // X.InterfaceC519660KZo
            public final void m0(boolean z) {
                this.LIZ.LJ(z, false);
            }
        });
    }

    public final String LIZ(boolean z) {
        String string;
        EnterRoomConfig.RoomsData roomsData;
        n nVar = new n();
        nVar.LJJII(Boolean.valueOf(this.LLILZIL), "is_mute");
        nVar.LJJII(Boolean.valueOf(z), "manual_close");
        nVar.LJJIIJ("small_window_id", String.valueOf(this.LL.hashCode()));
        EnterRoomConfig enterRoomConfig = this.LLILLL;
        if (enterRoomConfig != null && (roomsData = enterRoomConfig.mRoomsData) != null) {
            string = Long.valueOf(roomsData.roomId).toString();
        } else {
            string = null;
        }
        nVar.LJJIIJ("room_id", string);
        return C1741890vQh.LJIIIIZZ(nVar);
    }

    public final void LIZJ(String str) {
        ViewGroup viewGroup;
        try {
            LLJJJJ.put(Integer.valueOf(this.LL.hashCode()), Boolean.TRUE);
            ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZ("small_window_status_change", LIZ(Intrinsics.LJFF(str, "manual")));
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        this.LL.getApplication().unregisterActivityLifecycleCallbacks(this);
        ViewParent parent = this.LLIZLLLIL.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C786410Ut5.LJJJLZIJ(this.LLIZLLLIL, viewGroup);
        }
        this.LLJI.LJJIJIL(null, true);
        long jCurrentTimeMillis = System.currentTimeMillis();
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.LLJILLL);
        linkedHashMap.put("duration", Long.valueOf(jCurrentTimeMillis - this.LLJJ));
        linkedHashMap.put("close_type", str);
        C1421105hJ.LIZJ("livesdk_tiktokec_mini_window_live_duration", linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(this.LLJILLL);
        linkedHashMap2.put("stay_time", Long.valueOf(jCurrentTimeMillis - this.LLJJI));
        linkedHashMap2.put("close_type", str);
        C1421105hJ.LIZJ("livesdk_tiktokec_mini_window_close", linkedHashMap2);
    }

    @Override // X.InterfaceC2175541ACi
    /* JADX INFO: renamed from: if */
    public final void mo29if(String str) {
        if (this.LLIZLLLIL.getParent() == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(0, this.LLIZLLLIL.findViewById(R.id.p_g));
        C786410Ut5.LJLLLLLL(8, this.LLIZLLLIL.findViewById(R.id.oxi));
        String str2 = "auto";
        LIZJ("auto");
        if (this.LLJJ <= 0) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.LLJILLL);
        linkedHashMap.put("duration", Long.valueOf(System.currentTimeMillis() - this.LLJJ));
        if (!C948503nH.LIZJ(this.LL)) {
            if (ActivityStack.isAppBackGround()) {
                str2 = "quit_app";
            } else {
                str2 = "next";
            }
        }
        linkedHashMap.put("close_type", str2);
        C1421105hJ.LIZJ("livesdk_tiktokec_mini_window_live_duration", linkedHashMap);
        this.LLJJ = 0L;
    }

    @Override // X.InterfaceC2175541ACi
    public final void oe(String str) {
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "ttec_live_small_window_enable", true, false)) {
            ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LJJZZIII();
        }
        if (this.LLIZLLLIL.findViewById(R.id.oxi) == null) {
            return;
        }
        C948503nH.LJIILIIL(this.LLIZLLLIL.findViewById(R.id.oxi), this.LL, new C1733970vDv(this, null), 2);
        C948503nH.LJIILIIL(this.LLIZLLLIL.findViewById(R.id.e1g), this.LL, new C1733960vDu(this, null), 2);
        this.LLIZLLLIL.setOnTouchListener(this);
        this.LLJJ = System.currentTimeMillis();
        if (this.LLIZLLLIL.getVisibility() != 0 && C948503nH.LIZJ(this.LL)) {
            this.LLJJI = this.LLJJ;
        }
        C786410Ut5.LJLLLLLL(8, this.LLIZLLLIL.findViewById(R.id.p_g));
        C786410Ut5.LJLLLLLL(0, this.LLIZLLLIL.findViewById(R.id.oxi));
        C1421105hJ.LIZJ("livesdk_tiktokec_mini_window_live_play", this.LLJILLL);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStarted(Activity activity) {
        if (!Intrinsics.LJFF(activity, this.LL)) {
            return;
        }
        LiveRoomStruct liveRoomStruct = this.LLJ;
        if (liveRoomStruct != null) {
            this.LLJI.LJJIIJZLJL(this.LLILZIL, liveRoomStruct, (FrameLayout) this.LLIZLLLIL.findViewById(R.id.eqx), false, null, "", false, null);
        }
        if (this.LLIZLLLIL.getVisibility() == 0) {
            this.LLJJI = System.currentTimeMillis();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStopped(Activity activity) {
        String str;
        if (!Intrinsics.LJFF(activity, this.LL)) {
            return;
        }
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "ec_live_small_window_not_stop_player_after_tapup", true, false) || !this.LLJILJIL) {
            this.LLJI.LIZIZ();
        }
        if (ActivityStack.isAppBackGround()) {
            str = "quit_app";
        } else {
            str = "next";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.LLJILLL);
        linkedHashMap.put("stay_time", Long.valueOf(System.currentTimeMillis() - this.LLJJI));
        linkedHashMap.put("close_type", str);
        C1421105hJ.LIZJ("livesdk_tiktokec_mini_window_close", linkedHashMap);
        if (this.LLJJ <= 0) {
            return;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(this.LLJILLL);
        linkedHashMap2.put("duration", Long.valueOf(System.currentTimeMillis() - this.LLJJ));
        linkedHashMap2.put("close_type", str);
        C1421105hJ.LIZJ("livesdk_tiktokec_mini_window_live_duration", linkedHashMap2);
        this.LLJJ = 0L;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPrePaused(Activity activity) {
        if (Intrinsics.LJFF(activity, this.LL) && activity.isFinishing()) {
            LIZJ("return");
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) throws JSONException {
        String streamData;
        StreamUrlStruct streamUrlStruct;
        LiveCoreSDKData liveCoreSDKData;
        LiveCoreSDKData.PullData pullData;
        StreamUrlStruct streamUrlStruct2;
        LiveCoreSDKData liveCoreSDKData2;
        LiveCoreSDKData.Quality defaultQuality;
        this.LLJILJIL = true;
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.LLJILLL);
        linkedHashMap.put("return_type", "back_to_live");
        String string = null;
        if (C123100dR.LIZ(this.LLILZLL)) {
            SmartRouter.buildRoute(this.LL, this.LLILZLL).open();
        } else if (this.LLILLL != null) {
            InterfaceC480520Iss interfaceC480520IssLLJJ = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LLJJ(this.LLJI.getPlayerTag(), true);
            if (interfaceC480520IssLLJJ != null) {
                interfaceC480520IssLLJJ.LJJJJI(false);
            }
            if (C123100dR.LIZ((String) this.LLJIJIL.getValue()) && C123100dR.LIZ(this.LLJILJILJ)) {
                LiveRoomStruct liveRoomStruct = this.LLJ;
                if (liveRoomStruct != null && (streamUrlStruct2 = liveRoomStruct.stream_url) != null && (liveCoreSDKData2 = streamUrlStruct2.liveCoreSDKData) != null && (defaultQuality = liveCoreSDKData2.getDefaultQuality()) != null) {
                    defaultQuality.sdkKey = (String) this.LLJIJIL.getValue();
                }
                C1ACD c1acd = this.LLJI;
                String str = this.LLJILJILJ;
                if (str == null) {
                    str = "";
                }
                c1acd.switchResolution(str, null);
            }
            C0J5O c0j5oZ5 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).z5();
            C19FO c19fo = this.LL;
            EnterRoomConfig enterRoomConfig = this.LLILLL;
            EnterRoomConfig.StreamData streamData2 = enterRoomConfig.mStreamData;
            LiveRoomStruct liveRoomStruct2 = this.LLJ;
            if (liveRoomStruct2 != null && (streamUrlStruct = liveRoomStruct2.stream_url) != null && (liveCoreSDKData = streamUrlStruct.liveCoreSDKData) != null && (pullData = liveCoreSDKData.getPullData()) != null) {
                streamData = pullData.getStreamData();
            } else {
                streamData = null;
            }
            streamData2.sharePullStreamData = streamData;
            enterRoomConfig.mRoomsData.warmUpPlayerTag = this.LLJI.getPlayerTag();
            enterRoomConfig.mLogData.sourceBtmToken = BtmSDK.INSTANCE.createJumpSourceBtmToken("c29223.d0", PageFinder.via((View) this.LLIZLLLIL), null);
            c0j5oZ5.watchLive(c19fo, enterRoomConfig);
        }
        Object obj = ((LinkedHashMap) this.LLJILLL).get("page_name");
        if (obj != null) {
            string = obj.toString();
        }
        if (Intrinsics.LJFF("order_pay_success", string)) {
            LIZJ("manual");
        }
        C1507790pL7.LIZ.getClass();
        C1507790pL7.LIZ("livesdk_tiktokec_mini_window_return_full", linkedHashMap);
        return true;
    }

    @Override // X.InterfaceC2175541ACi
    public final void sk(String str) {
        Type type;
        Type type2;
        LiveMessageID liveMessageID;
        String str2 = null;
        try {
            Gson gsonLJFF = C1741890vQh.LJFF();
            C1120604Zw.LIZ.getClass();
            C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
            if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                type = C2371409Qy.LIZJ(C13LE.LJII(n.class));
            } else {
                type = new TypeToken<n>() { // from class: X.16E4
                }.getType();
            }
            Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str, type);
            if (!(objFromJson instanceof n)) {
                objFromJson = null;
            }
            n nVar = (n) objFromJson;
            if (nVar != null) {
                try {
                    n nVarLJJIJ = nVar.LJJIJ("live_message_sei");
                    try {
                        Gson gsonLJFF2 = C1741890vQh.LJFF();
                        C1120604Zw.LIZ.getClass();
                        C1121904a9 c1121904a9LIZIZ2 = C1120604Zw.LIZIZ();
                        if (c1121904a9LIZIZ2 != null && c1121904a9LIZIZ2.LJII) {
                            type2 = C2371409Qy.LIZJ(C13LE.LJII(LiveMessageSEI.class));
                        } else {
                            type2 = new TypeToken<LiveMessageSEI>() { // from class: X.16E5
                            }.getType();
                        }
                        Object objLIZLLL = gsonLJFF2.LIZLLL(nVarLJJIJ, type2);
                        if (!(objLIZLLL instanceof LiveMessageSEI)) {
                            objLIZLLL = null;
                        }
                        LiveMessageSEI liveMessageSEI = (LiveMessageSEI) objLIZLLL;
                        if (liveMessageSEI != null && (liveMessageID = liveMessageSEI.uniqueID) != null) {
                            str2 = liveMessageID.messageScene;
                        }
                    } catch (s e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    if (Intrinsics.LJFF(str2, "end_room") && this.LLIZLLLIL.getParent() != null) {
                        LIZJ("auto");
                    }
                } catch (CancellationException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    throw e2;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        } catch (s e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
    }

    public final void LJ(boolean z, boolean z2) {
        this.LLILZIL = z;
        this.LLJI.LJIILJJIL(z);
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.LLJILLL);
        if (z) {
            ((TuxIconView) this.LLIZLLLIL.findViewById(R.id.oxi)).setIconRes(R.raw.icon_speaker_x_mark_ltr);
            linkedHashMap.put("action_type", "mute");
        } else {
            ((TuxIconView) this.LLIZLLLIL.findViewById(R.id.oxi)).setIconRes(R.raw.icon_speaker_2_ltr);
            linkedHashMap.put("action_type", "unmute");
        }
        C1421105hJ.LIZJ("livesdk_tiktokec_mini_window_mute", linkedHashMap);
        if (z2) {
            ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZ("small_window_status_change", LIZ(false));
        }
    }

    @Override // X.InterfaceC2175541ACi
    public final void LLLLJ(EnumC1913550ztZ enumC1913550ztZ, Object obj) {
        int i = C1891680zKI.LIZ[enumC1913550ztZ.ordinal()];
        if (i != 1) {
            if (i == 2 && this.LLIZ != null) {
                C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("WindowLivePlayer onPlayerMessage ");
                sbLIZ.append(enumC1913550ztZ.name());
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c2341109Fh.getClass();
                C2341109Fh.LIZ(strLIZIZ);
                Function2<? super Boolean, ? super String, Unit> function2 = this.LLIZ;
                if (function2 != null) {
                    function2.invoke(Boolean.FALSE, "create failed，media error");
                }
                this.LLIZ = null;
                return;
            }
            return;
        }
        if (this.LLIZ == null) {
            return;
        }
        C2341109Fh c2341109Fh2 = C2341109Fh.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("WindowLivePlayer onPlayerMessage ");
        sbLIZ2.append(enumC1913550ztZ.name());
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        c2341109Fh2.getClass();
        C2341109Fh.LIZ(strLIZIZ2);
        Function2<? super Boolean, ? super String, Unit> function22 = this.LLIZ;
        if (function22 != null) {
            function22.invoke(Boolean.TRUE, "create success");
        }
        this.LLIZ = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16E0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // X.InterfaceC2175541ACi
    public final void Th(int i, int i2, View view) {
        Number numberValueOf;
        int width;
        Number numberValueOf2;
        if (this.LLIZLLLIL.getParent() == null) {
            return;
        }
        CardView cardView = this.LLIZLLLIL;
        ViewGroup.LayoutParams layoutParams = cardView.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (i <= i2) {
                marginLayoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(185));
                if (i > 0) {
                    numberValueOf2 = Float.valueOf((i * 185.0f) / i2);
                } else {
                    numberValueOf2 = 104;
                }
                marginLayoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(numberValueOf2));
                C786410Ut5.LJLLLLLL(0, this.LLIZLLLIL.findViewById(R.id.y_l));
                C786410Ut5.LJLLLLLL(0, this.LLIZLLLIL.findViewById(R.id.cck));
                C786410Ut5.LJLLLLLL(8, this.LLIZLLLIL.findViewById(R.id.tkv));
            } else {
                marginLayoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(180));
                if (i2 > 0) {
                    numberValueOf = Float.valueOf((i2 * 180.0f) / i);
                } else {
                    numberValueOf = 100;
                }
                marginLayoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(numberValueOf));
                C786410Ut5.LJLLLLLL(8, this.LLIZLLLIL.findViewById(R.id.y_l));
                C786410Ut5.LJLLLLLL(8, this.LLIZLLLIL.findViewById(R.id.cck));
                C786410Ut5.LJLLLLLL(0, this.LLIZLLLIL.findViewById(R.id.tkv));
            }
            View view2 = (View) this.LLIZLLLIL.getParent();
            boolean z = true;
            if (view2.getLayoutDirection() != 1) {
                z = false;
            }
            if (z) {
                width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            } else {
                width = (view2.getWidth() - marginLayoutParams.width) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            }
            marginLayoutParams.leftMargin = width;
            marginLayoutParams.topMargin = (view2.getHeight() - marginLayoutParams.height) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(186));
            C786410Ut5.W5(cardView, marginLayoutParams);
            C786410Ut5.LJLLLLLL(0, this.LLIZLLLIL);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public C16E0(C19FO c19fo, StreamUrlStruct streamUrlStruct, EnterRoomConfig enterRoomConfig, String str, Map<String, ? extends Object> map, boolean z, String str2, Function2<? super Boolean, ? super String, Unit> function2) {
        String string;
        int i;
        this.LL = c19fo;
        this.LLILLJJLI = streamUrlStruct;
        this.LLILLL = enterRoomConfig;
        this.LLILZ = str;
        this.LLILZIL = z;
        this.LLILZLL = str2;
        this.LLIZ = function2;
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        if (enterRoomConfig != null) {
            linkedHashMap.put("room_id", Long.valueOf(enterRoomConfig.mRoomsData.roomId));
        }
        this.LLJILLL = linkedHashMap;
        ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
        iLiveOuterService.k4().LJJZZIII();
        C1ACD c1acdGenerateLivePlayHelper = iLiveOuterService.generateLivePlayHelper(this, EnumC1913520ztW.NORMAL);
        this.LLJI = c1acdGenerateLivePlayHelper;
        Object obj = map.get("page_name");
        if (obj != null) {
            string = obj.toString();
        } else {
            string = null;
        }
        if (C123100dR.LIZ(string)) {
            c1acdGenerateLivePlayHelper.LJIILIIL(new C1699360uK6(string, "small_window", "", "ecom", false, true, 8));
        }
        CardView cardView = (CardView) C786410Ut5.oe(c19fo, R.id.gi8);
        if (cardView != null) {
            Function2<? super Boolean, ? super String, Unit> function22 = this.LLIZ;
            if (function22 != null) {
                function22.invoke(Boolean.FALSE, "window live is exit");
            }
        } else {
            ViewGroup viewGroup = (ViewGroup) C786410Ut5.oe(c19fo, android.R.id.content);
            cardView = (CardView) C0H1U.LIZJ(R.layout.bpm, viewGroup, false);
            cardView.LJII(0, 0, 0, 0);
            TuxIconView tuxIconView = (TuxIconView) cardView.findViewById(R.id.oxi);
            if (this.LLILZIL) {
                i = R.raw.icon_speaker_x_mark_ltr;
            } else {
                i = R.raw.icon_speaker_2_ltr;
            }
            tuxIconView.setIconRes(i);
            cardView.setId(R.id.gi8);
            viewGroup.addView(cardView);
            c19fo.getApplication().registerActivityLifecycleCallbacks(this);
        }
        this.LLIZLLLIL = cardView;
        this.LLJJJIL = new GestureDetector(c19fo, this);
    }
}
