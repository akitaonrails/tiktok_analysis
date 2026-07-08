package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS5S0000200_22;

/* JADX INFO: renamed from: X.0nml, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1448050nml extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C0LAB LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1448050nml(C0LAB c0lab, long j, long j2) {
        super(0);
        this.LL = c0lab;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C303380Buq.LIZ("tool_performance_record_first_frame", this.LL.LIZ);
        C524780Ki4.LIZ.recordSingleValuePerfLog("tool_performance_record_first_frame", new AwS5S0000200_22(this.LLILLJJLI, this.LLILLL, 1));
        return Unit.LIZ;
    }
}
