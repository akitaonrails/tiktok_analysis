package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XqQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.toolbar.AutoCutToolbarItemHolder$initAILoadingObserver$3$1", f = "AutoCutToolbarItemHolder.kt", l = {61}, m = "invokeSuspend")
public final class C861200XqQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC1417440mzO LLILLJJLI;
    public final /* synthetic */ C907250ZiV LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C861200XqQ(InterfaceC1417440mzO interfaceC1417440mzO, C907250ZiV c907250ZiV, InterfaceC1364105Vn<? super C861200XqQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1417440mzO;
        this.LLILLL = c907250ZiV;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C861200XqQ(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AutoCutToolbarItemHolder@4896.initAILoadingObserver$3$1");
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
            C05YD<Map<String, C559050LwF>> c05ydHR0 = this.LLILLJJLI.HR0();
            C861210XqR c861210XqR = new C861210XqR(this.LLILLL, null);
            this.LL = 1;
            if (C09IC.LJII(c05ydHR0, this, c861210XqR) == objLJFF) {
                C1C7U.LIZIZ("AutoCutToolbarItemHolder@4896.initAILoadingObserver$3$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AutoCutToolbarItemHolder@4896.initAILoadingObserver$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
