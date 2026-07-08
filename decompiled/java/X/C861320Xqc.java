package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xqc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.edit.toolbar.impl.EditToolbarAutoCutHandler$1", f = "AutoCut.kt", l = {}, m = "invokeSuspend")
public final class C861320Xqc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1459980o60 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C861320Xqc(C1459980o60 c1459980o60, InterfaceC1364105Vn<? super C861320Xqc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1459980o60;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C861320Xqc(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditToolbarAutoCutHandler@4f8f.<init>$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJI();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditToolbarAutoCutHandler@4f8f.<init>$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
