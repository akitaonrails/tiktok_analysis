package com.bytedance.android.live.slot;

import X.C0IR5;
import X.C0IXL;
import X.C0IXW;
import X.C1083300eIS;
import X.C1094870eb7;
import X.C1094880eb8;
import X.C1123920fLy;
import X.C1123980fM4;
import X.C1124000fM6;
import X.C1124100fMG;
import X.C19EG;
import X.C2188811AlT;
import X.C520010KaN;
import X.C749490Tad;
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
import X.C776250Uch;
import X.C781130UkZ;
import X.EnumC1123900fLw;
import X.EnumC1124020fM8;
import X.InterfaceC1123990fM5;
import X.InterfaceC1124060fMC;
import X.InterfaceC756140TlM;
import X.InterfaceC919320a1y;
import Y.AComparatorS36S0000000_17;
import Y.AObjectS360S0100000_17;
import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastSingleActivityFixCrash;
import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;
import qo2.w;

/* JADX INFO: loaded from: classes18.dex */
public class FrameSlotController implements WeakHandler.IHandler, OnMessageListener, GenericLifecycleObserver {
    public Queue<C1123980fM4> LL;
    public final WeakHandler LLILLJJLI;
    public final C19EG LLILLL;
    public final Context LLILZ;
    public final InterfaceC1123990fM5 LLILZIL;
    public DataChannel LLILZLL;
    public IMessageManager LLIZ;
    public final Map<String, Object> LLIZLLLIL;
    public boolean LLJ;
    public final C1124100fMG LLJI;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
            return;
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
            return;
        }
        if (event == Lifecycle.Event.ON_START) {
            onStart();
            return;
        }
        if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_STOP) {
            onStop();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public final Map<String, String> LIZ() {
        Map<String, String> map;
        Object obj = ((HashMap) this.LLIZLLLIL).get("param_live_show_time");
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

    public final HashMap<String, String> LIZIZ() {
        DataChannel dataChannel = this.LLILZLL;
        if (dataChannel == null) {
            return new HashMap<>();
        }
        HashMap<String, String> map = (HashMap) dataChannel.gg0(C755790Tkn.class);
        if (map != null) {
            return map;
        }
        HashMap<String, String> map2 = new HashMap<>();
        this.LLILZLL.SX0(C755790Tkn.class, map2);
        return map2;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        Queue<C1123980fM4> queue = this.LL;
        if (queue == null) {
            return;
        }
        Iterator it2 = ((PriorityBlockingQueue) queue).iterator();
        while (it2.hasNext()) {
            ((C1123980fM4) it2.next()).LIZIZ.onCreate(new Bundle());
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        IMessageManager iMessageManager = this.LLIZ;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        this.LLILLJJLI.removeCallbacksAndMessages(null);
        Queue<C1123980fM4> queue = this.LL;
        if (queue == null) {
            return;
        }
        for (C1123980fM4 c1123980fM4 : (PriorityBlockingQueue) queue) {
            c1123980fM4.LIZIZ.onDestroy();
            c1123980fM4.LIZIZ.onDispose();
        }
        this.LLIZ = null;
        this.LLILZLL = null;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        Queue<C1123980fM4> queue = this.LL;
        if (queue == null) {
            return;
        }
        Iterator it2 = ((PriorityBlockingQueue) queue).iterator();
        while (it2.hasNext()) {
            ((C1123980fM4) it2.next()).LIZIZ.onPause();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        Queue<C1123980fM4> queue = this.LL;
        if (queue == null) {
            return;
        }
        Iterator it2 = ((PriorityBlockingQueue) queue).iterator();
        while (it2.hasNext()) {
            ((C1123980fM4) it2.next()).LIZIZ.onResume();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart() {
        Queue<C1123980fM4> queue = this.LL;
        if (queue == null) {
            return;
        }
        Iterator it2 = ((PriorityBlockingQueue) queue).iterator();
        while (it2.hasNext()) {
            ((C1123980fM4) it2.next()).LIZIZ.onStart();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
        Queue<C1123980fM4> queue = this.LL;
        if (queue == null) {
            return;
        }
        Iterator it2 = ((PriorityBlockingQueue) queue).iterator();
        while (it2.hasNext()) {
            ((C1123980fM4) it2.next()).LIZIZ.onStop();
        }
    }

    public final void LIZJ(InterfaceC919320a1y interfaceC919320a1y) {
        DataChannel dataChannelProvideDataChannel = interfaceC919320a1y.provideDataChannel();
        this.LLILZLL = dataChannelProvideDataChannel;
        if (dataChannelProvideDataChannel != null) {
            this.LLIZ = (IMessageManager) dataChannelProvideDataChannel.gg0(C776250Uch.class);
            this.LLILZLL.gg0(RoomChannel.class);
            ((Boolean) this.LLILZLL.gg0(UserIsAnchorChannel.class)).booleanValue();
        }
    }

    public final void LIZLLL(EnumC1124020fM8 enumC1124020fM8) {
        int iIntValue;
        Integer num;
        String str;
        String str2;
        boolean z;
        C0IXL c0ixl;
        Map<String, String> map;
        String str3;
        C0IXL c0ixl2;
        Map<String, String> map2;
        C0IXL c0ixl3;
        Map<String, String> map3;
        this.LL = new PriorityBlockingQueue(3, new AComparatorS36S0000000_17(4));
        List<C1124000fM6> listLIZIZ = C1123920fLy.LIZ().LIZIZ(enumC1124020fM8);
        w wVar = w.LIZ;
        wVar.getClass();
        putData("param_live_enter_from_merge", w.LJIIIZ());
        putData("param_live_enter_method_merge", w.LJIIL());
        putData("param_live_window_mode", w.LJIILLIIL());
        putData("param_live_action_type", w.LIZLLL());
        putData("param_live_rec_content_id", wVar.LIZ());
        putData("param_live_rec_content_type", wVar.LIZIZ());
        putData("param_live_begin_time", Long.valueOf(w.LJFF()));
        putData("param_live_begin_time_real", Long.valueOf(w.LJI()));
        putData("param_ec_recommend_info", w.LJIIIIZZ());
        putData("param_enter_room_video_id", w.LJJII());
        Map<String, String> mapLJII = w.LJII();
        LJFF(mapLJII, "is_inner");
        LJFF(mapLJII, "inner_search_id");
        LJFF(mapLJII, "rank_inner");
        LJFF(mapLJII, "is_slide");
        LJFF(mapLJII, "slide_rank");
        DataChannel dataChannel = this.LLILZLL;
        if (dataChannel != null) {
            putData("param_data_channel", dataChannel);
            putData("param_room", this.LLILZLL.gg0(RoomChannel.class));
            putData("live_activity_created_time_stamp_data", this.LLILZLL.gg0(C781130UkZ.class));
            AdLiveEnterRoomConfig adLiveEnterRoomConfigLJII = C0IXW.LJII(this.LLILZLL);
            if (adLiveEnterRoomConfigLJII != null) {
                putData("param_effect_ad_extra", adLiveEnterRoomConfigLJII.LIZIZ());
                putData("param_effect_ad_id", adLiveEnterRoomConfigLJII.adId);
                putData("param_ad_ttclid", adLiveEnterRoomConfigLJII.ttclId);
            }
            putData("param_enter_from_effect_ad_bool", this.LLILZLL.gg0(C755580TkS.class));
            putData("param_is_wand", this.LLILZLL.gg0(C750080Tba.class));
            HashMap<String, String> mapLIZIZ = LIZIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(System.currentTimeMillis());
            String str4 = "";
            sbLIZ.append("");
            mapLIZIZ.put("param_live_slot_load_time", C2188811AlT.LIZIZ(sbLIZ));
            LIZ().putAll(LIZIZ());
            putData("param_extra_auto_route_schema", this.LLILZLL.gg0(C1083300eIS.class));
            putData("param_enter_room_from_click_product_card", this.LLILZLL.gg0(C753930Thn.class));
            putData("param_enter_room_has_shown_ec_preview_card", this.LLILZLL.gg0(C753950Thp.class));
            putData("param_extra_auto_open_product_bag", this.LLILZLL.gg0(C752690Tfn.class));
            putData("param_product_bag_page_params", this.LLILZLL.gg0(C1094870eb7.class));
            putData("param_extra_opt_auto_route_schema_routing_timing", this.LLILZLL.gg0(C752670Tfl.class));
            putData("param_extra_auto_open_product_bag_params", this.LLILZLL.gg0(C1094880eb8.class));
            putData("param_extra_ec_common_extra_param", this.LLILZLL.gg0(C749490Tad.class));
            putData("param_search_id", w.LJIL());
            putData("param_search_result_id", w.LJJ());
            C0IR5 c0ir5LJJIII = w.LJJIII();
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
            if (this.LLILZLL.gg0(LiveModeChannel.class) == LiveMode.LIVE_VOICE) {
                z = true;
            } else {
                z = false;
            }
            putData("param_is_hidden_ec_widget", Boolean.valueOf(z));
            putData("param_sea_live_di_provider", this.LLILZLL.gg0(C771540UOi.class));
        }
        DataChannel dataChannel2 = this.LLILZLL;
        if (dataChannel2 != null) {
            dataChannel2.BQ2(this.LLJI.getLifecycleOwner(), ToolbarShowExternalEvent.class, new AObjectS360S0100000_17(this, 5));
        }
        Iterator it2 = ((ArrayList) listLIZIZ).iterator();
        while (it2.hasNext()) {
            final InterfaceC1124060fMC<IFrameSlot, IFrameSlot.SlotViewModel, EnumC1124020fM8> interfaceC1124060fMCLJFF = ((C1124000fM6) it2.next()).LIZ.LJFF(this.LLILZ, enumC1124020fM8);
            if (interfaceC1124060fMCLJFF != null) {
                final C1123980fM4 c1123980fM4 = new C1123980fM4();
                Enum enumLLJ = interfaceC1124060fMCLJFF.LLJ();
                String strLIZ = interfaceC1124060fMCLJFF.LIZ();
                Map map4 = (Map) ((HashMap) C756800TmQ.LIZIZ).get(enumLLJ);
                if (map4 != null && (num = (Integer) map4.get(strLIZ)) != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = C756800TmQ.LIZLLL;
                }
                c1123980fM4.LIZ = iIntValue;
                c1123980fM4.LIZIZ = interfaceC1124060fMCLJFF;
                ((PriorityBlockingQueue) this.LL).offer(c1123980fM4);
                if (this.LLIZ != null && interfaceC1124060fMCLJFF.getMessageType() != null) {
                    for (Integer num2 : interfaceC1124060fMCLJFF.getMessageType()) {
                        if (num2.intValue() > 0) {
                            this.LLIZ.addMessageListener(num2.intValue(), this);
                        }
                    }
                }
                C770580UKq.LIZIZ(interfaceC1124060fMCLJFF, this.LLIZLLLIL);
                interfaceC1124060fMCLJFF.prepareToShow(this.LLIZLLLIL, new InterfaceC756140TlM() { // from class: X.0fME
                    @Override // X.InterfaceC756140TlM
                    public final void LIZ(boolean z2) {
                        Map<String, String> mapLIZ = this.LIZJ.LIZ();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(SystemClock.uptimeMillis());
                        sbLIZ2.append("");
                        mapLIZ.put("param_live_slot_prepare_to_show", C2188811AlT.LIZIZ(sbLIZ2));
                        C1123980fM4 c1123980fM42 = c1123980fM4;
                        c1123980fM42.LIZLLL = true;
                        c1123980fM42.LIZJ = z2;
                        if (interfaceC1124060fMCLJFF.LLIZLLLIL()) {
                            this.LIZJ.LJ(c1123980fM4);
                            return;
                        }
                        Message messageObtainMessage = this.LIZJ.LLILLJJLI.obtainMessage(1);
                        messageObtainMessage.obj = c1123980fM4;
                        this.LIZJ.LLILLJJLI.sendMessage(messageObtainMessage);
                    }
                });
            }
        }
    }

    public final void LJ(Object obj) {
        ViewModelStoreOwner viewModelStoreOwnerLJJIZ;
        C1123980fM4 c1123980fM4 = (C1123980fM4) obj;
        Iterator it2 = ((PriorityBlockingQueue) this.LL).iterator();
        while (it2.hasNext()) {
            C1123980fM4 c1123980fM42 = (C1123980fM4) it2.next();
            if (c1123980fM42.LIZLLL && !c1123980fM42.LIZJ) {
                c1123980fM42.LIZIZ.onDestroy();
                c1123980fM42.LIZIZ.onDispose();
                it2.remove();
            }
        }
        if (c1123980fM4 != null && c1123980fM4.LIZJ && !c1123980fM4.LJ && (c1123980fM4.LIZIZ.LLILZLL() instanceof IFrameSlot) && (viewModelStoreOwnerLJJIZ = C520010KaN.LJJIZ(this.LLILZ, false)) != null && (!LiveBroadcastSingleActivityFixCrash.getEnable() || !(viewModelStoreOwnerLJJIZ instanceof Fragment) || ((Fragment) viewModelStoreOwnerLJJIZ).isAdded())) {
            IFrameSlot.SlotViewModel slotViewModelWQ2 = IFrameSlot.SlotViewModel.wQ2(c1123980fM4.LIZIZ, viewModelStoreOwnerLJJIZ);
            this.LLILZIL.h1(c1123980fM4, slotViewModelWQ2);
            if (this.LLJ) {
                slotViewModelWQ2.LLILLJJLI.setValue(Boolean.TRUE);
            }
            c1123980fM4.LIZIZ.LLIZ(slotViewModelWQ2, this.LLJI);
            c1123980fM4.LJ = true;
        }
        Map<String, String> mapLIZ = LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(SystemClock.uptimeMillis());
        sbLIZ.append("");
        mapLIZ.put("PARAM_LIVE_SLOT_ON_CREATE", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        if (message.what == 1 && !((C1123980fM4) HandlerHook.getMessageObj(message.obj)).LIZIZ.LLIZLLLIL()) {
            LJ(HandlerHook.getMessageObj(message.obj));
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        Queue<C1123980fM4> queue = this.LL;
        if (queue == null) {
            return;
        }
        for (C1123980fM4 c1123980fM4 : (PriorityBlockingQueue) queue) {
            if (c1123980fM4.LIZJ) {
                c1123980fM4.LIZIZ.onMessage(iMessage);
            }
        }
    }

    public final void LJFF(Map<String, String> map, String str) {
        if (map.containsKey(str)) {
            putData(str, map.get(str));
        }
    }

    public final void putData(String str, Object obj) {
        ((HashMap) this.LLIZLLLIL).put(str, obj);
    }

    public FrameSlotController(Context context, InterfaceC1123990fM5 interfaceC1123990fM5, EnumC1123900fLw enumC1123900fLw) {
        new HashMap();
        new HashMap();
        this.LLILLJJLI = new WeakHandler(this);
        this.LLIZLLLIL = new HashMap();
        this.LLJ = false;
        this.LLJI = new C1124100fMG(this);
        this.LLILZ = context;
        this.LLILLL = C520010KaN.LJIJJLI(context, false);
        this.LLILZIL = interfaceC1123990fM5;
        interfaceC1123990fM5.G0(enumC1123900fLw);
    }
}
