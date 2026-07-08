package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01MS, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.general.GeneralHighlightPopupHelper$deleteHighlight$1", f = "GeneralHighlightPopupHelper.kt", l = {211}, m = "invokeSuspend")
public final class C01MS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Function1<Boolean, Unit> LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01MS(String str, Function1 function1, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = function1;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01MS(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GeneralHighlightPopupHelper@9bd1.deleteHighlight$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C1DFB c1dfb = C0PEM.LIZJ;
                C01MT c01mt = new C01MT(this.LLILLL, null);
                this.LL = 1;
                if (C23250099c.LJI(this, c1dfb, c01mt) == objLJFF) {
                    C1C7U.LIZIZ("GeneralHighlightPopupHelper@9bd1.deleteHighlight$1");
                    return objLJFF;
                }
            }
            this.LLILLJJLI.invoke(true);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (e instanceof CancellationException) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("GeneralHighlightPopupHelper@9bd1.deleteHighlight$1");
                return unit;
            }
            this.LLILLJJLI.invoke(false);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("GeneralHighlightPopupHelper@9bd1.deleteHighlight$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
