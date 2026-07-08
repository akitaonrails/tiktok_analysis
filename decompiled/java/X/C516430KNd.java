package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0KNd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C516430KNd extends C09AY implements Function2<Integer, Throwable, Unit> {
    public final /* synthetic */ C516200KMg LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C516430KNd(C516200KMg c516200KMg) {
        super(2);
        this.LL = c516200KMg;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, Throwable th) {
        this.LL.LJI(2, 41, num.intValue(), new Exception(th), null);
        return Unit.LIZ;
    }
}
