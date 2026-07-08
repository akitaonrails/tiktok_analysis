package X;

import X.AbstractC1255880imo;
import java.util.List;

/* JADX INFO: renamed from: X.0ims, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1255920ims<T extends AbstractC1255880imo> extends C1260870iur<T, InterfaceC1212360hec> implements InterfaceC1255940imu {
    public InterfaceC1255930imt LLILZ;

    public /* synthetic */ boolean B1(C0PN0 c0pn0) {
        return false;
    }

    @Override // X.InterfaceC1255940imu
    public /* synthetic */ void LLLZZIL(List list) {
    }

    @Override // X.C1260870iur
    public void LJIILIIL() {
        K k;
        T t = this.LL;
        if (t == 0 || (k = this.LLILLJJLI) == 0) {
            return;
        }
        int i = ((AbstractC1255880imo) t).mListQueryType;
        if (i != 1) {
            if (i == 2) {
                ((InterfaceC1212360hec) k).Jm();
                return;
            }
            if (i != 4) {
                if (i != 19) {
                    if (i != 20) {
                        return;
                    }
                }
            }
            ((InterfaceC1212360hec) k).showLoadMoreLoading();
            return;
        }
        ((InterfaceC1212360hec) k).LJ();
    }

    @Override // X.C1260870iur, X.InterfaceC1526205yG
    public void onSuccess() {
        K k;
        T t = this.LL;
        if (t == 0 || (k = this.LLILLJJLI) == 0) {
            return;
        }
        int i = ((AbstractC1255880imo) t).mListQueryType;
        if (i != 1) {
            if (i == 2) {
                ((InterfaceC1212360hec) k).mE(((AbstractC1255880imo) t).getItems(), !((AbstractC1255880imo) this.LL).isNewDataEmpty());
                return;
            }
            if (i != 4 && i != 16) {
                if (i != 19) {
                    if (i != 20) {
                        return;
                    }
                }
            }
            ((InterfaceC1212360hec) k).Pj(((AbstractC1255880imo) t).getItems(), ((AbstractC1255880imo) this.LL).isHasMore() && !((AbstractC1255880imo) this.LL).isNewDataEmpty());
            return;
        }
        if (((AbstractC1255880imo) t).isDataEmpty()) {
            ((InterfaceC1212360hec) this.LLILLJJLI).Ng1();
        } else {
            ((InterfaceC1212360hec) this.LLILLJJLI).LLJJJIL(((AbstractC1255880imo) this.LL).getItems(), ((AbstractC1255880imo) this.LL).isHasMore());
        }
    }

    @Override // X.C1260870iur
    public void LIZ() {
        super.LIZ();
        this.LLILZ = null;
    }

    @Override // X.InterfaceC1255940imu
    public void Dl(int[] iArr) {
        InterfaceC1255930imt interfaceC1255930imt = this.LLILZ;
        if (interfaceC1255930imt != null) {
            interfaceC1255930imt.IK(iArr);
        }
    }

    @Override // X.InterfaceC1255940imu
    public void L4(List list) {
        InterfaceC1255930imt interfaceC1255930imt = this.LLILZ;
        if (interfaceC1255930imt != null) {
            interfaceC1255930imt.Js(list);
        }
    }

    public void LJIILL(InterfaceC1255930imt interfaceC1255930imt) {
        this.LLILZ = interfaceC1255930imt;
    }

    public boolean LJIILLIIL(Object obj) {
        T t = this.LL;
        if (t != 0 && ((AbstractC1255880imo) t).deleteItem(obj)) {
            return true;
        }
        return false;
    }

    public int LJIIZILJ(List<Object> list) {
        if (this.LL != 0 && !C086I.LIZIZ(list)) {
            return ((AbstractC1255880imo) this.LL).deleteItems(list);
        }
        return 0;
    }

    public void Y1(int i) {
        InterfaceC1255930imt interfaceC1255930imt = this.LLILZ;
        if (interfaceC1255930imt != null) {
            interfaceC1255930imt.Y1(i);
        }
    }

    @Override // X.C1260870iur, X.InterfaceC1526205yG
    public void onFailed(Exception exc) {
        K k;
        T t = this.LL;
        if (t != 0 && (k = this.LLILLJJLI) != 0) {
            int i = ((AbstractC1255880imo) t).mListQueryType;
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        if (i != 19) {
                            if (i != 20) {
                                return;
                            }
                        }
                    }
                    ((InterfaceC1212360hec) k).Wi(exc);
                    return;
                }
                ((InterfaceC1212360hec) k).bD1(exc);
                return;
            }
            ((InterfaceC1212360hec) k).Uq2(exc);
        }
    }

    public boolean LJIJ(Object obj, int i) {
        T t = this.LL;
        if (t != 0 && ((AbstractC1255880imo) t).insertItem(obj, i)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1255940imu
    public final void V1(int i, Object obj) {
        InterfaceC1255930imt interfaceC1255930imt = this.LLILZ;
        if (interfaceC1255930imt != null) {
            interfaceC1255930imt.V1(i, obj);
        }
    }

    public void w(int i, List list) {
        InterfaceC1255930imt interfaceC1255930imt = this.LLILZ;
        if (interfaceC1255930imt != null) {
            interfaceC1255930imt.w(i, list);
        }
    }
}
