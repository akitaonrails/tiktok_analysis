package X;

import android.os.Looper;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicPlaybookAutoRunTechSwitchSetting;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bHF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC967230bHF<T> {
    public final AtomicBoolean LIZ = new AtomicBoolean(false);
    public volatile List<? extends T> LIZIZ = C13BV.INSTANCE;

    public void LIZIZ() {
    }

    public abstract List<T> LIZJ();

    public final void LJ() {
        if (Intrinsics.LJFF(C969310bKb.LIZLLL.LIZIZ, Looper.myLooper())) {
            LIZLLL(LIZJ());
        } else if (this.LIZ.compareAndSet(false, true)) {
            C965900bF6.LIZ(new C967470bHd(this));
        }
    }

    public final List<T> LIZ(boolean z) {
        if (z && !this.LIZ.get()) {
            LJ();
        }
        return this.LIZIZ;
    }

    public final void LIZLLL(List<? extends T> list) {
        this.LIZIZ = list;
        if (LinkMicPlaybookAutoRunTechSwitchSetting.INSTANCE.isEnable()) {
            LIZIZ();
        }
    }
}
