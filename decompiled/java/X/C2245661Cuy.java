package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Cuy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2245661Cuy extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C2245331CuR LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ Aweme LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2245661Cuy(C2245331CuR c2245331CuR, int i, Aweme aweme) {
        super(0);
        this.LL = c2245331CuR;
        this.LLILLJJLI = i;
        this.LLILLL = aweme;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LJIILLIIL(this.LLILLJJLI, this.LLILLL);
        return Unit.LIZ;
    }
}
