package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* JADX INFO: renamed from: X.0PMq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C643700PMq extends C643720PMs<C653470Pk9, C643710PMr<C653470Pk9>> {
    @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return 9;
    }

    public C643700PMq(AbstractC1255880imo<?, ?> abstractC1255880imo) {
        this.mModel = abstractC1255880imo instanceof C653470Pk9 ? abstractC1255880imo : null;
        this.mPresenter = new AbstractC666280QBm<T, Aweme>() { // from class: X.0PMr
            @Override // X.AbstractC666280QBm
            public final List<Aweme> LJIJJ() {
                return ((AbstractC1255880imo) this.LL).getItems();
            }

            @Override // X.AbstractC666280QBm
            public final List<Aweme> LJIJJLI() {
                return ((AbstractC1255880imo) this.LL).getItems();
            }

            @Override // X.C1260870iur
            public final void LJIIJ(AbstractC666100QAu abstractC666100QAu) {
                AbstractC1255880imo abstractC1255880imo2 = (AbstractC1255880imo) abstractC666100QAu;
                super.LJIIJ(abstractC1255880imo2);
                abstractC1255880imo2.onModelBound();
            }

            @Override // X.AbstractC666280QBm
            public final String LJIJI(Aweme aweme) {
                Aweme aweme2 = aweme;
                if (aweme2 == null) {
                    return "";
                }
                return C735370Ssx.LIZJ(aweme2);
            }
        };
    }
}
