package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Sc5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C724910Sc5 extends C09AY implements Function0<C723820SaK> {
    public final /* synthetic */ AbstractC724890Sc3 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C724910Sc5(AbstractC724890Sc3 abstractC724890Sc3) {
        super(0);
        this.LL = abstractC724890Sc3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C723820SaK invoke() {
        AbstractC724890Sc3 abstractC724890Sc3 = this.LL;
        return new C723820SaK(abstractC724890Sc3.LL, abstractC724890Sc3);
    }
}
