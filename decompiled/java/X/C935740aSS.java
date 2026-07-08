package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0aSS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C935740aSS extends C09AY implements Function1<List<? extends PosIdentity>, Unit> {
    public final /* synthetic */ C935720aSQ LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C935740aSS(C935720aSQ c935720aSQ) {
        super(1);
        this.LL = c935720aSQ;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<? extends PosIdentity> list) {
        this.LL.LIZ();
        return Unit.LIZ;
    }
}
