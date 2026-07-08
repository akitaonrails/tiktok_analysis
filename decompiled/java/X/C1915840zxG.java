package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0zxG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1915840zxG extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ C1915790zxB LL;
    public final /* synthetic */ C1915720zx4 LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ InterfaceC1915880zxK LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1915840zxG(C1915720zx4 c1915720zx4, InterfaceC1915880zxK interfaceC1915880zxK, C1915790zxB c1915790zxB, String str) {
        super(1);
        this.LL = c1915790zxB;
        this.LLILLJJLI = c1915720zx4;
        this.LLILLL = str;
        this.LLILZ = interfaceC1915880zxK;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        if (bool.booleanValue()) {
            this.LL.LIZ(this.LLILLJJLI, this.LLILLL, this.LLILZ);
        }
        return Unit.LIZ;
    }
}
