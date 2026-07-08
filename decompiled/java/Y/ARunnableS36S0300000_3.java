package Y;

import X.AbstractC1168350gVd;
import X.C098200Yq;
import X.C1851940yIC;
import X.C189200o6;
import X.C19EG;
import X.C1C7U;
import X.C2135608Yg;
import X.C23250099c;
import X.C2360309Mr;
import X.InterfaceC2038907yl;
import X.InterfaceC2135708Yh;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.commonalbum.viewmodel.LocalServiceAlbumVM;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.InboxGroupChatSocialStatusViewModelImpl;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes4.dex */
public class ARunnableS36S0300000_3 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                run$11(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                run$12(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        Object c098200Yq;
        InterfaceC2038907yl interfaceC2038907yl = (InterfaceC2038907yl) this.l0;
        C1851940yIC c1851940yIC = (C1851940yIC) this.l1;
        try {
            interfaceC2038907yl.onVolumeUpdate(c1851940yIC.LIZ, (JSONArray) this.l2);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }

    public static final void run$0(ARunnableS36S0300000_3 aRunnableS36S0300000_3) {
        boolean zLIZ;
        C1C7U.LIZ("BulletinDCStoreKt@e026.onMainThreadBlocking$1");
        try {
            ((AtomicReference) aRunnableS36S0300000_3.l0).set(((Function0) aRunnableS36S0300000_3.l1).invoke());
            ((CountDownLatch) aRunnableS36S0300000_3.l2).countDown();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BulletinDCStoreKt@e026.onMainThreadBlocking$1");
    }

    public static final void run$1(ARunnableS36S0300000_3 aRunnableS36S0300000_3) {
        boolean zLIZ;
        C1C7U.LIZ("InboxGroupChatSocialStatusViewModelImpl@9cd5.preloadVisibleGroupStoryDetail$1$preloadAction$1");
        try {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope((InboxGroupChatSocialStatusViewModelImpl) aRunnableS36S0300000_3.l0), null, null, new C2135608Yg((List) aRunnableS36S0300000_3.l1, (InterfaceC2135708Yh) aRunnableS36S0300000_3.l2, null), 3);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InboxGroupChatSocialStatusViewModelImpl@9cd5.preloadVisibleGroupStoryDetail$1$preloadAction$1");
    }

    public static final void run$10(ARunnableS36S0300000_3 aRunnableS36S0300000_3) {
        boolean zLIZ;
        C1C7U.LIZ("EcClickSearchDataExecutorKt@fb7b.observeOnMainThreadPost$1");
        try {
            ((LiveData) aRunnableS36S0300000_3.l0).observe((LifecycleOwner) aRunnableS36S0300000_3.l1, (Observer) aRunnableS36S0300000_3.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EcClickSearchDataExecutorKt@fb7b.observeOnMainThreadPost$1");
    }

    public static final void run$11(ARunnableS36S0300000_3 aRunnableS36S0300000_3) {
        Runnable runnable = (Runnable) aRunnableS36S0300000_3.l0;
        boolean[] zArr = (boolean[]) aRunnableS36S0300000_3.l1;
        Object obj = aRunnableS36S0300000_3.l2;
        C1C7U.LIZ("CameraCaptureManager@b43e.postAndWait$1L");
        runnable.run();
        zArr[0] = true;
        synchronized (obj) {
            try {
                obj.notify();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C1C7U.LIZIZ("CameraCaptureManager@b43e.postAndWait$1L");
    }

    public static final void run$12(ARunnableS36S0300000_3 aRunnableS36S0300000_3) {
        boolean zLIZ;
        C1C7U.LIZ("LocalServiceAlbumVM@35d7.checkBase64AndDoResult$1$2");
        try {
            Function1<? super C2360309Mr, Unit> function1 = ((LocalServiceAlbumVM) aRunnableS36S0300000_3.l0).LLILZ;
            if (function1 != null) {
                function1.invoke(new C2360309Mr(true, null, (ArrayList) aRunnableS36S0300000_3.l1));
            }
            Function0 function0 = (Function0) aRunnableS36S0300000_3.l2;
            if (function0 != null) {
                function0.invoke();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LocalServiceAlbumVM@35d7.checkBase64AndDoResult$1$2");
    }

    public static final void run$2(ARunnableS36S0300000_3 aRunnableS36S0300000_3) {
        boolean zLIZ;
        C1C7U.LIZ("MutableLiveDataExtKt@48f5.threadSoftObserve$1");
        try {
            ((LiveData) aRunnableS36S0300000_3.l0).observe((LifecycleOwner) aRunnableS36S0300000_3.l1, (Observer) aRunnableS36S0300000_3.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MutableLiveDataExtKt@48f5.threadSoftObserve$1");
    }

    public static final void run$3(ARunnableS36S0300000_3 aRunnableS36S0300000_3) {
        boolean zLIZ;
        C1C7U.LIZ("EcClickRecommendDataExecutorKt@c095.observeOnMainThread$1");
        try {
            ((LiveData) aRunnableS36S0300000_3.l0).observe((LifecycleOwner) aRunnableS36S0300000_3.l1, (Observer) aRunnableS36S0300000_3.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EcClickRecommendDataExecutorKt@c095.observeOnMainThread$1");
    }

    public static final void run$4(ARunnableS36S0300000_3 aRunnableS36S0300000_3) {
        boolean zLIZ;
        C1C7U.LIZ("EcClickRecommendDataExecutorKt@c095.observeOnMainThread$2");
        try {
            ((LiveData) aRunnableS36S0300000_3.l0).observe((LifecycleOwner) aRunnableS36S0300000_3.l1, (Observer) aRunnableS36S0300000_3.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EcClickRecommendDataExecutorKt@c095.observeOnMainThread$2");
    }

    public static final void run$5(ARunnableS36S0300000_3 aRunnableS36S0300000_3) {
        boolean zLIZ;
        C1C7U.LIZ("EcClickRecommendDataExecutorKt@c095.observeOnMainThreadPost$1");
        try {
            ((LiveData) aRunnableS36S0300000_3.l0).observe((LifecycleOwner) aRunnableS36S0300000_3.l1, (Observer) aRunnableS36S0300000_3.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EcClickRecommendDataExecutorKt@c095.observeOnMainThreadPost$1");
    }

    public static final void run$6(ARunnableS36S0300000_3 aRunnableS36S0300000_3) {
        boolean zLIZ;
        C1C7U.LIZ("EcSearchAsrSessionManager@e403.notifyVolumeUpdate$1");
        try {
            aRunnableS36S0300000_3.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EcSearchAsrSessionManager@e403.notifyVolumeUpdate$1");
    }

    public static final void run$7(ARunnableS36S0300000_3 aRunnableS36S0300000_3) {
        boolean zLIZ;
        C1C7U.LIZ("BaseRecUserPopup@a0a6.init$1");
        try {
            ((AbstractC1168350gVd) aRunnableS36S0300000_3.l0).LIZ((C19EG) aRunnableS36S0300000_3.l1, (Bundle) aRunnableS36S0300000_3.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BaseRecUserPopup@a0a6.init$1");
    }

    public static final void run$8(ARunnableS36S0300000_3 aRunnableS36S0300000_3) {
        boolean zLIZ;
        C1C7U.LIZ("EcClickSearchDataExecutorKt@fb7b.observeOnMainThread$1");
        try {
            ((LiveData) aRunnableS36S0300000_3.l0).observe((LifecycleOwner) aRunnableS36S0300000_3.l1, (Observer) aRunnableS36S0300000_3.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EcClickSearchDataExecutorKt@fb7b.observeOnMainThread$1");
    }

    public static final void run$9(ARunnableS36S0300000_3 aRunnableS36S0300000_3) {
        boolean zLIZ;
        C1C7U.LIZ("EcClickSearchDataExecutorKt@fb7b.observeOnMainThread$2");
        try {
            ((LiveData) aRunnableS36S0300000_3.l0).observe((LifecycleOwner) aRunnableS36S0300000_3.l1, (Observer) aRunnableS36S0300000_3.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EcClickSearchDataExecutorKt@fb7b.observeOnMainThread$2");
    }

    public ARunnableS36S0300000_3(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
