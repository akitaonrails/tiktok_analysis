package X;

import com.ss.android.ugc.aweme.challenge.model.SearchSugChallengeList;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: X.116U, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C116U implements Callable<Object> {
    public final C116T LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final Integer LLILZ;
    public boolean LLILZIL;

    @Override // java.util.concurrent.Callable
    public final Object call() throws ExecutionException, InterruptedException {
        C1C7U.LIZ("RequestTask@ed93.call");
        this.LL.mIsLoading = false;
        if (this.LLILZIL) {
            throw new RuntimeException() { // from class: X.116V
            };
        }
        String str = this.LLILLJJLI;
        SearchSugChallengeList searchSugChallengeList = AnonymousClass1162.LJIIIIZZ.LJ(str, this.LLILLL, this.LLILZ).get();
        searchSugChallengeList.setKeyword(str);
        if (this.LLILZIL) {
            throw new RuntimeException() { // from class: X.116V
            };
        }
        C1C7U.LIZIZ("RequestTask@ed93.call");
        return searchSugChallengeList;
    }

    public C116U(C116T c116t, Object[] objArr) {
        Integer num;
        this.LL = c116t;
        this.LLILLJJLI = (String) objArr[0];
        this.LLILLL = (String) objArr[1];
        if (ComplianceServiceProvider.LJI().LJJII()) {
            num = 1;
        } else {
            num = null;
        }
        this.LLILZ = num;
    }
}
