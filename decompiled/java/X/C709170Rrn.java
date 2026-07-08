package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Rrn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.assem.desc.span.NewVideoDescDelegate$onTransStateChanged$1", f = "NewVideoDescDelegate.kt", l = {1092}, m = "invokeSuspend")
public final class C709170Rrn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C718770SHj LLILLJJLI;
    public final /* synthetic */ C0S5P LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C709170Rrn(C718770SHj c718770SHj, C0S5P c0s5p, InterfaceC1364105Vn<? super C709170Rrn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c718770SHj;
        this.LLILLL = c0s5p;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C709170Rrn(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NewVideoDescDelegate@fb8f.onTransStateChanged$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(100L, this) == objLJFF) {
                C1C7U.LIZIZ("NewVideoDescDelegate@fb8f.onTransStateChanged$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.LIZLLL(this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NewVideoDescDelegate@fb8f.onTransStateChanged$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
