package X;

import android.os.Looper;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.publicscreen.impl.caption.translate.CaptionViewModelV2;
import com.bytedance.android.livesdk.model.message.CaptionContent;
import com.bytedance.android.livesdk.model.message.CaptionMessage;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CtK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C327920CtK extends CaptionViewModelV2 {
    public final String LLJILJIL;
    public final LifecycleOwner LLJILJILJ;
    public final C327620Csq LLJILLL;
    public final Function1<? super C327630Csr, Unit> LLJJ;
    public final Function1<? super Boolean, Unit> LLJJI;
    public long LLJJIII;
    public C327630Csr LLJJIJI;
    public final BPEAHandler LLJJIJIIJIL;

    @Override // com.bytedance.android.live.publicscreen.impl.caption.translate.CaptionViewModelV2
    public final void LIZ(final CaptionMessage captionMessage) {
        List<CaptionContent> list = captionMessage.content;
        if (list != null) {
            for (final CaptionContent captionContent : list) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(captionContent.lang);
                sbLIZ.append(' ');
                sbLIZ.append(captionContent.content);
                C2188811AlT.LIZIZ(sbLIZ);
                if (Intrinsics.LJFF(captionContent.lang, this.LLJILJIL)) {
                    final long jLIZLLL = this.LLJILLL.LIZLLL();
                    long j = captionMessage.timestampMs + captionMessage.durationMs;
                    if (j < jLIZLLL) {
                        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LLJILJILJ), C0PEM.LIZ, null, new C327910CtJ(this, captionMessage, jLIZLLL, captionContent, null), 2);
                    } else {
                        C786410Ut5.LJLIIL(j - jLIZLLL, this.LLJJIJIIJIL, new Runnable() { // from class: X.0CtL
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("CaptionSplitViewModel@6bc6.captionMessageSchedule$1$1");
                                try {
                                    C327920CtK c327920CtK = this.LL;
                                    CaptionMessage captionMessage2 = captionMessage;
                                    CaptionContent captionContent2 = captionContent;
                                    C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(c327920CtK.LLJILJILJ), C0PEM.LIZ, null, new C327910CtJ(c327920CtK, captionMessage2, jLIZLLL, captionContent2, null), 2);
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("CaptionSplitViewModel@6bc6.captionMessageSchedule$1$1");
                            }
                        });
                    }
                }
            }
        }
    }

    public C327920CtK(DataChannel dataChannel, String str, LifecycleOwner lifecycleOwner, C327620Csq c327620Csq, AwS583S0100000_4 awS583S0100000_4, AwS583S0100000_4 awS583S0100000_42) {
        super(dataChannel, str, lifecycleOwner, c327620Csq, awS583S0100000_42);
        this.LLJILJIL = str;
        this.LLJILJILJ = lifecycleOwner;
        this.LLJILLL = c327620Csq;
        this.LLJJ = awS583S0100000_4;
        this.LLJJI = awS583S0100000_42;
        this.LLJJIJIIJIL = new BPEAHandler(Looper.getMainLooper());
        lifecycleOwner.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.bytedance.android.live.publicscreen.impl.caption.split.CaptionSplitViewModel$1$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_STOP) {
                    onStop();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
            public final void onStop() {
                this.LL.LLJJIJIIJIL.removeCallbacksAndMessages(null);
            }
        });
    }
}
