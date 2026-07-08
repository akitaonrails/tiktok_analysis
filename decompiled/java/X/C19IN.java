package X;

import Y.ARunnableS132S0100000_32;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.19IN, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public abstract class C19IN implements View.OnClickListener {
    public static boolean LLILZIL = true;
    public final int LL;
    public final boolean LLILLJJLI;
    public boolean LLILLL;
    public final ARunnableS132S0100000_32 LLILZ;

    public C19IN() {
        this(0, 3);
    }

    public abstract void LIZ(View view);

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
            LIZ(view);
        }
    }

    public C19IN(int i, boolean z) {
        this.LLILLL = true;
        this.LLILZ = new ARunnableS132S0100000_32(this, 62);
        this.LL = i;
        this.LLILLJJLI = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C19IN(int i, int i2) {
        boolean z;
        i = (i2 & 1) != 0 ? DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL : i;
        if ((i2 & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        this(i, z);
    }
}
