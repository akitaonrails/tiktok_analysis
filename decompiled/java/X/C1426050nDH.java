package X;

import com.ss.android.ugc.aweme.editeffect.search.middleware.sug.SearchSugResponse;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0nDH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1426050nDH {
    public final C1DRG LIZ;
    public final SearchSugResponse LIZIZ;
    public final C375830EoP<Unit> LIZJ;

    public C1426050nDH(C1DRG c1drg, SearchSugResponse searchSugResponse, C375830EoP<Unit> c375830EoP) {
        this.LIZ = c1drg;
        this.LIZIZ = searchSugResponse;
        this.LIZJ = c375830EoP;
    }

    public static C1426050nDH LIZ(C1426050nDH c1426050nDH, SearchSugResponse searchSugResponse, C375830EoP c375830EoP, int i) {
        C1DRG c1drg;
        if ((i & 1) != 0) {
            c1drg = c1426050nDH.LIZ;
        } else {
            c1drg = null;
        }
        if ((i & 2) != 0) {
            searchSugResponse = c1426050nDH.LIZIZ;
        }
        if ((i & 4) != 0) {
            c375830EoP = c1426050nDH.LIZJ;
        }
        c1426050nDH.getClass();
        return new C1426050nDH(c1drg, searchSugResponse, c375830EoP);
    }
}
