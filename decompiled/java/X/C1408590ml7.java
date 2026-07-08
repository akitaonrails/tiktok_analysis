package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ml7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.music.music.vertical.bottombar.MusicPanelBottomBarUIComponent$initObserversInternal$6$1", f = "MusicPanelBottomBarUIComponent.kt", l = {}, m = "invokeSuspend")
public final class C1408590ml7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C375830EoP<String> LL;
    public final /* synthetic */ C204645155v LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1408590ml7(C375830EoP<String> c375830EoP, C204645155v c204645155v, InterfaceC1364105Vn<? super C1408590ml7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c375830EoP;
        this.LLILLJJLI = c204645155v;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1408590ml7(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MusicPanelBottomBarUIComponent@5069.initObserversInternal$6$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C375830EoP<String> c375830EoP = this.LL;
        if (c375830EoP == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MusicPanelBottomBarUIComponent@5069.initObserversInternal$6$1");
            return unit;
        }
        String strLIZ = c375830EoP.LIZ();
        if (strLIZ != null && strLIZ.length() != 0) {
            C204645155v c204645155v = this.LLILLJJLI;
            InterfaceC366450EYh interfaceC366450EYh = (InterfaceC366450EYh) c204645155v.LLILZLL.getValue(c204645155v, C204645155v.LLJJI[4]);
            if (interfaceC366450EYh != null) {
                interfaceC366450EYh.US1(this.LLILLJJLI.LJFF().LJIIJ, strLIZ);
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("MusicPanelBottomBarUIComponent@5069.initObserversInternal$6$1");
            return unit2;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("MusicPanelBottomBarUIComponent@5069.initObserversInternal$6$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
