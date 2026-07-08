package com.bytedance.android.live.publicscreen.impl.caption.translate;

import X.C001A;
import X.C0PEM;
import X.C1DEV;
import X.C20337914i1;
import X.C2191201ApK;
import X.C23250099c;
import X.C327620Csq;
import X.C327900CtI;
import X.C500260Jjc;
import X.C776250Uch;
import X.InterfaceC1106030et7;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.MultiLiveRTCLayoutChannel;
import com.bytedance.android.live.room.SeiEvent;
import com.bytedance.android.livesdk.dataChannel.CaptionStateEvent;
import com.bytedance.android.livesdk.model.message.CaptionContent;
import com.bytedance.android.livesdk.model.message.CaptionMessage;
import com.bytedance.android.livesdkapi.depend.model.live.CaptionInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public class CaptionViewModelV2 implements OnMessageListener {
    public final DataChannel LL;
    public final String LLILLJJLI;
    public final LifecycleOwner LLILLL;
    public final C327620Csq LLILZ;
    public final Function1<? super Boolean, Unit> LLILZIL;
    public final IMessageManager LLILZLL;
    public final CaptionInfo LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public final C1DEV LLJIJIL;

    public void LIZ(CaptionMessage captionMessage) {
        List<CaptionContent> list;
        if (captionMessage.definite && (list = captionMessage.content) != null) {
            for (CaptionContent captionContent : list) {
                if (Intrinsics.LJFF(captionContent.lang, this.LLILLJJLI)) {
                    C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LLILLL), C0PEM.LIZ, null, new C327900CtI(this, captionMessage, this.LLILZ.LIZLLL(), captionContent, null), 2);
                }
            }
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        CaptionInfo captionInfo;
        if (iMessage instanceof CaptionMessage) {
            CaptionMessage captionMessage = (CaptionMessage) iMessage;
            if (captionMessage.durationMs == -1) {
                C20337914i1<Boolean> c20337914i1 = InterfaceC1106030et7.u6;
                if (!c20337914i1.LIZIZ().booleanValue()) {
                    Boolean bool = Boolean.TRUE;
                    c20337914i1.LJFF(bool);
                    this.LL.LC0(CaptionStateEvent.class, Boolean.FALSE);
                    Function1<? super Boolean, Unit> function1 = this.LLILZIL;
                    if (function1 != null) {
                        function1.invoke(bool);
                        return;
                    }
                    return;
                }
            }
            if (!this.LLIZLLLIL || this.LLJ || this.LLJI || !InterfaceC1106030et7.r6.LIZIZ().booleanValue() || (captionInfo = this.LLIZ) == null || !captionInfo.open || InterfaceC1106030et7.u6.LIZIZ().booleanValue()) {
                return;
            }
            LIZ(captionMessage);
        }
    }

    public CaptionViewModelV2(DataChannel dataChannel, String str, LifecycleOwner lifecycleOwner, C327620Csq c327620Csq, Function1<? super Boolean, Unit> function1) {
        CaptionInfo captionInfo;
        this.LL = dataChannel;
        this.LLILLJJLI = str;
        this.LLILLL = lifecycleOwner;
        this.LLILZ = c327620Csq;
        this.LLILZIL = function1;
        this.LLILZLL = (IMessageManager) dataChannel.gg0(C776250Uch.class);
        Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel);
        if (roomLJJLIIIIJ != null) {
            captionInfo = roomLJJLIIIIJ.captionInfo;
        } else {
            captionInfo = null;
        }
        this.LLIZ = captionInfo;
        this.LLIZLLLIL = true;
        C1DEV c1devLIZ = C2191201ApK.LIZ();
        this.LLJIJIL = c1devLIZ;
        c327620Csq.LJIILJJIL = c1devLIZ;
        lifecycleOwner.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.bytedance.android.live.publicscreen.impl.caption.translate.CaptionViewModelV2$1$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_RESUME) {
                    onResume();
                } else if (event == Lifecycle.Event.ON_STOP) {
                    onStop();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
            public final void onResume() {
                IMessageManager iMessageManager = this.LL.LLILZLL;
                if (iMessageManager != null) {
                    iMessageManager.addMessageListener(C001A.CAPTION_MESSAGE.getIntType(), this);
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
            public final void onStop() {
                IMessageManager iMessageManager = this.LL.LLILZLL;
                if (iMessageManager != null) {
                    iMessageManager.removeMessageListener(this);
                }
            }
        });
        dataChannel.BQ2(lifecycleOwner, SeiEvent.class, new AwS583S0100000_4(this, 34));
        dataChannel.BQ2(lifecycleOwner, LinkCrossRoomStateChangeEvent.class, new AwS583S0100000_4(this, 35));
        dataChannel.EQ2(lifecycleOwner, MultiLiveRTCLayoutChannel.class, new AwS583S0100000_4(this, 36));
    }
}
