package X;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Or, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.report.FollowingMobHelper$mobAutoScrollFirstUnreadVideo$1", f = "FollowingMobHelper.kt", l = {}, m = "invokeSuspend")
public final class C327101Or extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C327101Or(int i, int i2, InterfaceC1364105Vn<? super C327101Or> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i;
        this.LLILLJJLI = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C327101Or(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FollowingMobHelper@f1a2.mobAutoScrollFirstUnreadVideo$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        int i = this.LL;
        int i2 = this.LLILLJJLI;
        if (i > i2 && i > 0 && i2 >= 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int i3 = this.LLILLJJLI;
            int i4 = this.LL;
            linkedHashMap.put("source_index", String.valueOf(i3));
            linkedHashMap.put("target_index", String.valueOf(i4));
            linkedHashMap.put("skip_count", String.valueOf(i4 - i3));
            C20684815ws.LJIILLIIL("follow_feed_auto_scroll", linkedHashMap);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("FollowingMobHelper@f1a2.mobAutoScrollFirstUnreadVideo$1");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("FollowingMobHelper@f1a2.mobAutoScrollFirstUnreadVideo$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
