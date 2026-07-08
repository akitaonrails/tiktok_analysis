package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;

/* JADX INFO: renamed from: X.0muc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1414480muc {
    public final long LIZ = C0C64.LJIILLIIL().LJIJJLI(31744, 2000, "studio_ai_alive_apply_template_duration_threshold", true);
    public PthreadTimer LIZIZ;

    public final void LIZ() {
        C201955140j.LIZJ(C0L76.LIZIZ, "MixEditingMaterialAiAliveComponent -> TimeoutHandler -> onSuccess");
        PthreadTimer pthreadTimer = this.LIZIZ;
        if (pthreadTimer != null) {
            pthreadTimer.cancel();
        }
        this.LIZIZ = null;
    }
}
