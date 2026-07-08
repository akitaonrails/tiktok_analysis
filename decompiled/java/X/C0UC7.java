package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AFwS245S0000000_12;

/* JADX INFO: renamed from: X.0UC7, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UC7 implements Runnable {
    public DataChannel LL;
    public LiveEffect LLILLJJLI;
    public String LLILLL = "";
    public int LLILZ;
    public C0UCE LLILZIL;

    public final void LIZ() {
        LiveEffect liveEffect = this.LLILLJJLI;
        if (liveEffect != null) {
            C0UC5 c0uc5 = C0UC5.LIZ;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_guest_connection_sticker_effective_use");
            c474500IjALIZ.LJIJJLI(this.LL);
            C0UC5.LJIIL(c474500IjALIZ, liveEffect, this.LL);
            c474500IjALIZ.LJJI(false);
            C0UC5.LJIIJJI(c474500IjALIZ, liveEffect, this.LLILZIL);
            AFwS245S0000000_12 aFwS245S0000000_12 = AFwS245S0000000_12.get$arr$(98);
            InterfaceC474510IjB interfaceC474510IjB = c474500IjALIZ.LIZ;
            if (interfaceC474510IjB != null) {
                interfaceC474510IjB.LJIIJJI(aFwS245S0000000_12);
            }
            c474500IjALIZ.LJJII(Integer.valueOf(this.LLILZ), "is_connection_default");
            c474500IjALIZ.LJJII(this.LLILLL, "event_page");
            c474500IjALIZ.LJJIJL();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("LiveMultiGuestStickerLogManager$ReportStickerEffectUseRunnable@da71.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveMultiGuestStickerLogManager$ReportStickerEffectUseRunnable@da71.run");
    }
}
