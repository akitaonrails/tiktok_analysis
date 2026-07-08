package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0gWO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class C1168820gWO extends C2217421BqW implements Function2<String, Long, Unit> {
    public C1168820gWO(C1646100swC c1646100swC) {
        super(2, c1646100swC, C1646100swC.class, "exitRecord", "exitRecord(Ljava/lang/String;J)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, Long l) {
        long jLongValue = l.longValue();
        ((C1646100swC) this.receiver).yp0(str, jLongValue);
        return Unit.LIZ;
    }
}
