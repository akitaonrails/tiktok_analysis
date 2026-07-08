package X;

import com.bytedance.ies.powerlist.page.config.PowerPageSource;
import java.util.Collection;

/* JADX INFO: renamed from: X.0CmY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C323720CmY<T> implements InterfaceC1361890lXn<T> {
    public final AbstractC2252651DEx LL = C0PEM.LIZJ;
    public InterfaceC497601wk LLILLJJLI;
    public PowerPageSource<T> LLILLL;
    public C2252611DEt LLILZ;
    public T LLILZIL;
    public C20600815jK<InterfaceC1891350zJl> LLILZLL;

    @Override // X.InterfaceC1361890lXn
    public final void LIZIZ(EnumC323450Cm7 enumC323450Cm7) {
    }

    @Override // X.InterfaceC1361890lXn
    public final void LIZLLL(T t) {
    }

    @Override // X.InterfaceC1361890lXn
    public final void refresh() {
        C2252611DEt c2252611DEt = this.LLILZ;
        if (c2252611DEt != null) {
            c2252611DEt.LJJIIZ(null);
        }
        InterfaceC497601wk interfaceC497601wk = this.LLILLJJLI;
        if (interfaceC497601wk == null) {
            interfaceC497601wk = null;
        }
        C23250099c.LIZLLL(interfaceC497601wk, this.LL, null, new C323710CmX(this, null), 2);
    }

    public C323720CmY(int i) {
    }

    @Override // X.InterfaceC1361890lXn
    public final void LIZ(T t) {
        C2252611DEt c2252611DEt = this.LLILZ;
        if (c2252611DEt != null) {
            c2252611DEt.LJJIIZ(null);
        }
        InterfaceC497601wk interfaceC497601wk = this.LLILLJJLI;
        if (interfaceC497601wk == null) {
            interfaceC497601wk = null;
        }
        C23250099c.LIZLLL(interfaceC497601wk, this.LL, null, new C323700CmW(this, t, null), 2);
    }

    @Override // X.InterfaceC1361890lXn
    public final void LIZJ(EnumC323450Cm7 enumC323450Cm7, AbstractC316870CbV<T> abstractC316870CbV, boolean z) {
        T t;
        Collection collection;
        if (z) {
            if (abstractC316870CbV instanceof C323380Cm0) {
                collection = ((C323380Cm0) abstractC316870CbV).LIZLLL;
            } else if (abstractC316870CbV instanceof C316640Cb8) {
                collection = ((C316640Cb8) abstractC316870CbV).LIZIZ;
            } else {
                collection = C13BV.INSTANCE;
            }
            int i = C323730CmZ.LIZ[enumC323450Cm7.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C20600815jK<InterfaceC1891350zJl> c20600815jK = this.LLILZLL;
                        if (c20600815jK != null) {
                            c20600815jK.LJIILL(collection, null);
                        }
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    C20600815jK<InterfaceC1891350zJl> c20600815jK2 = this.LLILZLL;
                    if (c20600815jK2 != null) {
                        C20600815jK.LJ(c20600815jK2, 0, collection);
                    }
                }
            } else {
                C20600815jK<InterfaceC1891350zJl> c20600815jK3 = this.LLILZLL;
                if (c20600815jK3 != null) {
                    c20600815jK3.LIZLLL(collection, null);
                }
            }
        }
        if (abstractC316870CbV instanceof C323380Cm0) {
            int i2 = C323730CmZ.LIZ[enumC323450Cm7.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        t = ((C323380Cm0) abstractC316870CbV).LIZJ;
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    "not supported prev".toString();
                    throw new IllegalStateException("not supported prev");
                }
            } else {
                t = ((C323380Cm0) abstractC316870CbV).LIZJ;
            }
            this.LLILZIL = t;
            return;
        }
        if ((abstractC316870CbV instanceof C316650Cb9) || (abstractC316870CbV instanceof C316640Cb8) || (abstractC316870CbV instanceof C316880CbW)) {
        } else {
            throw new C1954807lC();
        }
    }
}
