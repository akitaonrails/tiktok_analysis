package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UD6, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UD6 implements Runnable {
    public final DataChannel LL;
    public final LiveEffect LLILLJJLI;
    public final float LLILLL;
    public final int LLILZ;

    public final void LIZ() {
        C0UD7 c0ud7 = C0UD7.LIZ;
        String strLJLL = this.LLILLJJLI.LJLL();
        if (strLJLL != null) {
            C0UD7.LJIIIZ.add(strLJLL);
        }
        C0UD7 c0ud72 = C0UD7.LIZ;
        C0UD7.LJIIIIZZ("ReportBeautyEffectiveUseRunnable", "report effective use");
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_guest_connection_beauty_effective_use");
        c474500IjALIZ.LJIJJLI(this.LL);
        LiveEffect.ComposerConfig composerConfigLJIIJ = C0U7C.LJIIJ(this.LLILLJJLI);
        Integer numValueOf = composerConfigLJIIJ != null ? Integer.valueOf(composerConfigLJIIJ.LIZ) : null;
        LiveEffect.ComposerConfig composerConfigLJIIJ2 = C0U7C.LJIIJ(this.LLILLJJLI);
        c474500IjALIZ.LJJII(Integer.valueOf(Intrinsics.LJFF(numValueOf, composerConfigLJIIJ2 != null ? Integer.valueOf(composerConfigLJIIJ2.LIZIZ) : null) ? 1 : 0), "is_default_value");
        c474500IjALIZ.LJJII(Integer.valueOf(this.LLILZ), "event_scene");
        c474500IjALIZ.LJJIFFI(Float.valueOf(this.LLILLL), "beauty_value");
        c474500IjALIZ.LJJIIZI(C0UD7.LJIIJJI);
        C767250U7v.LJIIJ(c474500IjALIZ, this.LLILLJJLI);
        AFwS245S0000000_12 aFwS245S0000000_12 = AFwS245S0000000_12.get$arr$(96);
        InterfaceC474510IjB interfaceC474510IjB = c474500IjALIZ.LIZ;
        if (interfaceC474510IjB != null) {
            interfaceC474510IjB.LJIIJJI(aFwS245S0000000_12);
        }
        c474500IjALIZ.LIZ();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("LiveMultiGuestBeautyLogManager$ReportBeautyEffectiveUseRunnable@616b.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveMultiGuestBeautyLogManager$ReportBeautyEffectiveUseRunnable@616b.run");
    }

    public C0UD6(DataChannel dataChannel, LiveEffect liveEffect, float f, int i) {
        this.LL = dataChannel;
        this.LLILLJJLI = liveEffect;
        this.LLILLL = f;
        this.LLILZ = i;
    }
}
