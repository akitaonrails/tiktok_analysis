package X;

import com.ss.android.ugc.aweme.search.passive.feedbar.ability.FeedBarSearchAbility;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.FeedSearchBottomBarAssemTrigger;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0QzA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.FeedSearchBottomBarAssemTrigger$searchMobShow$1$1$isTextEllipsized$1", f = "FeedSearchBottomBarAssem.kt", l = {}, m = "invokeSuspend")
public final class C688260QzA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ FeedSearchBottomBarAssemTrigger LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C688260QzA(FeedSearchBottomBarAssemTrigger feedSearchBottomBarAssemTrigger, InterfaceC1364105Vn<? super C688260QzA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = feedSearchBottomBarAssemTrigger;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C688260QzA(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FeedSearchBottomBarAssemTrigger@8d3a.searchMobShow$1$1$isTextEllipsized$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        FeedBarSearchAbility feedBarSearchAbilityZp = this.LL.zp();
        boolean z = false;
        if (feedBarSearchAbilityZp != null && feedBarSearchAbilityZp.Tq1()) {
            z = true;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("FeedSearchBottomBarAssemTrigger@8d3a.searchMobShow$1$1$isTextEllipsized$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
