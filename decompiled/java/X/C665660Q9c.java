package X;

import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Q9c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C665660Q9c {
    public final C0PRX LIZ;
    public final SearchApiResult LIZIZ;
    public final Exception LIZJ;
    public final Function0<Unit> LIZLLL;
    public final C20626215nQ LJ;
    public final String LJFF;

    public C665660Q9c() {
        throw null;
    }

    public C665660Q9c(C0PRX c0prx, SearchApiResult searchApiResult, Exception exc, Function0 function0, C20626215nQ c20626215nQ, String str, int i) {
        searchApiResult = (i & 2) != 0 ? null : searchApiResult;
        exc = (i & 4) != 0 ? null : exc;
        function0 = (i & 8) != 0 ? null : function0;
        c20626215nQ = (i & 16) != 0 ? null : c20626215nQ;
        str = (i & 32) != 0 ? null : str;
        this.LIZ = c0prx;
        this.LIZIZ = searchApiResult;
        this.LIZJ = exc;
        this.LIZLLL = function0;
        this.LJ = c20626215nQ;
        this.LJFF = str;
    }
}
