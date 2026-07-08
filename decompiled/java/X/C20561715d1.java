package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15d1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20561715d1 extends C09AY implements Function0<String> {
    public final /* synthetic */ long LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20561715d1(long j) {
        super(0);
        this.LL = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[doAdaption] startTime:");
        sbLIZ.append(this.LL);
        sbLIZ.append(", endTime in main:");
        sbLIZ.append(jCurrentTimeMillis);
        sbLIZ.append(", duration:");
        sbLIZ.append(jCurrentTimeMillis - this.LL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
