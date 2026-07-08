package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS5S0000200_22;

/* JADX INFO: renamed from: X.0nmn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1448070nmn extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C0LAB LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1448070nmn(String str, C0LAB c0lab, long j, long j2) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = c0lab;
        this.LLILLL = j;
        this.LLILZ = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C303380Buq.LIZ(this.LL, this.LLILLJJLI.LIZ);
        C524780Ki4.LIZ.recordSingleValuePerfLog(this.LL, new AwS5S0000200_22(this.LLILLL, this.LLILZ, 0));
        return Unit.LIZ;
    }
}
