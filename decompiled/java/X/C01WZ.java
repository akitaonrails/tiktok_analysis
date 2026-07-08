package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01WZ, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.entry.searchbubble.SearchHotTipsDataManager$getSearchBubbleInfo$1$1", f = "SearchHotTipsDataManager.kt", l = {41}, m = "invokeSuspend")
public final class C01WZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01WZ(String str, boolean z, InterfaceC1364105Vn<? super C01WZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01WZ(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchHotTipsDataManager@b8d2.getSearchBubbleInfo$1$1");
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
            InterfaceC346201Wa<C0O7A<C0O88>> interfaceC346201WaLJJJIL = ((InterfaceC346301Wb) ((InterfaceC736910SvR) C346401Wc.LIZ.getValue()).getOperator()).LJJJIL(this.LLILLJJLI);
            final boolean z = this.LLILLL;
            InterfaceC346701Wf<? super C0O7A<C0O88>> interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.0QSb
                /* JADX WARN: Removed duplicated region for block: B:75:0x00ef A[PHI: r14
                  0x00ef: PHI (r14v2 java.lang.String) = (r14v0 java.lang.String), (r14v3 java.lang.String) binds: [B:40:0x0074, B:38:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
                @Override // X.InterfaceC346701Wf
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r31, X.InterfaceC1364105Vn r32) {
                    /*
                        Method dump skipped, instruction units count: 263
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C670590QSb.emit(java.lang.Object, X.05Vn):java.lang.Object");
                }
            };
            this.LL = 1;
            if (interfaceC346201WaLJJJIL.collect(interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("SearchHotTipsDataManager@b8d2.getSearchBubbleInfo$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchHotTipsDataManager@b8d2.getSearchBubbleInfo$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
