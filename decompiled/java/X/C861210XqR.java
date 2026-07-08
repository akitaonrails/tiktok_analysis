package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XqR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.toolbar.AutoCutToolbarItemHolder$initAILoadingObserver$3$1$1", f = "AutoCutToolbarItemHolder.kt", l = {}, m = "invokeSuspend")
public final class C861210XqR extends C09AX implements Function2<Map<String, ? extends C559050LwF>, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C907250ZiV LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C861210XqR(C907250ZiV c907250ZiV, InterfaceC1364105Vn<? super C861210XqR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c907250ZiV;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C861210XqR(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AutoCutToolbarItemHolder@4896.initAILoadingObserver$3$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C907250ZiV c907250ZiV = this.LL;
        c907250ZiV.LJJIIZ(c907250ZiV.LLJJJJ.LIZ.LLIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AutoCutToolbarItemHolder@4896.initAILoadingObserver$3$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Map<String, ? extends C559050LwF> map, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(map, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
