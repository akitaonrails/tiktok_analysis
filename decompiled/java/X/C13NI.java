package X;

import Y.ARunnableS119S0100000_19;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.13NI, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final /* synthetic */ class C13NI extends C2217421BqW implements Function2<Integer, Long, Unit> {
    public C13NI(InterfaceC19507411Ts interfaceC19507411Ts) {
        super(2, interfaceC19507411Ts, C13NF.class, "onProgress", "onProgress(IJ)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, Long l) {
        int iIntValue = num.intValue();
        long jLongValue = l.longValue();
        C13NF c13nf = (C13NF) this.receiver;
        c13nf.getClass();
        C13QI.LIZ(new ARunnableS119S0100000_19(c13nf, iIntValue, jLongValue, 223));
        return Unit.LIZ;
    }
}
