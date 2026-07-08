package X;

import X.C0PN2;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: X.0PNa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C643800PNa<T extends C0PN2> extends C1255920ims<T> {
    public InterfaceC643870PNh LLILZIL;

    @Override // X.C1260870iur
    public void LJIILJJIL() {
        T t = this.LL;
        if (t != 0 && (t instanceof C0PN2)) {
            ((C0PN2) t).LJIIJJI(0, "basepresenter new request");
        }
        super.LJIILJJIL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C1255920ims, X.C1260870iur, X.InterfaceC1526205yG
    public void onSuccess() {
        GlobalDoodleConfig globalDoodleConfig;
        GlobalDoodleConfig globalDoodleConfig2;
        AbstractC1255880imo abstractC1255880imo = (AbstractC1255880imo) this.LL;
        boolean z = true;
        if (abstractC1255880imo.mListQueryType == 1) {
            K k = this.LLILLJJLI;
            if (k instanceof InterfaceC643870PNh) {
                ((InterfaceC643870PNh) k).mn((SearchApiResult) abstractC1255880imo.getData());
            }
        }
        GlobalDoodleConfig globalDoodleConfig3 = ((SearchApiResult) this.LL.getData()).globalDoodleConfig;
        InterfaceC643870PNh interfaceC643870PNh = this.LLILZIL;
        if (interfaceC643870PNh != null) {
            interfaceC643870PNh.vw(globalDoodleConfig3);
            AbstractC1255880imo abstractC1255880imo2 = (AbstractC1255880imo) this.LL;
            if (abstractC1255880imo2.mListQueryType == 1) {
                this.LLILZIL.yD((SearchApiResult) abstractC1255880imo2.getData());
            }
        } else {
            K k2 = this.LLILLJJLI;
            if (k2 instanceof InterfaceC643870PNh) {
                ((InterfaceC643870PNh) k2).vw(globalDoodleConfig3);
                AbstractC1255880imo abstractC1255880imo3 = (AbstractC1255880imo) this.LL;
                if (abstractC1255880imo3.mListQueryType == 1) {
                    ((InterfaceC643870PNh) this.LLILLJJLI).yD((SearchApiResult) abstractC1255880imo3.getData());
                }
            }
        }
        super.onSuccess();
        AbstractC1255880imo abstractC1255880imo4 = (AbstractC1255880imo) this.LL;
        if (abstractC1255880imo4.mListQueryType != 1) {
            return;
        }
        K k3 = this.LLILLJJLI;
        if (k3 instanceof InterfaceC643870PNh) {
            ((InterfaceC643870PNh) k3).Md((SearchApiResult) abstractC1255880imo4.getData());
        }
        Object data = this.LL.getData();
        InterfaceC643870PNh interfaceC643870PNh2 = this.LLILZIL;
        if (interfaceC643870PNh2 != null) {
            LJIJJ(interfaceC643870PNh2);
            if (data instanceof SearchApiResult) {
                this.LLILZIL.nv((SearchApiResult) data);
            }
            this.LLILZIL.XF(((SearchApiResult) this.LL.getData()).dynamicMask, globalDoodleConfig3 != null ? globalDoodleConfig3.getUseScenario() : null);
            this.LLILZIL.mN();
            this.LLILZIL.Ft((SearchApiResult) this.LL.getData());
            InterfaceC643870PNh interfaceC643870PNh3 = this.LLILZIL;
            T t = this.LL.mData;
            if (t == 0 || ((globalDoodleConfig2 = ((SearchApiResult) t).globalDoodleConfig) != null && globalDoodleConfig2.getDisplayFilterBar() != 1)) {
                z = false;
            }
            interfaceC643870PNh3.l6(z);
            this.LLILZIL.Lh();
            return;
        }
        K k4 = this.LLILLJJLI;
        if (k4 instanceof InterfaceC643870PNh) {
            LJIJJ((InterfaceC643870PNh) k4);
            if (data instanceof SearchApiResult) {
                this.LLILZIL.nv((SearchApiResult) data);
            }
            ((InterfaceC643870PNh) this.LLILLJJLI).XF(((SearchApiResult) this.LL.getData()).dynamicMask, globalDoodleConfig3 != null ? globalDoodleConfig3.getUseScenario() : null);
            ((InterfaceC643870PNh) this.LLILLJJLI).mN();
            InterfaceC643870PNh interfaceC643870PNh4 = (InterfaceC643870PNh) this.LLILLJJLI;
            T t2 = this.LL.mData;
            interfaceC643870PNh4.qs();
            ((InterfaceC643870PNh) this.LLILLJJLI).Ft((SearchApiResult) this.LL.getData());
            InterfaceC643870PNh interfaceC643870PNh5 = this.LLILZIL;
            T t3 = this.LL.mData;
            if (t3 == 0 || ((globalDoodleConfig = ((SearchApiResult) t3).globalDoodleConfig) != null && globalDoodleConfig.getDisplayFilterBar() != 1)) {
                z = false;
            }
            interfaceC643870PNh5.l6(z);
            ((InterfaceC643870PNh) this.LLILLJJLI).Lh();
        }
    }

    @Override // X.C1260870iur
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final void LJIIJJI(InterfaceC1212360hec interfaceC1212360hec) {
        this.LLILLJJLI = interfaceC1212360hec;
        if (interfaceC1212360hec instanceof InterfaceC643870PNh) {
            InterfaceC643870PNh interfaceC643870PNh = (InterfaceC643870PNh) interfaceC1212360hec;
            this.LLILZIL = interfaceC643870PNh;
            T t = this.LL;
            if (t != 0 && interfaceC643870PNh != null) {
                ((C0PN2) t).LLJ = interfaceC643870PNh.ZA();
            }
        }
    }

    @Override // X.C1260870iur
    public final boolean LIZJ(Object... objArr) {
        T t = this.LL;
        if (t != 0) {
            InterfaceC643870PNh interfaceC643870PNh = this.LLILZIL;
            if (interfaceC643870PNh != null) {
                ((C0PN2) t).LLILZ = interfaceC643870PNh.I();
                ((C0PN2) this.LL).LLIZ = this.LLILZIL.lR();
                ((C0PN2) this.LL).LLILZIL = this.LLILZIL.Lf();
                this.LLILZIL.Dl(C086I.LIZIZ(((AbstractC1255880imo) this.LL).getItems()));
            }
            ((C0PN2) this.LL).LJIIJJI(1, "basePresenter new request");
        }
        InterfaceC643870PNh interfaceC643870PNh2 = this.LLILZIL;
        if (interfaceC643870PNh2 != null) {
            C644060POa c644060POa = C644060POa.LIZ;
            SearchResultParam searchResultParamI = interfaceC643870PNh2.I();
            c644060POa.getClass();
            C644060POa.LJII(searchResultParamI).LJIILJJIL();
        }
        return super.LIZJ(objArr);
    }

    public void LJFF(String str) {
        T t = this.LL;
        if (t == 0) {
            return;
        }
        ((C0PN2) t).LLJILLL = str;
    }

    @Override // X.C1260870iur
    /* JADX INFO: renamed from: LJIJI, reason: merged with bridge method [inline-methods] */
    public void LJIIJ(T t) {
        InterfaceC643870PNh interfaceC643870PNh;
        super.LJIIJ(t);
        T t2 = this.LL;
        if (t2 != 0 && (interfaceC643870PNh = this.LLILZIL) != null) {
            ((C0PN2) t2).LLJ = interfaceC643870PNh.ZA();
        }
    }

    public final void LJIJJ(InterfaceC643870PNh interfaceC643870PNh) {
        T t = this.LL;
        if (t != 0 && ((AbstractC1255880imo) t).getItems() != null) {
            C644060POa c644060POa = C644060POa.LIZ;
            SearchResultParam searchResultParamI = interfaceC643870PNh.I();
            c644060POa.getClass();
            C0PO5 c0po5LJII = C644060POa.LJII(searchResultParamI);
            c0po5LJII.LIZIZ(((AbstractC1255880imo) this.LL).getItems().size());
            c0po5LJII.LJIILIIL();
            c0po5LJII.LJII(((C0PN2) this.LL).LLJILJILJ);
            c0po5LJII.LJIJ((SearchApiResult) this.LL.getData());
            c0po5LJII.LJIL(0);
            c0po5LJII.LJIJJ(((C0PN2) this.LL).LLJJIJI);
        }
    }

    @Override // X.C1255920ims, X.C1260870iur, X.InterfaceC1526205yG
    public void onFailed(Exception exc) {
        if (exc instanceof CancellationException) {
            return;
        }
        super.onFailed(exc);
        InterfaceC643870PNh interfaceC643870PNh = this.LLILZIL;
        if (interfaceC643870PNh == null) {
            K k = this.LLILLJJLI;
            if (!(k instanceof InterfaceC643870PNh) || (interfaceC643870PNh = (InterfaceC643870PNh) k) == null) {
                return;
            }
        }
        C644060POa c644060POa = C644060POa.LIZ;
        SearchResultParam searchResultParamI = interfaceC643870PNh.I();
        c644060POa.getClass();
        C0PO5 c0po5LJII = C644060POa.LJII(searchResultParamI);
        c0po5LJII.LJIILIIL();
        c0po5LJII.LJIL(1);
        c0po5LJII.LJ(exc.getMessage());
        c0po5LJII.LJIJI(exc);
        C644210POp.LIZ.getClass();
        C644210POp.LJ.LIZLLL(exc);
        if (((AbstractC1255880imo) this.LL).mListQueryType == 1) {
            interfaceC643870PNh.nv(null);
            interfaceC643870PNh.mN();
        }
        interfaceC643870PNh.yD(null);
        interfaceC643870PNh.XF(null, null);
    }
}
