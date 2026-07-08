package X;

import com.ss.android.ugc.aweme.feed.guide.notinterested.INotInterestedTutorialService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel;
import com.ss.android.ugc.aweme.journey.feed.notinterested.NotInterestedTutorialService;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0TJ5, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TJ5 implements INotInterestedTutorialService {
    public static final C0TJ5 LIZIZ = new C0TJ5();
    public final /* synthetic */ INotInterestedTutorialService LIZ;

    @Override // com.ss.android.ugc.aweme.feed.guide.notinterested.INotInterestedTutorialService
    public final void LIZ(WeakReference<IBaseListFragmentPanel> weakReference, WeakReference<C1620050sGB> weakReference2) {
        this.LIZ.LIZ(weakReference, weakReference2);
    }

    @Override // com.ss.android.ugc.aweme.feed.guide.notinterested.INotInterestedTutorialService
    public final void LIZIZ(int i, Aweme aweme) {
        this.LIZ.LIZIZ(i, aweme);
    }

    @Override // com.ss.android.ugc.aweme.feed.guide.notinterested.INotInterestedTutorialService
    public final void LIZJ() {
        this.LIZ.LIZJ();
    }

    public C0TJ5() {
        INotInterestedTutorialService iNotInterestedTutorialService;
        Object objLIZ = C04TD.LIZ(INotInterestedTutorialService.class, false);
        if (objLIZ != null) {
            iNotInterestedTutorialService = (INotInterestedTutorialService) objLIZ;
        } else {
            if (C04TD.y1 == null) {
                synchronized (INotInterestedTutorialService.class) {
                    if (C04TD.y1 == null) {
                        C04TD.y1 = new NotInterestedTutorialService();
                    }
                }
            }
            iNotInterestedTutorialService = C04TD.y1;
        }
        this.LIZ = iNotInterestedTutorialService;
    }
}
