package com.bytedance.android.live.publicscreen.impl.caption;

import X.C001A;
import X.C20441214yg;
import X.C2188811AlT;
import X.C23250099c;
import X.C327790Ct7;
import X.C327810Ct9;
import X.C500260Jjc;
import X.C776250Uch;
import X.InterfaceC1106030et7;
import android.os.SystemClock;
import android.text.TextPaint;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.live.room.SeiEvent;
import com.bytedance.android.livesdk.model.message.CaptionContent;
import com.bytedance.android.livesdk.model.message.CaptionMessage;
import com.bytedance.android.livesdkapi.depend.model.live.CaptionInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.List;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class CaptionViewModel implements OnMessageListener {
    public final TextPaint LL;
    public final float LLILLJJLI;
    public final String LLILLL;
    public final LifecycleOwner LLILZ;
    public final MutableLiveData<C327810Ct9> LLILZIL = new MutableLiveData<>();
    public final IMessageManager LLILZLL;
    public final CaptionInfo LLIZ;
    public boolean LLIZLLLIL;
    public final boolean LLJ;
    public volatile long LLJI;
    public volatile long LLJIJIL;

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        CaptionMessage captionMessage;
        List<CaptionContent> list;
        if ((iMessage instanceof CaptionMessage) && this.LLIZLLLIL && this.LLJ && InterfaceC1106030et7.r6.LIZIZ().booleanValue() && (list = (captionMessage = (CaptionMessage) iMessage).content) != null) {
            for (CaptionContent captionContent : list) {
                if (Intrinsics.LJFF(captionContent.lang, this.LLILLL)) {
                    C327810Ct9 c327810Ct9 = new C327810Ct9(captionContent.content, captionMessage.timestampMs, captionMessage.durationMs, this.LLJI + (SystemClock.elapsedRealtime() - this.LLJIJIL));
                    CaptionInfo captionInfo = this.LLIZ;
                    if (captionInfo != null && captionInfo.open) {
                        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LLILZ), null, null, new C327790Ct7(this, c327810Ct9, null), 3);
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("key: ");
                    sbLIZ.append(this.LLILLL);
                    sbLIZ.append(" + \n + value: ");
                    sbLIZ.append(captionContent.content);
                    sbLIZ.append("+\n+ timestampMs: ");
                    sbLIZ.append(captionMessage.timestampMs);
                    sbLIZ.append("+\n+ durationMs: ");
                    sbLIZ.append(captionMessage.durationMs);
                    sbLIZ.append('+');
                    C20441214yg.LIZIZ("CaptionViewModel", C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        }
    }

    public CaptionViewModel(TextPaint textPaint, float f, DataChannel dataChannel, String str, LifecycleOwner lifecycleOwner) {
        CaptionInfo captionInfo;
        this.LL = textPaint;
        this.LLILLJJLI = f;
        this.LLILLL = str;
        this.LLILZ = lifecycleOwner;
        this.LLILZLL = (IMessageManager) dataChannel.gg0(C776250Uch.class);
        Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel);
        if (roomLJJLIIIIJ != null) {
            captionInfo = roomLJJLIIIIJ.captionInfo;
        } else {
            captionInfo = null;
        }
        this.LLIZ = captionInfo;
        this.LLIZLLLIL = true;
        this.LLJ = true;
        lifecycleOwner.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.bytedance.android.live.publicscreen.impl.caption.CaptionViewModel$1$1
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
        dataChannel.BQ2(lifecycleOwner, SeiEvent.class, new AwS583S0100000_4(this, 27));
        dataChannel.BQ2(lifecycleOwner, LinkCrossRoomStateChangeEvent.class, new AwS583S0100000_4(this, 28));
    }
}
