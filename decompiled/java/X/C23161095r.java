package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.095r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.autocut.sdk.smartmovie.network.NetRequest$requestTemplateList$2", f = "NetRequest.kt", l = {263}, m = "invokeSuspend")
public final class C23161095r extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super C096D>, Throwable, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ InterfaceC346701Wf LLILLJJLI;
    public final /* synthetic */ C23187096r LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23161095r(C23187096r c23187096r, InterfaceC1364105Vn<? super C23161095r> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLL = c23187096r;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NetRequest@98a9.requestTemplateList$2");
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
            InterfaceC346701Wf interfaceC346701Wf = this.LLILLJJLI;
            C096C c096c = new C096C(3, "requestTemplateList failed", this.LLILLL.LJIILIIL);
            this.LL = 1;
            if (interfaceC346701Wf.emit(c096c, this) == objLJFF) {
                C1C7U.LIZIZ("NetRequest@98a9.requestTemplateList$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NetRequest@98a9.requestTemplateList$2");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super C096D> interfaceC346701Wf, Throwable th, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C23161095r c23161095r = new C23161095r(this.LLILLL, interfaceC1364105Vn);
        c23161095r.LLILLJJLI = interfaceC346701Wf;
        return c23161095r.invokeSuspend(Unit.LIZ);
    }
}
