package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.098R, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.ailive.AILiveUpdatedModelComponent$evaluateNewModel$hasFace$1", f = "AILiveUpdatedModelComponent.kt", l = {78}, m = "invokeSuspend")
public final class C098R extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C098R(String str, InterfaceC1364105Vn<? super C098R> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C098R(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AILiveUpdatedModelComponent@e783.evaluateNewModel$hasFace$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            long jLJII = C19990313Jl.LJII(5, EnumC19990213Jk.SECONDS);
            C098Q c098q = new C098Q(this.LLILLJJLI, null);
            this.LL = 1;
            obj = C099A.LIZJ(AnonymousClass0958.LJ(jLJII), c098q, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AILiveUpdatedModelComponent@e783.evaluateNewModel$hasFace$1");
                return objLJFF;
            }
        }
        if (Intrinsics.LJFF(obj, false)) {
            C2497109qT.LIZ.getClass();
            if (C2497109qT.LIZJ.get()) {
                z = false;
            }
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("AILiveUpdatedModelComponent@e783.evaluateNewModel$hasFace$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
