package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0gWN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class C1168810gWN extends C2217421BqW implements Function2<String, Long, Unit> {
    public C1168810gWN(C1170110gYT c1170110gYT) {
        super(2, c1170110gYT, C1170110gYT.class, "exitRecord", "exitRecord(Ljava/lang/String;J)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, Long l) {
        long jLongValue = l.longValue();
        ((C1170110gYT) this.receiver).yp0(str, jLongValue);
        return Unit.LIZ;
    }
}
