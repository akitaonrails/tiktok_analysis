package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05gZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.inbox.view.StoryOnThisDayInboxCell$processClick$2", f = "StoryOnThisDayInboxCell.kt", l = {}, m = "invokeSuspend")
public final class C1416505gZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1416505gZ(InterfaceC1364105Vn<? super C1416505gZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1416505gZ(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryOnThisDayInboxCell@e45c.processClick$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1599920rji.LIZ.getClass();
        C1599920rji.LIZLLL();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryOnThisDayInboxCell@e45c.processClick$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1416505gZ(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
