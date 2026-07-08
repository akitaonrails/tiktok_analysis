package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JRo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C492100JRo extends C09AY implements Function1<Throwable, Unit> {
    public final /* synthetic */ C492030JRh LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C492100JRo(C492030JRh c492030JRh) {
        super(1);
        this.LL = c492030JRh;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        C501540Jlg.LIZJ(this.LL.LL.getContext(), th);
        return Unit.LIZ;
    }
}
