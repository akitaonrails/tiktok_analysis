package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01ew, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.board.PCSBoardEffectService$fetchAndDownload$1", f = "PCSBoardEffectService.kt", l = {811}, m = "invokeSuspend")
public final class C387201ew extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C394101g3 LLILLJJLI;
    public final /* synthetic */ LifecycleOwner LLILLL;
    public final /* synthetic */ Function2<Integer, LiveEffect, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C387201ew(C394101g3 c394101g3, LifecycleOwner lifecycleOwner, Function2<? super Integer, ? super LiveEffect, Unit> function2, InterfaceC1364105Vn<? super C387201ew> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c394101g3;
        this.LLILLL = lifecycleOwner;
        this.LLILZ = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C387201ew(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PCSBoardEffectService@8a7a.fetchAndDownload$1");
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
            C392601fo.LJII(C393201fu.LIZ, null);
            C395101gD c395101gD = (C395101gD) this.LLILLJJLI.LJIIIZ.getValue();
            c395101gD.getClass();
            C2501109r7 c2501109r7 = new C2501109r7(new C328001Pa(this.LLILZ, null), C09IC.LJIL(new C095D(new C394301g5(c395101gD, null)), C0PEM.LIZJ), 0);
            C517001zs c517001zs = new C517001zs(this.LLILZ, 20);
            this.LL = 1;
            if (c2501109r7.collect(c517001zs, this) == objLJFF) {
                C1C7U.LIZIZ("PCSBoardEffectService@8a7a.fetchAndDownload$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PCSBoardEffectService@8a7a.fetchAndDownload$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
