package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KnD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.aime.AiMeEditPreviewScene$initViewModelObserver$2", f = "AiMeEditPreviewScene.kt", l = {}, m = "invokeSuspend")
public final class C527970KnD extends C09AX implements Function2<C527790Kmv, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C566300MIy LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C527970KnD(C566300MIy c566300MIy, InterfaceC1364105Vn<? super C527970KnD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c566300MIy;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C527970KnD c527970KnD = new C527970KnD(this.LLILLJJLI, interfaceC1364105Vn);
        c527970KnD.LL = obj;
        return c527970KnD;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AiMeEditPreviewScene@3cd1.initViewModelObserver$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LLILLJJLI.LLLLIL().LIZ.invoke((C527790Kmv) this.LL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AiMeEditPreviewScene@3cd1.initViewModelObserver$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C527790Kmv c527790Kmv, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c527790Kmv, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
