package X;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1DtD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2270051DtD extends C09AY implements Function1<C1502700pCu, Unit> {
    public final /* synthetic */ C2270001Dt8 LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2270051DtD(C2270001Dt8 c2270001Dt8, String str, long j, long j2) {
        super(1);
        this.LL = c2270001Dt8;
        this.LLILLJJLI = str;
        this.LLILLL = j;
        this.LLILZ = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1502700pCu c1502700pCu) {
        ((ArrayList) c1502700pCu.LIZ).add(AbstractC2270071DtF.LJJIFFI().LIZIZ(AbstractC2270071DtF.LJJIFFI().LIZ(this.LLILLJJLI), Long.valueOf(this.LLILLL - this.LLILZ), Long.valueOf(this.LLILLL)));
        return Unit.LIZ;
    }
}
