package X;

import defpackage.g9;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10QN, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10QN extends C09AY implements Function0<C10QJ> {
    public final /* synthetic */ g9 LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10QN(g9 g9Var, boolean z) {
        super(0);
        this.LL = g9Var;
        this.LLILLJJLI = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C10QJ invoke() {
        return new C10QJ(this.LL, this.LLILLJJLI);
    }
}
