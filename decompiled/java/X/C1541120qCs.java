package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Add missing generic type declarations: [Output] */
/* JADX INFO: renamed from: X.0qCs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1541120qCs<Output> extends C09AY implements Function2<C1540930qCZ, AbstractC1541140qCu<Output>, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ C1541070qCn<Input, Output> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1541120qCs(long j, C1541070qCn<Input, Output> c1541070qCn) {
        super(2);
        this.LL = j;
        this.LLILLJJLI = c1541070qCn;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C1540930qCZ c1540930qCZ, Object obj) {
        long jLongValue;
        C1540930qCZ c1540930qCZ2 = c1540930qCZ;
        AbstractC1541140qCu abstractC1541140qCu = (AbstractC1541140qCu) obj;
        Long l = abstractC1541140qCu.LIZIZ;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = this.LL;
        }
        if (this.LL - jLongValue >= 30000) {
            if (abstractC1541140qCu instanceof C1541080qCo) {
                C1541080qCo c1541080qCo = (C1541080qCo) abstractC1541140qCu;
                if (c1541080qCo.LIZ.LIZ) {
                    c1541080qCo.LJII(EnumC1541150qCv.MEMORY_PRESSURE);
                } else {
                    int i = c1541080qCo.LJIILLIIL.LIZ.get();
                    if (i >= 0 && ((i & 65280) >> 8) == 250 && this.LLILLJJLI.LJIIIIZZ.LJI((C1541080qCo<Output>) c1541080qCo)) {
                        c1541080qCo.LJIIIZ(EnumC1541150qCv.MEMORY_PRESSURE);
                    }
                }
            } else if (abstractC1541140qCu instanceof C1541180qCy) {
                this.LLILLJJLI.LJIIJJI.LIZJ(c1540930qCZ2, (AbstractC1541140qCu<V>) abstractC1541140qCu, EnumC1541150qCv.MEMORY_PRESSURE);
            }
        }
        return Unit.LIZ;
    }
}
