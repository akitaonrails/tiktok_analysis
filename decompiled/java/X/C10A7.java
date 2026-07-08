package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.subscription.preview.PublishSubscriptionPreviewVideoPlayerFactory;
import com.ss.android.ugc.aweme.subscription.preview.SubscriptionPreviewService;
import java.lang.ref.SoftReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10A7, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final /* synthetic */ class C10A7 implements Observer, InterfaceC1635506an {
    public final /* synthetic */ C10BU LL;

    public C10A7(C10BU c10bu) {
        this.LL = c10bu;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Observer) && (obj instanceof InterfaceC1635506an)) {
            return Intrinsics.LJFF(getFunctionDelegate(), ((InterfaceC1635506an) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // X.InterfaceC1635506an
    public final InterfaceC1451105m9<?> getFunctionDelegate() {
        return new C2217421BqW(1, this.LL, C10BU.class, "onSubPreviewModalAction", "onSubPreviewModalAction(Lcom/ss/android/ugc/aweme/subscription/preview/models/SubscriptionPublishPreviewAction;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        Fragment fragment;
        FragmentManager supportFragmentManager;
        PublishSubscriptionPreviewVideoPlayerFactory publishSubscriptionPreviewVideoPlayerFactory;
        C1463620oBs c1463620oBsLIZ;
        FragmentManager supportFragmentManager2;
        AbstractC1868600yj4 abstractC1868600yj4 = (AbstractC1868600yj4) obj;
        C10BU c10bu = this.LL;
        c10bu.getClass();
        Fragment fragmentLIZJ = null;
        if (abstractC1868600yj4 instanceof C1868590yj3) {
            C1868590yj3 c1868590yj3 = (C1868590yj3) abstractC1868600yj4;
            VideoPublishEditModel videoPublishEditModel = c1868590yj3.LIZIZ;
            if (videoPublishEditModel != null && (publishSubscriptionPreviewVideoPlayerFactory = (PublishSubscriptionPreviewVideoPlayerFactory) c10bu.LLJILLL.getValue()) != null && (c1463620oBsLIZ = publishSubscriptionPreviewVideoPlayerFactory.LIZ(videoPublishEditModel)) != null) {
                C10FW c10fw = new C10FW(c1463620oBsLIZ, new C1868070yiD(videoPublishEditModel), c1868590yj3.LIZ);
                C19EG c19egLIZIZ = C1388190mED.LIZIZ(c10bu.LLILLJJLI.LIZ);
                if (c19egLIZIZ != null && (supportFragmentManager2 = c19egLIZIZ.getSupportFragmentManager()) != null) {
                    SubscriptionPreviewService subscriptionPreviewService = (SubscriptionPreviewService) c10bu.LLJILJILJ.getValue();
                    if (subscriptionPreviewService != null) {
                        fragmentLIZJ = subscriptionPreviewService.LIZLLL(supportFragmentManager2, c10fw);
                    }
                    c10bu.LLJJ = new SoftReference<>(fragmentLIZJ);
                    return;
                }
                return;
            }
            return;
        }
        if (abstractC1868600yj4 instanceof C1868580yj2) {
            C1868580yj2 c1868580yj2 = (C1868580yj2) abstractC1868600yj4;
            VideoPublishEditModel videoPublishEditModel2 = c1868580yj2.LIZIZ;
            if (videoPublishEditModel2 == null) {
                return;
            }
            C19201510Ab c19201510Ab = new C19201510Ab(new C1868080yiE(videoPublishEditModel2), c1868580yj2.LIZ);
            Context context = c10bu.LLILLJJLI.LIZ;
            C19EG c19egLIZIZ2 = C1388190mED.LIZIZ(context);
            if (c19egLIZIZ2 == null || (supportFragmentManager = c19egLIZIZ2.getSupportFragmentManager()) == null) {
                return;
            }
            SubscriptionPreviewService subscriptionPreviewService2 = (SubscriptionPreviewService) c10bu.LLJILJILJ.getValue();
            if (subscriptionPreviewService2 != null) {
                fragmentLIZJ = subscriptionPreviewService2.LIZJ(supportFragmentManager, c19201510Ab, C497820Jfg.LIZ(context));
            }
            c10bu.LLJJ = new SoftReference<>(fragmentLIZJ);
            return;
        }
        if (Intrinsics.LJFF(abstractC1868600yj4, C1868610yj5.LIZ)) {
            SoftReference<Fragment> softReference = c10bu.LLJJ;
            if (softReference != null && (fragment = softReference.get()) != null) {
                String str = TuxSheet._pnsPageId;
                C1391190mJ3.LJFF(fragment, C343970De7.LIZ);
            }
            c10bu.LLJJ = null;
            c10bu.LJIL();
            return;
        }
        throw new C1954807lC();
    }
}
