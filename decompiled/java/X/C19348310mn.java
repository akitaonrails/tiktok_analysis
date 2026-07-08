package X;

import android.os.Looper;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.main.MainSAFLifecycleCheckSetting;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import java.util.Random;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10mn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19348310mn extends AbstractC1563340qmi {
    public final LifecycleOwner LLILZIL;
    public final BPEAHandler LLILZLL;

    @Override // X.AbstractC1563340qmi, X.InterfaceC1563360qmk
    public final boolean LIZIZ() {
        SAFHelper.LIZ.getClass();
        return SAFHelper.LJIIJ() && ((MainSAFLifecycleCheckSetting.MetaData) MainSAFLifecycleCheckSetting.LIZIZ.getValue()).enableSAFCheck;
    }

    @Override // X.AbstractC1563340qmi
    public final boolean LJII() {
        SAFHelper.LIZ.getClass();
        if (!SAFHelper.LJIIJ()) {
            return false;
        }
        C01GW c01gw = MainSAFLifecycleCheckSetting.LIZIZ;
        if (!((MainSAFLifecycleCheckSetting.MetaData) c01gw.getValue()).enableSAFCheck || ((MainSAFLifecycleCheckSetting.MetaData) c01gw.getValue()).crashRatio <= 0.0f) {
            return false;
        }
        return ((MainSAFLifecycleCheckSetting.MetaData) c01gw.getValue()).crashRatio >= 1.0f || ((Random) MainSAFLifecycleCheckSetting.LIZJ.getValue()).nextFloat() < ((MainSAFLifecycleCheckSetting.MetaData) c01gw.getValue()).crashRatio;
    }

    public C19348310mn(LifecycleOwner lifecycleOwner) {
        super(lifecycleOwner);
        this.LLILZIL = lifecycleOwner;
        this.LLILZLL = new BPEAHandler(Looper.getMainLooper());
    }

    public final void LJIIJ(Runnable runnable) {
        if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            runnable.run();
        } else {
            C786410Ut5.LJJZZIII(this.LLILZLL, runnable);
            C1AF0.LJFF(new IllegalAccessError("should be in main thread"), "should call in main thread");
        }
    }

    @Override // androidx.lifecycle.LifecycleRegistry, androidx.lifecycle.Lifecycle
    public final void addObserver(final LifecycleObserver lifecycleObserver) {
        LJIIJ(new Runnable() { // from class: X.10mX
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("MainLifecycleRegistryWrapper@d39c.addObserver$1");
                try {
                    super/*androidx.lifecycle.LifecycleRegistry*/.addObserver(lifecycleObserver);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("MainLifecycleRegistryWrapper@d39c.addObserver$1");
            }
        });
    }

    @Override // androidx.lifecycle.LifecycleRegistry, androidx.lifecycle.Lifecycle
    public final void removeObserver(final LifecycleObserver lifecycleObserver) {
        LJIIJ(new Runnable() { // from class: X.10mY
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("MainLifecycleRegistryWrapper@d39c.removeObserver$1");
                try {
                    super/*androidx.lifecycle.LifecycleRegistry*/.removeObserver(lifecycleObserver);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("MainLifecycleRegistryWrapper@d39c.removeObserver$1");
            }
        });
    }
}
