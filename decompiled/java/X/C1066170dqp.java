package X;

import android.graphics.drawable.Drawable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0dqp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.module.header.opt.HeaderLowImgRep$LowImgLoadTask$setToTarget$1$1$1", f = "HeaderLowImgRep.kt", l = {}, m = "invokeSuspend")
public final class C1066170dqp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1066160dqo LL;
    public final /* synthetic */ C1322100kVc LLILLJJLI;
    public final /* synthetic */ Drawable LLILLL;
    public final /* synthetic */ C1066180dqq LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1066170dqp(C1066160dqo c1066160dqo, C1322100kVc c1322100kVc, Drawable drawable, C1066180dqq c1066180dqq, InterfaceC1364105Vn<? super C1066170dqp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1066160dqo;
        this.LLILLJJLI = c1322100kVc;
        this.LLILLL = drawable;
        this.LLILZ = c1066180dqq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1066170dqp(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("HeaderLowImgRep$LowImgLoadTask@9a75.setToTarget$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            Function0<Unit> function0 = this.LL.LJII;
            if (function0 != null) {
                function0.invoke();
            }
            C1331070kk5 hierarchy = this.LLILLJJLI.getHierarchy();
            if (hierarchy != null) {
                hierarchy.LJJIFFI(this.LLILLL, this.LLILZ.LIZ);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("HeaderLowImgRep$LowImgLoadTask@9a75.setToTarget$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
