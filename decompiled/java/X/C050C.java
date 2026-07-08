package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.050C, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C050C extends C09AY implements Function0<String> {
    public final /* synthetic */ Aweme LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C050C(long j, Aweme aweme, boolean z) {
        super(0);
        this.LL = aweme;
        this.LLILLJJLI = z;
        this.LLILLL = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("refreshDescLayoutWithHashTagTruncation [");
        sbLIZ.append(this.LL.getAid());
        sbLIZ.append("] forTrans ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" finish  truncation takes ");
        sbLIZ.append(System.currentTimeMillis() - this.LLILLL);
        sbLIZ.append("ms");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
