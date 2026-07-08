package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0cA3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1001210cA3 extends C09AY implements Function1<C995730c1D, C995730c1D> {
    public final /* synthetic */ int LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1001210cA3(int i) {
        super(1);
        this.LL = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C995730c1D invoke(C995730c1D c995730c1D) {
        int i = this.LL;
        c995730c1D.getClass();
        return new C995730c1D(i);
    }
}
