package X;

import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.filter.StrArray;

/* JADX INFO: renamed from: X.0suQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1645000suQ {
    public static final void LIZ(C1643870ssb c1643870ssb, StrArray strArray, FilterBean filterBean) {
        String id;
        InterfaceC1645100sua interfaceC1645100sua;
        if (c1643870ssb != null && (interfaceC1645100sua = c1643870ssb.LIZLLL) != null && interfaceC1645100sua.LIZJ()) {
            id = "";
        } else if (filterBean == null || (id = filterBean.getId()) == null) {
            id = "-1";
        }
        strArray.add(id);
    }
}
