package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0LBo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C538900LBo extends C09AY implements Function0<C0LCJ> {
    public final /* synthetic */ C538870LBl LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C538900LBo(C538870LBl c538870LBl) {
        super(0);
        this.LL = c538870LBl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C0LCJ invoke() {
        return new C0LCJ(1, new C538860LBk(this.LL), new C538910LBp(this.LL));
    }
}
