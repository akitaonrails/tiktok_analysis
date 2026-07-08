package com.bytedance.android.live.publicscreen.impl.widget;

import X.C001A;
import X.C01GW;
import X.C09JN;
import X.C0IJT;
import X.C0J1N;
import X.C1102070emj;
import X.C1102470enN;
import X.C1102480enO;
import X.C1113410f51;
import X.C11RD;
import X.C162100jj;
import X.C1697810uHb;
import X.C16F5;
import X.C245400xA;
import X.C245500xB;
import X.C292401Bi;
import X.C474500IjA;
import X.C500260Jjc;
import X.C755550TkP;
import X.C776250Uch;
import X.C782810UnH;
import X.EnumC1107830ew1;
import Y.ARunnableS117S0100000_17;
import android.animation.ObjectAnimator;
import android.os.Handler;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.chatroom.model.MsgNotifyControlReq;
import com.bytedance.android.livesdk.dataChannel.InputDialogShowingChannel;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenStatus;
import com.bytedance.android.livesdk.frequency.api.LiveNotifyMessageFrequencyApi;
import com.bytedance.android.livesdk.model.message.FeatureGuideMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.MsgNotifyRecord;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class ExtendedScreenGuideWidget extends LiveRecyclableWidget implements OnIMMessageListener {
    public FeatureGuideMessage LLILLJJLI;
    public ObjectAnimator LLILZ;
    public C1113410f51 LLILZIL;
    public final C01GW LL = C292401Bi.LIZ(new AwS561S0100000_17(this, 83));
    public final C01GW LLILLL = C292401Bi.LIZ(new AwS561S0100000_17(this, 84));
    public final C01GW LLILZLL = C292401Bi.LIZ(AFwS205S0000000_17.get$arr$(17));
    public final ARunnableS117S0100000_17 LLIZ = new ARunnableS117S0100000_17(this, 38);
    public final C01GW LLIZLLLIL = C292401Bi.LIZ(new AwS550S0100000_6(this, 17));

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.gzg;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final String messageListenerBizTag() {
        return "extended screen guide";
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void A1() {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null) {
            return;
        }
        FeatureGuideMessage featureGuideMessage = this.LLILLJJLI;
        if (featureGuideMessage != null) {
            C245500xB.LIZ.getClass();
            C1102070emj c1102070emj = C1102070emj.LIZ;
            C1102470enN c1102470enN = C1102470enN.LL;
            Map map = (Map) ((LinkedHashMap) C245500xB.LIZIZ).get(dataChannel);
            C245400xA c245400xA = map != null ? (C245400xA) map.get(featureGuideMessage) : null;
            c1102070emj.getClass();
            C1102070emj.LJIILLIIL(dataChannel, c1102470enN, c245400xA);
        }
        x1().removeCallbacks((Runnable) this.LLIZLLLIL.getValue());
        z1().setSelected(false);
        C500260Jjc.LJIILIIL(y1());
        this.dataChannel.SX0(C755550TkP.class, Boolean.FALSE);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        ObjectAnimator objectAnimator = this.LLILZ;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        IMessageManager iMessageManager = (IMessageManager) this.dataChannel.gg0(C776250Uch.class);
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener((OnIMMessageListener) this);
        }
        x1().removeCallbacksAndMessages(null);
        C245500xB c245500xB = C245500xB.LIZ;
        DataChannel dataChannel = this.dataChannel;
        c245500xB.getClass();
        if (dataChannel != null) {
            C245500xB.LIZIZ.remove(dataChannel);
        }
        this.LLILZIL = null;
    }

    public final Handler x1() {
        return (Handler) this.LLILZLL.getValue();
    }

    public final View y1() {
        return (View) this.LL.getValue();
    }

    public final C16F5 z1() {
        return (C16F5) this.LLILLL.getValue();
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final IMListenerType messageListenerType() {
        return IMListenerType.ASYNC;
    }

    public final void B1(boolean z) {
        String idStr;
        CommonMessageData commonMessageData;
        Text text;
        String str;
        String idStr2;
        LiveNotifyMessageFrequencyApi.LIZ.getClass();
        LiveNotifyMessageFrequencyApi liveNotifyMessageFrequencyApiLIZ = C782810UnH.LIZ();
        MsgNotifyControlReq msgNotifyControlReq = new MsgNotifyControlReq();
        int i = 1;
        MsgNotifyRecord[] msgNotifyRecordArr = new MsgNotifyRecord[1];
        MsgNotifyRecord msgNotifyRecord = new MsgNotifyRecord();
        Room roomLIZ = C162100jj.LIZ(this.dataChannel);
        String str2 = "";
        if (roomLIZ == null || (idStr = roomLIZ.getIdStr()) == null) {
            idStr = "";
        }
        msgNotifyRecord.roomId = idStr;
        msgNotifyRecord.ts = String.valueOf(System.currentTimeMillis() / 1000);
        msgNotifyRecord.componentType = 18;
        msgNotifyRecord.bizKey = EnumC1107830ew1.PUBLIC_SCREEN_FEATURE_GUIDE.getKey();
        msgNotifyRecord.position = "in_room";
        if (!z) {
            i = 2;
        }
        msgNotifyRecord.userAction = i;
        msgNotifyRecordArr[0] = msgNotifyRecord;
        msgNotifyControlReq.records = C1697810uHb.LJIILJJIL(msgNotifyRecordArr);
        Room roomLIZ2 = C162100jj.LIZ(this.dataChannel);
        if (roomLIZ2 != null && (idStr2 = roomLIZ2.getIdStr()) != null) {
            str2 = idStr2;
        }
        msgNotifyControlReq.roomId = str2;
        ((C0J1N) liveNotifyMessageFrequencyApiLIZ.reportMsgNotifyRecord(msgNotifyControlReq).LIZJ(C11RD.LJ(this))).LIZ(new C09JN() { // from class: X.00Ks
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("ExtendedScreenGuideWidget@f360.apiReport$2");
                C1C7U.LIZIZ("ExtendedScreenGuideWidget@f360.apiReport$2");
            }
        }, new C09JN() { // from class: X.00Kt
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("ExtendedScreenGuideWidget@f360.apiReport$3");
                C1C7U.LIZIZ("ExtendedScreenGuideWidget@f360.apiReport$3");
            }
        });
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_comment_view_insight");
        c474500IjALIZ.LJIJJLI(this.dataChannel);
        if (z) {
            c474500IjALIZ.LJJII("show", "action_type");
        } else {
            c474500IjALIZ.LJJII("click", "action_type");
        }
        FeatureGuideMessage featureGuideMessage = this.LLILLJJLI;
        if (featureGuideMessage != null && (commonMessageData = featureGuideMessage.baseMessage) != null && (text = commonMessageData.displayText) != null && (str = text.key) != null) {
            c474500IjALIZ.LJJII(str, "category_id");
        }
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        C1113410f51 c1113410f51;
        IMessageManager iMessageManager = (IMessageManager) this.dataChannel.gg0(C776250Uch.class);
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.FEATURE_GUIDE_MESSAGE.getIntType(), (OnIMMessageListener) this);
        }
        Object objGg0 = this.dataChannel.gg0(C1102480enO.class);
        if (objGg0 instanceof C1113410f51) {
            c1113410f51 = (C1113410f51) objGg0;
        } else {
            c1113410f51 = null;
        }
        this.LLILZIL = c1113410f51;
        DataChannel dataChannel = this.dataChannel;
        dataChannel.BQ2(this, LiveExtendedScreenStatus.class, new AwS596S0100000_17(this, 72));
        dataChannel.BQ2(this, InputDialogShowingChannel.class, new AwS596S0100000_17(this, 73));
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x009a, code lost:
    
        if (r7.LJII(r4.getMessageId(), r4.LLJLIL(), r11, false, true) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x009c, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0093  */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMessage(com.ss.ugc.live.sdk.message.data.IMessage r15) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.publicscreen.impl.widget.ExtendedScreenGuideWidget.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }
}
