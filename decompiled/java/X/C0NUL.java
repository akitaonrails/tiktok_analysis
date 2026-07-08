package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0NUL, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NUL extends C09AY implements Function1<C0NUN, Object> {
    public final /* synthetic */ C0NUM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NUL(C0NUM c0num) {
        super(1);
        this.LL = c0num;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(C0NUN c0nun) {
        C0NUN c0nun2 = c0nun;
        return this.LL.LIZIZ(new C0NUN(null, c0nun2.LIZIZ, c0nun2.LIZJ, c0nun2.LIZLLL, c0nun2.LJ)).getValue();
    }
}
