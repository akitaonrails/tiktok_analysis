package X;

import com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugResponse;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0QKc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C668520QKc implements InterfaceC2385309Wh<C1515820pY4<SearchSugResponse>, Void> {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ C668540QKe LIZIZ;
    public final /* synthetic */ AtomicBoolean LIZJ;
    public final /* synthetic */ C668510QKb LIZLLL;
    public final /* synthetic */ C0QKX LJ;
    public final /* synthetic */ C0QJX LJFF;

    @Override // X.InterfaceC2385309Wh
    public final Void then(C15O7<C1515820pY4<SearchSugResponse>> c15o7) {
        C1C7U.LIZ("SearchSugPresenter@ac4.fetchSugByFastChunk$1");
        C1515820pY4<SearchSugResponse> c1515820pY4LJIIL = c15o7.LJIIL();
        if (c1515820pY4LJIIL != null) {
            c1515820pY4LJIIL.LIZLLL(new C0QKZ(this));
        } else if (this.LIZLLL.LIZIZ(null)) {
            this.LJ.LIZLLL.LJJIJL("stream is null");
        }
        C1C7U.LIZIZ("SearchSugPresenter@ac4.fetchSugByFastChunk$1");
        return null;
    }

    public C668520QKc(C668540QKe c668540QKe, C668510QKb c668510QKb, C0QKX c0qkx, C0QJX c0qjx, String str, AtomicBoolean atomicBoolean) {
        this.LJFF = c0qjx;
        this.LIZ = str;
        this.LIZIZ = c668540QKe;
        this.LIZJ = atomicBoolean;
        this.LIZLLL = c668510QKb;
        this.LJ = c0qkx;
    }
}
