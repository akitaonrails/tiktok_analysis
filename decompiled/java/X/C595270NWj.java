package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NWj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.activity.status.sdk.core.ActivityStatusDataSource$initExternalDataSource$1$1", f = "ActivityStatusDataSource.kt", l = {128}, m = "invokeSuspend")
public final class C595270NWj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC346201Wa<List<C0NXK>> LLILLJJLI;
    public final /* synthetic */ C0NX1 LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ C0NY2 LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C595270NWj(InterfaceC346201Wa<? extends List<C0NXK>> interfaceC346201Wa, C0NX1 c0nx1, boolean z, C0NY2 c0ny2, InterfaceC1364105Vn<? super C595270NWj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC346201Wa;
        this.LLILLL = c0nx1;
        this.LLILZ = z;
        this.LLILZIL = c0ny2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C595270NWj(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ActivityStatusDataSource@11bf.initExternalDataSource$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC346201Wa<List<C0NXK>> interfaceC346201Wa = this.LLILLJJLI;
            final C0NX1 c0nx1 = this.LLILLL;
            final boolean z = this.LLILZ;
            final C0NY2 c0ny2 = this.LLILZIL;
            InterfaceC346701Wf<? super List<C0NXK>> interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.0NWm
                @Override // X.InterfaceC346701Wf
                public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                    List list = (List) obj2;
                    InterfaceC595310NWn interfaceC595310NWn = c0nx1.LIZLLL.LIZIZ;
                    if (interfaceC595310NWn != null && interfaceC595310NWn.LIZ()) {
                        return Unit.LIZ;
                    }
                    if (z) {
                        Object objLJIIJ = c0nx1.LJIIJ(c0ny2.getName(), list, interfaceC1364105Vn);
                        if (objLJIIJ == C099R.LJFF()) {
                            return objLJIIJ;
                        }
                        return Unit.LIZ;
                    }
                    C0NX1 c0nx12 = c0nx1;
                    C0NXT c0nxt = c0nx12.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("observe activity status update ");
                    sbLIZ.append(c0ny2.getName());
                    sbLIZ.append(", size ");
                    sbLIZ.append(list.size());
                    C0NXR.LIZLLL(c0nx12, c0nxt, C2188811AlT.LIZIZ(sbLIZ));
                    c0nx1.LJIIIZ(c0ny2.getName(), list, null);
                    return Unit.LIZ;
                }
            };
            this.LL = 1;
            if (interfaceC346201Wa.collect(interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("ActivityStatusDataSource@11bf.initExternalDataSource$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ActivityStatusDataSource@11bf.initExternalDataSource$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
