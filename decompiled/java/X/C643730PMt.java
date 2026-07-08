package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0PMt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C643730PMt extends AbstractC1216410hl9<C0PPK, C643740PMu> implements InterfaceC1603420rpM, InterfaceC666730QDf {
    @Override // X.InterfaceC666730QDf
    public final void LIZIZ(Aweme aweme) {
    }

    @Override // X.InterfaceC666730QDf
    public final void LJI(int i, float f, int i2, Aweme aweme) {
    }

    @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return 9;
    }

    @Override // X.InterfaceC666730QDf
    public final void onPageScrollStateChanged(int i) {
    }

    public C643730PMt(AbstractC1255880imo<?, ?> abstractC1255880imo) {
        AbstractC1255880imo<?, ?> abstractC1255880imo2 = abstractC1255880imo;
        this.mModel = abstractC1255880imo2 instanceof C0PPK ? abstractC1255880imo2 : new C0PPK(null, "", "", "", "", "", null, "");
        this.mPresenter = new AbstractC666280QBm<C0PPK, Aweme>() { // from class: X.0PMu
            @Override // X.C1260870iur
            public final void LJIILJJIL() {
                C0PPK c0ppk = (C0PPK) this.LL;
                if (c0ppk != null) {
                    for (Aweme aweme : c0ppk.LLIZLLLIL) {
                        HashMap<String, String> mobParams = aweme.getMobParams();
                        if (mobParams != null) {
                            mobParams.remove("is_inner");
                        }
                        HashMap<String, String> mobParams2 = aweme.getMobParams();
                        if (mobParams2 != null) {
                            mobParams2.remove("inner_search_id");
                        }
                        HashMap<String, String> mobParams3 = aweme.getMobParams();
                        if (mobParams3 != null) {
                            mobParams3.remove("rank_inner");
                        }
                    }
                }
                super.LJIILJJIL();
            }

            @Override // X.AbstractC666280QBm
            public final List<Aweme> LJIJJ() {
                return ((C0PPK) this.LL).LLIZLLLIL;
            }

            @Override // X.AbstractC666280QBm
            public final List<Aweme> LJIJJLI() {
                return ((C0PPK) this.LL).LLIZLLLIL;
            }

            @Override // X.C1260870iur
            public final void LJIIJ(AbstractC666100QAu abstractC666100QAu) {
                super.LJIIJ(abstractC666100QAu);
            }

            @Override // X.AbstractC666280QBm
            public final String LJIJI(Aweme aweme) {
                String aid;
                Aweme aweme2 = aweme;
                if (aweme2 == null || (aid = aweme2.getAid()) == null) {
                    return "";
                }
                return aid;
            }
        };
    }

    @Override // X.InterfaceC1603420rpM
    public final void bindPreLoadView(InterfaceC666290QBn interfaceC666290QBn) {
        ((AbstractC666280QBm) this.mPresenter).LLILZIL = interfaceC666290QBn;
    }

    @Override // X.InterfaceC1603420rpM
    public final void setPreLoad(boolean z) {
        ((AbstractC666280QBm) this.mPresenter).LLILZLL = true;
    }

    @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
    public final void request(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        if (i == 1) {
            this.mPresenter.LIZJ(Integer.valueOf(i), c2189821An6.getSearchKeyword());
        } else {
            this.mPresenter.LIZJ(Integer.valueOf(i));
        }
    }
}
