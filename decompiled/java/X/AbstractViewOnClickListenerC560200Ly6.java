package X;

import Y.ARunnableS108S0100000_8;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0Ly6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractViewOnClickListenerC560200Ly6 implements View.OnClickListener {
    public static boolean LLILZIL = true;
    public boolean LLILLL = true;
    public final ARunnableS108S0100000_8 LLILZ = new ARunnableS108S0100000_8(this, 109);
    public final int LL = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
    public final boolean LLILLJJLI = true;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        boolean z2 = this.LLILLJJLI;
        if (z2) {
            z = LLILZIL;
        } else {
            z = this.LLILLL;
        }
        if (z) {
            if (z2) {
                LLILZIL = false;
            } else {
                this.LLILLL = false;
            }
            HandlerHook.viewPostDelay(view, this.LLILZ, this.LL);
            ((C560190Ly5) this).LLILZLL.invoke();
        }
    }
}
