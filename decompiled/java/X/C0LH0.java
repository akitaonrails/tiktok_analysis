package X;

import Y.AgS199S0200000_8;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LH0, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.aiselfeffect.ScanFaceEffectComponent$loadScanFaceEffectPackage$3", f = "ScanFaceEffectComponent.kt", l = {336}, m = "invokeSuspend")
public final class C0LH0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0MIK LLILLJJLI;
    public final /* synthetic */ Effect LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LH0(C0MIK c0mik, Effect effect, InterfaceC1364105Vn<? super C0LH0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0mik;
        this.LLILLL = effect;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LH0(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ScanFaceEffectComponent@ddfc.loadScanFaceEffectPackage$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C05YD<Boolean> c05ydBI2 = this.LLILLJJLI.LJI.BI2();
            AgS199S0200000_8 agS199S0200000_8 = new AgS199S0200000_8(this.LLILLJJLI, this.LLILLL, 7);
            this.LL = 1;
            if (c05ydBI2.collect(agS199S0200000_8, this) == objLJFF) {
                C1C7U.LIZIZ("ScanFaceEffectComponent@ddfc.loadScanFaceEffectPackage$3");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
