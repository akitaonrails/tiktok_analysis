package X;

import X.AbstractC666280QBm;
import androidx.fragment.app.Fragment;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import d7a.f;

/* JADX INFO: renamed from: X.0PMs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C643720PMs<MODEL extends f<?, ?>, PRESENTER extends AbstractC666280QBm<MODEL, Aweme>> extends AbstractC1216410hl9<MODEL, PRESENTER> implements InterfaceC1603420rpM {
    @Override // X.InterfaceC1603420rpM
    public final void bindPreLoadView(InterfaceC666290QBn interfaceC666290QBn) {
        ((AbstractC666280QBm) this.mPresenter).LLILZIL = interfaceC666290QBn;
    }

    @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
    public final boolean init(Fragment fragment) {
        if (this.mModel != 0) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1603420rpM
    public final void setPreLoad(boolean z) {
        ((AbstractC666280QBm) this.mPresenter).LLILZLL = true;
    }

    @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
    public final void request(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        boolean zLJI = MethodIDManager.LJI(137909);
        this.mPresenter.LIZJ(Integer.valueOf(i));
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
