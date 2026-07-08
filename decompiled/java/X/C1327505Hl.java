package X;

import Y.AgS283S0100000_2;
import android.view.View;
import com.ss.android.ugc.aweme.tako.aivideo.detail.assem.TakoAIVideoFullscreenTextInputSlotAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Hl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.aivideo.detail.assem.TakoAIVideoFullscreenTextInputSlotAssem$observeRootVisibility$1", f = "TakoAIVideoFullscreenTextInputSlotAssem.kt", l = {87, 91}, m = "invokeSuspend")
public final class C1327505Hl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C05YD<Boolean> LLILLJJLI;
    public final /* synthetic */ TakoAIVideoFullscreenTextInputSlotAssem LLILLL;
    public final /* synthetic */ View LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1327505Hl(C05YD<Boolean> c05yd, TakoAIVideoFullscreenTextInputSlotAssem takoAIVideoFullscreenTextInputSlotAssem, View view, InterfaceC1364105Vn<? super C1327505Hl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c05yd;
        this.LLILLL = takoAIVideoFullscreenTextInputSlotAssem;
        this.LLILZ = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1327505Hl(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoAIVideoFullscreenTextInputSlotAssem@5bab.observeRootVisibility$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                throw new C2197108jB();
            }
            C155000ia.LIZIZ(obj);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("TakoAIVideoFullscreenTextInputSlotAssem@5bab.observeRootVisibility$1");
            return unit;
        }
        C155000ia.LIZIZ(obj);
        C05YD<Boolean> c05yd = this.LLILLJJLI;
        if (c05yd != null) {
            C414301jJ c414301jJ = new C414301jJ(c05yd, this.LLILLL.LLJJI, new C05C3(null));
            AgS283S0100000_2 agS283S0100000_2 = new AgS283S0100000_2(this.LLILZ, 6);
            this.LL = 1;
            if (c414301jJ.collect(agS283S0100000_2, this) == objLJFF) {
                C1C7U.LIZIZ("TakoAIVideoFullscreenTextInputSlotAssem@5bab.observeRootVisibility$1");
                return objLJFF;
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("TakoAIVideoFullscreenTextInputSlotAssem@5bab.observeRootVisibility$1");
            return unit2;
        }
        C2252321DDq c2252321DDq = this.LLILLL.LLJJI;
        AgS283S0100000_2 agS283S0100000_22 = new AgS283S0100000_2(this.LLILZ, 7);
        this.LL = 2;
        if (c2252321DDq.collect(agS283S0100000_22, this) == objLJFF) {
            C1C7U.LIZIZ("TakoAIVideoFullscreenTextInputSlotAssem@5bab.observeRootVisibility$1");
            return objLJFF;
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
