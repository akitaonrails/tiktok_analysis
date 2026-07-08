package X;

import android.text.TextUtils;
import java.util.List;

/* JADX INFO: renamed from: X.0hiR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1214730hiR extends C1255920ims<AbstractC1255880imo> {
    public Object[] LLILZIL;
    public String LLILZLL;

    @Override // X.C1260870iur
    public final void LJIILJJIL() {
        C1255780ime c1255780ime;
        C11NJ c11nj;
        T t = this.LL;
        if (t != 0 && (t instanceof C1255780ime) && (c11nj = (c1255780ime = (C1255780ime) t).LLJJJIL) != null) {
            c11nj.LJ();
            c1255780ime.LLJJJIL = null;
        }
        super.LJIILJJIL();
    }

    @Override // X.C1255920ims, X.C1260870iur, X.InterfaceC1526205yG
    public final void onSuccess() {
        K k;
        T t = this.LL;
        if (t == 0 || (k = this.LLILLJJLI) == 0) {
            return;
        }
        int i = ((AbstractC1255880imo) t).mListQueryType;
        if (i != 1) {
            boolean z = false;
            if (i == 2) {
                InterfaceC1212360hec interfaceC1212360hec = (InterfaceC1212360hec) k;
                List items = ((AbstractC1255880imo) t).getItems();
                if (!((AbstractC1255880imo) this.LL).isNewDataEmpty() && ((AbstractC1255880imo) this.LL).hasMoreUp()) {
                    z = true;
                }
                interfaceC1212360hec.mE(items, z);
            } else if (i == 4) {
                InterfaceC1212360hec interfaceC1212360hec2 = (InterfaceC1212360hec) k;
                List items2 = ((AbstractC1255880imo) t).getItems();
                if (((AbstractC1255880imo) this.LL).isHasMore() && !((AbstractC1255880imo) this.LL).isNewDataEmpty()) {
                    z = true;
                }
                interfaceC1212360hec2.Pj(items2, z);
            } else if (i == 6 && (k instanceof InterfaceC1257400ipG)) {
                ((InterfaceC1257400ipG) k).DH(((AbstractC1255880imo) t).getItems(), ((AbstractC1255880imo) this.LL).isHasMore(), ((AbstractC1255880imo) this.LL).hasMoreUp());
            }
        } else if (TextUtils.equals(this.LLILZLL, ((C1255780ime) t).LLILLL)) {
            K k2 = this.LLILLJJLI;
            if (k2 instanceof InterfaceC1257400ipG) {
                ((InterfaceC1257400ipG) k2).Hn(((AbstractC1255880imo) this.LL).hasLocateItem());
            }
            ((InterfaceC1212360hec) this.LLILLJJLI).LLJJJIL(((AbstractC1255880imo) this.LL).getItems(), ((AbstractC1255880imo) this.LL).isHasMore());
        } else {
            Object[] objArr = this.LLILZIL;
            if (objArr != null && objArr.length > 2) {
                Object obj = objArr[2];
                if ((obj instanceof String) && TextUtils.equals((String) obj, this.LLILZLL)) {
                    super.LIZJ(this.LLILZIL);
                }
            }
        }
        if (1 != ((AbstractC1255880imo) this.LL).mListQueryType) {
            ((InterfaceC1212360hec) this.LLILLJJLI).SY();
        }
    }

    @Override // X.C1260870iur
    public final boolean LIZJ(Object... objArr) {
        this.LLILZIL = objArr;
        return super.LIZJ(objArr);
    }

    public final void LJIJI(String str) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProfileAwemePresenter setUserId mUserId: ");
        sbLIZ.append(str);
        C1720106oR.LJI("Profile_ProfileAwemePresenter", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILZLL = str;
    }

    @Override // X.C1255920ims, X.C1260870iur, X.InterfaceC1526205yG
    public final void onFailed(Exception exc) {
        K k;
        super.onFailed(exc);
        T t = this.LL;
        if (t != 0 && (k = this.LLILLJJLI) != 0) {
            if (((AbstractC1255880imo) t).mListQueryType == 6 && (k instanceof InterfaceC1257400ipG)) {
                ((InterfaceC1257400ipG) k).Co(exc);
            }
            if (1 != ((AbstractC1255880imo) this.LL).mListQueryType) {
                ((InterfaceC1212360hec) this.LLILLJJLI).SY();
            }
        }
    }
}
