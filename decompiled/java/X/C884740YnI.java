package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0YnI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C884740YnI extends C09AY implements Function1<C879540Yeu<?>, Boolean> {
    public final /* synthetic */ C884270YmX LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C884740YnI(C884270YmX c884270YmX) {
        super(1);
        this.LL = c884270YmX;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(C879540Yeu<?> c879540Yeu) {
        return Boolean.valueOf(this.LL.LJII().LJ().contains(c879540Yeu.LIZIZ));
    }
}
