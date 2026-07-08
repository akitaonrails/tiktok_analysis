package X;

import Y.ARunnableS9S1100000_3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.07x7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C2028707x7 extends C2217421BqW implements Function2<String, Long, Unit> {
    public C2028707x7(Object obj) {
        super(2, obj, C2281508wn.class, "onGeckoUpdated", "onGeckoUpdated(Ljava/lang/String;J)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, Long l) {
        l.longValue();
        C2281508wn c2281508wn = (C2281508wn) this.receiver;
        c2281508wn.LIZJ.submit(new ARunnableS9S1100000_3(c2281508wn, str, 22));
        return Unit.LIZ;
    }
}
