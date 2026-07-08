package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Joy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C503580Joy extends C09AY implements Function1<Throwable, Unit> {
    public final /* synthetic */ C503560Jow LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C503580Joy(C503560Jow c503560Jow) {
        super(1);
        this.LL = c503560Jow;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        C501540Jlg.LIZJ(this.LL.LL.getContext(), th);
        return Unit.LIZ;
    }
}
