package X;

import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.FeedSearchBottomBarAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0IQA, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.FeedSearchBottomBarAssem$searchMobShow$1$1$isTextEllipsized$1", f = "FeedSearchBottomBarAssem.kt", l = {}, m = "invokeSuspend")
public final class C0IQA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ FeedSearchBottomBarAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0IQA(FeedSearchBottomBarAssem feedSearchBottomBarAssem, InterfaceC1364105Vn<? super C0IQA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = feedSearchBottomBarAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0IQA(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FeedSearchBottomBarAssem@54f7.searchMobShow$1$1$isTextEllipsized$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Boolean boolValueOf = Boolean.valueOf(this.LL.Tq1());
        C1C7U.LIZIZ("FeedSearchBottomBarAssem@54f7.searchMobShow$1$1$isTextEllipsized$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
