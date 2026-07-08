package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.00r2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C207400r2 extends C09AY implements Function0<String> {
    public final /* synthetic */ Aweme LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C207400r2(long j, String str, Aweme aweme) {
        super(0);
        this.LL = aweme;
        this.LLILLJJLI = j;
        this.LLILLL = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL.getAid());
        sbLIZ.append(" download success ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(' ');
        sbLIZ.append(this.LLILLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
