package X;

import com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsPresenter;
import com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostHistoryContract$AbsView;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiCoHostHistoryFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* JADX INFO: renamed from: X.0bAQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC963000bAQ extends InteractDialogFragmentBaseContract$AbsPresenter<MultiCoHostHistoryContract$AbsView> {
    public abstract void LJIIIZ(C955590ayT c955590ayT, C955540ayO c955540ayO, boolean z, long j);

    public abstract void LJIIJ(Room room);

    public abstract void LJIIJJI(Room room);

    public abstract void LJIIL(C955590ayT c955590ayT, C955540ayO c955540ayO, boolean z, long j);

    public abstract boolean LJIILIIL();

    public abstract void LJIILJJIL();

    public abstract void LJIILL(C955590ayT c955590ayT);

    public AbstractC963000bAQ(MultiCoHostHistoryFragment multiCoHostHistoryFragment) {
        super(multiCoHostHistoryFragment);
    }
}
