package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0U7S, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U7S implements Runnable {
    public final DataChannel LL;
    public final boolean LLILLJJLI;
    public final LiveEffect LLILLL;
    public final float LLILZ;
    public final boolean LLILZIL;
    public final boolean LLILZLL;

    public final void LIZ() {
        C0U7R c0u7r = C0U7R.LIZ;
        String strLJLL = this.LLILLL.LJLL();
        if (strLJLL != null) {
            C0U7R.LJIIJ.add(strLJLL);
        }
        C0U7R c0u7r2 = C0U7R.LIZ;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_take_beauty_effective_use");
        c474500IjALIZ.LJIJJLI(this.LL);
        Integer numValueOf = C0U7R.LJIILLIIL.get(this.LLILLL.getResourceId());
        if (numValueOf == null) {
            LiveEffect.ComposerConfig composerConfigLJIIJ = C0U7C.LJIIJ(this.LLILLL);
            Integer numValueOf2 = composerConfigLJIIJ != null ? Integer.valueOf(composerConfigLJIIJ.LIZ) : null;
            LiveEffect.ComposerConfig composerConfigLJIIJ2 = C0U7C.LJIIJ(this.LLILLL);
            numValueOf = Integer.valueOf(Intrinsics.LJFF(numValueOf2, composerConfigLJIIJ2 != null ? Integer.valueOf(composerConfigLJIIJ2.LIZIZ) : null) ? 1 : 0);
        }
        c474500IjALIZ.LJJII(numValueOf, "is_default_value");
        c474500IjALIZ.LJJII(Integer.valueOf(this.LLILLJJLI ? 1 : 0), "is_live_take_default");
        c474500IjALIZ.LJJIFFI(Float.valueOf(this.LLILZ), "beauty_value");
        c474500IjALIZ.LJJII(this.LLILZIL ? "makeup" : "normal", "beauty_status");
        String strLIZ = InterfaceC766480U4w.LJJJJZI.LIZ();
        if (strLIZ == null) {
            strLIZ = EnumC770010UIl.DEFAULT.value;
        }
        c474500IjALIZ.LJJII(strLIZ, "detect_type");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(this.LLILZLL)) ? 1 : 0), "is_red_dot");
        C0U7R.LJIIIZ(c474500IjALIZ, this.LLILLL);
        c474500IjALIZ.LIZ();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("LiveBeautyLogManager$ReportBeautyEffectiveUseRunnable@97e2.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveBeautyLogManager$ReportBeautyEffectiveUseRunnable@97e2.run");
    }

    public C0U7S(DataChannel dataChannel, boolean z, LiveEffect liveEffect, float f, boolean z2, boolean z3) {
        this.LL = dataChannel;
        this.LLILLJJLI = z;
        this.LLILLL = liveEffect;
        this.LLILZ = f;
        this.LLILZIL = z2;
        this.LLILZLL = z3;
    }
}
