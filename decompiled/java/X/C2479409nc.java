package X;

import Y.ARunnableS51S0300000_18;
import android.graphics.Bitmap;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.poi.map.positionselection.PositionSelectionMapAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09nc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.map.positionselection.PositionSelectionMapAssem$drawPrecisePoint$1", f = "PositionSelectionMapAssem.kt", l = {205}, m = "invokeSuspend")
public final class C2479409nc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PositionSelectionMapAssem LLILLJJLI;
    public final /* synthetic */ C1177960gl8 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2479409nc(PositionSelectionMapAssem positionSelectionMapAssem, C1177960gl8 c1177960gl8, InterfaceC1364105Vn<? super C2479409nc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = positionSelectionMapAssem;
        this.LLILLL = c1177960gl8;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2479409nc(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("PositionSelectionMapAssem@24e9.drawPrecisePoint$1");
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
            C1DFB c1dfb = C0PEM.LIZJ;
            C2479309nb c2479309nb = new C2479309nb(this.LLILLJJLI, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c2479309nb);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PositionSelectionMapAssem@24e9.drawPrecisePoint$1");
                return objLJFF;
            }
        }
        HandlerHook.viewPost(this.LLILLJJLI.LJJIJL(), new ARunnableS51S0300000_18(this.LLILLJJLI, this.LLILLL, (Bitmap) obj, 10));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PositionSelectionMapAssem@24e9.drawPrecisePoint$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
