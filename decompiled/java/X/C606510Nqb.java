package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Nqb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C606510Nqb extends C09AY implements Function0<String> {
    public final /* synthetic */ Aweme LL;
    public final /* synthetic */ C606540Nqe LLILLJJLI;
    public final /* synthetic */ C606500Nqa LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C606510Nqb(Aweme aweme, C606540Nqe c606540Nqe, C606500Nqa c606500Nqa) {
        super(0);
        this.LL = aweme;
        this.LLILLJJLI = c606540Nqe;
        this.LLILLL = c606500Nqa;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("delete ");
        sbLIZ.append(this.LL.getAid());
        sbLIZ.append(" at ");
        sbLIZ.append(this.LLILLJJLI.LIZLLL);
        sbLIZ.append(" by ");
        sbLIZ.append(this.LLILLL.LIZ);
        sbLIZ.append(", result=");
        sbLIZ.append(this.LLILLJJLI.LIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
