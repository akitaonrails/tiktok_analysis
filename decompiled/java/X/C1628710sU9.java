package X;

import Y.AgS172S0300000_25;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0sU9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.ui.component.RecordCompanionLogicComponent$switchIfCameraOpenElseObserve$1", f = "RecordCompanionLogicComponent.kt", l = {292}, m = "invokeSuspend")
public final class C1628710sU9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1645200suk LLILLL;
    public final /* synthetic */ Effect LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1628710sU9(C1645200suk c1645200suk, Effect effect, InterfaceC1364105Vn<? super C1628710sU9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1645200suk;
        this.LLILZ = effect;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1628710sU9 c1628710sU9 = new C1628710sU9(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1628710sU9.LLILLJJLI = obj;
        return c1628710sU9;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecordCompanionLogicComponent@2a1f.switchIfCameraOpenElseObserve$1");
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
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C20099713kh c20099713khLJJIJL = C09IC.LJJIJL(new C1698270uIL(C540970LJn.LIZ(this.LLILLL.getCameraApiComponent().xl0()), 4), 1);
            AgS172S0300000_25 agS172S0300000_25 = new AgS172S0300000_25(interfaceC497601wk, this.LLILLL, this.LLILZ, 1);
            this.LL = 1;
            if (c20099713khLJJIJL.collect(agS172S0300000_25, this) == objLJFF) {
                C1C7U.LIZIZ("RecordCompanionLogicComponent@2a1f.switchIfCameraOpenElseObserve$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RecordCompanionLogicComponent@2a1f.switchIfCameraOpenElseObserve$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
