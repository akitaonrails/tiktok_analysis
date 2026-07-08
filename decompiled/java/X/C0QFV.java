package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0QFV, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QFV extends C09AY implements Function0<C0QFL> {
    public final /* synthetic */ C2211641BhC LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0QFV(C2211641BhC c2211641BhC) {
        super(0);
        this.LL = c2211641BhC;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C0QFL invoke() {
        C2211641BhC c2211641BhC = this.LL.LJIJ;
        if (c2211641BhC != null) {
            return new C0QFT(c2211641BhC);
        }
        return null;
    }
}
