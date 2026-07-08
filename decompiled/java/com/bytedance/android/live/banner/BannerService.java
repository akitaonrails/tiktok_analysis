package com.bytedance.android.live.banner;

import X.AbstractC1136060ffY;
import X.AbstractC467020ITc;
import X.C001A;
import X.C098200Yq;
import X.C1092370eX5;
import X.C1097950eg5;
import X.C1097970eg7;
import X.C1101180elI;
import X.C13LE;
import X.C189200o6;
import X.C19719912Dl;
import X.C20441214yg;
import X.C2188811AlT;
import X.C497660JfQ;
import X.C500260Jjc;
import X.C776250Uch;
import X.C784440Upu;
import X.C823050WQl;
import X.InterfaceC1100800ekg;
import X.InterfaceC783220Unw;
import Y.ARunnableS86S0200000_17;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.util.LongSparseArray;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.chatroom.banner.panel.model.BannerPanelItem;
import com.bytedance.android.livesdk.chatroom.viewmodule.BroadcastPreviewBannerWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.NewTopRightBannerWidget;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.LiveScaleNativeBannerHighScore;
import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.LiveScaleNativeBannerLowScore;
import com.bytedance.android.livesdk.model.BannerInRoom;
import com.bytedance.android.livesdk.model.FeedBanner;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.message.RoomVerifyMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.BaseMessage;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public class BannerService implements IBannerService, OnMessageListener {
    public volatile C1101180elI LL;
    public final LongSparseArray<ArrayList<InterfaceC783220Unw>> LLILLJJLI = new LongSparseArray<>();
    public final LongSparseArray<DataChannel> LLILLL = new LongSparseArray<>();

    @Override // com.bytedance.android.live.banner.IBannerService
    public final C19719912Dl RG() {
        return C13LE.LIZ(BroadcastPreviewBannerWidget.class);
    }

    @Override // com.bytedance.android.live.banner.IBannerService
    public final float Sf2() {
        C1101180elI c1101180elI = this.LL;
        if (c1101180elI != null) {
            return c1101180elI.LIZIZ;
        }
        return -1.0f;
    }

    @Override // com.bytedance.android.live.banner.IBannerService
    public final boolean qI1() {
        if (this.LL == null) {
            return false;
        }
        C1101180elI c1101180elI = this.LL;
        float f = c1101180elI != null ? c1101180elI.LIZIZ : Float.MAX_VALUE;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isHighSystemLoad: ");
        sbLIZ.append(f);
        C20441214yg.LIZIZ("BannerService", C2188811AlT.LIZIZ(sbLIZ));
        return f >= LiveScaleNativeBannerLowScore.value() && f <= LiveScaleNativeBannerHighScore.value();
    }

    @Override // com.bytedance.android.live.banner.IBannerService
    public final Class qv0() {
        return NewTopRightBannerWidget.class;
    }

    public static String LIZ(String str) {
        boolean z;
        JSONObject jSONObjectOptJSONObject;
        String strOptString;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(new JSONObject(str).optString("general_preload_data"));
            String strOptString2 = jSONObject.optString("biz_type");
            if (strOptString2 == null || !Intrinsics.LJFF(strOptString2, "ecom") || (jSONObjectOptJSONObject = jSONObject.optJSONObject("biz_data")) == null || (strOptString = jSONObjectOptJSONObject.optString("delivery_id")) == null) {
                return null;
            }
            return strOptString;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static boolean LIZIZ(Room room) {
        boolean z = false;
        if (room == null) {
            return false;
        }
        RoomAuthStatus roomAuthStatus = room.getRoomAuthStatus();
        if (roomAuthStatus != null && roomAuthStatus.getBannerState() == 2) {
            z = true;
        }
        return !z;
    }

    @Override // com.bytedance.android.live.banner.IBannerService
    public final String AS1(FeedBanner feedBanner) {
        String str;
        if (feedBanner != null) {
            str = feedBanner.extra;
        } else {
            str = null;
        }
        return LIZ(str);
    }

    @Override // com.bytedance.android.live.banner.IBannerService
    public final void FG(Uri uri) {
        Object c098200Yq;
        Object c098200Yq2;
        String strOptString;
        String strOptString2;
        String strOptString3;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "banner_id");
        try {
            c098200Yq = new JSONArray(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "banner_list"));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        JSONArray jSONArray = (JSONArray) c098200Yq;
        if (jSONArray == null) {
            jSONArray = new JSONArray();
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        if (length >= 0) {
            int i = 0;
            while (true) {
                try {
                    c098200Yq2 = new JSONObject(jSONArray.optString(i));
                    C189200o6.m2constructorimpl(c098200Yq2);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c098200Yq2 = new C098200Yq(th2);
                    C189200o6.m2constructorimpl(c098200Yq2);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                    c098200Yq2 = null;
                }
                JSONObject jSONObject = (JSONObject) c098200Yq2;
                BannerPanelItem.Companion.getClass();
                if (jSONObject != null && (strOptString = jSONObject.optString("title")) != null && (strOptString2 = jSONObject.optString(FollowStatusChangeMethod.PARAM_UID)) != null && (strOptString3 = jSONObject.optString("schema_url")) != null) {
                    arrayList.add(new BannerPanelItem(strOptString, strOptString2, strOptString3));
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        Pair pair = new Pair(arrayList, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        List list = (List) pair.getFirst();
        String str = (String) pair.getSecond();
        if (list.isEmpty()) {
            return;
        }
        C784440Upu.LIZ().LIZIZ(new C1092370eX5(list, str));
    }

    @Override // com.bytedance.android.live.banner.IBannerService
    public final C1097950eg5 HN(Context context) {
        return new C1097950eg5(context, null, 0);
    }

    @Override // com.bytedance.android.live.banner.IBannerService
    public final String jN2(BannerInRoom bannerInRoom) {
        Boolean boolValueOf;
        String str = null;
        if (bannerInRoom != null) {
            boolValueOf = Boolean.valueOf(C1097970eg7.LIZLLL(bannerInRoom));
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJIJIIJIL(boolValueOf)) {
            return null;
        }
        if (bannerInRoom != null) {
            str = bannerInRoom.extra;
        }
        return LIZ(str);
    }

    @Override // com.bytedance.android.live.banner.IBannerService
    public final void mE0(long j) {
        InRoomBannerManager.LL.getClass();
        InRoomBannerManager.LIZ(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        BaseMessage baseMessage;
        CommonMessageData commonMessageData;
        long j;
        DataChannel dataChannel;
        Room room;
        if ((iMessage instanceof AbstractC1136060ffY) && (baseMessage = (BaseMessage) iMessage) != null && (commonMessageData = baseMessage.baseMessage) != null && (dataChannel = this.LLILLL.get((j = commonMessageData.roomId))) != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && (iMessage instanceof RoomVerifyMessage)) {
            int i = ((RoomVerifyMessage) iMessage).verifyAction;
            if (i == 25) {
                RoomAuthStatus roomAuthStatus = room.getRoomAuthStatus();
                if (roomAuthStatus != null) {
                    roomAuthStatus.setBannerState(1);
                }
                ArrayList<InterfaceC783220Unw> arrayList = this.LLILLJJLI.get(j);
                if (arrayList != null) {
                    Iterator<InterfaceC783220Unw> it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        it2.next().LIZ(LIZIZ(room));
                    }
                    return;
                }
                return;
            }
            if (i == 24) {
                RoomAuthStatus roomAuthStatus2 = room.getRoomAuthStatus();
                if (roomAuthStatus2 != null) {
                    roomAuthStatus2.setBannerState(2);
                }
                ArrayList<InterfaceC783220Unw> arrayList2 = this.LLILLJJLI.get(j);
                if (arrayList2 != null) {
                    Iterator<InterfaceC783220Unw> it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        it3.next().LIZ(LIZIZ(room));
                    }
                }
            }
        }
    }

    @Override // com.bytedance.android.live.banner.IBannerService
    public final boolean xB2(long j) {
        Room room;
        DataChannel dataChannel = this.LLILLL.get(j);
        if (dataChannel != null) {
            room = (Room) dataChannel.gg0(RoomChannel.class);
        } else {
            room = null;
        }
        return LIZIZ(room);
    }

    @Override // com.bytedance.android.live.banner.IBannerService
    public final void LLLF(Room room, DataChannel dataChannel) {
        IMessageManager iMessageManager;
        if (room != null) {
            this.LLILLL.remove(room.getId());
            this.LLILLJJLI.remove(room.getId());
        }
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
            iMessageManager.removeMessageListener(C001A.ROOM_VERIFY.getIntType(), this);
        }
    }

    @Override // com.bytedance.android.live.banner.IBannerService
    public final void SL(long j, InterfaceC783220Unw interfaceC783220Unw) {
        ArrayList<InterfaceC783220Unw> arrayList = this.LLILLJJLI.get(j);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.LLILLJJLI.put(j, arrayList);
        }
        arrayList.add(interfaceC783220Unw);
    }

    @Override // com.bytedance.android.live.banner.IBannerService
    public final void k70(Room room, DataChannel dataChannel) {
        IMessageManager iMessageManager;
        if (room != null) {
            this.LLILLL.put(room.getId(), dataChannel);
        }
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
            iMessageManager.addMessageListener(C001A.ROOM_VERIFY.getIntType(), this);
        }
    }

    @Override // com.bytedance.android.live.banner.IBannerService
    public final void wJ0(InterfaceC1100800ekg interfaceC1100800ekg, boolean z) {
        interfaceC1100800ekg.LJIIIIZZ(new AbstractC467020ITc() { // from class: X.0eX3
            @Override // X.AbstractC467020ITc, X.InterfaceC1101120elC
            public final void LIZJ(InterfaceC1100800ekg interfaceC1100800ekg2, C1100750ekb c1100750ekb) {
                this.LIZ.LL = c1100750ekb.LIZIZ;
            }
        });
        if (z) {
            C823050WQl.LIZJ().submit(new ARunnableS86S0200000_17(this, interfaceC1100800ekg, 6));
        }
    }

    @Override // com.bytedance.android.live.banner.IBannerService
    public final void YT0(LifecycleOwner lifecycleOwner, long j, boolean z, boolean z2) {
        Lifecycle lifecycle;
        C497660JfQ.LIZ = SystemClock.elapsedRealtime();
        InRoomBannerManager inRoomBannerManager = InRoomBannerManager.LL;
        inRoomBannerManager.getClass();
        boolean zLJI = MethodIDManager.LJI(137912);
        WeakReference<LifecycleOwner> weakReference = new WeakReference<>(lifecycleOwner);
        InRoomBannerManager.LLILLJJLI = weakReference;
        InRoomBannerManager.LLILLL = j;
        InRoomBannerManager.LLILZ = z;
        LifecycleOwner lifecycleOwner2 = weakReference.get();
        if (lifecycleOwner2 != null && (lifecycle = lifecycleOwner2.getLifecycle()) != null) {
            lifecycle.addObserver(inRoomBannerManager);
        }
        InRoomBannerManager.LIZIZ(InRoomBannerManager.LLILLL, InRoomBannerManager.LLILZ, z2);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0090  */
    @Override // com.bytedance.android.live.banner.IBannerService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void QE(com.bytedance.android.livesdkapi.depend.model.live.Room r6, boolean r7, boolean r8, com.bytedance.ies.sdk.widgets.RecyclableWidgetManager r9, com.bytedance.ies.sdk.datachannel.DataChannel r10, androidx.lifecycle.LifecycleOwner r11) {
        /*
            r5 = this;
            r3 = 1
            if (r7 != 0) goto L12
            if (r6 == 0) goto L37
            com.bytedance.android.live.base.model.user.User r0 = r6.getOwner()
            if (r0 == 0) goto L37
            int r0 = r0.getSecret()
            if (r0 != r3) goto L37
            return
        L12:
            com.bytedance.android.livesdk.livesetting.banner.LiveMiddleTouchAnchorEnableSetting r0 = com.bytedance.android.livesdk.livesetting.banner.LiveMiddleTouchAnchorEnableSetting.INSTANCE
            boolean r0 = r0.getValue()
            if (r0 != 0) goto L37
        L1a:
            java.lang.Class<com.bytedance.android.livesdk.chatroom.viewmodule.LiveGoalsWidget> r1 = com.bytedance.android.livesdk.chatroom.viewmodule.LiveGoalsWidget.class
        L1c:
            if (r6 == 0) goto L64
            com.bytedance.android.livesdk.model.RoomAuthStatus r0 = r6.getRoomAuthStatus()
            if (r0 == 0) goto L64
            boolean r0 = r0.isEnableGift()
            if (r0 != 0) goto L64
            com.bytedance.android.live.base.model.user.User r0 = r6.getOwner()
            if (r0 == 0) goto L5c
            int r0 = r0.getSecret()
            if (r0 != r3) goto L5c
            return
        L37:
            if (r8 != 0) goto L1a
            com.bytedance.android.livesdk.livesetting.banner.LiveMiddleTouchArchitectureLiveTypeSetting r0 = com.bytedance.android.livesdk.livesetting.banner.LiveMiddleTouchArchitectureLiveTypeSetting.INSTANCE
            com.bytedance.android.livesdk.livesetting.banner.LiveMiddleTouchArchitectureLiveTypeSetting$MiddleTouchEnableSwitch r2 = r0.getValue()
            if (r2 == 0) goto L1a
            if (r6 == 0) goto L1a
            boolean r1 = X.C00FN.LIZJ(r6)
            boolean r0 = X.C781520UlC.LIZIZ(r6)
            if (r0 == 0) goto L54
            boolean r0 = r2.gameEnable
        L4f:
            if (r0 == 0) goto L1a
            java.lang.Class<com.bytedance.android.livesdk.chatroom.viewmodule.MiddleTouchWidget> r1 = com.bytedance.android.livesdk.chatroom.viewmodule.MiddleTouchWidget.class
            goto L1c
        L54:
            if (r1 == 0) goto L59
            boolean r0 = r2.ecEnable
            goto L4f
        L59:
            boolean r0 = r2.videoEnable
            goto L4f
        L5c:
            kotlin.Pair r4 = new kotlin.Pair
            X.0eX2 r0 = X.EnumC1092340eX2.LLILLJJLI
            r4.<init>(r0, r1)
            goto L6b
        L64:
            kotlin.Pair r4 = new kotlin.Pair
            X.0eX2 r0 = X.EnumC1092340eX2.LL
            r4.<init>(r0, r1)
        L6b:
            java.lang.Object r0 = r4.getFirst()
            X.0eX2 r0 = (X.EnumC1092340eX2) r0
            int r0 = r0.ordinal()
            if (r0 == 0) goto L90
            if (r0 != r3) goto L8a
            X.0eX4 r3 = new X.0eX4
            r3.<init>()
            java.lang.Class<com.bytedance.android.live.OpenGiftVerifyEvent> r2 = com.bytedance.android.live.OpenGiftVerifyEvent.class
            kotlin.jvm.internal.AwS44S0301000_17 r1 = new kotlin.jvm.internal.AwS44S0301000_17
            r0 = 2
            r1.<init>(r3, r9, r4, r0)
            r10.EQ2(r11, r2, r1)
            return
        L8a:
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        L90:
            java.lang.Object r1 = r4.getSecond()
            java.lang.Class r1 = (java.lang.Class) r1
            r0 = 2131400718(0x7f0a980e, float:1.8422298E38)
            r9.load(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.banner.BannerService.QE(com.bytedance.android.livesdkapi.depend.model.live.Room, boolean, boolean, com.bytedance.ies.sdk.widgets.RecyclableWidgetManager, com.bytedance.ies.sdk.datachannel.DataChannel, androidx.lifecycle.LifecycleOwner):void");
    }
}
