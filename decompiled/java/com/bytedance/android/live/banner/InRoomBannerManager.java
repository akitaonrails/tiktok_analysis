package com.bytedance.android.live.banner;

import X.C001A;
import X.C09JN;
import X.C0J1N;
import X.C0UO0;
import X.C1097990eg9;
import X.C1161920gLG;
import X.C11JN;
import X.C11NZ;
import X.C11PQ;
import X.C11RD;
import X.C1701940uOG;
import X.C470590Icr;
import X.C480460Ism;
import X.C497120JeY;
import X.C497610JfL;
import X.C497640JfO;
import android.os.SystemClock;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.banner.InRoomBannerManager;
import com.bytedance.android.live.network.combine.exp.LiveCombineRequestExp;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.model.message.BannerInRoomCollection;
import com.bytedance.android.livesdk.model.message.InRoomBannerRefreshMessage;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.message.IMessageService;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public final class InRoomBannerManager implements OnMessageListener, GenericLifecycleObserver {
    public static WeakReference<LifecycleOwner> LLILLJJLI;
    public static boolean LLILZ;
    public static final InRoomBannerManager LL = new InRoomBannerManager();
    public static long LLILLL = -1;
    public static C11PQ<C497640JfO> LLILZIL = new C11PQ<>();

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        IMessageManager iMessageManager = ((IMessageService) C1161920gLG.LIZJ(IMessageService.class)).get(LLILLL);
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.IN_ROOM_BANNER_REFRESH_MESSAGE.getIntType(), this);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        IMessageManager iMessageManager = ((IMessageService) C1161920gLG.LIZJ(IMessageService.class)).get(LLILLL);
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        WeakReference<LifecycleOwner> weakReference = LLILLJJLI;
        if (weakReference != null && (lifecycleOwner = weakReference.get()) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(this);
        }
        LLILLJJLI = null;
        LLILLL = -1L;
        LLILZ = false;
        LLILZIL = new C11PQ<>();
    }

    public static void LIZ(long j) {
        C11NZ c11nzLJJJJZ;
        LifecycleOwner lifecycleOwner;
        if (j > 0) {
            c11nzLJJJJZ = C11NZ.LJJJJZ(1).LJJI(j, TimeUnit.SECONDS);
        } else {
            c11nzLJJJJZ = C11NZ.LJJJJZ(1);
        }
        C11JN c11jnLJJIJIIJIL = c11nzLJJJJZ.LJJJLZIJ(C1701940uOG.LIZIZ()).LJL(C1701940uOG.LIZIZ()).LJJIJIIJIL(new C09JN() { // from class: X.0JfM
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("InRoomBannerManager@ca7c.refreshBanner$1");
                InRoomBannerManager inRoomBannerManager = InRoomBannerManager.LL;
                long j2 = InRoomBannerManager.LLILLL;
                boolean z = InRoomBannerManager.LLILZ;
                inRoomBannerManager.getClass();
                InRoomBannerManager.LIZIZ(j2, z, false);
                C1C7U.LIZIZ("InRoomBannerManager@ca7c.refreshBanner$1");
            }
        });
        WeakReference<LifecycleOwner> weakReference = LLILLJJLI;
        if (weakReference != null) {
            lifecycleOwner = weakReference.get();
        } else {
            lifecycleOwner = null;
        }
        ((C0J1N) c11jnLJJIJIIJIL.LIZJ(C11RD.LJ(lifecycleOwner))).subscribe();
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        long j;
        if (iMessage != null && iMessage.getIntType() == C001A.IN_ROOM_BANNER_REFRESH_MESSAGE.getIntType() && (iMessage instanceof InRoomBannerRefreshMessage)) {
            InRoomBannerRefreshMessage inRoomBannerRefreshMessage = (InRoomBannerRefreshMessage) iMessage;
            if (inRoomBannerRefreshMessage.delaySeconds > 0) {
                IBannerService iBannerService = (IBannerService) C1161920gLG.LIZJ(IBannerService.class);
                CommonMessageData commonMessageData = inRoomBannerRefreshMessage.baseMessage;
                if (commonMessageData != null) {
                    j = commonMessageData.roomId;
                } else {
                    j = 0;
                }
                if (iBannerService.xB2(j)) {
                    if (LLILZ || !inRoomBannerRefreshMessage.onlyAnchor) {
                        LIZ(new Random().nextInt(inRoomBannerRefreshMessage.delaySeconds));
                    }
                }
            }
        }
    }

    public static void LIZIZ(final long j, final boolean z, boolean z2) {
        int i;
        C11NZ<C470590Icr<BannerInRoomCollection>> c11nzQueryLiveRoomBanner;
        LifecycleOwner lifecycleOwner;
        C1097990eg9.LIZIZ().LJFF = System.currentTimeMillis();
        if (!z && z2 && LiveCombineRequestExp.INSTANCE.enableForRequest("/webcast/room/in_room_banner/")) {
            c11nzQueryLiveRoomBanner = C497120JeY.LJIIZILJ.LIZIZ("/webcast/room/in_room_banner/", new C497610JfL(j, z));
        } else {
            C480460Ism.LIZ().getClass();
            BannerRetrofitApi bannerRetrofitApi = (BannerRetrofitApi) C480460Ism.LIZLLL(BannerRetrofitApi.class);
            if (z) {
                i = 2;
            } else {
                i = 1;
            }
            c11nzQueryLiveRoomBanner = bannerRetrofitApi.queryLiveRoomBanner(j, i);
        }
        C11NZ<R> c11nzLJIILIIL = c11nzQueryLiveRoomBanner.LJIILIIL(new C0UO0());
        WeakReference<LifecycleOwner> weakReference = LLILLJJLI;
        if (weakReference != null) {
            lifecycleOwner = weakReference.get();
        } else {
            lifecycleOwner = null;
        }
        ((C0J1N) c11nzLJIILIIL.LIZJ(C11RD.LJ(lifecycleOwner))).LIZ(new C09JN() { // from class: X.0JfN
            @Override // X.C09JN
            public final void accept(Object obj) {
                long j2;
                C1C7U.LIZ("InRoomBannerManager@ca7c.request$2");
                BaseResponse baseResponse = (BaseResponse) obj;
                long j3 = j;
                boolean z3 = z;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("room_id", Long.valueOf(j3));
                linkedHashMap.put("is_anchor", Integer.valueOf(z3 ? 1 : 0));
                long j4 = C497660JfQ.LIZ;
                if (j4 != -1 && jElapsedRealtime > j4) {
                    j2 = jElapsedRealtime - j4;
                } else {
                    j2 = -1;
                }
                linkedHashMap.put("duration", Long.valueOf(j2));
                C497660JfQ.LIZ(0, "req_success", linkedHashMap);
                C497660JfQ.LIZ = -1L;
                C1097990eg9.LIZIZ().LJI = System.currentTimeMillis();
                InRoomBannerManager.LLILZIL.onNext(new C497640JfO(j, (BannerInRoomCollection) baseResponse.data));
                C1C7U.LIZIZ("InRoomBannerManager@ca7c.request$2");
            }
        }, new C09JN() { // from class: X.0JfP
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("InRoomBannerManager@ca7c.request$3");
                C1097990eg9 c1097990eg9 = C1097990eg9.LIZ;
                C1097990eg9.LIZIZ().LJI = System.currentTimeMillis();
                String message = ((Throwable) obj).getMessage();
                C1098010egB c1098010egBLIZIZ = C1097990eg9.LIZIZ();
                long jLIZ = C1097990eg9.LIZ(c1098010egBLIZIZ.LJFF, c1098010egBLIZIZ.LJI);
                HashMap map = new HashMap(c1098010egBLIZIZ.LIZIZ());
                map.put("duration", Long.valueOf(jLIZ));
                if (message == null) {
                    message = "unknown";
                }
                map.put("error_message", message);
                C1097990eg9.LIZJ(c1097990eg9, "banner_data_filtered", 1, map);
                C497660JfQ.LIZ(1, "req_failed", new LinkedHashMap());
                Map<String, Object> map2 = C1338270kvh.LIZ;
                C1C7U.LIZIZ("InRoomBannerManager@ca7c.request$3");
            }
        });
    }
}
