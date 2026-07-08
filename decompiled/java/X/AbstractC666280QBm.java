package X;

import X.AbstractC1588960rS2;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* JADX INFO: renamed from: X.0QBm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC666280QBm<T extends AbstractC1588960rS2, DATA> extends C1255920ims<T> {
    public InterfaceC666290QBn LLILZIL;
    public boolean LLILZLL;
    public InterfaceC1255930imt LLIZ;

    public abstract String LJIJI(DATA data);

    public abstract List<Aweme> LJIJJ();

    public abstract List<DATA> LJIJJLI();

    @Override // X.C1255920ims, X.C1260870iur, X.InterfaceC1526205yG
    public final void onSuccess() {
        K k;
        InterfaceC666290QBn interfaceC666290QBn = this.LLILZIL;
        if (interfaceC666290QBn != null) {
            interfaceC666290QBn.Uh(true);
        }
        this.LLILZLL = false;
        T t = this.LL;
        if (t == 0) {
            return;
        }
        AbstractC1255880imo abstractC1255880imo = (AbstractC1255880imo) t;
        int i = abstractC1255880imo.mListQueryType;
        if (i != 1) {
            if (i != 2) {
                if (i != 4 || (k = this.LLILLJJLI) == 0) {
                    return;
                }
                ((InterfaceC1212360hec) k).Pj(LJIJJ(), ((AbstractC1255880imo) this.LL).isHasMore() && !((AbstractC1255880imo) this.LL).isNewDataEmpty());
                return;
            }
            K k2 = this.LLILLJJLI;
            if (k2 != 0) {
                ((InterfaceC1212360hec) k2).mE(LJIJJ(), true ^ ((AbstractC1255880imo) this.LL).isNewDataEmpty());
                return;
            }
            return;
        }
        if (abstractC1255880imo.isDataEmpty()) {
            K k3 = this.LLILLJJLI;
            if (k3 != 0) {
                ((InterfaceC1212360hec) k3).Ng1();
                return;
            }
            return;
        }
        K k4 = this.LLILLJJLI;
        if (k4 != 0) {
            ((InterfaceC1212360hec) k4).LLJJJIL(LJIJJ(), ((AbstractC1255880imo) this.LL).isHasMore());
        }
    }

    @Override // X.C1255920ims, X.C1260870iur
    public void LIZ() {
        super.LIZ();
        this.LLIZ = null;
    }

    @Override // X.C1255920ims, X.InterfaceC1255940imu
    public final boolean B1(C0PN0 c0pn0) {
        InterfaceC1255930imt interfaceC1255930imt = this.LLIZ;
        if (interfaceC1255930imt != null) {
            return interfaceC1255930imt.B1(c0pn0);
        }
        return false;
    }

    @Override // X.C1260870iur
    public final boolean LIZJ(Object... objArr) {
        InterfaceC666290QBn interfaceC666290QBn = this.LLILZIL;
        if (interfaceC666290QBn != null) {
            interfaceC666290QBn.Uh(this.LLILZLL);
        }
        return super.LIZJ(objArr);
    }

    @Override // X.C1255920ims
    public final void LJIILL(InterfaceC1255930imt interfaceC1255930imt) {
        this.LLIZ = interfaceC1255930imt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C1255920ims
    public final boolean LJIILLIIL(Object obj) {
        List listLJIJJLI;
        int i = 0;
        if (obj instanceof Aweme) {
            List<Aweme> listLJIJJ = LJIJJ();
            if (!C086I.LIZIZ(listLJIJJ)) {
                int size = listLJIJJ.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Aweme aweme = (Aweme) obj;
                    if (TextUtils.equals(aweme.getAid(), C729980SkG.LIZJ((Aweme) ListProtector.get(listLJIJJ, i2)))) {
                        String aid = aweme.getAid();
                        if (this.LL != 0 && (listLJIJJLI = LJIJJLI()) != null) {
                            int size2 = listLJIJJLI.size();
                            while (true) {
                                if (i >= size2) {
                                    break;
                                }
                                Object obj2 = ListProtector.get(listLJIJJLI, i);
                                String strLJIJI = LJIJI(obj2);
                                if (!TextUtils.isEmpty(strLJIJI) && TextUtils.equals(aid, strLJIJI)) {
                                    this.LL.getClass();
                                    listLJIJJLI.remove(obj2);
                                    break;
                                }
                                i++;
                            }
                        }
                        Y1(i2);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // X.C1255920ims, X.InterfaceC1255940imu
    public final void Y1(int i) {
        InterfaceC1255930imt interfaceC1255930imt = this.LLIZ;
        if (interfaceC1255930imt != null) {
            interfaceC1255930imt.Y1(i);
        }
    }

    @Override // X.C1255920ims, X.C1260870iur, X.InterfaceC1526205yG
    public final void onFailed(Exception exc) {
        InterfaceC666290QBn interfaceC666290QBn = this.LLILZIL;
        if (interfaceC666290QBn != null) {
            interfaceC666290QBn.Uh(true);
        }
        this.LLILZLL = false;
        super.onFailed(exc);
    }

    @Override // X.C1255920ims, X.InterfaceC1255940imu
    public final void w(int i, List list) {
        InterfaceC1255930imt interfaceC1255930imt = this.LLIZ;
        if (interfaceC1255930imt != null) {
            interfaceC1255930imt.w(i, list);
        }
    }
}
