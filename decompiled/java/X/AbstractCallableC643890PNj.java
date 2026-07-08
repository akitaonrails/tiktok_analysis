package X;

import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PNj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractCallableC643890PNj implements C0PN3, Callable<Object> {
    public boolean LL;
    public SearchResultParam LLILLJJLI;

    public abstract Object LIZIZ();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C1C7U.LIZ("CancelableRequest@93b4.call");
        if (this.LL) {
            throw new CancellationException();
        }
        Object objLIZIZ = LIZIZ();
        if (this.LL) {
            throw new CancellationException();
        }
        C1C7U.LIZIZ("CancelableRequest@93b4.call");
        return objLIZIZ;
    }

    @Override // X.C0PN3
    public final void LIZ(int i, String str) {
        this.LL = true;
        SearchResultParam searchResultParam = this.LLILLJJLI;
        if (searchResultParam != null) {
            C644060POa.LIZ.getClass();
            C0PO5 c0po5LJII = C644060POa.LJII(searchResultParam);
            c0po5LJII.LJIILIIL();
            c0po5LJII.LJIL(2);
            if (!Intrinsics.LJFF(c0po5LJII, C640870PBt.LIZ)) {
                c0po5LJII.LJIIZILJ = i;
            }
            c0po5LJII.LIZLLL();
            C644210POp.LIZ.getClass();
            C644210POp.LJFF.LIZJ();
            C644210POp.LJ.LIZJ(2, str);
        }
    }
}
