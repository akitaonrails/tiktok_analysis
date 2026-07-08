package X;

import X.C1255920ims;
import androidx.fragment.app.Fragment;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.common.presenter.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0hl9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public abstract class AbstractC1216410hl9<MODEL extends a, PRESENTER extends C1255920ims<MODEL>> implements InterfaceC1603360rpG {
    public MODEL mModel;
    public PRESENTER mPresenter;

    @Override // X.InterfaceC1603360rpG
    public /* synthetic */ boolean cannotLoadLatest() {
        return false;
    }

    @Override // X.InterfaceC1603360rpG
    public /* synthetic */ boolean cannotLoadMore() {
        return false;
    }

    @Override // X.InterfaceC1603360rpG
    public int getPageType(int i) {
        return -1;
    }

    @Override // X.InterfaceC1603360rpG
    public boolean init(Fragment fragment) {
        return true;
    }

    public boolean checkSelfInvalid() {
        return this.mPresenter == null || this.mModel == null;
    }

    @Override // X.InterfaceC1603360rpG
    public boolean isDataEmpty() {
        MODEL model = this.mModel;
        if (model == null) {
            return true;
        }
        return model.isDataEmpty();
    }

    @Override // X.InterfaceC1603360rpG
    public boolean isLoading() {
        return this.mPresenter.LJIIL();
    }

    @Override // X.InterfaceC1603360rpG
    public void unInit() {
        PRESENTER presenter = this.mPresenter;
        if (presenter != null) {
            presenter.LIZ();
            this.mPresenter.LJIILJJIL();
        }
    }

    @Override // X.InterfaceC1603360rpG
    public Object getViewModel() {
        return this.mModel;
    }

    @Override // X.InterfaceC1603360rpG
    public void bindView(InterfaceC1209780haS interfaceC1209780haS) {
        PRESENTER presenter = this.mPresenter;
        if (presenter != null) {
            presenter.LJIIJJI(interfaceC1209780haS);
            this.mPresenter.LJIILL(interfaceC1209780haS);
            this.mPresenter.LJIIJ(this.mModel);
        }
    }

    @Override // X.InterfaceC1603360rpG
    public boolean deleteItem(String str) {
        String str2;
        String name;
        Aweme awemeLJ = C729980SkG.LJ(str);
        PRESENTER presenter = this.mPresenter;
        if (presenter == null) {
            return false;
        }
        boolean zLJIILLIIL = presenter.LJIILLIIL(awemeLJ);
        C2276411E8h c2276411E8h = C2276411E8h.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("delete aweme: ");
        sbLIZ.append(str);
        if (zLJIILLIIL) {
            str2 = " success";
        } else {
            str2 = " failed";
        }
        sbLIZ.append(str2);
        T t = this.mPresenter.LL;
        if (t == 0) {
            name = "null";
        } else {
            name = t.getClass().getName();
        }
        sbLIZ.append(name);
        c2276411E8h.LIZJ("detail_feed", 6, "DeleteAweme", C2188811AlT.LIZIZ(sbLIZ));
        return zLJIILLIIL;
    }

    @Override // X.InterfaceC1603360rpG
    public void request(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        boolean zLJI = MethodIDManager.LJI(138028);
        PRESENTER presenter = this.mPresenter;
        if (presenter != null) {
            presenter.LIZJ(Integer.valueOf(i));
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
