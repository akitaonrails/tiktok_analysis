package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0wu1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1798510wu1 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1798480wty LL;
    public final /* synthetic */ InterfaceC1685420txc<List<String>, Long, Long, Boolean, Boolean, Unit> LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1798510wu1(C1798480wty c1798480wty, InterfaceC1685420txc<? super List<String>, ? super Long, ? super Long, ? super Boolean, ? super Boolean, Unit> interfaceC1685420txc, boolean z, boolean z2) {
        super(0);
        this.LL = c1798480wty;
        this.LLILLJJLI = interfaceC1685420txc;
        this.LLILLL = z;
        this.LLILZ = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() throws Throwable {
        this.LL.LIZ(this.LLILLJJLI, this.LLILLL, this.LLILZ);
        return Unit.LIZ;
    }
}
