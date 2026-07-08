package X;

import k5a.j;
import r4m.i;

/* JADX INFO: renamed from: X.0n8u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1423340n8u<CATEGORY, DATA, ERROR_DATA, ORI_CATEGORY, ORI_DATA, FETCH_CATEGORY_PARAM, FETCH_DATA_PARAM, FETCH_CATEGORY_RESULT_EXTRA, FETCH_DATA_RESULT_EXTRA_DATA, DATA_INFO> {
    public InterfaceC1423310n8r<CATEGORY, DATA, ERROR_DATA, FETCH_DATA_RESULT_EXTRA_DATA, DATA_INFO> LIZ = new j();
    public InterfaceC1423420n92<CATEGORY, DATA, ERROR_DATA, ORI_CATEGORY, ORI_DATA, FETCH_CATEGORY_PARAM, FETCH_CATEGORY_RESULT_EXTRA, FETCH_DATA_RESULT_EXTRA_DATA> LIZIZ;
    public InterfaceC1423430n93<CATEGORY, DATA, ERROR_DATA, ORI_DATA, FETCH_DATA_PARAM, FETCH_DATA_RESULT_EXTRA_DATA> LIZJ;

    public void LIZ(AbstractC1423370n8x abstractC1423370n8x, i iVar, InterfaceC1423480n98 interfaceC1423480n98, C1419220n2G c1419220n2G, InterfaceC1423310n8r interfaceC1423310n8r) {
        this.LIZIZ = abstractC1423370n8x;
        this.LIZJ = iVar;
        abstractC1423370n8x.LIZ = interfaceC1423480n98;
        abstractC1423370n8x.LIZIZ = c1419220n2G;
        if (c1419220n2G != null && iVar != null) {
            iVar.LIZIZ(c1419220n2G);
        }
        if (interfaceC1423310n8r != null) {
            this.LIZ = interfaceC1423310n8r;
        }
    }
}
