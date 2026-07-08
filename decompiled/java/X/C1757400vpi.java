package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.communication.ISeaPdpCommunicationService;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.ui.SeaPdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0vpi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1757400vpi {
    public final WeakReference<SeaPdpFragment> LIZ;
    public final WeakReference<View> LIZIZ;
    public final WeakReference<SeaPdpViewModel> LIZJ;
    public final WeakReference<ISeaPdpCommunicationService> LIZLLL;
    public final WeakReference<C1755820vnA> LJ;

    public final ISeaPdpCommunicationService LIZ() {
        return this.LIZLLL.get();
    }

    public final SeaPdpViewModel LIZIZ() {
        return this.LIZJ.get();
    }

    public C1757400vpi(SeaPdpFragment seaPdpFragment, View view, SeaPdpViewModel seaPdpViewModel, ISeaPdpCommunicationService iSeaPdpCommunicationService, C1755820vnA c1755820vnA) {
        this.LIZ = new WeakReference<>(seaPdpFragment);
        this.LIZIZ = new WeakReference<>(view);
        this.LIZJ = new WeakReference<>(seaPdpViewModel);
        this.LIZLLL = new WeakReference<>(iSeaPdpCommunicationService);
        this.LJ = new WeakReference<>(c1755820vnA);
    }
}
