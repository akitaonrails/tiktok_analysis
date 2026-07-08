package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0dzA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.auth.pipeline.fb.FBUploadAuthProcessor$process$res$1", f = "FBUploadAuthProcessor.kt", l = {22}, m = "invokeSuspend")
public final class C1071340dzA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ C1071220dyy LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1071340dzA(C1071220dyy c1071220dyy, InterfaceC1364105Vn<? super C1071340dzA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1071220dyy;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1071340dzA(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FBUploadAuthProcessor@1d4e.process$res$1");
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
            InterfaceC1004520cFO interfaceC1004520cFOLJII = C1071540dzU.LIZIZ.LJII();
            EnumC1074240e3q enumC1074240e3qLIZ = C1074230e3p.LIZ(this.LLILLJJLI.LIZ.LJ.LIZ);
            this.LL = 1;
            obj = interfaceC1004520cFOLJII.LIZIZ(enumC1074240e3qLIZ, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("FBUploadAuthProcessor@1d4e.process$res$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("FBUploadAuthProcessor@1d4e.process$res$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
