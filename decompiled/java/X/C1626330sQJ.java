package X;

import Y.AgS305S0100000_25;
import com.ss.android.ugc.gamora.recorder.control.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lnn.q;
import njp.a;

/* JADX INFO: renamed from: X.0sQJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.control.FullHorizontalCarrouselRecordDockBarScene$observeCameraReady$1", f = "FullHorizontalCarrouselRecordDockBarScene.kt", l = {291}, m = "invokeSuspend")
public final class C1626330sQJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ h LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1626330sQJ(h hVar, InterfaceC1364105Vn<? super C1626330sQJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = hVar;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1626330sQJ(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C05YD<Boolean> c05ydBI2;
        C1C7U.LIZ("FullHorizontalCarrouselRecordDockBarScene@605b.observeCameraReady$1");
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
            q qVarLLLLJ = this.LLILLJJLI.LLLLJ();
            if (qVarLLLLJ != null && (c05ydBI2 = qVarLLLLJ.BI2()) != null) {
                C20099713kh c20099713khLJJIJL = C09IC.LJJIJL(new C1698270uIL(c05ydBI2, 10), 1);
                AgS305S0100000_25 agS305S0100000_25 = new AgS305S0100000_25(this.LLILLJJLI, 16);
                this.LL = 1;
                if (c20099713khLJJIJL.collect(agS305S0100000_25, this) == objLJFF) {
                    C1C7U.LIZIZ("FullHorizontalCarrouselRecordDockBarScene@605b.observeCameraReady$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FullHorizontalCarrouselRecordDockBarScene@605b.observeCameraReady$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
