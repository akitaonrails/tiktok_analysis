package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0weF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1788730weF extends C09AY implements Function1<C1788740weG, Map<String, ? extends String>> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1788730weF(String str, String str2, long j) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Map<String, ? extends String> invoke(C1788740weG c1788740weG) {
        C1788740weG c1788740weG2 = c1788740weG;
        return C2097608Jq.LJIIIIZZ(new Pair(c1788740weG2.LIZJ, this.LL), new Pair(c1788740weG2.LIZIZ, this.LLILLJJLI), new Pair(c1788740weG2.LIZLLL, CardStruct.IStatusCode.DEFAULT), new Pair(c1788740weG2.LJ, CardStruct.IStatusCode.DEFAULT), new Pair(c1788740weG2.LJI, String.valueOf(this.LLILLL)));
    }
}
