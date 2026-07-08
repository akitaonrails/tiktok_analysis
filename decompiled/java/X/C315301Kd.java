package X;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Kd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.report.FollowingMobHelper$mobFollowReadAidDBClear$1", f = "FollowingMobHelper.kt", l = {}, m = "invokeSuspend")
public final class C315301Kd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C315301Kd(int i, int i2, InterfaceC1364105Vn<? super C315301Kd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i;
        this.LLILLJJLI = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C315301Kd(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FollowingMobHelper@f1a2.mobFollowReadAidDBClear$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = this.LL;
        int i2 = this.LLILLJJLI;
        linkedHashMap.put("total_count_before", String.valueOf(i));
        linkedHashMap.put("expired_count", String.valueOf(i2));
        C20684815ws.LJIILLIIL("follow_feed_played_database_clear", linkedHashMap);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FollowingMobHelper@f1a2.mobFollowReadAidDBClear$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
