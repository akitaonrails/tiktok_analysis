package X;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Ke, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.report.FollowingMobHelper$mobEnterInnerFeed$1", f = "FollowingMobHelper.kt", l = {}, m = "invokeSuspend")
public final class C315401Ke extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C315401Ke(String str, long j, String str2, int i, int i2, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        int i = this.LL;
        int i2 = this.LLILLJJLI;
        return new C315401Ke(this.LLILLL, this.LLILZIL, this.LLILZ, i, i2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FollowingMobHelper@f1a2.mobEnterInnerFeed$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = this.LL;
        int i2 = this.LLILLJJLI;
        String str = this.LLILLL;
        String str2 = this.LLILZ;
        long j = this.LLILZIL;
        linkedHashMap.put("following_cnt", String.valueOf(i));
        linkedHashMap.put("starting_index", String.valueOf(i2 + 1));
        linkedHashMap.put("author_id", str);
        linkedHashMap.put("group_id", str2);
        linkedHashMap.put("duration", String.valueOf(j));
        C20684815ws.LJIILLIIL("enter_frequent_following_feed", linkedHashMap);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FollowingMobHelper@f1a2.mobEnterInnerFeed$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
