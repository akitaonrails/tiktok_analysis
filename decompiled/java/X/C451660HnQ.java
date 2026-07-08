package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0HnQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C451660HnQ extends C09AY implements Function0<C0RTY> {
    public final /* synthetic */ AbstractC738140SxQ LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C451660HnQ(AbstractC738140SxQ abstractC738140SxQ) {
        super(0);
        this.LL = abstractC738140SxQ;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C0RTY invoke() {
        C19EG c19egLIZ = C724240Sb0.LIZ(this.LL);
        if (c19egLIZ != null) {
            C0RTY c0rtyZQ2 = C0RPA.LIZ(c19egLIZ).zQ2(this.LL);
            if (c0rtyZQ2 != null) {
                return c0rtyZQ2;
            }
        }
        return this.LL.getSupervisor().LJ();
    }
}
