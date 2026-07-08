package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Sxn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C738370Sxn extends C09AY implements Function0<C738380Sxo> {
    public final /* synthetic */ AbstractC738140SxQ LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C738370Sxn(AbstractC738140SxQ abstractC738140SxQ) {
        super(0);
        this.LL = abstractC738140SxQ;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0Sxo] */
    @Override // kotlin.jvm.functions.Function0
    public final C738380Sxo invoke() {
        final AbstractC738140SxQ abstractC738140SxQ = this.LL;
        return new AbstractC724890Sc3() { // from class: X.0Sxo
            {
                super(this.LLJ, null, 2);
            }

            @Override // X.AbstractC724890Sc3
            public final void LJIIIIZZ(boolean z) {
                this.LLJ.onPreload(z);
            }
        };
    }
}
