package com.bytedance.android.live.slot;

import X.C00EZ;
import X.C0IR5;
import X.C0IXL;
import X.C0IXW;
import X.C1078590eAr;
import X.C1082880eHm;
import X.C1083300eIS;
import X.C1094870eb7;
import X.C1094880eb8;
import X.C1102950eo9;
import X.C1103010eoF;
import X.C1123920fLy;
import X.C1123930fLz;
import X.C1123980fM4;
import X.C1124000fM6;
import X.C1124120fMI;
import X.C1161920gLG;
import X.C19EG;
import X.C2188811AlT;
import X.C354201Zc;
import X.C464660IKa;
import X.C504210Jpz;
import X.C520010KaN;
import X.C741690T7n;
import X.C749300TaK;
import X.C749490Tad;
import X.C749530Tah;
import X.C750080Tba;
import X.C752670Tfl;
import X.C752690Tfn;
import X.C753930Thn;
import X.C753950Thp;
import X.C755580TkS;
import X.C755790Tkn;
import X.C756800TmQ;
import X.C770580UKq;
import X.C771540UOi;
import X.C772110UQn;
import X.C776250Uch;
import X.C781130UkZ;
import X.EnumC1102990eoD;
import X.EnumC742820TBw;
import X.EnumC756810TmR;
import X.EnumC785140Ur2;
import X.InterfaceC1123890fLv;
import X.InterfaceC1124060fMC;
import X.InterfaceC1124130fMJ;
import X.InterfaceC21213717zz;
import X.InterfaceC212386189o;
import X.InterfaceC756140TlM;
import X.InterfaceC756730TmJ;
import X.InterfaceC756750TmL;
import X.InterfaceC770540UKm;
import X.InterfaceC919320a1y;
import Y.AComparatorS36S0000000_17;
import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.SystemClock;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.android.live.broadcast.model.GoLiveECIconInfo;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.live.setting.LiveToolbarLoadOptimizeSetting;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.live.slot.ILiveShopBagSlotManager;
import com.bytedance.android.live.slot.IconSlotController;
import com.bytedance.android.live.slot.LiveShopAddPermissionBusinessSetting;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.performance.LiveBroadcastSAAMemLeakOptRecord;
import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.MsgNotifyQuota;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.PriorityBlockingQueue;
import qo2.w;

/* JADX INFO: loaded from: classes18.dex */
public class IconSlotController implements InterfaceC770540UKm {
    public Context context;
    public DataChannel dataChannel;
    public EnumC1102990eoD iconStyle;
    public LifecycleOwner lifecycleOwner;
    public C19EG mActivity;
    public C1124120fMI mAggregateSlotWidgetWrapper;
    public InterfaceC1123890fLv mIconSlotView;
    public IMessageManager mMessageManager;
    public EnumC756810TmR mSlotID;
    public Queue<C1123980fM4> mSlotWidgetPriorityQueue;
    public EnumC785140Ur2 mStrategy;
    public ViewModelStoreOwner viewModelStoreOwner;
    public Map<String, Object> mDataContainer = new HashMap();
    public Map<EnumC756810TmR, InterfaceC1124060fMC<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR>> mIconSlotMap = new HashMap();
    public Map<String, InterfaceC1124060fMC<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR>> mWidgetMap = new HashMap();
    public Map<EnumC756810TmR, IIconSlot.SlotViewModel> mIconSlotViewModelMap = new HashMap();
    public WeakHandler mHandler = new WeakHandler(this);
    public ILiveShopBagSlotManager mShopSlotManager = null;
    public InterfaceC21213717zz mIWidgetGate = new InterfaceC21213717zz() { // from class: X.0fLk
        @Override // X.InterfaceC21213717zz
        public final void LJ() {
        }

        @Override // X.InterfaceC21213717zz
        public final boolean LIZ() {
            HashMap<Long, MsgNotifyQuota> map = C1102420enI.LIZ;
            C512940K9s c512940K9sLIZLLL = C1102420enI.LIZLLL(12, this.LIZ.dataChannel, "watch", false, false);
            if (!c512940K9sLIZLLL.LIZ) {
                C1102070emj.LIZ.LJIILL(this.LIZ.dataChannel, C1099870ejB.LL, null, c512940K9sLIZLLL.LIZIZ);
            }
            return c512940K9sLIZLLL.LIZ;
        }

        @Override // X.InterfaceC21213717zz
        public final boolean LIZJ() {
            List list;
            DataChannel dataChannel = this.LIZ.dataChannel;
            if (dataChannel == null || (list = (List) dataChannel.gg0(C1102520enS.class)) == null) {
                return false;
            }
            return list.contains(EnumC1102740eno.ICON_SLOT);
        }

        @Override // X.InterfaceC21213717zz
        public final EnumC1102990eoD LIZLLL() {
            return this.LIZ.iconStyle;
        }

        @Override // X.InterfaceC21213717zz
        public final GoLiveECIconInfo LJI() {
            DataChannel dataChannel = this.LIZ.dataChannel;
            if (dataChannel == null || dataChannel.gg0(RoomCreateInfoChannel.class) == null) {
                return null;
            }
            return ((RoomCreateInfo) this.LIZ.dataChannel.gg0(RoomCreateInfoChannel.class)).goLiveEcIconInfo;
        }

        @Override // X.InterfaceC21213717zz
        public final Context getContext() {
            return (C497280Jeo.LIZ || C464660IKa.LIZ()) ? this.LIZ.context : this.LIZ.mActivity;
        }

        @Override // X.InterfaceC21213717zz
        public final LifecycleOwner getLifecycleOwner() {
            DataChannel dataChannel = this.LIZ.dataChannel;
            if (dataChannel != null) {
                return dataChannel.LLILZ;
            }
            return null;
        }

        @Override // X.InterfaceC21213717zz
        public final void LIZIZ(Boolean bool) {
            InterfaceC1123890fLv interfaceC1123890fLv;
            if (!LiveShopAddPermissionBusinessSetting.INSTANCE.isEnabled()) {
                return;
            }
            IconSlotController iconSlotController = this.LIZ;
            if (iconSlotController.mAggregateSlotWidgetWrapper != null && (interfaceC1123890fLv = iconSlotController.mIconSlotView) != null) {
                interfaceC1123890fLv.P0(bool);
            }
        }

        @Override // X.InterfaceC21213717zz
        public final boolean LJII(InterfaceC1124060fMC<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR> interfaceC1124060fMC, IIconSlot.SlotViewModel slotViewModel) {
            ILiveShopBagSlotManager iLiveShopBagSlotManager;
            IconSlotController iconSlotController = this.LIZ;
            if (iconSlotController.mAggregateSlotWidgetWrapper != null) {
                iconSlotController.mIconSlotView.t1(interfaceC1124060fMC, slotViewModel);
                if (LiveShopAddPermissionBusinessSetting.INSTANCE.isEnabled() && (iLiveShopBagSlotManager = this.LIZ.mShopSlotManager) != null) {
                    interfaceC1124060fMC.LLJ();
                    iLiveShopBagSlotManager.RT0(interfaceC1124060fMC.LIZ());
                    return true;
                }
                return true;
            }
            return false;
        }

        @Override // X.InterfaceC21213717zz
        public final void LJFF(String str, String str2, InterfaceC1123790fLl interfaceC1123790fLl) {
            View viewLJLLI;
            InterfaceC1123890fLv interfaceC1123890fLv = this.LIZ.mIconSlotView;
            if (interfaceC1123890fLv != null && (viewLJLLI = interfaceC1123890fLv.LJLLI()) != null) {
                View viewFindViewById = viewLJLLI.findViewById(R.id.y7j);
                if (viewFindViewById != null) {
                    viewLJLLI = viewFindViewById;
                }
                try {
                    EnumC1120860fH2 enumC1120860fH2ValueOf = EnumC1120860fH2.valueOf(str);
                    C785230UrB c785230UrB = new C785230UrB(viewLJLLI);
                    c785230UrB.LJIJJ = str2;
                    c785230UrB.LJFF = 48;
                    Objects.requireNonNull(interfaceC1123790fLl);
                    c785230UrB.LJIILL = new C1151860g52(interfaceC1123790fLl, 0);
                    c785230UrB.LJIILLIIL = new C1151840g50(interfaceC1123790fLl, 0);
                    C1113800f5e.LIZ.LJ(new C785270UrF(c785230UrB), enumC1120860fH2ValueOf, null);
                } catch (IllegalArgumentException e) {
                    TryCatchGuardChecker.doCheck(e);
                    if (C1161920gLG.LIZJ(IHostAppContext.class) != null && ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline()) {
                        throw e;
                    }
                }
            }
        }
    };

    private void initLiveEnterInfos() {
        String str;
        String str2;
        C0IXL c0ixl;
        Map<String, String> map;
        String str3;
        C0IXL c0ixl2;
        Map<String, String> map2;
        C0IXL c0ixl3;
        Map<String, String> map3;
        w wVar = w.LIZ;
        wVar.getClass();
        putData("param_live_enter_from_merge", w.LJIIIZ());
        putData("param_live_enter_method_merge", w.LJIIL());
        putData("param_live_window_mode", w.LJIILLIIL());
        putData("param_live_action_type", w.LIZLLL());
        putData("param_live_rec_content_id", wVar.LIZ());
        putData("param_live_rec_content_type", wVar.LIZIZ());
        putData("param_search_id", w.LJIL());
        putData("param_enter_room_video_id", w.LJJII());
        putData("param_search_result_id", w.LJJ());
        C0IR5 c0ir5LJJIII = w.LJJIII();
        String str4 = "";
        if (c0ir5LJJIII == null || (c0ixl3 = c0ir5LJJIII.LJFF) == null || (map3 = c0ixl3.LJJJJL) == null || (str = map3.get("search_keyword")) == null) {
            str = "";
        }
        putData("param_search_keyword", str);
        C0IR5 c0ir5LJJIII2 = w.LJJIII();
        if (c0ir5LJJIII2 == null || (c0ixl2 = c0ir5LJJIII2.LJFF) == null || (map2 = c0ixl2.LJJJJL) == null || (str2 = map2.get("search_type")) == null) {
            str2 = "";
        }
        putData("param_search_type", str2);
        C0IR5 c0ir5LJJIII3 = w.LJJIII();
        if (c0ir5LJJIII3 != null && (c0ixl = c0ir5LJJIII3.LJFF) != null && (map = c0ixl.LJJJJL) != null && (str3 = map.get("search_token_type")) != null) {
            str4 = str3;
        }
        putData("param_search_token_type", str4);
        putData("param_live_begin_time", Long.valueOf(w.LJFF()));
        putData("param_live_begin_time_real", Long.valueOf(w.LJI()));
        putData("param_ec_recommend_info", w.LJIIIIZZ());
        Map<String, String> mapLJII = w.LJII();
        putDataFromCommonLogIfHava(mapLJII, "is_inner");
        putDataFromCommonLogIfHava(mapLJII, "inner_search_id");
        putDataFromCommonLogIfHava(mapLJII, "rank_inner");
        putDataFromCommonLogIfHava(mapLJII, "is_slide");
        putDataFromCommonLogIfHava(mapLJII, "slide_rank");
    }

    public Map<String, String> getDataContainerLiveShowTimeMap() {
        Map<String, String> map;
        Object obj = this.mDataContainer.get("param_live_show_time");
        if (obj instanceof Map) {
            try {
                map = (Map) obj;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                map = null;
            }
        } else {
            map = null;
        }
        if (map != null) {
            return map;
        }
        HashMap map2 = new HashMap();
        putData("param_live_show_time", map2);
        return map2;
    }

    public HashMap<String, String> getLiveShowTimeMap() {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null) {
            return new HashMap<>();
        }
        HashMap<String, String> map = (HashMap) dataChannel.gg0(C755790Tkn.class);
        if (map != null) {
            return map;
        }
        HashMap<String, String> map2 = new HashMap<>();
        this.dataChannel.SX0(C755790Tkn.class, map2);
        return map2;
    }

    @Override // X.InterfaceC770540UKm, X.InterfaceC1732906qV
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        InterfaceC756750TmL interfaceC756750TmL;
        Queue<C1123980fM4> queue = this.mSlotWidgetPriorityQueue;
        if (queue == null) {
            return;
        }
        Iterator<C1123980fM4> it2 = queue.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ.onCreate(new Bundle());
        }
        C1124120fMI c1124120fMI = this.mAggregateSlotWidgetWrapper;
        if (c1124120fMI == null || (interfaceC756750TmL = c1124120fMI.LIZ) == null) {
            return;
        }
        interfaceC756750TmL.onCreate(new Bundle());
    }

    @Override // X.InterfaceC770540UKm, X.InterfaceC1732906qV
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        InterfaceC756750TmL interfaceC756750TmL;
        List<EnumC742820TBw> listLJLI;
        IMessageManager iMessageManager = this.mMessageManager;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        this.mHandler.removeCallbacksAndMessages(null);
        Queue<C1123980fM4> queue = this.mSlotWidgetPriorityQueue;
        if (queue == null) {
            return;
        }
        for (C1123980fM4 c1123980fM4 : queue) {
            if (this.lifecycleOwner != null && this.viewModelStoreOwner != null && checkFragmentIsValid() && c1123980fM4.LJ && (listLJLI = c1123980fM4.LIZIZ.LJLI()) != null && (listLJLI.contains(EnumC742820TBw.LIVE_ROOM_EC_LIVE_STATUS) || (listLJLI != null && listLJLI.contains(EnumC742820TBw.TTLS_LIVE_PRODUCT_NUMBER)))) {
                IIconSlot.SlotViewModel slotViewModelWQ2 = IIconSlot.SlotViewModel.wQ2(c1123980fM4.LIZIZ, this.viewModelStoreOwner);
                LifecycleOwner lifecycleOwner = this.lifecycleOwner;
                Map<EnumC742820TBw, MutableLiveData<Object>> map = slotViewModelWQ2.LLJJIJIIJIL;
                if (map != null) {
                    LiveData liveData = (LiveData) ((ConcurrentHashMap) map).get(EnumC742820TBw.LIVE_ROOM_EC_LIVE_STATUS);
                    if (liveData != null) {
                        liveData.removeObservers(lifecycleOwner);
                    }
                }
                Map<EnumC742820TBw, MutableLiveData<Object>> map2 = slotViewModelWQ2.LLJJIJIIJIL;
                if (map2 != null) {
                    LiveData liveData2 = (LiveData) ((ConcurrentHashMap) map2).get(EnumC742820TBw.TTLS_LIVE_PRODUCT_NUMBER);
                    if (liveData2 != null) {
                        liveData2.removeObservers(lifecycleOwner);
                    }
                }
            }
            c1123980fM4.LIZIZ.onDestroy();
            c1123980fM4.LIZIZ.onDispose();
        }
        C1124120fMI c1124120fMI = this.mAggregateSlotWidgetWrapper;
        if (c1124120fMI != null && (interfaceC756750TmL = c1124120fMI.LIZ) != null) {
            interfaceC756750TmL.onDestroy();
            this.mAggregateSlotWidgetWrapper.LIZ.onDispose();
        }
        this.mAggregateSlotWidgetWrapper = null;
        this.dataChannel = null;
        this.mMessageManager = null;
        this.viewModelStoreOwner = null;
        this.lifecycleOwner = null;
    }

    @Override // X.InterfaceC770540UKm, X.InterfaceC1732906qV
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        InterfaceC756750TmL interfaceC756750TmL;
        Queue<C1123980fM4> queue = this.mSlotWidgetPriorityQueue;
        if (queue == null) {
            return;
        }
        Iterator<C1123980fM4> it2 = queue.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ.onPause();
        }
        C1124120fMI c1124120fMI = this.mAggregateSlotWidgetWrapper;
        if (c1124120fMI == null || (interfaceC756750TmL = c1124120fMI.LIZ) == null) {
            return;
        }
        interfaceC756750TmL.onPause();
    }

    @Override // X.InterfaceC770540UKm, X.InterfaceC1732906qV
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        InterfaceC756750TmL interfaceC756750TmL;
        Queue<C1123980fM4> queue = this.mSlotWidgetPriorityQueue;
        if (queue == null) {
            return;
        }
        Iterator<C1123980fM4> it2 = queue.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ.onResume();
        }
        C1124120fMI c1124120fMI = this.mAggregateSlotWidgetWrapper;
        if (c1124120fMI == null || (interfaceC756750TmL = c1124120fMI.LIZ) == null) {
            return;
        }
        interfaceC756750TmL.onResume();
    }

    @Override // X.InterfaceC770540UKm, X.InterfaceC1732906qV
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart() {
        InterfaceC756750TmL interfaceC756750TmL;
        Queue<C1123980fM4> queue = this.mSlotWidgetPriorityQueue;
        if (queue == null) {
            return;
        }
        Iterator<C1123980fM4> it2 = queue.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ.onStart();
        }
        C1124120fMI c1124120fMI = this.mAggregateSlotWidgetWrapper;
        if (c1124120fMI == null || (interfaceC756750TmL = c1124120fMI.LIZ) == null) {
            return;
        }
        interfaceC756750TmL.onStart();
    }

    @Override // X.InterfaceC770540UKm, X.InterfaceC1732906qV
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
        InterfaceC756750TmL interfaceC756750TmL;
        Queue<C1123980fM4> queue = this.mSlotWidgetPriorityQueue;
        if (queue == null) {
            return;
        }
        Iterator<C1123980fM4> it2 = queue.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ.onStop();
        }
        C1124120fMI c1124120fMI = this.mAggregateSlotWidgetWrapper;
        if (c1124120fMI == null || (interfaceC756750TmL = c1124120fMI.LIZ) == null) {
            return;
        }
        interfaceC756750TmL.onStop();
    }

    private boolean checkFragmentIsValid() {
        if (!LiveBroadcastSAAMemLeakOptRecord.getEnable()) {
            return true;
        }
        ViewModelStoreOwner viewModelStoreOwner = this.viewModelStoreOwner;
        return !(viewModelStoreOwner instanceof Fragment) || ((Fragment) viewModelStoreOwner).isAdded();
    }

    @Override // X.InterfaceC770540UKm
    public Map<String, Object> getDataContainer() {
        return this.mDataContainer;
    }

    private ILiveShopBagSlotManager createLiveShopBagSlotManager(Room room) {
        boolean zEquals = Boolean.TRUE.equals(this.dataChannel.gg0(UserIsAnchorChannel.class));
        if (room == null) {
            return null;
        }
        if (zEquals) {
            return new LiveShopBagSlotManagerAnchor();
        }
        return new LiveShopBagSlotManagerAudience();
    }

    private void doShowMultiSlot(C1123980fM4 c1123980fM4) {
        ILiveShopBagSlotManager iLiveShopBagSlotManager;
        if ((c1123980fM4.LIZIZ.LLILZLL() instanceof IIconSlot) && this.lifecycleOwner != null && this.viewModelStoreOwner != null && checkFragmentIsValid()) {
            IIconSlot.SlotViewModel slotViewModelWQ2 = IIconSlot.SlotViewModel.wQ2(c1123980fM4.LIZIZ, this.viewModelStoreOwner);
            this.mIconSlotView.v1(c1123980fM4, slotViewModelWQ2);
            C741690T7n.LIZ(this.lifecycleOwner, this.dataChannel, c1123980fM4.LIZIZ.LJLI(), slotViewModelWQ2);
            c1123980fM4.LIZIZ.LLIZ(slotViewModelWQ2, this.mIWidgetGate);
            c1123980fM4.LJ = true;
            if (LiveShopAddPermissionBusinessSetting.INSTANCE.isEnabled() && (iLiveShopBagSlotManager = this.mShopSlotManager) != null) {
                InterfaceC1124060fMC interfaceC1124060fMC = c1123980fM4.LIZIZ;
                if (interfaceC1124060fMC instanceof InterfaceC212386189o) {
                    iLiveShopBagSlotManager.bC2(interfaceC1124060fMC.LIZ(), this.lifecycleOwner, slotViewModelWQ2, (InterfaceC212386189o) c1123980fM4.LIZIZ);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.Boolean isAdmin(com.bytedance.android.livesdkapi.depend.model.live.Room r6) {
        /*
            r5 = this;
            java.util.Map r4 = java.util.Collections.emptyMap()
            com.bytedance.android.livesdkapi.depend.model.live.AggregationData r0 = r6.aggregationData
            if (r0 == 0) goto L28
            com.bytedance.android.live.base.model.user.User r0 = r0.audience
            if (r0 == 0) goto L28
            com.bytedance.android.livesdk.model.UserAttr r0 = r0.getUserAttr()
            if (r0 == 0) goto L28
            com.bytedance.android.livesdkapi.depend.model.live.AggregationData r0 = r6.aggregationData
            com.bytedance.android.live.base.model.user.User r0 = r0.audience
            com.bytedance.android.livesdk.model.UserAttr r0 = r0.getUserAttr()
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r0.adminPermissions
            if (r0 == 0) goto L28
            com.bytedance.android.livesdkapi.depend.model.live.AggregationData r0 = r6.aggregationData
            com.bytedance.android.live.base.model.user.User r0 = r0.audience
            com.bytedance.android.livesdk.model.UserAttr r0 = r0.getUserAttr()
            java.util.Map<java.lang.Integer, java.lang.Integer> r4 = r0.adminPermissions
        L28:
            r3 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r0 = 5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r4.get(r0)
            boolean r2 = r1.equals(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r0 = 19
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r4.get(r0)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L6d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r0 = 20
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r4.get(r0)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L6d
            r0 = 0
        L63:
            if (r2 != 0) goto L68
            if (r0 != 0) goto L68
            r3 = 0
        L68:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L6d:
            r0 = 1
            goto L63
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.slot.IconSlotController.isAdmin(com.bytedance.android.livesdkapi.depend.model.live.Room):java.lang.Boolean");
    }

    public void doShowSingleSlot(C1123980fM4 c1123980fM4) {
        if ((c1123980fM4.LIZIZ.LLILZLL() instanceof IIconSlot) && this.lifecycleOwner != null && this.viewModelStoreOwner != null && checkFragmentIsValid()) {
            IIconSlot.SlotViewModel slotViewModelWQ2 = IIconSlot.SlotViewModel.wQ2(c1123980fM4.LIZIZ, this.viewModelStoreOwner);
            this.mIconSlotView.t1(c1123980fM4.LIZIZ, slotViewModelWQ2);
            C741690T7n.LIZ(this.lifecycleOwner, this.dataChannel, c1123980fM4.LIZIZ.LJLI(), slotViewModelWQ2);
            c1123980fM4.LIZIZ.LLIZ(slotViewModelWQ2, this.mIWidgetGate);
            c1123980fM4.LJ = true;
        }
    }

    public void doShowSlotAggregate(List<C1123980fM4> list) {
        ILiveShopBagSlotManager iLiveShopBagSlotManager;
        ILiveShopBagSlotManager iLiveShopBagSlotManager2;
        InterfaceC1123890fLv interfaceC1123890fLv;
        if (this.mAggregateSlotWidgetWrapper == null) {
            C1124120fMI c1124120fMI = new C1124120fMI();
            this.mAggregateSlotWidgetWrapper = c1124120fMI;
            C1123920fLy c1123920fLyLIZ = C1123920fLy.LIZ();
            EnumC756810TmR enumC756810TmR = this.mSlotID;
            C1123930fLz c1123930fLz = c1123920fLyLIZ.LIZ;
            c1123930fLz.LIZ();
            c1124120fMI.LIZ = ((InterfaceC756730TmJ) ((HashMap) c1123930fLz.LIZJ).get(enumC756810TmR)).LIZJ(this.mSlotID);
            C770580UKq.LIZIZ(this.mAggregateSlotWidgetWrapper.LIZ, this.mDataContainer);
            this.mAggregateSlotWidgetWrapper.LIZ.prepareToShow(this.mDataContainer, new InterfaceC756140TlM() { // from class: X.0fMH
                @Override // X.InterfaceC756140TlM
                public final void LIZ(boolean z) {
                }
            });
        }
        for (C1123980fM4 c1123980fM4 : list) {
            LiveShopAddPermissionBusinessSetting liveShopAddPermissionBusinessSetting = LiveShopAddPermissionBusinessSetting.INSTANCE;
            if (liveShopAddPermissionBusinessSetting.isEnabled() || !c1123980fM4.LJ) {
                if (this.viewModelStoreOwner != null && this.lifecycleOwner != null && checkFragmentIsValid() && (!liveShopAddPermissionBusinessSetting.isEnabled() || !c1123980fM4.LJ || !this.mAggregateSlotWidgetWrapper.LIZ.LJ(c1123980fM4.LIZIZ))) {
                    IIconSlot.SlotViewModel slotViewModelWQ2 = IIconSlot.SlotViewModel.wQ2(c1123980fM4.LIZIZ, this.viewModelStoreOwner);
                    if (c1123980fM4.LJ && !this.mAggregateSlotWidgetWrapper.LIZ.LJ(c1123980fM4.LIZIZ) && liveShopAddPermissionBusinessSetting.isEnabled() && (interfaceC1123890fLv = this.mIconSlotView) != null) {
                        interfaceC1123890fLv.LJJL(slotViewModelWQ2);
                    }
                    C741690T7n.LIZ(this.lifecycleOwner, this.dataChannel, c1123980fM4.LIZIZ.LJLI(), slotViewModelWQ2);
                    c1123980fM4.LIZIZ.LLIZ(slotViewModelWQ2, this.mIWidgetGate);
                    c1123980fM4.LJ = true;
                    this.mAggregateSlotWidgetWrapper.LIZ.LIZLLL(c1123980fM4.LIZIZ, slotViewModelWQ2);
                    if (liveShopAddPermissionBusinessSetting.isEnabled() && (iLiveShopBagSlotManager2 = this.mShopSlotManager) != null && (this.mAggregateSlotWidgetWrapper.LIZ instanceof InterfaceC1124130fMJ) && iLiveShopBagSlotManager2.DN2(c1123980fM4.LIZIZ.LIZ())) {
                        ((InterfaceC1124130fMJ) this.mAggregateSlotWidgetWrapper.LIZ).LJIIJ(c1123980fM4.LIZIZ.LIZ());
                    }
                }
            }
        }
        if (this.viewModelStoreOwner != null && this.lifecycleOwner != null && checkFragmentIsValid()) {
            IIconSlot.SlotViewModel slotViewModelWQ22 = IIconSlot.SlotViewModel.wQ2(this.mAggregateSlotWidgetWrapper.LIZ, this.viewModelStoreOwner);
            C741690T7n.LIZ(this.lifecycleOwner, this.dataChannel, this.mAggregateSlotWidgetWrapper.LIZ.LJLI(), slotViewModelWQ22);
            C1124120fMI c1124120fMI2 = this.mAggregateSlotWidgetWrapper;
            if (!c1124120fMI2.LIZIZ) {
                c1124120fMI2.LIZIZ = true;
            }
            if (LiveShopAddPermissionBusinessSetting.INSTANCE.isEnabled() && (iLiveShopBagSlotManager = this.mShopSlotManager) != null) {
                InterfaceC756750TmL interfaceC756750TmL = this.mAggregateSlotWidgetWrapper.LIZ;
                if (interfaceC756750TmL instanceof InterfaceC1124130fMJ) {
                    iLiveShopBagSlotManager.y10((InterfaceC1124130fMJ) interfaceC756750TmL);
                }
            }
            this.mAggregateSlotWidgetWrapper.LIZ.LLIZ(slotViewModelWQ22, this.mIWidgetGate);
        }
    }

    public IIconSlot getIconSlot(EnumC756810TmR enumC756810TmR) {
        InterfaceC1124060fMC<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR> slotWidget = getSlotWidget(enumC756810TmR);
        if (slotWidget == null) {
            return null;
        }
        return slotWidget.LLILZLL();
    }

    public InterfaceC1124060fMC<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR> getSlotWidget(EnumC756810TmR enumC756810TmR) {
        return this.mIconSlotMap.get(enumC756810TmR);
    }

    @Override // X.InterfaceC770540UKm
    public InterfaceC1124060fMC<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR> getSlotWidgetByBizType(String str) {
        return this.mWidgetMap.get(str);
    }

    public IIconSlot.SlotViewModel getViewModel(EnumC756810TmR enumC756810TmR) {
        return this.mIconSlotViewModelMap.get(enumC756810TmR);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (message.what == 1 && !((C1123980fM4) HandlerHook.getMessageObj(message.obj)).LIZIZ.LLIZLLLIL()) {
            mediateSlots(HandlerHook.getMessageObj(message.obj));
        }
    }

    public void init(InterfaceC919320a1y interfaceC919320a1y) {
        DataChannel dataChannelProvideDataChannel = interfaceC919320a1y.provideDataChannel();
        this.dataChannel = dataChannelProvideDataChannel;
        if (dataChannelProvideDataChannel != null) {
            this.mMessageManager = (IMessageManager) dataChannelProvideDataChannel.gg0(C776250Uch.class);
            this.iconStyle = C1103010eoF.LIZ(C1102950eo9.LIZIZ(this.dataChannel));
        }
    }

    @Override // X.InterfaceC770540UKm
    public void load(final EnumC756810TmR enumC756810TmR) {
        ILiveShopBagSlotManager iLiveShopBagSlotManager;
        ILiveShopBagSlotManager iLiveShopBagSlotManager2;
        long id;
        boolean z;
        this.mSlotWidgetPriorityQueue = new PriorityBlockingQueue(3, new AComparatorS36S0000000_17(6));
        List<C1124000fM6> listLIZJ = C1123920fLy.LIZ().LIZJ(enumC756810TmR);
        initLiveEnterInfos();
        int i = 0;
        if (this.dataChannel != null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            C1078590eAr c1078590eAr = (C1078590eAr) this.dataChannel.gg0(C1082880eHm.class);
            Room room = (Room) this.dataChannel.gg0(RoomChannel.class);
            if (room != null) {
                id = room.getId();
                if (LiveShopAddPermissionBusinessSetting.INSTANCE.isEnabled()) {
                    ILiveShopBagSlotManager iLiveShopBagSlotManagerCreateLiveShopBagSlotManager = createLiveShopBagSlotManager(room);
                    this.mShopSlotManager = iLiveShopBagSlotManagerCreateLiveShopBagSlotManager;
                    if (iLiveShopBagSlotManagerCreateLiveShopBagSlotManager != null) {
                        iLiveShopBagSlotManagerCreateLiveShopBagSlotManager.pC2(room);
                    }
                }
            } else {
                id = -1;
            }
            long j = 0;
            if (c1078590eAr != null && c1078590eAr.LIZIZ && c1078590eAr.LIZ == id) {
                if (c1078590eAr.LIZLLL < 0) {
                    j = c1078590eAr.LJ;
                } else {
                    long j2 = c1078590eAr.LJ;
                    if (j2 > jElapsedRealtime) {
                        j = j2 - jElapsedRealtime;
                    }
                }
            }
            putData("delay_time_for_load_ecommerce_widget", Long.valueOf(j));
            putData("param_room", this.dataChannel.gg0(RoomChannel.class));
            putData("live_activity_created_time_stamp_data", this.dataChannel.gg0(C781130UkZ.class));
            AdLiveEnterRoomConfig adLiveEnterRoomConfigLJII = C0IXW.LJII(this.dataChannel);
            if (adLiveEnterRoomConfigLJII != null) {
                putData("param_effect_ad_extra", adLiveEnterRoomConfigLJII.LIZIZ());
                putData("param_effect_ad_id", adLiveEnterRoomConfigLJII.adId);
                putData("param_ad_ttclid", adLiveEnterRoomConfigLJII.ttclId);
            }
            putData("param_enter_from_effect_ad_bool", this.dataChannel.gg0(C755580TkS.class));
            putData("param_is_wand", this.dataChannel.gg0(C750080Tba.class));
            HashMap<String, String> liveShowTimeMap = getLiveShowTimeMap();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(System.currentTimeMillis());
            sbLIZ.append("");
            liveShowTimeMap.put("param_live_slot_load_time", C2188811AlT.LIZIZ(sbLIZ));
            getDataContainerLiveShowTimeMap().putAll(getLiveShowTimeMap());
            putData("param_extra_auto_route_schema", this.dataChannel.gg0(C1083300eIS.class));
            putData("param_enter_room_from_click_product_card", this.dataChannel.gg0(C753930Thn.class));
            putData("param_enter_room_has_shown_ec_preview_card", this.dataChannel.gg0(C753950Thp.class));
            putData("param_extra_auto_open_product_bag", this.dataChannel.gg0(C752690Tfn.class));
            putData("param_product_bag_page_params", this.dataChannel.gg0(C1094870eb7.class));
            putData("param_extra_opt_auto_route_schema_routing_timing", this.dataChannel.gg0(C752670Tfl.class));
            putData("param_extra_auto_open_product_bag_params", this.dataChannel.gg0(C1094880eb8.class));
            putData("param_extra_ec_common_extra_param", this.dataChannel.gg0(C749490Tad.class));
            putData("param_extra_ttls_auto_bag_route_params", this.dataChannel.gg0(C749300TaK.class));
            putData("param_extra_ttls_bag_auto_anchor_product_id", this.dataChannel.gg0(C749530Tah.class));
            if (this.dataChannel.gg0(LiveModeChannel.class) == LiveMode.LIVE_VOICE) {
                z = true;
            } else {
                z = false;
            }
            putData("param_is_hidden_ec_widget", Boolean.valueOf(z));
            putData("param_before_live_ec_params", this.dataChannel.gg0(C772110UQn.class));
            putData("param_live_type", C354201Zc.LIZ((LiveMode) this.dataChannel.gg0(LiveModeChannel.class)));
            putData("param_sea_live_di_provider", this.dataChannel.gg0(C771540UOi.class));
        }
        Iterator it2 = ((ArrayList) listLIZJ).iterator();
        while (it2.hasNext()) {
            final InterfaceC1124060fMC<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR> interfaceC1124060fMCLJ = ((C1124000fM6) it2.next()).LIZ.LJ(this.context, enumC756810TmR);
            if (interfaceC1124060fMCLJ != null) {
                this.mWidgetMap.put(interfaceC1124060fMCLJ.LIZ(), interfaceC1124060fMCLJ);
                final C1123980fM4 c1123980fM4 = new C1123980fM4();
                c1123980fM4.LIZ = C756800TmQ.LIZJ((EnumC756810TmR) interfaceC1124060fMCLJ.LLJ(), interfaceC1124060fMCLJ.LIZ());
                c1123980fM4.LIZIZ = interfaceC1124060fMCLJ;
                this.mSlotWidgetPriorityQueue.offer(c1123980fM4);
                if (this.mMessageManager != null && interfaceC1124060fMCLJ.getMessageType() != null) {
                    for (Integer num : interfaceC1124060fMCLJ.getMessageType()) {
                        if (num.intValue() > 0) {
                            this.mMessageManager.addMessageListener(num.intValue(), this);
                        }
                    }
                }
                if (LiveShopAddPermissionBusinessSetting.INSTANCE.isEnabled() && (iLiveShopBagSlotManager2 = this.mShopSlotManager) != null && iLiveShopBagSlotManager2.DN2(interfaceC1124060fMCLJ.LIZ())) {
                    i++;
                }
                C770580UKq.LIZIZ(interfaceC1124060fMCLJ, this.mDataContainer);
                interfaceC1124060fMCLJ.prepareToShow(this.mDataContainer, new InterfaceC756140TlM() { // from class: X.0fMD
                    @Override // X.InterfaceC756140TlM
                    public final void LIZ(boolean z2) {
                        boolean z3;
                        ILiveShopBagSlotManager iLiveShopBagSlotManager3;
                        Map<String, String> dataContainerLiveShowTimeMap = this.LIZLLL.getDataContainerLiveShowTimeMap();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(SystemClock.uptimeMillis());
                        sbLIZ2.append("");
                        dataContainerLiveShowTimeMap.put("param_live_slot_prepare_to_show", C2188811AlT.LIZIZ(sbLIZ2));
                        C1123980fM4 c1123980fM42 = c1123980fM4;
                        c1123980fM42.LIZLLL = true;
                        c1123980fM42.LIZJ = z2;
                        if (LiveToolbarLoadOptimizeSetting.INSTANCE.enableOtherIconOptimize(this.LIZLLL.dataChannel) && enumC756810TmR == EnumC756810TmR.SLOT_LIVE_WATCHER_TOOLBAR) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (!c1123980fM4.LIZIZ.LLIZLLLIL() && !z3) {
                            Message messageObtainMessage = this.LIZLLL.mHandler.obtainMessage(1);
                            messageObtainMessage.obj = c1123980fM4;
                            this.LIZLLL.mHandler.sendMessage(messageObtainMessage);
                        } else {
                            this.LIZLLL.mediateSlots(c1123980fM4);
                        }
                        if (LiveShopAddPermissionBusinessSetting.INSTANCE.isEnabled() && (iLiveShopBagSlotManager3 = this.LIZLLL.mShopSlotManager) != null) {
                            InterfaceC1124060fMC interfaceC1124060fMC = interfaceC1124060fMCLJ;
                            if (interfaceC1124060fMC instanceof InterfaceC212386189o) {
                                iLiveShopBagSlotManager3.kJ1(new C756940Tme(enumC756810TmR, interfaceC1124060fMC.LIZ(), z2), (InterfaceC212386189o) interfaceC1124060fMCLJ);
                            }
                        }
                    }
                });
            }
        }
        if (LiveShopAddPermissionBusinessSetting.INSTANCE.isEnabled() && (iLiveShopBagSlotManager = this.mShopSlotManager) != null) {
            iLiveShopBagSlotManager.RZ(i);
        }
    }

    public void mediateSlots(Object obj) {
        C1123980fM4 c1123980fM4 = (C1123980fM4) obj;
        Iterator<C1123980fM4> it2 = this.mSlotWidgetPriorityQueue.iterator();
        ArrayList arrayList = new ArrayList();
        while (it2.hasNext()) {
            C1123980fM4 next = it2.next();
            if (next.LIZLLL && !next.LIZJ) {
                next.LIZIZ.onDestroy();
                next.LIZIZ.onDispose();
                it2.remove();
            } else {
                arrayList.add(next);
            }
        }
        if (arrayList.size() > 1 && this.mStrategy == EnumC785140Ur2.AGGREGATE) {
            doShowSlotAggregate(arrayList);
        } else if (c1123980fM4.LIZJ && !c1123980fM4.LJ) {
            doShowMultiSlot(c1123980fM4);
        }
        Map<String, String> dataContainerLiveShowTimeMap = getDataContainerLiveShowTimeMap();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(SystemClock.uptimeMillis());
        sbLIZ.append("");
        dataContainerLiveShowTimeMap.put("PARAM_LIVE_SLOT_ON_CREATE", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public void onMessage(IMessage iMessage) {
        ILiveShopBagSlotManager iLiveShopBagSlotManager;
        InterfaceC756750TmL interfaceC756750TmL;
        Queue<C1123980fM4> queue = this.mSlotWidgetPriorityQueue;
        if (queue == null) {
            return;
        }
        for (C1123980fM4 c1123980fM4 : queue) {
            if (c1123980fM4.LIZJ) {
                c1123980fM4.LIZIZ.onMessage(iMessage);
            }
        }
        C1124120fMI c1124120fMI = this.mAggregateSlotWidgetWrapper;
        if (c1124120fMI != null && (interfaceC756750TmL = c1124120fMI.LIZ) != null) {
            interfaceC756750TmL.onMessage(iMessage);
        }
        if (LiveShopAddPermissionBusinessSetting.INSTANCE.isEnabled() && (iLiveShopBagSlotManager = this.mShopSlotManager) != null) {
            iLiveShopBagSlotManager.GV(new C00EZ(iMessage.getIntType(), iMessage));
        }
    }

    @Override // X.InterfaceC770540UKm
    public IconSlotController setDataChannel(DataChannel dataChannel) {
        this.dataChannel = dataChannel;
        if (dataChannel != null) {
            this.mMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class);
            this.iconStyle = C1103010eoF.LIZ(C1102950eo9.LIZIZ(dataChannel));
        }
        return this;
    }

    @Override // X.InterfaceC770540UKm
    public /* bridge */ /* synthetic */ InterfaceC770540UKm setDataChannel(DataChannel dataChannel) {
        setDataChannel(dataChannel);
        return this;
    }

    private void putDataFromCommonLogIfHava(Map<String, String> map, String str) {
        if (map.containsKey(str)) {
            putData(str, map.get(str));
        }
    }

    @Override // X.InterfaceC770540UKm
    public void putData(String str, Object obj) {
        this.mDataContainer.put(str, obj);
    }

    public IconSlotController(Context context, InterfaceC1123890fLv interfaceC1123890fLv, EnumC756810TmR enumC756810TmR, EnumC785140Ur2 enumC785140Ur2, Fragment fragment) {
        this.context = context;
        this.mActivity = C520010KaN.LJIJJLI(context, false);
        this.mIconSlotView = interfaceC1123890fLv;
        this.mSlotID = enumC756810TmR;
        this.mStrategy = enumC785140Ur2;
        interfaceC1123890fLv.g(enumC785140Ur2);
        Fragment detailSafRootFragment = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getDetailSafRootFragment(fragment);
        if (detailSafRootFragment != null) {
            this.viewModelStoreOwner = detailSafRootFragment;
            this.lifecycleOwner = detailSafRootFragment;
            return;
        }
        if (!C504210Jpz.LIZ && !C464660IKa.LIZ()) {
            C19EG c19eg = this.mActivity;
            this.viewModelStoreOwner = c19eg;
            this.lifecycleOwner = c19eg;
        } else if (fragment != null && LiveBroadcastSAAMemLeakOptRecord.getEnable()) {
            this.viewModelStoreOwner = fragment;
            this.lifecycleOwner = fragment;
        } else {
            this.viewModelStoreOwner = C520010KaN.LJJIZ(context, false);
            this.lifecycleOwner = C520010KaN.LJJIFFI(context, false);
        }
    }
}
