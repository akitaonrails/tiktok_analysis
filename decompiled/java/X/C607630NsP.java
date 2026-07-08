package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeedList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NsP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.report.FollowingMobHelper$mobFollowFeedSourceCount$1", f = "FollowingMobHelper.kt", l = {}, m = "invokeSuspend")
public final class C607630NsP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ FollowFeedList LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C607630NsP(FollowFeedList followFeedList, int i, long j, InterfaceC1364105Vn<? super C607630NsP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = followFeedList;
        this.LLILLJJLI = i;
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C607630NsP(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<FollowFeed> items;
        EnumC607620NsO enumC607620NsO;
        C1C7U.LIZ("FollowingMobHelper@f1a2.mobFollowFeedSourceCount$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        FollowFeedList followFeedList = this.LL;
        if (followFeedList != null && (items = followFeedList.getItems()) != null) {
            try {
                C118300cf c118300cf = new C118300cf();
                C118300cf c118300cf2 = new C118300cf();
                C118300cf c118300cf3 = new C118300cf();
                for (FollowFeed followFeed : items) {
                    if (followFeed != null) {
                        int source = followFeed.getSource();
                        if (source == 0) {
                            c118300cf.element++;
                        } else if (source == 1) {
                            c118300cf2.element++;
                        } else if (source == 2) {
                            c118300cf3.element++;
                        }
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int i = this.LLILLJJLI;
                long j = this.LLILLL;
                if (i == 1) {
                    enumC607620NsO = EnumC607620NsO.PRELOAD;
                } else if (j == 0) {
                    enumC607620NsO = EnumC607620NsO.REFRESH;
                } else {
                    enumC607620NsO = EnumC607620NsO.LOAD_MORE;
                }
                linkedHashMap.put("request_type", String.valueOf(enumC607620NsO.getValue()));
                linkedHashMap.put("algo_count", String.valueOf(c118300cf2.element));
                linkedHashMap.put("others_count", String.valueOf(c118300cf.element));
                linkedHashMap.put("history_count", String.valueOf(c118300cf3.element));
                C20684815ws.LJIILLIIL("follow_feed_source_count", linkedHashMap);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("FollowingMobHelper@f1a2.mobFollowFeedSourceCount$1");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("FollowingMobHelper@f1a2.mobFollowFeedSourceCount$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
