package X;

import Y.AfS180S0100000_11;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0Shj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C728410Shj extends AbstractC1255880imo<Aweme, Aweme> {
    public static final /* synthetic */ int LLILZ = 0;
    public final String LL;
    public final boolean LLILLJJLI;
    public Aweme LLILLL;

    @Override // X.AbstractC666100QAu
    public final boolean checkParams(Object... objArr) {
        return true;
    }

    @Override // X.AbstractC1255880imo
    public final boolean isHasMore() {
        return false;
    }

    @Override // X.AbstractC1255880imo
    public final void loadMoreList(Object... objArr) {
    }

    @Override // X.AbstractC1255880imo
    public final List<Aweme> getItems() {
        Aweme aweme = this.LLILLL;
        return aweme == null ? new ArrayList() : C1697810uHb.LJIILJJIL(aweme);
    }

    @Override // X.AbstractC666100QAu
    public final /* bridge */ /* synthetic */ Object getData() {
        return this.LLILLL;
    }

    @Override // X.AbstractC1255880imo
    public final void refreshList(Object... objArr) {
        C11O8 c11o8LIZ = C01B8.LIZ(this.LL);
        if (c11o8LIZ != null) {
            c11o8LIZ.LJJLL(new AfS180S0100000_11(this, 4), new C09JN() { // from class: X.0Shk
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("CelebrationDetailModel@45a2.refreshList$2");
                    C1C7U.LIZIZ("CelebrationDetailModel@45a2.refreshList$2");
                }
            });
        }
    }

    public C728410Shj(Aweme aweme, String str, boolean z) {
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = aweme;
    }
}
