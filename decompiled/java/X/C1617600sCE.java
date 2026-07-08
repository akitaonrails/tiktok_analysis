package X;

import androidx.fragment.app.Fragment;

/* JADX INFO: renamed from: X.0sCE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1617600sCE extends AbstractC1216410hl9<C1884130z87, C1255920ims<C1884130z87>> implements InterfaceC1216440hlC {
    @Override // X.InterfaceC1216440hlC
    public final boolean aH0() {
        C1884130z87 c1884130z87 = this.mModel;
        return c1884130z87 != null && c1884130z87.LJIILIIL();
    }

    @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
    public final boolean init(Fragment fragment) {
        if (this.mModel != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [PRESENTER extends X.0ims<MODEL>, X.0ims, X.0iur] */
    public C1617600sCE(Object obj, Object obj2) {
        C2189821An6 c2189821An6;
        String reactSessionId;
        AbstractC1255880imo abstractC1255880imo;
        AbstractC1255880imo abstractC1255880imoLIZ = null;
        if ((obj instanceof C1884130z87) && (abstractC1255880imo = (AbstractC1255880imo) obj) != null) {
            abstractC1255880imoLIZ = abstractC1255880imo;
        } else if ((obj2 instanceof C2189821An6) && (c2189821An6 = (C2189821An6) obj2) != null && (reactSessionId = c2189821An6.getReactSessionId()) != null) {
            abstractC1255880imoLIZ = C1884140z88.LIZ(reactSessionId);
        }
        this.mModel = abstractC1255880imoLIZ;
        ?? c1255920ims = new C1255920ims();
        this.mPresenter = c1255920ims;
        c1255920ims.LLILLL = false;
    }

    @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
    public final void request(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        this.mPresenter.LIZJ(Integer.valueOf(i), c2189821An6);
    }
}
