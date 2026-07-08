package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fdE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class C1134620fdE extends C2217421BqW implements Function1<Long, Unit> {
    public C1134620fdE(C1134550fd7 c1134550fd7) {
        super(1, c1134550fd7, C1134550fd7.class, "onDateSwitch", "onDateSwitch(J)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l) {
        long jLongValue = l.longValue();
        this.receiver.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDateSwitch: time=");
        sbLIZ.append(jLongValue);
        C20441214yg.LIZIZ("WatchLiveStatusTracker", C2188811AlT.LIZIZ(sbLIZ));
        C1134550fd7.LJFF();
        C1134550fd7.LJ = 0L;
        return Unit.LIZ;
    }
}
