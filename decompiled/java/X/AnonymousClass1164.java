package X;

import com.ss.android.ugc.aweme.challenge.model.ChallengeList;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: X.1164, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class AnonymousClass1164 implements Callable {
    public final /* synthetic */ long LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ int LLILLL = 20;

    @Override // java.util.concurrent.Callable
    public final Object call() throws ExecutionException, InterruptedException {
        C1C7U.LIZ("ChallengeRecommendModel@4d30.fetchList$1");
        long j = this.LL;
        long j2 = this.LLILLJJLI;
        int i = this.LLILLL;
        String str = AnonymousClass1162.LIZ;
        HashMap map = new HashMap();
        map.put("max_cursor", String.valueOf(j));
        map.put("min_cursor", String.valueOf(j2));
        map.put("count", String.valueOf(i));
        map.put("is_hash_tag", String.valueOf(1));
        ChallengeList challengeList = AnonymousClass1162.LJII.LIZJ(map).get();
        C1C7U.LIZIZ("ChallengeRecommendModel@4d30.fetchList$1");
        return challengeList;
    }

    public AnonymousClass1164(long j, long j2) {
        this.LL = j;
        this.LLILLJJLI = j2;
    }
}
