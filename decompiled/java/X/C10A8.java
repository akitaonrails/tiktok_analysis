package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.subscription.preview.SubscriptionPreviewService;
import java.lang.ref.SoftReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10A8, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final /* synthetic */ class C10A8 implements Observer, InterfaceC1635506an {
    public final /* synthetic */ C10CC LL;

    public C10A8(C10CC c10cc) {
        this.LL = c10cc;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Observer) && (obj instanceof InterfaceC1635506an)) {
            return Intrinsics.LJFF(getFunctionDelegate(), ((InterfaceC1635506an) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // X.InterfaceC1635506an
    public final InterfaceC1451105m9<?> getFunctionDelegate() {
        return new C2217421BqW(1, this.LL, C10CC.class, "onSubPreviewAction", "onSubPreviewAction(Lcom/ss/android/ugc/aweme/subscription/preview/models/SubscriptionPublishPreviewAction;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        Fragment fragment;
        AbstractC1868600yj4 abstractC1868600yj4 = (AbstractC1868600yj4) obj;
        C10CC c10cc = this.LL;
        c10cc.getClass();
        Fragment fragmentLIZJ = null;
        if (abstractC1868600yj4 instanceof C1868590yj3) {
            C1868590yj3 c1868590yj3 = (C1868590yj3) abstractC1868600yj4;
            VideoPublishEditModel videoPublishEditModel = c1868590yj3.LIZIZ;
            if (videoPublishEditModel != null) {
                C10FW c10fw = new C10FW(new C1463620oBs(videoPublishEditModel), new C1868070yiD(c1868590yj3.LIZIZ), c1868590yj3.LIZ);
                SubscriptionPreviewService subscriptionPreviewService = (SubscriptionPreviewService) c10cc.LJIIIIZZ.getValue();
                if (subscriptionPreviewService != null) {
                    fragmentLIZJ = subscriptionPreviewService.LIZLLL(C20622515mp.LJIIJ(c10cc.LIZ), c10fw);
                }
                c10cc.LJIIIZ = new SoftReference<>(fragmentLIZJ);
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
            SubscriptionPreviewService subscriptionPreviewService2 = (SubscriptionPreviewService) c10cc.LJIIIIZZ.getValue();
            if (subscriptionPreviewService2 != null) {
                fragmentLIZJ = subscriptionPreviewService2.LIZJ(C20622515mp.LJIIJ(c10cc.LIZ), c19201510Ab, C497820Jfg.LIZ(c10cc.LIZ.getContext()));
            }
            c10cc.LJIIIZ = new SoftReference<>(fragmentLIZJ);
            return;
        }
        if (Intrinsics.LJFF(abstractC1868600yj4, C1868610yj5.LIZ)) {
            SoftReference<Fragment> softReference = c10cc.LJIIIZ;
            if (softReference == null || (fragment = softReference.get()) == null) {
                return;
            }
            String str = TuxSheet._pnsPageId;
            C1391190mJ3.LJFF(fragment, C343970De7.LIZ);
            return;
        }
        throw new C1954807lC();
    }
}
