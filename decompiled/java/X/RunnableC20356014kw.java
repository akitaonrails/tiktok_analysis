package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.util.PlayEntityUtilKt;
import com.bytedance.android.livesdk.util.ShowSettingPageTimeOutRunnableKt$observeLifecycleEnd$1;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: renamed from: X.14kw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class RunnableC20356014kw implements Runnable {
    public final AbstractC20356314kz LL;
    public final C20361214lm LLILLJJLI;
    public InterfaceC20354714kj LLILLL;
    public LifecycleOwner LLILZ;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("ShowSettingPageTimeOutRunnable@56d4.run");
        try {
            PlayEntityUtilKt.LJI(this.LL, this.LLILLJJLI, this.LLILLL, EnumC979240bac.TIME_OUT, null, 0L, 48);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ShowSettingPageTimeOutRunnable@56d4.run");
    }

    public RunnableC20356014kw(AbstractC20356314kz abstractC20356314kz, C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, LifecycleOwner lifecycleOwner) {
        this.LL = abstractC20356314kz;
        this.LLILLJJLI = c20361214lm;
        this.LLILLL = interfaceC20354714kj;
        this.LLILZ = lifecycleOwner;
        if (lifecycleOwner != null) {
            AwS575S0100000_31 awS575S0100000_31 = new AwS575S0100000_31(this, 200);
            Lifecycle lifecycle = lifecycleOwner.getLifecycle();
            if (lifecycle != null) {
                lifecycle.addObserver(new ShowSettingPageTimeOutRunnableKt$observeLifecycleEnd$1(awS575S0100000_31));
            }
        }
    }
}
