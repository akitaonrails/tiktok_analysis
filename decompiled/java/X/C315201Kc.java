package X;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Kc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.report.FollowingMobHelper$mobExitInnerFeed$1", f = "FollowingMobHelper.kt", l = {}, m = "invokeSuspend")
public final class C315201Kc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C315201Kc(String str, String str2, int i, int i2, long j, String str3, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = j;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        String str = this.LL;
        long j = this.LLILLJJLI;
        return new C315201Kc(str, this.LLILZIL, this.LLILLL, this.LLILZ, j, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FollowingMobHelper@f1a2.mobExitInnerFeed$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.LL;
        long j = this.LLILLJJLI;
        int i = this.LLILLL;
        int i2 = this.LLILZ;
        String str2 = this.LLILZIL;
        String str3 = this.LLILZLL;
        linkedHashMap.put("exit_method", str);
        linkedHashMap.put("duration", String.valueOf(j));
        linkedHashMap.put("viewed_author_cnt", String.valueOf(i));
        linkedHashMap.put("viewed_video_cnt", String.valueOf(i2));
        linkedHashMap.put("group_id", str2);
        linkedHashMap.put("author_id", str3);
        C20684815ws.LJIILLIIL("exit_frequent_following_feed", linkedHashMap);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FollowingMobHelper@f1a2.mobExitInnerFeed$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
