package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0gWQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class C1168840gWQ extends C2217421BqW implements Function2<String, Long, Unit> {
    public C1168840gWQ(C1170090gYR c1170090gYR) {
        super(2, c1170090gYR, C1170090gYR.class, "exitRecord", "exitRecord(Ljava/lang/String;J)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, Long l) {
        long jLongValue = l.longValue();
        ((C1170090gYR) this.receiver).yp0(str, jLongValue);
        return Unit.LIZ;
    }
}
