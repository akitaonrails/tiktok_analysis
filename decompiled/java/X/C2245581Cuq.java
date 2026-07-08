package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Cuq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2245581Cuq extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C2245331CuR LL;
    public final /* synthetic */ List<Aweme> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2245581Cuq(C2245331CuR c2245331CuR, List<? extends Aweme> list) {
        super(0);
        this.LL = c2245331CuR;
        this.LLILLJJLI = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LJIILIIL(this.LLILLJJLI);
        return Unit.LIZ;
    }
}
