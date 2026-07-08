package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Mf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.api.util.SocialEffectExtendsKt$serialCall$1", f = "SocialEffectExtends.kt", l = {49}, m = "invokeSuspend")
public final class C320701Mf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Function1<InterfaceC1364105Vn<? super Unit>, Object> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C320701Mf(Function1<? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function1, InterfaceC1364105Vn<? super C320701Mf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C320701Mf(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialEffectExtendsKt@418.serialCall$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                Function1<InterfaceC1364105Vn<? super Unit>, Object> function1 = this.LLILLJJLI;
                this.LL = 1;
                if (function1.invoke(this) == objLJFF) {
                    C1C7U.LIZIZ("SocialEffectExtendsKt@418.serialCall$1");
                    return objLJFF;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("PerfExt", "serialCall error", th);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialEffectExtendsKt@418.serialCall$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
