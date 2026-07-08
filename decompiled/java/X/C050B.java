package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.050B, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C050B extends C09AY implements Function0<String> {
    public final /* synthetic */ Aweme LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C050B(long j, long j2, Aweme aweme, boolean z) {
        super(0);
        this.LL = aweme;
        this.LLILLJJLI = z;
        this.LLILLL = j;
        this.LLILZ = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("refreshDescLayoutWithHashTagTruncation [");
        sbLIZ.append(this.LL.getAid());
        sbLIZ.append("] forTrans ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" past ");
        sbLIZ.append(this.LLILLL - this.LLILZ);
        sbLIZ.append("ms since start");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
