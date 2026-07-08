package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Jp6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C503660Jp6 extends C09AY implements Function1<Throwable, Unit> {
    public final /* synthetic */ C503630Jp3 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C503660Jp6(C503630Jp3 c503630Jp3) {
        super(1);
        this.LL = c503630Jp3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        C501540Jlg.LIZJ(this.LL.LL.getContext(), th);
        return Unit.LIZ;
    }
}
