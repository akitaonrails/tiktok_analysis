package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0gWP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class C1168830gWP extends C2217421BqW implements Function2<String, Long, Unit> {
    public C1168830gWP(C1646110swD c1646110swD) {
        super(2, c1646110swD, C1646110swD.class, "exitRecord", "exitRecord(Ljava/lang/String;J)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, Long l) {
        long jLongValue = l.longValue();
        ((C1646110swD) this.receiver).yp0(str, jLongValue);
        return Unit.LIZ;
    }
}
